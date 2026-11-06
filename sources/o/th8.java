package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002"}, d2 = {"Lo/th8;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "", "hasInternet", "Lo/vh3;", "dialogData", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class th8 extends ut2 implements oq0, bi3, hq4 {
    public bb5 p0;
    public vh8 q0;
    public final kh7 r0 = new kh7(new ks7(this, (byte) 7));
    public boolean s0;

    public final String A0() {
        int iOrdinal = ((sf4) this.r0.getValue()).ordinal();
        if (iOrdinal == 0) {
            return "devices-tab";
        }
        if (iOrdinal == 1) {
            return "chat-tab";
        }
        if (iOrdinal == 2) {
            return "google-iap";
        }
        gk0.s();
        return null;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        layoutInflater.getClass();
        byte b = 2;
        hc1 hc1Var = null;
        if (this.p0 != null) {
            if (zu1.c == null) {
                hk0.g("Required value was null.");
                return null;
            }
            xt2 xt2VarP0 = p0();
            dl5 dl5Var = new dl5(new w26((byte) 3), (byte) 2);
            ve8 ve8VarO = xt2VarP0.getY();
            bf1 bf1VarK = h57.k(xt2VarP0);
            pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(vh8.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
            this.q0 = (vh8) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            bb5 bb5Var = this.p0;
            if (bb5Var != null) {
                bb5Var.q(gk6.n, false);
            }
            bb5 bb5Var2 = this.p0;
            if (bb5Var2 != null) {
                Bundle bundle2 = this.r;
                bb5Var2.H0(bundle2 != null ? bundle2.getBoolean("BUNDLE_KEY_SHOW_BACK_NAVIGATION") : false);
            }
            p0().v(this, L());
            int iOrdinal = ((sf4) this.r0.getValue()).ordinal();
            if (iOrdinal == 0) {
                i = R.string.toolbar_title_devices;
            } else if (iOrdinal == 1) {
                i = R.string.toolbar_title_chat;
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return null;
                }
                i = R.string.toolbar_title_purchases;
            }
            if (C() instanceof id3) {
                KeyEvent.Callback callbackC = C();
                callbackC.getClass();
                ((id3) callbackC).f(Integer.valueOf(i), false, null, false);
            }
            im3.R(us1.B(L()), null, null, new ys7((Object) this, hc1Var, (byte) 5), 3);
        }
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setContent(new yy0(-975402582, true, new sr7(this, composeView, b)));
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        Bundle bundle = this.r;
        w05 w05Var = bundle != null ? (w05) pm8.w(bundle, "navigation_category", w05.class) : null;
        if (w05Var == null) {
            return sh8.a[((sf4) this.r0.getValue()).ordinal()] == 1 ? w05.Chat : w05.Partnerlist;
        }
        return w05Var;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.p0 = bb5Var;
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.settings_button) {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(i15.t);
            Context contextE = E();
            if (it1.c != null) {
                y0(new Intent(contextE, (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.subscribe_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler2 = ga7.a;
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

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        Bundle bundle = this.r;
        boolean z = false;
        if (bundle != null ? bundle.getBoolean("BUNDLE_KEY_HIDE_OPTIONS_MENU") : false) {
            return;
        }
        menuInflater.inflate(R.menu.settings_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.subscribe_button);
        if (this.s0 && cx.h1(new sf4[]{sf4.m, sf4.n}).contains((sf4) this.r0.getValue())) {
            z = true;
        }
        menuItemFindItem.setVisible(z);
    }
}
