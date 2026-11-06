package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class IInAppPurchaseViewModelSWIGJNI {
    public static final native boolean IInAppPurchaseViewModel_DoesAccountNeedALicense(long j, IInAppPurchaseViewModel iInAppPurchaseViewModel);

    public static final native boolean IInAppPurchaseViewModel_IsAccountLoggedIn(long j, IInAppPurchaseViewModel iInAppPurchaseViewModel);

    public static final native void IInAppPurchaseViewModel_RegisterForLoginChanges(long j, IInAppPurchaseViewModel iInAppPurchaseViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void IInAppPurchaseViewModel_RegisterLicenseStateChanges(long j, IInAppPurchaseViewModel iInAppPurchaseViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_IInAppPurchaseViewModel(long j);
}
