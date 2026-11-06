package o;

/* JADX INFO: loaded from: classes.dex */
public final class nq8 extends sq8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient sq8 f1594o;

    public nq8(sq8 sq8Var) {
        this.f1594o = sq8Var;
    }

    @Override // o.sq8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f1594o.contains(obj);
    }

    @Override // o.sq8
    public final sq8 f() {
        return this.f1594o;
    }

    @Override // o.sq8, java.util.List
    /* JADX INFO: renamed from: g */
    public final sq8 subList(int i, int i2) {
        sq8 sq8Var = this.f1594o;
        i67.I(i, i2, sq8Var.size());
        return sq8Var.subList(sq8Var.size() - i2, sq8Var.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        sq8 sq8Var = this.f1594o;
        i67.H(i, sq8Var.size());
        return sq8Var.get((sq8Var.size() - 1) - i);
    }

    @Override // o.sq8, java.util.List
    public final int indexOf(Object obj) {
        sq8 sq8Var = this.f1594o;
        int iLastIndexOf = sq8Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (sq8Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // o.sq8, java.util.List
    public final int lastIndexOf(Object obj) {
        sq8 sq8Var = this.f1594o;
        int iIndexOf = sq8Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (sq8Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1594o.size();
    }
}
