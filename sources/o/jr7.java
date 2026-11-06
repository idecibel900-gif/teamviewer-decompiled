package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jr7 extends og7 implements Function1 {
    public byte m;
    public final /* synthetic */ pr7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr7(pr7 pr7Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.n = pr7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new jr7(this.n, (hc1) obj).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r13 == r6) goto L28;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.m
            r1 = 0
            o.f88 r2 = o.f88.a
            r3 = 2
            r4 = 1
            o.pr7 r5 = r13.n
            o.ne1 r6 = o.ne1.m
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L15
            o.ct1.a0(r14)
            goto L6d
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r13)
            return r1
        L1b:
            o.ct1.a0(r14)
            goto L2b
        L1f:
            o.ct1.a0(r14)
            r13.m = r4
            java.lang.Object r14 = r5.t(r13)
            if (r14 != r6) goto L2b
            goto L6c
        L2b:
            o.vd5 r14 = r5.f()
            if (r14 == 0) goto L6d
            java.lang.Object r0 = r14.m
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r14.n
            o.gt7 r14 = (o.gt7) r14
            long r8 = r14.a
            o.jm5 r14 = r5.j
            if (r14 == 0) goto L6d
            r13.m = r3
            r12 = r14
            o.om5 r12 = (o.om5) r12
            int r14 = r10.length()
            if (r14 != 0) goto L4c
            goto L52
        L4c:
            boolean r14 = o.gt7.c(r8)
            if (r14 == 0) goto L54
        L52:
            r13 = r2
            goto L66
        L54:
            o.mm5 r7 = new o.mm5
            r11 = 0
            r7.<init>(r8, r10, r11, r12)
            o.de1 r14 = r12.a
            o.tb r0 = new o.tb
            r3 = 5
            r0.<init>(r12, r7, r1, r3)
            java.lang.Object r13 = o.im3.j0(r14, r0, r13)
        L66:
            if (r13 != r6) goto L69
            goto L6a
        L69:
            r13 = r2
        L6a:
            if (r13 != r6) goto L6d
        L6c:
            return r6
        L6d:
            r5.B = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jr7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
