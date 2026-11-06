package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ov1 f2649o;

    public /* synthetic */ yw1(Function1 function1, ov1 ov1Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f2649o = ov1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        ov1 ov1Var = this.f2649o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(ov1Var);
                break;
            default:
                function1.invoke(ov1Var);
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal == 0) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(f43.r);
                } else if (iOrdinal == 1) {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(ra1.t);
                }
                break;
        }
        return f88Var;
    }
}
