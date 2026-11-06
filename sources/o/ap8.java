package o;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ap8 implements tz2, uz2 {
    public final com.google.android.gms.common.internal.a d;
    public final gr e;
    public final lh7 f;
    public final int i;
    public final ip8 j;
    public boolean k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vz2 f347o;
    public final LinkedList c = new LinkedList();
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final ArrayList l = new ArrayList();
    public w41 m = null;
    public int n = 0;

    public ap8(vz2 vz2Var, yp8 yp8Var) {
        this.f347o = vz2Var;
        Looper looper = vz2Var.m.getLooper();
        iu iuVarA = yp8Var.a();
        io.sentry.android.core.d dVar = new io.sentry.android.core.d((String) iuVarA.p, (String) iuVarA.n, (ax) iuVarA.f1103o);
        com.google.android.gms.common.internal.a aVarF = ((ga0) yp8Var.d.n).f(yp8Var.a, looper, dVar, yp8Var.e, this, this);
        df6 df6Var = yp8Var.c;
        if (df6Var == null || !(aVarF instanceof com.google.android.gms.common.internal.a)) {
            String str = yp8Var.b;
            if (str != null && (aVarF instanceof com.google.android.gms.common.internal.a)) {
                aVarF.r = str;
            }
        } else {
            aVarF.s = df6Var;
        }
        this.d = aVarF;
        this.e = yp8Var.f;
        this.f = new lh7((byte) 17);
        this.i = yp8Var.g;
        if (!aVarF.n()) {
            this.j = null;
            return;
        }
        Context context = vz2Var.e;
        xp8 xp8Var = vz2Var.m;
        iu iuVarA2 = yp8Var.a();
        this.j = new ip8(context, xp8Var, new io.sentry.android.core.d((String) iuVarA2.p, (String) iuVarA2.n, (ax) iuVarA2.f1103o));
    }

    public final void a() {
        vz2 vz2Var = this.f347o;
        nv1.p(vz2Var.m);
        this.m = null;
        l(w41.r);
        if (this.k) {
            xp8 xp8Var = vz2Var.m;
            gr grVar = this.e;
            xp8Var.removeMessages(11, grVar);
            vz2Var.m.removeMessages(9, grVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            io.sentry.h2.f();
        } else {
            g();
            k();
        }
    }

    public final void b(int i) {
        nv1.p(this.f347o.m);
        this.m = null;
        this.k = true;
        String str = this.d.a;
        lh7 lh7Var = this.f;
        lh7Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        lh7Var.I(true, new Status(20, sb.toString(), null, null));
        gr grVar = this.e;
        vz2 vz2Var = this.f347o;
        xp8 xp8Var = vz2Var.m;
        xp8Var.sendMessageDelayed(Message.obtain(xp8Var, 9, grVar), 5000L);
        xp8 xp8Var2 = vz2Var.m;
        xp8Var2.sendMessageDelayed(Message.obtain(xp8Var2, 11, grVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) vz2Var.g.n;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            io.sentry.h2.f();
        }
    }

    @Override // o.uz2
    public final void c(w41 w41Var) {
        n(w41Var, null);
    }

    @Override // o.tz2
    public final void d(int i) {
        vz2 vz2Var = this.f347o;
        if (Looper.myLooper() == vz2Var.m.getLooper()) {
            b(i);
        } else {
            vz2Var.m.post(new lj0((byte) 1, i, this));
        }
    }

    @Override // o.tz2
    public final void e() {
        vz2 vz2Var = this.f347o;
        if (Looper.myLooper() == vz2Var.m.getLooper()) {
            a();
        } else {
            vz2Var.m.post(new mt8((Object) this, (byte) 21));
        }
    }

    public final boolean f(w41 w41Var) {
        synchronized (vz2.q) {
            this.f347o.getClass();
        }
        return false;
    }

    public final void g() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gp8 gp8Var = (gp8) arrayList.get(i);
            if (!this.d.l()) {
                return;
            }
            if (h(gp8Var)) {
                linkedList.remove(gp8Var);
            }
        }
    }

    public final boolean h(gp8 gp8Var) {
        if (gp8Var == null) {
            lh7 lh7Var = this.f;
            com.google.android.gms.common.internal.a aVar = this.d;
            gp8Var.f(lh7Var, aVar.n());
            try {
                gp8Var.g(this);
                return true;
            } catch (DeadObjectException unused) {
                d(1);
                aVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        bi2[] bi2VarArrA = gp8Var.a(this);
        bi2 bi2Var = null;
        if (bi2VarArrA != null && bi2VarArrA.length != 0) {
            xv8 xv8Var = this.d.v;
            bi2[] bi2VarArr = xv8Var == null ? null : xv8Var.n;
            if (bi2VarArr == null) {
                bi2VarArr = new bi2[0];
            }
            vw vwVar = new vw(bi2VarArr.length);
            for (bi2 bi2Var2 : bi2VarArr) {
                vwVar.put(bi2Var2.m, Long.valueOf(bi2Var2.c()));
            }
            for (bi2 bi2Var3 : bi2VarArrA) {
                Long l = (Long) vwVar.get(bi2Var3.m);
                if (l == null || l.longValue() < bi2Var3.c()) {
                    bi2Var = bi2Var3;
                    break;
                }
            }
        }
        if (bi2Var == null) {
            lh7 lh7Var2 = this.f;
            com.google.android.gms.common.internal.a aVar2 = this.d;
            gp8Var.f(lh7Var2, aVar2.n());
            try {
                gp8Var.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                d(1);
                aVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.d.getClass().getName();
        String str = bi2Var.m;
        long jC = bi2Var.c();
        StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(jC).length() + 2);
        e41.t(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jC);
        sb.append(").");
        io.sentry.android.core.v0.j("GoogleApiManager", sb.toString());
        vz2 vz2Var = this.f347o;
        if (!vz2Var.n || !gp8Var.b(this)) {
            gp8Var.e(new k98(bi2Var));
            return true;
        }
        int iC = gp8Var.c(this);
        bp8 bp8Var = new bp8(this.e, bi2Var);
        ArrayList arrayList = this.l;
        int iIndexOf = arrayList.indexOf(bp8Var);
        if (iIndexOf >= 0) {
            bp8 bp8Var2 = (bp8) arrayList.get(iIndexOf);
            vz2Var.m.removeMessages(15, bp8Var2);
            vz2Var.m.sendMessageDelayed(Message.obtain(vz2Var.m, 15, bp8Var2), 5000L);
            return false;
        }
        arrayList.add(bp8Var);
        vz2Var.m.sendMessageDelayed(Message.obtain(vz2Var.m, 15, bp8Var), 5000L);
        vz2Var.m.sendMessageDelayed(Message.obtain(vz2Var.m, 16, bp8Var), 120000L);
        w41 w41Var = new w41(1, 2, null, null, Integer.valueOf(iC));
        if (f(w41Var)) {
            String str2 = bi2Var.m;
            long jC2 = bi2Var.c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jC2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jC2);
            io.sentry.android.core.v0.j("GoogleApiManager", sb2.toString());
            return false;
        }
        if (vz2Var.e(w41Var, this.i)) {
            String str3 = bi2Var.m;
            long jC3 = bi2Var.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jC3).length());
            sb3.append("Notification displayed for missing feature: ");
            sb3.append(str3);
            sb3.append(", version: ");
            sb3.append(jC3);
            io.sentry.android.core.v0.j("GoogleApiManager", sb3.toString());
        }
        return false;
    }

    public final void i(Status status, Exception exc, boolean z) {
        nv1.p(this.f347o.m);
        if ((status == null) == (exc == null)) {
            hk0.g("Status XOR exception should be null");
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            gp8 gp8Var = (gp8) it.next();
            if (!z || gp8Var.a == 2) {
                if (status != null) {
                    gp8Var.d(status);
                } else {
                    gp8Var.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        nv1.p(this.f347o.m);
        i(status, null, false);
    }

    public final void k() {
        vz2 vz2Var = this.f347o;
        xp8 xp8Var = vz2Var.m;
        gr grVar = this.e;
        xp8Var.removeMessages(12, grVar);
        xp8 xp8Var2 = vz2Var.m;
        xp8Var2.sendMessageDelayed(xp8Var2.obtainMessage(12, grVar), vz2Var.a);
    }

    public final void l(w41 w41Var) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            io.sentry.h2.f();
            return;
        }
        if (xs1.G(w41Var, w41.r)) {
            com.google.android.gms.common.internal.a aVar = this.d;
            if (!aVar.l() || aVar.b == null) {
                hk0.o("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final void m(w41 w41Var) {
        nv1.p(this.f347o.m);
        com.google.android.gms.common.internal.a aVar = this.d;
        String name = aVar.getClass().getName();
        String strValueOf = String.valueOf(w41Var);
        aVar.c(e41.m(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        n(w41Var, null);
    }

    public final void n(w41 w41Var, RuntimeException runtimeException) {
        wz6 wz6Var;
        vz2 vz2Var = this.f347o;
        nv1.p(vz2Var.m);
        ip8 ip8Var = this.j;
        if (ip8Var != null && (wz6Var = ip8Var.i) != null) {
            wz6Var.b();
        }
        nv1.p(this.f347o.m);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) vz2Var.g.n;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(w41Var);
        if ((this.d instanceof zp8) && w41Var.n != 24) {
            vz2Var.b = true;
            xp8 xp8Var = vz2Var.m;
            xp8Var.sendMessageDelayed(xp8Var.obtainMessage(19), 300000L);
        }
        int i = w41Var.n;
        if (i == 4) {
            j(vz2.p);
            return;
        }
        if (i == 25) {
            j(vz2.b(this.e, w41Var));
            return;
        }
        LinkedList linkedList = this.c;
        if (linkedList.isEmpty()) {
            this.m = w41Var;
            return;
        }
        if (runtimeException != null) {
            nv1.p(vz2Var.m);
            i(null, runtimeException, false);
            return;
        }
        boolean z = vz2Var.n;
        gr grVar = this.e;
        if (!z) {
            j(vz2.b(grVar, w41Var));
            return;
        }
        i(vz2.b(grVar, w41Var), null, true);
        if (linkedList.isEmpty() || f(w41Var) || vz2Var.e(w41Var, this.i)) {
            return;
        }
        if (w41Var.n == 18) {
            this.k = true;
        }
        if (!this.k) {
            j(vz2.b(grVar, w41Var));
        } else {
            xp8 xp8Var2 = vz2Var.m;
            xp8Var2.sendMessageDelayed(Message.obtain(xp8Var2, 9, grVar), 5000L);
        }
    }

    public final void o(gp8 gp8Var) {
        nv1.p(this.f347o.m);
        boolean zL = this.d.l();
        LinkedList linkedList = this.c;
        if (zL) {
            if (h(gp8Var)) {
                k();
                return;
            } else {
                linkedList.add(gp8Var);
                return;
            }
        }
        linkedList.add(gp8Var);
        w41 w41Var = this.m;
        if (w41Var == null || w41Var.n == 0 || w41Var.f2376o == null) {
            q();
        } else {
            n(w41Var, null);
        }
    }

    public final void p() {
        vz2 vz2Var = this.f347o;
        nv1.p(vz2Var.m);
        Status status = vz2.f2359o;
        j(status);
        this.f.I(false, status);
        for (oc4 oc4Var : (oc4[]) this.h.keySet().toArray(new oc4[0])) {
            o(new qp8(new do7()));
        }
        l(new w41(4, null, null));
        if (this.d.l()) {
            vz2Var.m.post(new mt8((Object) new hj8(this, (byte) 2), (byte) 22));
        }
    }

    public final void q() {
        vz2 vz2Var = this.f347o;
        nv1.p(vz2Var.m);
        com.google.android.gms.common.internal.a aVar = this.d;
        if (aVar.l() || aVar.m()) {
            return;
        }
        try {
            int iA = vz2Var.g.a(vz2Var.e, aVar);
            if (iA != 0) {
                w41 w41Var = new w41(iA, null, null);
                String name = aVar.getClass().getName();
                String string = w41Var.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                io.sentry.android.core.v0.j("GoogleApiManager", sb.toString());
                n(w41Var, null);
                return;
            }
            z60 z60Var = new z60(vz2Var, aVar, this.e);
            if (aVar.n()) {
                ip8 ip8Var = this.j;
                nv1.s(ip8Var);
                wz6 wz6Var = ip8Var.i;
                if (wz6Var != null) {
                    wz6Var.b();
                }
                io.sentry.android.core.d dVar = ip8Var.h;
                dVar.s = Integer.valueOf(System.identityHashCode(ip8Var));
                so8 so8Var = ip8Var.f;
                Context context = ip8Var.d;
                Handler handler = ip8Var.e;
                ip8Var.i = (wz6) so8Var.f(context, handler.getLooper(), dVar, (xz6) dVar.r, ip8Var, ip8Var);
                ip8Var.j = z60Var;
                Set set = ip8Var.g;
                if (set == null || set.isEmpty()) {
                    handler.post(new mt8(ip8Var));
                } else {
                    wz6 wz6Var2 = ip8Var.i;
                    wz6Var2.getClass();
                    wz6Var2.i = new df6(wz6Var2);
                    wz6Var2.p(2, null);
                }
            }
            try {
                aVar.i = z60Var;
                aVar.p(2, null);
            } catch (SecurityException e) {
                n(new w41(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            n(new w41(10, null, null), e2);
        }
    }
}
