package o;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class it8 implements Runnable {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1102o;

    public it8(q60 q60Var, int i, CharSequence charSequence) {
        this.m = (byte) 5;
        this.f1102o = q60Var;
        this.n = charSequence;
    }

    private final void a() {
        xm8 xm8Var;
        dt5 dt5Var = ((qh7) this.f1102o).m.f;
        String str = (String) this.n;
        synchronized (dt5Var.k) {
            try {
                nn8 nn8VarC = dt5Var.c(str);
                xm8Var = nn8VarC != null ? nn8VarC.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xm8Var == null || im3.n(q61.j, xm8Var.j)) {
            return;
        }
        synchronized (((qh7) this.f1102o).f1833o) {
            ((qh7) this.f1102o).r.put(u47.j(xm8Var), xm8Var);
            qh7 qh7Var = (qh7) this.f1102o;
            ((qh7) this.f1102o).s.put(u47.j(xm8Var), cm8.a(qh7Var.t, xm8Var, (fe1) qh7Var.n.n, qh7Var));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thC;
        hp4 hp4Var;
        l93 l93Var;
        l93 ay8Var;
        int i = 0;
        switch (this.m) {
            case 0:
                y58 y58Var = (y58) this.f1102o;
                lt8 lt8Var = (lt8) this.n;
                if ((lt8Var instanceof vs8) && (thC = ((vs8) lt8Var).c()) != null) {
                    y58Var.b(thC);
                    return;
                }
                try {
                    if (!lt8Var.isDone()) {
                        throw new IllegalStateException(x67.x("Future was expected to be done: %s", lt8Var));
                    }
                    while (true) {
                        try {
                            Object obj = lt8Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            ft8 ft8Var = (ft8) y58Var.p;
                            if (iIntValue <= 0) {
                                ((e53) y58Var.f2579o).run();
                                return;
                            }
                            g60 g60VarA = jt8.a(num.intValue(), "Billing override value was set by a license tester.");
                            ft8Var.I(93, 7, g60VarA);
                            ((as2) y58Var.n).accept(g60VarA);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    y58Var.b(e.getCause());
                    return;
                } catch (Throwable th2) {
                    y58Var.b(th2);
                    return;
                }
                break;
            case 1:
                h7 h7Var = (h7) this.n;
                l7 l7Var = (l7) this.f1102o;
                jp4 jp4Var = l7Var.f1334o;
                if (jp4Var != null && (hp4Var = jp4Var.e) != null) {
                    hp4Var.h(jp4Var);
                }
                View view = (View) l7Var.t;
                if (view != null && view.getWindowToken() != null) {
                    if (h7Var.b()) {
                        l7Var.F = h7Var;
                    } else if (h7Var.e != null) {
                        h7Var.d(0, 0, false, false);
                        l7Var.F = h7Var;
                    }
                }
                l7Var.H = null;
                return;
            case 2:
                ((x7) this.n).m = this.f1102o;
                return;
            case 3:
                ((Application) this.n).unregisterActivityLifecycleCallbacks((x7) this.f1102o);
                return;
            case 4:
                Object obj2 = this.f1102o;
                Object obj3 = this.n;
                try {
                    Method method = y7.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        y7.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    io.sentry.android.core.v0.d("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 5:
                d70 d70Var = ((q60) this.f1102o).q0;
                g68 a70Var = d70Var.n;
                if (a70Var == null) {
                    a70Var = new a70();
                    d70Var.n = a70Var;
                }
                a70Var.w((CharSequence) this.n);
                return;
            case 6:
                d70 d70Var2 = ((q60) this.f1102o).q0;
                g68 a70Var2 = d70Var2.n;
                if (a70Var2 == null) {
                    a70Var2 = new a70();
                    d70Var2.n = a70Var2;
                }
                a70Var2.y((u60) this.n);
                return;
            case 7:
                ((View) this.n).setLayoutParams((ViewGroup.LayoutParams) this.f1102o);
                return;
            case 8:
                l07 l07Var = (l07) this.n;
                Typeface typeface = (Typeface) this.f1102o;
                xs1 xs1Var = (xs1) l07Var.n;
                if (xs1Var != null) {
                    xs1Var.U(typeface);
                    return;
                }
                return;
            case ep1.b /* 9 */:
                ((EditText) this.n).removeTextChangedListener(((it0) ((ft0) this.f1102o).b).d);
                return;
            case ep1.c /* 10 */:
                we4 we4VarF = we4.f();
                String str = qm1.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                xm8 xm8Var = (xm8) this.n;
                sb.append(xm8Var.a);
                we4VarF.c(str, sb.toString());
                ((qm1) this.f1102o).a.b(xm8Var);
                return;
            case 11:
                boolean zIsPopupShowing = ((AutoCompleteTextView) this.n).isPopupShowing();
                z62 z62Var = (z62) ((v62) this.f1102o).n;
                z62Var.e(zIsPopupShowing);
                z62Var.i = zIsPopupShowing;
                return;
            case ep1.d /* 12 */:
                ((AutoCompleteTextView) this.n).removeTextChangedListener(((z62) ((ft0) this.f1102o).b).d);
                return;
            case 13:
                vt1.A((az3) this.n).resumeWith(ct1.A((Throwable) this.f1102o));
                return;
            case 14:
                break;
            case 15:
                ((EditText) this.n).removeTextChangedListener(((ug5) ((ft0) this.f1102o).b).d);
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((as2) this.n).accept(this.f1102o);
                return;
            case 17:
                ((gl0) this.f1102o).D((ue2) this.n);
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                try {
                    ((Runnable) this.f1102o).run();
                    synchronized (((iq6) this.n).p) {
                        ((iq6) this.n).a();
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (((iq6) this.n).p) {
                        ((iq6) this.n).a();
                        throw th4;
                    }
                }
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                a();
                return;
            case 20:
                ic4 ic4Var = (ic4) this.n;
                boolean zIsCancelled = ic4Var.isCancelled();
                gl0 gl0Var = (gl0) this.f1102o;
                if (zIsCancelled) {
                    gl0Var.f(null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj4 = ic4Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            gl0Var.resumeWith(obj4);
                            return;
                        } catch (ExecutionException e3) {
                            Throwable cause = e3.getCause();
                            cause.getClass();
                            gl0Var.resumeWith(new sc6(cause));
                            return;
                        }
                    } catch (InterruptedException unused2) {
                        i = 1;
                    } catch (Throwable th5) {
                        if (i != 0) {
                            Thread.currentThread().interrupt();
                        }
                        throw th5;
                    }
                }
                break;
            case 21:
                kj0 kj0Var = (kj0) this.n;
                boolean zIsCancelled2 = kj0Var.n.isCancelled();
                gl0 gl0Var2 = (gl0) this.f1102o;
                if (zIsCancelled2) {
                    gl0Var2.f(null);
                    return;
                }
                try {
                    gl0Var2.resumeWith(p2.getUninterruptibly(kj0Var));
                    return;
                } catch (ExecutionException e4) {
                    Throwable cause2 = e4.getCause();
                    if (cause2 != null) {
                        gl0Var2.resumeWith(new sc6(cause2));
                        return;
                    } else {
                        jz3 jz3Var = new jz3();
                        im3.Y(jz3Var, im3.class.getName());
                        throw jz3Var;
                    }
                }
            case 22:
                w41 w41Var = (w41) this.n;
                z60 z60Var = (z60) this.f1102o;
                vz2 vz2Var = (vz2) z60Var.r;
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) z60Var.n;
                ap8 ap8Var = (ap8) vz2Var.j.get((gr) z60Var.f2673o);
                if (ap8Var == null) {
                    return;
                }
                if (w41Var.n != 0) {
                    ap8Var.n(w41Var, null);
                    return;
                }
                z60Var.m = true;
                if (aVar.n()) {
                    if (!z60Var.m || (l93Var = (l93) z60Var.p) == null) {
                        return;
                    }
                    aVar.g(l93Var, (Set) z60Var.q);
                    return;
                }
                try {
                    aVar.g(null, aVar.n() ? aVar.x : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e5) {
                    io.sentry.android.core.v0.d("GoogleApiManager", "Failed to get service from broker. ", e5);
                    aVar.c("Failed to get service from broker.");
                    ap8Var.n(new w41(10, null, null), null);
                    return;
                }
            case 23:
                ip8 ip8Var = (ip8) this.f1102o;
                wp8 wp8Var = (wp8) this.n;
                w41 w41Var2 = wp8Var.n;
                if (w41Var2.n == 0) {
                    bq8 bq8Var = wp8Var.f2436o;
                    nv1.s(bq8Var);
                    w41 w41Var3 = bq8Var.f446o;
                    if (w41Var3.n != 0) {
                        io.sentry.android.core.v0.m("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(w41Var3)), new Exception());
                        ip8Var.j.a(w41Var3);
                        ip8Var.i.b();
                        return;
                    }
                    z60 z60Var2 = ip8Var.j;
                    IBinder iBinder = bq8Var.n;
                    if (iBinder == null) {
                        ay8Var = null;
                    } else {
                        int i2 = q4.d;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("o.l93");
                        ay8Var = iInterfaceQueryLocalInterface instanceof l93 ? (l93) iInterfaceQueryLocalInterface : new ay8(iBinder);
                    }
                    Set set = ip8Var.g;
                    z60Var2.getClass();
                    if (ay8Var == null || set == null) {
                        io.sentry.android.core.v0.m("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        z60Var2.a(new w41(4, null, null));
                    } else {
                        z60Var2.p = ay8Var;
                        z60Var2.q = set;
                        if (z60Var2.m) {
                            ((com.google.android.gms.common.internal.a) z60Var2.n).g(ay8Var, set);
                        }
                    }
                } else {
                    ip8Var.j.a(w41Var2);
                }
                ip8Var.i.b();
                return;
            case 24:
                c60 c60Var = (c60) this.n;
                mx5 mx5Var = (mx5) this.f1102o;
                g60 g60Var = jt8.i;
                c60Var.r(24, 9, g60Var);
                nr8 nr8Var = yr8.n;
                mx5Var.a(g60Var, ds8.q);
                return;
            case 25:
                c60 c60Var2 = (c60) this.n;
                g60 g60Var2 = (g60) this.f1102o;
                ar arVar = c60Var2.f.b;
                ny8 ny8Var = c60Var2.f;
                if (arVar != null) {
                    ny8Var.b.o(g60Var2, null);
                    return;
                } else {
                    tr8.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 26:
                Future future = (Future) this.n;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f1102o;
                future.cancel(true);
                tr8.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                c60 c60Var3 = (c60) this.n;
                ag3 ag3Var = (ag3) this.f1102o;
                g60 g60Var3 = jt8.i;
                c60Var3.r(24, 7, g60Var3);
                nr8 nr8Var2 = yr8.n;
                ds8 ds8Var = ds8.q;
                ag3Var.b(g60Var3, new yy5(ds8Var, ds8Var));
                return;
            case 28:
                try {
                    ((c60) ((lh7) this.n).f1364o).B.G((g60) this.f1102o);
                    return;
                } catch (Throwable th6) {
                    tr8.i("BillingClient", "Exception calling onBillingSetupFinished.", th6);
                    return;
                }
            default:
                bo7 bo7Var = (bo7) this.n;
                boolean z = ((hy8) bo7Var).d;
                bt8 bt8Var = (bt8) this.f1102o;
                if (z) {
                    bt8Var.p.o();
                    return;
                }
                try {
                    ((bt8) this.f1102o).p.m(bt8Var.f456o.j(bo7Var));
                    return;
                } catch (lg6 e6) {
                    boolean z2 = e6.getCause() instanceof Exception;
                    bt8 bt8Var2 = (bt8) this.f1102o;
                    if (z2) {
                        bt8Var2.p.n((Exception) e6.getCause());
                        return;
                    } else {
                        bt8Var2.p.n(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((bt8) this.f1102o).p.n(e7);
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.n).run();
            } catch (Throwable th7) {
                ck3.T(th7, ba2.m);
            }
            try {
                Runnable runnableO0 = ((j94) this.f1102o).O0();
                if (runnableO0 == null) {
                    return;
                }
                this.n = runnableO0;
                i++;
                if (i >= 16) {
                    j94 j94Var = (j94) this.f1102o;
                    if (ga0.v(j94Var.p, j94Var)) {
                        j94 j94Var2 = (j94) this.f1102o;
                        ga0.u(j94Var2.p, j94Var2, this);
                        return;
                    }
                }
            } catch (Throwable th8) {
                j94 j94Var3 = (j94) this.f1102o;
                synchronized (j94Var3.s) {
                    j94.t.decrementAndGet(j94Var3);
                    throw th8;
                }
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                y58 y58Var = new y58(it8.class.getSimpleName());
                y58 y58Var2 = (y58) this.f1102o;
                lh7 lh7Var = new lh7((byte) 20, false);
                ((lh7) y58Var.p).n = lh7Var;
                y58Var.p = lh7Var;
                lh7Var.f1364o = y58Var2;
                return y58Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ it8(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1102o = obj2;
    }

    public /* synthetic */ it8(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.f1102o = obj;
        this.n = obj2;
    }
}
