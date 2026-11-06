package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kb2 implements hp {
    public static final kb2 a = new kb2();

    @Override // o.hp
    public final s67 c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // o.hp
    public final ht2 d() {
        ns4 ns4VarD = bp1.d(this);
        if (ns4VarD != null) {
            if (hd2.f(ns4VarD)) {
                ns4VarD = null;
            }
            if (ns4VarD != null) {
                return bp1.c(ns4VarD);
            }
        }
        return null;
    }

    @Override // o.hp
    public final Map e() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // o.hp
    public final oz3 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
