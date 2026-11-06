package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.d;
import io.sentry.android.core.t0;
import io.sentry.android.core.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o.at8;
import o.ay8;
import o.bi2;
import o.bz2;
import o.df6;
import o.dr8;
import o.eq8;
import o.eu8;
import o.hj8;
import o.hk0;
import o.j30;
import o.l93;
import o.lp8;
import o.nv1;
import o.nx8;
import o.pt8;
import o.pu8;
import o.rz2;
import o.sz2;
import o.tz2;
import o.ux8;
import o.uz2;
import o.w41;
import o.xv8;
import o.yq4;
import o.zs8;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final bi2[] y = new bi2[0];
    public volatile String a;
    public t0 b;
    public final Context c;
    public final ux8 d;
    public final dr8 e;
    public final Object f;
    public final Object g;
    public IGmsServiceBroker h;
    public j30 i;
    public IInterface j;
    public final ArrayList k;
    public pt8 l;
    public byte m;
    public final hj8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hj8 f35o;
    public final short p;
    public final String q;
    public volatile String r;
    public volatile df6 s;
    public w41 t;
    public boolean u;
    public volatile xv8 v;
    public final AtomicInteger w;
    public final Set x;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, Looper looper, int i, d dVar, tz2 tz2Var, uz2 uz2Var) {
        ux8 ux8Var;
        synchronized (ux8.g) {
            try {
                ux8Var = ux8.h;
                if (ux8Var == null) {
                    ux8Var = new ux8(context.getApplicationContext(), context.getMainLooper());
                    ux8.h = ux8Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object obj = rz2.c;
        nv1.s(tz2Var);
        nv1.s(uz2Var);
        hj8 hj8Var = new hj8(tz2Var, (byte) 3);
        hj8 hj8Var2 = new hj8(uz2Var, (byte) 4);
        String str = (String) dVar.q;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = (byte) 1;
        this.t = null;
        this.u = false;
        this.v = null;
        this.w = new AtomicInteger(0);
        nv1.t(context, "Context must not be null");
        this.c = context;
        nv1.t(looper, "Looper must not be null");
        this.d = ux8Var;
        this.e = new dr8(this, looper);
        this.p = i;
        this.n = hj8Var;
        this.f35o = hj8Var2;
        this.q = str;
        Set set = (Set) dVar.n;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                hk0.l("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.x = set;
    }

    public IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof lp8 ? (lp8) iInterfaceQueryLocalInterface : new lp8(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 0);
    }

    public final void b() {
        this.w.incrementAndGet();
        ArrayList arrayList = this.k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    eq8 eq8Var = (eq8) arrayList.get(i);
                    synchronized (eq8Var) {
                        eq8Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        p(1, null);
    }

    public final void c(String str) {
        this.a = str;
        b();
    }

    public bi2[] d() {
        return y;
    }

    public Bundle e() {
        return new Bundle();
    }

    public int f() {
        return 12451000;
    }

    public final void g(l93 l93Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleE = e();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.s == null || (attributionSource = (AttributionSource) this.s.n) == null || attributionSource.getAttributionTag() == null) ? this.r : attributionSource.getAttributionTag();
        String str = attributionTag;
        short s = this.p;
        int i = sz2.a;
        Scope[] scopeArr = bz2.A;
        Bundle bundle = new Bundle();
        bi2[] bi2VarArr = bz2.B;
        bz2 bz2Var = new bz2(6, s, i, null, null, scopeArr, bundle, null, bi2VarArr, bi2VarArr, true, 0, false, str);
        bz2Var.p = this.c.getPackageName();
        bz2Var.s = bundleE;
        if (set != null) {
            bz2Var.r = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            bz2Var.t = new Account("<<default account>>", "com.google");
            if (l93Var != null) {
                bz2Var.q = ((ay8) l93Var).c;
            }
        }
        bz2Var.u = y;
        bz2Var.v = d();
        if (this instanceof at8) {
            bz2Var.y = true;
        }
        try {
            synchronized (this.g) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.h;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.b(new zs8(this, this.w.get()), bz2Var);
                    } else {
                        v0.j("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            v0.l("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.w.get();
            dr8 dr8Var = this.e;
            dr8Var.sendMessage(dr8Var.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            v0.l("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.w.get();
            eu8 eu8Var = new eu8(this, 8, null, null);
            dr8 dr8Var2 = this.e;
            dr8Var2.sendMessage(dr8Var2.obtainMessage(1, i3, -1, eu8Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            v0.l("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.w.get();
            eu8 eu8Var2 = new eu8(this, 8, null, null);
            dr8 dr8Var3 = this.e;
            dr8Var3.sendMessage(dr8Var3.obtainMessage(1, i4, -1, eu8Var2));
        }
    }

    public final IInterface h() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m == 5) {
                    throw new DeadObjectException();
                }
                if (!l()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.j;
                nv1.t(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public String i() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String j() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean k() {
        return f() >= 211700000;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f) {
            byte b = this.m;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean n() {
        return false;
    }

    public final /* synthetic */ boolean o(int i, int i2, IInterface iInterface) {
        synchronized (this.f) {
            try {
                if (this.m != i) {
                    return false;
                }
                p(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(int i, IInterface iInterface) {
        t0 t0Var;
        if ((i == 4) != (iInterface != null)) {
            yq4.f();
            return;
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    pt8 pt8Var = this.l;
                    if (pt8Var != null) {
                        ux8 ux8Var = this.d;
                        String str = this.b.b;
                        nv1.s(str);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ux8Var.b(str, pt8Var, this.b.a);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    pt8 pt8Var2 = this.l;
                    if (pt8Var2 != null && (t0Var = this.b) != null) {
                        String str2 = t0Var.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        v0.c("GmsClient", sb.toString());
                        ux8 ux8Var2 = this.d;
                        String str3 = this.b.b;
                        nv1.s(str3);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        ux8Var2.b(str3, pt8Var2, this.b.a);
                        this.w.incrementAndGet();
                    }
                    pt8 pt8Var3 = new pt8(this, this.w.get());
                    this.l = pt8Var3;
                    String strJ = j();
                    boolean zK = k();
                    this.b = new t0(strJ, zK);
                    if (zK && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    ux8 ux8Var3 = this.d;
                    String str4 = this.b.b;
                    nv1.s(str4);
                    this.b.getClass();
                    String name = this.q;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    w41 w41VarA = ux8Var3.a(new nx8(str4, this.b.a), pt8Var3, name);
                    if (!(w41VarA.n == 0)) {
                        String str5 = this.b.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        v0.j("GmsClient", sb2.toString());
                        int i2 = w41VarA.n;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (w41VarA.f2376o != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", w41VarA.f2376o);
                        }
                        int i3 = this.w.get();
                        pu8 pu8Var = new pu8(this, i2, bundle);
                        dr8 dr8Var = this.e;
                        dr8Var.sendMessage(dr8Var.obtainMessage(7, i3, -1, pu8Var));
                    }
                } else if (i == 4) {
                    nv1.s(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
