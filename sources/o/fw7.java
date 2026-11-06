package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fw7 extends sj5 {
    public final lh7 d;
    public String e;
    public boolean f;
    public ly g;
    public final lh7 h;
    public final lh7 i;
    public boolean j;
    public final o28 k;
    public int l;

    public fw7(int i, o28 o28Var) {
        super(i);
        this.d = new lh7((byte) 2, false);
        this.f = false;
        byte b = 2;
        boolean z = false;
        this.h = new lh7(b, z);
        this.i = new lh7(b, z);
        this.j = false;
        this.k = o28Var;
        o28Var.getClass();
    }

    public final void g(char c, int i, int i2) {
        this.i.f(c);
    }

    public final void h(int i, int i2, int[] iArr) {
        for (int i3 : iArr) {
            lh7 lh7Var = this.i;
            StringBuilder sb = (StringBuilder) lh7Var.f1364o;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) lh7Var.n) != null) {
                StringBuilder sbB = lb7.b();
                lh7Var.f1364o = sbB;
                sbB.append((String) lh7Var.n);
                lh7Var.n = null;
                ((StringBuilder) lh7Var.f1364o).appendCodePoint(i3);
            } else {
                lh7Var.n = String.valueOf(Character.toChars(i3));
            }
        }
    }

    public final void i(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        lh7 lh7Var = this.d;
        lh7Var.g(strReplace);
        this.e = us1.F(lh7Var.F());
    }

    public final void j(ig5 ig5Var) {
        this.k.getClass();
    }

    public final void k(String str) {
        lh7 lh7Var = this.d;
        lh7Var.A();
        lh7Var.n = str;
        this.e = us1.F(lh7Var.F());
    }

    public final void l() {
        String strF;
        if (this.g == null) {
            this.g = new ly();
        }
        lh7 lh7Var = this.h;
        boolean zS = lh7Var.s();
        lh7 lh7Var2 = this.i;
        if (zS && this.g.size() < 512) {
            String strTrim = lh7Var.F().trim();
            if (!strTrim.isEmpty()) {
                if (lh7Var2.s()) {
                    strF = lh7Var2.F();
                } else {
                    strF = this.j ? "" : null;
                }
                this.g.a(strF, strTrim);
                this.k.getClass();
            }
        }
        lh7Var.A();
        lh7Var2.A();
        this.j = false;
    }

    public final String m() {
        String str = this.e;
        if (str == null || str.isEmpty()) {
            throw new fb8("Must be false");
        }
        return this.e;
    }

    @Override // o.sj5
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fw7 f() {
        this.b = -1;
        this.c = -1;
        this.d.A();
        this.e = null;
        this.f = false;
        this.g = null;
        this.l = 0;
        this.h.A();
        this.i.A();
        this.j = false;
        return this;
    }

    public final String o() {
        String strF = this.d.F();
        return strF.isEmpty() ? "[unset]" : strF;
    }
}
