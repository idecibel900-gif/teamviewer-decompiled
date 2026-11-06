package o;

/* JADX INFO: loaded from: classes.dex */
public final class z38 implements d72 {
    public final int a;
    public final int b;
    public final p72 c;

    public z38(int i, int i2, p72 p72Var) {
        this.a = i;
        this.b = i2;
        this.c = p72Var;
    }

    @Override // o.jo
    public final ec8 a(yn1 yn1Var) {
        return new io.sentry.android.replay.screenshot.h(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z38) {
            z38 z38Var = (z38) obj;
            if (z38Var.a == this.a && z38Var.b == this.b && im3.n(z38Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // o.d72, o.rl2, o.jo
    public final gc8 a(yn1 yn1Var) {
        return new io.sentry.android.replay.screenshot.h(this.a, this.b, this.c);
    }

    @Override // o.rl2, o.jo
    public final hc8 a(yn1 yn1Var) {
        return new io.sentry.android.replay.screenshot.h(this.a, this.b, this.c);
    }
}
