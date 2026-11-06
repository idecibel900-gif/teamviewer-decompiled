package o;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 {
    public final /* synthetic */ ky4 a;
    public final /* synthetic */ g76 b;
    public final /* synthetic */ k76 c;
    public final /* synthetic */ vh1 d;

    public dh1(ky4 ky4Var, g76 g76Var, k76 k76Var, vh1 vh1Var) {
        this.a = ky4Var;
        this.b = g76Var;
        this.c = k76Var;
        this.d = vh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wg1 wg1Var, jc1 jc1Var) throws Throwable {
        ch1 ch1Var;
        ky4 ky4Var;
        g76 g76Var;
        k76 k76Var;
        vh1 vh1Var;
        hw2 hw2Var;
        ky4 ky4Var2;
        ky4 ky4Var3;
        k76 k76Var2;
        Object obj;
        if (jc1Var instanceof ch1) {
            ch1Var = (ch1) jc1Var;
            int i = ch1Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                ch1Var.t = i - Integer.MIN_VALUE;
            } else {
                ch1Var = new ch1(this, jc1Var);
            }
        } else {
            ch1Var = new ch1(this, jc1Var);
        }
        Object obj2 = ch1Var.r;
        int i2 = ch1Var.t;
        ne1 ne1Var = ne1.m;
        try {
            if (i2 == 0) {
                ct1.a0(obj2);
                ch1Var.m = wg1Var;
                ky4Var = this.a;
                ch1Var.n = ky4Var;
                g76Var = this.b;
                ch1Var.f525o = g76Var;
                k76Var = this.c;
                ch1Var.p = k76Var;
                vh1Var = this.d;
                ch1Var.q = vh1Var;
                ch1Var.t = 1;
                if (ky4Var.e(ch1Var) != ne1Var) {
                }
                hw2Var = wg1Var;
                return ne1Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = ch1Var.f525o;
                    k76Var2 = (k76) ch1Var.n;
                    ky4Var2 = (ky4) ch1Var.m;
                    try {
                        ct1.a0(obj2);
                        k76Var2.m = obj;
                        Object obj3 = k76Var2.m;
                        ky4Var2.j(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ky4Var2.j(null);
                        throw th;
                    }
                }
                vh1Var = (vh1) ch1Var.f525o;
                k76Var2 = (k76) ch1Var.n;
                ky4Var3 = (ky4) ch1Var.m;
                try {
                    ct1.a0(obj2);
                    if (!im3.n(obj2, k76Var2.m)) {
                        ch1Var.m = ky4Var3;
                        ch1Var.n = k76Var2;
                        ch1Var.f525o = obj2;
                        ch1Var.t = 3;
                        if (vh1Var.i(obj2, false, ch1Var) != ne1Var) {
                            obj = obj2;
                            ky4Var2 = ky4Var3;
                            k76Var2.m = obj;
                        }
                        hw2Var = wg1Var;
                        return ne1Var;
                    }
                    ky4Var2 = ky4Var3;
                    Object obj4 = k76Var2.m;
                    ky4Var2.j(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    ky4Var2 = ky4Var3;
                    ky4Var2.j(null);
                    throw th;
                }
            }
            vh1Var = ch1Var.q;
            k76 k76Var3 = ch1Var.p;
            g76Var = (g76) ch1Var.f525o;
            ky4 ky4Var4 = (ky4) ch1Var.n;
            hw2 hw2Var2 = (hw2) ch1Var.m;
            ct1.a0(obj2);
            k76Var = k76Var3;
            hw2Var = hw2Var2;
            ky4Var = ky4Var4;
            hw2Var = wg1Var;
            if (g76Var.m) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = k76Var.m;
            ch1Var.m = ky4Var;
            ch1Var.n = k76Var;
            ch1Var.f525o = vh1Var;
            ch1Var.p = null;
            ch1Var.q = null;
            ch1Var.t = 2;
            Object objInvoke = hw2Var.invoke(obj5, ch1Var);
            if (objInvoke != ne1Var) {
                ky4Var3 = ky4Var;
                obj2 = objInvoke;
                k76Var2 = k76Var;
                if (!im3.n(obj2, k76Var2.m)) {
                    ch1Var.m = ky4Var3;
                    ch1Var.n = k76Var2;
                    ch1Var.f525o = obj2;
                    ch1Var.t = 3;
                    if (vh1Var.i(obj2, false, ch1Var) != ne1Var) {
                        obj = obj2;
                        ky4Var2 = ky4Var3;
                        k76Var2.m = obj;
                    }
                } else {
                    ky4Var2 = ky4Var3;
                }
                Object obj6 = k76Var2.m;
                ky4Var2.j(null);
                return obj6;
            }
            hw2Var = wg1Var;
            return ne1Var;
        } catch (Throwable th3) {
            th = th3;
            ky4Var2 = ky4Var;
            ky4Var2.j(null);
            throw th;
        }
    }
}
