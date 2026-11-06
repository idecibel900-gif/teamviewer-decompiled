package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class RemoteAccessEndpointActivationSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void RemoteAccessEndpointActivationSignalCallbackImpl_PerformCallback(long j, RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl, int i);

    public static final native long RemoteAccessEndpointActivationSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void RemoteAccessEndpointActivationSignalCallbackImpl_change_ownership(RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl, long j, boolean z);

    public static final native void RemoteAccessEndpointActivationSignalCallbackImpl_director_connect(RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl, long j, boolean z, boolean z2);

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[LOOP:0: B:9:0x0016->B:15:0x0023, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x001e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x0014, please report this as an issue */
    public static void SwigDirector_RemoteAccessEndpointActivationSignalCallbackImpl_PerformCallback(RemoteAccessEndpointActivationSignalCallbackImpl remoteAccessEndpointActivationSignalCallbackImpl, int i) {
        int i2;
        EndpointActivationResponseCode endpointActivationResponseCode;
        EndpointActivationResponseCode[] endpointActivationResponseCodeArr = (EndpointActivationResponseCode[]) EndpointActivationResponseCode.class.getEnumConstants();
        if (i >= endpointActivationResponseCodeArr.length || i < 0) {
            for (EndpointActivationResponseCode endpointActivationResponseCode2 : endpointActivationResponseCodeArr) {
                if (endpointActivationResponseCode2.m == i) {
                    endpointActivationResponseCode = endpointActivationResponseCode2;
                }
            }
            hk0.g(ua5.k(i, EndpointActivationResponseCode.class, "No enum ", " with value "));
            return;
        }
        endpointActivationResponseCode = endpointActivationResponseCodeArr[i];
        if (endpointActivationResponseCode.m != i) {
            while (i2 < r2) {
                if (endpointActivationResponseCode2.m == i) {
                    endpointActivationResponseCode = endpointActivationResponseCode2;
                }
            }
            hk0.g(ua5.k(i, EndpointActivationResponseCode.class, "No enum ", " with value "));
            return;
        }
        remoteAccessEndpointActivationSignalCallbackImpl.PerformCallback(endpointActivationResponseCode);
    }

    public static final native void delete_RemoteAccessEndpointActivationSignalCallbackImpl(long j);

    public static final native long new_RemoteAccessEndpointActivationSignalCallbackImpl();

    private static final native void swig_module_init();
}
