package com.teamviewer.teamviewerlib.statistics;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.teamviewer.teamviewerlib.helper.DeviceInfoHelper;
import kotlin.Metadata;
import o.fi7;
import o.im3;
import o.it1;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0083 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/teamviewerlib/statistics/AndroidStartStatistics;", "", "", "manufacturer", "model", "", "majorApiLevel", "minorApiLevel", "", "runsInsideKnoxContainer", "isPlayStoreInstalled", "appFlavor", "isInstantApp", "Lo/f88;", "jniInitStatistics", "(Ljava/lang/String;Ljava/lang/String;IIZZIZ)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class AndroidStartStatistics {
    public static final void a(fi7 fi7Var) {
        int i;
        boolean z;
        String strA = DeviceInfoHelper.a();
        if (strA == null) {
            return;
        }
        String str = Build.MODEL;
        str.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL;
        int majorSdkVersion = i2 < 36 ? i3 / 100000 : Build.getMajorSdkVersion(i3);
        int minorSdkVersion = i2 < 36 ? 0 : Build.getMinorSdkVersion(i2 < 36 ? 100000 * i2 : Build.VERSION.SDK_INT_FULL);
        boolean z2 = true;
        if (!"samsung".equalsIgnoreCase(DeviceInfoHelper.a()) || Process.myUid() < 10000000) {
            z2 = false;
        }
        try {
            PackageManager packageManager = fi7Var.getPackageManager();
            packageManager.getClass();
            it1.G(packageManager, "com.android.vending", 8192);
            int i4 = majorSdkVersion;
            z = true;
            i = i4;
        } catch (PackageManager.NameNotFoundException unused) {
            ye4.a.g("AndroidStartStatistics", "Play store not installed.");
            i = majorSdkVersion;
            z = false;
        }
        jniInitStatistics(strA, str, i, minorSdkVersion, z2, z, im3.n(fi7Var.getPackageName(), "com.teamviewer.quicksupport.market") ? 2 : 0, false);
    }

    private static final native void jniInitStatistics(String manufacturer, String model, int majorApiLevel, int minorApiLevel, boolean runsInsideKnoxContainer, boolean isPlayStoreInstalled, int appFlavor, boolean isInstantApp);
}
