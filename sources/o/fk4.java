package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class fk4 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f805o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk4(MainActivity mainActivity, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f805o = mainActivity;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        MainActivity mainActivity = this.f805o;
        switch (b) {
            case 0:
                return new fk4(mainActivity, hc1Var, (byte) 0);
            default:
                return new fk4(mainActivity, hc1Var, (byte) 1);
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
        return ((fk4) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        yx6 yx6Var;
        yx6 yx6Var2;
        byte b = this.m;
        f88 f88Var = f88.a;
        MainActivity mainActivity = this.f805o;
        ne1 ne1Var = ne1.m;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                pb3 pb3Var = mainActivity.Y;
                if (pb3Var == null || (yx6Var = ((nk4) pb3Var).R) == null) {
                    return f88Var;
                }
                ek4 ek4Var = new ek4(mainActivity, (byte) 0);
                this.n = true;
                yx6.l(yx6Var, ek4Var, this);
                return ne1Var;
            default:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                pb3 pb3Var2 = mainActivity.Y;
                if (pb3Var2 == null || (yx6Var2 = ((nk4) pb3Var2).S) == null) {
                    return f88Var;
                }
                ek4 ek4Var2 = new ek4(mainActivity, b2);
                this.n = true;
                yx6.l(yx6Var2, ek4Var2, this);
                return ne1Var;
        }
    }
}
