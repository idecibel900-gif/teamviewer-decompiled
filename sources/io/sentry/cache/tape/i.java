package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;
import o.gk0;
import o.hk0;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator {
    public int m = 0;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f187o;
    public final /* synthetic */ j p;

    public i(j jVar) {
        this.p = jVar;
        this.n = jVar.q.a;
        this.f187o = jVar.t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j jVar = this.p;
        if (jVar.w) {
            hk0.l("closed");
            return false;
        }
        if (jVar.t == this.f187o) {
            return this.m != jVar.p;
        }
        gk0.c();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = j.x;
        j jVar = this.p;
        if (jVar.w) {
            hk0.l("closed");
            return null;
        }
        if (jVar.t != this.f187o) {
            gk0.c();
            return null;
        }
        int i = jVar.p;
        if (i == 0) {
            yq4.p();
            return null;
        }
        if (this.m >= i) {
            yq4.p();
            return null;
        }
        try {
            h hVarB0 = jVar.b0(this.n);
            int i2 = hVarB0.b;
            long j = hVarB0.a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jP0 = jVar.P0(j2);
            this.n = jP0;
            if (!jVar.N0(i2, jP0, bArr2)) {
                this.m = jVar.p;
                return bArr;
            }
            this.n = jVar.P0(j2 + ((long) i2));
            this.m++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            jVar.M0();
            this.m = jVar.p;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        j jVar = this.p;
        if (jVar.t != this.f187o) {
            gk0.c();
            return;
        }
        if (jVar.p == 0) {
            yq4.p();
        } else {
            if (this.m != 1) {
                yq4.r("Removal is only permitted from the head.");
                return;
            }
            jVar.L0(1);
            this.f187o = jVar.t;
            this.m--;
        }
    }
}
