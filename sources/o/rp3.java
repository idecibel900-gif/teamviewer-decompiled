package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rp3 {
    public static final qp3 d = new qp3(new dq3(false, true, "    ", "type", true, fs0.f824o, true), mo8.v);
    public final dq3 a;
    public final wj5 b;
    public final d51 c = new d51((byte) 1);

    public rp3(dq3 dq3Var, wj5 wj5Var) {
        this.a = dq3Var;
        this.b = wj5Var;
    }

    public final Object a(String str, nw3 nw3Var) {
        nw3Var.getClass();
        str.getClass();
        str.getClass();
        r8 r8Var = new r8(str, this.a);
        Object objA = new ab7(this, zn8.OBJ, r8Var, nw3Var.d()).a(nw3Var);
        if (r8Var.g() == 10) {
            return objA;
        }
        r8.r(r8Var, "Expected EOF after parsing, but had " + ((String) r8Var.g).charAt(r8Var.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(nw3 nw3Var, Object obj) {
        char[] cArr;
        nw3Var.getClass();
        nd ndVar = new nd((byte) 8, false);
        mn0 mn0Var = mn0.c;
        synchronized (mn0Var) {
            kw kwVar = mn0Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (kwVar.isEmpty() ? null : kwVar.removeLast());
            if (cArr2 != null) {
                mn0Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        ndVar.f1562o = cArr;
        try {
            new bb7(new io.sentry.android.core.u0(ndVar), this, zn8.OBJ, new bb7[zn8.t.a()]).o(nw3Var, obj);
            return ndVar.toString();
        } finally {
            ndVar.p();
        }
    }
}
