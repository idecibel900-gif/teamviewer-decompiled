package io.sentry;

import android.app.Notification;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.concurrent.CopyOnWriteArraySet;
import o.a07;
import o.au6;
import o.bt1;
import o.i70;
import o.im3;
import o.iu;
import o.j93;
import o.ns;
import o.p10;
import o.p55;
import o.q10;
import o.qs;
import o.r10;
import o.tp4;
import o.ye4;
import o.ye7;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public abstract class l6 {
    public Object a;
    public Object b;

    public l6(byte b) {
        switch (b) {
            case 3:
                this.b = new int[2];
                break;
            default:
                this.a = new CopyOnWriteArraySet();
                this.b = new CopyOnWriteArraySet();
                break;
        }
    }

    public abstract void A();

    public void B() {
        if (y()) {
            ye4.a("AbstractNetworkControlMethod", "Turn network off.");
            A();
        }
    }

    public void C() {
    }

    public void c(String str) {
        ((CopyOnWriteArraySet) this.a).add(str);
        ((CopyOnWriteArraySet) this.b).remove(str);
    }

    public void d(j93 j93Var) {
        ((Notification.Builder) j93Var.f1141o).setStyle(p55.a());
    }

    public void e() {
        ns nsVar = (ns) this.a;
        if (nsVar != null) {
            try {
                ((qs) this.b).w.unregisterReceiver(nsVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter f();

    public abstract int[] g(int i);

    public abstract int h();

    public String i() {
        return "o.m55";
    }

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof ye7)) {
            return menuItem;
        }
        ye7 ye7Var = (ye7) menuItem;
        a07 a07Var = (a07) this.b;
        if (a07Var == null) {
            a07Var = new a07(0);
            this.b = a07Var;
        }
        MenuItem menuItem2 = (MenuItem) a07Var.get(ye7Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        tp4 tp4Var = new tp4((Context) this.a, ye7Var);
        ((a07) this.b).put(ye7Var, tp4Var);
        return tp4Var;
    }

    public int[] k(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String l() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        im3.e0("text");
        throw null;
    }

    public boolean m() {
        return ((r10) this.a).b && ((q10) this.b).b;
    }

    public abstract boolean n();

    public void o() {
    }

    public abstract void p();

    public void q(p10 p10Var) {
    }

    public void r() {
    }

    public abstract void s();

    public String t() {
        return ((iu) this.b).k(5, new StringBuilder());
    }

    public abstract int[] u(int i);

    public void v(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void w(boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.a;
        if (z) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public void x() {
        e();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        ns nsVar = (ns) this.a;
        if (nsVar == null) {
            nsVar = new ns(this, (byte) 0);
            this.a = nsVar;
        }
        ((qs) this.b).w.registerReceiver(nsVar, intentFilterF);
    }

    public boolean y() {
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        boolean z = !(au6Var.a.get() || au6Var.f != null);
        ye4.a("DirectNetworkControlMethod", "shouldStopNetwork: " + z);
        return z;
    }

    public abstract void z(boolean z);

    public /* synthetic */ l6(Context context) {
        this.a = context;
    }

    public l6(i70 i70Var) {
        this.a = i70Var;
        this.b = new iu(i70Var);
    }

    public l6(zu1 zu1Var) {
        this.a = new r10(this, (byte) 0);
        this.b = new q10(this, zu1Var);
    }

    public l6(qs qsVar) {
        this.b = qsVar;
    }
}
