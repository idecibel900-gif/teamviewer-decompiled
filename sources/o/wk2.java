package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk2 extends oe8 {
    public final RemoteControlApplication n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f30 f2421o;
    public final SharedPreferences p;
    public final xt6 q;
    public boolean r;
    public boolean s;
    public String t;
    public WeakReference u;

    public wk2(RemoteControlApplication remoteControlApplication, f30 f30Var, SharedPreferences sharedPreferences, xt6 xt6Var) {
        sharedPreferences.getClass();
        this.n = remoteControlApplication;
        this.f2421o = f30Var;
        this.p = sharedPreferences;
        this.q = xt6Var;
        this.t = "";
        this.u = new WeakReference(null);
    }

    public static int Y0() {
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        List list = bd4Var.b;
        if (!list.isEmpty()) {
            return list.size();
        }
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        List list2 = ca6Var.b;
        if (list2.isEmpty()) {
            return 0;
        }
        return list2.size();
    }

    public ct6 V0() {
        return new r98(new vk2(this));
    }

    public abstract String W0();

    public abstract ArrayList X0();

    public String Z0() {
        String string = this.n.getString(R.string.tv_filetransfer_title);
        string.getClass();
        return string;
    }

    public abstract boolean a1();

    public boolean b1() {
        return false;
    }

    public abstract boolean c1();

    public void d1() {
    }

    public void e1() {
    }

    public void f1() {
    }

    public abstract void g1(String str, xk1 xk1Var);

    public void h1(nk7 nk7Var) {
    }

    public abstract void i1(boolean z);

    public void j1(boolean z) {
    }

    public abstract void k1(ArrayList arrayList);

    public abstract boolean l1();

    public abstract void m1();
}
