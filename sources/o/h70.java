package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h70 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pw2 f953o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h70(int i, Function1 function1, h71 h71Var, r81 r81Var, fs4 fs4Var, boolean z, boolean z2) {
        this.r = h71Var;
        this.n = z;
        this.f953o = function1;
        this.p = fs4Var;
        this.q = z2;
        this.s = r81Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.s;
        pw2 pw2Var = this.f953o;
        Object obj4 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pm8.c(this.n, this.q, (String) obj4, (Function1) pw2Var, (Function1) obj3, this.p, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uf0.c(yo1.Y(1), (Function1) pw2Var, (h71) obj4, (r81) obj3, (ux2) obj, this.p, this.n, this.q);
                break;
            default:
                xg3 xg3Var = (xg3) obj4;
                Function0 function0 = (Function0) pw2Var;
                yy0 yy0Var = (yy0) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(g68.z(this.p, this.n, null, xg3Var, this.q, new pe6(4), function0), 1.0f);
                    kw0 kw0VarA = iw0.a(iq8.e, xz2.B, ux2Var, 54);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yy0Var.d(lw0.a, ux2Var, 6);
                    ux2Var.p(true);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ h70(fs4 fs4Var, boolean z, androidx.compose.material3.c cVar, boolean z2, Function0 function0, yy0 yy0Var) {
        this.p = fs4Var;
        this.n = z;
        this.r = cVar;
        this.q = z2;
        this.f953o = function0;
        this.s = yy0Var;
    }

    public /* synthetic */ h70(boolean z, boolean z2, String str, Function1 function1, Function1 function2, fs4 fs4Var, int i) {
        this.n = z;
        this.q = z2;
        this.r = str;
        this.f953o = function1;
        this.s = function2;
        this.p = fs4Var;
    }
}
