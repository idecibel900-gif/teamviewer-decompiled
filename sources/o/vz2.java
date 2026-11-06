package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class vz2 implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f2359o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static vz2 r;
    public long a;
    public boolean b;
    public no7 c;
    public yp8 d;
    public final Context e;
    public final rz2 f;
    public final hj8 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final ax k;
    public final ax l;
    public final xp8 m;
    public volatile boolean n;

    public vz2(Context context, Looper looper) {
        rz2 rz2Var = rz2.d;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new ax(0);
        this.l = new ax(0);
        this.n = true;
        this.e = context;
        xp8 xp8Var = new xp8(looper, this);
        Looper.getMainLooper();
        this.m = xp8Var;
        this.f = rz2Var;
        this.g = new hj8();
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = lv1.p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            lv1.p = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.n = false;
        }
        xp8Var.sendMessage(xp8Var.obtainMessage(6));
    }

    public static Status b(gr grVar, w41 w41Var) {
        String str = (String) grVar.b.f531o;
        String strValueOf = String.valueOf(w41Var);
        return new Status(17, e41.m(new StringBuilder(str.length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), w41Var.f2376o, w41Var);
    }

    public static vz2 c(Context context) {
        vz2 vz2Var;
        HandlerThread handlerThread;
        synchronized (q) {
            vz2Var = r;
            if (vz2Var == null) {
                synchronized (ux8.g) {
                    try {
                        handlerThread = ux8.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ux8.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ux8.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = rz2.c;
                vz2 vz2Var2 = new vz2(applicationContext, looper);
                r = vz2Var2;
                vz2Var = vz2Var2;
            }
        }
        return vz2Var;
    }

    public final ap8 a(yp8 yp8Var) {
        gr grVar = yp8Var.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        ap8 ap8Var = (ap8) concurrentHashMap.get(grVar);
        if (ap8Var == null) {
            ap8Var = new ap8(this, yp8Var);
            concurrentHashMap.put(grVar, ap8Var);
        }
        if (ap8Var.d.n()) {
            this.l.add(grVar);
        }
        ap8Var.q();
        return ap8Var;
    }

    public final boolean d() {
        int i;
        if (this.b) {
            return false;
        }
        ef6 ef6Var = (ef6) df6.r().n;
        if (ef6Var != null && !ef6Var.n) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.n;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean e(w41 w41Var, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        rz2 rz2Var = this.f;
        Context context = this.e;
        rz2Var.getClass();
        synchronized (ck3.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = ck3.a;
            if (context2 == null || (bool = ck3.b) == null || context2 != applicationContext) {
                ck3.b = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                ck3.b = Boolean.valueOf(zIsInstantApp);
                ck3.a = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i2 = w41Var.n;
            if (i2 == 0 || (activity = w41Var.f2376o) == null) {
                Intent intentA = rz2Var.a(i2, context, null);
                activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
            }
            if (activity != null) {
                int i3 = w41Var.n;
                int i4 = GoogleApiActivity.n;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                rz2Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, vp8.a | 134217728));
                Integer num = w41Var.q;
                wo8 wo8Var = new wo8(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), w41Var.n, false);
                yp8 yp8Var = rz2Var.b;
                if (yp8Var == null) {
                    yp8Var = new yp8(context, yp8.j, bq.a, qz2.b);
                    rz2Var.b = yp8Var;
                }
                co7 co7Var = new co7();
                co7Var.c = (char) 0;
                co7Var.a = new bi2[]{kh.d0};
                co7Var.b = false;
                co7Var.d = new hj8(wo8Var, (byte) 6);
                yp8Var.b(2, co7Var.a());
                return true;
            }
        }
        return false;
    }

    public final void f(w41 w41Var, int i) {
        if (e(w41Var, i)) {
            return;
        }
        xp8 xp8Var = this.m;
        xp8Var.sendMessage(xp8Var.obtainMessage(5, i, 0, w41Var));
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:179:0x0401  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v13 o.ap8, still in use, count: 2, list:
          (r4v13 o.ap8) from 0x03b2: IGET (r4v13 o.ap8) A[WRAPPED] o.ap8.i int
          (r4v13 o.ap8) from 0x03b8: PHI (r4 I:??) = (r4v10 o.ap8), (r4v13 o.ap8) binds: [B:171:0x03b7, B:226:0x03b8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vz2.handleMessage(android.os.Message):boolean");
    }
}
