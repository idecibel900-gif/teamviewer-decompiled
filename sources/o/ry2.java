package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ry2 implements Iterator, su3 {
    public final /* synthetic */ byte m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1965o;
    public final Object p;

    public ry2(mx4 mx4Var) {
        this.m = (byte) 2;
        this.p = mx4Var;
        this.n = -1;
        this.f1965o = ct1.M(new lx4(mx4Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.n;
        sy2 sy2Var = (sy2) this.p;
        if (i == -2) {
            objInvoke = sy2Var.a.a();
        } else {
            Function1 function1 = sy2Var.b;
            Object obj = this.f1965o;
            obj.getClass();
            objInvoke = function1.invoke(obj);
        }
        this.f1965o = objInvoke;
        this.n = objInvoke == null ? 0 : 1;
    }

    public void b() {
        Iterator it = (Iterator) this.p;
        if (it.hasNext()) {
            Object next = it.next();
            fi1 fi1Var = (fi1) next;
            fi1Var.getClass();
            if (fi1Var instanceof xi0) {
                this.n = 1;
                this.f1965o = next;
                return;
            }
        }
        this.n = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                if (this.n < 0) {
                    a();
                }
                return this.n == 1;
            case 1:
                return ((aq6) this.f1965o).hasNext();
            case 2:
                return ((aq6) this.f1965o).hasNext();
            case 3:
                return this.n < ((Map) this.p).size();
            default:
                if (this.n == -1) {
                    b();
                }
                return this.n == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.m) {
            case 0:
                if (this.n < 0) {
                    a();
                }
                if (this.n == 0) {
                    yq4.p();
                    return null;
                }
                Object obj2 = this.f1965o;
                obj2.getClass();
                this.n = -1;
                return obj2;
            case 1:
                return ((aq6) this.f1965o).next();
            case 2:
                return ((aq6) this.f1965o).next();
            case 3:
                if (hasNext()) {
                    obj = this.f1965o;
                    this.n++;
                    Object obj3 = ((Map) this.p).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f1965o = ((pa4) obj3).b;
                } else {
                    yq4.p();
                }
                return obj;
            default:
                if (this.n == -1) {
                    b();
                }
                if (this.n == 0) {
                    yq4.p();
                    return null;
                }
                Object obj4 = this.f1965o;
                this.f1965o = null;
                this.n = -1;
                return obj4;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.m;
        Object obj = this.p;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.n;
                if (i != -1) {
                    ((dx4) obj).n.i(i);
                    this.n = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.n;
                if (i2 != -1) {
                    ((mx4) obj).n.m(i2);
                    this.n = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ry2(fx fxVar) {
        this.m = (byte) 4;
        this.p = ((zp6) fxVar.b).iterator();
        this.n = -1;
    }

    public ry2(sy2 sy2Var) {
        this.m = (byte) 0;
        this.p = sy2Var;
        this.n = -2;
    }

    public ry2(Object obj, Map map) {
        this.m = (byte) 3;
        this.f1965o = obj;
        this.p = map;
    }

    public ry2(dx4 dx4Var) {
        this.m = (byte) 1;
        this.p = dx4Var;
        this.n = -1;
        this.f1965o = ct1.M(new cx4(dx4Var, this, null));
    }
}
