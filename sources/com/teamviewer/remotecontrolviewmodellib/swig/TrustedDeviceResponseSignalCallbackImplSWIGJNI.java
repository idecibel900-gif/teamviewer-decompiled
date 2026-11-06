package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class TrustedDeviceResponseSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025 A[LOOP:0: B:9:0x0018->B:15:0x0025, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x0016, please report this as an issue */
    public static void SwigDirector_TrustedDeviceResponseSignalCallbackImpl_PerformCallback(TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl, int i) {
        int i2;
        ResponseCode responseCode;
        ResponseCode[] responseCodeArr = ResponseCode.n;
        ResponseCode[] responseCodeArr2 = (ResponseCode[]) ResponseCode.class.getEnumConstants();
        if (i >= responseCodeArr2.length || i < 0) {
            for (ResponseCode responseCode2 : responseCodeArr2) {
                if (responseCode2.m == i) {
                    responseCode = responseCode2;
                }
            }
            hk0.g(ua5.k(i, ResponseCode.class, "No enum ", " with value "));
            return;
        }
        responseCode = responseCodeArr2[i];
        if (responseCode.m != i) {
            while (i2 < r2) {
                if (responseCode2.m == i) {
                    responseCode = responseCode2;
                }
            }
            hk0.g(ua5.k(i, ResponseCode.class, "No enum ", " with value "));
            return;
        }
        trustedDeviceResponseSignalCallbackImpl.PerformCallback(responseCode);
    }

    public static final native void TrustedDeviceResponseSignalCallbackImpl_PerformCallback(long j, TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl, int i);

    public static final native long TrustedDeviceResponseSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void TrustedDeviceResponseSignalCallbackImpl_change_ownership(TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl, long j, boolean z);

    public static final native void TrustedDeviceResponseSignalCallbackImpl_director_connect(TrustedDeviceResponseSignalCallbackImpl trustedDeviceResponseSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_TrustedDeviceResponseSignalCallbackImpl(long j);

    public static final native long new_TrustedDeviceResponseSignalCallbackImpl();

    private static final native void swig_module_init();
}
