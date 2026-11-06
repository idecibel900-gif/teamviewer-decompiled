package com.teamviewer.outgoingsessionlib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class ParticipantManagerFactoryAndroid {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ParticipantManagerFactoryAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static ICommonParticipantManager Create(int i, int i2, boolean z) {
        long jParticipantManagerFactoryAndroid_Create = ParticipantManagerFactoryAndroidSWIGJNI.ParticipantManagerFactoryAndroid_Create(i, i2, z);
        if (jParticipantManagerFactoryAndroid_Create == 0) {
            return null;
        }
        return new ICommonParticipantManager(jParticipantManagerFactoryAndroid_Create, true);
    }

    public static void Shutdown() {
        ParticipantManagerFactoryAndroidSWIGJNI.ParticipantManagerFactoryAndroid_Shutdown();
    }

    public static long getCPtr(ParticipantManagerFactoryAndroid participantManagerFactoryAndroid) {
        if (participantManagerFactoryAndroid == null) {
            return 0L;
        }
        return participantManagerFactoryAndroid.swigCPtr;
    }

    public static long swigRelease(ParticipantManagerFactoryAndroid participantManagerFactoryAndroid) {
        if (participantManagerFactoryAndroid != null) {
            if (participantManagerFactoryAndroid.swigCMemOwn) {
                long j = participantManagerFactoryAndroid.swigCPtr;
                participantManagerFactoryAndroid.swigCMemOwn = false;
                participantManagerFactoryAndroid.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantManagerFactoryAndroidSWIGJNI.delete_ParticipantManagerFactoryAndroid(j);
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
}
