package o;

/* JADX INFO: loaded from: classes2.dex */
public class zv7 extends sj5 {
    public static final String e = String.valueOf((char) 0);
    public final lh7 d;

    public zv7(zv7 zv7Var) {
        super(5);
        lh7 lh7Var = new lh7((byte) 2, false);
        this.d = lh7Var;
        this.b = zv7Var.b;
        this.c = zv7Var.c;
        String strF = zv7Var.d.F();
        lh7Var.A();
        lh7Var.n = strF;
    }

    @Override // o.sj5
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.A();
    }

    public String toString() {
        return this.d.F();
    }

    public zv7() {
        super(5);
        this.d = new lh7((byte) 2, false);
    }
}
