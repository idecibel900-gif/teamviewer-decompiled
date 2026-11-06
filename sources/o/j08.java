package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j08 extends og7 implements Function1 {
    public byte m;
    public final /* synthetic */ k08 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ay4 f1119o;
    public final /* synthetic */ vg1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j08(k08 k08Var, ay4 ay4Var, vg1 vg1Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.n = k08Var;
        this.f1119o = ay4Var;
        this.p = vg1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ay4 ay4Var = this.f1119o;
        vg1 vg1Var = this.p;
        return new j08(this.n, ay4Var, vg1Var, (hc1) obj).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (o.g77.r(new o.qv7(1500, r8), r9) == r7) goto L21;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.m
            r1 = 0
            o.ay4 r2 = o.ay4.f374o
            r3 = 2
            r4 = 1
            o.ay4 r5 = r8.f1119o
            o.k08 r6 = r8.n
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L11
            if (r0 != r3) goto L17
        L11:
            o.ct1.a0(r9)     // Catch: java.lang.Throwable -> L15
            goto L46
        L15:
            r8 = move-exception
            goto L4e
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            return r1
        L1d:
            o.ct1.a0(r9)
            o.ay4 r9 = o.ay4.n     // Catch: java.lang.Throwable -> L15
            o.vg1 r0 = r8.p
            o.ne1 r7 = o.ne1.m
            if (r5 != r9) goto L31
            r8.m = r4     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = r0.invoke(r8)     // Catch: java.lang.Throwable -> L15
            if (r8 != r7) goto L46
            goto L45
        L31:
            o.ys7 r9 = new o.ys7     // Catch: java.lang.Throwable -> L15
            r9.<init>(r0, r1, r3)     // Catch: java.lang.Throwable -> L15
            r8.m = r3     // Catch: java.lang.Throwable -> L15
            o.qv7 r0 = new o.qv7     // Catch: java.lang.Throwable -> L15
            r3 = 1500(0x5dc, double:7.41E-321)
            r0.<init>(r3, r8)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = o.g77.r(r0, r9)     // Catch: java.lang.Throwable -> L15
            if (r8 != r7) goto L46
        L45:
            return r7
        L46:
            if (r5 == r2) goto L4b
            r6.a()
        L4b:
            o.f88 r8 = o.f88.a
            return r8
        L4e:
            if (r5 == r2) goto L53
            r6.a()
        L53:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j08.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
