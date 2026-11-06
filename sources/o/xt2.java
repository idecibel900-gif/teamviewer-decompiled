package o;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt2 extends my0 {
    public boolean J;
    public boolean K;
    public final xk1 H = new xk1((Object) new wt2(this), (byte) 20);
    public final x84 I = new x84(this, true);
    public boolean L = true;

    public xt2() {
        final byte b = 1;
        ((a65) this.p.f302o).Q0("android:support:lifecycle", new fy0(this, (byte) 2));
        final byte b2 = 0;
        this.v.add(new c71(this) { // from class: o.vt2
            public final /* synthetic */ xt2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b3 = b2;
                xt2 xt2Var = this.b;
                switch (b3) {
                    case 0:
                        xt2Var.H.R();
                        break;
                    default:
                        xt2Var.H.R();
                        break;
                }
            }
        });
        this.x.add(new c71(this) { // from class: o.vt2
            public final /* synthetic */ xt2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b3 = b;
                xt2 xt2Var = this.b;
                switch (b3) {
                    case 0:
                        xt2Var.H.R();
                        break;
                    default:
                        xt2Var.H.R();
                        break;
                }
            }
        });
        x(new gy0(this, b));
    }

    public static boolean E(su2 su2Var) {
        boolean zE = false;
        for (ut2 ut2Var : su2Var.c.Q()) {
            if (ut2Var != null) {
                wt2 wt2Var = ut2Var.G;
                if ((wt2Var == null ? null : wt2Var.w) != null) {
                    zE |= E(ut2Var.D());
                }
                gv2 gv2Var = ut2Var.f0;
                m84 m84Var = m84.p;
                m84 m84Var2 = m84.f1446o;
                if (gv2Var != null) {
                    gv2Var.e();
                    if (gv2Var.q.i.compareTo(m84Var) >= 0) {
                        x84 x84Var = ut2Var.f0.q;
                        x84Var.c("setCurrentState");
                        x84Var.e(m84Var2);
                        zE = true;
                    }
                }
                if (ut2Var.d0.i.compareTo(m84Var) >= 0) {
                    x84 x84Var2 = ut2Var.d0;
                    x84Var2.c("setCurrentState");
                    x84Var2.e(m84Var2);
                    zE = true;
                }
            }
        }
        return zE;
    }

    public final su2 D() {
        return ((wt2) this.H.n).v;
    }

    public void F(ut2 ut2Var) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.J);
        printWriter.print(" mResumed=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        if (getApplication() != null) {
            yt2.C(this).x(str3, printWriter);
        }
        ((wt2) this.H.n).v.x(str, fileDescriptor, printWriter, strArr);
    }

    @Override // o.my0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.H.R();
        super.onActivityResult(i, i2, intent);
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I.d(l84.ON_CREATE);
        su2 su2Var = ((wt2) this.H.n).v;
        su2Var.I = false;
        su2Var.J = false;
        su2Var.P.s = false;
        su2Var.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((wt2) this.H.n).v.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((wt2) this.H.n).v.m();
        this.I.d(l84.ON_DESTROY);
    }

    @Override // o.my0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((wt2) this.H.n).v.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.K = false;
        su2 su2Var = ((wt2) this.H.n).v;
        if (su2Var.h != null) {
            su2Var.d();
        }
        su2Var.v(5);
        this.I.d(l84.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.I.d(l84.ON_RESUME);
        su2 su2Var = ((wt2) this.H.n).v;
        su2Var.I = false;
        su2Var.J = false;
        su2Var.P.s = false;
        su2Var.v(7);
    }

    @Override // o.my0, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.H.R();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        xk1 xk1Var = this.H;
        xk1Var.R();
        super.onResume();
        this.K = true;
        ((wt2) xk1Var.n).v.B(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        xk1 xk1Var = this.H;
        xk1Var.R();
        wt2 wt2Var = (wt2) xk1Var.n;
        super.onStart();
        this.L = false;
        if (!this.J) {
            this.J = true;
            su2 su2Var = wt2Var.v;
            su2Var.I = false;
            su2Var.J = false;
            su2Var.P.s = false;
            su2Var.v(4);
        }
        wt2Var.v.B(true);
        this.I.d(l84.ON_START);
        su2 su2Var2 = wt2Var.v;
        su2Var2.I = false;
        su2Var2.J = false;
        su2Var2.P.s = false;
        su2Var2.v(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.H.R();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.L = true;
        while (E(D())) {
        }
        su2 su2Var = ((wt2) this.H.n).v;
        su2Var.J = true;
        su2Var.P.s = true;
        su2Var.v(4);
        this.I.d(l84.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((wt2) this.H.n).v.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
