package o;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public final xx4 a = new xx4(new ib0[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(o.v56 r8, o.jc1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.gb0
            if (r0 == 0) goto L13
            r0 = r9
            o.gb0 r0 = (o.gb0) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            o.gb0 r0 = new o.gb0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.p
            int r8 = r0.f878o
            java.lang.Object[] r1 = r0.n
            o.v56 r3 = r0.m
            o.ct1.a0(r9)
            r9 = r3
            goto L63
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            r7 = 0
            return r7
        L35:
            o.ct1.a0(r9)
            o.xx4 r7 = r7.a
            java.lang.Object[] r9 = r7.m
            int r7 = r7.f2559o
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L65
            r3 = r1[r8]
            o.ib0 r3 = (o.ib0) r3
            o.y r4 = new o.y
            r5 = 15
            r4.<init>(r9, r5)
            r0.m = r9
            r0.n = r1
            r0.f878o = r8
            r0.p = r7
            r0.s = r2
            java.lang.Object r3 = o.di1.m(r3, r4, r0)
            o.ne1 r4 = o.ne1.m
            if (r3 != r4) goto L63
            return r4
        L63:
            int r8 = r8 + r2
            goto L43
        L65:
            o.f88 r7 = o.f88.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hb0.a(o.v56, o.jc1):java.lang.Object");
    }
}
