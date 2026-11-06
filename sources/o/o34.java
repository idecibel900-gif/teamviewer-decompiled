package o;

/* JADX INFO: loaded from: classes.dex */
public final class o34 {
    public final kh6 a;
    public final la b;
    public final jx4 c;

    public o34(kh6 kh6Var, la laVar) {
        this.a = kh6Var;
        this.b = laVar;
        long[] jArr = ti6.a;
        this.c = new jx4();
    }

    public final hw2 a(int i, Object obj, Object obj2) {
        jx4 jx4Var = this.c;
        n34 n34Var = (n34) jx4Var.g(obj);
        byte b = 27;
        if (n34Var != null && n34Var.c == i && im3.n(n34Var.b, obj2)) {
            yy0 yy0Var = n34Var.d;
            if (yy0Var != null) {
                return yy0Var;
            }
            yy0 yy0Var2 = new yy0(818252804, true, new c9(n34Var.e, n34Var, b));
            n34Var.d = yy0Var2;
            return yy0Var2;
        }
        n34 n34Var2 = new n34(this, i, obj, obj2);
        jx4Var.m(obj, n34Var2);
        yy0 yy0Var3 = n34Var2.d;
        if (yy0Var3 != null) {
            return yy0Var3;
        }
        yy0 yy0Var4 = new yy0(818252804, true, new c9(this, n34Var2, b));
        n34Var2.d = yy0Var4;
        return yy0Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        n34 n34Var = (n34) this.c.g(obj);
        if (n34Var != null) {
            return n34Var.b;
        }
        i44 i44Var = (i44) this.b.a();
        int iG = i44Var.d.g(obj);
        if (iG != -1) {
            return i44Var.b(iG);
        }
        return null;
    }
}
