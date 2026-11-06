package o;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ml implements be1 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1480o;

    public ml(ml mlVar) {
        this.m = (byte) 2;
        this.n = mlVar;
        this.f1480o = new io.sentry.z7((byte) 4);
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return xk0.G(this, de1Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final Object a(Function1 function1, hc1 hc1Var) {
        xh5 xh5Var;
        boolean z;
        Object objQ;
        switch (this.m) {
            case 0:
                kl klVar = (kl) this.f1480o;
                gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
                gl0Var.t();
                ll llVar = new ll(gl0Var, this, function1);
                if (im3.n(klVar.f1276o, (Choreographer) this.n)) {
                    synchronized (klVar.q) {
                        klVar.s.add(llVar);
                        if (!klVar.v) {
                            klVar.v = true;
                            klVar.f1276o.postFrameCallback(klVar.w);
                        }
                        break;
                    }
                    gl0Var.v(new y2(klVar, llVar, (byte) 3));
                } else {
                    ((Choreographer) this.n).postFrameCallback(llVar);
                    gl0Var.v(new y2(this, llVar, (byte) 4));
                }
                return gl0Var.q();
            case 1:
                gl0 gl0Var2 = new gl0(1, vt1.A(hc1Var));
                gl0Var2.t();
                yc4 yc4Var = (yc4) this.f1480o;
                qb0 qb0Var = new qb0();
                qb0Var.a = gl0Var2;
                qb0Var.b = function1;
                gl0Var2.v(new t(yc4Var.l(qb0Var, (k56) this.n), (byte) 10));
                return gl0Var2.q();
            default:
                if (hc1Var instanceof xh5) {
                    xh5Var = (xh5) hc1Var;
                    int i = xh5Var.p;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xh5Var.p = i - Integer.MIN_VALUE;
                    } else {
                        xh5Var = new xh5(this, hc1Var);
                    }
                } else {
                    xh5Var = new xh5(this, hc1Var);
                }
                Object obj = xh5Var.n;
                ne1 ne1Var = ne1.m;
                int i2 = xh5Var.p;
                if (i2 == 0) {
                    ct1.a0(obj);
                    io.sentry.z7 z7Var = (io.sentry.z7) this.f1480o;
                    xh5Var.m = function1;
                    xh5Var.p = 1;
                    synchronized (z7Var.b) {
                        z = z7Var.a;
                    }
                    if (z) {
                        objQ = f88.a;
                    } else {
                        gl0 gl0Var3 = new gl0(1, vt1.A(xh5Var));
                        gl0Var3.t();
                        synchronized (z7Var.b) {
                            ((ArrayList) z7Var.c).add(gl0Var3);
                        }
                        gl0Var3.v(new y2(z7Var, gl0Var3, (byte) 11));
                        objQ = gl0Var3.q();
                        if (objQ != ne1Var) {
                            objQ = f88.a;
                        }
                    }
                    if (objQ != ne1Var) {
                    }
                    return ne1Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = xh5Var.m;
                ct1.a0(obj);
                ml mlVar = (ml) this.n;
                xh5Var.m = null;
                xh5Var.p = 2;
                Object objA = mlVar.a(function1, xh5Var);
                if (objA != ne1Var) {
                    return objA;
                }
                return ne1Var;
        }
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return hw2Var.invoke(obj, this);
    }

    @Override // o.be1
    public ce1 getKey() {
        return yl7.E;
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return xk0.v(this, ce1Var);
    }

    public ml(Choreographer choreographer, kl klVar) {
        this.m = (byte) 0;
        this.n = choreographer;
        this.f1480o = klVar;
    }

    public ml(k56 k56Var) {
        this.m = (byte) 1;
        this.n = k56Var;
        this.f1480o = new yc4((byte) 4);
    }
}
