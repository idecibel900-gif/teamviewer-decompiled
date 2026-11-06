package o;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class e38 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final WorkDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final ew1 e;
    public final String[] g;
    public final io.sentry.z7 h;
    public final wh1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Function0 k = new jv6((byte) 29);
    public final LinkedHashMap f = new LinkedHashMap();

    public e38(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, ew1 ew1Var) {
        String lowerCase;
        this.a = workDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = ew1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, xm4.P(lowerCase3, linkedHashMap3));
            }
        }
        int length2 = this.g.length;
        io.sentry.z7 z7Var = new io.sentry.z7();
        z7Var.b = new ReentrantLock();
        z7Var.c = new long[length2];
        z7Var.d = new boolean[length2];
        this.h = z7Var;
        this.i = new wh1(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lo5 lo5Var, jc1 jc1Var) {
        w28 w28Var;
        if (jc1Var instanceof w28) {
            w28Var = (w28) jc1Var;
            int i = w28Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                w28Var.p = i - Integer.MIN_VALUE;
            } else {
                w28Var = new w28(this, jc1Var);
            }
        } else {
            w28Var = new w28(this, jc1Var);
        }
        Object objD = w28Var.n;
        int i2 = w28Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objD);
            yr7 yr7Var = new yr7((byte) 14);
            w28Var.m = lo5Var;
            w28Var.p = 1;
            objD = lo5Var.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", yr7Var, w28Var);
            if (objD != ne1Var) {
            }
            return ne1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) w28Var.m;
            ct1.a0(objD);
            return set;
        }
        lo5Var = (lo5) w28Var.m;
        ct1.a0(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            w28Var.m = set2;
            w28Var.p = 2;
            if (r47.r(lo5Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", w28Var) == ne1Var) {
                return ne1Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(jc1 jc1Var) throws Throwable {
        y28 y28Var;
        wk0 wk0Var;
        Throwable th;
        wk0 wk0Var2;
        Object value;
        int[] iArr;
        if (jc1Var instanceof y28) {
            y28Var = (y28) jc1Var;
            int i = y28Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                y28Var.q = i - Integer.MIN_VALUE;
            } else {
                y28Var = new y28(this, jc1Var);
            }
        } else {
            y28Var = new y28(this, jc1Var);
        }
        Object objQ = y28Var.f2572o;
        int i2 = y28Var.q;
        hc1 hc1Var = null;
        byte b = 0;
        if (i2 == 0) {
            ct1.a0(objQ);
            WorkDatabase_Impl workDatabase_Impl = this.a;
            wk0Var = workDatabase_Impl.f;
            boolean zM = wk0Var.m();
            la2 la2Var = la2.m;
            if (!zM) {
                return la2Var;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    wk0Var.J();
                    return la2Var;
                }
                if (!((Boolean) this.k.a()).booleanValue()) {
                    wk0Var.J();
                    return la2Var;
                }
                z28 z28Var = new z28(this, hc1Var, b);
                y28Var.m = this;
                y28Var.n = wk0Var;
                y28Var.q = 1;
                objQ = workDatabase_Impl.q(false, z28Var, y28Var);
                ne1 ne1Var = ne1.m;
                if (objQ == ne1Var) {
                    return ne1Var;
                }
            } catch (Throwable th2) {
                th = th2;
                wk0Var2 = wk0Var;
                wk0Var2.J();
                throw th;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wk0Var2 = y28Var.n;
            e38 e38Var = y28Var.m;
            try {
                ct1.a0(objQ);
                wk0Var = wk0Var2;
                this = e38Var;
            } catch (Throwable th3) {
                th = th3;
                wk0Var2.J();
                throw th;
            }
        }
        Set set = (Set) objQ;
        if (!set.isEmpty()) {
            wh1 wh1Var = this.i;
            try {
                set.getClass();
                if (!set.isEmpty()) {
                    l97 l97Var = wh1Var.a;
                    do {
                        value = l97Var.getValue();
                        int[] iArr2 = (int[]) value;
                        int length = iArr2.length;
                        iArr = new int[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                        }
                    } while (!l97Var.j(value, iArr));
                }
                this.e.invoke(set);
            } catch (Throwable th4) {
                th = th4;
                wk0Var2 = wk0Var;
                wk0Var2.J();
                throw th;
            }
        }
        wk0Var.J();
        return set;
    }

    public final void c(Function0 function0, Function0 function1) {
        function0.getClass();
        function1.getClass();
        if (this.j.compareAndSet(false, true)) {
            function0.a();
            fc1 fc1Var = this.a.a;
            hc1 hc1Var = null;
            if (fc1Var != null) {
                im3.R(fc1Var, new ie1(ie1.n), null, new mf7(this, function1, hc1Var, (byte) 7), 2);
            } else {
                im3.e0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (o.r47.r(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (o.r47.r(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:28:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(o.y08 r18, int r19, o.jc1 r20) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e38.d(o.y08, int, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(o.y08 r8, int r9, o.jc1 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof o.b38
            if (r0 == 0) goto L13
            r0 = r10
            o.b38 r0 = (o.b38) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            o.b38 r0 = new o.b38
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.r
            int r1 = r0.t
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.q
            int r8 = r0.p
            java.lang.String[] r9 = r0.f388o
            java.lang.String r1 = r0.n
            o.lo5 r3 = r0.m
            o.ct1.a0(r10)
            r10 = r9
            r9 = r3
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            r7 = 0
            return r7
        L38:
            o.ct1.a0(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = o.e38.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L83
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = o.to7.i(r5, r4, r3)
            r0.m = r9
            r0.n = r1
            r0.f388o = r10
            r0.p = r8
            r0.q = r7
            r0.t = r2
            java.lang.Object r3 = o.r47.r(r9, r3, r0)
            o.ne1 r4 = o.ne1.m
            if (r3 != r4) goto L81
            return r4
        L81:
            int r8 = r8 + r2
            goto L4a
        L83:
            o.f88 r7 = o.f88.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e38.e(o.y08, int, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(jc1 jc1Var) throws Throwable {
        c38 c38Var;
        wk0 wk0Var;
        if (jc1Var instanceof c38) {
            c38Var = (c38) jc1Var;
            int i = c38Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c38Var.p = i - Integer.MIN_VALUE;
            } else {
                c38Var = new c38(this, jc1Var);
            }
        } else {
            c38Var = new c38(this, jc1Var);
        }
        Object obj = c38Var.n;
        int i2 = c38Var.p;
        hc1 hc1Var = null;
        byte b = 1;
        if (i2 == 0) {
            ct1.a0(obj);
            WorkDatabase_Impl workDatabase_Impl = this.a;
            wk0 wk0Var2 = workDatabase_Impl.f;
            if (wk0Var2.m()) {
                try {
                    z28 z28Var = new z28(this, hc1Var, b);
                    c38Var.m = wk0Var2;
                    c38Var.p = 1;
                    Object objQ = workDatabase_Impl.q(false, z28Var, c38Var);
                    ne1 ne1Var = ne1.m;
                    if (objQ == ne1Var) {
                        return ne1Var;
                    }
                    wk0Var = wk0Var2;
                    wk0Var.J();
                } catch (Throwable th) {
                    th = th;
                    wk0Var = wk0Var2;
                    wk0Var.J();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wk0Var = c38Var.m;
            try {
                ct1.a0(obj);
                wk0Var.J();
            } catch (Throwable th2) {
                th = th2;
                wk0Var.J();
                throw th;
            }
        }
        return f88.a;
    }
}
