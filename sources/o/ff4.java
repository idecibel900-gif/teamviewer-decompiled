package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff4 implements g71, mf4 {
    public static final int q;
    public final Context m;
    public final ps6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d31 f791o;
    public boolean p = true;

    static {
        q = n37.c ? 11 : 6;
    }

    public ff4(Context context, ps6 ps6Var, du6 du6Var, d31 d31Var) {
        this.m = context;
        this.n = ps6Var;
        this.f791o = d31Var;
        if (bt1.b == null) {
            im3.e0("instance");
            throw null;
        }
        ye4.a.b("SessionController", "dispatchLoginCreated: login=" + this);
        Iterator it = ps6Var.a.b().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).a(this);
        }
    }

    @Override // o.g71
    public final void a(ha7 ha7Var) {
        ye4.c("Login", "connection error: " + ha7.m);
        this.n.f(ze4.AuthCancelledOrError);
    }

    @Override // o.mf4
    public void b(io.sentry.p7 p7Var) {
    }

    public boolean c() {
        return false;
    }

    public abstract void d(ak7 ak7Var);

    @Override // o.g71
    public final void e(ak7 ak7Var) {
        Object obj;
        String string;
        int i;
        byte[] bytes;
        ye4.a("Login", "received " + ak7Var);
        int iOrdinal = ak7Var.C().ordinal();
        if (iOrdinal == 5) {
            d(ak7Var);
            return;
        }
        if (iOrdinal == 13) {
            if (ak7Var.q(yi7.Mode).a <= 0) {
                ye4.c("Login", "TVCmdConnectionMode: no mode set");
                return;
            }
            return;
        }
        if (iOrdinal == 47) {
            int i2 = ak7Var.q(tj7.MessageNumber).b;
            bf4.n.getClass();
            bf4 bf4Var = (bf4) bf4.f421o.get(Integer.valueOf(i2));
            if (bf4Var == null) {
                bf4Var = bf4.None;
            }
            int iOrdinal2 = bf4Var.ordinal();
            Context context = this.m;
            if (iOrdinal2 == 1) {
                d82.t(context, R.string.tv_NewMajorVersion);
                return;
            }
            if (iOrdinal2 == 2) {
                ye4.c("Login", "received_ShowMessage() unexpected HandshakeMessage_FTNoGUIIsRunning");
                return;
            }
            if (iOrdinal2 == 6) {
                if (!c()) {
                    if (bt1.a == null) {
                        im3.e0("dialogFactory");
                        throw null;
                    }
                    gk7 gk7VarF = ir.f();
                    gk7VarF.a1 = true;
                    gk7VarF.F0 = R.string.tv_teamviewer;
                    gk7VarF.H0 = R.string.tv_m2m_trial;
                    gk7VarF.O0 = R.string.tv_ok;
                    xk1 xk1Var = ct1.a;
                    if (xk1Var != null) {
                        xk1Var.L(gk7VarF);
                    }
                    gk7VarF.N0();
                }
                this.p = false;
                return;
            }
            if (iOrdinal2 != 9) {
                if (iOrdinal2 == 14) {
                    d82.t(context, R.string.tv_IDS_ASSISTAR_LICENSE_REQUIRED_V2);
                    return;
                }
                if (iOrdinal2 == 15) {
                    d82.t(context, R.string.tv_IDS_ASSISTAR_NOT_SUPPORTED);
                    return;
                }
                zh7 zh7VarS = ak7Var.s(tj7.MessageText);
                if (zh7VarS.m <= 0 || (obj = zh7VarS.n) == null) {
                    return;
                }
                fx3.r((String) obj, 1, context, bu7.MAIN);
                return;
            }
            this.p = false;
            if (bt1.a == null) {
                im3.e0("dialogFactory");
                throw null;
            }
            gk7 gk7VarF2 = ir.f();
            gk7VarF2.a1 = true;
            gk7VarF2.F0 = R.string.tv_teamviewer;
            gk7VarF2.H0 = R.string.tv_error_module_screen_not_supported;
            gk7VarF2.O0 = R.string.tv_ok;
            xk1 xk1Var2 = ct1.a;
            if (xk1Var2 != null) {
                xk1Var2.L(gk7VarF2);
            }
            gk7VarF2.N0();
            return;
        }
        if (iOrdinal == 49) {
            f(ak7Var);
            return;
        }
        if (iOrdinal != 53) {
            if (iOrdinal != 65) {
                ye4.c("Login", "unexpected command " + ak7Var);
                return;
            }
            return;
        }
        qf4 qf4Var = (qf4) this;
        oj7 oj7Var = oj7.m;
        Object obj2 = ak7Var.m(oj7Var).n;
        obj2.getClass();
        byte[] bArr = (byte[]) obj2;
        int length = bArr.length;
        ef4 ef4Var = ef4.n;
        ps6 ps6Var = qf4Var.n;
        if (length != 12) {
            ye4.c("Login", "negotiateVersion: invalid len=" + bArr.length + " data=" + new String(bArr, vn0.a));
            ps6Var.b();
        } else {
            try {
                Charset charsetForName = Charset.forName("ASCII");
                charsetForName.getClass();
                string = ub7.x0(new String(bArr, charsetForName)).toString();
            } catch (UnsupportedEncodingException e) {
                e41.s("toEncoding UnsupportedEncodingException ", e.getMessage(), "EncodingHelperFuncs");
                string = "";
            }
            ye4.a("Login", "Received protocol version " + string);
            if (string.length() < 10 || !bc7.N(false, string, "TV ")) {
                ye4.c("Login", "negotiateVersion: Invalid remoteversion=".concat(string));
                ps6Var.b();
            } else {
                try {
                    i = Integer.parseInt(string.substring(3, 6));
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                if (i < 6) {
                    ye4.c("Login", "negotiateVersion: Remote version " + i + " too old!");
                    ps6Var.b();
                    ef4Var = ef4.f708o;
                } else {
                    qf4Var.j().k = i;
                    ye4.a("SessionController", "connection barrier vns passed");
                    nm nmVar = ps6Var.n;
                    nmVar.getClass();
                    ArrayList arrayList = nmVar.a;
                    for (WeakReference weakReference : lv0.P0(arrayList)) {
                        Object obj3 = weakReference.get();
                        if (obj3 != null) {
                        } else {
                            arrayList.remove(weakReference);
                        }
                    }
                    ef4Var = ef4.m;
                }
            }
        }
        int iOrdinal3 = ef4Var.ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 != 2) {
                d82.t(qf4Var.m, R.string.tv_protocolNegotiationFailed);
                return;
            } else {
                qf4Var.t();
                return;
            }
        }
        bk7 bk7Var = bk7.TVCmdNegotiateVersion;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        StringBuffer stringBuffer = new StringBuffer();
        Formatter formatter = new Formatter(stringBuffer, Locale.ENGLISH);
        formatter.format("TV %03d.%03d\u0000\u0000", 15, 83);
        formatter.close();
        String string2 = stringBuffer.toString();
        string2.getClass();
        try {
            Charset charsetForName2 = Charset.forName("ASCII");
            charsetForName2.getClass();
            bytes = string2.getBytes(charsetForName2);
            bytes.getClass();
        } catch (UnsupportedEncodingException e2) {
            e41.s("toEncodedBytes UnsupportedEncodingException ", e2.getMessage(), "EncodingHelperFuncs");
            bytes = new byte[0];
        }
        ak7VarN.a(oj7Var, bytes);
        ps6Var.e(ak7VarN);
    }

    public abstract void f(ak7 ak7Var);
}
