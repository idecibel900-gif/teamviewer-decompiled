package o;

/* JADX INFO: loaded from: classes2.dex */
public final enum e73 extends r73 {
    public e73() {
        super("Initial", 0);
    }

    @Override // o.r73
    public final boolean d(sj5 sj5Var, t63 t63Var) {
        if (r73.b(sj5Var)) {
            return true;
        }
        if (sj5Var.a()) {
            t63Var.K((aw7) sj5Var);
            return true;
        }
        boolean zB = sj5Var.b();
        j73 j73Var = r73.n;
        if (!zB) {
            t63Var.d.x = 2;
            t63Var.m = j73Var;
            return t63Var.n(sj5Var);
        }
        bw7 bw7Var = (bw7) sj5Var;
        ig5 ig5Var = t63Var.g;
        String strF = bw7Var.d.F();
        ig5Var.getClass();
        String strTrim = strF.trim();
        if (!ig5Var.a) {
            strTrim = us1.F(strTrim);
        }
        l32 l32Var = new l32(strTrim, bw7Var.f.F(), bw7Var.g.F());
        String str = bw7Var.e;
        if (str != null) {
            l32Var.d("pubSysKey", str);
        }
        t63Var.d.Q(l32Var);
        if (bw7Var.j || !l32Var.c("name").equals("html") || l32Var.c("publicId").equalsIgnoreCase("HTML")) {
            t63Var.d.x = 2;
        }
        t63Var.m = j73Var;
        return true;
    }
}
