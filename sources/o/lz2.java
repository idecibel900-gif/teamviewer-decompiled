package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lz2 extends ox4 {
    @Override // o.ox4
    public final ox4 C(Function1 function1, Function1 function2) {
        return (ox4) ((n47) v47.b(new jb(new y2(function1, function2, (byte) 8), (byte) 15)));
    }

    @Override // o.ox4, o.n47
    public final void c() {
        synchronized (v47.c) {
            o();
        }
    }

    @Override // o.ox4, o.n47
    public final void k() {
        j51.X();
        throw null;
    }

    @Override // o.ox4, o.n47
    public final void l() {
        j51.X();
        throw null;
    }

    @Override // o.ox4, o.n47
    public final void m() {
        v47.c();
    }

    @Override // o.ox4, o.n47
    public final n47 u(Function1 function1) {
        return (s36) ((n47) v47.b(new jb(new kz2(function1, (byte) 0), (byte) 15)));
    }

    @Override // o.ox4
    public final r47 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
