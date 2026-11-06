package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k23 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ u23 n;

    public /* synthetic */ k23(u23 u23Var, byte b) {
        this.m = b;
        this.n = u23Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        u23 u23Var = this.n;
        switch (b) {
            case 0:
                u23Var.c.a();
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(g02.I);
                u23Var.g.a();
                break;
            default:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(g02.H);
                u23Var.b.a();
                break;
        }
        return f88Var;
    }
}
