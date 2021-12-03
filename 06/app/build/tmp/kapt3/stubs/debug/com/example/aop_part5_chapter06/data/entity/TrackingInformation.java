package com.example.aop_part5_chapter06.data.entity;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0090\u0002\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010NJ\t\u0010O\u001a\u00020PH\u00d6\u0001J\u0013\u0010Q\u001a\u00020\u00052\b\u0010R\u001a\u0004\u0018\u00010SH\u00d6\u0003J\t\u0010T\u001a\u00020PH\u00d6\u0001J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020PH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001e\u00a8\u0006["}, d2 = {"Lcom/example/aop_part5_chapter06/data/entity/TrackingInformation;", "Landroid/os/Parcelable;", "adUrl", "", "complete", "", "completeYN", "estimate", "firstDetail", "Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;", "invoiceNo", "itemImage", "itemName", "lastDetail", "lastStateDetail", "level", "Lcom/example/aop_part5_chapter06/data/entity/Level;", "orderNumber", "productInfo", "receiverAddr", "receiverName", "recipient", "result", "senderName", "trackingDetails", "", "zipCode", "errorMessage", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Lcom/example/aop_part5_chapter06/data/entity/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAdUrl", "()Ljava/lang/String;", "getComplete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCompleteYN", "getErrorMessage", "getEstimate", "getFirstDetail", "()Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;", "getInvoiceNo", "getItemImage", "getItemName", "getLastDetail", "getLastStateDetail", "getLevel", "()Lcom/example/aop_part5_chapter06/data/entity/Level;", "getOrderNumber", "getProductInfo", "getReceiverAddr", "getReceiverName", "getRecipient", "getResult", "getSenderName", "getTrackingDetails", "()Ljava/util/List;", "getZipCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Lcom/example/aop_part5_chapter06/data/entity/TrackingDetail;Lcom/example/aop_part5_chapter06/data/entity/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/example/aop_part5_chapter06/data/entity/TrackingInformation;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class TrackingInformation implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "adUrl")
    private final java.lang.String adUrl = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "complete")
    private final java.lang.Boolean complete = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "completeYN")
    private final java.lang.String completeYN = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "estimate")
    private final java.lang.String estimate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "firstDetail")
    private final com.example.aop_part5_chapter06.data.entity.TrackingDetail firstDetail = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "invoiceNo")
    private final java.lang.String invoiceNo = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "itemImage")
    private final java.lang.String itemImage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "itemName")
    private final java.lang.String itemName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lastDetail")
    private final com.example.aop_part5_chapter06.data.entity.TrackingDetail lastDetail = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lastStateDetail")
    private final com.example.aop_part5_chapter06.data.entity.TrackingDetail lastStateDetail = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "level")
    private final com.example.aop_part5_chapter06.data.entity.Level level = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "orderNumber")
    private final java.lang.String orderNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "productInfo")
    private final java.lang.String productInfo = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiverAddr")
    private final java.lang.String receiverAddr = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiverName")
    private final java.lang.String receiverName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "recipient")
    private final java.lang.String recipient = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result")
    private final java.lang.String result = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "senderName")
    private final java.lang.String senderName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "trackingDetails")
    private final java.util.List<com.example.aop_part5_chapter06.data.entity.TrackingDetail> trackingDetails = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "zipCode")
    private final java.lang.String zipCode = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "msg")
    private final java.lang.String errorMessage = null;
    public static final android.os.Parcelable.Creator<com.example.aop_part5_chapter06.data.entity.TrackingInformation> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.aop_part5_chapter06.data.entity.TrackingInformation copy(@org.jetbrains.annotations.Nullable()
    java.lang.String adUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean complete, @org.jetbrains.annotations.Nullable()
    java.lang.String completeYN, @org.jetbrains.annotations.Nullable()
    java.lang.String estimate, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail firstDetail, @org.jetbrains.annotations.Nullable()
    java.lang.String invoiceNo, @org.jetbrains.annotations.Nullable()
    java.lang.String itemImage, @org.jetbrains.annotations.Nullable()
    java.lang.String itemName, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail lastDetail, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail lastStateDetail, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.Level level, @org.jetbrains.annotations.Nullable()
    java.lang.String orderNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String productInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String receiverAddr, @org.jetbrains.annotations.Nullable()
    java.lang.String receiverName, @org.jetbrains.annotations.Nullable()
    java.lang.String recipient, @org.jetbrains.annotations.Nullable()
    java.lang.String result, @org.jetbrains.annotations.Nullable()
    java.lang.String senderName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.aop_part5_chapter06.data.entity.TrackingDetail> trackingDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String zipCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
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
    
    public TrackingInformation() {
        super();
    }
    
    public TrackingInformation(@org.jetbrains.annotations.Nullable()
    java.lang.String adUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean complete, @org.jetbrains.annotations.Nullable()
    java.lang.String completeYN, @org.jetbrains.annotations.Nullable()
    java.lang.String estimate, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail firstDetail, @org.jetbrains.annotations.Nullable()
    java.lang.String invoiceNo, @org.jetbrains.annotations.Nullable()
    java.lang.String itemImage, @org.jetbrains.annotations.Nullable()
    java.lang.String itemName, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail lastDetail, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.TrackingDetail lastStateDetail, @org.jetbrains.annotations.Nullable()
    com.example.aop_part5_chapter06.data.entity.Level level, @org.jetbrains.annotations.Nullable()
    java.lang.String orderNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String productInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String receiverAddr, @org.jetbrains.annotations.Nullable()
    java.lang.String receiverName, @org.jetbrains.annotations.Nullable()
    java.lang.String recipient, @org.jetbrains.annotations.Nullable()
    java.lang.String result, @org.jetbrains.annotations.Nullable()
    java.lang.String senderName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.aop_part5_chapter06.data.entity.TrackingDetail> trackingDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String zipCode, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAdUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getComplete() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompleteYN() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEstimate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail getFirstDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInvoiceNo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail getLastDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.TrackingDetail getLastStateDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.Level component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.aop_part5_chapter06.data.entity.Level getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiverAddr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiverName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRecipient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSenderName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.aop_part5_chapter06.data.entity.TrackingDetail> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.aop_part5_chapter06.data.entity.TrackingDetail> getTrackingDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getZipCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.aop_part5_chapter06.data.entity.TrackingInformation> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.aop_part5_chapter06.data.entity.TrackingInformation createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.aop_part5_chapter06.data.entity.TrackingInformation[] newArray(int size) {
            return null;
        }
    }
}