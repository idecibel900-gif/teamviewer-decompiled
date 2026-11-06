package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wp implements up {
    public final /* synthetic */ byte m;
    public final Object n;

    public wp(up[] upVarArr) {
        this.m = (byte) 1;
        this.n = cx.g1(upVarArr);
    }

    @Override // o.up
    public final boolean isEmpty() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((up) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new jm2(new km2(new fx((List) obj, (byte) 1), ek.y, eq6.n));
            default:
                return da2.m;
        }
    }

    @Override // o.up
    public final boolean o0(ht2 ht2Var) {
        switch (this.m) {
            case 0:
                return kh.u(this, ht2Var);
            case 1:
                ht2Var.getClass();
                Iterator it = ((List) this.n).iterator();
                while (it.hasNext()) {
                    if (((up) it.next()).o0(ht2Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return kh.u(this, ht2Var);
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return ((List) this.n).toString();
            default:
                return super.toString();
        }
    }

    @Override // o.up
    public final hp u(ht2 ht2Var) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return kh.r(this, ht2Var);
            case 1:
                ht2Var.getClass();
                el2 el2Var = new el2(bq6.k0(new fx((List) obj, (byte) 1), new j01(ht2Var, (byte) 0)));
                return (hp) (el2Var.hasNext() ? el2Var.next() : null);
            default:
                ht2Var.getClass();
                if (ht2Var.equals((ht2) obj)) {
                    return kb2.a;
                }
                return null;
        }
    }

    public /* synthetic */ wp(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
