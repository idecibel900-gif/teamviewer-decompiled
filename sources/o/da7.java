package o;

import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.IGeneralStatisticsSender;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da7 implements gc3 {
    @Override // o.gc3
    public final void a(long j, long j2) {
        IGeneralStatisticsSender.GeneralStatisticsInfoType generalStatisticsInfoType = IGeneralStatisticsSender.GeneralStatisticsInfoType.DynGateID;
        generalStatisticsInfoType.getClass();
        if (NativeLibTvExt.c()) {
            InterProcessGUIConnector.a.jniSetGeneralInfoUInt64(generalStatisticsInfoType.swigValue(), j2);
        }
    }
}
