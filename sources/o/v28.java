package o;

/* JADX INFO: loaded from: classes.dex */
public final class v28 extends t28 {
    public final ek5 p;

    public v28(ek5 ek5Var) {
        this.p = ek5Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2073o;
        this.f2073o = i + 2;
        Object[] objArr = this.m;
        return new rw4(this.p, objArr[i], objArr[i + 1]);
    }
}
