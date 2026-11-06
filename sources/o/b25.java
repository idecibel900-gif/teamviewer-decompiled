package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class b25 extends es4 implements l28, u15 {
    public u15 A;
    public x15 B;
    public b25 C;
    public final String D;

    public b25(u15 u15Var, x15 x15Var) {
        this.A = u15Var;
        this.B = x15Var == null ? new x15() : x15Var;
        this.D = "o.b25";
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // o.u15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(long r7, o.hc1 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.a25
            if (r0 == 0) goto L13
            r0 = r9
            o.a25 r0 = (o.a25) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L1a
        L13:
            o.a25 r0 = new o.a25
            o.jc1 r9 = (o.jc1) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.n
            int r1 = r0.p
            r2 = 0
            r3 = 2
            r4 = 1
            o.ne1 r5 = o.ne1.m
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.m
            o.ct1.a0(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            return r2
        L35:
            long r7 = r0.m
            o.ct1.a0(r9)
            goto L53
        L3b:
            o.ct1.a0(r9)
            boolean r9 = r6.z
            if (r9 == 0) goto L46
            o.b25 r2 = r6.V0()
        L46:
            if (r2 == 0) goto L58
            r0.m = r7
            r0.p = r4
            java.lang.Object r9 = r2.C(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            o.nc8 r9 = (o.nc8) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            o.u15 r6 = r6.A
            long r7 = o.nc8.d(r7, r1)
            r0.m = r1
            r0.p = r3
            java.lang.Object r9 = r6.C(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            o.nc8 r9 = (o.nc8) r9
            long r8 = r9.a
            long r6 = o.nc8.e(r6, r8)
            o.nc8 r8 = new o.nc8
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b25.C(long, o.hc1):java.lang.Object");
    }

    @Override // o.u15
    public final long J(int i, long j) {
        b25 b25VarV0 = this.z ? V0() : null;
        long J = b25VarV0 != null ? b25VarV0.J(i, j) : 0L;
        return t65.e(J, this.A.J(i, t65.d(j, J)));
    }

    @Override // o.es4
    public final void M0() {
        x15 x15Var = this.B;
        x15Var.a = this;
        x15Var.b = null;
        this.C = null;
        x15Var.c = new vm3((Object) this, (byte) 18);
        x15Var.d = I0();
    }

    @Override // o.es4
    public final void N0() {
        k76 k76Var = new k76();
        g57.q(this, new jg(k76Var, (byte) 3));
        b25 b25Var = (b25) ((l28) k76Var.m);
        this.C = b25Var;
        x15 x15Var = this.B;
        x15Var.b = b25Var;
        if (x15Var.a == this) {
            x15Var.a = null;
            x15Var.d = null;
            x15Var.c = vn4.g0;
        }
    }

    public final me1 U0() {
        b25 b25VarV0 = V0();
        me1 me1VarU0 = b25VarV0 != null ? b25VarV0.U0() : null;
        if (me1VarU0 != null && hm3.u(me1VarU0)) {
            return me1VarU0;
        }
        me1 me1Var = this.B.d;
        if (me1Var != null) {
            return me1Var;
        }
        hk0.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final b25 V0() {
        nf nfVar;
        l28 l28Var = null;
        if (!this.z) {
            return null;
        }
        if (!this.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var = this.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(this);
        loop0: while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 262144) != 0) {
                while (es4Var != null) {
                    if ((es4Var.f737o & 262144) != 0) {
                        es4 es4VarL0 = es4Var;
                        xx4 xx4Var = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof l28) {
                                l28 l28Var2 = (l28) es4VarL0;
                                if (im3.n(this.D, l28Var2.k()) && b25.class == l28Var2.getClass()) {
                                    l28Var = l28Var2;
                                    break loop0;
                                }
                            }
                            if ((es4VarL0.f737o & 262144) != 0 && (es4VarL0 instanceof vm1)) {
                                int i = 0;
                                for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                    if ((es4Var2.f737o & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            es4VarL0 = es4Var2;
                                        } else {
                                            if (xx4Var == null) {
                                                xx4Var = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var.b(es4Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var);
                        }
                    }
                    es4Var = es4Var.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
        return (b25) l28Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // o.u15
    public final Object e(long j, long j2, hc1 hc1Var) {
        z15 z15Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (hc1Var instanceof z15) {
            z15Var = (z15) hc1Var;
            int i = z15Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                z15Var.q = i - Integer.MIN_VALUE;
            } else {
                z15Var = new z15(this, (jc1) hc1Var);
            }
        } else {
            z15Var = new z15(this, (jc1) hc1Var);
        }
        z15 z15Var2 = z15Var;
        Object objE = z15Var2.f2663o;
        int i2 = z15Var2.q;
        b25 b25VarV0 = null;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objE);
            u15 u15Var = this.A;
            z15Var2.m = j;
            z15Var2.n = j2;
            z15Var2.q = 1;
            objE = u15Var.e(j, j2, z15Var2);
            if (objE != ne1Var) {
                j3 = j;
                j4 = j2;
            }
            return ne1Var;
        }
        if (i2 == 1) {
            j4 = z15Var2.n;
            j3 = z15Var2.m;
            ct1.a0(objE);
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = z15Var2.m;
            ct1.a0(objE);
        }
        j6 = ((nc8) objE).a;
        j5 = j7;
        return new nc8(nc8.e(j5, j6));
        j5 = ((nc8) objE).a;
        boolean z = this.z;
        if (!z) {
            b25VarV0 = this.C;
        } else if (z) {
            b25VarV0 = V0();
        }
        if (b25VarV0 != null) {
            long jE = nc8.e(j3, j5);
            long jD = nc8.d(j4, j5);
            z15Var2.m = j5;
            z15Var2.q = 2;
            objE = b25VarV0.e(jE, jD, z15Var2);
            if (objE != ne1Var) {
                j7 = j5;
                j6 = ((nc8) objE).a;
                j5 = j7;
            }
            return ne1Var;
        }
        j6 = 0;
        return new nc8(nc8.e(j5, j6));
    }

    @Override // o.l28
    public final Object k() {
        return this.D;
    }

    @Override // o.u15
    public final long p0(int i, long j, long j2) {
        long jP0 = this.A.p0(i, j, j2);
        b25 b25VarV0 = this.z ? V0() : null;
        return t65.e(jP0, b25VarV0 != null ? b25VarV0.p0(i, t65.e(j, jP0), t65.d(j2, jP0)) : 0L);
    }
}
