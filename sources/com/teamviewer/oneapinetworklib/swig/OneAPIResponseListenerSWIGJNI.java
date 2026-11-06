package com.teamviewer.oneapinetworklib.swig;

/* JADX INFO: loaded from: classes.dex */
public class OneAPIResponseListenerSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void IOneAPIResponseListener_OnResponse(long j, IOneAPIResponseListener iOneAPIResponseListener, long j2, OneAPIResponseAndroid oneAPIResponseAndroid);

    public static final native void IOneAPIResponseListener_change_ownership(IOneAPIResponseListener iOneAPIResponseListener, long j, boolean z);

    public static final native void IOneAPIResponseListener_director_connect(IOneAPIResponseListener iOneAPIResponseListener, long j, boolean z, boolean z2);

    public static void SwigDirector_IOneAPIResponseListener_OnResponse(IOneAPIResponseListener iOneAPIResponseListener, long j) {
        iOneAPIResponseListener.OnResponse(new OneAPIResponseAndroid(j, false));
    }

    public static final native void delete_IOneAPIResponseListener(long j);

    public static final native long new_IOneAPIResponseListener();

    private static final native void swig_module_init();
}
