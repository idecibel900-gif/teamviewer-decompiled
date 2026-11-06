package o;

import android.os.SystemClock;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class f41 {
    public final ja3 a;
    public final nc0 b;
    public long c;

    public f41(ja3 ja3Var, nc0 nc0Var) {
        nc0Var.getClass();
        this.a = ja3Var;
        this.b = nc0Var;
    }

    public static /* synthetic */ void b(f41 f41Var, String str, hs1 hs1Var, boolean z, n21 n21Var, t93 t93Var, int i) {
        if ((i & 8) != 0) {
            n21Var = null;
        }
        f41Var.a(str, hs1Var, z, n21Var, null, (i & 32) != 0 ? null : t93Var);
    }

    public static /* synthetic */ void e(f41 f41Var, String str, hs1 hs1Var, boolean z, n21 n21Var, t93 t93Var, int i) {
        if ((i & 8) != 0) {
            n21Var = null;
        }
        f41Var.d(str, hs1Var, z, n21Var, null, (i & 32) != 0 ? null : t93Var);
    }

    public final void a(String str, hs1 hs1Var, boolean z, Function0 function0, vl6 vl6Var, t93 t93Var) {
        str.getClass();
        String string = ub7.x0(str).toString();
        if (c(string, function0, vl6Var)) {
            if (!z || t93Var == null) {
                String strB = ((l41) this.a).b(string);
                if (hs1Var == hs1.n) {
                    ck3.Q(string, strB);
                    return;
                } else {
                    ck3.Q(string, strB);
                    return;
                }
            }
            Long lP = bc7.P(string);
            if (lP == null) {
                ye4.a.g("ConnectionCoordinatorImpl", "Invalid contactId: ".concat(string));
            } else {
                long jLongValue = lP.longValue();
                this.b.getClass();
                nc0.a(jLongValue, t93Var);
            }
        }
    }

    public final boolean c(String str, Function0 function0, Function0 function1) {
        int length = str.length();
        ye4 ye4Var = ye4.a;
        if (length == 0) {
            ye4Var.g("ConnectionCoordinatorImpl", "connectId is empty – aborting");
            return false;
        }
        if (ep1.v(str) || l25.b()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime <= this.c + 1000) {
                ye4Var.g("ConnectionCoordinatorImpl", "FloodPrevention: Skipped submit(). Please wait 1000ms between connection attempts");
                return false;
            }
            this.c = jElapsedRealtime;
            if (BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() || ep1.v(str) || ub7.Q(str, ":", false)) {
                return true;
            }
            if (function1 != null) {
                function1.a();
            }
        } else if (function0 != null) {
            function0.a();
            return false;
        }
        return false;
    }

    public final void d(String str, hs1 hs1Var, boolean z, Function0 function0, vl6 vl6Var, t93 t93Var) {
        str.getClass();
        String string = ub7.x0(str).toString();
        if (c(string, function0, vl6Var)) {
            ye4 ye4Var = ye4.a;
            if (z && t93Var != null) {
                Long lP = bc7.P(string);
                if (lP == null) {
                    ye4Var.g("ConnectionCoordinatorImpl", "Invalid contactId: ".concat(string));
                    return;
                }
                long jLongValue = lP.longValue();
                nc0 nc0Var = this.b;
                nc0Var.getClass();
                nc0Var.e(jLongValue, false, t93Var);
                return;
            }
            hs1 hs1Var2 = hs1.n;
            ja3 ja3Var = this.a;
            if (hs1Var != hs1Var2) {
                ck3.h0(string, ((l41) ja3Var).b(string));
                return;
            }
            DyngateID dyngateIDZ = ep1.z(string);
            if (dyngateIDZ.IsValid()) {
                ck3.j0(dyngateIDZ, ja3Var);
            } else {
                ye4Var.g("ConnectionCoordinatorImpl", "Invalid TV ID for EA: ".concat(string));
            }
        }
    }
}
