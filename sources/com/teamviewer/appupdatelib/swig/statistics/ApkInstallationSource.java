package com.teamviewer.appupdatelib.swig.statistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum ApkInstallationSource {
    Unknown(0),
    PlayStore(1),
    HuaweiStore(2),
    XiaomiStore(3),
    OppoStore(4),
    VivoStore(5),
    WebsiteStore(6);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    ApkInstallationSource() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static ApkInstallationSource swigToEnum(int i) {
        ApkInstallationSource[] apkInstallationSourceArr = (ApkInstallationSource[]) ApkInstallationSource.class.getEnumConstants();
        if (i < apkInstallationSourceArr.length && i >= 0) {
            ApkInstallationSource apkInstallationSource = apkInstallationSourceArr[i];
            if (apkInstallationSource.swigValue == i) {
                return apkInstallationSource;
            }
        }
        for (ApkInstallationSource apkInstallationSource2 : apkInstallationSourceArr) {
            if (apkInstallationSource2.swigValue == i) {
                return apkInstallationSource2;
            }
        }
        hk0.g(ua5.k(i, ApkInstallationSource.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    ApkInstallationSource(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ApkInstallationSource(ApkInstallationSource apkInstallationSource) {
        int i = apkInstallationSource.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
