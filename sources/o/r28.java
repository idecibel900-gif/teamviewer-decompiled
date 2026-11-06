package o;

/* JADX INFO: loaded from: classes.dex */
public final class r28 extends n1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1886o;
    public Object[] p;
    public boolean q;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public r28(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f1886o = i3;
        Object[] objArr2 = new Object[i3];
        this.p = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.q = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.m & 31;
        Object obj = this.p[this.f1886o - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.f1886o - i2) * 5;
        while (i2 < this.f1886o) {
            Object[] objArr = this.p;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[h67.m(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (h67.m(this.m, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.m, ((this.f1886o - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        Object objA = a();
        int i = this.m + 1;
        this.m = i;
        if (i == this.n) {
            this.q = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            yq4.p();
            return null;
        }
        this.m--;
        if (this.q) {
            this.q = false;
            return a();
        }
        c(31);
        return a();
    }
}
