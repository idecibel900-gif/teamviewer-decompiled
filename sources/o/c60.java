package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class c60 {
    public as8 A;
    public volatile d60 B;
    public ExecutorService C;
    public final Long D;
    public final b77 E;
    public final String c;
    public final String d;
    public volatile ny8 f;
    public final Context g;
    public final lh7 h;
    public volatile yq8 i;
    public volatile pr8 j;
    public boolean k;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f493o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final aw y;
    public final boolean z;
    public final Object a = new Object();
    public volatile byte b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int l = 0;

    public c60(aw awVar, RemoteControlApplication remoteControlApplication, ar arVar, b60 b60Var) {
        int i = as8.f357o;
        this.A = js8.v;
        long jNextLong = new Random().nextLong();
        this.D = Long.valueOf(jNextLong);
        this.E = ir8.a;
        this.c = "9.1.0";
        String strM = m();
        this.d = strM;
        this.g = remoteControlApplication.getApplicationContext();
        rw8 rw8VarY = sw8.y();
        rw8VarY.i();
        if (strM != null) {
            rw8VarY.b();
            sw8.x((sw8) rw8VarY.n, strM);
        }
        rw8VarY.h(this.g.getPackageName());
        rw8VarY.b();
        sw8.C((sw8) rw8VarY.n, jNextLong);
        boolean z = b60Var.e;
        rw8VarY.b();
        sw8.v((sw8) rw8VarY.n, z);
        rw8VarY.c(Build.VERSION.SDK_INT);
        rw8VarY.g();
        p(rw8VarY, remoteControlApplication);
        try {
            rw8VarY.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            tr8.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new lh7(this.g, (sw8) rw8VarY.a());
        if (arVar == null) {
            tr8.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f = new ny8(this.g, arVar, this.h);
        this.y = awVar;
        this.g.getPackageName();
        this.z = b60Var.e;
    }

    public static Future g(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new it8((Object) futureSubmit, (Object) runnable, (byte) 26), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            tr8.i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static String m() {
        try {
            return (String) qf0.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void n(c60 c60Var, int i) {
        c60Var.l = i;
        c60Var.x = i >= 28;
        c60Var.w = i >= 26;
        c60Var.v = i >= 24;
        c60Var.u = i >= 21;
        c60Var.t = i >= 20;
        c60Var.s = i >= 19;
        c60Var.r = i >= 17;
        c60Var.q = i >= 16;
        c60Var.p = i >= 15;
        c60Var.f493o = i >= 14;
        c60Var.n = i >= 9;
        c60Var.m = i >= 6;
    }

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
    public static void o(c60 c60Var, int i) {
        if (i != 0) {
            c60Var.y(0);
            return;
        }
        synchronized (c60Var.a) {
            try {
                if (c60Var.b == 3) {
                    return;
                }
                c60Var.y(2);
                ny8 ny8Var = c60Var.f != null ? c60Var.f : null;
                if (ny8Var != null) {
                    boolean z = c60Var.u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    ny8Var.f = z;
                    my8 my8Var = ny8Var.e;
                    Context context = ny8Var.a;
                    my8Var.a(context, intentFilter2);
                    boolean z2 = ny8Var.f;
                    my8 my8Var2 = ny8Var.d;
                    if (!z2) {
                        my8Var2.a(context, intentFilter);
                        return;
                    }
                    synchronized (my8Var2) {
                        try {
                            if (my8Var2.a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(my8Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != my8Var2.b ? 4 : 2);
                            } else {
                                context.registerReceiver(my8Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            my8Var2.a = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void p(rw8 rw8Var, RemoteControlApplication remoteControlApplication) {
        try {
            ActivityManager activityManager = (ActivityManager) remoteControlApplication.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / io.sentry.g7.MAX_EVENT_SIZE_BYTES);
                rw8Var.b();
                sw8.u((sw8) rw8Var.n, i);
                String str = Build.BRAND;
                rw8Var.b();
                sw8.q((sw8) rw8Var.n);
                String str2 = Build.MODEL;
                rw8Var.b();
                sw8.t((sw8) rw8Var.n);
                String str3 = Build.MANUFACTURER;
                rw8Var.b();
                sw8.s((sw8) rw8Var.n);
                String str4 = Build.FINGERPRINT;
                rw8Var.b();
                sw8.r((sw8) rw8Var.n);
            }
        } catch (RuntimeException e) {
            tr8.i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    public final void A() {
        synchronized (this.a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                    this.i = null;
                    this.j = null;
                } catch (Throwable th) {
                    try {
                        tr8.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.j = null;
                    } catch (Throwable th2) {
                        this.i = null;
                        this.j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean B(long j) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j = 0;
            }
            int i = ((g60) k(1).get(j, TimeUnit.MILLISECONDS)).a;
            if (i == 0) {
                tr8.g("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                tr8.h("BillingClient", "Reconnection failed with result: " + i);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            tr8.i("BillingClient", "Error during reconnection attempt: ", e);
        }
        return D();
    }

    public final boolean C(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b77 b77Var = this.E;
        if (b77Var == null) {
            yq4.l("ticker");
            return false;
        }
        long jQ = b77Var.q();
        int i = r47.c;
        long jQ2 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                long jMax = Math.max(0L, jQ2);
                if (jMax <= 0) {
                    tr8.h("BillingClient", "No time remaining for reconnection attempt.");
                    return D();
                }
                int i3 = ((g60) k(i2).get(jMax, timeUnit)).a;
                if (i3 == 0) {
                    tr8.g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return D();
                }
                tr8.h("BillingClient", "Reconnection failed with result: " + i3);
                jQ2 = j - (((b77Var.q() - jQ) + 0) / 1000000);
                long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
                if (jQ2 < jPow) {
                    tr8.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return D();
                }
                if (i2 < i && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jQ2 = j - (((b77Var.q() - jQ) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        tr8.i("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                tr8.i("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        tr8.h("BillingClient", "Max retries reached.");
        return D();
    }

    public final boolean D() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.b == 2 && this.i != null && this.j != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void E(g60 g60Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new it8((Object) this, (Object) g60Var, (byte) 25));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {, blocks: (B:20:0x004a, B:22:0x004e), top: B:44:0x004a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a() {
        ExecutorService executorService;
        try {
            int i = gt8.a;
            w(gt8.c(12, mw8.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    ny8 ny8Var = this.f;
                    my8 my8Var = ny8Var.d;
                    Context context = ny8Var.a;
                    my8Var.b(context);
                    ny8Var.e.b(context);
                    try {
                        tr8.g("BillingClient", "Unbinding from service.");
                        A();
                    } catch (Throwable th2) {
                        tr8.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.C;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.C = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            tr8.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            y(3);
                            this.B = null;
                            throw th4;
                        }
                    }
                    y(3);
                    this.B = null;
                } else {
                    tr8.g("BillingClient", "Unbinding from service.");
                    A();
                    synchronized (this) {
                        executorService = this.C;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.C = null;
                        }
                        y(3);
                        this.B = null;
                    }
                }
            } catch (Throwable th5) {
                tr8.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02be A[EDGE_INSN: B:129:0x02be->B:96:0x0201 BREAK  A[LOOP:6: B:90:0x01cd->B:108:0x0249]] */
    /* JADX WARN: Code duplicated, block: B:132:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x02df  */
    /* JADX WARN: Code duplicated, block: B:138:0x0318  */
    /* JADX WARN: Code duplicated, block: B:141:0x0325  */
    /* JADX WARN: Code duplicated, block: B:142:0x032d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0335  */
    /* JADX WARN: Code duplicated, block: B:148:0x0352  */
    /* JADX WARN: Code duplicated, block: B:151:0x0362  */
    /* JADX WARN: Code duplicated, block: B:154:0x0372  */
    /* JADX WARN: Code duplicated, block: B:157:0x0382  */
    /* JADX WARN: Code duplicated, block: B:159:0x0389  */
    /* JADX WARN: Code duplicated, block: B:160:0x0390  */
    /* JADX WARN: Code duplicated, block: B:162:0x0393  */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa A[LOOP:2: B:164:0x03a4->B:166:0x03aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:174:0x0400  */
    /* JADX WARN: Code duplicated, block: B:176:0x0406  */
    /* JADX WARN: Code duplicated, block: B:179:0x0412  */
    /* JADX WARN: Code duplicated, block: B:181:0x042e  */
    /* JADX WARN: Code duplicated, block: B:183:0x043c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0449  */
    /* JADX WARN: Code duplicated, block: B:186:0x044c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0459  */
    /* JADX WARN: Code duplicated, block: B:191:0x048a  */
    /* JADX WARN: Code duplicated, block: B:193:0x049c  */
    /* JADX WARN: Code duplicated, block: B:209:0x04de A[EDGE_INSN: B:209:0x04de->B:210:0x04e0 BREAK  A[LOOP:4: B:201:0x04ba->B:208:0x04db]] */
    /* JADX WARN: Code duplicated, block: B:212:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:214:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:218:0x051a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0525  */
    /* JADX WARN: Code duplicated, block: B:224:0x0530  */
    /* JADX WARN: Code duplicated, block: B:227:0x053b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0570  */
    /* JADX WARN: Code duplicated, block: B:238:0x0582  */
    /* JADX WARN: Code duplicated, block: B:241:0x058a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0595  */
    /* JADX WARN: Code duplicated, block: B:245:0x059d  */
    /* JADX WARN: Code duplicated, block: B:247:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:253:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:262:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:266:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:267:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:269:0x060f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0654 A[Catch: Exception -> 0x063b, CancellationException -> 0x063e, TimeoutException -> 0x0641, TryCatch #11 {CancellationException -> 0x063e, TimeoutException -> 0x0641, Exception -> 0x063b, blocks: (B:273:0x0634, B:287:0x0654, B:289:0x0671, B:315:0x0701, B:311:0x06ea, B:302:0x06bf, B:323:0x070f, B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2, B:308:0x06de), top: B:343:0x062a, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:289:0x0671 A[Catch: Exception -> 0x063b, CancellationException -> 0x063e, TimeoutException -> 0x0641, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x063e, TimeoutException -> 0x0641, Exception -> 0x063b, blocks: (B:273:0x0634, B:287:0x0654, B:289:0x0671, B:315:0x0701, B:311:0x06ea, B:302:0x06bf, B:323:0x070f, B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2, B:308:0x06de), top: B:343:0x062a, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x068f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0690 A[Catch: all -> 0x06a0, TryCatch #0 {all -> 0x06a0, blocks: (B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2), top: B:336:0x0687, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x0694 A[Catch: all -> 0x06a0, TryCatch #0 {all -> 0x06a0, blocks: (B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2), top: B:336:0x0687, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x06a2 A[Catch: all -> 0x06a0, TRY_LEAVE, TryCatch #0 {all -> 0x06a0, blocks: (B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2), top: B:336:0x0687, outer: #11 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:323:0x070f A[Catch: Exception -> 0x063b, CancellationException -> 0x063e, TimeoutException -> 0x0641, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x063e, TimeoutException -> 0x0641, Exception -> 0x063b, blocks: (B:273:0x0634, B:287:0x0654, B:289:0x0671, B:315:0x0701, B:311:0x06ea, B:302:0x06bf, B:323:0x070f, B:292:0x0687, B:295:0x0690, B:297:0x0694, B:300:0x06a2, B:308:0x06de), top: B:343:0x062a, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0687 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x06de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x062c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:300:0x06a2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r30v0, types: [o.c60] */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.ht5] */
    /* JADX WARN: Type inference failed for: r3v8, types: [o.ht5] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33, types: [long] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    public g60 b(Activity activity, final f60 f60Var) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        g60 g60VarA;
        ?? r3;
        g60 g60Var;
        g60 g60VarA2;
        long j;
        boolean z2;
        long j2;
        boolean z3;
        Future futureG;
        ?? r6;
        ?? r4;
        ?? r7;
        ?? r5;
        ?? r8;
        ?? r9;
        Bundle bundle;
        int iA;
        String strF;
        Object obj;
        int iA2;
        int i2;
        String string;
        boolean z4;
        boolean z5;
        boolean z6;
        final Bundle bundle2;
        String str4;
        boolean z7;
        ArrayList arrayList;
        nr8 nr8VarListIterator;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayList<String> arrayList5;
        ArrayList<String> arrayList6;
        ArrayList<Integer> arrayList7;
        int i3;
        kt5 kt5Var;
        String str5;
        String str6;
        ArrayList arrayList8;
        boolean z8;
        Intent intent;
        int i4;
        ArrayList<String> arrayList9;
        Iterator it;
        ArrayList<String> arrayList10;
        ArrayList<String> arrayList11;
        long jNextLong = new Random().nextLong();
        if (this.f == null || this.f.b == null) {
            g60 g60Var2 = jt8.p;
            s(12, g60Var2, jNextLong);
            return g60Var2;
        }
        f60Var.getClass();
        if (!B(r47.a)) {
            g60 g60Var3 = jt8.h;
            s(2, g60Var3, jNextLong);
            E(g60Var3);
            return g60Var3;
        }
        synchronized (this.a) {
            try {
                z = false;
                if (this.j != null) {
                    z = this.j.d > 0;
                    i = 0;
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList12 = new ArrayList();
        arrayList12.addAll(f60Var.e);
        yr8 yr8Var = f60Var.d;
        Iterator it2 = arrayList12.iterator();
        if ((it2.hasNext() ? it2.next() : null) != null) {
            io.sentry.h2.f();
            return null;
        }
        nr8 nr8Var = (nr8) yr8Var.iterator();
        e60 e60Var = (e60) (nr8Var.hasNext() ? nr8Var.next() : null);
        kt5 kt5Var2 = e60Var.a;
        String str7 = kt5Var2.c;
        String str8 = kt5Var2.d;
        if (str8.equals("subs") && !this.k) {
            tr8.h("BillingClient", "Current client doesn't support subscriptions.");
            g60 g60Var4 = jt8.j;
            t(9, g60Var4, jNextLong, z);
            E(g60Var4);
            return g60Var4;
        }
        if (f60Var.b == null) {
            f60Var.c.getClass();
            if (f60Var.a) {
                str = null;
                if (!this.m) {
                    tr8.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                    g60 g60Var5 = jt8.e;
                    t(18, g60Var5, jNextLong, z);
                    E(g60Var5);
                    return g60Var5;
                }
            } else {
                yr8 yr8Var2 = f60Var.d;
                if (yr8Var2 != null) {
                    int size = yr8Var2.size();
                    str = null;
                    for (int i5 = i; i5 < size; i5++) {
                        ((e60) yr8Var2.get(i5)).getClass();
                    }
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
            if (!this.m) {
                tr8.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                g60 g60Var6 = jt8.e;
                t(18, g60Var6, jNextLong, z);
                E(g60Var6);
                return g60Var6;
            }
        }
        if (arrayList12.size() > 1 && !this.q) {
            tr8.h("BillingClient", "Current client doesn't support multi-item purchases.");
            g60 g60Var7 = jt8.k;
            t(19, g60Var7, jNextLong, z);
            E(g60Var7);
            return g60Var7;
        }
        if (!yr8Var.isEmpty() && !this.r) {
            tr8.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            g60 g60Var8 = jt8.n;
            t(20, g60Var8, jNextLong, z);
            E(g60Var8);
            return g60Var8;
        }
        nr8 nr8VarListIterator2 = yr8Var.listIterator(i);
        while (nr8VarListIterator2.hasNext()) {
            String str9 = ((e60) nr8VarListIterator2.next()).b;
            if (str9 != null && str9.contains(":") && !this.x) {
                tr8.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                g60 g60Var9 = jt8.m;
                t(143, g60Var9, jNextLong, z);
                E(g60Var9);
                return g60Var9;
            }
        }
        if (f60Var.d.isEmpty()) {
            g60VarA2 = jt8.g;
            str2 = str7;
        } else {
            e60 e60Var2 = (e60) f60Var.d.get(i);
            int i6 = 1;
            while (true) {
                str2 = str7;
                if (i6 >= f60Var.d.size()) {
                    kt5 kt5Var3 = e60Var2.a;
                    String strOptString = kt5Var3.b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    yr8 yr8Var3 = f60Var.d;
                    int size2 = yr8Var3.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            yr8 yr8Var4 = yr8Var3;
                            e60 e60Var3 = (e60) yr8Var3.get(i7);
                            e60Var3.getClass();
                            int i8 = size2;
                            kt5 kt5Var4 = e60Var3.a;
                            int i9 = i7;
                            String str10 = kt5Var4.c;
                            str3 = str8;
                            if (kt5Var4.h != null && e60Var3.b == null) {
                                g60VarA = jt8.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                break;
                            }
                            if (map.containsKey(str10)) {
                                g60VarA = jt8.a(5, "ProductId can not be duplicated. Invalid product id: " + str10 + ".");
                                break;
                            }
                            map.put(str10, e60Var3);
                            if (!kt5Var3.d.equals("play_pass_subs") && !kt5Var4.d.equals("play_pass_subs") && !strOptString.equals(kt5Var4.b.optString("packageName"))) {
                                g60VarA = jt8.a(5, "All products must have the same package name.");
                                break;
                            }
                            i7 = i9 + 1;
                            size2 = i8;
                            yr8Var3 = yr8Var4;
                            str8 = str3;
                        } else {
                            str3 = str8;
                            Iterator it3 = hashSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    ArrayList arrayList13 = kt5Var3.i;
                                    String str11 = e60Var2.b;
                                    if (str11 != null && arrayList13 != null) {
                                        Iterator it4 = arrayList13.iterator();
                                        do {
                                            if (!it4.hasNext()) {
                                                r3 = str;
                                                break;
                                            }
                                            r3 = (ht5) it4.next();
                                        } while (!str11.equals(r3.a));
                                        if (r3 != 0 && r3.d != null) {
                                            g60VarA = jt8.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        g60VarA = jt8.g;
                                        break;
                                    }
                                    g60VarA = jt8.g;
                                    break;
                                }
                                String str12 = (String) it3.next();
                                if (map.containsKey(str12)) {
                                    ((e60) map.get(str12)).getClass();
                                    g60VarA = jt8.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    g60Var = g60VarA;
                    break;
                }
                e60 e60Var4 = (e60) f60Var.d.get(i6);
                int i10 = i6;
                if (e60Var4.a.d.equals(e60Var2.a.d) || e60Var4.a.d.equals("play_pass_subs")) {
                    i6 = i10 + 1;
                    str7 = str2;
                } else {
                    g60VarA2 = jt8.a(5, "All products should have same ProductType.");
                }
            }
            if (g60Var != jt8.g) {
                t(108, g60Var, jNextLong, z);
                E(g60Var);
                return g60Var;
            }
            if (this.m) {
                z4 = this.n;
                z5 = this.s;
                this.y.getClass();
                this.y.getClass();
                String str13 = this.d;
                long jLongValue = this.D.longValue();
                this.g.getPackageName();
                int i11 = tr8.a;
                z6 = z2;
                bundle2 = new Bundle();
                tr8.b(bundle2, str13, jLongValue);
                bundle2.putLong("billingClientTransactionId", j);
                f60Var.c.getClass();
                if (!TextUtils.isEmpty(f60Var.b)) {
                    j = r4;
                    z2 = z;
                    bundle2.putString("accountId", f60Var.b);
                }
                j = r4;
                z2 = z;
                if (TextUtils.isEmpty(str)) {
                    str4 = str;
                } else {
                    str4 = str;
                    bundle2.putString("obfuscatedProfileId", str4);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str4)));
                }
                f60Var.c.getClass();
                if (!TextUtils.isEmpty(str4)) {
                    f60Var.c.getClass();
                    bundle2.putString("oldSkuPurchaseToken", str4);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle2.putString("oldSkuPurchaseId", str4);
                }
                f60Var.c.getClass();
                if (!TextUtils.isEmpty(str4)) {
                    f60Var.c.getClass();
                    bundle2.putString("originalExternalTransactionId", str4);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle2.putString("paymentsPurchaseParams", str4);
                }
                if (z4) {
                    z7 = true;
                    bundle2.putBoolean("enablePendingPurchases", true);
                } else {
                    z7 = true;
                }
                if (z5) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z7);
                }
                arrayList = new ArrayList();
                nr8VarListIterator = f60Var.d.listIterator(0);
                while (nr8VarListIterator.hasNext()) {
                    ((e60) nr8VarListIterator.next()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    yt8 yt8VarO = zt8.o();
                    yt8VarO.b();
                    zt8.p((zt8) yt8VarO.n, arrayList);
                    bundle2.putByteArray("subscriptionProductReplacementParamsList", ((zt8) yt8VarO.a()).b());
                }
                if (arrayList12.isEmpty()) {
                    arrayList2 = new ArrayList<>(yr8Var.size() - 1);
                    arrayList3 = new ArrayList<>(yr8Var.size() - 1);
                    arrayList4 = new ArrayList<>();
                    arrayList5 = new ArrayList<>();
                    arrayList6 = new ArrayList<>();
                    arrayList7 = new ArrayList<>();
                    i3 = 0;
                    while (i3 < yr8Var.size()) {
                        e60 e60Var5 = (e60) yr8Var.get(i3);
                        kt5Var = e60Var5.a;
                        long j3 = j;
                        if (!kt5Var.f.isEmpty()) {
                            arrayList4.add(kt5Var.f);
                        }
                        str5 = e60Var5.b;
                        arrayList5.add(str5);
                        if (TextUtils.isEmpty(str5) || (arrayList8 = kt5Var.i) == null || arrayList8.isEmpty()) {
                            str6 = kt5Var.g;
                            break;
                        }
                        Iterator it5 = arrayList8.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                str6 = kt5Var.g;
                                break;
                            }
                            ht5 ht5Var = (ht5) it5.next();
                            Iterator it6 = it5;
                            if (!TextUtils.isEmpty(ht5Var.c) && Objects.equals(ht5Var.a, str5)) {
                                str6 = ht5Var.c;
                                break;
                            }
                            it5 = it6;
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            arrayList6.add(str6);
                        }
                        if (i3 > 0) {
                            arrayList2.add(((e60) yr8Var.get(i3)).a.c);
                            arrayList3.add(((e60) yr8Var.get(i3)).a.d);
                        }
                        i3++;
                        j = j3;
                    }
                    j2 = j;
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                    if (!arrayList7.isEmpty()) {
                        bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                    }
                    if (!arrayList4.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                    }
                    if (!arrayList6.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle2.putStringArrayList("additionalSkus", arrayList2);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                    }
                } else {
                    arrayList9 = new ArrayList<>();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    it = arrayList12.iterator();
                    if (!it.hasNext()) {
                        it.next().getClass();
                        io.sentry.h2.f();
                        return null;
                    }
                    if (!arrayList9.isEmpty()) {
                        bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                    }
                    if (arrayList12.size() > 1) {
                        arrayList10 = new ArrayList<>(arrayList12.size() - 1);
                        arrayList11 = new ArrayList<>(arrayList12.size() - 1);
                        if (arrayList12.size() <= 1) {
                            arrayList12.get(1).getClass();
                            io.sentry.h2.f();
                            return null;
                        }
                        bundle2.putStringArrayList("additionalSkus", arrayList10);
                        bundle2.putStringArrayList("additionalSkuTypes", arrayList11);
                    }
                    j2 = j;
                }
                if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f493o) {
                    g60 g60Var10 = jt8.l;
                    t(21, g60Var10, j2, z6);
                    E(g60Var10);
                    return g60Var10;
                }
                if (TextUtils.isEmpty(e60Var.a.b.optString("packageName"))) {
                    z8 = false;
                } else {
                    bundle2.putString("skuPackageName", e60Var.a.b.optString("packageName"));
                    z8 = true;
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                intent = activity.getIntent();
                if (intent == null) {
                    tr8.h("BillingClient", "Activity's intent is null.");
                } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle2.putString("proxyPackage", stringExtra);
                    try {
                        bundle2.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused) {
                        bundle2.putString("proxyPackageVersion", "package not found");
                    }
                }
                if (this.x) {
                    i4 = 28;
                } else if (!this.r && !yr8Var.isEmpty()) {
                    i4 = 17;
                } else if (!this.p && z8) {
                    i4 = 15;
                } else if (this.n) {
                    i4 = 9;
                } else {
                    i4 = 6;
                }
                final int i12 = i4;
                final String str14 = str2;
                final String str15 = str3;
                futureG = g(new Callable(i12, str14, str15, f60Var, bundle2) { // from class: o.oq8
                    public final /* synthetic */ int b;
                    public final /* synthetic */ String c;
                    public final /* synthetic */ String d;
                    public final /* synthetic */ Bundle e;

                    {
                        this.e = bundle2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleC;
                        yq8 yq8Var;
                        c60 c60Var = this.a;
                        int i13 = this.b;
                        String str16 = this.c;
                        String str17 = this.d;
                        Bundle bundle3 = this.e;
                        try {
                            synchronized (c60Var.a) {
                                yq8Var = c60Var.i;
                            }
                            if (yq8Var == null) {
                                return tr8.c(jt8.h, 107);
                            }
                            return ((wq8) yq8Var).h(i13, c60Var.g.getPackageName(), str16, str17, bundle3);
                        } catch (DeadObjectException e) {
                            g60 g60Var11 = jt8.h;
                            String strA = gt8.a(e);
                            bundleC = tr8.c(g60Var11, 5);
                            if (strA != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                            }
                            return bundleC;
                        } catch (Exception e2) {
                            g60 g60Var12 = jt8.f;
                            String strA2 = gt8.a(e2);
                            bundleC = tr8.c(g60Var12, 5);
                            if (strA2 != null) {
                                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                            }
                            return bundleC;
                        }
                    }
                }, 5000L, null, this.e, f());
                r4 = str15;
                r6 = bundle2;
                z3 = z6;
            } else {
                j = r4;
                z2 = z;
                j2 = j;
                z3 = z2;
                String str16 = str3;
                futureG = g(new rq8(this, str2, str16, (byte) 0), 5000L, null, this.e, f());
                r4 = str16;
                r6 = z2;
            }
            try {
                if (futureG == null) {
                    try {
                        g60 g60Var11 = jt8.b;
                        t(25, g60Var11, j2, z3);
                        E(g60Var11);
                        return g60Var11;
                    } catch (CancellationException e) {
                        e = e;
                        r9 = j2;
                        r8 = z3;
                        tr8.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        g60 g60Var12 = jt8.i;
                        u(4, g60Var12, gt8.a(e), r9, r8);
                        E(g60Var12);
                        return g60Var12;
                    } catch (TimeoutException e2) {
                        e = e2;
                        r9 = j2;
                        r8 = z3;
                        tr8.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        g60 g60Var13 = jt8.i;
                        u(4, g60Var13, gt8.a(e), r9, r8);
                        E(g60Var13);
                        return g60Var13;
                    } catch (Exception e3) {
                        e = e3;
                        r5 = j2;
                        r7 = z3;
                        tr8.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        g60 g60Var14 = jt8.h;
                        u(5, g60Var14, gt8.a(e), r5, r7);
                        E(g60Var14);
                        return g60Var14;
                    }
                }
                r4 = j2;
                r6 = z3;
                bundle = (Bundle) futureG.get(5000L, TimeUnit.MILLISECONDS);
                iA = tr8.a("BillingClient", bundle);
                strF = tr8.f("BillingClient", bundle);
                if (iA != 0) {
                    ?? intent2 = new Intent((Context) activity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", r4);
                    intent2.putExtra("wasServiceAutoReconnected", r6);
                    activity.startActivity(intent2);
                    return jt8.g;
                }
                tr8.h("BillingClient", fx3.e(iA, "Unable to buy item, Error response code: "));
                g60 g60VarA3 = jt8.a(iA, strF);
                try {
                    if (bundle != null) {
                        try {
                            obj = bundle.get("LOG_REASON");
                            if (obj != null) {
                                if (obj instanceof Integer) {
                                    iA2 = to7.a(((Integer) obj).intValue());
                                    i2 = 1;
                                } else {
                                    tr8.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                                }
                                if (iA2 == i2) {
                                    iA2 = 23;
                                }
                                if (bundle == null) {
                                    string = null;
                                } else {
                                    try {
                                        string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                                    } catch (Throwable th2) {
                                        tr8.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                                        string = null;
                                    }
                                }
                                u(iA2, g60VarA3, string, r4, r6);
                                E(g60VarA3);
                                return g60VarA3;
                            }
                        } catch (Throwable th3) {
                            tr8.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                        }
                    }
                    u(iA2, g60VarA3, string, r4, r6);
                    E(g60VarA3);
                    return g60VarA3;
                } catch (CancellationException e4) {
                    e = e4;
                    r9 = r4;
                    r8 = r6;
                    tr8.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    g60 g60Var15 = jt8.i;
                    u(4, g60Var15, gt8.a(e), r9, r8);
                    E(g60Var15);
                    return g60Var15;
                } catch (TimeoutException e5) {
                    e = e5;
                    r9 = r4;
                    r8 = r6;
                    tr8.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    g60 g60Var16 = jt8.i;
                    u(4, g60Var16, gt8.a(e), r9, r8);
                    E(g60Var16);
                    return g60Var16;
                } catch (Exception e6) {
                    e = e6;
                    r5 = r4;
                    r7 = r6;
                    tr8.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    g60 g60Var17 = jt8.h;
                    u(5, g60Var17, gt8.a(e), r5, r7);
                    E(g60Var17);
                    return g60Var17;
                }
                i2 = 1;
                iA2 = 1;
                if (iA2 == i2) {
                    iA2 = 23;
                }
                if (bundle == null) {
                    string = null;
                } else {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                }
            } catch (CancellationException e7) {
                e = e7;
                r9 = r4;
                r8 = r6;
            } catch (TimeoutException e8) {
                e = e8;
                r9 = r4;
                r8 = r6;
            } catch (Exception e9) {
                e = e9;
                r5 = r4;
                r7 = r6;
                tr8.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                g60 g60Var18 = jt8.h;
                u(5, g60Var18, gt8.a(e), r5, r7);
                E(g60Var18);
                return g60Var18;
            }
        }
        g60Var = g60VarA2;
        str3 = str8;
        if (g60Var != jt8.g) {
            t(108, g60Var, jNextLong, z);
            E(g60Var);
            return g60Var;
        }
        if (this.m) {
            z4 = this.n;
            z5 = this.s;
            this.y.getClass();
            this.y.getClass();
            String str17 = this.d;
            long jLongValue2 = this.D.longValue();
            this.g.getPackageName();
            int i13 = tr8.a;
            z6 = z2;
            bundle2 = new Bundle();
            tr8.b(bundle2, str17, jLongValue2);
            bundle2.putLong("billingClientTransactionId", j);
            f60Var.c.getClass();
            if (!TextUtils.isEmpty(f60Var.b)) {
                j = r4;
                z2 = z;
                bundle2.putString("accountId", f60Var.b);
            }
            j = r4;
            z2 = z;
            if (TextUtils.isEmpty(str)) {
                str4 = str;
                bundle2.putString("obfuscatedProfileId", str4);
            } else {
                str4 = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str4)));
            }
            f60Var.c.getClass();
            if (!TextUtils.isEmpty(str4)) {
                f60Var.c.getClass();
                bundle2.putString("oldSkuPurchaseToken", str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("oldSkuPurchaseId", str4);
            }
            f60Var.c.getClass();
            if (!TextUtils.isEmpty(str4)) {
                f60Var.c.getClass();
                bundle2.putString("originalExternalTransactionId", str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("paymentsPurchaseParams", str4);
            }
            if (z4) {
                z7 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z7 = true;
            }
            if (z5) {
                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z7);
            }
            arrayList = new ArrayList();
            nr8VarListIterator = f60Var.d.listIterator(0);
            while (nr8VarListIterator.hasNext()) {
                ((e60) nr8VarListIterator.next()).getClass();
            }
            if (!arrayList.isEmpty()) {
                yt8 yt8VarO2 = zt8.o();
                yt8VarO2.b();
                zt8.p((zt8) yt8VarO2.n, arrayList);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((zt8) yt8VarO2.a()).b());
            }
            if (arrayList12.isEmpty()) {
                arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                it = arrayList12.iterator();
                if (!it.hasNext()) {
                    it.next().getClass();
                    io.sentry.h2.f();
                    return null;
                }
                if (!arrayList9.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList12.size() > 1) {
                    arrayList10 = new ArrayList<>(arrayList12.size() - 1);
                    arrayList11 = new ArrayList<>(arrayList12.size() - 1);
                    if (arrayList12.size() <= 1) {
                        arrayList12.get(1).getClass();
                        io.sentry.h2.f();
                        return null;
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList10);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                j2 = j;
            } else {
                arrayList2 = new ArrayList<>(yr8Var.size() - 1);
                arrayList3 = new ArrayList<>(yr8Var.size() - 1);
                arrayList4 = new ArrayList<>();
                arrayList5 = new ArrayList<>();
                arrayList6 = new ArrayList<>();
                arrayList7 = new ArrayList<>();
                i3 = 0;
                while (i3 < yr8Var.size()) {
                    e60 e60Var6 = (e60) yr8Var.get(i3);
                    kt5Var = e60Var6.a;
                    long j4 = j;
                    if (!kt5Var.f.isEmpty()) {
                        arrayList4.add(kt5Var.f);
                    }
                    str5 = e60Var6.b;
                    arrayList5.add(str5);
                    if (TextUtils.isEmpty(str5)) {
                        str6 = kt5Var.g;
                        break;
                    }
                    str6 = kt5Var.g;
                    break;
                    if (!TextUtils.isEmpty(str6)) {
                        arrayList6.add(str6);
                    }
                    if (i3 > 0) {
                        arrayList2.add(((e60) yr8Var.get(i3)).a.c);
                        arrayList3.add(((e60) yr8Var.get(i3)).a.d);
                    }
                    i3++;
                    j = j4;
                }
                j2 = j;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList2);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            }
            if (!bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST")) {
            }
            if (TextUtils.isEmpty(e60Var.a.b.optString("packageName"))) {
                bundle2.putString("skuPackageName", e60Var.a.b.optString("packageName"));
                z8 = true;
            } else {
                z8 = false;
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            intent = activity.getIntent();
            if (intent == null) {
                tr8.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra2 = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra2);
                bundle2.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra2, 0).versionName);
            }
            if (this.x) {
                i4 = 28;
            } else if (!this.r) {
                if (!this.p) {
                    if (this.n) {
                        i4 = 9;
                    } else {
                        i4 = 6;
                    }
                } else if (this.n) {
                    i4 = 9;
                } else {
                    i4 = 6;
                }
            } else if (!this.p) {
                if (this.n) {
                    i4 = 9;
                } else {
                    i4 = 6;
                }
            } else if (this.n) {
                i4 = 9;
            } else {
                i4 = 6;
            }
            final int i14 = i4;
            final String str18 = str2;
            final String str19 = str3;
            futureG = g(new Callable(i14, str18, str19, f60Var, bundle2) { // from class: o.oq8
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Bundle e;

                {
                    this.e = bundle2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleC;
                    yq8 yq8Var;
                    c60 c60Var = this.a;
                    int i15 = this.b;
                    String str110 = this.c;
                    String str111 = this.d;
                    Bundle bundle3 = this.e;
                    try {
                        synchronized (c60Var.a) {
                            yq8Var = c60Var.i;
                        }
                        if (yq8Var == null) {
                            return tr8.c(jt8.h, 107);
                        }
                        return ((wq8) yq8Var).h(i15, c60Var.g.getPackageName(), str110, str111, bundle3);
                    } catch (DeadObjectException e10) {
                        g60 g60Var19 = jt8.h;
                        String strA = gt8.a(e10);
                        bundleC = tr8.c(g60Var19, 5);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e11) {
                        g60 g60Var110 = jt8.f;
                        String strA2 = gt8.a(e11);
                        bundleC = tr8.c(g60Var110, 5);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.e, f());
            r4 = str19;
            r6 = bundle2;
            z3 = z6;
        } else {
            j = r4;
            z2 = z;
            j2 = j;
            z3 = z2;
            String str110 = str3;
            futureG = g(new rq8(this, str2, str110, (byte) 0), 5000L, null, this.e, f());
            r4 = str110;
            r6 = z2;
        }
        if (futureG == null) {
            g60 g60Var19 = jt8.b;
            t(25, g60Var19, j2, z3);
            E(g60Var19);
            return g60Var19;
        }
        r4 = j2;
        r6 = z3;
        bundle = (Bundle) futureG.get(5000L, TimeUnit.MILLISECONDS);
        iA = tr8.a("BillingClient", bundle);
        strF = tr8.f("BillingClient", bundle);
        if (iA != 0) {
            ?? intent3 = new Intent((Context) activity, (Class<?>) ProxyBillingActivity.class);
            intent3.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
            intent3.putExtra("billingClientTransactionId", r4);
            intent3.putExtra("wasServiceAutoReconnected", r6);
            activity.startActivity(intent3);
            return jt8.g;
        }
        tr8.h("BillingClient", fx3.e(iA, "Unable to buy item, Error response code: "));
        g60 g60VarA4 = jt8.a(iA, strF);
        if (bundle != null) {
            obj = bundle.get("LOG_REASON");
            if (obj != null) {
                if (obj instanceof Integer) {
                    iA2 = to7.a(((Integer) obj).intValue());
                    i2 = 1;
                } else {
                    tr8.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
                if (iA2 == i2) {
                    iA2 = 23;
                }
                if (bundle == null) {
                    string = null;
                } else {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                }
                u(iA2, g60VarA4, string, r4, r6);
                E(g60VarA4);
                return g60VarA4;
            }
        }
        i2 = 1;
        iA2 = 1;
        if (iA2 == i2) {
            iA2 = 23;
        }
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("ADDITIONAL_LOG_DETAILS");
        }
        u(iA2, g60VarA4, string, r4, r6);
        E(g60VarA4);
        return g60VarA4;
        tr8.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
        g60 g60Var110 = jt8.i;
        u(4, g60Var110, gt8.a(e), r9, r8);
        E(g60Var110);
        return g60Var110;
    }

    public void c(wy5 wy5Var, ag3 ag3Var) {
        if (g(new rq8(this, ag3Var, wy5Var, (byte) 1), 30000L, new it8((Object) this, (Object) ag3Var, (byte) 27), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), f()) == null) {
            g60 g60VarJ = j();
            r(25, 7, g60VarJ);
            nr8 nr8Var = yr8.n;
            ds8 ds8Var = ds8.q;
            ag3Var.b(g60VarJ, new yy5(ds8Var, ds8Var));
        }
    }

    public final void d(zy5 zy5Var, mx5 mx5Var) {
        if (g(new rq8(this, mx5Var, zy5Var.a), 30000L, new it8((Object) this, (Object) mx5Var, (byte) 24), Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper()), f()) == null) {
            g60 g60VarJ = j();
            r(25, 9, g60VarJ);
            nr8 nr8Var = yr8.n;
            mx5Var.a(g60VarJ, ds8.q);
        }
    }

    public void e(xk1 xk1Var) {
        z(xk1Var, 0);
    }

    public final synchronized ExecutorService f() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.C;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(tr8.a, new wy4(this));
            this.C = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    public final gy8 h(g60 g60Var, int i, String str, Exception exc) {
        tr8.i("BillingClient", str, exc);
        try {
            v(gt8.b(i, 7, g60Var, gt8.a(exc), mw8.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
        return new gy8(g60Var.a, g60Var.c, new ArrayList(), new ArrayList());
    }

    public final g60 i(int i) {
        tr8.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        hw8 hw8VarP = iw8.p();
        hw8VarP.b();
        iw8.o((iw8) hw8VarP.n, 6);
        ix8 ix8VarO = jx8.o();
        ix8VarO.b();
        jx8.t((jx8) ix8VarO.n);
        ix8VarO.c(i > 0);
        ix8VarO.d(i);
        hw8VarP.b();
        iw8.u((iw8) hw8VarP.n, (jx8) ix8VarO.a());
        w((iw8) hw8VarP.a());
        return jt8.g;
    }

    public final g60 j() {
        int[] iArr = {0, 3};
        synchronized (this.a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return jt8.h;
                }
            }
            return jt8.f;
        }
    }

    public final lt8 k(int i) {
        if (!this.z || D()) {
            tr8.g("BillingClient", "Already connected or not opted into auto reconnection.");
            return new kt8(jt8.g);
        }
        sx8 sx8Var = new sx8();
        sx8Var.c = new fy8();
        by8 by8Var = new by8(sx8Var);
        sx8Var.b = by8Var;
        sx8Var.a = iq8.class;
        try {
            z(new lh7((byte) 21, this, sx8Var, false), i);
            sx8Var.a = "reconnectIfNeeded";
            return by8Var;
        } catch (Exception e) {
            by8Var.b(e);
            return by8Var;
        }
    }

    public final void l() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final lh7 q(g60 g60Var, int i, String str, Exception exc) {
        try {
            v(gt8.b(i, 9, g60Var, gt8.a(exc), mw8.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
        tr8.i("BillingClient", str, exc);
        return new lh7((byte) 24, g60Var, null, false);
    }

    public final void r(int i, int i2, g60 g60Var) {
        try {
            int i3 = gt8.a;
            v(gt8.b(i, i2, g60Var, null, mw8.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void s(int i, g60 g60Var, long j) {
        try {
            int i2 = gt8.a;
            try {
                this.h.K(gt8.b(i, 2, g60Var, null, mw8.BROADCAST_ACTION_UNSPECIFIED), this.l, j);
            } catch (Throwable th) {
                tr8.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tr8.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(int i, g60 g60Var, long j, boolean z) {
        try {
            int i2 = gt8.a;
            try {
                this.h.M(gt8.b(i, 2, g60Var, null, mw8.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                tr8.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tr8.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void u(int i, g60 g60Var, String str, long j, boolean z) {
        try {
            int i2 = gt8.a;
            try {
                this.h.M(gt8.b(i, 2, g60Var, str, mw8.BROADCAST_ACTION_UNSPECIFIED), this.l, j, z);
            } catch (Throwable th) {
                tr8.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tr8.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void v(gw8 gw8Var) {
        try {
            lh7 lh7Var = this.h;
            int i = this.l;
            lh7Var.getClass();
            try {
                rw8 rw8Var = (rw8) ((sw8) lh7Var.n).l();
                rw8Var.b();
                sw8.B((sw8) rw8Var.n, i);
                lh7Var.n = (sw8) rw8Var.a();
                lh7Var.J(gw8Var);
            } catch (Throwable th) {
                tr8.i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            tr8.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void w(iw8 iw8Var) {
        try {
            lh7 lh7Var = this.h;
            int i = this.l;
            lh7Var.getClass();
            try {
                rw8 rw8Var = (rw8) ((sw8) lh7Var.n).l();
                rw8Var.b();
                sw8.B((sw8) rw8Var.n, i);
                sw8 sw8Var = (sw8) rw8Var.a();
                lh7Var.n = sw8Var;
                try {
                    lh7Var.T(iw8Var, sw8Var);
                } catch (Throwable th) {
                    tr8.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                tr8.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            tr8.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void x(int i, int i2, g60 g60Var) {
        try {
            int i3 = gt8.a;
            fw8 fw8Var = (fw8) gt8.b(i, 6, g60Var, null, mw8.BROADCAST_ACTION_UNSPECIFIED).l();
            ix8 ix8VarO = jx8.o();
            ix8VarO.c(i2 > 0);
            ix8VarO.d(i2);
            fw8Var.d(ix8VarO);
            v((gw8) fw8Var.a());
        } catch (Throwable th) {
            tr8.i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(int i) {
        String str;
        String str2;
        synchronized (this.a) {
            try {
                if (this.b == 3) {
                    return;
                }
                byte b = this.b;
                if (b == 0) {
                    str = "DISCONNECTED";
                } else if (b != 1) {
                    str = b != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                tr8.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(d60 d60Var, int i) {
        int i2;
        g60 g60VarI;
        g60 g60Var;
        synchronized (this.a) {
            try {
                if (D()) {
                    g60VarI = i(i);
                } else {
                    if (this.b == 1) {
                        tr8.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        g60Var = jt8.c;
                        x(37, i, g60Var);
                    } else if (this.b == 3) {
                        tr8.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        g60Var = jt8.h;
                        x(38, i, g60Var);
                    } else {
                        y(1);
                        if (i == 0) {
                            this.B = d60Var;
                            i = 0;
                        }
                        A();
                        tr8.g("BillingClient", "Starting in-app billing setup.");
                        this.j = new pr8(this, d60Var, i);
                        pr8 pr8Var = this.j;
                        synchronized (pr8Var.e.a) {
                            kr8 kr8Var = pr8Var.b;
                            kr8Var.c = 0L;
                            kr8Var.b = false;
                            kr8Var.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    tr8.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.a) {
                                        try {
                                            if (this.b == 2) {
                                                g60VarI = i(i);
                                            } else if (this.b != 1) {
                                                tr8.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                g60Var = jt8.h;
                                                x(105, i, g60Var);
                                            } else {
                                                pr8 pr8Var2 = this.j;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.g.bindService(intent2, pr8Var2, 1) : this.g.bindService(intent2, 1, f(), pr8Var2)) {
                                                    tr8.g("BillingClient", "Service was bonded successfully.");
                                                    g60VarI = null;
                                                } else {
                                                    tr8.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i2 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                tr8.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        y(0);
                        tr8.g("BillingClient", "Billing service unavailable on device.");
                        g60 g60Var2 = jt8.a;
                        x(i2, i, g60Var2);
                        g60VarI = g60Var2;
                    }
                    g60VarI = g60Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g60VarI != null) {
            d60Var.G(g60VarI);
        }
    }

    public c60(RemoteControlApplication remoteControlApplication, b60 b60Var) {
        int i = as8.f357o;
        this.A = js8.v;
        long jNextLong = new Random().nextLong();
        this.D = Long.valueOf(jNextLong);
        this.E = ir8.a;
        this.c = "9.1.0";
        String strM = m();
        this.d = strM;
        this.g = remoteControlApplication.getApplicationContext();
        rw8 rw8VarY = sw8.y();
        rw8VarY.i();
        if (strM != null) {
            rw8VarY.b();
            sw8.x((sw8) rw8VarY.n, strM);
        }
        rw8VarY.h(this.g.getPackageName());
        rw8VarY.b();
        sw8.C((sw8) rw8VarY.n, jNextLong);
        boolean z = b60Var.e;
        rw8VarY.b();
        sw8.v((sw8) rw8VarY.n, z);
        rw8VarY.c(Build.VERSION.SDK_INT);
        rw8VarY.g();
        p(rw8VarY, remoteControlApplication);
        try {
            rw8VarY.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            tr8.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new lh7(this.g, (sw8) rw8VarY.a());
        this.g.getPackageName();
        this.z = b60Var.e;
    }

    public c60(aw awVar, RemoteControlApplication remoteControlApplication, b60 b60Var) {
        int i = as8.f357o;
        this.A = js8.v;
        long jNextLong = new Random().nextLong();
        this.D = Long.valueOf(jNextLong);
        this.E = ir8.a;
        this.c = "9.1.0";
        String strM = m();
        this.d = strM;
        this.g = remoteControlApplication.getApplicationContext();
        rw8 rw8VarY = sw8.y();
        rw8VarY.i();
        if (strM != null) {
            rw8VarY.b();
            sw8.x((sw8) rw8VarY.n, strM);
        }
        rw8VarY.h(this.g.getPackageName());
        rw8VarY.b();
        sw8.C((sw8) rw8VarY.n, jNextLong);
        boolean z = b60Var.e;
        rw8VarY.b();
        sw8.v((sw8) rw8VarY.n, z);
        rw8VarY.c(Build.VERSION.SDK_INT);
        rw8VarY.g();
        p(rw8VarY, remoteControlApplication);
        try {
            rw8VarY.d(this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            tr8.i("BillingClient", "Error getting app version code.", th);
        }
        this.h = new lh7(this.g, (sw8) rw8VarY.a());
        tr8.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f = new ny8(this.g, null, this.h);
        this.y = awVar;
        this.g.getPackageName();
        this.z = b60Var.e;
    }
}
