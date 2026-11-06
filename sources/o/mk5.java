package o;

/* JADX INFO: loaded from: classes.dex */
public final class mk5 extends n1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kk5 f1478o;
    public int p;
    public r28 q;
    public int r;

    public mk5(kk5 kk5Var, int i) {
        super(i, kk5Var.t);
        this.f1478o = kk5Var;
        this.p = kk5Var.f();
        this.r = -1;
        b();
    }

    public final void a() {
        if (this.p == this.f1478o.f()) {
            return;
        }
        gk0.c();
    }

    @Override // o.n1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.m;
        kk5 kk5Var = this.f1478o;
        kk5Var.add(i, obj);
        this.m++;
        this.n = kk5Var.a();
        this.p = kk5Var.f();
        this.r = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        kk5 kk5Var = this.f1478o;
        Object[] objArr = kk5Var.r;
        if (objArr == null) {
            this.q = null;
            return;
        }
        int i = (kk5Var.t - 1) & (-32);
        int i2 = this.m;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (kk5Var.p / 5) + 1;
        r28 r28Var = this.q;
        if (r28Var == null) {
            this.q = new r28(objArr, i2, i, i3);
            return;
        }
        r28Var.m = i2;
        r28Var.n = i;
        r28Var.f1886o = i3;
        Object[] objArr2 = r28Var.p;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            r28Var.p = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        r28Var.q = r0;
        r28Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        int i = this.m;
        this.r = i;
        r28 r28Var = this.q;
        kk5 kk5Var = this.f1478o;
        if (r28Var == null) {
            Object[] objArr = kk5Var.s;
            this.m = i + 1;
            return objArr[i];
        }
        if (r28Var.hasNext()) {
            this.m++;
            return r28Var.next();
        }
        Object[] objArr2 = kk5Var.s;
        int i2 = this.m;
        this.m = i2 + 1;
        return objArr2[i2 - r28Var.n];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        int i = this.m;
        this.r = i - 1;
        r28 r28Var = this.q;
        kk5 kk5Var = this.f1478o;
        if (r28Var == null) {
            Object[] objArr = kk5Var.s;
            int i2 = i - 1;
            this.m = i2;
            return objArr[i2];
        }
        int i3 = r28Var.n;
        if (i <= i3) {
            this.m = i - 1;
            return r28Var.previous();
        }
        Object[] objArr2 = kk5Var.s;
        int i4 = i - 1;
        this.m = i4;
        return objArr2[i4 - i3];
    }

    @Override // o.n1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.r;
        if (i == -1) {
            throw new IllegalStateException();
        }
        kk5 kk5Var = this.f1478o;
        kk5Var.b(i);
        int i2 = this.r;
        if (i2 < this.m) {
            this.m = i2;
        }
        this.n = kk5Var.a();
        this.p = kk5Var.f();
        this.r = -1;
        b();
    }

    @Override // o.n1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.r;
        if (i == -1) {
            throw new IllegalStateException();
        }
        kk5 kk5Var = this.f1478o;
        kk5Var.set(i, obj);
        this.p = kk5Var.f();
        b();
    }
}
