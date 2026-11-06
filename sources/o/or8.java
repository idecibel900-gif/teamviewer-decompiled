package o;

/* JADX INFO: loaded from: classes.dex */
public final class or8 extends yr8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f1671o;
    public final transient int p;
    public final /* synthetic */ yr8 q;

    public or8(yr8 yr8Var, int i, int i2) {
        this.q = yr8Var;
        this.f1671o = i;
        this.p = i2;
    }

    @Override // o.lr8
    public final int b() {
        return this.q.c() + this.f1671o + this.p;
    }

    @Override // o.lr8
    public final int c() {
        return this.q.c() + this.f1671o;
    }

    @Override // o.lr8
    public final boolean f() {
        return true;
    }

    @Override // o.lr8
    public final Object[] g() {
        return this.q.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        v67.t(i, this.p);
        return this.q.get(i + this.f1671o);
    }

    @Override // o.yr8, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final yr8 subList(int i, int i2) {
        v67.v(i, i2, this.p);
        int i3 = this.f1671o;
        return this.q.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
