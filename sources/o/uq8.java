package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uq8 extends sq8 {
    public static final uq8 q = new uq8(0, new Object[0]);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f2239o;
    public final transient int p;

    public uq8(int i, Object[] objArr) {
        this.f2239o = objArr;
        this.p = i;
    }

    @Override // o.jq8
    public final Object[] a() {
        return this.f2239o;
    }

    @Override // o.jq8
    public final int b() {
        return 0;
    }

    @Override // o.jq8
    public final int c() {
        return this.p;
    }

    @Override // o.sq8, o.jq8
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f2239o;
        int i = this.p;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i67.H(i, this.p);
        Object obj = this.f2239o[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
