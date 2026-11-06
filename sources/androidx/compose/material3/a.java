package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import o.ae6;
import o.ce6;
import o.cu4;
import o.de6;
import o.ee6;
import o.f88;
import o.fe6;
import o.ge6;
import o.he6;
import o.ie6;
import o.je6;
import o.ke6;
import o.lk;
import o.me6;
import o.mw4;
import o.ne6;
import o.nv1;
import o.rn4;
import o.un4;
import o.vd6;
import o.xk0;
import o.yd6;
import o.z38;
import o.zd6;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ DelegatingThemeAwareRippleNode n;

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.n = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        zu1 fe6Var;
        byte b = this.m;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.n;
        switch (b) {
            case 0:
                vd6 vd6Var = (vd6) xk0.q(delegatingThemeAwareRippleNode, zd6.b);
                ae6 ae6Var = delegatingThemeAwareRippleNode.J;
                if (vd6Var == null) {
                    if (ae6Var != null) {
                        delegatingThemeAwareRippleNode.V0(ae6Var);
                    }
                    delegatingThemeAwareRippleNode.J = null;
                } else if (ae6Var == null) {
                    b bVar = new b(delegatingThemeAwareRippleNode, (byte) 0);
                    a aVar = new a(delegatingThemeAwareRippleNode, new b(delegatingThemeAwareRippleNode, (byte) 2), new b(delegatingThemeAwareRippleNode, (byte) 1));
                    mw4 mw4Var = delegatingThemeAwareRippleNode.C;
                    boolean z = delegatingThemeAwareRippleNode.D;
                    float f = delegatingThemeAwareRippleNode.E;
                    z38 z38Var = yd6.a;
                    ae6 ae6Var2 = new ae6();
                    ae6Var2.U0(new lk(mw4Var, z, f, bVar, aVar));
                    delegatingThemeAwareRippleNode.U0(ae6Var2);
                    delegatingThemeAwareRippleNode.J = ae6Var2;
                }
                return f88.a;
            default:
                cu4 cu4Var = ((rn4) xk0.q(delegatingThemeAwareRippleNode, un4.a)).d;
                ne6 ne6Var = (ne6) xk0.q(delegatingThemeAwareRippleNode, zd6.a);
                nv1 je6Var = delegatingThemeAwareRippleNode.F ? new je6() : ie6.e;
                if (delegatingThemeAwareRippleNode.G) {
                    me6 me6Var = ne6Var.a;
                    fe6Var = new fe6();
                } else {
                    fe6Var = ee6.d;
                }
                return new ke6(je6Var, fe6Var, delegatingThemeAwareRippleNode.H ? new he6() : ge6.s, delegatingThemeAwareRippleNode.I ? new de6((byte) 24) : ce6.e);
        }
    }

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, b bVar, b bVar2) {
        this.n = delegatingThemeAwareRippleNode;
    }
}
