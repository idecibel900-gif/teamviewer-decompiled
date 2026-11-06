package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ek5 implements Iterator, su3 {
    public final /* synthetic */ byte m = 2;
    public final Iterator n;

    public ek5(bk5 bk5Var) {
        t28[] t28VarArr = new t28[8];
        for (int i = 0; i < 8; i++) {
            t28VarArr[i] = new v28(this);
        }
        this.n = new ck5(bk5Var, t28VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.m;
        Iterator it = this.n;
        switch (b) {
            case 0:
                return ((ck5) it).f333o;
            case 1:
                return ((j1) it).hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Iterator it = this.n;
        switch (b) {
            case 0:
                return (Map.Entry) ((ck5) it).next();
            case 1:
                return ((j1) it).next();
            default:
                return (cc8) it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                ((ck5) this.n).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ek5(Object[] objArr) {
        objArr.getClass();
        this.n = new j1(objArr);
    }

    public ek5(ac8 ac8Var) {
        this.n = ac8Var.v.iterator();
    }
}
