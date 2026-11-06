package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z42 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(o.ug7 r12, long r13, o.jc1 r15) {
        /*
            boolean r0 = r15 instanceof o.s42
            if (r0 == 0) goto L13
            r0 = r15
            o.s42 r0 = (o.s42) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            o.s42 r0 = new o.s42
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f1983o
            int r1 = r0.p
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            o.j76 r12 = r0.n
            o.ug7 r13 = r0.m
            o.ct1.a0(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r12)
            return r3
        L33:
            o.ct1.a0(r15)
            o.vg7 r15 = r12.q
            o.bn5 r15 = r15.E
            boolean r15 = e(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            o.j76 r15 = new o.j76
            r15.<init>()
            r15.m = r13
        L49:
            r0.m = r12
            r0.n = r15
            r0.p = r2
            o.cn5 r13 = o.cn5.n
            java.lang.Object r13 = r12.a(r13, r0)
            o.ne1 r14 = o.ne1.m
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            o.bn5 r15 = (o.bn5) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            o.in5 r7 = (o.in5) r7
            long r7 = r7.a
            long r9 = r13.m
            boolean r7 = o.vs1.o(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            o.in5 r6 = (o.in5) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = o.qs1.F(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            o.in5 r5 = (o.in5) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            o.in5 r1 = (o.in5) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.m = r14
            goto Lc3
        Lad:
            long r14 = o.qs1.T(r6, r2)
            r4 = 0
            boolean r14 = o.t65.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.c()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z42.a(o.ug7, long, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [o.k76] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object b(ug7 ug7Var, long j, jc1 jc1Var) {
        t42 t42Var;
        Object obj;
        in5 in5Var;
        g76 g76Var;
        if (jc1Var instanceof t42) {
            t42Var = (t42) jc1Var;
            int i = t42Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                t42Var.q = i - Integer.MIN_VALUE;
            } else {
                t42Var = new t42(jc1Var);
            }
        } else {
            t42Var = new t42(jc1Var);
        }
        Object obj2 = t42Var.p;
        int i2 = t42Var.q;
        try {
            if (i2 == 0) {
                ct1.a0(obj2);
                if (!e(ug7Var.q.E, j)) {
                    List list = ug7Var.q.E.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (vs1.o(((in5) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    in5Var = (in5) obj;
                    if (in5Var != null) {
                        k76 k76Var = new k76();
                        k76 k76Var2 = new k76();
                        k76Var2.m = in5Var;
                        long jB = ug7Var.c().b();
                        g76 g76Var2 = new g76();
                        hw2 u42Var = new u42(g76Var2, k76Var2, k76Var, null);
                        t42Var.m = in5Var;
                        t42Var.n = k76Var;
                        t42Var.f2080o = g76Var2;
                        t42Var.q = 1;
                        Object objE = ug7Var.e(jB, u42Var, t42Var);
                        Object obj3 = ne1.m;
                        if (objE == obj3) {
                            return obj3;
                        }
                        g76Var = g76Var2;
                        j = k76Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g76Var = t42Var.f2080o;
            k76 k76Var3 = t42Var.n;
            in5Var = t42Var.m;
            ct1.a0(obj2);
            j = k76Var3;
            if (g76Var.m) {
                in5 in5Var2 = (in5) j.m;
                return in5Var2 == null ? in5Var : in5Var2;
            }
            return null;
        } catch (dn5 unused) {
            in5 in5Var3 = (in5) j.m;
            return in5Var3 == null ? in5Var : in5Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc A[LOOP:0: B:26:0x00b7->B:30:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5 A[EDGE_INSN: B:68:0x00d5->B:32:0x00d5 BREAK  A[LOOP:0: B:26:0x00b7->B:30:0x00cc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0160 -> B:62:0x0166). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(o.ug7 r18, long r19, o.gg4 r21, o.i30 r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z42.c(o.ug7, long, o.gg4, o.i30):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(o.ug7 r4, long r5, kotlin.jvm.functions.Function1 r7, o.jc1 r8) {
        /*
            boolean r0 = r8 instanceof o.x42
            if (r0 == 0) goto L13
            r0 = r8
            o.x42 r0 = (o.x42) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            o.x42 r0 = new o.x42
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2481o
            int r1 = r0.p
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            kotlin.jvm.functions.Function1 r4 = r0.n
            o.ug7 r5 = r0.m
            o.ct1.a0(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r4)
            r4 = 0
            return r4
        L32:
            o.ct1.a0(r8)
        L35:
            r0.m = r4
            r0.n = r7
            r0.p = r2
            java.lang.Object r8 = a(r4, r5, r0)
            o.ne1 r5 = o.ne1.m
            if (r8 != r5) goto L44
            return r5
        L44:
            o.in5 r8 = (o.in5) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = o.qs1.F(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z42.d(o.ug7, long, kotlin.jvm.functions.Function1, o.jc1):java.lang.Object");
    }

    public static final boolean e(bn5 bn5Var, long j) {
        Object obj;
        List list = bn5Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vs1.o(((in5) obj).a, j)) {
                break;
            }
            i++;
        }
        in5 in5Var = (in5) obj;
        if (in5Var != null && in5Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float f(ee8 ee8Var, int i) {
        return i == 2 ? ee8Var.f() * a : ee8Var.f();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x045e -> B:92:0x040c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x049c -> B:165:0x0604). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05f1 -> B:162:0x05f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x061b -> B:166:0x0605). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0687 -> B:180:0x0691). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0250 -> B:32:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02f7 -> B:32:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x034f -> B:78:0x03c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a8 -> B:75:0x03b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object g(o.ug7 r29, o.in5 r30, o.vr1 r31, o.b9 r32, o.gg4 r33, o.fg4 r34, o.a81 r35, o.i30 r36) {
        /*
            Method dump skipped, instruction units count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z42.g(o.ug7, o.in5, o.vr1, o.b9, o.gg4, o.fg4, o.a81, o.i30):java.lang.Object");
    }
}
