package o;

import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ki7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki7(String str, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1269o = str;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        String str = this.f1269o;
        switch (b) {
            case 0:
                return new ki7(str, hc1Var, (byte) 0);
            default:
                return new ki7(str, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ki7) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 0;
        String str = this.f1269o;
        ne1 ne1Var = ne1.m;
        byte b3 = 1;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                pn5 pn5Var = new pn5((byte) 8);
                gk7 gk7Var = (gk7) pn5Var.m;
                gk7Var.a1 = false;
                gk7Var.F0 = R.string.tv_teamviewer;
                gk7Var.L0(str);
                gk7Var.O0 = R.string.tv_ok;
                tk1 tk1Var = g22.a;
                ii7 ii7Var = new ii7(pn5Var, hc1Var, b3);
                this.n = true;
                return im3.j0(tk1Var, ii7Var, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                tk1 tk1Var2 = g22.a;
                q43 q43Var = ok4.a;
                ki7 ki7Var = new ki7(str, hc1Var, b2);
                this.n = true;
                return im3.j0(q43Var, ki7Var, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
