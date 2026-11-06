package o;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class qw3 implements ow3 {
    public static final /* synthetic */ fw3[] q;
    public final oz3 m;
    public final u86 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u86 f1875o;
    public final u86 p;

    static {
        x86 x86Var = w86.a;
        q = new fw3[]{x86Var.g(new gu5(x86Var.b(qw3.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), x86Var.g(new gu5(x86Var.b(qw3.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public qw3(oz3 oz3Var, Function0 function0) {
        oz3Var.getClass();
        this.m = oz3Var;
        u86 u86Var = function0 instanceof u86 ? (u86) function0 : null;
        this.n = u86Var == null ? function0 != null ? et1.F(null, function0) : null : u86Var;
        this.f1875o = et1.F(null, new pw3(this, (byte) 0));
        this.p = et1.F(null, new e3((byte) 15, this, function0, false));
    }

    public final ju3 a(oz3 oz3Var) {
        oz3 oz3VarB;
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA instanceof ns4) {
            Class clsJ = pa8.j((ns4) ys0VarA);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (p58.e(oz3Var)) {
                        return new eu3(clsJ);
                    }
                    Class cls = (Class) p76.b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new eu3(clsJ);
                }
                h58 h58Var = (h58) lv0.H0(oz3Var.m0());
                if (h58Var == null || (oz3VarB = h58Var.b()) == null) {
                    return new eu3(clsJ);
                }
                ju3 ju3VarA = a(oz3VarB);
                if (ju3VarA != null) {
                    return new eu3(Array.newInstance((Class<?>) et1.z(wo1.J(ju3VarA)), 0).getClass());
                }
                hk0.q(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else {
            if (ys0VarA instanceof d58) {
                return new rw3(null, (d58) ys0VarA);
            }
            if (ys0VarA instanceof eq1) {
                throw new e55("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final List d() {
        fw3 fw3Var = q[1];
        Object objA = this.p.a();
        objA.getClass();
        return (List) objA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qw3)) {
            return false;
        }
        qw3 qw3Var = (qw3) obj;
        return im3.n(this.m, qw3Var.m) && im3.n(h(), qw3Var.h()) && d().equals(qw3Var.d());
    }

    @Override // o.qt3
    public final List getAnnotations() {
        throw null;
    }

    public final ju3 h() {
        fw3 fw3Var = q[0];
        return (ju3) this.f1875o.a();
    }

    public final int hashCode() {
        int iHashCode = this.m.hashCode() * 31;
        ju3 ju3VarH = h();
        return d().hashCode() + ((iHashCode + (ju3VarH != null ? ju3VarH.hashCode() : 0)) * 31);
    }

    public final String toString() {
        qo1 qo1Var = z86.a;
        oz3 oz3Var = this.m;
        oz3Var.getClass();
        return z86.a.X(oz3Var);
    }
}
