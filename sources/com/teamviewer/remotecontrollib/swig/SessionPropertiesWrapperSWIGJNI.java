package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class SessionPropertiesWrapperSWIGJNI {
    public static final native void SessionPropertiesWrapper_actionId_set(long j, SessionPropertiesWrapper sessionPropertiesWrapper, int i);

    public static final native void SessionPropertiesWrapper_ownLicenseFeatures_set(long j, SessionPropertiesWrapper sessionPropertiesWrapper, byte[] bArr);

    public static final native void SessionPropertiesWrapper_sessionId_set(long j, SessionPropertiesWrapper sessionPropertiesWrapper, int i);

    public static final native void SessionPropertiesWrapper_targetTeamViewerId_set(long j, SessionPropertiesWrapper sessionPropertiesWrapper, long j2, DyngateID dyngateID);

    public static final native void delete_SessionPropertiesWrapper(long j);

    public static final native long new_SessionPropertiesWrapper();
}
