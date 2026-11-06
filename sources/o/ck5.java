package o;

/* JADX INFO: loaded from: classes.dex */
public class ck5 extends ak5 {
    public final bk5 p;
    public Object q;
    public boolean r;
    public int s;

    public ck5(bk5 bk5Var, t28[] t28VarArr) {
        super(bk5Var.f435o, t28VarArr);
        this.p = bk5Var;
        this.s = bk5Var.q;
    }

    public final void c(int i, s28 s28Var, Object obj, int i2) {
        int i3 = i2 * 5;
        t28[] t28VarArr = this.m;
        if (i3 <= 30) {
            int iM = 1 << h57.m(i, i3);
            if (s28Var.h(iM)) {
                t28VarArr[i2].a(s28Var.d, Integer.bitCount(s28Var.a) * 2, s28Var.f(iM));
                this.n = i2;
                return;
            } else {
                int iT = s28Var.t(iM);
                s28 s28VarS = s28Var.s(iT);
                t28VarArr[i2].a(s28Var.d, Integer.bitCount(s28Var.a) * 2, iT);
                c(i, s28VarS, obj, i2 + 1);
                return;
            }
        }
        t28 t28Var = t28VarArr[i2];
        Object[] objArr = s28Var.d;
        t28Var.a(objArr, objArr.length, 0);
        while (true) {
            t28 t28Var2 = t28VarArr[i2];
            if (im3.n(t28Var2.m[t28Var2.f2073o], obj)) {
                this.n = i2;
                return;
            } else {
                t28VarArr[i2].f2073o += 2;
            }
        }
    }

    @Override // o.ak5, java.util.Iterator
    public final Object next() {
        if (this.p.q != this.s) {
            gk0.c();
            return null;
        }
        if (!this.f333o) {
            yq4.p();
            return null;
        }
        t28 t28Var = this.m[this.n];
        this.q = t28Var.m[t28Var.f2073o];
        this.r = true;
        return super.next();
    }

    @Override // o.ak5, java.util.Iterator
    public final void remove() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        boolean z = this.f333o;
        bk5 bk5Var = this.p;
        if (!z) {
            e8.g(bk5Var).remove(this.q);
        } else {
            if (!z) {
                yq4.p();
                return;
            }
            t28 t28Var = this.m[this.n];
            Object obj = t28Var.m[t28Var.f2073o];
            e8.g(bk5Var).remove(this.q);
            c(obj != null ? obj.hashCode() : 0, bk5Var.f435o, obj, 0);
        }
        this.q = null;
        this.r = false;
        this.s = bk5Var.q;
    }
}
