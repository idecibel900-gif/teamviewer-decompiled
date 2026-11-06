package com.teamviewer.oneapinetworklib.swig;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIResponseAndroidSWIGJNI {
    public static final native String OneAPIResponseAndroid_data_get(long j, OneAPIResponseAndroid oneAPIResponseAndroid);

    public static final native void OneAPIResponseAndroid_data_set(long j, OneAPIResponseAndroid oneAPIResponseAndroid, String str);

    public static final native long OneAPIResponseAndroid_headers_get(long j, OneAPIResponseAndroid oneAPIResponseAndroid);

    public static final native void OneAPIResponseAndroid_headers_set(long j, OneAPIResponseAndroid oneAPIResponseAndroid, long j2, HttpHeaders httpHeaders);

    public static final native String OneAPIResponseAndroid_statusText_get(long j, OneAPIResponseAndroid oneAPIResponseAndroid);

    public static final native void OneAPIResponseAndroid_statusText_set(long j, OneAPIResponseAndroid oneAPIResponseAndroid, String str);

    public static final native int OneAPIResponseAndroid_status_get(long j, OneAPIResponseAndroid oneAPIResponseAndroid);

    public static final native void OneAPIResponseAndroid_status_set(long j, OneAPIResponseAndroid oneAPIResponseAndroid, int i);

    public static final native void delete_OneAPIResponseAndroid(long j);

    public static final native long new_OneAPIResponseAndroid();
}
