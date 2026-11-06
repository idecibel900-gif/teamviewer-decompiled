package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hm4 {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f988o;
    public Object p;

    public hm4() {
        if (rk5.n == null) {
            rk5.n = new rk5((byte) 16);
        }
    }

    public int a(int i) {
        if (i < this.f988o) {
            return ((ByteBuffer) this.p).getShort(this.n + i);
        }
        return 0;
    }

    public void b() {
        if (((im4) this.p).t == this.f988o) {
            return;
        }
        gk0.c();
    }

    public void c() {
        while (true) {
            int i = this.m;
            im4 im4Var = (im4) this.p;
            if (i >= im4Var.r || im4Var.f1078o[i] >= 0) {
                return;
            } else {
                this.m = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.m < ((im4) this.p).r;
    }

    public void remove() {
        im4 im4Var = (im4) this.p;
        b();
        if (this.n == -1) {
            hk0.l("Call next() before removing element from the iterator.");
            return;
        }
        im4Var.c();
        im4Var.k(this.n);
        this.n = -1;
        this.f988o = im4Var.t;
    }
}
