package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bw7 extends sj5 {
    public final lh7 d;
    public String e;
    public final lh7 f;
    public final lh7 g;
    public final lh7 h;
    public boolean i;
    public boolean j;

    public bw7() {
        super(1);
        byte b = 2;
        boolean z = false;
        this.d = new lh7(b, z);
        this.e = null;
        this.f = new lh7(b, z);
        this.g = new lh7(b, z);
        this.h = new lh7(b, z);
        this.i = false;
        this.j = false;
    }

    @Override // o.sj5
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.A();
        this.e = null;
        this.f.A();
        this.g.A();
        this.h.A();
        this.i = false;
        this.j = false;
    }

    public final String toString() {
        return "<!doctype " + this.d.F() + ">";
    }
}
