package com.teamviewer.appupdatelib.swig.statistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum AppUpdateStatisticsAction {
    Undefined(0),
    RecommendedUpdateView(1),
    RequiredUpdateView(2),
    UpdateAppClick(3),
    UpdateCancelClick(4),
    ApkDownloadComplete(5),
    UpdateSuccessView(6),
    UpdateErrorView(7),
    UpdateOkClick(8),
    UpdateExitAppClick(9);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    AppUpdateStatisticsAction() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static AppUpdateStatisticsAction swigToEnum(int i) {
        AppUpdateStatisticsAction[] appUpdateStatisticsActionArr = (AppUpdateStatisticsAction[]) AppUpdateStatisticsAction.class.getEnumConstants();
        if (i < appUpdateStatisticsActionArr.length && i >= 0) {
            AppUpdateStatisticsAction appUpdateStatisticsAction = appUpdateStatisticsActionArr[i];
            if (appUpdateStatisticsAction.swigValue == i) {
                return appUpdateStatisticsAction;
            }
        }
        for (AppUpdateStatisticsAction appUpdateStatisticsAction2 : appUpdateStatisticsActionArr) {
            if (appUpdateStatisticsAction2.swigValue == i) {
                return appUpdateStatisticsAction2;
            }
        }
        hk0.g(ua5.k(i, AppUpdateStatisticsAction.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    AppUpdateStatisticsAction(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AppUpdateStatisticsAction(AppUpdateStatisticsAction appUpdateStatisticsAction) {
        int i = appUpdateStatisticsAction.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
