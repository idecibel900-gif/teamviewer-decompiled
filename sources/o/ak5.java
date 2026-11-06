package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak5 implements Iterator, su3 {
    public final t28[] m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f333o = true;

    public ak5(s28 s28Var, t28[] t28VarArr) {
        this.m = t28VarArr;
        t28VarArr[0].a(s28Var.d, Integer.bitCount(s28Var.a) * 2, 0);
        this.n = 0;
        a();
    }

    public final void a() {
        int i = this.n;
        t28[] t28VarArr = this.m;
        t28 t28Var = t28VarArr[i];
        if (t28Var.f2073o < t28Var.n) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                t28 t28Var2 = t28VarArr[i];
                int i2 = t28Var2.f2073o;
                Object[] objArr = t28Var2.m;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    t28Var2.f2073o = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.n = iB;
                return;
            }
            if (i > 0) {
                t28 t28Var3 = t28VarArr[i - 1];
                int i3 = t28Var3.f2073o;
                int length2 = t28Var3.m.length;
                t28Var3.f2073o = i3 + 1;
            }
            t28VarArr[i].a(s28.e.d, 0, 0);
            i--;
        }
        this.f333o = false;
    }

    public final int b(int i) {
        t28[] t28VarArr = this.m;
        t28 t28Var = t28VarArr[i];
        int i2 = t28Var.f2073o;
        if (i2 < t28Var.n) {
            return i;
        }
        Object[] objArr = t28Var.m;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        s28 s28Var = (s28) obj;
        if (i == 6) {
            t28 t28Var2 = t28VarArr[i + 1];
            Object[] objArr2 = s28Var.d;
            t28Var2.a(objArr2, objArr2.length, 0);
        } else {
            t28VarArr[i + 1].a(s28Var.d, Integer.bitCount(s28Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f333o;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f333o) {
            yq4.p();
            return null;
        }
        Object next = this.m[this.n].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
