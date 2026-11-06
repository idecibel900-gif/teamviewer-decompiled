package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class pr8 implements ServiceConnection {
    public final d60 a;
    public final kr8 b;
    public final kr8 c;
    public final int d;
    public final /* synthetic */ c60 e;

    public pr8(c60 c60Var, d60 d60Var, int i) {
        this.e = c60Var;
        b77 b77Var = c60Var.E;
        this.b = new kr8(b77Var);
        this.c = new kr8(b77Var);
        this.a = d60Var;
        this.d = i;
    }

    public final Long a(boolean z) {
        Object obj = this.e.a;
        try {
            if (z) {
                synchronized (obj) {
                    try {
                        kr8 kr8Var = this.b;
                        if (!kr8Var.b) {
                            return null;
                        }
                        long jQ = kr8Var.a.q();
                        if (!kr8Var.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        kr8Var.b = false;
                        long j = (jQ - kr8Var.d) + kr8Var.c;
                        kr8Var.c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    kr8 kr8Var2 = this.c;
                    if (!kr8Var2.b) {
                        return null;
                    }
                    long jQ2 = kr8Var2.a.q();
                    if (!kr8Var2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    kr8Var2.b = false;
                    long j2 = (jQ2 - kr8Var2.d) + kr8Var2.c;
                    kr8Var2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            tr8.i("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        tr8.i("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    public final void b(g60 g60Var, int i, String str, boolean z, int i2) {
        try {
            jw8 jw8VarP = kw8.p();
            jw8VarP.d(g60Var.a);
            String str2 = g60Var.c;
            jw8VarP.b();
            kw8.r((kw8) jw8VarP.n, str2);
            jw8VarP.c(i);
            jw8VarP.b();
            kw8.s((kw8) jw8VarP.n, i2);
            if (str != null) {
                jw8VarP.b();
                kw8.q((kw8) jw8VarP.n, str);
            }
            Long lA = a(z);
            c60 c60Var = this.e;
            if (!z) {
                fx8 fx8VarO = gx8.o();
                fx8VarO.b();
                gx8.p((gx8) fx8VarO.n, (kw8) jw8VarP.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    fx8VarO.b();
                    gx8.q((gx8) fx8VarO.n, jLongValue);
                }
                c60Var.h.Q((gx8) fx8VarO.a());
                return;
            }
            ix8 ix8VarO = jx8.o();
            int i3 = this.d;
            ix8VarO.c(i3 > 0);
            ix8VarO.d(i3);
            ix8VarO.b();
            jx8.s((jx8) ix8VarO.n, i2);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                ix8VarO.b();
                jx8.r((jx8) ix8VarO.n, jLongValue2);
            }
            fw8 fw8VarR = gw8.r();
            fw8VarR.c(jw8VarP);
            fw8VarR.e(6);
            fw8VarR.d(ix8VarO);
            c60Var.v((gw8) fw8VarR.a());
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(int i, boolean z) {
        try {
            Long lA = a(z);
            c60 c60Var = this.e;
            if (!z) {
                fx8 fx8VarO = gx8.o();
                jw8 jw8VarP = kw8.p();
                jw8VarP.d(0);
                jw8VarP.b();
                kw8.s((kw8) jw8VarP.n, i);
                fx8VarO.b();
                gx8.p((gx8) fx8VarO.n, (kw8) jw8VarP.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    fx8VarO.b();
                    gx8.q((gx8) fx8VarO.n, jLongValue);
                }
                c60Var.h.Q((gx8) fx8VarO.a());
                return;
            }
            hw8 hw8VarP = iw8.p();
            hw8VarP.b();
            iw8.o((iw8) hw8VarP.n, 6);
            ix8 ix8VarO = jx8.o();
            int i2 = this.d;
            ix8VarO.c(i2 > 0);
            ix8VarO.d(i2);
            ix8VarO.b();
            jx8.s((jx8) ix8VarO.n, i);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                ix8VarO.b();
                jx8.r((jx8) ix8VarO.n, jLongValue2);
            }
            hw8VarP.b();
            iw8.u((iw8) hw8VarP.n, (jx8) ix8VarO.a());
            c60Var.w((iw8) hw8VarP.a());
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void d(g60 g60Var) {
        c60 c60Var = this.e;
        synchronized (c60Var.a) {
            try {
                if (c60Var.b == 3) {
                    return;
                }
                try {
                    this.a.G(g60Var);
                } catch (Throwable th) {
                    tr8.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(Exception exc, boolean z, int i) {
        int i2;
        tr8.i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 132;
        } else if (exc instanceof RemoteException) {
            i2 = 134;
        } else {
            i2 = exc instanceof SecurityException ? 133 : 131;
        }
        int i3 = i2;
        String strA = gt8.a(exc);
        this.e.y(0);
        b(z2 ? jt8.h : jt8.f, i3, strA, z, i);
        d(z2 ? jt8.h : jt8.f);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final void f(Exception exc, boolean z) {
        int i;
        int i2;
        String strA;
        g60 g60Var;
        g60 g60Var2;
        tr8.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            i2 = 91;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    i2 = 92;
                } else {
                    i = 42;
                }
                if (ua5.a(i, 42)) {
                    strA = gt8.a(exc);
                } else {
                    strA = null;
                }
                String str = strA;
                this.e.y(0);
                if (z2) {
                    g60Var = jt8.h;
                } else {
                    g60Var = jt8.f;
                }
                b(g60Var, i, str, z, 0);
                if (z2) {
                    g60Var2 = jt8.h;
                } else {
                    g60Var2 = jt8.f;
                }
                d(g60Var2);
            }
            i2 = 90;
        }
        i = i2;
        if (ua5.a(i, 42)) {
            strA = gt8.a(exc);
        } else {
            strA = null;
        }
        String str2 = strA;
        this.e.y(0);
        if (z2) {
            g60Var = jt8.h;
        } else {
            g60Var = jt8.f;
        }
        b(g60Var, i, str2, z, 0);
        if (z2) {
            g60Var2 = jt8.h;
        } else {
            g60Var2 = jt8.f;
        }
        d(g60Var2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        tr8.h("BillingClient", "Billing service died.");
        try {
            c60 c60Var = this.e;
            synchronized (c60Var.a) {
                z = true;
                z2 = c60Var.b == 1;
            }
            lh7 lh7Var = c60Var.h;
            if (z2) {
                fw8 fw8VarR = gw8.r();
                fw8VarR.e(6);
                jw8 jw8VarP = kw8.p();
                jw8VarP.c(110);
                fw8VarR.c(jw8VarP);
                ix8 ix8VarO = jx8.o();
                int i = this.d;
                if (i <= 0) {
                    z = false;
                }
                ix8VarO.c(z);
                ix8VarO.d(i);
                fw8VarR.d(ix8VarO);
                lh7Var.J((gw8) fw8VarR.a());
            } else {
                lh7Var.N(lw8.o());
            }
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
        c60 c60Var2 = this.e;
        synchronized (c60Var2.a) {
            if (c60Var2.b != 3 && c60Var2.b != 0) {
                c60Var2.y(0);
                c60Var2.A();
                try {
                    this.a.H();
                } catch (Throwable th2) {
                    tr8.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yq8 wq8Var;
        tr8.g("BillingClient", "Billing service connected.");
        c60 c60Var = this.e;
        synchronized (c60Var.a) {
            try {
                if (c60Var.b == 3) {
                    return;
                }
                int i = xq8.d;
                if (iBinder == null) {
                    wq8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    wq8Var = iInterfaceQueryLocalInterface instanceof yq8 ? (yq8) iInterfaceQueryLocalInterface : new wq8(iBinder, "com.android.vending.billing.IInAppBillingService", (byte) 1);
                }
                c60Var.i = wq8Var;
                if (c60.g(new Callable() { // from class: o.mr8
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        yq8 yq8Var;
                        pr8 pr8Var = this.a;
                        c60 c60Var2 = pr8Var.e;
                        synchronized (c60Var2.a) {
                            try {
                                if (c60Var2.b == 3) {
                                    return null;
                                }
                                int i2 = 0;
                                boolean z = true;
                                int i3 = 1;
                                if (c60Var2.b != 1) {
                                    z = false;
                                }
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    tr8.b(bundle, c60Var2.d, c60Var2.D.longValue());
                                }
                                synchronized (c60Var2.a) {
                                    yq8Var = c60Var2.i;
                                }
                                c60 c60Var3 = pr8Var.e;
                                if (yq8Var == null) {
                                    c60Var3.y(0);
                                    int i4 = pr8Var.d;
                                    g60 g60Var = jt8.h;
                                    c60Var3.x(107, i4, g60Var);
                                    pr8Var.d(g60Var);
                                    return null;
                                }
                                String packageName = c60Var3.g.getPackageName();
                                try {
                                    wq8 wq8Var2 = (wq8) yq8Var;
                                    if (wq8Var2.e(25, packageName, "inapp") != 0) {
                                        int iE = 3;
                                        int i5 = 29;
                                        while (true) {
                                            if (i5 < 3) {
                                                i5 = 0;
                                                break;
                                            }
                                            try {
                                                tr8.g("BillingClient", fx3.e(i5, "trying subs apiVersion: "));
                                                iE = bundle == null ? wq8Var2.e(i5, packageName, "subs") : wq8Var2.f(i5, packageName, "subs", bundle);
                                                if (iE == 0) {
                                                    tr8.g("BillingClient", fx3.e(i5, "highestLevelSupportedForSubs: "));
                                                    break;
                                                }
                                                i5--;
                                            } catch (Exception e) {
                                                pr8Var.f(e, z);
                                            }
                                        }
                                        c60 c60Var4 = pr8Var.e;
                                        c60Var4.k = i5 >= 3 ? z : false;
                                        if (i5 < 3) {
                                            tr8.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i3 = 9;
                                        }
                                        for (int i6 = 29; i6 >= 3; i6--) {
                                            tr8.g("BillingClient", fx3.e(i6, "trying inapp apiVersion: "));
                                            iE = bundle == null ? wq8Var2.e(i6, packageName, "inapp") : wq8Var2.f(i6, packageName, "inapp", bundle);
                                            if (iE == 0) {
                                                c60Var4.l = i6;
                                                tr8.g("BillingClient", "mHighestLevelSupportedForInApp: " + i6);
                                                break;
                                            }
                                        }
                                        c60.n(c60Var4, c60Var4.l);
                                        if (c60Var4.l < 3) {
                                            tr8.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i3 = 36;
                                        }
                                        int i7 = i3;
                                        c60.o(c60Var4, iE);
                                        if (iE == 0) {
                                            pr8Var.c(0, z);
                                            pr8Var.d(jt8.g);
                                            return null;
                                        }
                                        g60 g60Var2 = jt8.a;
                                        pr8Var.b(g60Var2, i7, null, z, 0);
                                        pr8Var.d(g60Var2);
                                        return null;
                                    }
                                    c60 c60Var5 = pr8Var.e;
                                    synchronized (au8.class) {
                                    }
                                    synchronized (au8.class) {
                                    }
                                    synchronized (au8.class) {
                                    }
                                    synchronized (au8.class) {
                                    }
                                    long jMin = 100;
                                    Exception e2 = null;
                                    while (true) {
                                        long j = i2;
                                        if (j > 3) {
                                            break;
                                        }
                                        try {
                                            Boolean boolValueOf = Boolean.valueOf(z);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("callingPackage", c60Var5.g.getPackageName());
                                            tr8.b(bundle2, c60Var5.d, c60Var5.D.longValue());
                                            if (c60Var5.y != null) {
                                                bundle2.putBoolean("enablePendingPurchases", true);
                                            }
                                            if (c60Var5.y != null) {
                                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z);
                                            }
                                            wq8Var2.l(c60Var5.g.getPackageName(), bundle2, new bs8(c60Var5, pr8Var, boolValueOf, i2));
                                        } catch (SecurityException e3) {
                                            pr8Var.e(e3, z, i2);
                                        } catch (Exception e4) {
                                            e2 = e4;
                                            if (j != 3) {
                                                tr8.i("BillingClient", to7.j(jMin, "Transient error during initialize(), retrying in ", "ms"), e2);
                                                try {
                                                    Thread.sleep(jMin);
                                                    jMin = (long) Math.min(jMin * 2.0d, 60000.0d);
                                                    i2++;
                                                } catch (InterruptedException e5) {
                                                    Thread.currentThread().interrupt();
                                                    pr8Var.e(e5, z, i2);
                                                }
                                            } else {
                                                pr8Var.e(e2, z, i2);
                                            }
                                        }
                                    }
                                    pr8Var.e(e2, z, i2);
                                } catch (Exception e6) {
                                    pr8Var.f(e6, z);
                                }
                                return null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, 30000L, new mt8((Object) this, (byte) 28), Looper.myLooper() == null ? c60Var.e : new Handler(Looper.myLooper()), c60Var.f()) == null) {
                    int i2 = this.d;
                    g60 g60VarJ = c60Var.j();
                    c60Var.x(25, i2, g60VarJ);
                    d(g60VarJ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        tr8.h("BillingClient", "Billing service disconnected.");
        try {
            c60 c60Var = this.e;
            synchronized (c60Var.a) {
                z = true;
                z2 = c60Var.b == 1;
            }
            lh7 lh7Var = c60Var.h;
            if (z2) {
                fw8 fw8VarR = gw8.r();
                fw8VarR.e(6);
                jw8 jw8VarP = kw8.p();
                jw8VarP.c(109);
                fw8VarR.c(jw8VarP);
                ix8 ix8VarO = jx8.o();
                int i = this.d;
                if (i <= 0) {
                    z = false;
                }
                ix8VarO.c(z);
                ix8VarO.d(i);
                fw8VarR.d(ix8VarO);
                lh7Var.J((gw8) fw8VarR.a());
            } else {
                lh7Var.R(hx8.o());
            }
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
        c60 c60Var2 = this.e;
        synchronized (c60Var2.a) {
            try {
                if (r47.d) {
                    if (c60Var2.b != 3 && c60Var2.b != 0) {
                        kr8 kr8Var = this.c;
                        kr8Var.c = 0L;
                        kr8Var.b = false;
                        kr8Var.a();
                    }
                    return;
                }
                kr8 kr8Var2 = this.c;
                kr8Var2.c = 0L;
                kr8Var2.b = false;
                kr8Var2.a();
                if (c60Var2.b == 3) {
                    return;
                }
                c60Var2.y(0);
                try {
                    this.a.H();
                } catch (Throwable th2) {
                    tr8.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
