package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl5 {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1179o = 0;
    public long p = kl5.b;
    public long q = 0;

    public Object E() {
        return null;
    }

    public abstract int W(ie ieVar);

    public int X() {
        return (int) (this.f1179o & 4294967295L);
    }

    public int Y() {
        return (int) (this.f1179o >> 32);
    }

    public final void a0() {
        this.m = ct1.v((int) (this.f1179o >> 32), r61.k(this.p), r61.i(this.p));
        int iV = ct1.v((int) (this.f1179o & 4294967295L), r61.j(this.p), r61.h(this.p));
        this.n = iV;
        int i = this.m;
        long j = this.f1179o;
        this.q = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iV - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void c0(long j, float f, Function1 function1);

    public void e0(long j, float f, l03 l03Var) {
        c0(j, f, null);
    }

    public final void f0(long j) {
        if (dl3.b(this.f1179o, j)) {
            return;
        }
        this.f1179o = j;
        a0();
    }

    public final void j0(long j) {
        if (r61.c(this.p, j)) {
            return;
        }
        this.p = j;
        a0();
    }
}
