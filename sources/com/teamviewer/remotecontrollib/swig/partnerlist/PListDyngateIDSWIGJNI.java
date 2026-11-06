package com.teamviewer.remotecontrollib.swig.partnerlist;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public abstract class PListDyngateIDSWIGJNI {
    public static final native String PListDyngateID_GetAsString(long j, PListDyngateID pListDyngateID);

    public static final native long PListDyngateID_GetInternalID(long j, PListDyngateID pListDyngateID);

    public static final native boolean PListDyngateID_Valid(long j, PListDyngateID pListDyngateID);

    public static final native void delete_PListDyngateID(long j);

    public static final native long new_PListDyngateID__SWIG_1(long j, DyngateID dyngateID);
}
