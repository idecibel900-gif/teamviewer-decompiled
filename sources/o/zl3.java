package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zl3 implements k48, l48 {
    public oz3 a;
    public final LinkedHashSet b;
    public final int c;

    public zl3(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // o.k48
    public final ys0 a() {
        return null;
    }

    @Override // o.k48
    public final Collection b() {
        return this.b;
    }

    @Override // o.k48
    public final boolean c() {
        return false;
    }

    public final g07 e() {
        g48.n.getClass();
        return bt1.R(g48.f858o, this, ea2.m, false, x67.h("member scope for intersection type", this.b), new t(this, (byte) 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl3)) {
            return false;
        }
        return this.b.equals(((zl3) obj).b);
    }

    public final String f(Function1 function1) {
        function1.getClass();
        byte b = 1;
        return lv0.t0(lv0.J0(this.b, new ix0(function1, b)), " & ", "{", "}", new kz2(function1, b), 24);
    }

    @Override // o.k48
    public final List getParameters() {
        return ea2.m;
    }

    @Override // o.k48
    public final wy3 h() {
        wy3 wy3VarH = ((oz3) this.b.iterator().next()).o0().h();
        wy3VarH.getClass();
        return wy3VarH;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return f(ek.K);
    }
}
