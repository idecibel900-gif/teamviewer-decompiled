package o;

/* JADX INFO: loaded from: classes.dex */
public final class qq8 extends sq8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f1856o;
    public final transient int p;
    public final /* synthetic */ sq8 q;

    public qq8(sq8 sq8Var, int i, int i2) {
        this.q = sq8Var;
        this.f1856o = i;
        this.p = i2;
    }

    @Override // o.jq8
    public final Object[] a() {
        return this.q.a();
    }

    @Override // o.jq8
    public final int b() {
        return this.q.b() + this.f1856o;
    }

    @Override // o.jq8
    public final int c() {
        return this.q.b() + this.f1856o + this.p;
    }

    @Override // o.sq8, java.util.List
    /* JADX INFO: renamed from: g */
    public final sq8 subList(int i, int i2) {
        i67.I(i, i2, this.p);
        int i3 = this.f1856o;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        i67.H(i, this.p);
        return this.q.get(i + this.f1856o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
