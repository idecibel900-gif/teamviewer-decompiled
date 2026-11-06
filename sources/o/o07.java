package o;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o07 {
    public final my4 a = new my4();
    public final df6 b = new df6((byte) 20);
    public final ih1 c = new ih1(new l5(2, null, 21), 2);

    public o07(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.n).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.o07] */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.ky4] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.ky4] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r7, o.jc1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.m07
            if (r0 == 0) goto L13
            r0 = r8
            o.m07 r0 = (o.m07) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.m07 r0 = new o.m07
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1422o
            int r1 = r0.q
            r2 = 2
            r3 = 1
            r4 = 0
            o.ne1 r5 = o.ne1.m
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.m
            o.ky4 r6 = (o.ky4) r6
            o.ct1.a0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            return r4
        L37:
            o.my4 r6 = r0.n
            java.lang.Object r7 = r0.m
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            o.ct1.a0(r8)
            goto L53
        L41:
            o.ct1.a0(r8)
            r0.m = r7
            o.my4 r6 = r6.a
            r0.n = r6
            r0.q = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.m = r6     // Catch: java.lang.Throwable -> L2f
            r0.n = r4     // Catch: java.lang.Throwable -> L2f
            r0.q = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.j(r4)
            return r8
        L64:
            r6.j(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o07.b(kotlin.jvm.functions.Function1, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(hw2 hw2Var, jc1 jc1Var) throws Throwable {
        n07 n07Var;
        my4 my4Var;
        boolean z;
        Throwable th;
        if (jc1Var instanceof n07) {
            n07Var = (n07) jc1Var;
            int i = n07Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                n07Var.q = i - Integer.MIN_VALUE;
            } else {
                n07Var = new n07(this, jc1Var);
            }
        } else {
            n07Var = new n07(this, jc1Var);
        }
        Object obj = n07Var.f1530o;
        int i2 = n07Var.q;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = n07Var.n;
            my4Var = n07Var.m;
            try {
                ct1.a0(obj);
                if (z) {
                    my4Var.j(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    my4Var.j(null);
                }
                throw th;
            }
        }
        ct1.a0(obj);
        my4 my4Var2 = this.a;
        boolean zF = my4Var2.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            n07Var.m = my4Var2;
            n07Var.n = zF;
            n07Var.q = 1;
            Object objInvoke = hw2Var.invoke(objValueOf, n07Var);
            Object obj2 = ne1.m;
            if (objInvoke == obj2) {
                return obj2;
            }
            my4Var = my4Var2;
            z = zF;
            obj = objInvoke;
            if (z) {
                my4Var.j(null);
            }
            return obj;
        } catch (Throwable th3) {
            my4Var = my4Var2;
            z = zF;
            th = th3;
            if (z) {
                my4Var.j(null);
            }
            throw th;
        }
    }
}
