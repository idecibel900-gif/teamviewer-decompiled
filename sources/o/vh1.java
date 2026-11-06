package o;

import com.google.firebase.datastorage.JavaDataStorage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vh1 implements ah1 {
    public final oj2 a;
    public final g95 b;
    public final me1 c;
    public final ih1 d;
    public int f;
    public n87 g;
    public final j93 i;
    public final pn5 l;
    public final my4 e = new my4();
    public final wh1 h = new wh1();
    public final kh7 j = new kh7(new fh1(this, 1));
    public final kh7 k = new kh7(new fh1(this, 0));

    public vh1(oj2 oj2Var, List list, g95 g95Var, me1 me1Var) {
        this.a = oj2Var;
        this.b = g95Var;
        this.c = me1Var;
        hc1 hc1Var = null;
        byte b = 4;
        this.d = new ih1(new tx(this, hc1Var, b), (byte) 2);
        this.i = new j93(this, list);
        byte b2 = 6;
        io.sentry.okhttp.b bVar = new io.sentry.okhttp.b(this, b2);
        oa1 oa1Var = new oa1(this, hc1Var, b2);
        pn5 pn5Var = new pn5();
        pn5Var.m = me1Var;
        pn5Var.n = oa1Var;
        pn5Var.f1752o = ka0.d(Integer.MAX_VALUE, 6, null);
        pn5Var.p = new df6((byte) 20);
        bp3 bp3Var = (bp3) me1Var.getCoroutineContext().l0(z06.z);
        if (bp3Var != null) {
            bp3Var.o0(new io.sentry.android.replay.capture.f(bVar, pn5Var, b));
        }
        this.l = pn5Var;
    }

    @Override // o.ah1
    public final Object a(hw2 hw2Var, og7 og7Var) {
        p98 p98Var = (p98) og7Var.getContext().l0(d82.P);
        if (p98Var != null) {
            p98Var.a(this);
        }
        return im3.j0(new p98(p98Var, this), new j0(this, hw2Var, null, (byte) 20), og7Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(jc1 jc1Var) {
        jh1 jh1Var;
        my4 my4Var;
        if (jc1Var instanceof jh1) {
            jh1Var = (jh1) jc1Var;
            int i = jh1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                jh1Var.q = i - Integer.MIN_VALUE;
            } else {
                jh1Var = new jh1(this, jc1Var);
            }
        } else {
            jh1Var = new jh1(this, jc1Var);
        }
        Object obj = jh1Var.f1164o;
        int i2 = jh1Var.q;
        if (i2 == 0) {
            ct1.a0(obj);
            jh1Var.m = this;
            my4Var = this.e;
            jh1Var.n = my4Var;
            jh1Var.q = 1;
            Object objE = my4Var.e(jh1Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            my4 my4Var2 = jh1Var.n;
            vh1 vh1Var = jh1Var.m;
            ct1.a0(obj);
            my4Var = my4Var2;
            this = vh1Var;
        }
        try {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                n87 n87Var = this.g;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                this.g = null;
            }
            return f88.a;
        } finally {
            my4Var.j(null);
        }
    }

    public final o07 c() {
        return (o07) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.vh1] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, o.op3] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [o.vh1] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(o.oq4 r10, o.jc1 r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vh1.d(o.oq4, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(jc1 jc1Var) {
        lh1 lh1Var;
        my4 my4Var;
        if (jc1Var instanceof lh1) {
            lh1Var = (lh1) jc1Var;
            int i = lh1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                lh1Var.q = i - Integer.MIN_VALUE;
            } else {
                lh1Var = new lh1(this, jc1Var);
            }
        } else {
            lh1Var = new lh1(this, jc1Var);
        }
        Object obj = lh1Var.f1360o;
        int i2 = lh1Var.q;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            lh1Var.m = this;
            my4Var = this.e;
            lh1Var.n = my4Var;
            lh1Var.q = 1;
            Object objE = my4Var.e(lh1Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            my4 my4Var2 = lh1Var.n;
            vh1 vh1Var = lh1Var.m;
            ct1.a0(obj);
            my4Var = my4Var2;
            this = vh1Var;
        }
        try {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 == 1) {
                this.g = im3.R(this.c, null, null, new mh1(this, hc1Var, (byte) 0), 3);
            }
            return f88.a;
        } finally {
            my4Var.j(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r1.b0(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(o.jc1 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o.nh1
            if (r0 == 0) goto L13
            r0 = r7
            o.nh1 r0 = (o.nh1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.nh1 r0 = new o.nh1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f1567o
            int r1 = r0.q
            r2 = 2
            r3 = 1
            o.ne1 r4 = o.ne1.m
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r6 = r0.n
            o.vh1 r0 = r0.m
            o.ct1.a0(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            r6 = 0
            return r6
        L37:
            o.vh1 r6 = r0.m
            o.ct1.a0(r7)
            goto L4f
        L3d:
            o.ct1.a0(r7)
            o.o07 r7 = r6.c()
            r0.m = r6
            r0.q = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L4f
            goto L63
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            o.j93 r1 = r6.i     // Catch: java.lang.Throwable -> L67
            r0.m = r6     // Catch: java.lang.Throwable -> L67
            r0.n = r7     // Catch: java.lang.Throwable -> L67
            r0.q = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r1.b0(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            o.f88 r6 = o.f88.a
            return r6
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            o.wh1 r0 = r0.h
            o.h36 r1 = new o.h36
            r1.<init>(r7, r6)
            r0.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vh1.f(o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, hc1 hc1Var) throws Throwable {
        oh1 oh1Var;
        vh1 vh1Var;
        g97 g97Var;
        vh1 vh1Var2;
        vd5 vd5Var;
        g97 g97Var2;
        if (hc1Var instanceof oh1) {
            oh1Var = (oh1) hc1Var;
            int i = oh1Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                oh1Var.r = i - Integer.MIN_VALUE;
            } else {
                oh1Var = new oh1(this, hc1Var);
            }
        } else {
            oh1Var = new oh1(this, hc1Var);
        }
        Object objC = oh1Var.p;
        int i2 = oh1Var.r;
        hc1 hc1Var2 = null;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objC);
            g97 g97VarB = this.h.b();
            if (g97VarB instanceof p78) {
                hk0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            o07 o07VarC = c();
            oh1Var.m = this;
            oh1Var.n = g97VarB;
            oh1Var.f1653o = z;
            oh1Var.r = 1;
            Integer numA = o07VarC.a();
            if (numA != ne1Var) {
                vh1Var = this;
                g97Var = g97VarB;
                objC = numA;
            }
            return ne1Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                vh1Var2 = oh1Var.m;
                ct1.a0(objC);
                vd5Var = (vd5) objC;
                g97Var2 = (g97) vd5Var.m;
                if (((Boolean) vd5Var.n).booleanValue()) {
                    vh1Var2.h.c(g97Var2);
                }
                return g97Var2;
            }
            if (i2 != 3) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vh1Var2 = oh1Var.m;
            ct1.a0(objC);
            vd5Var = (vd5) objC;
            g97Var2 = (g97) vd5Var.m;
            if (((Boolean) vd5Var.n).booleanValue()) {
                vh1Var2.h.c(g97Var2);
            }
            return g97Var2;
        }
        z = oh1Var.f1653o;
        g97Var = oh1Var.n;
        vh1Var = oh1Var.m;
        ct1.a0(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z2 = g97Var instanceof qg1;
        int i3 = z2 ? g97Var.a : -1;
        if (z2 && iIntValue == i3) {
            return g97Var;
        }
        if (z) {
            o07 o07VarC2 = vh1Var.c();
            ph1 ph1Var = new ph1(vh1Var, null);
            oh1Var.m = vh1Var;
            oh1Var.n = null;
            oh1Var.r = 2;
            objC = o07VarC2.b(ph1Var, oh1Var);
            if (objC != ne1Var) {
                vh1Var2 = vh1Var;
                vd5Var = (vd5) objC;
                g97Var2 = (g97) vd5Var.m;
                if (((Boolean) vd5Var.n).booleanValue()) {
                    vh1Var2.h.c(g97Var2);
                }
                return g97Var2;
            }
        } else {
            o07 o07VarC3 = vh1Var.c();
            qh1 qh1Var = new qh1(vh1Var, i3, hc1Var2, (byte) 0);
            oh1Var.m = vh1Var;
            oh1Var.n = null;
            oh1Var.r = 3;
            objC = o07VarC3.c(qh1Var, oh1Var);
            if (objC != ne1Var) {
                vh1Var2 = vh1Var;
                vd5Var = (vd5) objC;
                g97Var2 = (g97) vd5Var.m;
                if (((Boolean) vd5Var.n).booleanValue()) {
                    vh1Var2.h.c(g97Var2);
                }
                return g97Var2;
            }
        }
        return ne1Var;
    }

    @Override // o.ah1
    public final go2 getData() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[Catch: te1 -> 0x005e, TryCatch #1 {te1 -> 0x005e, blocks: (B:19:0x0059, B:54:0x0108, B:24:0x0067, B:51:0x00eb, B:32:0x0084, B:40:0x00ab, B:42:0x00b1, B:36:0x008e, B:48:0x00d9), top: B:80:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:61:0x0139, B:63:0x014b, B:64:0x0153), top: B:81:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0153 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #2 {all -> 0x0177, blocks: (B:61:0x0139, B:63:0x014b, B:64:0x0153), top: B:81:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z, jc1 jc1Var) {
        rh1 rh1Var;
        k76 k76Var;
        te1 te1Var;
        vh1 vh1Var;
        boolean z2;
        k76 k76Var2;
        i76 i76Var;
        te1 te1Var2;
        sh1 sh1Var;
        Object objB;
        i76 i76Var2;
        k76 k76Var3;
        int iHashCode;
        Integer numA;
        vh1 vh1Var2;
        int i;
        Object obj;
        if (jc1Var instanceof rh1) {
            rh1Var = (rh1) jc1Var;
            int i2 = rh1Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rh1Var.u = i2 - Integer.MIN_VALUE;
            } else {
                rh1Var = new rh1(this, jc1Var);
            }
        } else {
            rh1Var = new rh1(this, jc1Var);
        }
        Object objA = rh1Var.s;
        int i3 = rh1Var.u;
        byte b = 1;
        hc1 hc1Var = null;
        ne1 ne1Var = ne1.m;
        try {
            switch (i3) {
                case 0:
                    ct1.a0(objA);
                    if (z) {
                        rh1Var.m = this;
                        rh1Var.q = z;
                        rh1Var.u = 1;
                        objA = ((rj2) this.j.getValue()).a(new gh1(3, (hc1) null), rh1Var);
                        if (objA != ne1Var) {
                            if (objA != null) {
                                iHashCode = objA.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            o07 o07VarC = this.c();
                            rh1Var.m = this;
                            rh1Var.n = objA;
                            rh1Var.q = z;
                            rh1Var.r = iHashCode;
                            rh1Var.u = 2;
                            numA = o07VarC.a();
                            if (numA != ne1Var) {
                                vh1Var2 = this;
                                i = iHashCode;
                                obj = objA;
                                objA = numA;
                                return new qg1(i, ((Number) objA).intValue(), obj);
                            }
                        }
                    } else {
                        o07 o07VarC2 = c();
                        rh1Var.m = this;
                        rh1Var.q = z;
                        rh1Var.u = 3;
                        objA = o07VarC2.a();
                        if (objA != ne1Var) {
                            int iIntValue = ((Number) objA).intValue();
                            o07 o07VarC3 = this.c();
                            qh1 qh1Var = new qh1(this, iIntValue, hc1Var, b);
                            rh1Var.m = this;
                            rh1Var.q = z;
                            rh1Var.u = 4;
                            objA = o07VarC3.c(qh1Var, rh1Var);
                            if (objA == ne1Var) {
                            }
                            return (qg1) objA;
                        }
                    }
                    return ne1Var;
                case 1:
                    z = rh1Var.q;
                    this = (vh1) rh1Var.m;
                    ct1.a0(objA);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    o07 o07VarC4 = this.c();
                    rh1Var.m = this;
                    rh1Var.n = objA;
                    rh1Var.q = z;
                    rh1Var.r = iHashCode;
                    rh1Var.u = 2;
                    numA = o07VarC4.a();
                    if (numA != ne1Var) {
                        vh1Var2 = this;
                        i = iHashCode;
                        obj = objA;
                        objA = numA;
                        return new qg1(i, ((Number) objA).intValue(), obj);
                    }
                    return ne1Var;
                case 2:
                    i = rh1Var.r;
                    z = rh1Var.q;
                    obj = rh1Var.n;
                    vh1Var2 = (vh1) rh1Var.m;
                    try {
                        ct1.a0(objA);
                        return new qg1(i, ((Number) objA).intValue(), obj);
                    } catch (te1 e) {
                        e = e;
                        this = vh1Var2;
                        k76Var = new k76();
                        g95 g95Var = this.b;
                        rh1Var.m = this;
                        rh1Var.n = e;
                        rh1Var.f1922o = k76Var;
                        rh1Var.p = k76Var;
                        rh1Var.q = z;
                        rh1Var.u = 5;
                        gr5 gr5VarDataStore_delegate$lambda$0 = JavaDataStorage.dataStore_delegate$lambda$0(((wn3) g95Var.m).n, e);
                        if (gr5VarDataStore_delegate$lambda$0 != ne1Var) {
                            te1Var = e;
                            objA = gr5VarDataStore_delegate$lambda$0;
                            vh1Var = this;
                            z2 = z;
                            k76Var2 = k76Var;
                            k76Var2.m = objA;
                            i76Var = new i76();
                            try {
                                sh1Var = new sh1(k76Var, vh1Var, i76Var, (hc1) null);
                                rh1Var.m = te1Var;
                                rh1Var.n = k76Var;
                                rh1Var.f1922o = i76Var;
                                rh1Var.p = null;
                                rh1Var.u = 6;
                                if (z2) {
                                    vh1Var.getClass();
                                    objB = sh1Var.invoke(rh1Var);
                                } else {
                                    objB = vh1Var.c().b(new vg1(sh1Var, hc1Var, b), rh1Var);
                                }
                                if (objB != ne1Var) {
                                    i76Var2 = i76Var;
                                    k76Var3 = k76Var;
                                    Object obj2 = k76Var3.m;
                                    return new qg1(obj2 != null ? obj2.hashCode() : 0, i76Var2.m, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                te1Var2 = te1Var;
                                ct1.q(te1Var2, th);
                                throw te1Var2;
                            }
                        }
                        return ne1Var;
                    }
                case 3:
                    z = rh1Var.q;
                    this = (vh1) rh1Var.m;
                    ct1.a0(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    o07 o07VarC5 = this.c();
                    qh1 qh1Var2 = new qh1(this, iIntValue2, hc1Var, b);
                    rh1Var.m = this;
                    rh1Var.q = z;
                    rh1Var.u = 4;
                    objA = o07VarC5.c(qh1Var2, rh1Var);
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                    return (qg1) objA;
                case 4:
                    boolean z3 = rh1Var.q;
                    ct1.a0(objA);
                    return (qg1) objA;
                case 5:
                    z2 = rh1Var.q;
                    k76Var2 = rh1Var.p;
                    k76Var = (k76) rh1Var.f1922o;
                    te1Var = (te1) rh1Var.n;
                    vh1Var = (vh1) rh1Var.m;
                    ct1.a0(objA);
                    k76Var2.m = objA;
                    i76Var = new i76();
                    sh1Var = new sh1(k76Var, vh1Var, i76Var, (hc1) null);
                    rh1Var.m = te1Var;
                    rh1Var.n = k76Var;
                    rh1Var.f1922o = i76Var;
                    rh1Var.p = null;
                    rh1Var.u = 6;
                    if (z2) {
                        vh1Var.getClass();
                        objB = sh1Var.invoke(rh1Var);
                    } else {
                        objB = vh1Var.c().b(new vg1(sh1Var, hc1Var, b), rh1Var);
                    }
                    if (objB != ne1Var) {
                        i76Var2 = i76Var;
                        k76Var3 = k76Var;
                        Object obj3 = k76Var3.m;
                        return new qg1(obj3 != null ? obj3.hashCode() : 0, i76Var2.m, obj3);
                    }
                    return ne1Var;
                case 6:
                    i76Var2 = (i76) rh1Var.f1922o;
                    k76Var3 = (k76) rh1Var.n;
                    te1Var2 = (te1) rh1Var.m;
                    try {
                        ct1.a0(objA);
                        Object obj4 = k76Var3.m;
                        return new qg1(obj4 != null ? obj4.hashCode() : 0, i76Var2.m, obj4);
                    } catch (Throwable th2) {
                        th = th2;
                        ct1.q(te1Var2, th);
                        throw te1Var2;
                    }
                default:
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (te1 e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z, jc1 jc1Var) throws IOException {
        th1 th1Var;
        i76 i76Var;
        if (jc1Var instanceof th1) {
            th1Var = (th1) jc1Var;
            int i = th1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                th1Var.p = i - Integer.MIN_VALUE;
            } else {
                th1Var = new th1(this, jc1Var);
            }
        } else {
            th1Var = new th1(this, jc1Var);
        }
        Object obj2 = th1Var.n;
        int i2 = th1Var.p;
        if (i2 == 0) {
            ct1.a0(obj2);
            i76 i76Var2 = new i76();
            rj2 rj2Var = (rj2) this.j.getValue();
            uh1 uh1Var = new uh1(i76Var2, this, obj, z, null);
            th1Var.m = i76Var2;
            th1Var.p = 1;
            Object objB = rj2Var.b(uh1Var, th1Var);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
            i76Var = i76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i76Var = th1Var.m;
            ct1.a0(obj2);
        }
        return new Integer(i76Var.m);
    }
}
