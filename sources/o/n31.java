package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ i31 n;

    public /* synthetic */ n31(i31 i31Var, byte b) {
        this.m = b;
        this.n = i31Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        i31 i31Var = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.u);
                i31Var.k.a();
                break;
            case 1:
                i31Var.a.a();
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(q31.F);
                break;
            default:
                Function0 function0 = i31Var.m;
                if (function0 != null) {
                    function0.a();
                }
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(q31.G);
                break;
        }
        return f88Var;
    }
}
