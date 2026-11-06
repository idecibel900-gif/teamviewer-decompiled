package com.teamviewer.teamviewerlib.swig.tvclientlicensing;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class ILicensing {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ILicensing(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ILicensing iLicensing) {
        if (iLicensing == null) {
            return 0L;
        }
        return iLicensing.swigCPtr;
    }

    public SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvclientlicensing__CoreLicenseInfo_t CoreLicense() {
        return new SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvclientlicensing__CoreLicenseInfo_t(ILicensingSWIGJNI.ILicensing_CoreLicense(this.swigCPtr, this), false);
    }

    public SWIGTYPE_p_std__optionalT_tvclientlicensing__ILicensing__BusinessAccountLicenseInfo_t GetBusinessAccountLicenseInfo() {
        return new SWIGTYPE_p_std__optionalT_tvclientlicensing__ILicensing__BusinessAccountLicenseInfo_t(ILicensingSWIGJNI.ILicensing_GetBusinessAccountLicenseInfo(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_boost__gregorian__date_duration GetCoreLicenseExpirationDuration() {
        return new SWIGTYPE_p_boost__gregorian__date_duration(ILicensingSWIGJNI.ILicensing_GetCoreLicenseExpirationDuration(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_boost__gregorian__date GetExpirationDate(int i) {
        return new SWIGTYPE_p_boost__gregorian__date(ILicensingSWIGJNI.ILicensing_GetExpirationDate(this.swigCPtr, this, i), true);
    }

    public SWIGTYPE_p_std__vectorT_tvclientstatistics__LicenseInformation_t GetLicenseToProductMappings() {
        return new SWIGTYPE_p_std__vectorT_tvclientstatistics__LicenseInformation_t(ILicensingSWIGJNI.ILicensing_GetLicenseToProductMappings(this.swigCPtr, this), true);
    }

    public long GetRemoteAccessAvailableEndpoints() {
        return ILicensingSWIGJNI.ILicensing_GetRemoteAccessAvailableEndpoints(this.swigCPtr, this);
    }

    public SWIGTYPE_p_boost__gregorian__date_duration GetRemoteAccessLicenseExpirationDuration() {
        return new SWIGTYPE_p_boost__gregorian__date_duration(ILicensingSWIGJNI.ILicensing_GetRemoteAccessLicenseExpirationDuration(this.swigCPtr, this), true);
    }

    public void HandleAccountLoginInProgress() {
        ILicensingSWIGJNI.ILicensing_HandleAccountLoginInProgress(this.swigCPtr, this);
    }

    public boolean HasAdvancedAssetManagementLicense() {
        return ILicensingSWIGJNI.ILicensing_HasAdvancedAssetManagementLicense(this.swigCPtr, this);
    }

    public boolean HasAnyLicenseThatAllowsMeeting() {
        return ILicensingSWIGJNI.ILicensing_HasAnyLicenseThatAllowsMeeting(this.swigCPtr, this);
    }

    public boolean HasBusinessAccountLicense() {
        return ILicensingSWIGJNI.ILicensing_HasBusinessAccountLicense(this.swigCPtr, this);
    }

    public boolean HasBusinessLicense() {
        return ILicensingSWIGJNI.ILicensing_HasBusinessLicense(this.swigCPtr, this);
    }

    public boolean HasDexEssentialsLicense() {
        return ILicensingSWIGJNI.ILicensing_HasDexEssentialsLicense(this.swigCPtr, this);
    }

    public boolean HasRemoteAccessLicense() {
        return ILicensingSWIGJNI.ILicensing_HasRemoteAccessLicense(this.swigCPtr, this);
    }

    public boolean HasTVOneAdvancedLicense() {
        return ILicensingSWIGJNI.ILicensing_HasTVOneAdvancedLicense(this.swigCPtr, this);
    }

    public boolean HasTVOneEnterpriseLicense() {
        return ILicensingSWIGJNI.ILicensing_HasTVOneEnterpriseLicense(this.swigCPtr, this);
    }

    public boolean HasTVOneFamilyLicense() {
        return ILicensingSWIGJNI.ILicensing_HasTVOneFamilyLicense(this.swigCPtr, this);
    }

    public boolean HasTensorLicense() {
        return ILicensingSWIGJNI.ILicensing_HasTensorLicense(this.swigCPtr, this);
    }

    public boolean HasTensorProOrUnlimitedLicense() {
        return ILicensingSWIGJNI.ILicensing_HasTensorProOrUnlimitedLicense(this.swigCPtr, this);
    }

    public boolean IsAccountTrialExpired() {
        return ILicensingSWIGJNI.ILicensing_IsAccountTrialExpired(this.swigCPtr, this);
    }

    public boolean IsAccountTrialValid() {
        return ILicensingSWIGJNI.ILicensing_IsAccountTrialValid(this.swigCPtr, this);
    }

    public boolean IsMarketingTrialLicense() {
        return ILicensingSWIGJNI.ILicensing_IsMarketingTrialLicense(this.swigCPtr, this);
    }

    public boolean IsRemoteAccessLicenseOnly() {
        return ILicensingSWIGJNI.ILicensing_IsRemoteAccessLicenseOnly(this.swigCPtr, this);
    }

    public SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvclientlicensing__RemoteAccessLicenseInfo_t RemoteAccessLicense() {
        return new SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvclientlicensing__RemoteAccessLicenseInfo_t(ILicensingSWIGJNI.ILicensing_RemoteAccessLicense(this.swigCPtr, this), false);
    }

    public void SetLicensingAccountConnector(SWIGTYPE_p_tvstd__nnT_tvclientlicensing__ILicensingAccountConnectorPtr_t sWIGTYPE_p_tvstd__nnT_tvclientlicensing__ILicensingAccountConnectorPtr_t) {
        ILicensingSWIGJNI.ILicensing_SetLicensingAccountConnector(this.swigCPtr, this, SWIGTYPE_p_tvstd__nnT_tvclientlicensing__ILicensingAccountConnectorPtr_t.getCPtr(sWIGTYPE_p_tvstd__nnT_tvclientlicensing__ILicensingAccountConnectorPtr_t));
    }

    public void Shutdown() {
        ILicensingSWIGJNI.ILicensing_Shutdown(this.swigCPtr, this);
    }

    public SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvproviderapi__LicenseData__TeamViewerLicenseInfo_t TeamViewerLicenseInfo() {
        return new SWIGTYPE_p_tvobservables__ReadOnlyObservablePropertyT_tvproviderapi__LicenseData__TeamViewerLicenseInfo_t(ILicensingSWIGJNI.ILicensing_TeamViewerLicenseInfo(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ILicensingSWIGJNI.delete_ILicensing(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public enum LicenseUsageLimit {
        NoError(0),
        Warning(1),
        Error(2);

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        LicenseUsageLimit() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static LicenseUsageLimit swigToEnum(int i) {
            LicenseUsageLimit[] licenseUsageLimitArr = (LicenseUsageLimit[]) LicenseUsageLimit.class.getEnumConstants();
            if (i < licenseUsageLimitArr.length && i >= 0) {
                LicenseUsageLimit licenseUsageLimit = licenseUsageLimitArr[i];
                if (licenseUsageLimit.swigValue == i) {
                    return licenseUsageLimit;
                }
            }
            for (LicenseUsageLimit licenseUsageLimit2 : licenseUsageLimitArr) {
                if (licenseUsageLimit2.swigValue == i) {
                    return licenseUsageLimit2;
                }
            }
            hk0.g(ua5.k(i, LicenseUsageLimit.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        LicenseUsageLimit(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        LicenseUsageLimit(LicenseUsageLimit licenseUsageLimit) {
            int i = licenseUsageLimit.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    public enum ServicecampIntegrationState {
        NotAvailable,
        InstanceExists,
        NoInstanceExists;

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        ServicecampIntegrationState() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static ServicecampIntegrationState swigToEnum(int i) {
            ServicecampIntegrationState[] servicecampIntegrationStateArr = (ServicecampIntegrationState[]) ServicecampIntegrationState.class.getEnumConstants();
            if (i < servicecampIntegrationStateArr.length && i >= 0) {
                ServicecampIntegrationState servicecampIntegrationState = servicecampIntegrationStateArr[i];
                if (servicecampIntegrationState.swigValue == i) {
                    return servicecampIntegrationState;
                }
            }
            for (ServicecampIntegrationState servicecampIntegrationState2 : servicecampIntegrationStateArr) {
                if (servicecampIntegrationState2.swigValue == i) {
                    return servicecampIntegrationState2;
                }
            }
            hk0.g(ua5.k(i, ServicecampIntegrationState.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        ServicecampIntegrationState(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        ServicecampIntegrationState(ServicecampIntegrationState servicecampIntegrationState) {
            int i = servicecampIntegrationState.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    public enum UnpaidLicenseState {
        Undefined(0),
        FirstDunningWarning(1),
        SecondDunningWarning(2),
        Blocked(3);

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        UnpaidLicenseState() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static UnpaidLicenseState swigToEnum(int i) {
            UnpaidLicenseState[] unpaidLicenseStateArr = (UnpaidLicenseState[]) UnpaidLicenseState.class.getEnumConstants();
            if (i < unpaidLicenseStateArr.length && i >= 0) {
                UnpaidLicenseState unpaidLicenseState = unpaidLicenseStateArr[i];
                if (unpaidLicenseState.swigValue == i) {
                    return unpaidLicenseState;
                }
            }
            for (UnpaidLicenseState unpaidLicenseState2 : unpaidLicenseStateArr) {
                if (unpaidLicenseState2.swigValue == i) {
                    return unpaidLicenseState2;
                }
            }
            hk0.g(ua5.k(i, UnpaidLicenseState.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        UnpaidLicenseState(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        UnpaidLicenseState(UnpaidLicenseState unpaidLicenseState) {
            int i = unpaidLicenseState.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    public static class BusinessAccountLicenseInfo {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        public BusinessAccountLicenseInfo(SWIGTYPE_p_boost__uuids__uuid sWIGTYPE_p_boost__uuids__uuid, long j, int i, SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t sWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t, boolean z) {
            this(ILicensingSWIGJNI.new_ILicensing_BusinessAccountLicenseInfo(SWIGTYPE_p_boost__uuids__uuid.getCPtr(sWIGTYPE_p_boost__uuids__uuid), j, i, SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t.getCPtr(sWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t), z), true);
        }

        public static long getCPtr(BusinessAccountLicenseInfo businessAccountLicenseInfo) {
            if (businessAccountLicenseInfo == null) {
                return 0L;
            }
            return businessAccountLicenseInfo.swigCPtr;
        }

        public static long swigRelease(BusinessAccountLicenseInfo businessAccountLicenseInfo) {
            if (businessAccountLicenseInfo != null) {
                if (businessAccountLicenseInfo.swigCMemOwn) {
                    long j = businessAccountLicenseInfo.swigCPtr;
                    businessAccountLicenseInfo.swigCMemOwn = false;
                    businessAccountLicenseInfo.delete();
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
                        ILicensingSWIGJNI.delete_ILicensing_BusinessAccountLicenseInfo(j);
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

        public SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t getDeviceIds() {
            long jILicensing_BusinessAccountLicenseInfo_deviceIds_get = ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_deviceIds_get(this.swigCPtr, this);
            if (jILicensing_BusinessAccountLicenseInfo_deviceIds_get == 0) {
                return null;
            }
            return new SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t(jILicensing_BusinessAccountLicenseInfo_deviceIds_get, false);
        }

        public SWIGTYPE_p_boost__uuids__uuid getLicenseId() {
            return new SWIGTYPE_p_boost__uuids__uuid(ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_licenseId_get(this.swigCPtr, this), true);
        }

        public boolean getLocalDeviceActivated() {
            return ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_localDeviceActivated_get(this.swigCPtr, this);
        }

        public long getNumberOfSlots() {
            return ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_numberOfSlots_get(this.swigCPtr, this);
        }

        public int getRemainingMoves() {
            return ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_remainingMoves_get(this.swigCPtr, this);
        }

        public void setDeviceIds(SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t sWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t) {
            ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_deviceIds_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t.getCPtr(sWIGTYPE_p_std__vectorT_tvdyngateid__DyngateID_t));
        }

        public void setLicenseId(SWIGTYPE_p_boost__uuids__uuid sWIGTYPE_p_boost__uuids__uuid) {
            ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_licenseId_set(this.swigCPtr, this, SWIGTYPE_p_boost__uuids__uuid.getCPtr(sWIGTYPE_p_boost__uuids__uuid));
        }

        public void setLocalDeviceActivated(boolean z) {
            ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_localDeviceActivated_set(this.swigCPtr, this, z);
        }

        public void setNumberOfSlots(long j) {
            ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_numberOfSlots_set(this.swigCPtr, this, j);
        }

        public void setRemainingMoves(int i) {
            ILicensingSWIGJNI.ILicensing_BusinessAccountLicenseInfo_remainingMoves_set(this.swigCPtr, this, i);
        }

        public BusinessAccountLicenseInfo(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }
}
