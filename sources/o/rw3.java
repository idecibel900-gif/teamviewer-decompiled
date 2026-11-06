package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rw3 implements ju3 {
    public static final /* synthetic */ fw3[] p;
    public final d58 m;
    public final u86 n = et1.F(null, new a3(this, 25));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sw3 f1962o;

    static {
        x86 x86Var = w86.a;
        p = new fw3[]{x86Var.g(new gu5(x86Var.b(rw3.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public rw3(sw3 sw3Var, d58 d58Var) {
        eu3 eu3VarB;
        Object objO;
        this.m = d58Var;
        if (sw3Var == null) {
            fi1 fi1VarI = d58Var.i();
            fi1VarI.getClass();
            if (fi1VarI instanceof ns4) {
                objO = b((ns4) fi1VarI);
            } else {
                if (!(fi1VarI instanceof zi0)) {
                    hk0.q(fi1VarI, "Unknown type parameter container: ");
                    throw null;
                }
                fi1 fi1VarI2 = ((zi0) fi1VarI).i();
                fi1VarI2.getClass();
                if (fi1VarI2 instanceof ns4) {
                    eu3VarB = b((ns4) fi1VarI2);
                } else {
                    up1 up1Var = fi1VarI instanceof up1 ? (up1) fi1VarI : null;
                    if (up1Var == null) {
                        hk0.q(fi1VarI, "Non-class callable descriptor must be deserialized: ");
                        throw null;
                    }
                    rp1 rp1VarM = up1Var.M();
                    rs3 rs3Var = rp1VarM instanceof rs3 ? (rs3) rp1VarM : null;
                    r86 r86Var = rs3Var != null ? rs3Var.f1947o : null;
                    r86Var = r86Var == null ? null : r86Var;
                    if (r86Var == null) {
                        hk0.q(up1Var, "Container of deserialized member is not resolved: ");
                        throw null;
                    }
                    eu3VarB = (eu3) w86.a.b(r86Var.a);
                }
                objO = fi1VarI.o(new xc0((Object) eu3VarB, (byte) 24), f88.a);
            }
            sw3Var = (sw3) objO;
        }
        this.f1962o = sw3Var;
    }

    public static eu3 b(ns4 ns4Var) {
        Class clsJ = pa8.j(ns4Var);
        eu3 eu3Var = (eu3) (clsJ != null ? w86.a.b(clsJ) : null);
        if (eu3Var != null) {
            return eu3Var;
        }
        gk0.k(ns4Var.i(), "Type parameter container is not resolved: ");
        return null;
    }

    public final String a() {
        String strB = this.m.getName().b();
        strB.getClass();
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw3)) {
            return false;
        }
        rw3 rw3Var = (rw3) obj;
        return im3.n(this.f1962o, rw3Var.f1962o) && a().equals(rw3Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f1962o.hashCode() * 31);
    }

    public final String toString() {
        vw3 vw3Var;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.m.B().ordinal();
        if (iOrdinal == 0) {
            vw3Var = vw3.m;
        } else if (iOrdinal == 1) {
            vw3Var = vw3.n;
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                return null;
            }
            vw3Var = vw3.f2355o;
        }
        int iOrdinal2 = vw3Var.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal2 != 2) {
                    gk0.s();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(a());
        return sb.toString();
    }
}
