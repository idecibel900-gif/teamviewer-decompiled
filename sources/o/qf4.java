package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.authentication.LoginHelper;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.authentication.AuthenticationMethodAdapter;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.EnforceLevelMS;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.ModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.PilotMSTypeFlags;
import com.teamviewer.teamviewerlib.swig.tvmodularsessiontypes.PilotModularSessionType;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ClientConnectorAndroid;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.EasyAccessParams;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class qf4 extends ff4 {
    public static final Settings D = Settings.i.n();
    public final of4 A;
    public final nf4 B;
    public final of4 C;
    public final du6 r;
    public boolean s;
    public boolean t;
    public AuthenticationMethodAdapter u;
    public af4 v;
    public final ih0 w;
    public tg5 x;
    public final c6 y;
    public final nf4 z;

    /* JADX WARN: Type inference failed for: r3v3, types: [o.nf4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.of4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [o.nf4] */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.of4] */
    public qf4(Context context, final ps6 ps6Var, du6 du6Var, d31 d31Var) {
        super(context, ps6Var, du6Var, d31Var);
        this.r = du6Var;
        final byte b = 1;
        this.s = true;
        this.w = new ih0();
        this.y = new c6((byte) 13);
        final byte b2 = 0;
        this.z = new hk7(this) { // from class: o.nf4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                String string = "";
                qf4 qf4Var = this.b;
                switch (b3) {
                    case 0:
                        gk7Var.A0();
                        tg5 tg5Var = (tg5) gk7Var;
                        iu iuVar = tg5Var.g1;
                        if (iuVar != null) {
                            string = ((EditText) iuVar.n).getText().toString();
                        } else {
                            ye4.c("PasswordEntryDialogFragment", "binding is null");
                        }
                        zh7 zh7Var = tg5Var.e1;
                        zh7Var.getClass();
                        qf4Var.r(string, zh7Var);
                        break;
                    default:
                        gk7Var.A0();
                        tg5 tg5Var2 = (tg5) gk7Var;
                        iu iuVar2 = tg5Var2.g1;
                        if (iuVar2 != null) {
                            string = ((EditText) iuVar2.n).getText().toString();
                        } else {
                            ye4.c("PasswordEntryDialogFragment", "binding is null");
                        }
                        String str = tg5Var2.f1;
                        str.getClass();
                        qf4Var.w(string, str);
                        break;
                }
            }
        };
        this.A = new hk7() { // from class: o.of4
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                ps6 ps6Var2 = ps6Var;
                switch (b3) {
                    case 0:
                        gk7Var.A0();
                        ps6Var2.f(ze4.AuthCancelledOrError);
                        bu7.MAIN.a(new ed((byte) 6));
                        break;
                    default:
                        gk7Var.A0();
                        ps6Var2.f(ze4.AuthCancelledOrError);
                        break;
                }
            }
        };
        this.B = new hk7(this) { // from class: o.nf4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b;
                String string = "";
                qf4 qf4Var = this.b;
                switch (b3) {
                    case 0:
                        gk7Var.A0();
                        tg5 tg5Var = (tg5) gk7Var;
                        iu iuVar = tg5Var.g1;
                        if (iuVar != null) {
                            string = ((EditText) iuVar.n).getText().toString();
                        } else {
                            ye4.c("PasswordEntryDialogFragment", "binding is null");
                        }
                        zh7 zh7Var = tg5Var.e1;
                        zh7Var.getClass();
                        qf4Var.r(string, zh7Var);
                        break;
                    default:
                        gk7Var.A0();
                        tg5 tg5Var2 = (tg5) gk7Var;
                        iu iuVar2 = tg5Var2.g1;
                        if (iuVar2 != null) {
                            string = ((EditText) iuVar2.n).getText().toString();
                        } else {
                            ye4.c("PasswordEntryDialogFragment", "binding is null");
                        }
                        String str = tg5Var2.f1;
                        str.getClass();
                        qf4Var.w(string, str);
                        break;
                }
            }
        };
        this.C = new hk7() { // from class: o.of4
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b;
                ps6 ps6Var2 = ps6Var;
                switch (b3) {
                    case 0:
                        gk7Var.A0();
                        ps6Var2.f(ze4.AuthCancelledOrError);
                        bu7.MAIN.a(new ed((byte) 6));
                        break;
                    default:
                        gk7Var.A0();
                        ps6Var2.f(ze4.AuthCancelledOrError);
                        break;
                }
            }
        };
    }

    public static void g(ak7 ak7Var) {
        g10 g10Var = g10.CCUndefined;
        nj4[] nj4VarArr = nj4.n;
        BCommandNativeImpl bCommandNativeImpl = new BCommandNativeImpl(g10Var, (byte) 1);
        String strGetModularSessionTypeUuidString = PilotModularSessionType.GetModularSessionTypeUuidString();
        strGetModularSessionTypeUuidString.getClass();
        bCommandNativeImpl.h(strGetModularSessionTypeUuidString);
        bCommandNativeImpl.g(ms4.ReadableName, "PilotModularSessionType");
        byte[] bArr = new byte[2];
        bArr[PilotMSTypeFlags.Default.swigValue()] = 1;
        bCommandNativeImpl.i(ms4.Flags, qf0.K(bArr), jk0.p);
        bCommandNativeImpl.d(ms4.EnforceLevel, EnforceLevelMS.NotEnforced.swigValue());
        List listK = qf0.K(bCommandNativeImpl);
        yl7 yl7Var = yl7.q;
        ak7Var.i(ej7.ModularSessionTypes, listK, yl7Var);
        ak7Var.i(ej7.ModularSessionTypesV2, qf0.K(bCommandNativeImpl), yl7Var);
    }

    @Override // o.ff4
    public void d(ak7 ak7Var) {
        rl0 rl0Var = new rl0(this, (byte) 1);
        y57.b = rl0Var;
        el7 el7Var = y57.a;
        if (el7Var != null) {
            el7Var.F0(rl0Var);
        }
        if (o(ak7Var.q(si7.IncomingDenied), ak7Var.q(si7.BlockDuration)) || m(ak7Var.q(si7.Authenticated)) || l(ak7Var) || n(ak7Var.m(si7.Challenge), ak7Var.q(si7.Retries), ak7Var.q(si7.RetryReason))) {
            return;
        }
        ye4.c("LoginOutgoing", "TVCmdAuthenticate: unhandled TVCmdAuthenticate " + ak7Var);
    }

    @Override // o.g71
    public final void destroy() {
        ye4.a.b("SessionController", "dispatchLoginFinished: login=" + this);
        Iterator it = this.n.a.b().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).b(this);
        }
        tg5 tg5Var = this.x;
        if (tg5Var != null) {
            tg5Var.A0();
        }
    }

    @Override // o.ff4
    public void f(ak7 ak7Var) {
        Object next;
        int i = j().k;
        int i2 = ff4.q;
        ps6 ps6Var = this.n;
        if (i < i2) {
            t();
            bk7 bk7Var = bk7.TVCmdAuthenticate;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
            ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
            aw awVar = cf4.n;
            ak7VarN.d(si7.IncomingDenied, 7);
            ps6Var.e(ak7VarN);
            ps6Var.b();
            return;
        }
        ej7 ej7Var = ej7.DisplayName;
        zh7 zh7VarS = ak7Var.s(ej7Var);
        if (zh7VarS.m > 0) {
            j().l = (String) zh7VarS.n;
        }
        if (ak7Var.q(ej7.BuddyAccountID).a > 0) {
            j().getClass();
        }
        ej7 ej7Var2 = ej7.OSType;
        ci7 ci7VarQ = ak7Var.q(ej7Var2);
        if (ci7VarQ.a > 0) {
            du6 du6VarJ = j();
            int i3 = ci7VarQ.b;
            mm1.n.getClass();
            Iterator it = mm1.q.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((mm1) next).m != i3);
            mm1 mm1Var = (mm1) next;
            if (mm1Var == null) {
                mm1Var = mm1.Undefined;
            }
            du6VarJ.getClass();
            du6VarJ.f657o = mm1Var;
        }
        ps6Var.g(i41.s);
        bk7 bk7Var2 = bk7.TVCmdInfoBeforeAuthentication;
        KnownStreams knownStreams2 = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN2 = fx3.n(knownStreams2, bk7Var2, knownStreams2);
        Settings.Companion companion = Settings.i;
        Settings settingsN = companion.n();
        du6 du6Var = ps6Var.d;
        ak7VarN2.f(ej7.Version, settingsN.a);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        ak7VarN2.f(ej7.Lang, language);
        ak7VarN2.d(ej7.ConnType, du6Var.a.swigValue());
        ak7VarN2.d(ej7Var2, 5);
        ak7VarN2.d(ej7.OSVersion, settingsN.b);
        ak7VarN2.b(ej7.CanVideoChatMode, (byte) 0);
        ak7VarN2.b(ej7.CanMeetingCommands, (byte) 1);
        ak7VarN2.f(ej7Var, this.f791o.b());
        companion.n();
        ak7VarN2.b(ej7.CustomCertificateRequestInfo, Settings.a(gv6.MACHINE, rt0.P_SECURITY_BYOC_NEGOTIATION) ? (byte) 1 : (byte) 0);
        ps6Var.e(p(ak7VarN2));
    }

    public final void h() {
        Object dh0Var;
        af4 af4Var = this.v;
        AuthenticationMethodAdapter authenticationMethodAdapter = this.u;
        if (authenticationMethodAdapter != null) {
            authenticationMethodAdapter.f();
        }
        this.u = null;
        this.v = null;
        int i = af4Var == null ? -1 : pf4.a[af4Var.ordinal()];
        ps6 ps6Var = this.n;
        if (i != 1) {
            ye4.c("LoginOutgoing", "No next authentication method configured after " + af4Var);
            ps6Var.f(ze4.AuthCancelledOrError);
            return;
        }
        mb5 mb5Var = j().b;
        Boolean bool = mb5Var.c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : mb5Var.a();
        ih0 ih0Var = this.w;
        ih0Var.c = true;
        boolean z = ih0Var.d;
        ah0 ah0Var = ah0.a;
        bh0 bh0Var = bh0.a;
        eh0 eh0Var = eh0.a;
        if (z) {
            ih0Var.d = false;
            dh0Var = eh0Var;
        } else if (!zBooleanValue) {
            ak7 ak7Var = ih0Var.e;
            ih0Var.e = null;
            dh0Var = ak7Var != null ? new dh0(ak7Var) : new ch0("BYOC finished, but no saved authentication command was available");
        } else if (ih0Var.b.contains(9)) {
            dh0Var = bh0Var;
        } else {
            dh0Var = ih0Var.b.contains(7) ? ah0Var : new ch0("BYOC finished, but neither RAApi SRP nor public key authentication is supported by the remote side");
        }
        if (dh0Var.equals(eh0Var)) {
            ye4.a("LoginOutgoing", "BYOC finished, waiting for passive authentication result");
            return;
        }
        if (dh0Var.equals(bh0Var)) {
            ye4.a("LoginOutgoing", "BYOC finished, continuing with RAApi SRP authentication");
            bk7 bk7Var = bk7.TVCmdAuthenticate;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
            ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
            ak7VarN.d(si7.SelectedAuthenticationMethod, 9);
            ps6Var.e(ak7VarN);
            return;
        }
        if (dh0Var.equals(ah0Var)) {
            ye4.a("LoginOutgoing", "BYOC finished, continuing with public key authentication");
            v();
            return;
        }
        if (!(dh0Var instanceof dh0)) {
            if (!(dh0Var instanceof ch0)) {
                gk0.s();
                return;
            } else {
                ye4.c("LoginOutgoing", ((ch0) dh0Var).a);
                ps6Var.f(ze4.AuthCancelledOrError);
                return;
            }
        }
        ye4.a("LoginOutgoing", "BYOC finished, resuming the saved authentication command");
        ak7 ak7Var2 = ((dh0) dh0Var).a;
        if (l(ak7Var2) || n(ak7Var2.m(si7.Challenge), ak7Var2.q(si7.Retries), ak7Var2.q(si7.RetryReason))) {
            return;
        }
        ye4.c("LoginOutgoing", "BYOC continuation could not resume the saved authentication command");
        ps6Var.f(ze4.AuthCancelledOrError);
    }

    public final pq1 i(ak7 ak7Var) {
        ArrayList<ModularSessionType> arrayListT = ak7Var.t(ej7.ModularSessionTypesV2, new hk0((byte) 28));
        if (arrayListT == null) {
            arrayListT = ak7Var.t(ej7.ModularSessionTypes, new gk0((byte) 29));
        }
        pq1 pq1Var = pq1.m;
        if (arrayListT == null) {
            return pq1Var;
        }
        int i = 0;
        for (ModularSessionType modularSessionType : arrayListT) {
            if (modularSessionType.IsValid()) {
                String strGetUuidString = modularSessionType.GetUuidString();
                strGetUuidString.getClass();
                if (im3.n(ub7.x0(strGetUuidString).toString(), PilotModularSessionType.GetModularSessionTypeUuidString())) {
                    j().t = modularSessionType;
                    du6 du6VarJ = j();
                    ConnectionMode connectionMode = ConnectionMode.Unknown;
                    du6VarJ.getClass();
                    connectionMode.getClass();
                    du6VarJ.a = connectionMode;
                    pq1Var = pq1.f1763o;
                }
                if (modularSessionType.getEnforceLevel() == EnforceLevelMS.Enforced) {
                    i++;
                }
            }
        }
        return (i > 1 || (arrayListT.size() > 1 && i > 0)) ? pq1.n : pq1Var;
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public du6 j() {
        return this.r;
    }

    public final boolean l(ak7 ak7Var) {
        boolean z;
        int i;
        Object fh0Var;
        Object obj;
        AuthenticationMethodAdapter.Result resultE;
        boolean z2 = ak7Var.n(si7.StartSRPAuth).b;
        ci7 ci7VarQ = ak7Var.q(si7.Retries);
        mb5 mb5Var = j().b;
        AuthenticationMethodAdapter authenticationMethodAdapter = this.u;
        si7 si7Var = si7.StartSRPAuthIdentifier;
        ps6 ps6Var = this.n;
        if (authenticationMethodAdapter != null) {
            boolean z3 = ak7Var.n(si7.Abort).b;
            ye4 ye4Var = ye4.a;
            if (z3) {
                ye4Var.g("LoginOutgoing", "Server aborted current authentication run. Restarting...");
            }
            if (ci7VarQ.a > 0 || z3) {
                AuthenticationMethodAdapter authenticationMethodAdapter2 = this.u;
                if (authenticationMethodAdapter2 != null) {
                    authenticationMethodAdapter2.f();
                }
                this.u = null;
                this.v = null;
                if (ak7Var.m(si7.Challenge).m > 0) {
                    ye4Var.g("LoginOutgoing", "Auth method failed, challenge present -> fallback to challenge auth");
                    return false;
                }
                zh7 zh7VarS = ak7Var.s(si7Var);
                if (zh7VarS.m <= 0 || (obj = zh7VarS.n) == null) {
                    ye4Var.g("LoginOutgoing", "handleAuthMethodLogin: auth method failed without challenge/partner identifier, fallback to challenge auth");
                    return true;
                }
                s((String) obj);
                return true;
            }
            AuthenticationMethodAdapter authenticationMethodAdapter3 = this.u;
            if (authenticationMethodAdapter3 != null && (resultE = authenticationMethodAdapter3.e(ak7Var)) != null) {
                q(resultE);
                if (resultE.a) {
                    h();
                    return true;
                }
                ze4 ze4Var = resultE.b;
                if (ze4Var != ze4.AuthInProgress) {
                    if (ze4Var == ze4.AuthOk) {
                        AuthenticationMethodAdapter authenticationMethodAdapter4 = this.u;
                        authenticationMethodAdapter4.getClass();
                        authenticationMethodAdapter4.f();
                        this.u = null;
                        this.v = null;
                        return true;
                    }
                    e41.s("Authentication failed with result ", ze4Var.name(), "LoginOutgoing");
                    ps6Var.f(ze4.AuthCancelledOrError);
                    AuthenticationMethodAdapter authenticationMethodAdapter5 = this.u;
                    if (authenticationMethodAdapter5 != null) {
                        authenticationMethodAdapter5.f();
                    }
                    this.u = null;
                    this.v = null;
                }
                return true;
            }
        }
        Boolean bool = mb5Var.c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : mb5Var.a();
        ih0 ih0Var = this.w;
        Settings settings = ih0Var.a;
        boolean z4 = ih0Var.c;
        hh0 hh0Var = hh0.a;
        gh0 gh0Var = gh0.a;
        if (z4) {
            z = false;
            fh0Var = gh0Var;
            i = 14;
        } else {
            ArrayList arrayListU = ak7Var.u();
            if (arrayListU != null) {
                ih0Var.b = lv0.T0(arrayListU);
            }
            rt0 rt0Var = rt0.P_SECURITY_BYOC_NEGOTIATION;
            z = false;
            gv6 gv6Var = gv6.MACHINE;
            boolean zA = Settings.a(gv6Var, rt0Var);
            boolean zA2 = Settings.a(gv6Var, rt0.P_SECURITY_BYOC_REQUIRE_FOR_OUTGOING);
            i = 14;
            boolean zContains = ih0Var.b.contains(14);
            if (zA2 && !zA) {
                ju juVar = ze4.n;
                fh0Var = new fh0("BYOC is required for outgoing connections, but local BYOC negotiation is inactive");
            } else if (zA2 && !zContains) {
                ju juVar2 = ze4.n;
                fh0Var = new fh0("BYOC is required for outgoing connections, but remote does not offer BYOC");
            } else if (zContains && zA) {
                ih0Var.e = !zBooleanValue ? ak7Var : null;
                fh0Var = hh0Var;
            } else {
                ih0Var.c = true;
                fh0Var = gh0Var;
            }
        }
        if (fh0Var instanceof fh0) {
            ye4.c("LoginOutgoing", ((fh0) fh0Var).a);
            ps6Var.f(ze4.AuthDenied);
            return true;
        }
        boolean zEquals = fh0Var.equals(hh0Var);
        si7 si7Var2 = si7.SelectedAuthenticationMethod;
        if (zEquals) {
            bk7 bk7Var = bk7.TVCmdAuthenticate;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
            knownStreams.getClass();
            ak7 ak7Var2 = new ak7(bk7Var);
            ak7Var2.z(knownStreams);
            ak7Var2.d(si7Var2, i);
            ps6Var.e(ak7Var2);
            ye4.a("LoginOutgoing", "Start BYOC auth.");
            u();
            return true;
        }
        if (!fh0Var.equals(gh0Var)) {
            gk0.s();
            return z;
        }
        if (z2) {
            Object obj2 = ak7Var.s(si7Var).n;
            obj2.getClass();
            String str = (String) obj2;
            if (mb5Var.b.length() > 0) {
                w(mb5Var.b, str);
                return true;
            }
            s(str);
            return true;
        }
        Boolean bool2 = mb5Var.c;
        if (!(bool2 != null ? bool2.booleanValue() : mb5Var.a()) || this.t) {
            return z;
        }
        ArrayList arrayListU2 = ak7Var.u();
        if (arrayListU2 != null) {
            ih0Var.b = lv0.T0(arrayListU2);
        }
        boolean zContains2 = ih0Var.b.contains(7);
        boolean zContains3 = ih0Var.b.contains(9);
        if (!zContains2 && !zContains3) {
            ye4.a("LoginOutgoing", "Public key/RAApi not supported on server side. Fallback to basic auth.");
            return z;
        }
        bk7 bk7Var2 = bk7.TVCmdAuthenticate;
        KnownStreams knownStreams2 = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams2, bk7Var2, knownStreams2);
        if (zContains3) {
            this.t = true;
            ak7VarN.d(si7Var2, 9);
            ps6Var.e(ak7VarN);
            return true;
        }
        if (!zContains2) {
            ye4.a("LoginOutgoing", "Public key auth not supported on server side. Fallback to basic auth.");
            return z;
        }
        ak7VarN.d(si7Var2, 7);
        ps6Var.e(ak7VarN);
        ye4.a("LoginOutgoing", "Start public key auth.");
        v();
        this.t = true;
        return true;
    }

    public final boolean m(ci7 ci7Var) {
        ci7Var.getClass();
        if (ci7Var.a <= 0) {
            return false;
        }
        ze4 ze4Var = ci7Var.b != 0 ? ze4.AuthOk : ze4.AuthDenied;
        ze4 ze4Var2 = ze4.AuthOk;
        ps6 ps6Var = this.n;
        if (ze4Var == ze4Var2 && j().a == ConnectionMode.Incoming_Presentation) {
            bk7 bk7Var = bk7.TVCmdAuthenticate;
            KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
            knownStreams.getClass();
            ak7 ak7Var = new ak7(bk7Var);
            ak7Var.z(knownStreams);
            ps6Var.e(ak7Var);
        }
        ps6Var.f(ze4Var);
        return true;
    }

    public final boolean n(zh7 zh7Var, ci7 ci7Var, ci7 ci7Var2) {
        if (zh7Var.m <= 0) {
            return false;
        }
        mb5 mb5Var = j().b;
        byte b = ci7Var.a;
        byte b2 = 2;
        ps6 ps6Var = this.n;
        byte b3 = 1;
        if (b <= 0) {
            if (mb5Var instanceof ut6) {
                String str = ((ut6) mb5Var).g;
                if (str.length() != 0) {
                    bk7 bk7Var = bk7.TVCmdAuthenticate;
                    KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                    ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
                    ak7VarN.f(si7.ControlPassword, str);
                    ps6Var.e(ak7VarN);
                    return true;
                }
            }
            if (mb5Var.b.length() == 0) {
                bu7.MAIN.a(new be3(this, zh7Var, b2));
                j().h = true;
                return true;
            }
            r(mb5Var.b, zh7Var);
            this.s = false;
            return true;
        }
        int i = ci7Var2.b;
        boolean z = i == 3;
        if (i == 0 || z || mb5Var.b.length() == 0) {
            if (!this.s || z) {
                ye4.a("LoginOutgoing", "received authenticate: skipping show password dialog");
            } else {
                ye4.a("LoginOutgoing", "received authenticate: show password dialog");
                hm3.B(new ji7(R.string.tv_teamviewer, R.string.tv_IDS_AUTH_RETRY, null, b3));
            }
            this.s = true;
            bu7.MAIN.a(new be3(this, zh7Var, b2));
            j().h = true;
            return true;
        }
        int i2 = ci7Var2.b;
        Context context = this.m;
        if (i2 == 1) {
            ye4.c("LoginOutgoing", "received authenticate: PresentationPasswordUsed");
            d82.t(context, R.string.tv_IDS_AUTH_RETRY_PRES_PWD);
            ps6Var.f(ze4.AuthCancelledOrError);
            return true;
        }
        if (i2 == 2) {
            ye4.c("LoginOutgoing", "received authenticate: DynOrFixedPasswordUsed");
            d82.t(context, R.string.tv_IDS_AUTH_RETRY_DYN_OR_FIXED_PWD);
            ps6Var.f(ze4.AuthCancelledOrError);
        }
        return true;
    }

    public final boolean o(ci7 ci7Var, ci7 ci7Var2) {
        ci7Var.getClass();
        int i = ci7Var.b;
        ci7Var2.getClass();
        if (ci7Var.a <= 0) {
            return false;
        }
        cf4.n.getClass();
        cf4 cf4Var = (cf4) cf4.f523o.get(Integer.valueOf(i));
        if (cf4Var == null) {
            cf4Var = cf4.Unknown;
        }
        ye4.c("LoginOutgoing", "received_Authenticate(): denied=" + cf4Var.name() + " (" + i + ")");
        byte b = 1;
        if (this.p) {
            int iOrdinal = cf4Var.ordinal();
            int i2 = R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING;
            int i3 = R.string.tv_IDS_STATUS_AUTHENTICATIONREJECTED;
            int i4 = R.string.tv_IDS_UNABLE_TO_CONNECT;
            int i5 = R.string.tv_teamviewer;
            hc1 hc1Var = null;
            switch (iOrdinal) {
                case 1:
                    if (ci7Var2.a <= 0) {
                        hm3.B(new ji7(i5, i2, hc1Var, b));
                    } else {
                        Resources resources = this.m.getResources();
                        resources.getClass();
                        hm3.B(new ki7(o67.h(resources, R.string.tv_IDS_STATUS_AUTHENTICATION_BLOCKED, Integer.valueOf(ci7Var2.b)), hc1Var, b));
                    }
                    break;
                case 2:
                    hm3.B(new ji7(i5, R.string.tv_IDS_STATUS_AUTHENTICATION_NOLANCONNECTION, hc1Var, b));
                    break;
                case 3:
                    hm3.B(new ji7(i5, R.string.tv_IDS_STATUS_AUTHENTICATION_BLACKLISTED, hc1Var, b));
                    break;
                case 4:
                case 5:
                    hm3.B(new ji7(i5, R.string.tv_IDS_QUICK_ACCESS_REJECTED, hc1Var, b));
                    break;
                case 6:
                    hm3.B(new ji7(i5, i3, hc1Var, b));
                    break;
                case 7:
                    hm3.B(new ji7(i5, R.string.tv_IDS_STATUS_INCOMPATIBLE, hc1Var, b));
                    break;
                case 8:
                    hm3.B(new ji7(i5, R.string.tv_IDS_INCOMING_BLOCKED_DUE_MEETING, hc1Var, b));
                    break;
                case ep1.b /* 9 */:
                    hm3.B(new ji7(i5, R.string.tv_IDS_FT_MODE_NOT_SUPPORTED, hc1Var, b));
                    break;
                case ep1.c /* 10 */:
                    hm3.B(new ji7(i5, R.string.tv_IDS_INCOMING_BLOCKED_DUE_MULTIPLE_CONNECTIONS, hc1Var, b));
                    break;
                case 11:
                    hm3.B(new ji7(i5, R.string.tv_IDS_STATUS_MOBILE_LICENSE_REQUIRED, hc1Var, b));
                    break;
                case ep1.d /* 12 */:
                    hm3.B(new ji7(i5, i2, hc1Var, b));
                    break;
                case 13:
                    hm3.B(new ji7(i5, i3, hc1Var, b));
                    break;
                case 14:
                default:
                    ye4.c("LoginOutgoing", "received unknown response in authentification");
                    break;
                case 15:
                    hm3.B(new ji7(i4, R.string.tv_IDS_CONNECTION_BLOCKED_POLICY_CONFLICT, hc1Var, b));
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    hm3.B(new ji7(i4, R.string.tv_IDS_EASY_ACCESS_REQUIRED_BY_POLICY, hc1Var, b));
                    break;
                case 17:
                    hm3.B(new ji7(i4, R.string.tv_IDS_PROMPT_FOR_CONFIRMATION_BLOCKED_BY_POLICY, hc1Var, b));
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    hm3.B(new ji7(i4, R.string.tv_IDS_INCOMING_BLOCKED_NOT_SUPPORTED, hc1Var, b));
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    hm3.B(new ji7(i4, R.string.tv_IDS_WEBSCREENSHARING_NOT_SUPPORTED, hc1Var, b));
                    break;
                case 20:
                    hm3.B(new ji7(i4, R.string.tv_IDS_WEBSCREENSHARING_LICENSE_REQUIRED, hc1Var, b));
                    break;
            }
        }
        this.n.f(ze4.AuthDenied);
        return true;
    }

    public ak7 p(ak7 ak7Var) {
        ae aeVar = ae.g;
        if (aeVar == null) {
            aeVar = new ae((byte) 7);
            ae.g = aeVar;
        }
        BitSet bitSet = (BitSet) aeVar.c;
        if (bitSet != null) {
            boolean zIsEmpty = bitSet.isEmpty();
            ej7 ej7Var = ej7.LicenseFeaturesLegacy;
            if (zIsEmpty) {
                ak7Var.d(ej7Var, 0);
            } else {
                ak7Var.d(ej7Var, mo8.y(bitSet));
                ak7Var.a(ej7.LicenseFeatureSet, mo8.x(bitSet));
            }
        }
        IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
        if (iAccountAndroidGetAccount != null && iAccountAndroidGetAccount.IsLoggedIn()) {
            LoginHelper.a(ak7Var, this.n.d.j.ToLong(), j().c, fx3.e(j().f, "TVCmdInfoBeforeAuthentication"));
            String strGetDisplayName = iAccountAndroidGetAccount.GetDisplayName();
            strGetDisplayName.getClass();
            ak7Var.f(ej7.LegacyAccountName, strGetDisplayName);
            ak7Var.d(ej7.BuddyAccountID, (int) iAccountAndroidGetAccount.GetAccountID());
            String strGetAccountPictureUrl = iAccountAndroidGetAccount.GetAccountPictureUrl();
            strGetAccountPictureUrl.getClass();
            ak7Var.g(ej7.BuddyAccountPictureURL, strGetAccountPictureUrl);
        }
        return ak7Var;
    }

    public final void q(AuthenticationMethodAdapter.Result result) {
        if (result != null) {
            Iterator it = lv0.P0(result.c).iterator();
            while (it.hasNext()) {
                this.n.e((ak7) it.next());
            }
        }
    }

    public final void r(String str, zh7 zh7Var) {
        xc0 xc0Var;
        byte[] bytes;
        str.getClass();
        zh7Var.getClass();
        j().b.b = str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.getClass();
            xc0Var = new xc0((Object) messageDigest, (byte) 26);
        } catch (NoSuchAlgorithmException e) {
            e41.s("create MD5 ", e.getMessage(), "CryptoHash");
            xc0Var = null;
        }
        if (xc0Var == null) {
            return;
        }
        MessageDigest messageDigest2 = (MessageDigest) xc0Var.n;
        byte[] bArr = (byte[]) zh7Var.n;
        if (bArr != null) {
            messageDigest2.update(bArr);
        }
        try {
            Charset charsetForName = Charset.forName("UTF-16LE");
            charsetForName.getClass();
            bytes = str.getBytes(charsetForName);
            bytes.getClass();
        } catch (UnsupportedEncodingException e2) {
            e41.s("toEncodedBytes UnsupportedEncodingException ", e2.getMessage(), "EncodingHelperFuncs");
            bytes = new byte[0];
        }
        messageDigest2.update(bytes);
        byte[] bArrDigest = messageDigest2.digest();
        bArrDigest.getClass();
        bk7 bk7Var = bk7.TVCmdAuthenticate;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.a(si7.Response, bArrDigest);
        this.n.e(ak7VarN);
    }

    public final void s(String str) {
        tg5 tg5Var = this.x;
        if (tg5Var != null) {
            tg5Var.A0();
        }
        if (nv1.d == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        str.getClass();
        x02 x02VarA = ik7.a();
        tg5 tg5Var2 = new tg5();
        tg5Var2.Z0 = x02VarA;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("dialogId", x02VarA);
        bundle.putString("srpPartnerIdentifier", str);
        tg5Var2.u0(bundle);
        tg5Var2.a1 = true;
        tg5Var2.K0 = R.string.tv_ok;
        tg5Var2.O0 = R.string.tv_clientDialogAbort;
        if (ct1.a != null) {
            xk1.M(this.B, new r02(tg5Var2, p02.Positive));
            xk1.M(this.C, new r02(tg5Var2, p02.Negative));
            xk1.M(this.C, new r02(tg5Var2, p02.Dismiss));
        }
        tg5Var2.N0();
        this.x = tg5Var2;
    }

    public final void t() {
        if (bt1.a == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        gk7 gk7VarF = ir.f();
        gk7VarF.F0 = R.string.tv_connectFailedOlderVersionTitle;
        gk7VarF.H0 = R.string.tv_connectFailedOlderVersion;
        gk7VarF.K0 = R.string.tv_ok;
        if (ct1.a != null) {
            xk1.M(this.y, new r02(gk7VarF, p02.Positive));
        }
        gk7VarF.N0();
    }

    public final void u() {
        AuthenticationMethodAdapter authenticationMethodAdapter = this.u;
        if (authenticationMethodAdapter != null) {
            authenticationMethodAdapter.f();
        }
        this.u = null;
        AuthenticationMethodAdapter authenticationMethodAdapter2 = new AuthenticationMethodAdapter(AuthenticationMethodAdapter.jniCreateByocActive(true, j().c));
        this.u = authenticationMethodAdapter2;
        this.v = af4.BringYourOwnCertificate;
        AuthenticationMethodAdapter.Result resultE = authenticationMethodAdapter2.e(null);
        ps6 ps6Var = this.n;
        if (resultE == null) {
            ye4.c("LoginOutgoing", "BYOC: nextStep(null) returned null");
            ps6Var.f(ze4.AuthCancelledOrError);
            AuthenticationMethodAdapter authenticationMethodAdapter3 = this.u;
            if (authenticationMethodAdapter3 != null) {
                authenticationMethodAdapter3.f();
            }
            this.u = null;
            this.v = null;
            return;
        }
        q(resultE);
        if (resultE.a) {
            h();
            return;
        }
        ze4 ze4Var = resultE.b;
        if (ze4Var == ze4.AuthInProgress) {
            ye4.a("LoginOutgoing", "BYOC started (in progress)");
            return;
        }
        if (ze4Var == ze4.AuthOk) {
            AuthenticationMethodAdapter authenticationMethodAdapter4 = this.u;
            if (authenticationMethodAdapter4 != null) {
                authenticationMethodAdapter4.f();
            }
            this.u = null;
            this.v = null;
            return;
        }
        e41.s("BYOC start failed with ", ze4Var.name(), "LoginOutgoing");
        ps6Var.f(ze4.AuthCancelledOrError);
        AuthenticationMethodAdapter authenticationMethodAdapter5 = this.u;
        if (authenticationMethodAdapter5 != null) {
            authenticationMethodAdapter5.f();
        }
        this.u = null;
        this.v = null;
    }

    public final void v() {
        ClientConnectorAndroid clientConnectorAndroidGetClientConnector = BackendContainerAndroid.GetInstance().GetClientConnector();
        ps6 ps6Var = this.n;
        if (clientConnectorAndroidGetClientConnector == null) {
            ye4.c("LoginOutgoing", "Failed to get client connector. Aborting");
            ps6Var.f(ze4.AuthCancelledOrError);
            return;
        }
        EasyAccessParams easyAccessParamsGetEasyAccessParams = clientConnectorAndroidGetClientConnector.GetEasyAccessParams();
        easyAccessParamsGetEasyAccessParams.getClass();
        D.getClass();
        DyngateID dyngateIDFromLong = DyngateID.FromLong(Settings.c(gv6.CLIENT, rt0.P_CLIENT_ID_OF_SESSION_64));
        dyngateIDFromLong.getClass();
        DyngateID dyngateID = j().j;
        int i = AuthenticationMethodAdapter.b;
        AuthenticationMethodAdapter authenticationMethodAdapter = new AuthenticationMethodAdapter(AuthenticationMethodAdapter.jniCreatePublicKeyActive(dyngateIDFromLong.ToLong(), dyngateID.ToLong(), EasyAccessParams.getCPtr(easyAccessParamsGetEasyAccessParams)));
        this.u = authenticationMethodAdapter;
        this.v = af4.PublicKey;
        AuthenticationMethodAdapter.Result resultE = authenticationMethodAdapter.e(null);
        if (ze4.AuthInProgress == (resultE != null ? resultE.b : null)) {
            q(resultE);
            return;
        }
        ps6Var.f(ze4.AuthCancelledOrError);
        AuthenticationMethodAdapter authenticationMethodAdapter2 = this.u;
        if (authenticationMethodAdapter2 != null) {
            authenticationMethodAdapter2.f();
        }
        this.u = null;
        this.v = null;
    }

    public final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        j().b.b = str;
        this.u = new AuthenticationMethodAdapter(AuthenticationMethodAdapter.jniCreateSRPActive(str, str2));
        if (j().n) {
            this.u = new AuthenticationMethodAdapter(AuthenticationMethodAdapter.jniCreateSRPActiveWithKeySwitch(str, str2, j().c));
        }
        this.v = null;
        AuthenticationMethodAdapter authenticationMethodAdapter = this.u;
        authenticationMethodAdapter.getClass();
        AuthenticationMethodAdapter.Result resultE = authenticationMethodAdapter.e(null);
        if (ze4.AuthInProgress == resultE.b) {
            q(resultE);
        } else {
            this.n.f(ze4.AuthCancelledOrError);
        }
    }
}
