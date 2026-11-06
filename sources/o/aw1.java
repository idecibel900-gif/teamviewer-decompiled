package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hz1 n;

    public /* synthetic */ aw1(hz1 hz1Var, byte b) {
        this.m = b;
        this.n = hz1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        mv1 mv1Var = null;
        hz1 hz1Var = this.n;
        switch (b) {
            case 0:
                hz1Var.x.k(null);
                break;
            case 1:
                hz1Var.x.k(null);
                break;
            case 2:
                l97 l97Var = hz1Var.r;
                j35 j35Var = (j35) l97Var.getValue();
                j35Var.getClass();
                l97Var.l(null, j35.a(j35Var, null, false, false, false, 15));
                break;
            case 3:
                hz1Var.x.k(null);
                break;
            default:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ra1.u);
                l97 l97Var2 = hz1Var.x;
                ov1 ov1Var = ((lr0) hz1Var.t.getValue()).b;
                ov1Var.getClass();
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal == 0) {
                    mv1Var = mv1.m;
                } else if (iOrdinal == 1) {
                    mv1Var = mv1.n;
                }
                l97Var2.k(mv1Var);
                break;
        }
        return f88Var;
    }
}
