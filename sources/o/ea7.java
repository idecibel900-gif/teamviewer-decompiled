package o;

import android.graphics.Point;
import android.os.Build;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.IGeneralStatisticsSender;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ea7 {
    public static void a(fi7 fi7Var) {
        Settings settingsN = Settings.i.n();
        settingsN.g(fa7.b);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.DynGateID, Settings.e().ToLong());
        b(IGeneralStatisticsSender.GeneralStatisticsInfoType.AndroidModel, Build.MODEL);
        Point pointT = new j93(fi7Var).T();
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.LocalScreenWidth, pointT.x);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.LocalScreenHeight, pointT.y);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.VersionMajor, 15L);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.VersionMinor, 83L);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.VersionBuild, 298L);
        c(IGeneralStatisticsSender.GeneralStatisticsInfoType.WindowsVersion, settingsN.b);
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        if (country.length() >= 2) {
            b(IGeneralStatisticsSender.GeneralStatisticsInfoType.WindowsCountry, country.substring(0, 2));
        } else {
            b(IGeneralStatisticsSender.GeneralStatisticsInfoType.WindowsCountry, "");
            ye4.c("StatisticManager", "getCountry in locale not set - device bug - please set default language");
        }
        String language = locale.getLanguage();
        if (language.length() >= 2) {
            b(IGeneralStatisticsSender.GeneralStatisticsInfoType.WindowsLanguage, language.substring(0, 2));
        } else {
            b(IGeneralStatisticsSender.GeneralStatisticsInfoType.WindowsLanguage, "");
            ye4.c("StatisticManager", "getLanguage in locale not set - device bug - please set default language");
        }
    }

    public static void b(IGeneralStatisticsSender.GeneralStatisticsInfoType generalStatisticsInfoType, String str) {
        generalStatisticsInfoType.getClass();
        if (NativeLibTvExt.c()) {
            InterProcessGUIConnector.a.jniSetGeneralInfoString(generalStatisticsInfoType.swigValue(), str);
        }
    }

    public static void c(IGeneralStatisticsSender.GeneralStatisticsInfoType generalStatisticsInfoType, long j) {
        generalStatisticsInfoType.getClass();
        if (NativeLibTvExt.c()) {
            InterProcessGUIConnector.a.jniSetGeneralInfoUInt64(generalStatisticsInfoType.swigValue(), j);
        }
    }
}
