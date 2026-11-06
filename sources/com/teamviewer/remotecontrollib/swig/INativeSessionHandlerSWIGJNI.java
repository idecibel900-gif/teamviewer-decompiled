package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;

/* JADX INFO: loaded from: classes.dex */
public abstract class INativeSessionHandlerSWIGJNI {
    public static final native void INativeSessionHandler_EnableSession(long j, INativeSessionHandler iNativeSessionHandler, int i, long j2, SessionPropertiesWrapper sessionPropertiesWrapper, long j3, ModularSessionType modularSessionType, int i2);

    public static final native void INativeSessionHandler_StartSession(long j, INativeSessionHandler iNativeSessionHandler, long j2);

    public static final native void delete_INativeSessionHandler(long j);
}
