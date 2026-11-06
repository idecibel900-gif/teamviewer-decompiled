package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t81 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r81 f2089o;
    public final /* synthetic */ h71 p;

    public /* synthetic */ t81(Function1 function1, r81 r81Var, h71 h71Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f2089o = r81Var;
        this.p = h71Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        h71 h71Var = this.p;
        r81 r81Var = this.f2089o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(Boolean.TRUE);
                r81Var.g.invoke(h71Var);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ra1.V);
                break;
            case 1:
                function1.invoke(Boolean.FALSE);
                r81Var.h.invoke(h71Var);
                break;
            default:
                function1.invoke(Boolean.FALSE);
                r81Var.h.invoke(h71Var);
                break;
        }
        return f88Var;
    }
}
