package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hr2 implements l92, i20, jk4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hr2 f1001o;
    public static final hr2 p;
    public static final hr2 q;
    public static final hr2 r;
    public static final hr2 s;
    public static final hr2 t;
    public static final hr2 u;
    public static final hr2 v;
    public final /* synthetic */ byte m;
    public String n;

    static {
        byte b = 0;
        f1001o = new hr2("NONE", b);
        p = new hr2("FULL", b);
        byte b2 = 1;
        q = new hr2("VERTICAL", b2);
        r = new hr2("HORIZONTAL", b2);
        byte b3 = 2;
        s = new hr2("FLAT", b3);
        t = new hr2("HALF_OPENED", b3);
        byte b4 = 3;
        u = new hr2("FOLD", b4);
        v = new hr2("HINGE", b4);
    }

    public hr2(String str) {
        this.m = (byte) 15;
        this.n = fx3.d(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                io.sentry.android.core.v0.d("PlayCore", "Unable to format ".concat(str2), e);
                str2 = to7.k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return fx3.g(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.n, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            io.sentry.android.core.v0.j("PlayCore", c(this.n, str, objArr));
        }
    }

    @Override // o.l92
    public boolean g(CharSequence charSequence, int i, int i2, z58 z58Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.n)) {
            return true;
        }
        z58Var.c = (z58Var.c & 3) | 4;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i20
    public void j(Enum r2, bb5 bb5Var) {
        String str;
        if (w05.Chat == ((w05) r2) && (bb5Var instanceof ca3) && (str = this.n) != null) {
            ((ca3) bb5Var).i(str);
        }
    }

    @Override // o.l92
    public Object k() {
        return this;
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        switch (this.m) {
            case 8:
                if (ob3Var != null) {
                    MainActivity mainActivity = (MainActivity) ob3Var;
                    gk7 gk7VarT = MainActivity.T(this.n);
                    xk1 xk1Var = ct1.a;
                    gk7VarT.O0 = R.string.cb_upgrade_plan_button_label;
                    if (xk1Var != null) {
                        xk1.M(mainActivity.q0, new r02(gk7VarT, p02.Negative));
                    }
                    gk7VarT.S0 = R.string.cb_more_info_button_label;
                    if (xk1Var != null) {
                        xk1.M(mainActivity.l0, new r02(gk7VarT, p02.Neutral));
                    }
                    gk7.O0(gk7VarT, mainActivity);
                }
                break;
            case ep1.b /* 9 */:
                if (ob3Var != null) {
                    MainActivity mainActivity2 = (MainActivity) ob3Var;
                    gk7 gk7VarT2 = MainActivity.T(this.n);
                    xk1 xk1Var2 = ct1.a;
                    gk7VarT2.O0 = R.string.cb_upgrade_plan_button_label;
                    if (xk1Var2 != null) {
                        xk1.M(mainActivity2.q0, new r02(gk7VarT2, p02.Negative));
                    }
                    gk7VarT2.S0 = R.string.cb_more_info_button_label;
                    if (xk1Var2 != null) {
                        xk1.M(mainActivity2.n0, new r02(gk7VarT2, p02.Neutral));
                    }
                    gk7.O0(gk7VarT2, mainActivity2);
                }
                break;
            default:
                if (ob3Var != null) {
                    MainActivity mainActivity3 = (MainActivity) ob3Var;
                    gk7 gk7VarT3 = MainActivity.T(this.n);
                    xk1 xk1Var3 = ct1.a;
                    gk7VarT3.O0 = R.string.cb_upgrade_plan_button_label;
                    if (xk1Var3 != null) {
                        xk1.M(mainActivity3.q0, new r02(gk7VarT3, p02.Negative));
                    }
                    gk7VarT3.S0 = R.string.cb_more_info_button_label;
                    if (xk1Var3 != null) {
                        xk1.M(mainActivity3.m0, new r02(gk7VarT3, p02.Neutral));
                    }
                    gk7.O0(gk7VarT3, mainActivity3);
                }
                break;
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return this.n;
            case 1:
                return this.n;
            case 2:
                return this.n;
            case 3:
                return this.n;
            case 11:
                return this.n;
            case 14:
                return "<" + this.n + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hr2(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    public /* synthetic */ hr2(byte b) {
        this.m = b;
    }
}
