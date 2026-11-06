package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bi5 implements q67 {
    public final of0 m;
    public final bf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sn6 f428o;
    public int p;
    public boolean q;
    public long r;

    public bi5(of0 of0Var) {
        this.m = of0Var;
        bf0 bf0VarH = of0Var.h();
        this.n = bf0VarH;
        sn6 sn6Var = bf0VarH.m;
        this.f428o = sn6Var;
        this.p = sn6Var != null ? sn6Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q = true;
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.m.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // o.q67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i0(o.bf0 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.q
            if (r3 != 0) goto L5f
            o.sn6 r3 = r8.f428o
            o.bf0 r4 = r8.n
            if (r3 == 0) goto L27
            o.sn6 r5 = r4.m
            if (r3 != r5) goto L21
            int r3 = r8.p
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            o.hk0.l(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.r
            r2 = 1
            long r0 = r0 + r2
            o.of0 r2 = r8.m
            boolean r0 = r2.m0(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            o.sn6 r0 = r8.f428o
            if (r0 != 0) goto L48
            o.sn6 r0 = r4.m
            if (r0 == 0) goto L48
            r8.f428o = r0
            int r0 = r0.b
            r8.p = r0
        L48:
            long r0 = r4.n
            long r2 = r8.r
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            o.bf0 r2 = r8.n
            long r4 = r8.r
            r3 = r9
            r2.u(r3, r4, r6)
            long r9 = r8.r
            long r9 = r9 + r6
            r8.r = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            o.hk0.l(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = o.e41.g(r8, r10)
            o.gk0.h(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bi5.i0(o.bf0, long):long");
    }
}
