package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gl3 implements k48 {
    public final Set a;
    public final kh7 b;

    public gl3(Set set) {
        g48.n.getClass();
        g48 g48Var = g48.f858o;
        g48Var.getClass();
        bt1.Q(ea2.m, hd2.a(dd2.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), g48Var, this, false);
        this.b = new kh7(new x00(this));
        this.a = set;
    }

    @Override // o.k48
    public final ys0 a() {
        return null;
    }

    @Override // o.k48
    public final Collection b() {
        return (List) this.b.getValue();
    }

    @Override // o.k48
    public final boolean c() {
        return false;
    }

    @Override // o.k48
    public final List getParameters() {
        return ea2.m;
    }

    @Override // o.k48
    public final wy3 h() {
        throw null;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + lv0.t0(this.a, ",", null, null, ek.J, 30) + ']');
    }
}
