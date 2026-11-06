package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yz3 implements rw2, Serializable {
    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    public yz3(int i) {
        this.m = i;
    }

    @Override // o.rw2
    public final int getArity() {
        return this.m;
    }

    public final String toString() {
        String strJ = w86.a.j(this);
        strJ.getClass();
        return strJ;
    }
}
