package io.sentry;

import java.util.Iterator;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator {
    public int m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f206o;
    public final /* synthetic */ k p;

    public j(k kVar) {
        this.p = kVar;
        this.m = kVar.n;
        this.f206o = kVar.p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f206o || this.m != this.p.f207o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yq4.p();
            return null;
        }
        this.f206o = false;
        int i = this.m;
        this.n = i;
        int i2 = i + 1;
        k kVar = this.p;
        this.m = i2 < kVar.q ? i2 : 0;
        return kVar.m[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        k kVar = this.p;
        int i2 = kVar.q;
        Object[] objArr = kVar.m;
        int i3 = this.n;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        int i4 = kVar.n;
        if (i3 == i4) {
            kVar.remove();
            this.n = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = kVar.f207o)) {
            while (i5 != kVar.f207o) {
                if (i5 >= i2) {
                    objArr[i5 - 1] = objArr[0];
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr[i6] = objArr[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            System.arraycopy(objArr, i5, objArr, i3, i - i5);
        }
        this.n = -1;
        int i7 = kVar.f207o - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        kVar.f207o = i7;
        objArr[i7] = null;
        kVar.p = false;
        int i8 = this.m - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.m = i8;
    }
}
