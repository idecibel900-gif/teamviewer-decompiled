package com.teamviewer.oneapinetworklib.swig;

import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIEventHandlerAndroidSWIGJNI {
    public static final native long OneAPIEventHandlerAndroid_Create();

    public static final native void OneAPIEventHandlerAndroid_RegisterForOneAPIEvents(long j, OneAPIEventHandlerAndroid oneAPIEventHandlerAndroid, long j2, StringSignalCallback stringSignalCallback);

    public static final native void delete_OneAPIEventHandlerAndroid(long j);
}
