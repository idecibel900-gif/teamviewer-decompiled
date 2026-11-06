package o;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class es8 extends yr8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs8 f739o;

    public es8(fs8 fs8Var) {
        this.f739o = fs8Var;
    }

    @Override // o.lr8
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        fs8 fs8Var = this.f739o;
        v67.t(i, fs8Var.r);
        Object[] objArr = fs8Var.q;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f739o.r;
    }
}
