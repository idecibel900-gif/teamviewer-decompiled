package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/tf4;", "T", "Lo/bb5;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class tf4<T> extends bb5<T> {
    public ib3 w0;
    public o53 x0 = o53.m;
    public String y0 = "";
    public final vm3 z0 = new vm3(this, (byte) 7);

    public static o53 R0(Boolean bool) {
        if (im3.n(bool, Boolean.TRUE)) {
            return o53.n;
        }
        if (im3.n(bool, Boolean.FALSE)) {
            return o53.f1630o;
        }
        if (bool == null) {
            return o53.m;
        }
        gk0.s();
        return null;
    }

    @Override // o.bb5
    public final oq0 C0() {
        Boolean boolValueOf;
        ib3 ib3Var = this.w0;
        if (ib3Var != null) {
            ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = ((if4) ib3Var).n;
            boolValueOf = Boolean.valueOf(ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel));
        } else {
            boolValueOf = null;
        }
        return im3.n(boolValueOf, Boolean.TRUE) ? L0() : M0();
    }

    @Override // o.bb5
    public final void F0() {
        ye4.a.b("LoginStateAwareFragmentContainer", "starting initial login fragment");
        A0();
    }

    public abstract if4 K0(we8 we8Var);

    public abstract oq0 L0();

    public abstract th8 M0();

    public void N0(boolean z, boolean z2) {
    }

    public void O0(Bundle bundle) {
        bundle.getClass();
    }

    public void P0(Bundle bundle) {
    }

    public final void Q0() {
        Boolean boolValueOf;
        boolean z;
        ib3 ib3Var = this.w0;
        String strLicenseViewModel_GetAccountLoginName = null;
        if (ib3Var != null) {
            ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = ((if4) ib3Var).n;
            boolValueOf = Boolean.valueOf(ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel));
        } else {
            boolValueOf = null;
        }
        o53 o53VarR0 = R0(boolValueOf);
        ib3 ib3Var2 = this.w0;
        if (ib3Var2 != null) {
            LicenseViewModel licenseViewModel = ((if4) ib3Var2).f1056o;
            strLicenseViewModel_GetAccountLoginName = LicenseViewModelSWIGJNI.LicenseViewModel_GetAccountLoginName(licenseViewModel.a, licenseViewModel);
        }
        ye4 ye4Var = ye4.a;
        ye4Var.b("LoginStateAwareFragmentContainer", "is logged in: " + o53VarR0);
        boolean z2 = false;
        if (this.x0 == o53VarR0 && im3.n(this.y0, strLicenseViewModel_GetAccountLoginName)) {
            z = false;
        } else {
            this.x0 = o53VarR0;
            this.y0 = strLicenseViewModel_GetAccountLoginName;
            z = true;
        }
        ib3 ib3Var3 = this.w0;
        if (ib3Var3 != null) {
            ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel2 = ((if4) ib3Var3).n;
            if (ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel2.a, iLoginStateAwareContainerViewModel2)) {
                z2 = true;
            }
        }
        if (z) {
            ye4Var.b("LoginStateAwareFragmentContainer", "login or account name change triggered");
            A0();
            I0(im3.n(Boolean.valueOf(z2), Boolean.TRUE) ? L0() : M0(), true);
        }
        N0(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final void U(Context context) {
        super.U(context);
        if (context instanceof xt2) {
            this.w0 = K0((we8) context);
        }
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            String string = bundle.getString("savedloginstate");
            o53 o53VarValueOf = o53.m;
            if (string != null) {
                try {
                    o53VarValueOf = o53.valueOf(string);
                } catch (IllegalArgumentException unused) {
                    e41.s("could not restore previous login state: ", string, "LoginStateAwareFragmentContainer");
                }
            }
            this.x0 = o53VarValueOf;
            this.y0 = bundle.getString("savedaccountname");
            O0(bundle);
        }
    }

    @Override // o.ut2
    public void f0() {
        this.S = true;
        ib3 ib3Var = this.w0;
        if (ib3Var != null) {
            vm3 vm3Var = this.z0;
            vm3Var.getClass();
            Iterator it = ((if4) ib3Var).p.iterator();
            while (it.hasNext()) {
                if (vm3Var == ((WeakReference) it.next()).get()) {
                    it.remove();
                }
            }
        }
    }

    @Override // o.bb5, o.ut2
    public void g0() {
        super.g0();
        ib3 ib3Var = this.w0;
        if (ib3Var != null) {
            vm3 vm3Var = this.z0;
            vm3Var.getClass();
            ((if4) ib3Var).p.add(new WeakReference(vm3Var));
        }
        Q0();
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putString("savedloginstate", this.x0.name());
        bundle.putString("savedaccountname", this.y0);
        P0(bundle);
    }

    @Override // o.bb5, o.ut2
    public final void k0(View view, Bundle bundle) {
        Boolean boolValueOf;
        view.getClass();
        super.k0(view, bundle);
        ib3 ib3Var = this.w0;
        if (ib3Var != null) {
            ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = ((if4) ib3Var).n;
            boolValueOf = Boolean.valueOf(ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel));
        } else {
            boolValueOf = null;
        }
        if (R0(boolValueOf) != o53.n) {
            this.x0 = o53.m;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // o.bb5, o.xc3
    public final void q(gk6 gk6Var, boolean z) {
        ib3 ib3Var = this.w0;
        if (ib3Var != null) {
            ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = ((if4) ib3Var).n;
            if (!ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel)) {
                gk6Var = gk6.n;
            }
        } else {
            gk6Var = gk6.n;
        }
        super.q(gk6Var, z);
    }
}
