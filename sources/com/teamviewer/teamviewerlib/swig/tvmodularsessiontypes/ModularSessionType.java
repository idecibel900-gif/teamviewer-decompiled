package com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ModularSessionType {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ModularSessionType(SWIGTYPE_p_boost__uuids__uuid sWIGTYPE_p_boost__uuids__uuid, String str, SWIGTYPE_p_std__vectorT_unsigned_char_t sWIGTYPE_p_std__vectorT_unsigned_char_t, EnforceLevelMS enforceLevelMS) {
        this(ModularSessionTypeSWIGJNI.new_ModularSessionType__SWIG_1(SWIGTYPE_p_boost__uuids__uuid.getCPtr(sWIGTYPE_p_boost__uuids__uuid), str, SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(sWIGTYPE_p_std__vectorT_unsigned_char_t), enforceLevelMS.swigValue()), true);
    }

    public static ModularSessionType Deserialize(byte[] bArr) {
        return new ModularSessionType(ModularSessionTypeSWIGJNI.ModularSessionType_Deserialize(bArr), true);
    }

    public static byte[] Serialize(ModularSessionType modularSessionType) {
        return ModularSessionTypeSWIGJNI.ModularSessionType_Serialize(getCPtr(modularSessionType), modularSessionType);
    }

    public static long getCPtr(ModularSessionType modularSessionType) {
        if (modularSessionType == null) {
            return 0L;
        }
        return modularSessionType.swigCPtr;
    }

    public static long swigRelease(ModularSessionType modularSessionType) {
        if (modularSessionType != null) {
            if (modularSessionType.swigCMemOwn) {
                long j = modularSessionType.swigCPtr;
                modularSessionType.swigCMemOwn = false;
                modularSessionType.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public String GetUuidString() {
        return ModularSessionTypeSWIGJNI.ModularSessionType_GetUuidString(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return ModularSessionTypeSWIGJNI.ModularSessionType_IsValid(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ModularSessionTypeSWIGJNI.delete_ModularSessionType(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public EnforceLevelMS getEnforceLevel() {
        return EnforceLevelMS.swigToEnum(ModularSessionTypeSWIGJNI.ModularSessionType_enforceLevel_get(this.swigCPtr, this));
    }

    public SWIGTYPE_p_std__vectorT_unsigned_char_t getFlags() {
        long jModularSessionType_flags_get = ModularSessionTypeSWIGJNI.ModularSessionType_flags_get(this.swigCPtr, this);
        if (jModularSessionType_flags_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_std__vectorT_unsigned_char_t(jModularSessionType_flags_get, false);
    }

    public SWIGTYPE_p_boost__uuids__uuid getId() {
        return new SWIGTYPE_p_boost__uuids__uuid(ModularSessionTypeSWIGJNI.ModularSessionType_id_get(this.swigCPtr, this), true);
    }

    public String getReadableName() {
        return ModularSessionTypeSWIGJNI.ModularSessionType_readableName_get(this.swigCPtr, this);
    }

    public void setEnforceLevel(EnforceLevelMS enforceLevelMS) {
        ModularSessionTypeSWIGJNI.ModularSessionType_enforceLevel_set(this.swigCPtr, this, enforceLevelMS.swigValue());
    }

    public void setFlags(SWIGTYPE_p_std__vectorT_unsigned_char_t sWIGTYPE_p_std__vectorT_unsigned_char_t) {
        ModularSessionTypeSWIGJNI.ModularSessionType_flags_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(sWIGTYPE_p_std__vectorT_unsigned_char_t));
    }

    public void setId(SWIGTYPE_p_boost__uuids__uuid sWIGTYPE_p_boost__uuids__uuid) {
        ModularSessionTypeSWIGJNI.ModularSessionType_id_set(this.swigCPtr, this, SWIGTYPE_p_boost__uuids__uuid.getCPtr(sWIGTYPE_p_boost__uuids__uuid));
    }

    public void setReadableName(String str) {
        ModularSessionTypeSWIGJNI.ModularSessionType_readableName_set(this.swigCPtr, this, str);
    }

    public ModularSessionType() {
        this(ModularSessionTypeSWIGJNI.new_ModularSessionType__SWIG_0(), true);
    }

    public ModularSessionType(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
