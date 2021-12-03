package com.example.aop_part5_chapter06.data.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/aop_part5_chapter06/data/entity/Level;", "", "label", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "PREPARE", "READY_FOR_SHIPPING", "ON_TRANSIT", "ON_ARRIVE_ROUTER", "START", "COMPLETE", "app_debug"})
public enum Level {
    @com.google.gson.annotations.SerializedName(value = "1")
    /*public static final*/ PREPARE /* = new PREPARE(null) */,
    @com.google.gson.annotations.SerializedName(value = "2")
    /*public static final*/ READY_FOR_SHIPPING /* = new READY_FOR_SHIPPING(null) */,
    @com.google.gson.annotations.SerializedName(value = "3")
    /*public static final*/ ON_TRANSIT /* = new ON_TRANSIT(null) */,
    @com.google.gson.annotations.SerializedName(value = "4")
    /*public static final*/ ON_ARRIVE_ROUTER /* = new ON_ARRIVE_ROUTER(null) */,
    @com.google.gson.annotations.SerializedName(value = "5")
    /*public static final*/ START /* = new START(null) */,
    @com.google.gson.annotations.SerializedName(value = "6")
    /*public static final*/ COMPLETE /* = new COMPLETE(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    
    Level(java.lang.String label) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
}