package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fo5 implements nw3 {
    public final wt3 a;
    public final u14 b;

    public fo5(wt3 wt3Var) {
        wt3Var.getClass();
        this.a = wt3Var;
        this.b = ds1.X(l54.m, new vm3((Object) this, (byte) 23));
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        obj.getClass();
        it1.x(this, bb7Var, obj);
        throw null;
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        k01 k01VarU = aj1Var.u(d());
        String strT = null;
        while (true) {
            int iL = k01VarU.l(d());
            if (iL == -1) {
                throw new IllegalArgumentException(ua5.m("Polymorphic value has not been read for class ", strT).toString());
            }
            if (iL != 0) {
                if (iL == 1) {
                    if (strT == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    it1.w(this, k01VarU, strT);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strT == null) {
                    strT = "unknown class";
                }
                sb.append(strT);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(iL);
                throw new nq6(sb.toString());
            }
            strT = k01VarU.t(d(), iL);
        }
    }

    @Override // o.nw3
    public final fq6 d() {
        return (fq6) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
