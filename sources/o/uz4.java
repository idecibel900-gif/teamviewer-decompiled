package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.IInputMethodViewModel;
import com.teamviewer.remotecontrollib.swig.IInputMethodViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class uz4 extends oe8 implements sc3 {
    public final EventHub n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IInputMethodViewModel f2258o;
    public RCClientActivity p;
    public n72 q;
    public final fy6 r;
    public final nw4 s;

    public uz4(SharedPreferences sharedPreferences, EventHub eventHub, IInputMethodViewModel iInputMethodViewModel) {
        sharedPreferences.getClass();
        eventHub.getClass();
        this.n = eventHub;
        this.f2258o = iInputMethodViewModel;
        fy6 fy6Var = new fy6(sharedPreferences);
        this.r = fy6Var;
        Integer num = (Integer) fy6Var.getValue();
        this.s = new nw4((num != null && num.intValue() == 1) ? qc3.a : pc3.a);
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodDialogOpened(iInputMethodViewModel.a, iInputMethodViewModel);
    }

    @Override // o.sc3
    public final void O0(RCClientActivity rCClientActivity) {
        this.p = rCClientActivity;
    }

    @Override // o.oe8
    public final void U0() {
        this.f2258o.a();
    }

    @Override // o.sc3
    public final void g0(rc3 rc3Var) {
        this.s.setValue(rc3Var);
        this.q = et1.R(rc3Var);
        cb3 cb3VarT = et1.T(rc3Var);
        IInputMethodViewModel iInputMethodViewModel = this.f2258o;
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodChanged(iInputMethodViewModel.a, iInputMethodViewModel, cb3VarT.m);
    }

    @Override // o.sc3
    public final void m0() {
        lc3 lc3Var;
        jc3 jc3VarT0;
        n72 n72Var = this.q;
        if (n72Var != null) {
            boolean z = n72Var.m;
            fy6 fy6Var = this.r;
            Integer num = (Integer) fy6Var.getValue();
            if (num == null || z != num.intValue()) {
                ye4.a("RcSessionInputModeViewModel", "New input method: " + n72Var.name());
                fy6Var.setValue(Integer.valueOf(z ? 1 : 0));
                EventType eventType = EventType.EVENT_SETTINGS_CHANGED;
                he2 he2Var = new he2();
                he2Var.c(EventParam.EP_SETTINGS_KEY, "INPUT_METHOD_INT");
                this.n.d(eventType, he2Var);
                RCClientActivity rCClientActivity = this.p;
                if (rCClientActivity != null && (lc3Var = rCClientActivity.P) != null && (jc3VarT0 = lc3Var.t0()) != null) {
                    jc3VarT0.a(n72Var);
                }
            }
        }
        IInputMethodViewModel iInputMethodViewModel = this.f2258o;
        IInputMethodViewModelSWIGJNI.IInputMethodViewModel_InputMethodDialogClosed(iInputMethodViewModel.a, iInputMethodViewModel);
    }

    @Override // o.sc3
    public final nw4 w0() {
        return this.s;
    }
}
