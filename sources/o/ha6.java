package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ha6 {
    public static final hk w = new hk(8);
    public final a2 a;
    public final j93 b;
    public final pq6 c;
    public final ArrayList d;
    public j22 e;
    public j22 f;
    public j22[] g;
    public j22 h;
    public int i;
    public ry5 j;
    public int k;
    public int l;
    public final nw4 m;
    public t12 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f962o;
    public boolean p;
    public boolean q;
    public ArrayList r;
    public n72 s;
    public o72 t;
    public final nw4 u;
    public final EventHub v;

    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    public ha6(a2 a2Var, SharedPreferences sharedPreferences, Settings settings, j93 j93Var, EventHub eventHub) {
        sharedPreferences.getClass();
        settings.getClass();
        eventHub.getClass();
        this.a = a2Var;
        this.b = j93Var;
        pq6 pq6Var = new pq6();
        pq6Var.a = 1.0f;
        this.c = pq6Var;
        this.d = new ArrayList();
        this.e = new j22();
        this.f = new j22();
        this.h = new j22();
        Boolean bool = Boolean.FALSE;
        this.m = new nw4(bool);
        nw4 nw4Var = new nw4(bool);
        this.f962o = nw4Var;
        this.u = new nw4(bool);
        h(t12.NotBlocked);
        this.q = false;
        ca8 ca8Var = ca8.P_REMOTE_REMOTECURSOR;
        gv6 gv6Var = gv6.USER;
        this.p = Settings.a(gv6Var, ca8Var);
        int i = sharedPreferences.getInt("QUALITY_SETTINGS_INT", 0);
        qy5 qy5Var = qy5.Auto;
        if (i != 0) {
            if (i == 1) {
                qy5Var = qy5.Quality;
            } else if (i != 2) {
                ye4.c("QualitySettings", "Index cannot be mapped to a mode.");
            } else {
                qy5Var = qy5.Speed;
            }
        }
        int i2 = sharedPreferences.getInt("INPUT_METHOD_INT", 0);
        n72.n.getClass();
        n72 n72VarF = cr.f(i2);
        this.s = n72VarF;
        n72 n72Var = n72.Touch;
        o72 o72Var = o72.n;
        if (n72VarF == n72Var) {
            String string = sharedPreferences.getString("PREFERRED_RESOLUTION", "DontChange");
            string = string == null ? "" : string;
            o72.m.getClass();
            int iHashCode = string.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 1082019521) {
                    if (iHashCode == 1446976365 && string.equals("BestFit")) {
                        o72Var = o72.f1638o;
                    } else {
                        ye4.a.g("EPreferredResolution", "Unknown string!! ".concat(string));
                    }
                } else if (!string.equals("DontChange")) {
                    ye4.a.g("EPreferredResolution", "Unknown string!! ".concat(string));
                }
            } else if (!string.equals("")) {
                ye4.a.g("EPreferredResolution", "Unknown string!! ".concat(string));
            }
            this.t = o72Var;
        } else {
            this.t = o72Var;
        }
        this.j = new ry5(qy5Var, Settings.a(gv6Var, ca8.P_REMOTE_REMOVEWALLPAPER));
        ConnectionMode connectionMode = a2Var.n;
        nw4Var.postValue(Boolean.valueOf(connectionMode == ConnectionMode.RemoteControl || connectionMode == ConnectionMode.RemoteSupport));
        this.v = eventHub;
    }

    public final void a() {
        if (o53.f1630o == this.a.p.l) {
            ye4.a("RemoteSettings", "findAndSetBestFitResolution(): canChangeScreenResolution is false.");
            return;
        }
        j22 j22VarB = b(true);
        if (j22VarB == null) {
            j22VarB = b(false);
        }
        if (j22VarB == null) {
            ye4.c("RemoteSettings", "findAndSetBestFitResolution: Could not find a bestfit resolution!");
            return;
        }
        this.h = j22VarB;
        ye4.a("RemoteSettings", "Bestfit resolution found! It's ".concat(j22VarB.a()));
        if (this.t == o72.f1638o && this.s == n72.Touch && !im3.n(this.e, j22VarB)) {
            j(j22VarB);
        }
    }

    public final j22 b(boolean z) {
        ArrayList arrayList;
        Point pointT = this.b.T();
        int i = pointT.x;
        int i2 = pointT.y;
        float f = this.c.a;
        int i3 = (int) (i / f);
        int i4 = (int) (i2 / f);
        synchronized (this.d) {
            arrayList = new ArrayList(this.d);
        }
        if (!arrayList.isEmpty()) {
            j22 j22Var = (j22) arrayList.get(0);
            if ((i3 <= i4 || j22Var.m <= j22Var.n) && (i3 >= i4 || j22Var.m >= j22Var.n)) {
                i3 = i4;
                i4 = i3;
            }
        }
        float f2 = i3;
        float f3 = i4;
        float f4 = f2 / f3;
        boolean z2 = this.a.p.c == 14;
        int size = arrayList.size();
        float f5 = Float.MAX_VALUE;
        j22 j22Var2 = null;
        for (int i5 = 0; i5 < size; i5++) {
            j22 j22Var3 = (j22) arrayList.get(i5);
            float f6 = j22Var3.m;
            float f7 = j22Var3.n;
            if (!z2 || (f7 >= 768.0f && f6 >= 768.0f)) {
                float f8 = (f6 / f7) - f4;
                if (!z || f8 >= 0.0f) {
                    float f9 = (f6 / f2) - 1.0f;
                    float f10 = (f7 / f3) - 1.0f;
                    float f11 = (f8 * f8) + (f9 * f9) + (f10 * f10);
                    if (f11 <= f5) {
                        j22Var2 = j22Var3;
                        f5 = f11;
                    }
                }
            }
        }
        return j22Var2;
    }

    public final synchronized t12 c() {
        t12 t12Var;
        t12Var = this.n;
        if (t12Var == null) {
            im3.e0("blockInputState");
            throw null;
        }
        return t12Var;
    }

    public final boolean d() {
        return im3.n(this.f962o.getValue(), Boolean.TRUE);
    }

    public final synchronized boolean e(t12 t12Var) {
        if (t12Var == c()) {
            ye4.a("RemoteSettings", " Block Input not send. State:" + t12Var);
            return false;
        }
        bk7 bk7Var = bk7.TVCmdServerInput;
        ParticipantIdentifier participantIdentifierA = this.a.r.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        ak7Var.d(rj7.m, t12Var.m);
        if (!this.a.f(ak7Var, true)) {
            return false;
        }
        h(t12Var);
        ye4.a("RemoteSettings", " send block input with: " + t12Var);
        return true;
    }

    public final void f(boolean z) {
        bk7 bk7Var = bk7.TVCmdAutoLockWorkstation;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.b(ti7.Value, z ? (byte) 1 : (byte) 0);
        if (this.a.f(ak7VarN, true)) {
            this.u.postValue(Boolean.valueOf(z));
        }
    }

    public final void g() {
        ye4.a("RemoteSettings", " send ctrl+alt+del: ");
        bk7 bk7Var = bk7.TVCmdCtrlAltDel;
        a2 a2Var = this.a;
        ParticipantIdentifier participantIdentifierA = a2Var.r.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        if (a2Var.f(ak7Var, true)) {
            a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.CtrlAltDelUsed, true);
        }
    }

    public final synchronized void h(t12 t12Var) {
        try {
            if (this.n == null || t12Var != c()) {
                this.n = t12Var;
                bu7.MAIN.a(new pc0((Object) this, (byte) 25));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(boolean z) {
        if (z) {
            this.f962o.postValue(Boolean.valueOf(z));
            boolean z2 = true;
            boolean z3 = !z;
            if (z3 != this.q) {
                this.q = z3;
            } else {
                z2 = false;
            }
            if (z2) {
                this.a.b();
            }
            EventHub.e(this.v, EventType.EVENT_INPUT_DISABLED);
        }
    }

    public final boolean j(j22 j22Var) {
        int i = this.k;
        a2 a2Var = this.a;
        if (a2Var.p.l == o53.f1630o) {
            ye4.a.g("RemoteSettings", "change Resolution not supported by partner");
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_supportedFeatureMessage_NoScreenResChange);
                return false;
            }
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return false;
        }
        int i2 = j22Var.p;
        int i3 = j22Var.f1122o;
        int i4 = j22Var.n;
        int i5 = j22Var.m;
        ye4.a("RemoteSettings", "change resolution: ".concat(i5 + "X" + i4 + "X" + i3 + "X" + i2));
        if (i5 <= 0 || i4 <= 0 || i3 <= 0) {
            ye4.c("RemoteSettings", "change resolution NOT send because DisplayResolution is invalid.");
            return true;
        }
        bk7 bk7Var = bk7.TVCmdChangeScreenResolution;
        ParticipantIdentifier participantIdentifierA = a2Var.r.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        ak7Var.d(ui7.Width, i5);
        ak7Var.d(ui7.Heigth, i4);
        ak7Var.d(ui7.BPP, i3);
        ak7Var.d(ui7.Frequency, i2);
        ak7Var.d(ui7.Monitor, i);
        a2Var.f(ak7Var, false);
        a2Var.m.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.RemoteResolutionChanged, true);
        return true;
    }
}
