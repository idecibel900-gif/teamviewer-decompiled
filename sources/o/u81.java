package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u81 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r81 f2182o;
    public final /* synthetic */ h71 p;

    public /* synthetic */ u81(Function0 function0, r81 r81Var, h71 h71Var, byte b) {
        this.m = b;
        this.n = function0;
        this.f2182o = r81Var;
        this.p = h71Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        h71 h71Var = this.p;
        r81 r81Var = this.f2182o;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                function0.a();
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ra1.X);
                r81Var.b.invoke(h71Var);
                break;
            case 1:
                function0.a();
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(ra1.Y);
                r81Var.c.invoke(h71Var);
                break;
            case 2:
                function0.a();
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(ra1.W);
                r81Var.a.invoke(h71Var);
                break;
            case 3:
                function0.a();
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(ra1.X);
                r81Var.b.invoke(h71Var);
                break;
            case 4:
                function0.a();
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(ra1.Y);
                r81Var.c.invoke(h71Var);
                break;
            case 5:
                function0.a();
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(ra1.Z);
                r81Var.d.invoke(h71Var);
                break;
            case 6:
                function0.a();
                IStatisticsHandler iStatisticsHandler7 = ga7.a;
                ga7.a(ra1.a0);
                r81Var.e.invoke(h71Var);
                break;
            case 7:
                function0.a();
                IStatisticsHandler iStatisticsHandler8 = ga7.a;
                ga7.a(ra1.b0);
                r81Var.f.invoke(h71Var);
                break;
            case 8:
                function0.a();
                IStatisticsHandler iStatisticsHandler9 = ga7.a;
                ga7.a(ra1.Y);
                r81Var.c.invoke(h71Var);
                break;
            case ep1.b /* 9 */:
                function0.a();
                IStatisticsHandler iStatisticsHandler10 = ga7.a;
                ga7.a(ra1.b0);
                r81Var.f.invoke(h71Var);
                break;
            default:
                function0.a();
                IStatisticsHandler iStatisticsHandler11 = ga7.a;
                ga7.a(ra1.W);
                r81Var.a.invoke(h71Var);
                break;
        }
        return f88Var;
    }
}
