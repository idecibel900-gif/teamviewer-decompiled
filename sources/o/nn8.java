package o;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nn8 {
    public final xm8 a;
    public final Context b;
    public final String c;
    public final yc4 d;
    public final d11 e;
    public final dt5 f;
    public final WorkDatabase g;
    public final an8 h;
    public final rn1 i;
    public final ArrayList j;
    public final String k;
    public final dp3 l;
    public final ArrayList m;
    public final ArrayList n;

    public nn8(io.sentry.android.core.d dVar) {
        xm8 xm8Var = (xm8) dVar.q;
        this.a = xm8Var;
        this.b = (Context) dVar.s;
        String str = xm8Var.a;
        this.c = str;
        this.d = (yc4) dVar.n;
        this.e = (d11) dVar.m;
        this.f = (dt5) dVar.f100o;
        WorkDatabase workDatabase = (WorkDatabase) dVar.p;
        this.g = workDatabase;
        this.h = workDatabase.w();
        this.i = workDatabase.r();
        ArrayList arrayList = (ArrayList) dVar.r;
        this.j = arrayList;
        String str2 = xm8Var.c;
        this.k = e41.l(e41.o("Work [ id=", str, ", class=", str2, ", tags={ "), lv0.t0(arrayList, ",", null, null, null, 62), " } ]");
        this.l = ds1.r();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    public final void a(kc4 kc4Var) {
        we4.f().g(on8.a, "Worker result FAILURE for ".concat(this.k));
        if (this.a.b()) {
            c();
        } else {
            f(kc4Var);
        }
    }

    public final void b(int i) {
        an8 an8Var = this.h;
        lm8 lm8Var = lm8.m;
        String str = this.c;
        an8Var.f(lm8Var, str);
        an8Var.e(str, System.currentTimeMillis());
        an8Var.d(this.a.v, str);
        an8Var.c(str, -1L);
        an8Var.g(i, str);
    }

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        an8 an8Var = this.h;
        String str = this.c;
        an8Var.e(str, jCurrentTimeMillis);
        an8Var.f(lm8.m, str);
        ze6 ze6Var = an8Var.a;
        ((Number) au8.M(ze6Var, false, true, new zm8(str, (byte) 3))).intValue();
        an8Var.d(this.a.v, str);
        au8.M(ze6Var, false, true, new zm8(str, (byte) 4));
        an8Var.c(str, -1L);
    }

    public final boolean d(int i) {
        xm8 xm8Var = this.a;
        if (im3.n(xm8Var.y, Boolean.TRUE)) {
            String str = on8.a;
            we4.f().c(str, "Worker " + xm8Var.c + " was interrupted. Backing off.");
            b(i);
            return true;
        }
        an8 an8Var = this.h;
        String str2 = this.c;
        lm8 lm8VarA = an8Var.a(str2);
        if (lm8VarA == null || lm8VarA.a()) {
            String str3 = on8.a;
            we4.f().c(str3, "Status for " + str2 + " is " + lm8VarA + " ; not doing any work");
            return false;
        }
        String str4 = on8.a;
        we4.f().c(str4, "Status for " + str2 + " is " + lm8VarA + "; not doing any work and rescheduling for later execution");
        an8Var.f(lm8.m, str2);
        an8Var.g(i, str2);
        an8Var.c(str2, -1L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object e(jc1 jc1Var) throws Throwable {
        mn8 mn8Var;
        OverwritingInputMerger overwritingInputMerger;
        xm8 xm8Var = this.a;
        String str = xm8Var.c;
        String str2 = xm8Var.d;
        if (jc1Var instanceof mn8) {
            mn8Var = (mn8) jc1Var;
            int i = mn8Var.f1490o;
            if ((i & Integer.MIN_VALUE) != 0) {
                mn8Var.f1490o = i - Integer.MIN_VALUE;
            } else {
                mn8Var = new mn8(this, jc1Var);
            }
        } else {
            mn8Var = new mn8(this, jc1Var);
        }
        mn8 mn8Var2 = mn8Var;
        Object objJ0 = mn8Var2.m;
        int i2 = mn8Var2.f1490o;
        String str3 = this.k;
        try {
            if (i2 == 0) {
                ct1.a0(objJ0);
                boolean zN = x37.n();
                String str4 = xm8Var.x;
                hc1 hc1Var = null;
                if (zN && str4 != null) {
                    int iHashCode = xm8Var.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq.a(iHashCode, str4.length() <= 127 ? str4 : str4.substring(0, 127));
                    } else {
                        String strSubstring = str4.length() <= 127 ? str4 : str4.substring(0, 127);
                        try {
                            Method method = x37.c;
                            if (method == null) {
                                try {
                                    method = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    x37.c = method;
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof InvocationTargetException) {
                                        Throwable cause = ((InvocationTargetException) e).getCause();
                                        if (cause instanceof RuntimeException) {
                                            throw cause;
                                        }
                                        gk0.r(cause);
                                        return 0;
                                    }
                                    Log.v("Trace", "Unable to call asyncTraceBegin via reflection", e);
                                }
                            }
                            if (method == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            method.invoke(null, Long.valueOf(x37.a), strSubstring, Integer.valueOf(iHashCode));
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                }
                final byte b = 0;
                Callable callable = new Callable(this) { // from class: o.fn8
                    public final /* synthetic */ nn8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        byte b2 = b;
                        lm8 lm8Var = lm8.m;
                        nn8 nn8Var = this.b;
                        switch (b2) {
                            case 0:
                                xm8 xm8Var2 = nn8Var.a;
                                String str5 = xm8Var2.c;
                                if (xm8Var2.b != lm8Var) {
                                    String str6 = on8.a;
                                    we4.f().c(str6, str5 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if ((!xm8Var2.b() && (xm8Var2.b != lm8Var || xm8Var2.k <= 0)) || System.currentTimeMillis() >= xm8Var2.a()) {
                                    return Boolean.FALSE;
                                }
                                we4.f().c(on8.a, "Delaying execution for " + str5 + " because it is being executed before schedule.");
                                return Boolean.TRUE;
                            default:
                                an8 an8Var = nn8Var.h;
                                String str7 = nn8Var.c;
                                boolean z = false;
                                if (an8Var.a(str7) == lm8Var) {
                                    an8Var.f(lm8.n, str7);
                                    ((Number) au8.M(an8Var.a, false, true, new zm8(str7, (byte) 7))).intValue();
                                    an8Var.g(-256, str7);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                };
                WorkDatabase workDatabase = this.g;
                if (((Boolean) workDatabase.n(callable)).booleanValue()) {
                    return new jn8(true);
                }
                boolean zB = xm8Var.b();
                String str5 = this.c;
                if (!zB) {
                    str2.getClass();
                    String str6 = yi3.a;
                    try {
                        Object objNewInstance = Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                    } catch (Exception e3) {
                        we4.f().e(yi3.a, "Trouble instantiating ".concat(str2), e3);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        String str7 = on8.a;
                        we4.f().d(str7, "Could not create Input Merger " + str2);
                        return new jn8(false);
                    }
                    List listK = qf0.K(xm8Var.e);
                    an8 an8Var = this.h;
                    an8Var.getClass();
                    str5.getClass();
                    ArrayList arrayListA0 = lv0.A0(listK, (List) au8.M(an8Var.a, true, false, new zm8(str5, (byte) 5)));
                    og1 og1Var = new og1((byte) 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListA0.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((pg1) it.next()).a);
                        mapUnmodifiableMap.getClass();
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    og1Var.d(linkedHashMap);
                    qf0.V(new pg1(og1Var.a));
                }
                UUID uuidFromString = UUID.fromString(str5);
                d11 d11Var = this.e;
                Executor executor = (Executor) d11Var.m;
                tk1 tk1Var = (tk1) d11Var.n;
                dt5 dt5Var = this.f;
                yc4 yc4Var = this.d;
                jm8 jm8Var = new jm8(workDatabase, dt5Var, yc4Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                new HashSet(this.j);
                workerParameters.b = executor;
                workerParameters.c = tk1Var;
                try {
                    nc4 nc4VarK = d82.z.k(this.b, str, workerParameters);
                    final byte b2 = 1;
                    nc4VarK.d = true;
                    be1 be1VarL0 = mn8Var2.getContext().l0(z06.z);
                    be1VarL0.getClass();
                    bp3 bp3Var = (bp3) be1VarL0;
                    bp3Var.o0(new mk(nc4VarK, str4, zN, this, (byte) 3));
                    Object objN = workDatabase.n(new Callable(this) { // from class: o.fn8
                        public final /* synthetic */ nn8 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3 = b2;
                            lm8 lm8Var = lm8.m;
                            nn8 nn8Var = this.b;
                            switch (b3) {
                                case 0:
                                    xm8 xm8Var2 = nn8Var.a;
                                    String str8 = xm8Var2.c;
                                    if (xm8Var2.b != lm8Var) {
                                        String str9 = on8.a;
                                        we4.f().c(str9, str8 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if ((!xm8Var2.b() && (xm8Var2.b != lm8Var || xm8Var2.k <= 0)) || System.currentTimeMillis() >= xm8Var2.a()) {
                                        return Boolean.FALSE;
                                    }
                                    we4.f().c(on8.a, "Delaying execution for " + str8 + " because it is being executed before schedule.");
                                    return Boolean.TRUE;
                                default:
                                    an8 an8Var2 = nn8Var.h;
                                    String str10 = nn8Var.c;
                                    boolean z = false;
                                    if (an8Var2.a(str10) == lm8Var) {
                                        an8Var2.f(lm8.n, str10);
                                        ((Number) au8.M(an8Var2.a, false, true, new zm8(str10, (byte) 7))).intValue();
                                        an8Var2.g(-256, str10);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    });
                    objN.getClass();
                    if (((Boolean) objN).booleanValue() && !bp3Var.isCancelled()) {
                        eh6 eh6Var = (eh6) yc4Var.q;
                        eh6Var.getClass();
                        fe1 fe1VarW = et1.w(eh6Var);
                        tx txVar = new tx(this, nc4VarK, jm8Var, hc1Var, (byte) 12);
                        mn8Var2.f1490o = 1;
                        objJ0 = im3.j0(fe1VarW, txVar, mn8Var2);
                        ne1 ne1Var = ne1.m;
                        if (objJ0 == ne1Var) {
                            return ne1Var;
                        }
                    }
                    return new jn8(true);
                } catch (Throwable unused) {
                    String str8 = on8.a;
                    we4.f().d(str8, "Could not create Worker " + str);
                    return new jn8(false);
                }
            }
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objJ0);
            mc4 mc4Var = (mc4) objJ0;
            mc4Var.getClass();
            return new hn8(mc4Var);
        } catch (CancellationException e4) {
            String str9 = on8.a;
            we4 we4VarF = we4.f();
            String strConcat = str3.concat(" was cancelled");
            if (we4VarF.m <= 4) {
                Log.i(str9, strConcat, e4);
            }
            throw e4;
        } catch (Throwable th) {
            we4.f().e(on8.a, str3.concat(" failed because it threw an exception/error"), th);
            return new gn8();
        }
    }

    public final void f(mc4 mc4Var) {
        String str = this.c;
        ArrayList arrayListN = qf0.N(str);
        arrayListN.addAll(iq8.q(this.i, str));
        Iterator it = arrayListN.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            an8 an8Var = this.h;
            if (!zHasNext) {
                pg1 pg1Var = ((kc4) mc4Var).a;
                pg1Var.getClass();
                an8Var.d(this.a.v, str);
                au8.M(an8Var.a, false, true, new w18(pg1Var, str, (byte) 7));
                return;
            }
            String str2 = (String) it.next();
            if (an8Var.a(str2) != lm8.r) {
                an8Var.f(lm8.p, str2);
                if (!str2.equals(str)) {
                    this.n.add(str2);
                }
            }
        }
    }
}
