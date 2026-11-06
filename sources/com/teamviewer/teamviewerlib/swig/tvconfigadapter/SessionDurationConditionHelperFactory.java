package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class SessionDurationConditionHelperFactory {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SessionDurationConditionHelperFactory() {
        this(SessionDurationConditionHelperFactorySWIGJNI.new_SessionDurationConditionHelperFactory(), true);
    }

    public static ISessionDurationConditionHelper Create() {
        long jSessionDurationConditionHelperFactory_Create = SessionDurationConditionHelperFactorySWIGJNI.SessionDurationConditionHelperFactory_Create();
        if (jSessionDurationConditionHelperFactory_Create == 0) {
            return null;
        }
        return new ISessionDurationConditionHelper(jSessionDurationConditionHelperFactory_Create, true);
    }

    public static long getCPtr(SessionDurationConditionHelperFactory sessionDurationConditionHelperFactory) {
        if (sessionDurationConditionHelperFactory == null) {
            return 0L;
        }
        return sessionDurationConditionHelperFactory.swigCPtr;
    }

    public static long swigRelease(SessionDurationConditionHelperFactory sessionDurationConditionHelperFactory) {
        if (sessionDurationConditionHelperFactory != null) {
            if (sessionDurationConditionHelperFactory.swigCMemOwn) {
                long j = sessionDurationConditionHelperFactory.swigCPtr;
                sessionDurationConditionHelperFactory.swigCMemOwn = false;
                sessionDurationConditionHelperFactory.delete();
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
                    SessionDurationConditionHelperFactorySWIGJNI.delete_SessionDurationConditionHelperFactory(j);
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

    public SessionDurationConditionHelperFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
