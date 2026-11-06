package o;

import android.os.Trace;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rr5 implements w34 {
    public long A;
    public long B = jt4.a();
    public boolean C;
    public final /* synthetic */ io.sentry.z7 D;
    public final int m;
    public final ep3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f1943o;
    public r61 p;
    public kd7 q;
    public o14 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Object v;
    public boolean w;
    public qr5 x;
    public boolean y;
    public long z;

    public rr5(io.sentry.z7 z7Var, int i, ep3 ep3Var, ek3 ek3Var) {
        this.D = z7Var;
        this.m = i;
        this.n = ep3Var;
        this.f1943o = ek3Var;
    }

    @Override // o.w34
    public final void I() {
        this.y = true;
    }

    public final void a() {
        o14 o14Var = this.r;
        if (o14Var != null) {
            switch (o14Var.a) {
                case 0:
                    break;
                default:
                    h14 h14VarB = o14Var.b();
                    if ((h14VarB != null ? h14VarB.f : null) != null) {
                        o14Var.b.g(o14Var.c);
                    }
                    break;
            }
        }
        this.r = null;
        kd7 kd7Var = this.q;
        if (kd7Var != null) {
            kd7Var.a();
        }
        this.q = null;
        this.x = null;
    }

    public final boolean b(ik ikVar) {
        boolean zC;
        if (!this.D.a) {
            return false;
        }
        if (this.y) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zC = c(ikVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zC = c(ikVar);
        }
        hm3.F("compose:lazy:prefetch:execute:item", -1L);
        return zC;
    }

    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean c(o.ik r25) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rr5.c(o.ik):boolean");
    }

    @Override // o.w34
    public final void cancel() {
        if (this.t) {
            return;
        }
        this.t = true;
        a();
    }

    public final boolean d() {
        o14 o14Var;
        return this.u || ((o14Var = this.r) != null && o14Var.c());
    }

    public final void e(Object obj, Object obj2, b10 b10Var) {
        o14 o14Var;
        o14 o14Var2 = this.r;
        byte b = 0;
        if (o14Var2 == null) {
            io.sentry.z7 z7Var = this.D;
            hw2 hw2VarA = ((o34) z7Var.b).a(this.m, obj, obj2);
            p14 p14VarA = ((ld7) z7Var.c).a();
            if (p14VarA.m.W()) {
                p14VarA.k(obj, hw2VarA, true);
                o14Var = new o14(p14VarA, obj, (byte) 1);
            } else {
                o14Var = new o14(p14VarA, obj, b);
            }
            o14Var2 = o14Var;
            this.r = o14Var2;
            this.v = obj;
        }
        this.C = false;
        while (!o14Var2.c() && !this.C) {
            io.sentry.q7 q7Var = new io.sentry.q7(this, b10Var, (byte) 24);
            switch (o14Var2.a) {
                case 0:
                    break;
                default:
                    h14 h14VarB = o14Var2.b();
                    yh5 yh5Var = h14VarB != null ? h14VarB.f : null;
                    if (yh5Var == null || yh5Var.c()) {
                        break;
                    } else {
                        n47 n47VarC = el5.c();
                        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                        n47 n47VarF = el5.f(n47VarC);
                        try {
                            yh5Var.e(q7Var);
                            el5.h(n47VarC, n47VarF, function1E);
                            break;
                        } catch (Throwable th) {
                            try {
                                h14VarB.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                el5.h(n47VarC, n47VarF, function1E);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        g();
        boolean z = this.C;
        long j = this.A;
        if (z) {
            b10Var.b = b10.a(j, b10Var.b);
        } else {
            b10Var.a = b10.a(j, b10Var.a);
        }
    }

    public final boolean f(long j, long j2) {
        if (this.y) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void g() {
        long jC;
        long jA = jt4.a();
        long j = this.B;
        int i = jt4.b;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jC = (1 | (jA - 1)) == Long.MAX_VALUE ? vs1.C(jA) : vs1.U(jA, j);
        } else if (jA == j) {
            aw awVar = c72.n;
            jC = 0;
        } else {
            jC = c72.h(vs1.C(j));
        }
        long j3 = jC >> 1;
        aw awVar2 = c72.n;
        if ((((int) jC) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.A = j2;
        long j4 = this.z - j2;
        this.z = j4;
        this.B = jA;
        hm3.F("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final String toString() {
        r61 r61Var = this.p;
        boolean zD = d();
        boolean z = this.s;
        boolean z2 = this.t;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.m);
        sb.append(", constraints = ");
        sb.append(r61Var);
        sb.append(", isComposed = ");
        fx3.s(sb, zD, ", isMeasured = ", z, ", isCanceled = ");
        return ua5.n(" }", sb, z2);
    }
}
