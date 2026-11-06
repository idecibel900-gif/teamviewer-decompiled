package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class LicenseViewModelSWIGJNI {
    public static final native String LicenseViewModel_GetAccountLoginName(long j, LicenseViewModel licenseViewModel);

    public static final native String LicenseViewModel_GetAccountName(long j, LicenseViewModel licenseViewModel);

    public static final native String LicenseViewModel_GetLicenseSimpleName(long j, LicenseViewModel licenseViewModel);

    public static final native void LicenseViewModel_RegisterForAccountLicenseActivatedInfo(long j, LicenseViewModel licenseViewModel, long j2, StringSignalCallback stringSignalCallback);

    public static final native void LicenseViewModel_RegisterForChanges(long j, LicenseViewModel licenseViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void delete_LicenseViewModel(long j);
}
