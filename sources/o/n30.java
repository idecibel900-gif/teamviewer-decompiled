package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n30 implements l30 {
    public final dy3 m;
    public float n = -1.0f;

    public n30(List list) {
        this.m = (dy3) list.get(0);
    }

    @Override // o.l30
    public final boolean d(float f) {
        if (this.n == f) {
            return true;
        }
        this.n = f;
        return false;
    }

    @Override // o.l30
    public final dy3 e() {
        return this.m;
    }

    @Override // o.l30
    public final boolean f(float f) {
        return !this.m.c();
    }

    @Override // o.l30
    public final boolean isEmpty() {
        return false;
    }

    @Override // o.l30
    public final float l() {
        return this.m.a();
    }

    @Override // o.l30
    public final float m() {
        return this.m.b();
    }
}
