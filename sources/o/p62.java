package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p62 implements Iterator, su3 {
    public final /* synthetic */ byte m = 1;
    public final Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1708o;

    public p62(q62 q62Var) {
        this.n = q62Var.a.iterator();
        this.f1708o = q62Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        Iterator it = this.n;
        switch (b) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.f1708o > 0 && it.hasNext()) {
            it.next();
            this.f1708o--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Iterator it = this.n;
        switch (b) {
            case 0:
                break;
            default:
                int i = this.f1708o;
                this.f1708o = i + 1;
                if (i >= 0) {
                    return new sg3(i, it.next());
                }
                qf0.U();
                throw null;
        }
        while (this.f1708o > 0 && it.hasNext()) {
            it.next();
            this.f1708o--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p62(Iterator it) {
        it.getClass();
        this.n = it;
    }
}
