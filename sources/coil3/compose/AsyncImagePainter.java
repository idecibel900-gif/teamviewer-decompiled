package coil3.compose;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import o.a17;
import o.ba2;
import o.be1;
import o.bg5;
import o.bp3;
import o.cj3;
import o.d82;
import o.de1;
import o.fe1;
import o.fm1;
import o.g22;
import o.ge3;
import o.gm1;
import o.h57;
import o.hc1;
import o.hm3;
import o.ie3;
import o.im3;
import o.ke3;
import o.l97;
import o.me1;
import o.n87;
import o.ne3;
import o.nv1;
import o.oi6;
import o.pe1;
import o.pp5;
import o.px;
import o.qx;
import o.rb1;
import o.rx;
import o.sb1;
import o.se3;
import o.sx;
import o.t36;
import o.t96;
import o.tv0;
import o.tx;
import o.u52;
import o.ud5;
import o.va8;
import o.vx;
import o.x45;
import o.y07;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Lo/ud5;", "Lo/t96;", "o/qx", "o/sx", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsyncImagePainter extends ud5 implements t96 {
    public static final px G = new px((byte) 0);
    public vx B;
    public qx C;
    public final l97 D;
    public final l97 E;
    public final t36 F;
    public tv0 t;
    public boolean u;
    public bp3 v;
    public me1 x;
    public final bg5 r = h57.p(null);
    public float s = 1.0f;
    public long w = 9205357640488583168L;
    public Function1 y = G;
    public sb1 z = rb1.b;
    public boolean A = true;

    public AsyncImagePainter(qx qxVar) {
        this.C = qxVar;
        this.D = im3.k(qxVar);
        l97 l97VarK = im3.k(rx.a);
        this.E = l97VarK;
        this.F = yo1.u(l97VarK);
    }

    @Override // o.t96
    public final void a() {
        bp3 bp3Var = this.v;
        if (bp3Var != null) {
            bp3Var.j(null);
        }
        this.v = null;
        Object objK = k();
        t96 t96Var = objK instanceof t96 ? (t96) objK : null;
        if (t96Var != null) {
            t96Var.a();
        }
        this.u = false;
    }

    @Override // o.t96
    public final void b() {
        bp3 bp3Var = this.v;
        if (bp3Var != null) {
            bp3Var.j(null);
        }
        this.v = null;
        Object objK = k();
        t96 t96Var = objK instanceof t96 ? (t96) objK : null;
        if (t96Var != null) {
            t96Var.b();
        }
        this.u = false;
    }

    @Override // o.t96
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objK = k();
            t96 t96Var = objK instanceof t96 ? (t96) objK : null;
            if (t96Var != null) {
                t96Var.c();
            }
            l();
            this.u = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // o.ud5
    public final boolean d(float f) {
        this.s = f;
        return true;
    }

    @Override // o.ud5
    public final boolean e(tv0 tv0Var) {
        this.t = tv0Var;
        return true;
    }

    @Override // o.ud5
    public final long i() {
        ud5 ud5VarK = k();
        if (ud5VarK != null) {
            return ud5VarK.i();
        }
        return 9205357640488583168L;
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        long jD = u52Var.d();
        if (!y07.a(this.w, jD)) {
            this.w = jD;
        }
        ud5 ud5VarK = k();
        if (ud5VarK != null) {
            ud5VarK.g(u52Var, u52Var.d(), this.s, this.t);
        }
    }

    public final ud5 k() {
        return (ud5) this.r.getValue();
    }

    public final void l() {
        qx qxVar = this.C;
        if (qxVar == null) {
            return;
        }
        me1 me1Var = this.x;
        hc1 hc1Var = null;
        if (me1Var == null) {
            im3.e0("scope");
            throw null;
        }
        tx txVar = new tx(this, qxVar, hc1Var, (byte) 0);
        de1 coroutineContext = me1Var.getCoroutineContext();
        int i = va8.b;
        be1 be1VarL0 = coroutineContext.l0(d82.y);
        fe1 fe1Var = be1VarL0 instanceof fe1 ? (fe1) be1VarL0 : null;
        pe1 pe1Var = pe1.p;
        n87 n87VarQ = (fe1Var == null || fe1Var.equals(g22.b)) ? im3.Q(me1Var, g22.b, pe1Var, txVar) : im3.Q(hm3.c(new fm1(me1Var.getCoroutineContext())), new gm1(fe1Var), pe1Var, txVar);
        bp3 bp3Var = this.v;
        if (bp3Var != null) {
            bp3Var.j(null);
        }
        this.v = n87VarQ;
    }

    public final void m(qx qxVar) {
        if (im3.n(this.C, qxVar)) {
            return;
        }
        this.C = qxVar;
        if (qxVar == null) {
            bp3 bp3Var = this.v;
            if (bp3Var != null) {
                bp3Var.j(null);
            }
            this.v = null;
        } else if (this.u) {
            l();
        }
        if (qxVar != null) {
            l97 l97Var = this.D;
            l97Var.getClass();
            l97Var.l(null, qxVar);
        }
    }

    public final ke3 n(ke3 ke3Var, boolean z) {
        ge3 ge3VarA = ke3.a(ke3Var);
        ge3VarA.d = new cj3((Object) ke3Var, (Object) this, (byte) 21);
        ie3 ie3Var = ke3Var.t;
        if (ie3Var.j == null) {
            ge3VarA.p = a17.a;
        }
        if (ie3Var.k == null) {
            sb1 sb1Var = this.z;
            int i = va8.b;
            ge3VarA.q = (im3.n(sb1Var, rb1.b) || im3.n(sb1Var, rb1.c)) ? oi6.n : oi6.m;
        }
        if (ie3Var.l == null) {
            ge3VarA.r = pp5.n;
        }
        if (z) {
            ba2 ba2Var = ba2.m;
            ge3VarA.g = ba2Var;
            ge3VarA.h = ba2Var;
            ge3VarA.i = ba2Var;
        }
        return ge3VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0048, please report this as an issue */
    public final void o(sx sxVar) {
        se3 se3Var;
        Object objA;
        t96 t96Var;
        t96 t96Var2;
        l97 l97Var = this.E;
        sx sxVar2 = (sx) l97Var.getValue();
        sx sxVar3 = (sx) this.y.invoke(sxVar);
        l97Var.k(sxVar3);
        if (!(sxVar3 instanceof AsyncImagePainter$State$Success)) {
            if (sxVar3 instanceof AsyncImagePainter$State$Error) {
                se3Var = ((AsyncImagePainter$State$Error) sxVar3).a;
            }
            this.r.setValue(sxVar3.getPainter());
            if (sxVar2.getPainter() != sxVar3.getPainter()) {
                objA = sxVar2.getPainter();
                if (objA instanceof t96) {
                    t96Var = (t96) objA;
                } else {
                    t96Var = null;
                }
                if (t96Var != null) {
                    t96Var.b();
                }
                Object objA2 = sxVar3.getPainter();
                t96Var2 = objA2 instanceof t96 ? (t96) objA2 : null;
                if (t96Var2 != null) {
                    t96Var2.c();
                }
            }
        }
        se3Var = ((AsyncImagePainter$State$Success) sxVar3).a;
        ((x45) nv1.w(se3Var.p(), ne3.a)).getClass();
        this.r.setValue(sxVar3.getPainter());
        if (sxVar2.getPainter() != sxVar3.getPainter()) {
            objA = sxVar2.getPainter();
            if (objA instanceof t96) {
                t96Var = (t96) objA;
            } else {
                t96Var = null;
            }
            if (t96Var != null) {
                t96Var.b();
            }
            Object objA3 = sxVar3.getPainter();
            if (objA3 instanceof t96) {
            }
            if (t96Var2 != null) {
                t96Var2.c();
            }
        }
    }
}
