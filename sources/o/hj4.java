package o;

import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;

/* JADX INFO: loaded from: classes.dex */
public final class hj4 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ClientViewOpenGL f980o;
    public final /* synthetic */ fj4 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj4(ClientViewOpenGL clientViewOpenGL, fj4 fj4Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f980o = clientViewOpenGL;
        this.p = fj4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        fj4 fj4Var = this.p;
        ClientViewOpenGL clientViewOpenGL = this.f980o;
        switch (b) {
            case 0:
                return new hj4(clientViewOpenGL, fj4Var, hc1Var, (byte) 0);
            default:
                return new hj4(clientViewOpenGL, fj4Var, hc1Var, (byte) 1);
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
                ((hj4) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((hj4) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return ne1Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        fj4 fj4Var = this.p;
        ClientViewOpenGL clientViewOpenGL = this.f980o;
        ne1 ne1Var = ne1.m;
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
                j97 dimensionView = clientViewOpenGL.getDimensionView();
                gj4 gj4Var = new gj4(fj4Var, (byte) 0);
                this.n = true;
                if (dimensionView.b(gj4Var, this) == ne1Var) {
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
                j97 dimensionBitmap = clientViewOpenGL.getDimensionBitmap();
                gj4 gj4Var2 = new gj4(fj4Var, (byte) 1);
                this.n = true;
                if (dimensionBitmap.b(gj4Var2, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
        }
    }
}
