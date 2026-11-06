package o;

import androidx.compose.material3.internal.ripple.RippleNode;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lk extends RippleNode {
    public wd6 O;
    public xd6 P;

    @Override // o.es4
    public final void N0() {
        wd6 wd6Var = this.O;
        if (wd6Var != null) {
            this.P = null;
            yo1.H(this);
            a65 a65Var = wd6Var.p;
            xd6 xd6Var = (xd6) ((LinkedHashMap) a65Var.n).get(this);
            if (xd6Var != null) {
                xd6Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) a65Var.n;
                xd6 xd6Var2 = (xd6) linkedHashMap.get(this);
                if (xd6Var2 != null) {
                }
                linkedHashMap.remove(this);
                wd6Var.f2400o.add(xd6Var);
            }
        }
    }
}
