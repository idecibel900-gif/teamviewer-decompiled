package o;

import android.os.Bundle;
import android.os.Handler;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class j20 extends m6 implements xc3 {
    public oq0 N;
    public u05 O;
    public bb5 P;

    public static void L(bb5 bb5Var, w10 w10Var) {
        if (bb5Var != null) {
            su2 su2Var = bb5Var.F;
            if (su2Var == null || su2Var == w10Var.r) {
                w10Var.b(new ev2(6, bb5Var));
                return;
            }
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + bb5Var.toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // o.xt2
    public final void F(ut2 ut2Var) {
        bb5 bb5Var = !(ut2Var instanceof bb5) ? null : (bb5) ut2Var;
        if (bb5Var != null) {
            bb5Var.t0 = this;
        }
    }

    public bb5 M(Enum r1) {
        w05 w05Var = (w05) r1;
        w05Var.getClass();
        int iOrdinal = w05Var.ordinal();
        if (iOrdinal == 0) {
            return new z21();
        }
        if (iOrdinal == 1) {
            return new rc0(0);
        }
        if (iOrdinal == 2) {
            return new pp0();
        }
        if (iOrdinal == 3) {
            return new d67();
        }
        gk0.s();
        return null;
    }

    public j16 N() {
        return new j16();
    }

    public final bb5 O(Enum r2) {
        ut2 ut2VarF = D().F(r2.name());
        if (ut2VarF == null || !(ut2VarF instanceof bb5)) {
            return null;
        }
        bb5 bb5Var = (bb5) ut2VarF;
        if (bb5Var.a().equals(r2)) {
            return bb5Var;
        }
        return null;
    }

    public final void P(Bundle bundle) {
        u05 u05Var = null;
        if (bundle == null || !bundle.getBoolean("change")) {
            j16 j16VarN = N();
            w10 w10Var = new w10(D());
            w10Var.k(R.id.navigation_container, j16VarN, null);
            if (w10Var.g) {
                hk0.l("This transaction is already being added to the back stack");
                return;
            } else {
                w10Var.h = false;
                w10Var.r.C(w10Var, false);
                u05Var = j16VarN;
            }
        } else {
            ut2 ut2VarE = D().E(R.id.navigation_container);
            if (ut2VarE instanceof u05) {
                u05Var = (u05) ut2VarE;
            }
        }
        this.O = u05Var;
    }

    public boolean Q(Enum r7, i20 i20Var) {
        r7.getClass();
        bb5 bb5Var = this.P;
        if (bb5Var == null) {
            ut2 ut2VarE = D().E(R.id.main);
            bb5Var = (ut2VarE == null || !(ut2VarE instanceof bb5)) ? null : (bb5) ut2VarE;
        }
        if (bb5Var != null) {
            boolean zEquals = bb5Var.a().equals(r7);
            boolean z = i20Var != null;
            if (zEquals && !z) {
                ye4.a("BackstackV3Activity", "ignoring replaceFragmentContainer because Container is already shown");
                return true;
            }
        }
        if (r7 == w05.Connect) {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(i15.p);
        } else if (r7 == w05.Partnerlist) {
            IStatisticsHandler iStatisticsHandler2 = ga7.a;
            ga7.a(i15.q);
        } else if (r7 == w05.Chat) {
            IStatisticsHandler iStatisticsHandler3 = ga7.a;
            ga7.a(i15.r);
        } else if (r7 == w05.Solutions) {
            IStatisticsHandler iStatisticsHandler4 = ga7.a;
            ga7.a(i15.s);
        }
        try {
            w10 w10Var = new w10(D());
            L(bb5Var, w10Var);
            bb5 bb5VarO = O(r7);
            if (bb5VarO == null) {
                bb5VarO = M(r7);
                w10Var.h(R.id.main, bb5VarO, r7.name(), 1);
            } else {
                w10Var.b(new ev2(7, bb5VarO));
            }
            if (i20Var != null) {
                i20Var.j(r7, bb5VarO);
            }
            w10Var.f();
            this.P = bb5VarO;
            u05 u05Var = this.O;
            if (u05Var != null) {
                u05Var.A0(bb5VarO.a());
            }
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void R(oq0 oq0Var) {
        oq0Var.getClass();
        if (Q(oq0Var.a(), null)) {
            new Handler(getMainLooper()).post(new h20(this, oq0Var, (byte) 1));
        } else {
            this.N = oq0Var;
        }
    }

    @Override // o.xr, o.xt2, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.O = null;
    }

    @Override // o.ei7, o.xr, o.xt2, android.app.Activity
    public void onStart() {
        super.onStart();
        oq0 oq0Var = this.N;
        if (oq0Var != null) {
            this.N = null;
            new Handler(getMainLooper()).post(new h20(this, oq0Var, (byte) 0));
        }
    }
}
