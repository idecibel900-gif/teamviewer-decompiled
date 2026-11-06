package o;

import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvclientlicensing.ILicensing;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class rf4 extends qf4 {
    public io.sentry.p7 E;

    @Override // o.ff4, o.mf4
    public final void b(io.sentry.p7 p7Var) {
        this.E = p7Var;
    }

    @Override // o.ff4
    public final boolean c() {
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        boolean z = iAccountAndroidGetAccount != null && iAccountAndroidGetAccount.IsLoggedIn();
        if (ae.g == null) {
            ae.g = new ae((byte) 7);
        }
        ILicensing iLicensingGetLicensing = BackendContainerAndroid.GetInstance().GetLicensing();
        boolean z2 = iLicensingGetLicensing != null && iLicensingGetLicensing.IsAccountTrialExpired();
        if (!z || z2) {
            return false;
        }
        io.sentry.p7 p7Var = this.E;
        if (p7Var != null) {
            j93 j93Var = (j93) p7Var.n;
            s7 s7Var = u7.g;
            my0 my0Var = vn4.g0().b;
            if (my0Var instanceof xt2) {
                xt2 xt2Var = (xt2) my0Var;
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.a1 = true;
                gk7Var.F0 = R.string.tv_m2m_trial_header;
                gk7Var.H0 = R.string.tv_m2m_trial;
                gk7Var.O0 = R.string.tv_cancel;
                gk7Var.K0 = R.string.tv_m2m_trial_activate;
                if (ct1.a != null) {
                    xk1.M((c6) j93Var.q, new r02(gk7Var, p02.Negative));
                }
                if (ct1.a != null) {
                    xk1.M((b6) j93Var.p, new r02(gk7Var, p02.Positive));
                }
                gk7.O0(gk7Var, xt2Var);
                return true;
            }
            ye4.c("AccountTrialViewManager", "Trial activation failed, no activity");
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    @Override // o.qf4, o.ff4
    public final void f(ak7 ak7Var) {
        Object fh0Var;
        ci7 ci7VarQ = ak7Var.q(ej7.ServerConnType);
        pq1 pq1VarI = i(ak7Var);
        if (pq1VarI == pq1.n) {
            bu7.MAIN.a(new ed((byte) 6));
            d82.t(this.m, R.string.tv_protocolNegotiationFailed);
            return;
        }
        if (pq1VarI == pq1.m && ci7VarQ.a > 0) {
            int i = ci7VarQ.b;
            ConnectionMode connectionMode = ConnectionMode.RemoteSupport;
            if (i == connectionMode.swigValue()) {
                du6 du6Var = this.r;
                du6Var.getClass();
                du6Var.a = connectionMode;
            }
        }
        super.f(ak7Var);
        boolean z = ak7Var.n(ej7.CustomCertificateRequestInfo).b;
        ih0 ih0Var = this.w;
        Settings settings = ih0Var.a;
        boolean z2 = ih0Var.c;
        hh0 hh0Var = hh0.a;
        gh0 gh0Var = gh0.a;
        if (z2) {
            fh0Var = gh0Var;
        } else {
            rt0 rt0Var = rt0.P_SECURITY_BYOC_NEGOTIATION;
            gv6 gv6Var = gv6.MACHINE;
            boolean zA = Settings.a(gv6Var, rt0Var);
            boolean zA2 = Settings.a(gv6Var, rt0.P_SECURITY_BYOC_REQUIRE_FOR_OUTGOING);
            if (zA2 && !zA) {
                ju juVar = ze4.n;
                fh0Var = new fh0("BYOC is required for outgoing connections, but local BYOC negotiation is inactive");
            } else if (zA2 && !z) {
                ju juVar2 = ze4.n;
                fh0Var = new fh0("BYOC is required for outgoing connections, but remote does not request BYOC");
            } else if (z && zA) {
                ih0Var.d = true;
                fh0Var = hh0Var;
            } else {
                fh0Var = gh0Var;
            }
        }
        if (fh0Var instanceof fh0) {
            ye4.c("LoginOutgoing", ((fh0) fh0Var).a);
            this.n.f(ze4.AuthDenied);
        } else if (fh0Var.equals(hh0Var)) {
            ye4.a("LoginOutgoing", "Start BYOC auth from info-before-auth.");
            u();
        } else {
            if (fh0Var.equals(gh0Var)) {
                return;
            }
            gk0.s();
        }
    }

    @Override // o.qf4
    public final ak7 p(ak7 ak7Var) {
        du6 du6Var = this.r;
        ConnectionMode connectionMode = du6Var.a;
        BitSet bitSet = du6Var.d;
        ConnectionMode connectionMode2 = ConnectionMode.RemoteSupport;
        if (connectionMode == connectionMode2) {
            ak7Var.d(ej7.PreferredConnectionMode, connectionMode2.swigValue());
            ak7Var.e(ej7.RSFeatureFlags, 63L);
            ak7Var.j(qf0.L(Integer.valueOf(ss4.f2048o.m), Integer.valueOf(ss4.p.m)));
            bitSet.set(1);
            if (!bitSet.isEmpty()) {
                ak7Var.a(ej7.RSSupportedConnectionTypes, mo8.x(bitSet));
            }
        }
        qf4.g(ak7Var);
        super.p(ak7Var);
        return ak7Var;
    }
}
