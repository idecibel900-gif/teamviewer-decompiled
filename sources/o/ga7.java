package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.statistics.StatisticsEvent;
import com.teamviewer.teamviewerlib.swig.statistics.StatisticsHandlerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ga7 {
    public static final IStatisticsHandler a = StatisticsHandlerFactory.GetStatisticsHandler();

    public static void a(q93 q93Var) {
        q93Var.getClass();
        String strA = q93Var.a();
        String strE = q93Var.e();
        String value = q93Var.getValue();
        StringBuilder sbO = e41.o("Sending event - category: ", strA, ", action: ", strE, ", value: ");
        sbO.append(value);
        ye4.a.b("RemoteControlViewLibStatistics", sbO.toString());
        a.ReportEvent(new StatisticsEvent(q93Var.getType(), q93Var.c(), q93Var.a(), q93Var.e(), q93Var.getValue()));
    }
}
