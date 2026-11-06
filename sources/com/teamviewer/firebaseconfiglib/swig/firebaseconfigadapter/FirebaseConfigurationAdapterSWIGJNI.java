package com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseConfigurationAdapterSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void FirebaseConfigReadyCallBack_OnFirebaseConfigReady(long j, FirebaseConfigReadyCallBack firebaseConfigReadyCallBack);

    public static final native void FirebaseConfigReadyCallBack_change_ownership(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack, long j, boolean z);

    public static final native void FirebaseConfigReadyCallBack_director_connect(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack, long j, boolean z, boolean z2);

    public static final native void FirebaseConfigurationAdapter_AddFirebaseConfigReadyCallback(long j, FirebaseConfigurationAdapter firebaseConfigurationAdapter, long j2, FirebaseConfigReadyCallBack firebaseConfigReadyCallBack);

    public static final native long FirebaseConfigurationAdapter_Create(int i);

    public static final native long FirebaseConfigurationAdapter_GetSignedMessageRepresentation(long j, FirebaseConfigurationAdapter firebaseConfigurationAdapter, int i);

    public static final native void FirebaseConfigurationAdapter_RegisterForFirebase(long j, FirebaseConfigurationAdapter firebaseConfigurationAdapter);

    public static final native void FirebaseConfigurationAdapter_RemoveFirebaseConfigReadyCallback(long j, FirebaseConfigurationAdapter firebaseConfigurationAdapter, long j2, FirebaseConfigReadyCallBack firebaseConfigReadyCallBack);

    public static void SwigDirector_FirebaseConfigReadyCallBack_OnFirebaseConfigReady(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack) {
        firebaseConfigReadyCallBack.OnFirebaseConfigReady();
    }

    public static final native void delete_FirebaseConfigReadyCallBack(long j);

    public static final native void delete_FirebaseConfigurationAdapter(long j);

    public static final native long new_FirebaseConfigReadyCallBack();

    private static final native void swig_module_init();
}
