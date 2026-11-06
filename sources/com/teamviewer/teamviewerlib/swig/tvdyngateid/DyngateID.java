package com.teamviewer.teamviewerlib.swig.tvdyngateid;

import o.hk0;
import o.qs1;

/* JADX INFO: loaded from: classes.dex */
public class DyngateID {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DyngateID(SWIGTYPE_p_MagicDynGateID sWIGTYPE_p_MagicDynGateID) {
        this(DyngateIDSWIGJNI.new_DyngateID__SWIG_1(SWIGTYPE_p_MagicDynGateID.getCPtr(sWIGTYPE_p_MagicDynGateID)), true);
    }

    public static DyngateID FromLong(long j) {
        return new DyngateID(DyngateIDSWIGJNI.DyngateID_FromLong(j), true);
    }

    public static DyngateID InvalidDyngateID() {
        return new DyngateID(DyngateIDSWIGJNI.DyngateID_InvalidDyngateID(), true);
    }

    public static long getCPtr(DyngateID dyngateID) {
        if (dyngateID == null) {
            return 0L;
        }
        return dyngateID.swigCPtr;
    }

    public static long swigRelease(DyngateID dyngateID) {
        if (dyngateID != null) {
            if (dyngateID.swigCMemOwn) {
                long j = dyngateID.swigCPtr;
                dyngateID.swigCMemOwn = false;
                dyngateID.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public DyngateID Assignment(SWIGTYPE_p_MagicDynGateID sWIGTYPE_p_MagicDynGateID) {
        return new DyngateID(DyngateIDSWIGJNI.DyngateID_Assignment(this.swigCPtr, this, SWIGTYPE_p_MagicDynGateID.getCPtr(sWIGTYPE_p_MagicDynGateID)), false);
    }

    public boolean Equal(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_Equal(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public boolean GreaterOrEqualThan(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_GreaterOrEqualThan(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public boolean GreaterThan(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_GreaterThan(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public boolean IsValid() {
        return DyngateIDSWIGJNI.DyngateID_IsValid(this.swigCPtr, this);
    }

    public boolean LessOrEqualThan(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_LessOrEqualThan(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public boolean LessThan(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_LessThan(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public String NativeToString() {
        return DyngateIDSWIGJNI.DyngateID_NativeToString(this.swigCPtr, this);
    }

    public boolean NotEqual(DyngateID dyngateID) {
        return DyngateIDSWIGJNI.DyngateID_NotEqual(this.swigCPtr, this, getCPtr(dyngateID), dyngateID);
    }

    public long ToLong() {
        return DyngateIDSWIGJNI.DyngateID_ToLong(this.swigCPtr, this);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DyngateID m20clone() {
        return FromLong(ToLong());
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DyngateIDSWIGJNI.delete_DyngateID(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DyngateID) {
            return Equal((DyngateID) obj);
        }
        return false;
    }

    public void finalize() {
        delete();
    }

    public int hashCode() {
        return (int) ToLong();
    }

    public String toFormattedId() {
        String string = toString();
        string.getClass();
        return qs1.M(string);
    }

    public String toString() {
        return NativeToString();
    }

    public DyngateID() {
        this(DyngateIDSWIGJNI.new_DyngateID__SWIG_0(), true);
    }

    public DyngateID(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
