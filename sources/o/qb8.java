package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class qb8 extends tb8 implements if5 {
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final oz3 v;
    public final qb8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb8(xi0 xi0Var, qb8 qb8Var, int i, up upVar, sy4 sy4Var, oz3 oz3Var, boolean z, boolean z2, boolean z3, oz3 oz3Var2, s67 s67Var) {
        super(xi0Var, upVar, sy4Var, oz3Var, s67Var);
        xi0Var.getClass();
        upVar.getClass();
        sy4Var.getClass();
        oz3Var.getClass();
        s67Var.getClass();
        this.r = i;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = oz3Var2;
        this.w = qb8Var == null ? this : qb8Var;
    }

    public qb8 D0(ax2 ax2Var, sy4 sy4Var, int i) {
        up annotations = getAnnotations();
        annotations.getClass();
        oz3 type = getType();
        type.getClass();
        return new qb8(ax2Var, null, i, annotations, sy4Var, type, E0(), this.t, this.u, this.v, s67.h);
    }

    public final boolean E0() {
        return this.s && ((zi0) i()).k() != 2;
    }

    @Override // o.ii1, o.fi1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final xi0 i() {
        fi1 fi1VarI = super.i();
        fi1VarI.getClass();
        return (xi0) fi1VarI;
    }

    @Override // o.ii1, o.gi1, o.fi1
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final qb8 a() {
        qb8 qb8Var = this.w;
        return qb8Var == this ? this : qb8Var.a();
    }

    @Override // o.sb8
    public final u51 H() {
        return null;
    }

    @Override // o.sb8
    public final boolean R() {
        return false;
    }

    @Override // o.ie7
    public final hi1 d(m58 m58Var) {
        m58Var.getClass();
        if (m58Var.a.e()) {
            return this;
        }
        gk0.u();
        return null;
    }

    @Override // o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.f;
        cp1Var.getClass();
        return cp1Var;
    }

    @Override // o.xi0, o.zi0
    public final Collection j() {
        Collection collectionJ = i().j();
        collectionJ.getClass();
        Collection collection = collectionJ;
        ArrayList arrayList = new ArrayList(mv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((qb8) ((xi0) it.next()).J().get(this.r));
        }
        return arrayList;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.p(this, obj);
    }
}
