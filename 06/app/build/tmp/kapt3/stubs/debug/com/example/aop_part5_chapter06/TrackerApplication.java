package com.example.aop_part5_chapter06;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/aop_part5_chapter06/TrackerApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "workerFactory", "Lcom/example/aop_part5_chapter06/work/AppWorkerFactory;", "getWorkerFactory", "()Lcom/example/aop_part5_chapter06/work/AppWorkerFactory;", "workerFactory$delegate", "Lkotlin/Lazy;", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "onCreate", "", "app_debug"})
public final class TrackerApplication extends android.app.Application implements androidx.work.Configuration.Provider {
    private final kotlin.Lazy workerFactory$delegate = null;
    
    public TrackerApplication() {
        super();
    }
    
    private final com.example.aop_part5_chapter06.work.AppWorkerFactory getWorkerFactory() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
}