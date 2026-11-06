package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ds8 extends yr8 {
    public static final ds8 q = new ds8(0, new Object[0]);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f651o;
    public final transient int p;

    public ds8(int i, Object[] objArr) {
        this.f651o = objArr;
        this.p = i;
    }

    @Override // o.yr8, o.lr8
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f651o;
        int i = this.p;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // o.lr8
    public final int b() {
        return this.p;
    }

    @Override // o.lr8
    public final int c() {
        return 0;
    }

    @Override // o.lr8
    public final boolean f() {
        return false;
    }

    @Override // o.lr8
    public final Object[] g() {
        return this.f651o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v67.t(i, this.p);
        Object obj = this.f651o[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
