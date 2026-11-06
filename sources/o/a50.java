package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a50 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f298o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ a50(SupportSession supportSession, fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, int i) {
        this.m = (byte) 4;
        this.q = supportSession;
        this.n = fs4Var;
        this.f298o = function0;
        this.r = function1;
        this.s = function2;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.s;
        Object obj4 = this.r;
        f88 f88Var = f88.a;
        int i = this.p;
        Object obj5 = this.n;
        Object obj6 = this.f298o;
        Object obj7 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                di1.d((bp5) obj7, (yy0) obj6, (k08) obj3, (fs4) obj5, (yy0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lq1.d((fs4) obj5, (dw) obj7, (gw) obj4, (xz2) obj3, (yy0) obj6, (ux2) obj, yo1.Y(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                un4.a((zv0) obj7, (cu4) obj4, (tx6) obj3, (h68) obj5, (yy0) obj6, (ux2) obj, yo1.Y(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                qs1.j((List) obj7, (l33) obj6, (Function1) obj4, (Function0) obj3, (fs4) obj5, (ux2) obj, yo1.Y(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xs1.q((SupportSession) obj7, (fs4) obj5, (Function0) obj6, (Function0) obj4, (Function0) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                n37.c((tf2) obj7, (zv0) obj4, (tx6) obj3, (h68) obj5, (yy0) obj6, (ux2) obj, yo1.Y(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                ck3.l((u18) obj7, (q18) obj6, this.r, this.s, (rl2) obj5, (ux2) obj, iY);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ a50(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.m = b;
        this.q = obj;
        this.f298o = obj2;
        this.r = obj3;
        this.s = obj4;
        this.n = obj5;
        this.p = i;
    }

    public /* synthetic */ a50(Object obj, Object obj2, tx6 tx6Var, h68 h68Var, yy0 yy0Var, int i, byte b) {
        this.m = b;
        this.q = obj;
        this.r = obj2;
        this.s = tx6Var;
        this.n = h68Var;
        this.f298o = yy0Var;
        this.p = i;
    }

    public /* synthetic */ a50(fs4 fs4Var, dw dwVar, gw gwVar, xz2 xz2Var, yy0 yy0Var, int i) {
        this.m = (byte) 1;
        this.n = fs4Var;
        this.q = dwVar;
        this.r = gwVar;
        this.s = xz2Var;
        this.f298o = yy0Var;
        this.p = i;
    }

    public /* synthetic */ a50(bp5 bp5Var, yy0 yy0Var, k08 k08Var, fs4 fs4Var, yy0 yy0Var2, int i) {
        this.m = (byte) 0;
        this.q = bp5Var;
        this.f298o = yy0Var;
        this.s = k08Var;
        this.n = fs4Var;
        this.r = yy0Var2;
        this.p = i;
    }
}
