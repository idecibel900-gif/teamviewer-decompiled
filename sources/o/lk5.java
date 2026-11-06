package o;

/* JADX INFO: loaded from: classes.dex */
public final class lk5 extends n1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object[] f1373o;
    public final r28 p;

    public lk5(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.f1373o = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.p = new r28(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        r28 r28Var = this.p;
        if (r28Var.hasNext()) {
            this.m++;
            return r28Var.next();
        }
        int i = this.m;
        this.m = i + 1;
        return this.f1373o[i - r28Var.n];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        int i = this.m;
        r28 r28Var = this.p;
        int i2 = r28Var.n;
        if (i <= i2) {
            this.m = i - 1;
            return r28Var.previous();
        }
        int i3 = i - 1;
        this.m = i3;
        return this.f1373o[i3 - i2];
    }
}
