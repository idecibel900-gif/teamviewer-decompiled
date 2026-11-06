package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class av7 implements zu7, bf5, yg4, af5 {
    public final kh6 m;
    public final /* synthetic */ bf5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yg4 f366o;
    public final Map p;

    public av7(bf5 bf5Var, yg4 yg4Var, kh6 kh6Var, Map map) {
        this.m = kh6Var;
        this.n = bf5Var;
        this.f366o = yg4Var;
        this.p = map;
    }

    @Override // o.yg4
    public final long a(i04 i04Var, i04 i04Var2) {
        return this.f366o.a(i04Var, i04Var2);
    }

    @Override // o.bf5
    public final u18 b() {
        return this.n.b();
    }

    @Override // o.bf5
    public final float c() {
        return this.n.c();
    }

    @Override // o.af5
    public final kh6 d() {
        return this.m;
    }

    @Override // o.yg4
    public final i04 e(il5 il5Var) {
        return this.f366o.e(il5Var);
    }

    @Override // o.bf5
    public final vu7 f() {
        return this.n.f();
    }

    @Override // o.wf2
    public final Map g() {
        return this.p;
    }

    @Override // o.yg4
    public final i04 h(i04 i04Var) {
        return this.f366o.h(i04Var);
    }
}
