package o;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e70 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pw2 f688o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ e70(Function0 function0, Context context, xy6 xy6Var, me1 me1Var, Function0 function1) {
        this.n = function0;
        this.p = context;
        this.q = xy6Var;
        this.r = me1Var;
        this.f688o = function1;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        pw2 pw2Var = this.f688o;
        Object obj7 = this.n;
        byte b2 = 0;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj7;
                Context context = (Context) obj6;
                xy6 xy6Var = (xy6) obj5;
                me1 me1Var = (me1) obj4;
                Function0 function1 = (Function0) pw2Var;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    bw bwVar = iq8.c;
                    w50 w50Var = xz2.B;
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 54);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
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
                    db8.c(null, ux2Var, 6);
                    fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zF = ux2Var.f(function0) | ux2Var.h(context);
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (zF || objK == awVar) {
                        objK = new b20(function0, context);
                        ux2Var.g0(objK);
                    }
                    m77.g((Function0) objK, fs4VarF2, null, false, "TVTA-settings-biometrics-SettingsButton", null, ka0.c, ux2Var, 1597488, 44);
                    fs4 fs4VarF3 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zH = ux2Var.h(me1Var) | ux2Var.f(xy6Var) | ux2Var.f(function1);
                    Object objK2 = ux2Var.K();
                    if (zH || objK2 == awVar) {
                        objK2 = new f70(me1Var, xy6Var, function1, b2);
                        ux2Var.g0(objK2);
                    }
                    v67.d((Function0) objK2, fs4VarF3, null, false, "TVTA-settings-biometrics-cancelButton", ka0.d, ux2Var, 221232, 12);
                    ux2Var.p(true);
                }
                break;
            default:
                a17 a17Var = (a17) obj7;
                yy0 yy0Var = (yy0) pw2Var;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) obj6;
                he heVar = (he) obj5;
                sb1 sb1Var = (sb1) obj4;
                ab0 ab0Var = (ab0) obj;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ux2Var2.f(ab0Var) ? 4 : 2;
                }
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    ux2Var2.Q();
                } else {
                    ((v61) a17Var).h(ab0Var.b);
                    yy0Var.d(new r46(ab0Var, asyncImagePainter, heVar, sb1Var), ux2Var2, 0);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ e70(a17 a17Var, yy0 yy0Var, AsyncImagePainter asyncImagePainter, he heVar, sb1 sb1Var) {
        this.n = a17Var;
        this.f688o = yy0Var;
        this.p = asyncImagePainter;
        this.q = heVar;
        this.r = sb1Var;
    }
}
