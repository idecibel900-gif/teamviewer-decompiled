package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ig4 implements Iterator, su3 {
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1059o;
    public long p;

    public ig4(long j, long j2, long j3) {
        this.m = j3;
        this.n = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f1059o = z;
        this.p = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1059o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.p;
        if (j != this.n) {
            this.p = this.m + j;
        } else {
            if (!this.f1059o) {
                yq4.p();
                return null;
            }
            this.f1059o = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
