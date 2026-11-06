package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo/bb5;", "T", "Lo/eb3;", "Lo/db3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class bb5<T> extends ut2 implements eb3, db3, hq4, bu2, xc3 {
    public final int p0;
    public final int q0;
    public final ea1 r0;
    public final ea1 s0;
    public j20 t0;
    public oq0 u0;
    public boolean v0;

    public bb5() {
        ye4 ye4Var = ye4.a;
        Class<ye4> cls = ye4.class;
        ea1 ea1Var = new ea1(2, ye4Var, cls, "logError", "logError(Ljava/lang/String;Ljava/lang/String;)V", 0, (byte) 5);
        ea1 ea1Var2 = new ea1(2, ye4Var, cls, "logDebug", "logDebug(Ljava/lang/String;Ljava/lang/String;)V", 0, (byte) 6);
        this.p0 = R.layout.fragment_container;
        this.q0 = R.id.inner_main;
        this.r0 = ea1Var;
        this.s0 = ea1Var2;
    }

    public final void A0() {
        this.s0.invoke("FragmentContainer", "clearing backstack");
        su2 su2VarD = D();
        su2VarD.getClass();
        su2VarD.z(new qu2(su2VarD, -1, 1), false);
        this.u0 = null;
    }

    public final oq0 B0() {
        try {
            a53 a53VarE = D().E(this.q0);
            if (a53VarE != null) {
                w05 w05VarA = a();
                if (a53VarE instanceof oq0) {
                    oq0 oq0Var = (oq0) a53VarE;
                    if (oq0Var.a().equals(w05VarA)) {
                        return oq0Var;
                    }
                }
                return null;
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    public abstract oq0 C0();

    public final void D0() {
        w10 w10Var;
        this.s0.invoke("FragmentContainer", "clearing backstack -1");
        su2 su2VarD = D();
        su2VarD.getClass();
        if (su2VarD.d.size() + (su2VarD.h != null ? 1 : 0) > 1) {
            if (1 == su2VarD.d.size()) {
                w10Var = su2VarD.h;
                if (w10Var == null) {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                w10Var = (w10) su2VarD.d.get(1);
            }
            su2VarD.U(w10Var.t, false);
        }
    }

    public void E0() {
    }

    public void F0() {
    }

    public final boolean G0() {
        E0();
        su2 su2VarD = D();
        if (su2VarD.d.size() + (su2VarD.h != null ? 1 : 0) <= 1) {
            return false;
        }
        su2 su2VarD2 = D();
        su2VarD2.getClass();
        su2VarD2.z(new qu2(su2VarD2, -1, 0), false);
        return true;
    }

    public final void H0(boolean z) {
        j20 j20Var = this.t0;
        if (j20Var != null) {
            j20Var.K(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(oq0 oq0Var, boolean z) {
        oq0Var.getClass();
        try {
            if (!a().equals(oq0Var.a())) {
                j20 j20Var = this.t0;
                if (j20Var != null) {
                    j20Var.R(oq0Var);
                    return;
                }
                return;
            }
            su2 su2VarD = D();
            su2VarD.getClass();
            w10 w10Var = new w10(su2VarD);
            w10Var.k(this.q0, (ut2) oq0Var, null);
            if (z) {
                w10Var.c();
            }
            w10Var.f();
        } catch (IllegalStateException unused) {
            this.r0.invoke("FragmentContainer", "fragment switch requested while container wasn't active. saving request");
            this.u0 = oq0Var;
            this.v0 = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final void V(ut2 ut2Var) {
        oq0 oq0Var;
        w05 w05VarA = a();
        if (ut2Var instanceof oq0) {
            oq0Var = (oq0) ut2Var;
            if (!oq0Var.a().equals(w05VarA)) {
                oq0Var = null;
            }
        } else {
            oq0Var = null;
        }
        if (oq0Var != null) {
            oq0Var.e(this);
        }
    }

    @Override // o.ut2
    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(this.p0, viewGroup, false);
    }

    @Override // o.ut2
    public final void c0() {
        this.S = true;
        this.t0 = null;
    }

    @Override // o.eb3
    public final boolean g() {
        oq0 oq0VarB0 = B0();
        eb3 eb3Var = oq0VarB0 instanceof eb3 ? (eb3) oq0VarB0 : null;
        if (eb3Var != null) {
            return eb3Var.g();
        }
        return false;
    }

    @Override // o.ut2
    public void g0() {
        this.S = true;
        oq0 oq0Var = this.u0;
        if (oq0Var != null) {
            this.r0.invoke("FragmentContainer", "restoring previous request");
            this.u0 = null;
            new Handler(r0().getMainLooper()).post(new io.sentry.u4((Object) this, (Object) oq0Var, (byte) 28));
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.settingsMenuItem) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.ut2
    public void k0(View view, Bundle bundle) {
        view.getClass();
        if (B0() == null) {
            this.s0.invoke("FragmentContainer", "stack was empty: show default");
            F0();
            su2 su2VarD = D();
            su2VarD.getClass();
            w10 w10Var = new w10(su2VarD);
            Object objC0 = C0();
            ut2 ut2Var = objC0 instanceof ut2 ? (ut2) objC0 : null;
            if (ut2Var != null) {
                w10Var.h(this.q0, ut2Var, null, 1);
                w10Var.c();
                w10Var.f();
            }
        }
        p0().v(this, L());
    }

    @Override // o.xc3
    public void q(gk6 gk6Var, boolean z) {
        j20 j20Var = this.t0;
        if (j20Var != null) {
            j20Var.q(gk6Var, z);
        }
    }

    @Override // o.hq4
    public void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        if (B0() instanceof bi3) {
            return;
        }
        menuInflater.inflate(R.menu.commons_menu, menu);
    }

    @Override // o.db3
    public final boolean v() {
        oq0 oq0VarB0 = B0();
        db3 db3Var = oq0VarB0 instanceof db3 ? (db3) oq0VarB0 : null;
        if (db3Var != null) {
            return db3Var.v();
        }
        return false;
    }
}
