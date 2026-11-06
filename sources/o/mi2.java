package o;

import com.teamviewer.commonresourcelib.swig.IFeedbackViewModel;
import com.teamviewer.commonresourcelib.swig.IRatingViewModel;
import com.teamviewer.swigcallbacklib.BoolSignalCallback;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;

/* JADX INFO: loaded from: classes.dex */
public final class mi2 extends oe8 {
    public final IFeedbackViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IRatingViewModel f1471o;
    public final l97 p;
    public final t36 q;
    public final BoolSignalCallback r;
    public m5 s;

    public mi2(IFeedbackViewModel iFeedbackViewModel, IRatingViewModel iRatingViewModel) {
        this.n = iFeedbackViewModel;
        this.f1471o = iRatingViewModel;
        l97 l97VarK = im3.k(new oi2(0, "", "", false, false, true, true, false));
        this.p = l97VarK;
        this.q = yo1.u(l97VarK);
        this.r = SignalCallbackFactory.INSTANCE.getInstance().boolSignalCallback(new a81(this, (byte) 17));
    }

    @Override // o.oe8
    public final void U0() {
        this.n.delete();
        this.f1471o.delete();
    }

    public final void V0() {
        l97 l97Var = this.p;
        oi2 oi2Var = (oi2) l97Var.getValue();
        oi2Var.getClass();
        oi2 oi2VarA = oi2.a(oi2Var, 0, "", false, false, false, false, 416);
        l97Var.getClass();
        l97Var.l(null, oi2VarA);
    }

    public final void W0(boolean z) {
        l97 l97Var = this.p;
        oi2 oi2Var = (oi2) l97Var.getValue();
        oi2Var.getClass();
        oi2 oi2VarA = oi2.a(oi2Var, 0, null, false, false, false, z, 383);
        l97Var.getClass();
        l97Var.l(null, oi2VarA);
    }
}
