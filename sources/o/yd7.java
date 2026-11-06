package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd7 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ yd7(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                function0.a();
                break;
            case 1:
                function0.a();
                break;
            case 2:
                function0.a();
                break;
            case 3:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.A);
                function0.a();
                break;
            case 4:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(q31.v);
                function0.a();
                break;
            case 5:
                function0.a();
                break;
            case 6:
                function0.a();
                break;
            case 7:
                function0.a();
                break;
            default:
                function0.a();
                break;
        }
        return f88Var;
    }
}
