package o;

import android.content.SharedPreferences;
import com.teamviewer.outgoingsessionlib.swig.ParticipantManagerFactoryAndroid;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.network.InterProcessGUIConnector;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements ec3 {
    public final ps6 m;
    public final ConnectionMode n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ha6 f283o;
    public final fa6 p;
    public final df6 q;
    public final pg5 r;
    public final x84 s;
    public bx0 t;
    public final du6 u;

    public a2(ps6 ps6Var, ConnectionMode connectionMode, xt6 xt6Var, SharedPreferences sharedPreferences, Settings settings, j93 j93Var, EventHub eventHub) {
        ps6Var.getClass();
        connectionMode.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        eventHub.getClass();
        this.m = ps6Var;
        this.n = connectionMode;
        this.t = bx0.n;
        du6 du6Var = ps6Var.d;
        this.u = du6Var;
        new ArrayList();
        zt6 zt6Var = (zt6) xt6Var;
        zt6Var.f = this;
        zt6Var.j = false;
        zt6Var.e.N(this);
        du6Var.i = new Date();
        this.q = new df6((byte) 5);
        ha6 ha6Var = new ha6(this, sharedPreferences, settings, j93Var, eventHub);
        this.f283o = ha6Var;
        this.p = new fa6(ha6Var);
        this.r = new pg5(this);
        int i = du6Var.g;
        bx0.m.getClass();
        this.t = vv.r(i);
        this.s = new x84(this, true);
        bk7 bk7Var = bk7.TVCmdConnectionMode;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.d(yi7.Mode, connectionMode.swigValue());
        f(ak7VarN, false);
    }

    public void destroy() {
        ((EnumMap) ((iu) this.q.n).n).clear();
        this.p.a = null;
        pg5 pg5Var = this.r;
        pg5Var.getClass();
        ye4 ye4Var = ye4.a;
        ye4Var.b("JParticipantManager", "shutdown");
        ParticipantManagerFactoryAndroid.Shutdown();
        InterProcessGUIConnector.a.c(0L);
        pg5Var.c = null;
        bu7.MAIN.a(new z1(this, (byte) 0));
        ps6 ps6Var = this.m;
        ps6Var.getClass();
        ye4Var.b("SessionController", "dispatchSessionFinished: session=" + this);
        Iterator it = ps6Var.a.b().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).d(this);
        }
        ArrayList arrayList = ps6Var.n.a;
        for (WeakReference weakReference : lv0.P0(arrayList)) {
            Object obj = weakReference.get();
            if (obj != null) {
                ((o41) obj).a(this, ys6.m);
            } else {
                arrayList.remove(weakReference);
            }
        }
    }

    public final boolean f(ak7 ak7Var, boolean z) {
        if (z && !this.f283o.d()) {
            return false;
        }
        this.m.e(ak7Var);
        return true;
    }

    @Override // o.mo7
    public void h(ys6 ys6Var) {
        this.m.c(this, ys6Var);
    }

    @Override // o.mo7
    public final void n(i41 i41Var) {
        ps6 ps6Var = this.m;
        ps6Var.getClass();
        ps6Var.g(i41Var);
    }

    @Override // o.mo7
    public final ConnectionMode p() {
        return this.n;
    }

    @Override // o.mo7
    public void start() {
        bu7.MAIN.a(new z1(this, (byte) 1));
    }

    @Override // o.mo7
    public final du6 t() {
        return this.u;
    }

    @Override // o.mo7
    public final int w() {
        return this.u.c;
    }

    @Override // o.mo7
    public final void y() {
        pg5 pg5Var = this.r;
        pg5Var.getClass();
        ye4.a.b("JParticipantManager", "startFullSynchronisation");
        pg5Var.a.StartFullSynchronisation(pg5Var.b);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        return this.s;
    }
}
