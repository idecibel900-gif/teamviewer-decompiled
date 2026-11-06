package o;

import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ph8 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ WebLoginActivity f1735o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph8(WebLoginActivity webLoginActivity, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1735o = webLoginActivity;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        WebLoginActivity webLoginActivity = this.f1735o;
        switch (b) {
            case 0:
                return new ph8(webLoginActivity, hc1Var, (byte) 0);
            case 1:
                return new ph8(webLoginActivity, hc1Var, (byte) 1);
            default:
                return new ph8(webLoginActivity, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((ph8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1Var;
            case 1:
                ((ph8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1Var;
            default:
                return ((ph8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        WebLoginActivity webLoginActivity = this.f1735o;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                hi8 hi8Var = webLoginActivity.N;
                if (hi8Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                r36 r36Var = hi8Var.r;
                oh8 oh8Var = new oh8(webLoginActivity, (byte) 0);
                this.n = true;
                if (r36Var.m.b(oh8Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                hi8 hi8Var2 = webLoginActivity.N;
                if (hi8Var2 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                r36 r36Var2 = hi8Var2.t;
                oh8 oh8Var2 = new oh8(webLoginActivity, b2);
                this.n = true;
                if (r36Var2.m.b(oh8Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    if (im3.A(30000L, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hi8 hi8Var3 = webLoginActivity.N;
                if (hi8Var3 == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                if (((Boolean) hi8Var3.v.m.getValue()).booleanValue()) {
                    hi8 hi8Var4 = webLoginActivity.N;
                    if (hi8Var4 == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    l97 l97Var = hi8Var4.u;
                    Boolean bool = Boolean.FALSE;
                    l97Var.getClass();
                    l97Var.l(null, bool);
                    hi8 hi8Var5 = webLoginActivity.N;
                    if (hi8Var5 == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = hi8Var5.f978o;
                    if (ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel)) {
                        webLoginActivity.J("LOGIN_SUCCESSFUL");
                    } else {
                        webLoginActivity.K("LOGIN_TIMEOUT");
                    }
                }
                return f88.a;
        }
    }
}
