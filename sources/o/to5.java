package o;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class to5 implements y08, u06 {
    public final f51 a;
    public final boolean b;
    public final kw c = new kw();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public to5(f51 f51Var, boolean z) {
        this.a = f51Var;
        this.b = z;
    }

    @Override // o.y08
    public final Object a(og7 og7Var) {
        if (this.d.get()) {
            us1.P(21, "Connection is recycled");
            throw null;
        }
        g41 g41Var = (g41) og7Var.getContext().l0(g41.n);
        if (g41Var != null && g41Var.m == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        us1.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // o.y08
    public final Object b(x08 x08Var, hw2 hw2Var, og7 og7Var) {
        if (this.d.get()) {
            us1.P(21, "Connection is recycled");
            throw null;
        }
        g41 g41Var = (g41) og7Var.getContext().l0(g41.n);
        if (g41Var != null && g41Var.m == this) {
            return g(x08Var, hw2Var, og7Var);
        }
        us1.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // o.u06
    public final pg6 c() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.lo5
    public final Object d(String str, Function1 function1, jc1 jc1Var) {
        so5 so5Var;
        f51 f51Var;
        if (jc1Var instanceof so5) {
            so5Var = (so5) jc1Var;
            int i = so5Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                so5Var.s = i - Integer.MIN_VALUE;
            } else {
                so5Var = new so5(this, jc1Var);
            }
        } else {
            so5Var = new so5(this, jc1Var);
        }
        Object obj = so5Var.q;
        int i2 = so5Var.s;
        if (i2 == 0) {
            ct1.a0(obj);
            if (this.d.get()) {
                us1.P(21, "Connection is recycled");
                throw null;
            }
            g41 g41Var = (g41) so5Var.getContext().l0(g41.n);
            if (g41Var == null || g41Var.m != this) {
                us1.P(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            so5Var.m = this;
            so5Var.n = str;
            so5Var.f2041o = function1;
            f51Var = this.a;
            so5Var.p = f51Var;
            so5Var.s = 1;
            Object objE = f51Var.n.e(so5Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f51 f51Var2 = so5Var.p;
            function1 = so5Var.f2041o;
            str = so5Var.n;
            to5 to5Var = so5Var.m;
            ct1.a0(obj);
            f51Var = f51Var2;
            this = to5Var;
        }
        try {
            mo5 mo5Var = new mo5(this, this.a.J0(str));
            try {
                Object objInvoke = function1.invoke(mo5Var);
                iq8.l(mo5Var, null);
                f51Var.j(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(mo5Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            f51Var.j(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(x08 x08Var, jc1 jc1Var) {
        po5 po5Var;
        f51 f51Var;
        if (jc1Var instanceof po5) {
            po5Var = (po5) jc1Var;
            int i = po5Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                po5Var.r = i - Integer.MIN_VALUE;
            } else {
                po5Var = new po5(this, jc1Var);
            }
        } else {
            po5Var = new po5(this, jc1Var);
        }
        Object obj = po5Var.p;
        int i2 = po5Var.r;
        if (i2 == 0) {
            ct1.a0(obj);
            po5Var.m = this;
            po5Var.n = x08Var;
            f51Var = this.a;
            po5Var.f1758o = f51Var;
            po5Var.r = 1;
            Object objE = f51Var.n.e(po5Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f51 f51Var2 = po5Var.f1758o;
            x08Var = po5Var.n;
            to5 to5Var = po5Var.m;
            ct1.a0(obj);
            f51Var = f51Var2;
            this = to5Var;
        }
        try {
            kw kwVar = this.c;
            f51 f51Var3 = this.a;
            int i3 = kwVar.f1309o;
            if (kwVar.isEmpty()) {
                int iOrdinal = x08Var.ordinal();
                if (iOrdinal == 0) {
                    us1.y(f51Var3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    us1.y(f51Var3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new w35();
                    }
                    us1.y(f51Var3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                us1.y(f51Var3, "SAVEPOINT '" + i3 + '\'');
            }
            kwVar.addLast(new oo5(i3));
            f88 f88Var = f88.a;
            f51Var.j(null);
            return f88Var;
        } catch (Throwable th) {
            f51Var.j(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z, jc1 jc1Var) {
        qo5 qo5Var;
        f51 f51Var;
        if (jc1Var instanceof qo5) {
            qo5Var = (qo5) jc1Var;
            int i = qo5Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo5Var.r = i - Integer.MIN_VALUE;
            } else {
                qo5Var = new qo5(this, jc1Var);
            }
        } else {
            qo5Var = new qo5(this, jc1Var);
        }
        Object obj = qo5Var.p;
        int i2 = qo5Var.r;
        if (i2 == 0) {
            ct1.a0(obj);
            qo5Var.m = this;
            f51Var = this.a;
            qo5Var.n = f51Var;
            qo5Var.f1851o = z;
            qo5Var.r = 1;
            Object objE = f51Var.n.e(qo5Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = qo5Var.f1851o;
            f51 f51Var2 = qo5Var.n;
            to5 to5Var = qo5Var.m;
            ct1.a0(obj);
            f51Var = f51Var2;
            this = to5Var;
        }
        try {
            kw kwVar = this.c;
            f51 f51Var3 = this.a;
            if (kwVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            oo5 oo5Var = (oo5) qv0.e0(kwVar);
            if (z) {
                oo5Var.getClass();
                if (kwVar.isEmpty()) {
                    us1.y(f51Var3, "END TRANSACTION");
                } else {
                    us1.y(f51Var3, "RELEASE SAVEPOINT '" + oo5Var.a + '\'');
                }
            } else if (kwVar.isEmpty()) {
                us1.y(f51Var3, "ROLLBACK TRANSACTION");
            } else {
                us1.y(f51Var3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + oo5Var.a + '\'');
            }
            f88 f88Var = f88.a;
            f51Var.j(null);
            return f88Var;
        } catch (Throwable th) {
            f51Var.j(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    public final Object g(x08 x08Var, hw2 hw2Var, jc1 jc1Var) throws Throwable {
        ro5 ro5Var;
        SQLException e;
        Throwable th;
        ?? r10;
        to5 to5Var;
        if (jc1Var instanceof ro5) {
            ro5Var = (ro5) jc1Var;
            int i = ro5Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro5Var.r = i - Integer.MIN_VALUE;
            } else {
                ro5Var = new ro5(this, jc1Var);
            }
        } else {
            ro5Var = new ro5(this, jc1Var);
        }
        Object objInvoke = ro5Var.p;
        int i2 = ro5Var.r;
        byte b = 0;
        boolean z = true;
        ne1 ne1Var = ne1.m;
        try {
            if (i2 == 0) {
                ct1.a0(objInvoke);
                if (x08Var == null) {
                    x08Var = x08.m;
                }
                ro5Var.m = this;
                ro5Var.n = (Serializable) hw2Var;
                ro5Var.r = 1;
                Object objE = e(x08Var, ro5Var);
                this = this;
                if (objE != ne1Var) {
                }
                return ne1Var;
            }
            if (i2 == 1) {
                hw2Var = (hw2) ro5Var.n;
                to5 to5Var2 = (to5) ro5Var.m;
                ct1.a0(objInvoke);
                r10 = to5Var2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj = ro5Var.m;
                        ct1.a0(objInvoke);
                        return obj;
                    }
                    if (i2 != 5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) ro5Var.n;
                    th = (Throwable) ro5Var.m;
                    try {
                        ct1.a0(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        ct1.q(th, e);
                        throw th;
                    }
                }
                z = ro5Var.f1940o;
                to5 to5Var3 = (to5) ro5Var.m;
                ct1.a0(objInvoke);
                to5Var = to5Var3;
            }
            ro5Var.m = objInvoke;
            ro5Var.r = 3;
            this = to5Var.f(z, ro5Var);
            if (this != ne1Var) {
                return ne1Var;
            }
            return objInvoke;
            no5 no5Var = new no5(r10, b);
            ro5Var.m = r10;
            ro5Var.n = null;
            ro5Var.f1940o = true;
            ro5Var.r = 2;
            objInvoke = hw2Var.invoke(no5Var, ro5Var);
            to5Var = r10;
            if (objInvoke != ne1Var) {
                ro5Var.m = objInvoke;
                ro5Var.r = 3;
                this = to5Var.f(z, ro5Var);
                if (this != ne1Var) {
                    return objInvoke;
                }
            }
            return ne1Var;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    ro5Var.m = th;
                    ro5Var.n = th3;
                    ro5Var.r = 5;
                    if (this.f(false, ro5Var) != ne1Var) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    ct1.q(th, e);
                    throw th;
                }
            }
        }
    }
}
