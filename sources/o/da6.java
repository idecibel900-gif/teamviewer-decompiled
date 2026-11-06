package o;

import android.content.SharedPreferences;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class da6 extends wk2 {
    public final io.sentry.android.core.d v;
    public boolean w;

    public da6(RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, xt6 xt6Var) {
        sharedPreferences.getClass();
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        super(remoteControlApplication, ca6Var, sharedPreferences, xt6Var);
        io.sentry.android.core.d dVar = io.sentry.android.core.d.t;
        if (dVar == null) {
            dVar = new io.sentry.android.core.d();
            dVar.m = "";
            dVar.n = "";
            dVar.f100o = "";
            dVar.p = "";
            dVar.q = "";
            dVar.r = "";
            ea6 ea6Var = ea6.m;
            dVar.i(ea6Var);
            dVar.s = ea6Var;
            io.sentry.android.core.d.t = dVar;
        }
        this.v = dVar;
    }

    @Override // o.wk2
    public final String W0() {
        String strL;
        String strL2 = this.t;
        io.sentry.android.core.d dVar = this.v;
        if (dVar.k(strL2)) {
            strL2 = bc7.L(strL2, (String) dVar.r, this.n.getString(R.string.tv_filetransfer_my_network) + ((String) dVar.m));
        }
        if (bc7.G(false, strL2, (String) dVar.m)) {
            strL = bc7.L(strL2.substring(0, strL2.length() - 1), (String) dVar.p, " > ");
        } else {
            boolean zG = bc7.G(false, strL2, (String) dVar.p);
            String str = (String) dVar.p;
            strL = zG ? bc7.L(strL2, str, "") : bc7.L(strL2, str, " > ");
        }
        return bc7.L(strL, (String) dVar.m, " > ");
    }

    @Override // o.wk2
    public final ArrayList X0() {
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        Collection arrayList = ca6Var.b;
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
        }
        return new ArrayList(arrayList);
    }

    @Override // o.wk2
    public final String Z0() {
        String str;
        mo7 mo7Var = ((zt6) this.q).f;
        if (mo7Var == null || !(mo7Var instanceof et6)) {
            ye4.c("RemoteFileTransferViewModel", "setTitle: error getting partner name");
            str = "";
        } else {
            str = ((et6) mo7Var).Q;
        }
        int length = str.length();
        RemoteControlApplication remoteControlApplication = this.n;
        if (length > 0) {
            String string = remoteControlApplication.getString(R.string.tv_filetransfer_files_of, str);
            string.getClass();
            return string;
        }
        ye4.c("RemoteFileTransferViewModel", "setTitle: error getting partner name");
        String string2 = remoteControlApplication.getString(R.string.tv_filetransfer_title);
        string2.getClass();
        return string2;
    }

    @Override // o.wk2
    public final boolean a1() {
        return this.w;
    }

    @Override // o.wk2
    public final boolean c1() {
        boolean z = ((zt6) this.q).b.get();
        if (im3.n(this.t, "")) {
            ik2 ik2Var = (ik2) this.u.get();
            if (!z || ik2Var == null) {
                return false;
            }
            ik2Var.P0();
            return true;
        }
        String strH = this.f2421o.h(this.t);
        strH.getClass();
        this.t = strH;
        m1();
        return true;
    }

    @Override // o.wk2
    public final void g1(String str, xk1 xk1Var) {
        str.getClass();
        n1(str, xk1Var);
    }

    @Override // o.wk2
    public final void i1(boolean z) {
        this.w = z;
    }

    @Override // o.wk2
    public final void k1(ArrayList arrayList) {
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        ca6Var.b = arrayList;
    }

    @Override // o.wk2
    public final boolean l1() {
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        return ca6Var.b.isEmpty();
    }

    @Override // o.wk2
    public final void m1() {
        n1(this.t, new xk1(this, (byte) 18));
    }

    public final void n1(String str, xk1 xk1Var) {
        ik2 ik2Var = (ik2) this.u.get();
        if (im3.n(str, this.t) && ik2Var != null && ik2Var.E0 == null) {
            this.r = true;
        }
        str.getClass();
        this.t = str;
        if (ik2Var == null) {
            return;
        }
        ik2Var.O0();
        ik2Var.Q0();
        f30 f30Var = this.f2421o;
        if (f30Var.j()) {
            bu7.MAIN.a(new jq(R.string.tv_filetransfer_spinner_loading, new Object[0]));
            ListView listView = ik2Var.v0;
            if (listView != null) {
                listView.startAnimation(AnimationUtils.loadAnimation(ik2Var.C(), R.anim.fade_out));
                ListView listView2 = ik2Var.v0;
                if (listView2 != null) {
                    listView2.setVisibility(4);
                }
            }
            String str2 = this.t;
            str2.getClass();
            this.s = true;
            f30Var.k(str2, xk1Var);
        }
    }
}
