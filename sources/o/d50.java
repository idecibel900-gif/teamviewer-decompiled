package o;

/* JADX INFO: loaded from: classes.dex */
public final class d50 extends rc6 implements hw2 {
    public sx4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public cn5 f586o;
    public long p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ me1 s;
    public final /* synthetic */ k08 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(me1 me1Var, k08 k08Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = me1Var;
        this.t = k08Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        d50 d50Var = new d50(this.s, this.t, hc1Var);
        d50Var.r = obj;
        return d50Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((d50) create((ug7) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c2, B:43:0x00c6), top: B:53:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [o.sx4] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        long j;
        ug7 ug7Var;
        cn5 cn5Var;
        sx4 sx4Var;
        sx4 sx4Var2;
        Object obj2;
        ?? r0;
        in5 in5Var;
        ?? r1 = this.q;
        byte b = 1;
        hc1 hc1Var = null;
        ne1 ne1Var = ne1.m;
        try {
            if (r1 == 0) {
                ct1.a0(obj);
                ug7 ug7Var2 = (ug7) this.r;
                l97 l97VarK = im3.k(Boolean.FALSE);
                long jB = ug7Var2.c().b();
                this.r = ug7Var2;
                this.n = l97VarK;
                cn5 cn5Var2 = cn5.m;
                this.f586o = cn5Var2;
                this.p = jB;
                this.q = (byte) 1;
                Object objB = un7.b(ug7Var2, this, 1);
                if (objB != ne1Var) {
                    j = jB;
                    ug7Var = ug7Var2;
                    obj = objB;
                    sx4Var = l97VarK;
                    cn5Var = cn5Var2;
                }
                return ne1Var;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r13 = (sx4) this.r;
                    try {
                        ct1.a0(obj);
                        r0 = r1;
                        r13 = r13;
                        in5Var = (in5) obj;
                        if (in5Var != null) {
                            in5Var.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        l97 l97Var = (l97) r13;
                        l97Var.getClass();
                        l97Var.l(null, bool);
                        r1 = r0;
                        return f88.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        l97 l97Var2 = (l97) r13;
                        l97Var2.getClass();
                        l97Var2.l(null, bool2);
                        throw th;
                    }
                }
                cn5 cn5Var3 = this.f586o;
                sx4 sx4Var3 = this.n;
                ug7Var = (ug7) this.r;
                try {
                    ct1.a0(obj);
                    obj2 = cn5Var3;
                    sx4Var2 = sx4Var3;
                    Boolean bool3 = Boolean.FALSE;
                    l97 l97Var3 = (l97) sx4Var2;
                    l97Var3.getClass();
                    l97Var3.l(null, bool3);
                    r1 = obj2;
                } catch (dn5 unused) {
                    cn5Var = cn5Var3;
                    sx4Var = sx4Var3;
                    im3.R(this.s, null, pe1.p, new tx(sx4Var, this.t, hc1Var, b), 1);
                    this.r = sx4Var;
                    this.n = null;
                    this.f586o = null;
                    this.q = (byte) 3;
                    obj = un7.i(ug7Var, cn5Var, this);
                    if (obj != ne1Var) {
                        r13 = sx4Var;
                        r0 = sx4Var;
                        in5Var = (in5) obj;
                        if (in5Var != null) {
                            in5Var.a();
                        }
                        Boolean bool4 = Boolean.FALSE;
                        l97 l97Var4 = (l97) r13;
                        l97Var4.getClass();
                        l97Var4.l(null, bool4);
                        r1 = r0;
                    }
                    return ne1Var;
                } catch (Throwable th2) {
                    th = th2;
                    r13 = sx4Var3;
                    Boolean bool5 = Boolean.FALSE;
                    l97 l97Var5 = (l97) r13;
                    l97Var5.getClass();
                    l97Var5.l(null, bool5);
                    throw th;
                }
                return f88.a;
            }
            long j2 = this.p;
            cn5 cn5Var4 = this.f586o;
            sx4 sx4Var4 = this.n;
            ug7 ug7Var3 = (ug7) this.r;
            ct1.a0(obj);
            cn5Var = cn5Var4;
            sx4Var = sx4Var4;
            j = j2;
            ug7Var = ug7Var3;
            long j3 = j;
            int i = ((in5) obj).i;
            if (i == 1 || i == 3) {
                try {
                    c50 c50Var = new c50(cn5Var, hc1Var, (byte) 0);
                    this.r = ug7Var;
                    this.n = sx4Var;
                    this.f586o = cn5Var;
                    this.q = (byte) 2;
                    if (ug7Var.e(j3, c50Var, this) != ne1Var) {
                        sx4Var2 = sx4Var;
                        obj2 = sx4Var;
                        Boolean bool6 = Boolean.FALSE;
                        l97 l97Var6 = (l97) sx4Var2;
                        l97Var6.getClass();
                        l97Var6.l(null, bool6);
                        r1 = obj2;
                    }
                } catch (dn5 unused2) {
                    im3.R(this.s, null, pe1.p, new tx(sx4Var, this.t, hc1Var, b), 1);
                    this.r = sx4Var;
                    this.n = null;
                    this.f586o = null;
                    this.q = (byte) 3;
                    obj = un7.i(ug7Var, cn5Var, this);
                    if (obj != ne1Var) {
                        r13 = sx4Var;
                        r0 = sx4Var;
                        in5Var = (in5) obj;
                        if (in5Var != null) {
                            in5Var.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        l97 l97Var7 = (l97) r13;
                        l97Var7.getClass();
                        l97Var7.l(null, bool7);
                        r1 = r0;
                        return f88.a;
                    }
                }
                return ne1Var;
            }
            return f88.a;
        } catch (Throwable th3) {
            th = th3;
            r13 = r1;
        }
    }
}
