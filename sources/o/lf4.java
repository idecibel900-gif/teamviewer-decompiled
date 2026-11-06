package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.authentication.AuthenticationMethodAdapter;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;

/* JADX INFO: loaded from: classes.dex */
public final class lf4 extends qf4 {
    public final xt5 E;
    public AuthenticationMethodAdapter F;
    public boolean G;

    public lf4(Context context, ps6 ps6Var, xt5 xt5Var, d31 d31Var) {
        super(context, ps6Var, xt5Var, d31Var);
        this.E = xt5Var;
    }

    @Override // o.qf4, o.ff4
    public final void d(ak7 ak7Var) {
        boolean zO = o(ak7Var.q(si7.IncomingDenied), ak7Var.q(si7.BlockDuration));
        AuthenticationMethodAdapter authenticationMethodAdapter = this.F;
        if (zO) {
            if (authenticationMethodAdapter != null) {
                authenticationMethodAdapter.f();
            }
            this.F = null;
            return;
        }
        if (authenticationMethodAdapter != null) {
            AuthenticationMethodAdapter.Result resultE = authenticationMethodAdapter.e(ak7Var);
            ak7 ak7Var2 = (ak7) lv0.o0(resultE.c);
            ze4 ze4Var = resultE.b;
            ps6 ps6Var = this.n;
            if (ak7Var2 != null) {
                ps6Var.e((ak7) lv0.o0(resultE.c));
            }
            int iOrdinal = ze4Var.ordinal();
            if (iOrdinal == 2) {
                authenticationMethodAdapter.f();
                this.F = null;
                this.G = true;
            } else if (iOrdinal != 6) {
                e41.s("Authentication failed with result ", ze4Var.name(), "LoginInstantSupport");
                ps6Var.f(ze4.AuthCancelledOrError);
                d82.t(this.m, R.string.tv_IDS_STATUS_AUTHENTICATION_FAILED);
                authenticationMethodAdapter.f();
                this.F = null;
            }
        }
        if (this.G) {
            m(ak7Var.q(si7.Authenticated));
        } else {
            ye4.c("LoginInstantSupport", "Received unexpected command.");
        }
    }

    @Override // o.qf4, o.ff4
    public final void f(ak7 ak7Var) {
        int iIntValue;
        ze4 ze4Var;
        super.f(ak7Var);
        xt5 xt5Var = this.E;
        String str = xt5Var.v;
        try {
            Integer numValueOf = Integer.valueOf(bc7.L(bc7.L(xt5Var.u, "s", ""), "-", ""));
            numValueOf.getClass();
            iIntValue = numValueOf.intValue();
        } catch (NumberFormatException unused) {
            ye4.c("PropertiesInstantSupport", "getRawSupportSessionId(): Formatting failed.");
            iIntValue = 0;
        }
        String strValueOf = String.valueOf(iIntValue);
        str.getClass();
        strValueOf.getClass();
        AuthenticationMethodAdapter authenticationMethodAdapter = new AuthenticationMethodAdapter(AuthenticationMethodAdapter.jniCreateSRPActive(str, strValueOf));
        this.F = authenticationMethodAdapter;
        AuthenticationMethodAdapter.Result resultE = authenticationMethodAdapter.e(null);
        ze4 ze4Var2 = ze4.AuthInProgress;
        ze4 ze4Var3 = resultE != null ? resultE.b : null;
        Context context = this.m;
        ps6 ps6Var = this.n;
        if (ze4Var2 == ze4Var3) {
            ps6Var.e((ak7) lv0.o0(resultE.c));
        } else {
            e41.s("Authentication could not be started. Result ", (resultE == null || (ze4Var = resultE.b) == null) ? null : ze4Var.name(), "LoginInstantSupport");
            ps6Var.f(ze4.AuthCancelledOrError);
            d82.t(context, R.string.tv_IDS_STATUS_AUTHENTICATION_FAILED);
        }
        ci7 ci7VarQ = ak7Var.q(ej7.ServerConnType);
        pq1 pq1VarI = i(ak7Var);
        if (pq1VarI == pq1.n) {
            bu7.MAIN.a(new ed((byte) 6));
            d82.t(context, R.string.tv_protocolNegotiationFailed);
            return;
        }
        if (pq1VarI == pq1.f1763o) {
            AuthenticationMethodAdapter authenticationMethodAdapter2 = this.F;
            if (authenticationMethodAdapter2 != null) {
                authenticationMethodAdapter2.f();
            }
            this.F = null;
            this.G = true;
        }
        if (pq1VarI != pq1.m || ci7VarQ.a <= 0) {
            return;
        }
        int i = ci7VarQ.b;
        ConnectionMode connectionMode = ConnectionMode.RemoteSupport;
        if (i == connectionMode.swigValue()) {
            xt5Var.a = connectionMode;
        }
    }

    @Override // o.qf4
    public final du6 j() {
        return this.E;
    }

    @Override // o.qf4
    /* JADX INFO: renamed from: k */
    public final du6 j() {
        return this.E;
    }

    @Override // o.qf4
    public final ak7 p(ak7 ak7Var) {
        ak7Var.d(ej7.PreferredConnectionMode, ConnectionMode.RemoteSupport.swigValue());
        ak7Var.e(ej7.RSFeatureFlags, 63L);
        ak7Var.j(qf0.K(Integer.valueOf(ss4.f2048o.m)));
        qf4.g(ak7Var);
        super.p(ak7Var);
        return ak7Var;
    }
}
