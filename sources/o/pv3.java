package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class pv3 implements qt3 {
    public static final /* synthetic */ fw3[] r;
    public final vt3 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mv3 f1780o;
    public final u86 p;
    public final u86 q = et1.F(null, new nv3(this, 0));

    static {
        x86 x86Var = w86.a;
        r = new fw3[]{x86Var.g(new gu5(x86Var.b(pv3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), x86Var.g(new gu5(x86Var.b(pv3.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public pv3(vt3 vt3Var, int i, mv3 mv3Var, Function0 function0) {
        this.m = vt3Var;
        this.n = i;
        this.f1780o = mv3Var;
        this.p = et1.F(null, function0);
    }

    public final if5 a() {
        fw3 fw3Var = r[0];
        Object objA = this.p.a();
        objA.getClass();
        return (if5) objA;
    }

    public final qw3 d() {
        oz3 type = a().getType();
        type.getClass();
        return new qw3(type, new nv3(this, (byte) 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pv3)) {
            return false;
        }
        pv3 pv3Var = (pv3) obj;
        return this.m.equals(pv3Var.m) && this.n == pv3Var.n;
    }

    @Override // o.qt3
    public final List getAnnotations() {
        fw3 fw3Var = r[1];
        Object objA = this.q.a();
        objA.getClass();
        return (List) objA;
    }

    public final String getName() {
        if5 if5VarA = a();
        qb8 qb8Var = if5VarA instanceof qb8 ? (qb8) if5VarA : null;
        if (qb8Var != null && !qb8Var.i().x()) {
            sy4 name = qb8Var.getName();
            name.getClass();
            if (!name.n) {
                return name.b();
            }
        }
        return null;
    }

    public final boolean h() {
        if5 if5VarA = a();
        qb8 qb8Var = if5VarA instanceof qb8 ? (qb8) if5VarA : null;
        if (qb8Var != null) {
            return bp1.a(qb8Var);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + (this.m.hashCode() * 31);
    }

    public final boolean i() {
        if5 if5VarA = a();
        return (if5VarA instanceof qb8) && ((qb8) if5VarA).v != null;
    }

    public final String toString() {
        String strB;
        qo1 qo1Var = z86.a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f1780o.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                gk0.s();
                return null;
            }
            sb.append("parameter #" + this.n + ' ' + getName());
        }
        sb.append(" of ");
        zi0 zi0VarW = this.m.w();
        if (zi0VarW instanceof bu5) {
            strB = z86.c((bu5) zi0VarW);
        } else {
            if (!(zi0VarW instanceof xw2)) {
                hk0.f(zi0VarW, "Illegal callable: ");
                return null;
            }
            strB = z86.b((xw2) zi0VarW);
        }
        sb.append(strB);
        return sb.toString();
    }
}
