package io.sentry.android.replay.screenshot;

import kotlin.jvm.functions.Function0;
import o.eb8;
import o.g60;
import o.gc8;
import o.hw2;
import o.i01;
import o.jv;
import o.mn2;
import o.p72;
import o.pn5;
import o.qo;
import o.v65;

/* JADX INFO: loaded from: classes.dex */
public final class h implements jv, v65, gc8 {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f166o;

    public h(int i, int i2, p72 p72Var) {
        this.m = i;
        this.n = i2;
        this.f166o = new pn5(new mn2(i, i2, p72Var));
    }

    @Override // o.jv
    public void c(int i, Object obj) {
        ((jv) this.f166o).c(i + (this.n == 0 ? this.m : 0), obj);
    }

    @Override // o.jv
    public void d(Object obj) {
        this.n++;
        ((jv) this.f166o).d(obj);
    }

    @Override // o.jv
    public void e() {
        ((jv) this.f166o).e();
    }

    @Override // o.jv
    public void f(int i, int i2, int i3) {
        int i4 = this.n == 0 ? this.m : 0;
        ((jv) this.f166o).f(i + i4, i2 + i4, i3);
    }

    @Override // o.jv
    public void g(int i, int i2) {
        ((jv) this.f166o).g(i + (this.n == 0 ? this.m : 0), i2);
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.f166o).h(j, qoVar, qoVar2, qoVar3);
    }

    @Override // o.jv
    public void i() {
        if (this.n <= 0) {
            i01.a("OffsetApplier up called with no corresponding down");
        }
        this.n--;
        ((jv) this.f166o).i();
    }

    @Override // o.jv
    public void j(int i, Object obj) {
        ((jv) this.f166o).j(i + (this.n == 0 ? this.m : 0), obj);
    }

    @Override // o.v65
    public int k(int i) {
        int iK = ((v65) this.f166o).k(i);
        if (i >= 0 && i <= this.n) {
            eb8.c(iK, this.m, i);
        }
        return iK;
    }

    @Override // o.jv
    public Object m() {
        return ((jv) this.f166o).m();
    }

    @Override // o.gc8
    public int n() {
        return this.n;
    }

    @Override // o.jv
    public void o(Object obj, hw2 hw2Var) {
        ((jv) this.f166o).o(obj, hw2Var);
    }

    public g60 p() {
        g60 g60Var = new g60();
        g60Var.a = this.m;
        g60Var.b = this.n;
        g60Var.c = (String) this.f166o;
        return g60Var;
    }

    @Override // o.v65
    public int q(int i) {
        int iQ = ((v65) this.f166o).q(i);
        if (i >= 0 && i <= this.m) {
            eb8.b(iQ, this.n, i);
        }
        return iQ;
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.f166o).u(j, qoVar, qoVar2, qoVar3);
    }

    @Override // o.gc8
    public int v() {
        return this.m;
    }

    public h(int i, int i2, Function0 function0) {
        this.m = i;
        this.n = i2;
        this.f166o = function0;
    }

    public h() {
        this.f166o = new h[256];
        this.m = 0;
        this.n = 0;
    }

    public h(v65 v65Var, int i, int i2) {
        this.f166o = v65Var;
        this.m = i;
        this.n = i2;
    }
}
