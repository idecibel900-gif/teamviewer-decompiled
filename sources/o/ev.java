package o;

import com.teamviewer.appupdatelib.swig.statistics.ApkInstallationSource;
import com.teamviewer.appupdatelib.swig.statistics.AppUpdateStatisticsAction;
import com.teamviewer.appupdatelib.swig.statistics.AppUpdateStatisticsData;
import com.teamviewer.appupdatelib.swig.statistics.IAppUpdateStatistics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ev {
    public static final kh7 a = new kh7(new zq((byte) 9));

    public static void a(dv dvVar) {
        AppUpdateStatisticsAction appUpdateStatisticsAction;
        ApkInstallationSource apkInstallationSource;
        kh7 kh7Var = a;
        if (((IAppUpdateStatistics) kh7Var.getValue()) == null) {
            return;
        }
        ye4.a("AppUpdateStatisticsReporter", "Sending statistics: " + dvVar);
        AppUpdateStatisticsData appUpdateStatisticsData = new AppUpdateStatisticsData();
        switch (dvVar.a.ordinal()) {
            case 0:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.RecommendedUpdateView;
                break;
            case 1:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.RequiredUpdateView;
                break;
            case 2:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateAppClick;
                break;
            case 3:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateCancelClick;
                break;
            case 4:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.ApkDownloadComplete;
                break;
            case 5:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateSuccessView;
                break;
            case 6:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateErrorView;
                break;
            case 7:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateOkClick;
                break;
            case 8:
                appUpdateStatisticsAction = AppUpdateStatisticsAction.UpdateExitAppClick;
                break;
            default:
                gk0.s();
                return;
        }
        appUpdateStatisticsData.setAction(appUpdateStatisticsAction);
        int iOrdinal = dvVar.b.ordinal();
        if (iOrdinal == 0) {
            apkInstallationSource = ApkInstallationSource.PlayStore;
        } else if (iOrdinal == 1) {
            apkInstallationSource = ApkInstallationSource.HuaweiStore;
        } else if (iOrdinal == 2) {
            apkInstallationSource = ApkInstallationSource.XiaomiStore;
        } else if (iOrdinal == 3) {
            apkInstallationSource = ApkInstallationSource.OppoStore;
        } else if (iOrdinal == 4) {
            apkInstallationSource = ApkInstallationSource.VivoStore;
        } else {
            if (iOrdinal != 5) {
                gk0.s();
                return;
            }
            apkInstallationSource = ApkInstallationSource.WebsiteStore;
        }
        appUpdateStatisticsData.setInstallationSource(apkInstallationSource);
        appUpdateStatisticsData.setErrorReason(dvVar.c);
        appUpdateStatisticsData.setIsStoreBuildWithoutStore(dvVar.d);
        ((IAppUpdateStatistics) kh7Var.getValue()).ReportEvent(appUpdateStatisticsData);
    }
}
