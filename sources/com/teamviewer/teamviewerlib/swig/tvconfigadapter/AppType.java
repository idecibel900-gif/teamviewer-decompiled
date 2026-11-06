package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum AppType {
    RemoteControl(0),
    QuickSupport(1),
    Host(2),
    Pilot(3),
    PilotLite(4),
    OemAddon(5),
    UniversalAddon(6);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    AppType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static AppType swigToEnum(int i) {
        AppType[] appTypeArr = (AppType[]) AppType.class.getEnumConstants();
        if (i < appTypeArr.length && i >= 0) {
            AppType appType = appTypeArr[i];
            if (appType.swigValue == i) {
                return appType;
            }
        }
        for (AppType appType2 : appTypeArr) {
            if (appType2.swigValue == i) {
                return appType2;
            }
        }
        hk0.g(ua5.k(i, AppType.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    AppType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AppType(AppType appType) {
        int i = appType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
