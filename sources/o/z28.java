package o;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class z28 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2665o;
    public final /* synthetic */ e38 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z28(e38 e38Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = e38Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        e38 e38Var = this.p;
        switch (b) {
            case 0:
                z28 z28Var = new z28(e38Var, hc1Var, (byte) 0);
                z28Var.f2665o = obj;
                return z28Var;
            default:
                z28 z28Var2 = new z28(e38Var, hc1Var, (byte) 1);
                z28Var2.f2665o = obj;
                return z28Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        y08 y08Var = (y08) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((z28) create(y08Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        y08 y08Var;
        Object objA;
        Object objB;
        y08 y08Var2;
        Object objA2;
        m65[] m65VarArr;
        m65 m65Var;
        byte b = this.m;
        x08 x08Var = x08.n;
        ne1 ne1Var = ne1.m;
        boolean z = true;
        e38 e38Var = this.p;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                byte b2 = this.n;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            y08Var = (y08) this.f2665o;
                            ct1.a0(obj);
                            objA = obj;
                        } else {
                            if (b2 != 2) {
                                hk0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ct1.a0(obj);
                            objB = obj;
                        }
                        return (Set) objB;
                    }
                    ct1.a0(obj);
                    y08Var = (y08) this.f2665o;
                    this.f2665o = y08Var;
                    this.n = (byte) 1;
                    objA = y08Var.a(this);
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                    if (!((Boolean) objA).booleanValue()) {
                        mf7 mf7Var = new mf7(e38Var, hc1Var, (byte) 6);
                        this.f2665o = null;
                        this.n = (byte) 2;
                        objB = y08Var.b(x08Var, mf7Var, this);
                        if (objB == ne1Var) {
                            return ne1Var;
                        }
                        return (Set) objB;
                    }
                } catch (SQLException unused) {
                }
                return la2.m;
            default:
                byte b3 = this.n;
                f88 f88Var = f88.a;
                if (b3 != 0) {
                    if (b3 == 1) {
                        y08Var2 = (y08) this.f2665o;
                        ct1.a0(obj);
                        objA2 = obj;
                    } else {
                        if (b3 != 2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    return f88Var;
                }
                ct1.a0(obj);
                y08Var2 = (y08) this.f2665o;
                this.f2665o = y08Var2;
                this.n = (byte) 1;
                objA2 = y08Var2.a(this);
                if (objA2 == ne1Var) {
                    return ne1Var;
                }
                if (!((Boolean) objA2).booleanValue()) {
                    io.sentry.z7 z7Var = e38Var.h;
                    long[] jArr = (long[]) z7Var.c;
                    ReentrantLock reentrantLock = (ReentrantLock) z7Var.b;
                    reentrantLock.lock();
                    try {
                        if (z7Var.a) {
                            boolean z2 = false;
                            z7Var.a = false;
                            int length = jArr.length;
                            m65VarArr = new m65[length];
                            int i = 0;
                            boolean z3 = false;
                            while (i < length) {
                                if (jArr[i] > 0) {
                                    z2 = z;
                                }
                                boolean[] zArr = (boolean[]) z7Var.d;
                                if (z2 != zArr[i]) {
                                    zArr[i] = z2;
                                    m65Var = z2 ? m65.n : m65.f1440o;
                                    z3 = true;
                                } else {
                                    m65Var = m65.m;
                                }
                                m65VarArr[i] = m65Var;
                                i++;
                                z = true;
                                z2 = false;
                            }
                            if (!z3) {
                                m65VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            m65VarArr = null;
                        }
                        if (m65VarArr != null) {
                            d38 d38Var = new d38(m65VarArr, e38Var, y08Var2, null);
                            this.f2665o = null;
                            this.n = (byte) 2;
                            if (y08Var2.b(x08Var, d38Var, this) == ne1Var) {
                                return ne1Var;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return f88Var;
        }
    }
}
