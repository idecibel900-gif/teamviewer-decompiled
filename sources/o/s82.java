package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class s82 {
    public static final z38 a;
    public static final z38 b;
    public static final z38 c;

    static {
        jf1 jf1Var = new jf1(0.4f, 0.0f, 0.6f, 1.0f);
        a = new z38(120, 0, q72.a);
        b = new z38(150, 0, jf1Var);
        c = new z38(120, 0, jf1Var);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 o.z38) = (r1v0 o.z38), (r1v0 o.z38), (r1v0 o.z38), (r1v4 o.z38), (r1v4 o.z38), (r1v4 o.z38), (r1v4 o.z38) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(km kmVar, float f, jl3 jl3Var, jl3 jl3Var2, jc1 jc1Var) {
        z38 z38Var;
        z38 z38Var2 = null;
        if (jl3Var2 != null) {
            boolean z = jl3Var2 instanceof yr5;
            z38Var = a;
            if (z || (jl3Var2 instanceof g52) || (jl3Var2 instanceof j63) || (jl3Var2 instanceof dq2)) {
                z38Var2 = z38Var;
            }
        } else if (jl3Var != null) {
            boolean z2 = jl3Var instanceof yr5;
            z38Var = b;
            if (z2 || (jl3Var instanceof g52)) {
                z38Var2 = z38Var;
            } else if (jl3Var instanceof j63) {
                z38Var2 = c;
            } else if (jl3Var instanceof dq2) {
                z38Var2 = z38Var;
            }
        }
        z38 z38Var3 = z38Var2;
        ne1 ne1Var = ne1.m;
        if (z38Var3 != null) {
            Object objA = km.a(kmVar, new w32(f), z38Var3, null, null, jc1Var, 12);
            if (objA == ne1Var) {
                return objA;
            }
        } else {
            Object objE = kmVar.e(new w32(f), jc1Var);
            if (objE == ne1Var) {
                return objE;
            }
        }
        return f88.a;
    }
}
