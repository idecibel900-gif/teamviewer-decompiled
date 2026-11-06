package o;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.preferences.TVChangeResolutionPreference;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y46 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ y46(y46 y46Var, nu6 nu6Var) {
        this.m = (byte) 29;
        this.n = y46Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j64 j64Var;
        Object value;
        Toolbar toolbar;
        byte b = this.m;
        byte b2 = 8;
        boolean z = true;
        Object objB = null;
        tv0 tv0Var = null;
        ck3 ck3Var = null;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                lp6.d(op6Var, au8.R(((x46) obj2).b));
                return f88.a;
            case 1:
                ((s01) obj2).y(obj);
                return f88.a;
            case 2:
                p56 p56Var = (p56) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (p56Var.c) {
                    try {
                        bp3 bp3Var = p56Var.d;
                        if (bp3Var != null) {
                            l97 l97Var = p56Var.u;
                            m56 m56Var = m56.n;
                            l97Var.getClass();
                            l97Var.l(null, m56Var);
                            bp3Var.j(cancellationException);
                            p56Var.r = null;
                            bp3Var.o0(new py5((Object) p56Var, (Object) th, (byte) 3));
                        } else {
                            p56Var.e = cancellationException;
                            l97 l97Var2 = p56Var.u;
                            m56 m56Var2 = m56.m;
                            l97Var2.getClass();
                            l97Var2.l(null, m56Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return f88.a;
            case 3:
                ((t56) obj2).a((e82) obj);
                return f88.a;
            case 4:
                di6 di6Var = (di6) obj2;
                px4 px4Var = (px4) obj;
                if (!(px4Var instanceof a57)) {
                    hk0.g("Failed requirement.");
                    return null;
                }
                a57 a57Var = (a57) px4Var;
                if (a57Var.getValue() != null) {
                    Object value2 = a57Var.getValue();
                    value2.getClass();
                    objB = di6Var.b(value2);
                }
                c57 c57VarE = a57Var.e();
                c57VarE.getClass();
                return new bg5(objB, c57VarE);
            case 5:
                we1 we1Var = (we1) obj;
                int i = RemoteControlApplication.G;
                we1Var.getClass();
                bu7.MAIN.a(new be3((RemoteControlApplication) obj2, we1Var, b2));
                return f88.a;
            case 6:
                bf7 bf7Var = (bf7) obj;
                bf7Var.getClass();
                ((ve6) obj2).g = bf7Var;
                return f88.a;
            case 7:
                nh6 nh6Var = ((lh6) obj2).f1363o;
                return Boolean.valueOf(nh6Var != null ? nh6Var.a(obj) : true);
            case 8:
                hk6 hk6Var = (hk6) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                yf5 yf5Var = hk6Var.a;
                float fZ = yf5Var.z() + fFloatValue + hk6Var.g;
                float fU = ct1.u(fZ, 0.0f, hk6Var.f.z());
                z = fZ == fU;
                float fZ2 = fU - yf5Var.z();
                int iRound = Math.round(fZ2);
                yf5Var.A(yf5Var.z() + iRound);
                hk6Var.g = fZ2 - iRound;
                if (!z) {
                    fFloatValue = fZ2;
                }
                return Float.valueOf(fFloatValue);
            case ep1.b /* 9 */:
                yk6 yk6Var = (yk6) obj2;
                return new t65(yk6Var.d(yk6Var.k, ((t65) obj).a, yk6Var.j));
            case ep1.c /* 10 */:
                io.sentry.android.core.n1 n1Var = (io.sentry.android.core.n1) obj2;
                in5 in5Var = (in5) obj;
                long j = in5Var.c;
                pr7 pr7Var = (pr7) n1Var.p;
                if (!pr7Var.i() || pr7Var.l().a.n.length() == 0 || (j64Var = pr7Var.d) == null || j64Var.d() == null) {
                    z = false;
                } else {
                    n1Var.p(pr7Var.l(), j, false, jk0.K);
                }
                if (z) {
                    in5Var.a();
                }
                return f88.a;
            case 11:
                lp6.i((op6) obj, ((pe6) obj2).a);
                return f88.a;
            case ep1.d /* 12 */:
                ((List) obj).add((Float) ((e44) obj2).a());
                return true;
            case 13:
                su6 su6Var = (su6) obj2;
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                Integer numA = bt1.A(l33Var);
                if (numA == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                int iIntValue = numA.intValue();
                l97 l97Var3 = su6Var.t;
                do {
                    value = l97Var3.getValue();
                } while (!l97Var3.j(value, it6.a((it6) value, null, false, null, null, null, null, Integer.valueOf(iIntValue), false, false, false, false, false, false, false, false, 32703)));
                return f88.a;
            case 14:
                SettingsActivity settingsActivity = (SettingsActivity) obj2;
                Integer num = (Integer) obj;
                int i2 = SettingsActivity.Q;
                num.getClass();
                int iIntValue2 = num.intValue();
                ck3 ck3VarH = settingsActivity.H();
                if (ck3VarH != null || new j93(settingsActivity).W()) {
                    ck3Var = ck3VarH;
                } else {
                    ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
                }
                if (ck3Var != null) {
                    ck3Var.r0(settingsActivity.getString(iIntValue2));
                }
                return f88.a;
            case 15:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xt2 xt2VarC = ((nv6) obj2).C();
                SettingsActivity settingsActivity2 = xt2VarC instanceof SettingsActivity ? (SettingsActivity) xt2VarC : null;
                if (settingsActivity2 != null && (toolbar = (Toolbar) settingsActivity2.findViewById(R.id.toolbar)) != null) {
                    toolbar.setVisibility(zBooleanValue ? (byte) 0 : (byte) 8);
                }
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                mw6 mw6Var = (mw6) obj2;
                jd6 jd6Var = (jd6) obj;
                jd6Var.m(jd6Var.E.getDensity() * 3.0f);
                jd6Var.o(mw6Var.b);
                jd6Var.e(mw6Var.c);
                jd6Var.c(mw6Var.d);
                jd6Var.s(mw6Var.e);
                return f88.a;
            case 17:
                d07 d07Var = (d07) obj2;
                jd6 jd6Var2 = (jd6) obj;
                jd6Var2.k(d07Var.A);
                jd6Var2.l(d07Var.B);
                jd6Var2.b(d07Var.C);
                jd6Var2.A(0.0f);
                jd6Var2.C(0.0f);
                jd6Var2.m(d07Var.D);
                jd6Var2.g(0.0f);
                jd6Var2.h(0.0f);
                jd6Var2.j(d07Var.E);
                float f = d07Var.F;
                if (jd6Var2.y != f) {
                    jd6Var2.m |= 2048;
                    jd6Var2.y = f;
                }
                jd6Var2.z(d07Var.G);
                jd6Var2.o(d07Var.H);
                jd6Var2.e(d07Var.I);
                jd6Var2.c(d07Var.J);
                jd6Var2.s(d07Var.K);
                byte b3 = d07Var.L;
                if (jd6Var2.H != b3) {
                    jd6Var2.m |= 524288;
                    jd6Var2.H = b3;
                }
                jd6Var2.f(null);
                d04 d04Var = d07Var.M;
                if (!im3.n(jd6Var2.D, d04Var)) {
                    jd6Var2.m |= 1048576;
                    jd6Var2.D = d04Var;
                }
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                q07 q07Var = (q07) obj2;
                wp6 wp6Var = q07Var.r;
                wp6Var.getClass();
                if (!im3.n(q07Var.r, wp6Var)) {
                    up5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                kx4 kx4Var = q07Var.q;
                Object obj3 = q07Var.f1793o;
                if (kx4Var != null) {
                    if (obj3 != null) {
                        up5.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    kx4Var.a(obj);
                } else if (obj3 == null) {
                    q07Var.f1793o = obj;
                } else {
                    kx4 kx4Var2 = ui6.a;
                    kx4 kx4Var3 = new kx4();
                    kx4Var3.a(obj3);
                    kx4Var3.a(obj);
                    q07Var.q = kx4Var3;
                    q07Var.f1793o = null;
                }
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return Boolean.valueOf(im3.n(((jh2) obj).a, (o37) obj2));
            case 20:
                ((wf5) obj2).A(((Float) obj).floatValue());
                return f88.a;
            case 21:
                ((zf5) obj2).A(((Long) obj).longValue());
                return f88.a;
            case 22:
                ((bg5) obj2).setValue(obj);
                return f88.a;
            case 23:
                br5 br5Var = (br5) obj2;
                synchronized (br5Var.h) {
                    m57 m57Var = (m57) br5Var.j;
                    m57Var.getClass();
                    Object obj4 = m57Var.b;
                    obj4.getClass();
                    int i3 = m57Var.d;
                    vw4 vw4Var = m57Var.c;
                    if (vw4Var == null) {
                        vw4Var = new vw4();
                        m57Var.c = vw4Var;
                        m57Var.f.m(obj4, vw4Var);
                    }
                    m57Var.b(obj, i3, obj4, vw4Var);
                }
                return f88.a;
            case 24:
                c67 c67Var = (c67) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c67Var.r0 = bool.booleanValue();
                xt2 xt2VarC2 = c67Var.C();
                if (xt2VarC2 != null) {
                    xt2VarC2.invalidateOptionsMenu();
                }
                return f88.a;
            case 25:
                jd6 jd6Var3 = (jd6) obj;
                xc7 xc7VarZ0 = wc7.Z0((wc7) obj2, 4);
                jd6Var3.b(xc7VarZ0.v((byte) 21) ? xc7VarZ0.H : 1.0f);
                jd6Var3.k(xc7VarZ0.v((byte) 22) ? xc7VarZ0.I : 1.0f);
                jd6Var3.l(xc7VarZ0.v((byte) 23) ? xc7VarZ0.J : 1.0f);
                jd6Var3.A(xc7VarZ0.v((byte) 24) ? xc7VarZ0.K : 0.0f);
                jd6Var3.C(xc7VarZ0.v((byte) 25) ? xc7VarZ0.L : 0.0f);
                jd6Var3.g(xc7VarZ0.v((byte) 26) ? xc7VarZ0.M : 0.0f);
                jd6Var3.h(xc7VarZ0.v((byte) 27) ? xc7VarZ0.N : 0.0f);
                jd6Var3.j(xc7VarZ0.v((byte) 28) ? xc7VarZ0.O : 0.0f);
                if (xc7VarZ0.w(54)) {
                    tv0Var = xc7VarZ0.S;
                    tv0Var.getClass();
                }
                jd6Var3.f(tv0Var);
                long jC = d18.b;
                if (xc7VarZ0.v((byte) 29) || xc7VarZ0.v((byte) 30)) {
                    float fB = d18.b(jC);
                    if (xc7VarZ0.v((byte) 29)) {
                        fB = xc7VarZ0.P;
                    }
                    float fC = d18.c(jC);
                    if (xc7VarZ0.v((byte) 30)) {
                        fC = xc7VarZ0.Q;
                    }
                    jC = u47.c(fB, fC);
                }
                jd6Var3.z(jC);
                jd6Var3.e(xc7VarZ0.v((byte) 31) ? xc7VarZ0.D : false);
                pw6 pw6Var = kh.V;
                if (xc7VarZ0.w(53)) {
                    pw6Var = xc7VarZ0.E;
                }
                jd6Var3.o(pw6Var);
                return f88.a;
            case 26:
                ((TVChangeResolutionPreference) obj2).v((String) obj);
                return f88.a;
            case 27:
                Drawable drawable = (Drawable) obj2;
                u52 u52Var = (u52) obj;
                ll0 ll0VarX = u52Var.h0().x();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (u52Var.d() >> 32)), (int) Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)));
                drawable.draw(dg.b(ll0VarX));
                return f88.a;
            case 28:
                ((Function1) obj).invoke((cp7) obj2);
                return f88.a;
            default:
                y46 y46Var = (y46) obj2;
                l28 l28Var = (l28) obj;
                if (l28Var instanceof wb) {
                    y46Var.invoke(((wb) l28Var).A);
                    return Boolean.TRUE;
                }
                hk0.l("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
        }
    }

    public /* synthetic */ y46(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
