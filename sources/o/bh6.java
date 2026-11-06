package o;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bh6 extends ch6 implements Iterator {
    public ah6 m;
    public boolean n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SafeIterableMap f426o;

    public bh6(SafeIterableMap safeIterableMap) {
        this.f426o = safeIterableMap;
    }

    @Override // o.ch6
    public final void a(ah6 ah6Var) {
        ah6 ah6Var2 = this.m;
        if (ah6Var == ah6Var2) {
            ah6 ah6Var3 = ah6Var2.p;
            this.m = ah6Var3;
            this.n = ah6Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n) {
            return this.f426o.m != null;
        }
        ah6 ah6Var = this.m;
        return (ah6Var == null || ah6Var.f323o == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.n) {
            this.n = false;
            ah6 ah6Var = this.f426o.m;
            this.m = ah6Var;
            return ah6Var;
        }
        ah6 ah6Var2 = this.m;
        ah6 ah6Var3 = ah6Var2 != null ? ah6Var2.f323o : null;
        this.m = ah6Var3;
        return ah6Var3;
    }
}
