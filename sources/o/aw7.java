package o;

/* JADX INFO: loaded from: classes2.dex */
public final class aw7 extends sj5 {
    public final lh7 d;

    public aw7() {
        super(4);
        this.d = new lh7((byte) 2, false);
    }

    @Override // o.sj5
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.A();
    }

    public final void g(char c) {
        this.d.f(c);
    }

    public final String toString() {
        return "<!--" + this.d.F() + "-->";
    }
}
