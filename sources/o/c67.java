package o;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lo/c67;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "Lo/j67;", "solutionsScreenState", "", "hasInternet", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c67 extends ut2 implements oq0, bi3, hq4 {
    public e67 p0;
    public bb5 q0;
    public boolean r0;

    public final void A0(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        f67 f67Var;
        hc1 hc1Var;
        ux2Var.Y(1405642929);
        int i2 = i | 6 | (ux2Var.h(this) ? 32 : 16);
        byte b = 0;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = new q37();
                ux2Var.g0(objK2);
            }
            q37 q37Var = (q37) objK2;
            Object obj2 = (au0) ux2Var.j(b11.f);
            a06 a06VarD0 = ds1.d0((Configuration) ux2Var.j(lh.a), vn4.Y(p0(), ux2Var), new l51(p0()), ux2Var);
            e67 e67Var = this.p0;
            if (e67Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            px4 px4VarG = g57.g(e67Var.u, ux2Var);
            Object obj3 = this.p0;
            if (obj3 == null) {
                im3.e0("viewModel");
                throw null;
            }
            boolean zH = ux2Var.h(obj3);
            Object objK3 = ux2Var.K();
            if (zH || objK3 == obj) {
                objK3 = new nu6(1, obj3, e67.class, "getMainIntentUrl", "getMainIntentUrl(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 7);
                ux2Var.g0(objK3);
            }
            pu3 pu3Var = (pu3) objK3;
            Object obj4 = this.p0;
            if (obj4 == null) {
                im3.e0("viewModel");
                throw null;
            }
            boolean zH2 = ux2Var.h(obj4);
            Object objK4 = ux2Var.K();
            if (zH2 || objK4 == obj) {
                objK4 = new nu6(1, obj4, e67.class, "getFallbackIntentUrl", "getFallbackIntentUrl(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 8);
                ux2Var.g0(objK4);
            }
            pu3 pu3Var2 = (pu3) objK4;
            Object obj5 = this.p0;
            if (obj5 == null) {
                im3.e0("viewModel");
                throw null;
            }
            boolean zH3 = ux2Var.h(obj5);
            Object objK5 = ux2Var.K();
            if (zH3 || objK5 == obj) {
                objK5 = new mr6(0, obj5, e67.class, "onNoBrowserAvailable", "onNoBrowserAvailable()V", 0, (byte) 16);
                ux2Var.g0(objK5);
            }
            pu3 pu3Var3 = (pu3) objK5;
            Object obj6 = this.p0;
            if (obj6 == null) {
                im3.e0("viewModel");
                throw null;
            }
            boolean zH4 = ux2Var.h(obj6);
            Object objK6 = ux2Var.K();
            if (zH4 || objK6 == obj) {
                objK6 = new nu6(1, obj6, e67.class, "reportEvent", "reportEvent(Ljava/lang/String;)V", 0, (byte) 9);
                ux2Var.g0(objK6);
            }
            f67 f67Var2 = new f67((Function0) pu3Var3, (Function1) ((pu3) objK6), (Function1) pu3Var, (Function1) pu3Var2);
            px4 px4VarG2 = g57.g(a06VarD0.f, ux2Var);
            Boolean bool = (Boolean) px4VarG2.getValue();
            bool.getClass();
            boolean zF = ux2Var.f(px4VarG2) | ux2Var.h(this) | ux2Var.f(a06VarD0);
            Object objK7 = ux2Var.K();
            if (zF || objK7 == obj) {
                f67Var = f67Var2;
                hc1Var = null;
                Object k9Var = new k9(this, a06VarD0, px4VarG2, hc1Var, (byte) 10);
                ux2Var.g0(k9Var);
                objK7 = k9Var;
            } else {
                f67Var = f67Var2;
                hc1Var = null;
            }
            ck3.i(bool, (hw2) objK7, ux2Var);
            Object obj7 = (LifecycleOwner) ux2Var.j(dd4.a);
            boolean zH5 = ux2Var.h(this) | ux2Var.f(a06VarD0) | ux2Var.h(obj7);
            Object objK8 = ux2Var.K();
            if (zH5 || objK8 == obj) {
                objK8 = new xn5(obj7, this, a06VarD0, (byte) 4);
                ux2Var.g0(objK8);
            }
            ck3.e(obj7, (Function1) objK8, ux2Var);
            boolean zH6 = ux2Var.h(me1Var);
            Object objK9 = ux2Var.K();
            if (zH6 || objK9 == obj) {
                objK9 = new a67(q37Var, me1Var, b);
                ux2Var.g0(objK9);
            }
            Object obj8 = (Function1) objK9;
            Object objK10 = ux2Var.K();
            if (objK10 == obj) {
                objK10 = new t21(q37Var, (byte) 5);
                ux2Var.g0(objK10);
            }
            Function0 function0 = (Function0) objK10;
            String strI = I(R.string.no_browser_snackbar_text);
            strI.getClass();
            String strI2 = I(R.string.no_browser_snackbar_button);
            strI2.getClass();
            boolean zH7 = ux2Var.h(obj2) | ux2Var.f(px4VarG);
            Object objK11 = ux2Var.K();
            if (zH7 || objK11 == obj) {
                objK11 = new b67(obj2, function0, px4VarG, b);
                ux2Var.g0(objK11);
            }
            Object ul7Var = new ul7(sl7.n, strI, g37.m, I(R.string.dismiss), new nl7(strI2, (Function0) objK11), null, 200);
            boolean zH8 = ux2Var.h(this) | ux2Var.f(obj8) | ux2Var.f(ul7Var);
            Object objK12 = ux2Var.K();
            if (zH8 || objK12 == obj) {
                Object s11Var = new s11((Object) this, obj8, ul7Var, hc1Var, (byte) 4);
                ux2Var.g0(s11Var);
                objK12 = s11Var;
            }
            ck3.i(f88.a, (hw2) objK12, ux2Var);
            ut7.a(au8.O(1176260945, new f9(q37Var, f67Var, px4VarG), ux2Var), ux2Var, 48);
            fs4Var2 = cs4.b;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 22, i, this, fs4Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        KeyEvent.Callback callbackC = C();
        jd3 jd3Var = callbackC instanceof jd3 ? (jd3) callbackC : null;
        if (jd3Var != null) {
            ((MainActivity) jd3Var).f0();
        }
        bb5 bb5Var = this.q0;
        if (bb5Var != null) {
            bb5Var.H0(false);
        }
        bb5 bb5Var2 = this.q0;
        if (bb5Var2 != null) {
            bb5Var2.q(gk6.n, false);
        }
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new w26((byte) 0), (byte) 2);
        ve8 ve8VarO = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(e67.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.p0 = (e67) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        p0().v(this, L());
        e67 e67Var = this.p0;
        if (e67Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        e67Var.q.observe(L(), new a7(new y46((Object) this, (byte) 24), (byte) 11));
        xt2 xt2VarC = C();
        if (xt2VarC != 0) {
            if (xt2VarC instanceof id3) {
                ((id3) xt2VarC).f(null, false, null, (15 & 8) == 0);
            }
            xt2VarC.setTitle(R.string.tv_navigation_apps);
        }
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setContent(new yy0(977848473, true, new gg4(this, (byte) 20)));
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Solutions;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.q0 = bb5Var;
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.d(this);
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.solutions_fragment_settings_button) {
            if (it1.c != null) {
                y0(new Intent(E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.solutions_fragment_subscribe_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler = ga7.a;
        ga7.a(fg3.p);
        int i = InAppPurchaseActivity.S;
        Intent intentJ = ct1.J(C());
        if (intentJ != null) {
            KeyEvent.Callback callbackC = C();
            bb3 bb3Var = callbackC instanceof bb3 ? (bb3) callbackC : null;
            if (bb3Var != null) {
                bb3Var.i(intentJ);
            }
        }
        return true;
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.e(this);
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.solutions_fragment_menu, menu);
        menu.findItem(R.id.solutions_fragment_subscribe_button).setVisible(this.r0);
    }
}
