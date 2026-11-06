package o;

import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;

/* JADX INFO: loaded from: classes.dex */
public final class xt0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j97 f2548o;
    public final /* synthetic */ ClientViewOpenGL p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt0(j97 j97Var, ClientViewOpenGL clientViewOpenGL, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2548o = j97Var;
        this.p = clientViewOpenGL;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ClientViewOpenGL clientViewOpenGL = this.p;
        j97 j97Var = this.f2548o;
        switch (b) {
            case 0:
                return new xt0(j97Var, clientViewOpenGL, hc1Var, (byte) 0);
            default:
                return new xt0(j97Var, clientViewOpenGL, hc1Var, (byte) 1);
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
                ((xt0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((xt0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        ClientViewOpenGL clientViewOpenGL = this.p;
        j97 j97Var = this.f2548o;
        ne1 ne1Var = ne1.m;
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
                wt0 wt0Var = new wt0(clientViewOpenGL, (byte) 0);
                this.n = true;
                if (j97Var.b(wt0Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            default:
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
                wt0 wt0Var2 = new wt0(clientViewOpenGL, b2);
                this.n = true;
                if (j97Var.b(wt0Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
