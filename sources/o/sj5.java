package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sj5 {
    public final int a;
    public int b;
    public int c;

    public sj5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public boolean a() {
        return this.a == 4;
    }

    public boolean b() {
        return this.a == 1;
    }

    public boolean c() {
        return this.a == 7;
    }

    public boolean d() {
        return this.a == 3;
    }

    public boolean e() {
        return this.a == 2;
    }

    public void f() {
        this.b = -1;
        this.c = -1;
    }

    public sj5(int i) {
        this.c = -1;
        this.a = i;
    }
}
