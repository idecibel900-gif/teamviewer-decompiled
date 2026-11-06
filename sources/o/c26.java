package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.IInputMethodViewModel;
import com.teamviewer.remotecontrollib.swig.IInputMethodViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class c26 extends oe8 implements sc3 {
    public final ep3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IInputMethodViewModel f481o;
    public RCClientActivity p;
    public final rc3 q;
    public final nw4 r;

    public c26(ep3 ep3Var, IInputMethodViewModel iInputMethodViewModel) {
        this.n = ep3Var;
        this.f481o = iInputMethodViewModel;
        n72 n72Var = (n72) ((yd2) ((fp1) ep3Var.n).g).getValue();
        rc3 rc3Var = pc3.a;
        if (n72Var != null && d26.a[n72Var.ordinal()] != 1) {
            rc3Var = qc3.a;
        }
        this.q = rc3Var;
        this.r = new nw4(rc3Var);
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodDialogOpened(iInputMethodViewModel.a, iInputMethodViewModel);
    }

    @Override // o.sc3
    public final void O0(RCClientActivity rCClientActivity) {
        this.p = rCClientActivity;
    }

    @Override // o.oe8
    public final void U0() {
        this.f481o.a();
    }

    @Override // o.sc3
    public final void g0(rc3 rc3Var) {
        this.r.setValue(rc3Var);
        cb3 cb3VarT = et1.T(rc3Var);
        IInputMethodViewModel iInputMethodViewModel = this.f481o;
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodChanged(iInputMethodViewModel.a, iInputMethodViewModel, cb3VarT.m);
    }

    @Override // o.sc3
    public final void m0() {
        jc3 jc3VarT0;
        rc3 rc3Var = (rc3) this.r.getValue();
        if (rc3Var == null) {
            return;
        }
        if (!rc3Var.equals(this.q)) {
            n72 n72VarR = et1.R(rc3Var);
            ha6 ha6Var = (ha6) ((fp1) this.n.n).h;
            ha6Var.getClass();
            ua5.v("New input method: ", n72VarR.name(), "RemoteSettings");
            ha6Var.s = n72VarR;
            SharedPreferences sharedPreferences = h57.a;
            if (sharedPreferences == null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            editorEdit.putInt("INPUT_METHOD_INT", n72VarR.m ? 1 : 0);
            editorEdit.apply();
            he2 he2Var = new he2();
            he2Var.c(EventParam.EP_SETTINGS_KEY, "INPUT_METHOD_INT");
            ha6Var.v.d(EventType.EVENT_SETTINGS_CHANGED, he2Var);
            RCClientActivity rCClientActivity = this.p;
            if (rCClientActivity == null) {
                im3.e0("actionHandler");
                throw null;
            }
            lc3 lc3Var = rCClientActivity.P;
            if (lc3Var != null && (jc3VarT0 = lc3Var.t0()) != null) {
                jc3VarT0.a(n72VarR);
            }
        }
        IInputMethodViewModel iInputMethodViewModel = this.f481o;
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodDialogClosed(iInputMethodViewModel.a, iInputMethodViewModel);
    }

    @Override // o.sc3
    public final nw4 w0() {
        return this.r;
    }
}
