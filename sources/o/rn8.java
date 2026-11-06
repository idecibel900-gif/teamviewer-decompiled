package o;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class rn8 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sn8 f1935o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn8(sn8 sn8Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1935o = sn8Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        sn8 sn8Var = this.f1935o;
        switch (b) {
            case 0:
                return new rn8(sn8Var, hc1Var, (byte) 0);
            default:
                return new rn8(sn8Var, hc1Var, (byte) 1);
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
        return ((rn8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.m;
        sn8 sn8Var = this.f1935o;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    AndroidComposeView androidComposeView = sn8Var.m;
                    this.n = true;
                    Object objL = androidComposeView.I.l(this);
                    if (objL != ne1Var) {
                        objL = f88Var;
                    }
                    if (objL == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    AndroidComposeView androidComposeView2 = sn8Var.m;
                    this.n = true;
                    Object objA = androidComposeView2.contentCaptureManager.a(this);
                    if (objA != ne1Var) {
                        objA = f88Var;
                    }
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
        }
    }
}
