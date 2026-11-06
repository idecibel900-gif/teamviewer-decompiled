package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a43 implements Function0 {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ me1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f293o;
    public final /* synthetic */ l33 p;
    public final /* synthetic */ w44 q;
    public final /* synthetic */ int r;

    public a43(boolean z, me1 me1Var, Function1 function1, l33 l33Var, w44 w44Var, int i) {
        this.m = z;
        this.n = me1Var;
        this.f293o = function1;
        this.p = l33Var;
        this.q = w44Var;
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        if (this.m) {
            im3.R(this.n, null, null, new fa1(this.q, this.r, null, (byte) 2), 3);
        }
        this.f293o.invoke(this.p);
        IStatisticsHandler iStatisticsHandler = ga7.a;
        ga7.a(f43.q);
        return f88.a;
    }
}
