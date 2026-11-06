package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ me1 f876o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ w44 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ga1(boolean z, me1 me1Var, Function1 function1, Object obj, w44 w44Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f876o = me1Var;
        this.p = function1;
        this.s = obj;
        this.q = w44Var;
        this.r = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.s;
        Function1 function1 = this.p;
        int i = this.r;
        w44 w44Var = this.q;
        me1 me1Var = this.f876o;
        boolean z = this.n;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                if (z) {
                    im3.R(me1Var, null, null, new fa1(w44Var, i, null, (byte) 0), 3);
                }
                function1.invoke((h71) obj2);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ra1.s);
                break;
            default:
                ((Number) obj).longValue();
                if (z) {
                    im3.R(me1Var, null, null, new fa1(w44Var, i, null, (byte) 1), 3);
                }
                function1.invoke((ns1) obj2);
                break;
        }
        return f88Var;
    }
}
