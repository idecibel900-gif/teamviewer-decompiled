package com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseConfigReadyCallBack {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public FirebaseConfigReadyCallBack() {
        this(FirebaseConfigurationAdapterSWIGJNI.new_FirebaseConfigReadyCallBack(), true);
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigReadyCallBack_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack) {
        if (firebaseConfigReadyCallBack == null) {
            return 0L;
        }
        return firebaseConfigReadyCallBack.swigCPtr;
    }

    public static long swigRelease(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack) {
        if (firebaseConfigReadyCallBack != null) {
            if (firebaseConfigReadyCallBack.swigCMemOwn) {
                long j = firebaseConfigReadyCallBack.swigCPtr;
                firebaseConfigReadyCallBack.swigCMemOwn = false;
                firebaseConfigReadyCallBack.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public void OnFirebaseConfigReady() {
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigReadyCallBack_OnFirebaseConfigReady(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    FirebaseConfigurationAdapterSWIGJNI.delete_FirebaseConfigReadyCallBack(j);
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

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigReadyCallBack_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigReadyCallBack_change_ownership(this, this.swigCPtr, true);
    }

    public FirebaseConfigReadyCallBack(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
