package com.teamviewer.teamviewerlib.swig.tvclientlicensing;

/* JADX INFO: loaded from: classes.dex */
public class ILicensingSWIGJNI {
    public static final native long ILicensing_BusinessAccountLicenseInfo_deviceIds_get(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo);

    public static final native void ILicensing_BusinessAccountLicenseInfo_deviceIds_set(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo, long j2);

    public static final native long ILicensing_BusinessAccountLicenseInfo_licenseId_get(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo);

    public static final native void ILicensing_BusinessAccountLicenseInfo_licenseId_set(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo, long j2);

    public static final native boolean ILicensing_BusinessAccountLicenseInfo_localDeviceActivated_get(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo);

    public static final native void ILicensing_BusinessAccountLicenseInfo_localDeviceActivated_set(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo, boolean z);

    public static final native long ILicensing_BusinessAccountLicenseInfo_numberOfSlots_get(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo);

    public static final native void ILicensing_BusinessAccountLicenseInfo_numberOfSlots_set(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo, long j2);

    public static final native int ILicensing_BusinessAccountLicenseInfo_remainingMoves_get(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo);

    public static final native void ILicensing_BusinessAccountLicenseInfo_remainingMoves_set(long j, ILicensing.BusinessAccountLicenseInfo businessAccountLicenseInfo, int i);

    public static final native long ILicensing_CoreLicense(long j, ILicensing iLicensing);

    public static final native long ILicensing_GetBusinessAccountLicenseInfo(long j, ILicensing iLicensing);

    public static final native long ILicensing_GetCoreLicenseExpirationDuration(long j, ILicensing iLicensing);

    public static final native long ILicensing_GetExpirationDate(long j, ILicensing iLicensing, int i);

    public static final native long ILicensing_GetLicenseToProductMappings(long j, ILicensing iLicensing);

    public static final native long ILicensing_GetRemoteAccessAvailableEndpoints(long j, ILicensing iLicensing);

    public static final native long ILicensing_GetRemoteAccessLicenseExpirationDuration(long j, ILicensing iLicensing);

    public static final native void ILicensing_HandleAccountLoginInProgress(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasAdvancedAssetManagementLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasAnyLicenseThatAllowsMeeting(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasBusinessAccountLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasBusinessLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasDexEssentialsLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasRemoteAccessLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasTVOneAdvancedLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasTVOneEnterpriseLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasTVOneFamilyLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasTensorLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_HasTensorProOrUnlimitedLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_IsAccountTrialExpired(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_IsAccountTrialValid(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_IsMarketingTrialLicense(long j, ILicensing iLicensing);

    public static final native boolean ILicensing_IsRemoteAccessLicenseOnly(long j, ILicensing iLicensing);

    public static final native long ILicensing_RemoteAccessLicense(long j, ILicensing iLicensing);

    public static final native void ILicensing_SetLicensingAccountConnector(long j, ILicensing iLicensing, long j2);

    public static final native void ILicensing_Shutdown(long j, ILicensing iLicensing);

    public static final native long ILicensing_TeamViewerLicenseInfo(long j, ILicensing iLicensing);

    public static final native void delete_ILicensing(long j);

    public static final native void delete_ILicensing_BusinessAccountLicenseInfo(long j);

    public static final native long new_ILicensing_BusinessAccountLicenseInfo(long j, long j2, int i, long j3, boolean z);
}
