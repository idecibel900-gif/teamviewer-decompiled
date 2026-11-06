package o;

import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;

/* JADX INFO: loaded from: classes.dex */
public final class fa7 {
    public static final da7 b = new da7();
    public final int a;

    public fa7(int i) {
        this.a = i;
    }

    public final void a(ISessionStatisticsSender.SessionStatisticsInfoType sessionStatisticsInfoType, boolean z) {
        sessionStatisticsInfoType.getClass();
        if (NativeLibTvExt.c()) {
            InterProcessGUIConnector.a.jniSetSessionInfoBoolean(this.a, sessionStatisticsInfoType.swigValue(), z);
        }
    }
}
