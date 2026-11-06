package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {
    public final i m;
    public final /* synthetic */ e n;

    public d(e eVar, i iVar) {
        this.n = eVar;
        this.m = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.n.f186o.b((byte[]) this.m.next());
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        this.m.remove();
    }
}
