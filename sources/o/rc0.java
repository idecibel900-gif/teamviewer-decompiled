package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ILoggedInOnlineStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoggedInOnlineStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo/rc0;", "Lo/tf4;", "Lo/w05;", "", "Lo/kd0;", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rc0 extends tf4<w05> implements kd0 {
    public final ir A0;
    public final ue4 B0;
    public te4 C0;
    public Boolean D0;
    public final Handler E0;
    public pc0 F0;
    public long G0;
    public final kh7 H0;
    public final qc0 I0;

    public rc0(int i) {
        ir irVar = new ir((byte) 23);
        ue4 ue4Var = new ue4();
        ue4Var.m = jd0.n;
        this.A0 = irVar;
        this.B0 = ue4Var;
        this.E0 = new Handler(Looper.getMainLooper());
        this.H0 = new kh7(new zq((byte) 20));
        this.I0 = new qc0(this);
    }

    @Override // o.tf4
    public final if4 K0(we8 we8Var) {
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new x85((byte) 27), (byte) 2);
        ve8 ve8VarO = we8Var.getG0();
        bf1 bf1VarK = h57.k(we8Var);
        ve8VarO.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
        x86 x86Var = w86.a;
        wt3 wt3VarB = x86Var.b(te4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.C0 = (te4) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        long jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetPLFragmentContainerLoginViewModel();
        ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel != 0 ? new ILoginStateAwareContainerViewModel(jAccountViewModelFactory_GetPLFragmentContainerLoginViewModel) : null;
        iLoginStateAwareContainerViewModel.getClass();
        dl5 dl5Var2 = new dl5(new vm3((Object) iLoginStateAwareContainerViewModel, (byte) 28), (byte) 2);
        ve8 ve8VarO2 = we8Var.getG0();
        bf1 bf1VarK2 = h57.k(we8Var);
        ve8VarO2.getClass();
        bf1VarK2.getClass();
        return (if4) new pn5(ve8VarO2, dl5Var2, bf1VarK2).j("PL", x86Var.b(if4.class));
    }

    @Override // o.tf4
    public final oq0 L0() {
        te4 te4Var = this.C0;
        if (te4Var != null) {
            ILoggedInOnlineStateAwareContainerViewModel iLoggedInOnlineStateAwareContainerViewModel = te4Var.n;
            return U0(ILoggedInOnlineStateAwareContainerViewModelSWIGJNI.ILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView(iLoggedInOnlineStateAwareContainerViewModel.a, iLoggedInOnlineStateAwareContainerViewModel));
        }
        im3.e0("viewModel");
        throw null;
    }

    @Override // o.tf4
    public final th8 M0() {
        th8 th8Var = new th8();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOGIN_SOURCE_KEY", sf4.m);
        th8Var.u0(bundle);
        return th8Var;
    }

    @Override // o.tf4
    public final void N0(boolean z, boolean z2) {
        te4 te4Var = this.C0;
        if (te4Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        ILoggedInOnlineStateAwareContainerViewModel iLoggedInOnlineStateAwareContainerViewModel = te4Var.n;
        boolean zILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView = ILoggedInOnlineStateAwareContainerViewModelSWIGJNI.ILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView(iLoggedInOnlineStateAwareContainerViewModel.a, iLoggedInOnlineStateAwareContainerViewModel);
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        ht4 ht4Var = new ht4();
        if (!z2 || z) {
            S0();
            this.D0 = Boolean.valueOf(zILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView);
            return;
        }
        ue4 ue4Var = this.B0;
        jd0 jd0Var = ue4Var.m;
        ue4Var.m = jd0.n;
        if (jd0Var == jd0.m) {
            oq0 oq0VarB0 = B0();
            if (!im3.n(oq0VarB0 != null ? oq0VarB0.getClass() : null, ht4.class)) {
                S0();
                A0();
                I0(U0(zILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView), true);
                I0(ht4Var, true);
                this.D0 = Boolean.valueOf(zILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView);
                return;
            }
        }
        S0();
        Boolean bool = this.D0;
        if (zILoggedInOnlineStateAwareContainerViewModel_ShowOnlineView) {
            Boolean bool2 = Boolean.TRUE;
            if (!im3.n(bool, bool2)) {
                oq0 oq0VarU0 = U0(true);
                A0();
                I0(oq0VarU0, true);
            }
            this.D0 = bool2;
            return;
        }
        Boolean bool3 = Boolean.FALSE;
        if (im3.n(bool, bool3)) {
            return;
        }
        byte b = 0;
        if (!new l51(r0()).a()) {
            oq0 oq0VarU1 = U0(false);
            A0();
            I0(oq0VarU1, true);
            this.D0 = bool3;
            return;
        }
        if (SystemClock.elapsedRealtime() - this.G0 < 8000) {
            pc0 pc0Var = new pc0(this, b);
            this.F0 = pc0Var;
            this.E0.postDelayed(pc0Var, 8000L);
        } else {
            oq0 oq0VarU2 = U0(false);
            A0();
            I0(oq0VarU2, true);
            this.D0 = bool3;
        }
    }

    @Override // o.tf4
    public final void O0(Bundle bundle) {
        bundle.getClass();
        Boolean boolValueOf = null;
        try {
            String string = bundle.getString("savedonlinestate");
            if (string != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.D0 = boolValueOf;
    }

    @Override // o.tf4
    public final void P0(Bundle bundle) {
        bundle.putString("savedonlinestate", String.valueOf(this.D0));
    }

    public final void S0() {
        pc0 pc0Var = this.F0;
        if (pc0Var != null) {
            this.E0.removeCallbacks(pc0Var);
        }
        this.F0 = null;
    }

    public final void T0() {
        if (B0() instanceof rc0) {
            bu2 bu2VarB0 = B0();
            bu2VarB0.getClass();
            ((rc0) bu2VarB0).T0();
        }
    }

    public final oq0 U0(boolean z) {
        kh7 kh7Var = this.H0;
        if (!z) {
            if (((Boolean) kh7Var.getValue()).booleanValue()) {
                return new nx1();
            }
            if (it1.c != null) {
                return new ee0();
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (((Boolean) kh7Var.getValue()).booleanValue()) {
            if (it1.c != null) {
                return new fw1();
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (it1.c != null) {
            return new sd0();
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.bb5, o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        yt2 yt2Var = D().p;
        yt2Var.getClass();
        qc0 qc0Var = this.I0;
        qc0Var.getClass();
        ((CopyOnWriteArrayList) yt2Var.f2642o).add(new gu2(qc0Var, false));
        return layoutInflater.inflate(this.p0, viewGroup, false);
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Partnerlist;
    }

    @Override // o.ut2
    public final void b0() {
        this.S = true;
        S0();
        su2 su2VarD = D();
        qc0 qc0Var = this.I0;
        yt2 yt2Var = su2VarD.p;
        yt2Var.getClass();
        qc0Var.getClass();
        synchronized (((CopyOnWriteArrayList) yt2Var.f2642o)) {
            int size = ((CopyOnWriteArrayList) yt2Var.f2642o).size();
            for (int i = 0; i < size; i++) {
                if (((gu2) ((CopyOnWriteArrayList) yt2Var.f2642o).get(i)).a == qc0Var) {
                    ((CopyOnWriteArrayList) yt2Var.f2642o).remove(i);
                    break;
                }
            }
        }
    }

    @Override // o.kd0
    public final void f() {
        ue4 ue4Var = this.B0;
        ue4Var.getClass();
        ue4Var.m = jd0.m;
    }

    @Override // o.tf4, o.ut2
    public final void f0() {
        super.f0();
        S0();
    }

    @Override // o.tf4, o.bb5, o.ut2
    public final void g0() {
        this.G0 = SystemClock.elapsedRealtime();
        super.g0();
    }

    public rc0() {
        this(0);
    }
}
