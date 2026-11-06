package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q62 implements zp6, u62 {
    public final zp6 a;
    public final int b;

    public q62(zp6 zp6Var, int i) {
        zp6Var.getClass();
        this.a = zp6Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        gk0.g(i, "count must be non-negative, but was ");
        throw null;
    }

    @Override // o.u62
    public final zp6 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new q62(this, i) : new q62(this.a, i2);
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new p62(this);
    }
}
