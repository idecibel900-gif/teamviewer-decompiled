package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pi3 {
    public static final /* synthetic */ int a = 0;

    static {
        ht2 ht2Var = new ht2("kotlin.jvm.JvmInline");
        ht2Var.e();
        sy4 sy4VarF = ht2Var.f();
        sy4VarF.getClass();
        ht2.j(sy4VarF).d();
    }

    public static final boolean a(zi0 zi0Var) {
        jb8 jb8VarV0;
        if (!(zi0Var instanceof eu5)) {
            return false;
        }
        bu5 bu5Var = ((eu5) zi0Var).t;
        if (bu5Var.S() != null) {
            return false;
        }
        fi1 fi1VarI = bu5Var.i();
        ns4 ns4Var = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
        if (ns4Var == null || (jb8VarV0 = ns4Var.v0()) == null) {
            return false;
        }
        sy4 name = bu5Var.getName();
        name.getClass();
        return jb8VarV0.a(name);
    }

    public static final boolean b(fi1 fi1Var) {
        fi1Var.getClass();
        return (fi1Var instanceof ns4) && (((ns4) fi1Var).v0() instanceof oi3);
    }

    public static final boolean c(fi1 fi1Var) {
        return (fi1Var instanceof ns4) && (((ns4) fi1Var).v0() instanceof su4);
    }

    public static final boolean d(sb8 sb8Var) {
        if (sb8Var.S() != null) {
            return false;
        }
        fi1 fi1VarI = sb8Var.i();
        sy4 sy4Var = null;
        ns4 ns4Var = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
        if (ns4Var != null) {
            int i = bp1.a;
            jb8 jb8VarV0 = ns4Var.v0();
            oi3 oi3Var = jb8VarV0 instanceof oi3 ? (oi3) jb8VarV0 : null;
            if (oi3Var != null) {
                sy4Var = oi3Var.a;
            }
        }
        return im3.n(sy4Var, sb8Var.getName());
    }

    public static final boolean e(fi1 fi1Var) {
        return b(fi1Var) || c(fi1Var);
    }

    public static final boolean f(oz3 oz3Var) {
        oz3Var.getClass();
        ys0 ys0VarA = oz3Var.o0().a();
        return (ys0VarA == null || !c(ys0VarA) || p58.e(oz3Var)) ? false : true;
    }

    public static final g07 g(oz3 oz3Var) {
        ys0 ys0VarA = oz3Var.o0().a();
        ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
        if (ns4Var != null) {
            int i = bp1.a;
            jb8 jb8VarV0 = ns4Var.v0();
            oi3 oi3Var = jb8VarV0 instanceof oi3 ? (oi3) jb8VarV0 : null;
            if (oi3Var != null) {
                return (g07) oi3Var.b;
            }
        }
        return null;
    }
}
