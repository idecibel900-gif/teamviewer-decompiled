package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q54 extends x35 {
    public Object p;

    public q54(String str) {
        db8.o0(str);
        this.p = str;
    }

    @Override // o.x35
    public final o82 H() {
        return this.m;
    }

    @Override // o.x35
    public final s06 O() {
        Object obj = this.p;
        return obj instanceof p54 ? ((p54) obj).b : super.O();
    }

    public final String Q() {
        Object obj = this.p;
        if (obj instanceof ly) {
            return ((ly) obj).h(x());
        }
        return obj instanceof p54 ? ((p54) obj).a : (String) obj;
    }

    public final void R() {
        if (this.p instanceof ly) {
            return;
        }
        String strQ = Q();
        ly lyVar = new ly();
        s06 s06VarO = O();
        this.p = lyVar;
        lyVar.o(x(), strQ);
        if (s06VarO != null) {
            int iL = lyVar.l("/jsoup.spans");
            if (iL == -1) {
                lyVar.a(s06VarO, "/jsoup.spans");
            } else {
                lyVar.f1417o[iL] = s06VarO;
            }
        }
    }

    @Override // o.x35
    public final String a(String str) {
        R();
        return super.a(str);
    }

    @Override // o.x35
    public final String c(String str) {
        if (this.p instanceof ly) {
            return super.c(str);
        }
        return x().equals(str) ? Q() : "";
    }

    @Override // o.x35
    public final void d(String str, String str2) {
        if ((this.p instanceof ly) || !str.equals(x())) {
            R();
            super.d(str, str2);
            return;
        }
        Object obj = this.p;
        if (obj instanceof ly) {
            ((ly) obj).o(x(), str2);
        } else if (obj instanceof p54) {
            ((p54) obj).a = str2;
        } else {
            this.p = str2;
        }
    }

    @Override // o.x35
    public final ly g() {
        R();
        return (ly) this.p;
    }

    @Override // o.x35
    public final x35 n(x35 x35Var) {
        q54 q54Var = (q54) super.n(x35Var);
        Object obj = this.p;
        if (obj instanceof ly) {
            q54Var.p = ((ly) obj).clone();
            return q54Var;
        }
        if (obj instanceof p54) {
            p54 p54Var = (p54) obj;
            q54Var.p = new p54(p54Var.a, p54Var.b.a());
        }
        return q54Var;
    }

    @Override // o.x35
    public final boolean s() {
        return this.p instanceof ly;
    }

    @Override // o.x35
    public final String y() {
        return Q();
    }
}
