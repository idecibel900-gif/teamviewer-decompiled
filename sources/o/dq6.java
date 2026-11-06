package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dq6 implements Iterator, su3 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f645o = true;

    public /* synthetic */ dq6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f645o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                if (this.f645o) {
                    this.f645o = false;
                    return obj;
                }
                yq4.p();
                return null;
            case 1:
                if (this.f645o) {
                    this.f645o = false;
                    return obj;
                }
                yq4.p();
                return null;
            default:
                if (this.f645o) {
                    this.f645o = false;
                    return ((c95) obj).m;
                }
                yq4.p();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
