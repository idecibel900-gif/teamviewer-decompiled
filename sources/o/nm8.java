package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nm8 {
    public static nm8 k;
    public static nm8 l;
    public static final Object m;
    public final Context a;
    public final d11 b;
    public final WorkDatabase c;
    public final yc4 d;
    public final List e;
    public final dt5 f;
    public final ud3 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final yc4 j;

    static {
        we4.i("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [int[], java.io.Serializable, java.lang.Object] */
    public nm8(Context context, final d11 d11Var, yc4 yc4Var, final WorkDatabase workDatabase, final List list, dt5 dt5Var, yc4 yc4Var2) {
        vd5 vd5Var;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            hk0.l("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        byte b = 4;
        we4 we4Var = new we4(4);
        synchronized (we4.n) {
            try {
                if (we4.f2403o == null) {
                    we4.f2403o = we4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = yc4Var;
        this.c = workDatabase;
        this.f = dt5Var;
        this.j = yc4Var2;
        this.b = d11Var;
        this.e = list;
        fc1 fc1Var = (fc1) yc4Var.f2598o;
        this.g = new ud3(workDatabase);
        final iq6 iq6Var = (iq6) yc4Var.m;
        String str = aj6.a;
        dt5Var.a(new se2() { // from class: o.zi6
            @Override // o.se2
            public final void e(km8 km8Var, boolean z) {
                iq6Var.execute(new lt2((Object) workDatabase, (Object) km8Var, (Object) list, (Object) d11Var, (byte) 2));
            }
        });
        ((iq6) yc4Var.m).execute(new ss2(applicationContext, this));
        String str2 = x78.a;
        fc1Var.getClass();
        if (bt5.a(applicationContext, d11Var)) {
            ze6 ze6Var = workDatabase.w().a;
            byte b2 = 13;
            yb8 yb8Var = new yb8(b2);
            wm3 wm3VarF = ze6Var.f();
            byte b3 = 1;
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            e38 e38Var = wm3VarF.b;
            e38Var.getClass();
            zu6 zu6Var = new zu6();
            for (String str3 : strArr) {
                LinkedHashMap linkedHashMap = e38Var.c;
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Set set = (Set) linkedHashMap.get(lowerCase);
                if (set != null) {
                    zu6Var.addAll(set);
                } else {
                    zu6Var.add(str3);
                }
            }
            String[] strArr2 = (String[]) lv1.E(zu6Var).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                String str4 = strArr2[i];
                LinkedHashMap linkedHashMap2 = e38Var.f;
                String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num == null) {
                    hk0.g("There is no table with name ".concat(str4));
                    vd5Var = null;
                    String[] strArr3 = (String[]) vd5Var.m;
                    ?? r6 = (int[]) vd5Var.n;
                    strArr3.getClass();
                    r6.getClass();
                    hc1 hc1Var = null;
                    byte b4 = 2;
                    im3.R(fc1Var, null, null, new y0(new yo2(ga0.k(lv1.D(new to2(new jp2(lv1.D(new ih1(new tb(e38Var, r6, strArr3, hc1Var, (byte) 10), b4), -1), ze6Var, yb8Var, b3), new w78(4, null), b4), -1)), new ys7(applicationContext, hc1Var, b), b3), hc1Var, b2), 3);
                }
                iArr[i] = num.intValue();
            }
            vd5Var = new vd5(strArr2, iArr);
            String[] strArr4 = (String[]) vd5Var.m;
            ?? r7 = (int[]) vd5Var.n;
            strArr4.getClass();
            r7.getClass();
            hc1 hc1Var2 = null;
            byte b5 = 2;
            im3.R(fc1Var, null, null, new y0(new yo2(ga0.k(lv1.D(new to2(new jp2(lv1.D(new ih1(new tb(e38Var, r7, strArr4, hc1Var2, (byte) 10), b5), -1), ze6Var, yb8Var, b3), new w78(4, null), b5), -1)), new ys7(applicationContext, hc1Var2, b), b3), hc1Var2, b2), 3);
        }
    }

    public static nm8 a(Context context) {
        nm8 nm8Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        nm8Var = k;
                        if (nm8Var == null) {
                            nm8Var = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nm8Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (nm8Var != null) {
            return nm8Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void b() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Throwable {
        Object obj = this.b.r;
        ks7 ks7Var = new ks7(this, (byte) 9);
        boolean zN = x37.n();
        if (zN) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zN) {
                    Trace.endSection();
                }
            }
        }
        ks7Var.a();
    }
}
