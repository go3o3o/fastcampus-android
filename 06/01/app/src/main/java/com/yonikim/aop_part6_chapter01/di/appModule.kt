package com.yonikim.aop_part6_chapter01.di

import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity
import com.yonikim.aop_part6_chapter01.data.entity.location.MapSearchInfoEntity
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantEntity
import com.yonikim.aop_part6_chapter01.screen.MainViewModel
import com.yonikim.aop_part6_chapter01.screen.home.HomeViewModel
import com.yonikim.aop_part6_chapter01.screen.home.restaurant.RestaurantCategory
import com.yonikim.aop_part6_chapter01.screen.home.restaurant.RestaurantListViewModel
import com.yonikim.aop_part6_chapter01.screen.home.restaurant.detail.RestaurantDetailViewModel
import com.yonikim.aop_part6_chapter01.screen.like.RestaurantLikeListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { MainViewModel() }
    viewModel { HomeViewModel(get(), get(), get()) }
    viewModel { RestaurantLikeListViewModel(get()) }
    viewModel { MyViewModel(get(), get(), get()) }

    factory { (restaurantCategory: RestaurantCategory, locationLatLngEntity: LocationLatLngEntity) ->
        RestaurantListViewModel(restaurantCategory, locationLatLngEntity, get())
    }

    viewModel { (mapSearchInfoEntity: MapSearchInfoEntity) ->
        MyLocationViewModel(mapSearchInfoEntity, get(), get())
    }

    viewModel { (restaurantEntity: RestaurantEntity) -> RestaurantDetailViewModel(restaurantEntity, get(), get()) }

    viewModel { (restaurantId: Long, restaurantFoodList: List<RestaurantFoodEntity>) ->
        RestaurantMenuListViewModel(restaurantId, restaurantFoodList, get())
    }

    viewModel { (restaurantTitle: String) -> RestaurantReviewListViewModel(restaurantTitle, get()) }

    viewModel { OrderMenuListViewModel(get(), get(), get()) }

    viewModel { GalleryViewModel(get()) }

    single<MapRepository> { DefaultMapRepository(get(), get()) }
    single<RestaurantRepository> { DefaultRestaurantRepository(get(), get(), get()) }
    single<UserRepository> { DefaultUserRepository(get(), get(), get()) }
    single<RestaurantFoodRepository> { DefaultRestaurantFoodRepository(get(), get(), get()) }
    single<OrderRepository> { DefaultOrderRepository(get(), get()) }
    single<RestaurantReviewRepository> { DefaultRestaurantReviewRepository(get(), get()) }
    single { GalleryPhotoRepository(androidApplication()) }

    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }

    single(named("map")) { provideMapRetrofit(get(), get()) }
    single(named("food")) { provideFoodRetrofit(get(), get()) }

    single { provideMapApiService(get(qualifier = named("map"))) }
    single { provideFoodApiService(get(qualifier = named("food"))) }

    single { provideDB(androidApplication()) }
    single { provideLocationDao(get()) }
    single { provideFoodMenuBasketDao(get()) }
    single { provideRestaurantDao(get()) }

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }
    single { AppPreferenceManager(androidContext()) }

    single { MenuChangeEventBus() }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

    single { Firebase.firestore }
    single { Firebase.storage }
    single { FirebaseAuth.getInstance() }

}