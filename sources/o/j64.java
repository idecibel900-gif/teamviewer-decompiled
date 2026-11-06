package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j64 {
    public final bg5 A;
    public final bg5 B;
    public kv1 a;
    public final j56 b;
    public final q57 c;
    public final wk0 d;
    public ns7 e;
    public final bg5 f;
    public final bg5 g;
    public i04 h;
    public final bg5 i;
    public xo j;
    public final bg5 k;
    public final bg5 l;
    public final bg5 m;
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1135o;
    public boolean p;
    public final bg5 q;
    public final wx3 r;
    public final bg5 s;
    public final bg5 t;
    public Function1 u;
    public final od1 v;
    public final od1 w;
    public final od1 x;
    public final gy8 y;
    public long z;

    public j64(kv1 kv1Var, j56 j56Var, q57 q57Var) {
        this.a = kv1Var;
        this.b = j56Var;
        this.c = q57Var;
        wk0 wk0Var = new wk0((byte) 22, false);
        xo xoVar = yo.a;
        long j = gt7.b;
        zr7 zr7Var = new zr7(xoVar, j, (gt7) null);
        wk0Var.n = zr7Var;
        wk0Var.f2420o = new h82(xoVar, zr7Var.b);
        this.d = wk0Var;
        Boolean bool = Boolean.FALSE;
        this.f = h57.p(bool);
        this.g = h57.p(new w32(0.0f));
        this.i = h57.p(null);
        this.k = h57.p(n43.m);
        this.l = h57.p(bool);
        this.m = h57.p(bool);
        this.n = h57.p(bool);
        this.f1135o = h57.p(bool);
        this.p = true;
        this.q = h57.p(Boolean.TRUE);
        this.r = new wx3(q57Var);
        this.s = h57.p(bool);
        this.t = h57.p(bool);
        this.u = new ek3((byte) 9);
        this.v = new od1(this, (byte) 1);
        this.w = new od1(this, (byte) 2);
        this.x = new od1(this, (byte) 3);
        this.y = ka0.k();
        this.z = rv0.h;
        this.A = h57.p(new gt7(j));
        this.B = h57.p(new gt7(j));
    }

    public final n43 a() {
        return (n43) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final i04 c() {
        i04 i04Var = this.h;
        if (i04Var == null || !i04Var.m()) {
            return null;
        }
        return i04Var;
    }

    public final ws7 d() {
        return (ws7) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new gt7(j));
    }

    public final void f(long j) {
        this.A.setValue(new gt7(j));
    }
}
