package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hs8 extends yr8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f1006o;
    public final transient boolean p;
    public final transient int q;

    /* JADX WARN: Multi-variable type inference failed */
    public hs8(Object[] objArr, int i, int i2) {
        this.f1006o = objArr;
        this.p = i;
        this.q = i2;
    }

    @Override // o.lr8
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v67.t(i, this.q);
        Object obj = this.f1006o[i + i + (this.p ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
