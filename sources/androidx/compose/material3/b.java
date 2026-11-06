package androidx.compose.material3;

import o.rn4;
import o.rv0;
import o.un4;
import o.vd6;
import o.wa1;
import o.xk0;
import o.xv0;
import o.zd6;

/* JADX INFO: loaded from: classes.dex */
public final class b implements xv0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DelegatingThemeAwareRippleNode b;

    public /* synthetic */ b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, byte b) {
        this.a = b;
        this.b = delegatingThemeAwareRippleNode;
    }

    @Override // o.xv0
    public final long a() {
        byte b = this.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.b;
        switch (b) {
            case 0:
                long jA = delegatingThemeAwareRippleNode.color.a();
                if (jA != 16) {
                    return jA;
                }
                vd6 vd6Var = (vd6) xk0.q(delegatingThemeAwareRippleNode, zd6.b);
                if (vd6Var != null) {
                    long j = vd6Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((rv0) xk0.q(delegatingThemeAwareRippleNode, wa1.a)).a;
            case 1:
                return ((rn4) xk0.q(delegatingThemeAwareRippleNode, un4.a)).a.g;
            default:
                return ((rn4) xk0.q(delegatingThemeAwareRippleNode, un4.a)).a.f;
        }
    }
}
