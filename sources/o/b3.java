package o;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b3 implements k48 {
    public final /* synthetic */ eq1 a;

    public b3(eq1 eq1Var) {
        this.a = eq1Var;
    }

    @Override // o.k48
    public final ys0 a() {
        return this.a;
    }

    @Override // o.k48
    public final Collection b() {
        Collection collectionB = this.a.F0().o0().b();
        collectionB.getClass();
        return collectionB;
    }

    @Override // o.k48
    public final boolean c() {
        return true;
    }

    @Override // o.k48
    public final List getParameters() {
        List list = this.a.B;
        if (list != null) {
            return list;
        }
        im3.e0("typeConstructorParameters");
        throw null;
    }

    @Override // o.k48
    public final wy3 h() {
        return bp1.e(this.a);
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
