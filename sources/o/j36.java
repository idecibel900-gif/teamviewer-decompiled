package o;

/* JADX INFO: loaded from: classes2.dex */
public final class j36 implements ez3 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ l36 n;

    public /* synthetic */ j36(l36 l36Var, byte b) {
        this.m = b;
        this.n = l36Var;
    }

    private final void b(sy4 sy4Var, Object obj) {
    }

    private final void c(sy4 sy4Var, ns0 ns0Var) {
    }

    private final void d(sy4 sy4Var, ns0 ns0Var) {
    }

    private final void e(sy4 sy4Var, ns0 ns0Var) {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
    }

    private final void m(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
    }

    private final void n(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
    }

    @Override // o.ez3
    public final void a() {
        byte b = this.m;
    }

    @Override // o.ez3
    public final void f(sy4 sy4Var, ns0 ns0Var) {
        byte b = this.m;
    }

    @Override // o.ez3
    public final void g(sy4 sy4Var, js0 js0Var, sy4 sy4Var2) {
        byte b = this.m;
    }

    @Override // o.ez3
    public final void h(sy4 sy4Var, Object obj) {
        byte b = this.m;
        l36 l36Var = this.n;
        switch (b) {
            case 0:
                String strB = sy4Var.b();
                if (!"k".equals(strB)) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                "pn".equals(strB);
                            } else if (obj instanceof Integer) {
                                l36Var.f1325o = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                l36Var.n = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        l36Var.m = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    xy3.n.getClass();
                    xy3 xy3Var = (xy3) xy3.f2563o.get((Integer) obj);
                    if (xy3Var == null) {
                        xy3Var = xy3.UNKNOWN;
                    }
                    l36Var.s = xy3Var;
                }
                break;
            case 1:
                break;
            default:
                String strB2 = sy4Var.b();
                if (!"version".equals(strB2)) {
                    if ("multifileClassName".equals(strB2)) {
                        l36Var.n = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    l36Var.m = (int[]) obj;
                }
                break;
        }
    }

    @Override // o.ez3
    public final fz3 s(sy4 sy4Var) {
        byte b = 0;
        byte b2 = 1;
        switch (this.m) {
            case 0:
                String strB = sy4Var.b();
                if ("d1".equals(strB)) {
                    return new i36(this, b);
                }
                if ("d2".equals(strB)) {
                    return new i36(this, b2);
                }
                return null;
            case 1:
                if ("b".equals(sy4Var.b())) {
                    return new i36(this, (byte) 2);
                }
                return null;
            default:
                String strB2 = sy4Var.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new k36(this, b);
                }
                if ("strings".equals(strB2)) {
                    return new k36(this, b2);
                }
                return null;
        }
    }

    @Override // o.ez3
    public final ez3 w(js0 js0Var, sy4 sy4Var) {
        switch (this.m) {
        }
        return null;
    }
}
