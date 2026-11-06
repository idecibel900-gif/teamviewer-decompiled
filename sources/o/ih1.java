package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ih1 implements go2 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ ih1(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    @Override // o.go2
    public final Object b(ho2 ho2Var, hc1 hc1Var) throws Throwable {
        f1 f1Var;
        vg6 vg6Var;
        Throwable th;
        byte b = this.m;
        hc1 hc1Var2 = null;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                Object objB = ((yo2) obj).b(new em(ho2Var, (byte) 2), hc1Var);
                return objB == ne1Var ? objB : f88Var;
            case 1:
                ko2 ko2Var = new ko2((po2) obj, ho2Var, hc1Var2, (byte) 0);
                jo2 jo2Var = new jo2(hc1Var, hc1Var.getContext());
                Object objP = h67.p(jo2Var, true, jo2Var, ko2Var);
                return objP == ne1Var ? objP : f88Var;
            case 2:
                if (hc1Var instanceof f1) {
                    f1Var = (f1) hc1Var;
                    int i = f1Var.p;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        f1Var.p = i - Integer.MIN_VALUE;
                    } else {
                        f1Var = new f1(this, hc1Var);
                    }
                } else {
                    f1Var = new f1(this, hc1Var);
                }
                Object obj2 = f1Var.n;
                int i2 = f1Var.p;
                if (i2 != 0) {
                    if (i2 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vg6Var = f1Var.m;
                    try {
                        ct1.a0(obj2);
                        vg6Var.releaseIntercepted();
                        return f88Var;
                    } catch (Throwable th2) {
                        th = th2;
                        vg6Var.releaseIntercepted();
                        throw th;
                    }
                }
                ct1.a0(obj2);
                vg6 vg6Var2 = new vg6(ho2Var, f1Var.getContext());
                try {
                    f1Var.m = vg6Var2;
                    f1Var.p = 1;
                    Object objInvoke = ((hw2) obj).invoke(vg6Var2, f1Var);
                    if (objInvoke != ne1Var) {
                        objInvoke = f88Var;
                    }
                    if (objInvoke == ne1Var) {
                        return ne1Var;
                    }
                    vg6Var = vg6Var2;
                    vg6Var.releaseIntercepted();
                    return f88Var;
                } catch (Throwable th3) {
                    vg6Var = vg6Var2;
                    th = th3;
                    vg6Var.releaseIntercepted();
                    throw th;
                }
            default:
                go2[] go2VarArr = (go2[]) obj;
                Object objI = hm3.i(new v87(go2VarArr, (byte) 5), hc1Var, ho2Var, new e91(3, hc1Var2), go2VarArr);
                return objI == ne1Var ? objI : f88Var;
        }
    }
}
