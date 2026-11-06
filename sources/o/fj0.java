package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fj0 extends ym0 {
    public final hw2 p;
    public final hw2 q;

    public fj0(hw2 hw2Var, de1 de1Var, int i, df0 df0Var) {
        super(de1Var, i, df0Var);
        this.p = hw2Var;
        this.q = hw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.ym0
    public final Object f(gt5 gt5Var, hc1 hc1Var) {
        ej0 ej0Var;
        if (hc1Var instanceof ej0) {
            ej0Var = (ej0) hc1Var;
            int i = ej0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ej0Var.p = i - Integer.MIN_VALUE;
            } else {
                ej0Var = new ej0(this, (jc1) hc1Var);
            }
        } else {
            ej0Var = new ej0(this, (jc1) hc1Var);
        }
        Object obj = ej0Var.n;
        int i2 = ej0Var.p;
        f88 f88Var = f88.a;
        if (i2 == 0) {
            ct1.a0(obj);
            ej0Var.m = gt5Var;
            ej0Var.p = 1;
            Object objInvoke = this.p.invoke(gt5Var, ej0Var);
            ne1 ne1Var = ne1.m;
            if (objInvoke != ne1Var) {
                objInvoke = f88Var;
            }
            if (objInvoke == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gt5Var = ej0Var.m;
            ct1.a0(obj);
        }
        if (gt5Var.p.z()) {
            return f88Var;
        }
        hk0.l("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // o.ym0
    public final ym0 g(de1 de1Var, int i, df0 df0Var) {
        return new fj0(this.q, de1Var, i, df0Var);
    }

    @Override // o.ym0
    public final String toString() {
        return "block[" + this.p + "] -> " + super.toString();
    }
}
