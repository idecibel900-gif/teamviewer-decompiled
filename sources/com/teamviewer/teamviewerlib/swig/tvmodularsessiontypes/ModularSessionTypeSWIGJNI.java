package com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes;

/* JADX INFO: loaded from: classes.dex */
public class ModularSessionTypeSWIGJNI {
    public static final native long ModularSessionType_Deserialize(byte[] bArr);

    public static final native String ModularSessionType_GetUuidString(long j, ModularSessionType modularSessionType);

    public static final native boolean ModularSessionType_IsValid(long j, ModularSessionType modularSessionType);

    public static final native byte[] ModularSessionType_Serialize(long j, ModularSessionType modularSessionType);

    public static final native int ModularSessionType_enforceLevel_get(long j, ModularSessionType modularSessionType);

    public static final native void ModularSessionType_enforceLevel_set(long j, ModularSessionType modularSessionType, int i);

    public static final native long ModularSessionType_flags_get(long j, ModularSessionType modularSessionType);

    public static final native void ModularSessionType_flags_set(long j, ModularSessionType modularSessionType, long j2);

    public static final native long ModularSessionType_id_get(long j, ModularSessionType modularSessionType);

    public static final native void ModularSessionType_id_set(long j, ModularSessionType modularSessionType, long j2);

    public static final native String ModularSessionType_readableName_get(long j, ModularSessionType modularSessionType);

    public static final native void ModularSessionType_readableName_set(long j, ModularSessionType modularSessionType, String str);

    public static final native void delete_ModularSessionType(long j);

    public static final native long new_ModularSessionType__SWIG_0();

    public static final native long new_ModularSessionType__SWIG_1(long j, String str, long j2, int i);
}
