package com.teamviewer.commonviewmodel.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCategory {
    UnknownErrorCategory,
    GenericErrorCategory,
    BuddyErrorCategory,
    BoostErrorCodeCategory,
    PListConnectErrorCategory,
    AccountErrorCategory,
    WakeOnLanErrorCategory,
    PLPropertiesDialogErrorCategory,
    DeviceManagementErrorCategory,
    ItemMoveErrorCategory,
    BackupInstallationManagerCategory,
    MonitoringInstallationManagerCategory,
    MonitoringInstallationResultCategory,
    DisplayErrorMessageBoxCategory,
    AccountInvitationErrorCategory,
    BackupInstallationManagedDeviceCategory,
    AccountSignupErrorCategory,
    ContactlistErrorCategory,
    MobileWakeErrorCategory,
    RemoteAccessActivationResultCategory,
    RemoteAccessDeactivationResultCategory,
    LicenseErrorCategory,
    ContactlistAddItemErrorCategory,
    AssignmentByDeviceErrorCategory,
    CreateServiceCaseErrorCategory;

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ErrorCategory() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ErrorCategory swigToEnum(int i) {
        ErrorCategory[] errorCategoryArr = (ErrorCategory[]) ErrorCategory.class.getEnumConstants();
        if (i < errorCategoryArr.length && i >= 0) {
            ErrorCategory errorCategory = errorCategoryArr[i];
            if (errorCategory.swigValue == i) {
                return errorCategory;
            }
        }
        for (ErrorCategory errorCategory2 : errorCategoryArr) {
            if (errorCategory2.swigValue == i) {
                return errorCategory2;
            }
        }
        hk0.g(ua5.k(i, ErrorCategory.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ErrorCategory(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ErrorCategory(ErrorCategory errorCategory) {
        int i = errorCategory.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
