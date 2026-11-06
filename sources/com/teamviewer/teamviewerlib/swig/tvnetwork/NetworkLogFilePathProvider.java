package com.teamviewer.teamviewerlib.swig.tvnetwork;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class NetworkLogFilePathProvider {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public NetworkLogFilePathProvider() {
        this(NetworkLogFilePathProviderSWIGJNI.new_NetworkLogFilePathProvider(), true);
    }

    public static String GetLogFilePath() {
        return NetworkLogFilePathProviderSWIGJNI.NetworkLogFilePathProvider_GetLogFilePath();
    }

    public static String GetLogFilePath2() {
        return NetworkLogFilePathProviderSWIGJNI.NetworkLogFilePathProvider_GetLogFilePath2();
    }

    public static String GetLogFilePathOld() {
        return NetworkLogFilePathProviderSWIGJNI.NetworkLogFilePathProvider_GetLogFilePathOld();
    }

    public static long getCPtr(NetworkLogFilePathProvider networkLogFilePathProvider) {
        if (networkLogFilePathProvider == null) {
            return 0L;
        }
        return networkLogFilePathProvider.swigCPtr;
    }

    public static long swigRelease(NetworkLogFilePathProvider networkLogFilePathProvider) {
        if (networkLogFilePathProvider != null) {
            if (networkLogFilePathProvider.swigCMemOwn) {
                long j = networkLogFilePathProvider.swigCPtr;
                networkLogFilePathProvider.swigCMemOwn = false;
                networkLogFilePathProvider.delete();
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
                    NetworkLogFilePathProviderSWIGJNI.delete_NetworkLogFilePathProvider(j);
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

    public NetworkLogFilePathProvider(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
