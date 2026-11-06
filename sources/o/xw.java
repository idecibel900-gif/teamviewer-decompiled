package o;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xw extends uw {
    public Object[] m;
    public int n;

    @Override // o.uw
    public final int a() {
        return this.n;
    }

    @Override // o.uw
    public final void b(int i, xp xpVar) {
        Object[] objArrCopyOf = this.m;
        if (objArrCopyOf.length <= i) {
            int length = objArrCopyOf.length;
            do {
                length *= 2;
            } while (length <= i);
            objArrCopyOf = Arrays.copyOf(this.m, length);
            this.m = objArrCopyOf;
        }
        if (objArrCopyOf[i] == null) {
            this.n++;
        }
        objArrCopyOf[i] = xpVar;
    }

    @Override // o.uw
    public final Object get(int i) {
        return cx.V0(i, this.m);
    }

    @Override // o.uw, java.lang.Iterable
    public final Iterator iterator() {
        return new ww(this);
    }
}
