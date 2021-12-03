package com.example.aop_part5_chapter06.data.entity;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"invoice", "code"})
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/example/aop_part5_chapter06/data/entity/TrackingItem;", "Landroid/os/Parcelable;", "invoice", "", "company", "Lcom/example/aop_part5_chapter06/data/entity/ShippingCompany;", "(Ljava/lang/String;Lcom/example/aop_part5_chapter06/data/entity/ShippingCompany;)V", "getCompany", "()Lcom/example/aop_part5_chapter06/data/entity/ShippingCompany;", "getInvoice", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class TrackingItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String invoice = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.example.aop_part5_chapter06.data.entity.ShippingCompany company = null;
    public static final android.os.Parcelable.Creator<com.example.aop_part5_chapter06.data.entity.TrackingItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aop_part5_chapter06.data.entity.TrackingItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String invoice, @org.jetbrains.annotations.NotNull()
    com.example.aop_part5_chapter06.data.entity.ShippingCompany company) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TrackingItem(@org.jetbrains.annotations.NotNull()
    java.lang.String invoice, @org.jetbrains.annotations.NotNull()
    com.example.aop_part5_chapter06.data.entity.ShippingCompany company) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInvoice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aop_part5_chapter06.data.entity.ShippingCompany component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aop_part5_chapter06.data.entity.ShippingCompany getCompany() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.aop_part5_chapter06.data.entity.TrackingItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.aop_part5_chapter06.data.entity.TrackingItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.aop_part5_chapter06.data.entity.TrackingItem[] newArray(int size) {
            return null;
        }
    }
}