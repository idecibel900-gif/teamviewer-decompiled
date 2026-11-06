package o;

import com.teamviewer.remotecontrollib.swig.ISolutionsViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e67 extends oe8 {
    public final ISolutionsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wf3 f686o;
    public final vv p;
    public final nw4 q;
    public final yx6 r;
    public final r36 s;
    public final l97 t;
    public final t36 u;

    public e67(ISolutionsViewModel iSolutionsViewModel, wf3 wf3Var) {
        vv vvVar = new vv((byte) 0);
        this.n = iSolutionsViewModel;
        this.f686o = wf3Var;
        this.p = vvVar;
        nw4 nw4Var = new nw4(Boolean.FALSE);
        this.q = nw4Var;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.r = yx6VarL;
        this.s = new r36(yx6VarL);
        l97 l97VarK = im3.k(new j67("https://www.teamviewer.com/en/download/android/", true, false, (List) new kh7(new jv6(this)).getValue(), ea2.m));
        this.t = l97VarK;
        this.u = yo1.u(l97VarK);
        wf3Var.d(new nu6(1, nw4Var, nw4.class, "postValue", "postValue(Ljava/lang/Object;)V", 0, (byte) 10));
    }

    @Override // o.oe8
    public final void U0() {
        this.n.a();
        this.f686o.a();
    }
}
