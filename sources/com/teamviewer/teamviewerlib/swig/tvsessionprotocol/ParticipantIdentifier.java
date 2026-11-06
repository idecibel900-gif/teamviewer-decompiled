package com.teamviewer.teamviewerlib.swig.tvsessionprotocol;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ParticipantIdentifier {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ParticipantIdentifier(DyngateID dyngateID, int i) {
        this(ParticipantIdentifierSWIGJNI.new_ParticipantIdentifier__SWIG_1(DyngateID.getCPtr(dyngateID), dyngateID, i), true);
    }

    public static ParticipantIdentifier Deserialize(byte[] bArr) {
        return new ParticipantIdentifier(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_Deserialize(bArr), true);
    }

    public static byte[] Serialize(ParticipantIdentifier participantIdentifier) {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_Serialize(getCPtr(participantIdentifier), participantIdentifier);
    }

    public static ParticipantIdentifier fromDyngateIdAndSessionId(long j, long j2) {
        return new ParticipantIdentifier(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_fromDyngateIdAndSessionId(j, j2), true);
    }

    public static ParticipantIdentifier fromInt64(long j) {
        return new ParticipantIdentifier(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_fromInt64(j), true);
    }

    public static long getCPtr(ParticipantIdentifier participantIdentifier) {
        if (participantIdentifier == null) {
            return 0L;
        }
        return participantIdentifier.swigCPtr;
    }

    public static ParticipantIdentifier getInvalid() {
        return new ParticipantIdentifier(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_getInvalid(), true);
    }

    public static long swigRelease(ParticipantIdentifier participantIdentifier) {
        if (participantIdentifier != null) {
            if (participantIdentifier.swigCMemOwn) {
                long j = participantIdentifier.swigCPtr;
                participantIdentifier.swigCMemOwn = false;
                participantIdentifier.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public ParticipantIdentifier Assignment(ParticipantIdentifier participantIdentifier) {
        return new ParticipantIdentifier(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_Assignment(this.swigCPtr, this, getCPtr(participantIdentifier), participantIdentifier), false);
    }

    public DyngateID DyngateID() {
        return new DyngateID(ParticipantIdentifierSWIGJNI.ParticipantIdentifier_DyngateID(this.swigCPtr, this), true);
    }

    public boolean Equal(ParticipantIdentifier participantIdentifier) {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_Equal(this.swigCPtr, this, getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean GreaterThan(ParticipantIdentifier participantIdentifier) {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_GreaterThan(this.swigCPtr, this, getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsValid() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_IsValid(this.swigCPtr, this);
    }

    public boolean LessThan(ParticipantIdentifier participantIdentifier) {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_LessThan(this.swigCPtr, this, getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean NotEqual(ParticipantIdentifier participantIdentifier) {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_NotEqual(this.swigCPtr, this, getCPtr(participantIdentifier), participantIdentifier);
    }

    public int SessionID() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_SessionID(this.swigCPtr, this);
    }

    public String ToString() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_ToString(this.swigCPtr, this);
    }

    public String ToWString() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_ToWString(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantIdentifierSWIGJNI.delete_ParticipantIdentifier(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ParticipantIdentifier) && ((ParticipantIdentifier) obj).toInt64() == toInt64();
    }

    public void finalize() {
        delete();
    }

    public int hashCode() {
        long int64 = toInt64();
        return (int) (int64 ^ (int64 >>> 32));
    }

    public String nativeToString() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_nativeToString(this.swigCPtr, this);
    }

    public long toInt64() {
        return ParticipantIdentifierSWIGJNI.ParticipantIdentifier_toInt64(this.swigCPtr, this);
    }

    public String toString() {
        return nativeToString();
    }

    public ParticipantIdentifier() {
        this(ParticipantIdentifierSWIGJNI.new_ParticipantIdentifier__SWIG_0(), true);
    }

    public ParticipantIdentifier(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ParticipantIdentifier(ParticipantIdentifier participantIdentifier) {
        this(ParticipantIdentifierSWIGJNI.new_ParticipantIdentifier__SWIG_2(getCPtr(participantIdentifier), participantIdentifier), true);
    }
}
