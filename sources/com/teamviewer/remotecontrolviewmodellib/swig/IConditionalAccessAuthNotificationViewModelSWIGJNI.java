package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.swigcallbacklib.IntSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IConditionalAccessAuthNotificationViewModelSWIGJNI {
    public static final native void ConditionalAccessAuthenticationNotificationViewModelNative_DecryptPayload(long j, ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative, String str, String str2, long j2, ConditionalAccessAuthenticationPayloadSignalCallback conditionalAccessAuthenticationPayloadSignalCallback);

    public static final native void ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestAllowed(long j, ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative, long j2, long j3, IntSignalCallback intSignalCallback);

    public static final native void ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestDenied(long j, ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative, long j2, long j3, IntSignalCallback intSignalCallback);

    public static final native void delete_ConditionalAccessAuthenticationNotificationViewModelNative(long j);
}
