package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class mt8 implements Runnable {
    public final /* synthetic */ byte m;
    public Object n;

    public mt8(vo8 vo8Var, nd ndVar) {
        this.m = (byte) 24;
        Objects.requireNonNull(vo8Var);
        this.n = ndVar;
    }

    private final void a() {
        zg8 zg8Var = (zg8) this.n;
        synchronized (zg8Var.a) {
            try {
                if (zg8Var.b()) {
                    io.sentry.android.core.v0.c("WakeLock", String.valueOf(zg8Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    zg8Var.d();
                    if (zg8Var.b()) {
                        zg8Var.c = 1;
                        zg8Var.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x023f  */
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
    @Override // java.lang.Runnable
    public final void run() {
        lt8 lt8Var;
        ps8 ps8Var;
        int actionMasked;
        int iJ;
        ao7 ao7VarB;
        long jNanoTime;
        int iJ2 = 0;
        switch (this.m) {
            case 0:
                ot8 ot8Var = (ot8) this.n;
                if (ot8Var == null || (lt8Var = ot8Var.t) == null) {
                    return;
                }
                this.n = null;
                if (lt8Var.isDone()) {
                    Object obj = ot8Var.m;
                    if (obj == null) {
                        if (lt8Var.isDone()) {
                            if (vs8.s.z(ot8Var, null, ot8.g(lt8Var))) {
                                ot8.i(ot8Var);
                                return;
                            }
                            return;
                        }
                        ns8 ns8Var = new ns8(ot8Var, lt8Var);
                        if (vs8.s.z(ot8Var, null, ns8Var)) {
                            try {
                                lt8Var.a(ns8Var, et8.m);
                                return;
                            } catch (Throwable th) {
                                try {
                                    ps8Var = new ps8(th);
                                    break;
                                } catch (Error | Exception unused) {
                                    ps8Var = ps8.b;
                                }
                                vs8.s.z(ot8Var, ns8Var, ps8Var);
                                return;
                            }
                        }
                        obj = ot8Var.m;
                    }
                    if (obj instanceof ms8) {
                        lt8Var.cancel(((ms8) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = ot8Var.u;
                    ot8Var.u = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            if (vs8.s.z(ot8Var, null, new ps8(new nt8(str)))) {
                                ot8.i(ot8Var);
                            }
                            throw th2;
                        }
                    }
                    if (vs8.s.z(ot8Var, null, new ps8(new nt8(str + ": " + lt8Var.toString())))) {
                        ot8.i(ot8Var);
                    }
                    lt8Var.cancel(true);
                    return;
                } catch (Throwable th3) {
                    lt8Var.cancel(true);
                    throw th3;
                }
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.n;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.z0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7) {
                    if (actionMasked == 8) {
                        i = 9;
                    } else if (actionMasked != 9) {
                        i = 2;
                    }
                }
                androidComposeView.I(motionEvent, i, androidComposeView.A0, false);
                return;
            case 2:
                hc4 hc4Var = (hc4) this.n;
                o62 o62Var = hc4Var.f964o;
                b00 b00Var = hc4Var.m;
                if (hc4Var.z) {
                    if (hc4Var.x) {
                        hc4Var.x = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        b00Var.e = jCurrentAnimationTimeMillis;
                        b00Var.g = -1L;
                        b00Var.f = jCurrentAnimationTimeMillis;
                        b00Var.h = 0.5f;
                    }
                    if ((b00Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > b00Var.g + ((long) b00Var.i)) || !hc4Var.h()) {
                        hc4Var.z = false;
                        return;
                    }
                    if (hc4Var.y) {
                        hc4Var.y = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        o62Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (b00Var.f == 0) {
                        hk0.o("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = b00Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - b00Var.f;
                    b00Var.f = jCurrentAnimationTimeMillis2;
                    hc4Var.B.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * b00Var.d));
                    WeakHashMap weakHashMap = be8.a;
                    o62Var.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                o10 o10Var = (o10) this.n;
                LinkedHashMap linkedHashMap = (LinkedHashMap) o10Var.c;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    linkedHashMap.put(str2, Integer.valueOf(iIntValue - 1));
                    if (iIntValue <= 1) {
                        it.remove();
                        ar arVar = (ar) o10Var.b;
                        if (arVar == null) {
                            im3.e0("registeredCallback");
                            throw null;
                        }
                        arVar.p(str2, true);
                    }
                }
                ((Handler) ((kh7) o10Var.d).getValue()).postDelayed(this, 1000L);
                return;
            case 4:
                ((y30) this.n).m.b();
                return;
            case 5:
                d70 d70Var = ((q60) this.n).q0;
                g68 a70Var = d70Var.n;
                if (a70Var == null) {
                    a70Var = new a70();
                    d70Var.n = a70Var;
                }
                a70Var.x();
                return;
            case 6:
                v02 v02Var = (v02) this.n;
                v02Var.s0.onDismiss(v02Var.A0);
                return;
            case 7:
                o62 o62Var2 = (o62) this.n;
                o62Var2.x = null;
                o62Var2.drawableStateChanged();
                return;
            case 8:
                ((g82) this.n).J0();
                return;
            case ep1.b /* 9 */:
                vh2 vh2Var = (vh2) this.n;
                ValueAnimator valueAnimator = vh2Var.z;
                byte b = vh2Var.A;
                if (b == 1) {
                    valueAnimator.cancel();
                } else if (b != 2) {
                    return;
                }
                vh2Var.A = (byte) 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case ep1.c /* 10 */:
                pl2 pl2Var = (pl2) this.n;
                Context contextE = pl2Var.E();
                if (contextE == null) {
                    io.sentry.android.core.v0.j("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                pl2Var.H0.W0(1);
                d70 d70Var2 = pl2Var.H0;
                String string = contextE.getString(R.string.fingerprint_dialog_touch_sensor);
                nw4 nw4Var = d70Var2.J;
                if (nw4Var == null) {
                    nw4Var = new nw4();
                    d70Var2.J = nw4Var;
                }
                d70.Y0(nw4Var, string);
                return;
            case 11:
                ut2 ut2Var = (ut2) this.n;
                if (ut2Var.X != null) {
                    ut2Var.B();
                    return;
                }
                return;
            case ep1.d /* 12 */:
                ((su2) this.n).B(true);
                return;
            case 13:
                ln3 ln3Var = (ln3) this.n;
                ae aeVar = ln3Var.m;
                if (ln3Var.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = ln3Var.B;
                    long j3 = j2 != Long.MIN_VALUE ? jCurrentTimeMillis - j2 : 0L;
                    androidx.recyclerview.widget.a layoutManager = ln3Var.r.getLayoutManager();
                    Rect rect = ln3Var.A;
                    if (rect == null) {
                        rect = new Rect();
                        ln3Var.A = rect;
                    }
                    layoutManager.n(ln3Var.c.m, rect);
                    if (layoutManager.o()) {
                        int i2 = (int) (ln3Var.j + ln3Var.h);
                        int paddingLeft = (i2 - ln3Var.A.left) - ln3Var.r.getPaddingLeft();
                        float f = ln3Var.h;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((ln3Var.c.m.getWidth() + i2) + ln3Var.A.right) - (ln3Var.r.getWidth() - ln3Var.r.getPaddingRight())) <= 0)) {
                            iJ = 0;
                        } else {
                            iJ = paddingLeft;
                        }
                    } else {
                        iJ = 0;
                    }
                    if (layoutManager.p()) {
                        int i3 = (int) (ln3Var.k + ln3Var.i);
                        int paddingTop = (i3 - ln3Var.A.top) - ln3Var.r.getPaddingTop();
                        float f2 = ln3Var.i;
                        if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((ln3Var.c.m.getHeight() + i3) + ln3Var.A.bottom) - (ln3Var.r.getHeight() - ln3Var.r.getPaddingBottom())) > 0)) {
                            iJ2 = paddingTop;
                        }
                    }
                    if (iJ != 0) {
                        RecyclerView recyclerView = ln3Var.r;
                        int width = ln3Var.c.m.getWidth();
                        ln3Var.r.getWidth();
                        iJ = aeVar.j(recyclerView, width, iJ, j3);
                    }
                    int i4 = iJ;
                    if (iJ2 != 0) {
                        RecyclerView recyclerView2 = ln3Var.r;
                        int height = ln3Var.c.m.getHeight();
                        ln3Var.r.getHeight();
                        iJ2 = aeVar.j(recyclerView2, height, iJ2, j3);
                    }
                    if (i4 == 0 && iJ2 == 0) {
                        ln3Var.B = Long.MIN_VALUE;
                        return;
                    }
                    if (ln3Var.B == Long.MIN_VALUE) {
                        ln3Var.B = jCurrentTimeMillis;
                    }
                    ln3Var.r.scrollBy(i4, iJ2);
                    c76 c76Var = ln3Var.c;
                    if (c76Var != null) {
                        ln3Var.o(c76Var);
                    }
                    ln3Var.r.removeCallbacks(ln3Var.s);
                    RecyclerView recyclerView3 = ln3Var.r;
                    WeakHashMap weakHashMap2 = be8.a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 14:
                RecyclerView recyclerView4 = ((rq5) this.n).r0;
                recyclerView4.focusableViewAvailable(recyclerView4);
                return;
            case 15:
                ((uq5) this.n).k();
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((StaggeredGridLayoutManager) this.n).M0();
                return;
            case 17:
                io7 io7Var = (io7) this.n;
                synchronized (io7Var) {
                    io7Var.g++;
                    ao7VarB = io7Var.b();
                }
                if (ao7VarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ao7 ao7Var = ao7VarB;
                    try {
                        threadCurrentThread.setName(ao7Var.a);
                        Logger logger = ((io7) this.n).b;
                        go7 go7Var = ao7Var.c;
                        go7Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            g57.m(logger, ao7Var, go7Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = ao7Var.a();
                            if (zIsLoggable) {
                                g57.m(logger, ao7Var, go7Var, "finished run in " + g57.j(System.nanoTime() - jNanoTime));
                            }
                            io7 io7Var2 = (io7) this.n;
                            synchronized (io7Var2) {
                                io7Var2.a(ao7Var, jA, true);
                                ao7VarB = io7Var2.b();
                            }
                        } catch (Throwable th4) {
                            if (zIsLoggable) {
                                g57.m(logger, ao7Var, go7Var, "failed a run in " + g57.j(System.nanoTime() - jNanoTime));
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        try {
                            io7 io7Var3 = (io7) this.n;
                            synchronized (io7Var3) {
                                io7Var3.a(ao7Var, -1L, false);
                                if (!(th5 instanceof InterruptedException)) {
                                    throw th5;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th6) {
                            threadCurrentThread.setName(name);
                            throw th6;
                        }
                    }
                } while (ao7VarB != null);
                threadCurrentThread.setName(name);
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((Toolbar) this.n).u();
                return;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                lz7 lz7Var = (lz7) this.n;
                Window.Callback callback = lz7Var.P;
                Menu menuZ0 = lz7Var.z0();
                jp4 jp4Var = menuZ0 instanceof jp4 ? (jp4) menuZ0 : null;
                if (jp4Var != null) {
                    jp4Var.y();
                }
                try {
                    menuZ0.clear();
                    if (!callback.onCreatePanelMenu(0, menuZ0) || !callback.onPreparePanel(0, null, menuZ0)) {
                        menuZ0.clear();
                    }
                    if (jp4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (jp4Var != null) {
                        jp4Var.x();
                    }
                }
                break;
            case 20:
                ((fe8) this.n).n(0);
                return;
            case 21:
                ((ap8) this.n).a();
                return;
            case 22:
                com.google.android.gms.common.internal.a aVar = ((ap8) ((hj8) this.n).n).d;
                aVar.c(aVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 23:
                ((ip8) this.n).j.a(new w41(4, null, null));
                return;
            case 24:
                throw null;
            case 25:
                a();
                return;
            case 26:
                if (((do7) this.n).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 27:
                try {
                    ((c60) ((lh7) this.n).f1364o).B.H();
                    return;
                } catch (Throwable th7) {
                    tr8.i("BillingClient", "Exception calling onBillingServiceDisconnected.", th7);
                    return;
                }
            case 28:
                pr8 pr8Var = (pr8) this.n;
                c60 c60Var = pr8Var.e;
                c60Var.y(0);
                g60 g60Var = jt8.i;
                c60Var.x(24, pr8Var.d, g60Var);
                pr8Var.d(g60Var);
                return;
            default:
                bv8 bv8Var = (bv8) this.n;
                synchronized (bv8Var.f461o) {
                    ((s75) bv8Var.p).onCanceled();
                    break;
                }
                return;
        }
    }

    public /* synthetic */ mt8(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ mt8() {
        this.m = (byte) 0;
    }

    public mt8(ip8 ip8Var) {
        this.m = (byte) 23;
        Objects.requireNonNull(ip8Var);
        this.n = ip8Var;
    }
}
