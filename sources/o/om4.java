package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class om4 implements nw3 {
    public final nw3 a;
    public final nw3 b;
    public final /* synthetic */ byte c;
    public final hq6 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public om4(nw3 nw3Var, nw3 nw3Var2, byte b) {
        this(nw3Var, nw3Var2, (char) 0);
        this.c = b;
        switch (b) {
            case 1:
                this(nw3Var, nw3Var2, (char) 0);
                fq6[] fq6VarArr = new fq6[0];
                if (ub7.b0("o.vd5")) {
                    hk0.g("Blank serial names are prohibited");
                    throw null;
                }
                rs0 rs0Var = new rs0("o.vd5");
                rs0.a(rs0Var, "first", nw3Var.d());
                rs0.a(rs0Var, "second", nw3Var2.d());
                this.d = new hq6("o.vd5", lc7.d, rs0Var.b.size(), cx.g1(fq6VarArr), rs0Var);
                return;
            default:
                this.d = et1.r("kotlin.collections.Map.Entry", lc7.f, new fq6[0], new o43(nw3Var, nw3Var2, (byte) 12));
                return;
        }
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        Object key;
        Object value;
        bb7 bb7VarA = bb7Var.a(d());
        fq6 fq6VarD = d();
        nw3 nw3Var = this.a;
        byte b = this.c;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                vd5 vd5Var = (vd5) obj;
                vd5Var.getClass();
                key = vd5Var.m;
                break;
        }
        bb7VarA.n(fq6VarD, 0, nw3Var, key);
        fq6 fq6VarD2 = d();
        nw3 nw3Var2 = this.b;
        switch (b) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                vd5 vd5Var2 = (vd5) obj;
                vd5Var2.getClass();
                value = vd5Var2.n;
                break;
        }
        bb7VarA.n(fq6VarD2, 1, nw3Var2, value);
        bb7VarA.s(d());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        Object nm4Var;
        fq6 fq6VarD = d();
        k01 k01VarU = aj1Var.u(fq6VarD);
        Object obj = hm3.I;
        Object objC = obj;
        Object objC2 = objC;
        while (true) {
            int iL = k01VarU.l(d());
            if (iL == -1) {
                if (objC == obj) {
                    throw new nq6("Element 'key' is missing");
                }
                if (objC2 == obj) {
                    throw new nq6("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        nm4Var = new nm4(objC, objC2);
                        break;
                    default:
                        nm4Var = new vd5(objC, objC2);
                        break;
                }
                k01VarU.i(fq6VarD);
                return nm4Var;
            }
            if (iL == 0) {
                objC = k01VarU.C(d(), 0, this.a, null);
            } else {
                if (iL != 1) {
                    throw new nq6(fx3.e(iL, "Invalid index: "));
                }
                objC2 = k01VarU.C(d(), 1, this.b, null);
            }
        }
    }

    @Override // o.nw3
    public final fq6 d() {
        byte b = this.c;
        return this.d;
    }

    public om4(nw3 nw3Var, nw3 nw3Var2, char c) {
        this.a = nw3Var;
        this.b = nw3Var2;
    }
}
