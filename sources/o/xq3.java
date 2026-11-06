package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xq3 implements nw3 {
    public static final xq3 a = new xq3();
    public static final ls5 b;

    static {
        is5 is5Var = is5.l;
        if (ub7.b0("o.wq3")) {
            hk0.g("Blank serial names are prohibited");
            return;
        }
        Object it = ((km4) qs5.a.values()).iterator();
        while (((hm4) it).hasNext()) {
            nw3 nw3Var = (nw3) ((fm4) it).next();
            if ("o.wq3".equals(nw3Var.d().a())) {
                hk0.g(vb7.C("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + w86.a.b(nw3Var.getClass()).f() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new ls5("o.wq3", is5Var);
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        wq3 wq3Var = (wq3) obj;
        wq3Var.getClass();
        String str = wq3Var.n;
        us1.o(bb7Var);
        if (wq3Var.m) {
            bb7Var.q(str);
            return;
        }
        Long lP = bc7.P(str);
        if (lP != null) {
            bb7Var.k(lP.longValue());
            return;
        }
        z68 z68VarB = h57.B(str);
        if (z68VarB != null) {
            bb7Var.h(d78.b).k(z68VarB.m);
            return;
        }
        Double dValueOf = null;
        try {
            if (ac7.E(str)) {
                dValueOf = Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            bb7Var.e(dValueOf.doubleValue());
            return;
        }
        Boolean boolW0 = ub7.w0(str);
        if (boolW0 != null) {
            bb7Var.b(boolW0.booleanValue());
        } else {
            bb7Var.q(str);
        }
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        ab7 ab7VarN = us1.n(aj1Var);
        lq3 lq3VarA0 = ab7VarN.A0();
        if (lq3VarA0 instanceof wq3) {
            return (wq3) lq3VarA0;
        }
        throw new jq3(vs1.u(ua5.o(w86.a, lq3VarA0.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, -1, null, ab7VarN.B0().a.g ? vs1.I(-1, lq3VarA0.toString()).toString() : null));
    }

    @Override // o.nw3
    public final fq6 d() {
        return b;
    }
}
