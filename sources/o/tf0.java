package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tf0 implements hp {
    public final wy3 a;
    public final ht2 b;
    public final Map c;
    public final u14 d;

    public tf0(wy3 wy3Var, ht2 ht2Var, Map map) {
        wy3Var.getClass();
        ht2Var.getClass();
        this.a = wy3Var;
        this.b = ht2Var;
        this.c = map;
        this.d = ds1.X(l54.m, new a3(this, (byte) 4));
    }

    @Override // o.hp
    public final s67 c() {
        return s67.h;
    }

    @Override // o.hp
    public final ht2 d() {
        return this.b;
    }

    @Override // o.hp
    public final Map e() {
        return this.c;
    }

    @Override // o.hp
    public final oz3 getType() {
        Object value = this.d.getValue();
        value.getClass();
        return (oz3) value;
    }
}
