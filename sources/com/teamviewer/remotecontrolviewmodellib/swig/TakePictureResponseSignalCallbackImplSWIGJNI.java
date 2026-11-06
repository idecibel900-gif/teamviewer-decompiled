package com.teamviewer.remotecontrolviewmodellib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class TakePictureResponseSignalCallbackImplSWIGJNI {
    static {
        swig_module_init();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[LOOP:0: B:9:0x0016->B:15:0x0023, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x001e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x0014, please report this as an issue */
    public static void SwigDirector_TakePictureResponseSignalCallbackImpl_PerformCallback(TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl, int i) {
        int i2;
        TakePictureResponse takePictureResponse;
        TakePictureResponse[] takePictureResponseArr = (TakePictureResponse[]) TakePictureResponse.class.getEnumConstants();
        if (i >= takePictureResponseArr.length || i < 0) {
            for (TakePictureResponse takePictureResponse2 : takePictureResponseArr) {
                if (takePictureResponse2.m == i) {
                    takePictureResponse = takePictureResponse2;
                }
            }
            hk0.g(ua5.k(i, TakePictureResponse.class, "No enum ", " with value "));
            return;
        }
        takePictureResponse = takePictureResponseArr[i];
        if (takePictureResponse.m != i) {
            while (i2 < r2) {
                if (takePictureResponse2.m == i) {
                    takePictureResponse = takePictureResponse2;
                }
            }
            hk0.g(ua5.k(i, TakePictureResponse.class, "No enum ", " with value "));
            return;
        }
        takePictureResponseSignalCallbackImpl.PerformCallback(takePictureResponse);
    }

    public static final native void TakePictureResponseSignalCallbackImpl_PerformCallback(long j, TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl, int i);

    public static final native long TakePictureResponseSignalCallbackImpl_SWIGUpcast(long j);

    public static final native void TakePictureResponseSignalCallbackImpl_change_ownership(TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl, long j, boolean z);

    public static final native void TakePictureResponseSignalCallbackImpl_director_connect(TakePictureResponseSignalCallbackImpl takePictureResponseSignalCallbackImpl, long j, boolean z, boolean z2);

    public static final native void delete_TakePictureResponseSignalCallbackImpl(long j);

    public static final native long new_TakePictureResponseSignalCallbackImpl();

    private static final native void swig_module_init();
}
