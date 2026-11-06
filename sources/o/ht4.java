package o;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ht4;", "Lo/zb0;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ht4 extends zb0 implements hq4 {
    public static final /* synthetic */ int u0 = 0;
    public tb3 s0;
    public vu2 t0;

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        nw4 nw4Var;
        Long l;
        nw4 nw4Var2;
        Long l2;
        tb3 tb3Var = this.s0;
        long jLongValue = 0;
        long jLongValue2 = (tb3Var == null || (nw4Var2 = ((it4) tb3Var).p) == null || (l2 = (Long) nw4Var2.getValue()) == null) ? 0L : l2.longValue();
        tb3 tb3Var2 = this.s0;
        if (tb3Var2 != null && (nw4Var = ((it4) tb3Var2).f1100o) != null && (l = (Long) nw4Var.getValue()) != null) {
            jLongValue = l.longValue();
        }
        String strJ = J(R.string.tv_endpoints_in_use, Long.valueOf(jLongValue2), Long.valueOf(jLongValue));
        strJ.getClass();
        SpannableString spannableString = new SpannableString(strJ);
        e96 e96Var = new e96("[0-9]+");
        Resources resourcesH = H();
        ThreadLocal threadLocal = ic6.a;
        int color = resourcesH.getColor(R.color.tv_black_high_emphasis, null);
        for (yk3 yk3Var : bq6.l0(new h18(e96.a(e96Var, strJ), new at4((byte) 2)))) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
            int i = yk3Var.m;
            int i2 = yk3Var.n + 1;
            spannableString.setSpan(foregroundColorSpan, i, i2, 34);
            spannableString.setSpan(new StyleSpan(1), yk3Var.m, i2, 33);
        }
        vu2 vu2Var = this.t0;
        if (vu2Var != null) {
            vu2Var.a.setText(spannableString);
        }
    }

    public final View I0(int i) {
        String string;
        LayoutInflater layoutInflaterD0 = this.Z;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Z = layoutInflaterD0;
        }
        View viewInflate = layoutInflaterD0.inflate(R.layout.alert_tab_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.alert_tab_textview);
        if (i == 0) {
            string = H().getString(R.string.tv_alarm_filter_all);
            string.getClass();
        } else if (i == 1) {
            string = H().getString(R.string.tv_alarm_filter_failed);
            string.getClass();
        } else if (i != 2) {
            string = "";
        } else {
            string = H().getString(R.string.tv_alarm_filter_acknowledged);
            string.getClass();
        }
        textView.setText(string);
        return viewInflate;
    }

    public final void J0(dd ddVar) {
        dt4 dt4Var = new dt4();
        Bundle bundle = new Bundle();
        bundle.putSerializable("AlarmFilter", ddVar);
        dt4Var.u0(bundle);
        dt4Var.p0 = F0();
        su2 su2VarD = D();
        su2VarD.getClass();
        w10 w10Var = new w10(su2VarD);
        w10Var.k(R.id.alerts_container, dt4Var, null);
        w10Var.f();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0119 A[PHI: r10
      0x0119: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:30:0x00d6, B:32:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        layoutInflater.getClass();
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new w26((byte) 2), (byte) 2);
        ve8 ve8VarO = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(it4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.s0 = (tb3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            xt2VarC.setTitle(R.string.tv_toolbar_monitoring_title);
        }
        p0().v(this, L());
        tb3 tb3Var = this.s0;
        byte b = 20;
        final byte b2 = 0;
        if (tb3Var != null && (nw4Var2 = ((it4) tb3Var).f1100o) != null) {
            nw4Var2.observe(L(), new b7(new Function1(this) { // from class: o.gt4
                public final /* synthetic */ ht4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    f88 f88Var = f88.a;
                    ht4 ht4Var = this.n;
                    int i = ht4.u0;
                    switch (b3) {
                        case 0:
                            ht4Var.H0();
                            break;
                        default:
                            ht4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, b));
        }
        tb3 tb3Var2 = this.s0;
        final byte b3 = 1;
        if (tb3Var2 != null && (nw4Var = ((it4) tb3Var2).p) != null) {
            nw4Var.observe(L(), new b7(new Function1(this) { // from class: o.gt4
                public final /* synthetic */ ht4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    ht4 ht4Var = this.n;
                    int i = ht4.u0;
                    switch (b4) {
                        case 0:
                            ht4Var.H0();
                            break;
                        default:
                            ht4Var.H0();
                            break;
                    }
                    return f88Var;
                }
            }, b));
        }
        int i = R.id.alerts_overview_container;
        if (bundle == null) {
            if (D().E(R.id.alerts_overview_container) == null) {
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                zs4 zs4Var = new zs4();
                su2 su2VarD = D();
                su2VarD.getClass();
                w10 w10Var = new w10(su2VarD);
                w10Var.h(R.id.alerts_overview_container, zs4Var, null, 1);
                w10Var.f();
            }
            J0(dd.m);
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_monitoring_overview, viewGroup, false);
        int i2 = R.id.alert_tabs;
        if (((TabLayout) r47.s(viewInflate, R.id.alert_tabs)) != null) {
            i2 = R.id.alerts_container;
            if (((FrameLayout) r47.s(viewInflate, R.id.alerts_container)) == null) {
                i = i2;
            } else if (((FrameLayout) r47.s(viewInflate, R.id.alerts_overview_container)) != null) {
                i = R.id.computers_in_use;
                TextView textView = (TextView) r47.s(viewInflate, R.id.computers_in_use);
                if (textView != null) {
                    i = R.id.device_avatar_image;
                    if (((ImageView) r47.s(viewInflate, R.id.device_avatar_image)) != null) {
                        i = R.id.monitoring_overview_recheckAllAlerts;
                        if (((SwipeRefreshLayout) r47.s(viewInflate, R.id.monitoring_overview_recheckAllAlerts)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            this.t0 = new vu2(frameLayout, textView);
                            frameLayout.getClass();
                            return frameLayout;
                        }
                    }
                }
            }
        } else {
            i = i2;
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        ut2 ut2VarE = D().E(R.id.alerts_container);
        if ((ut2VarE instanceof h1 ? (h1) ut2VarE : null) != null) {
            h1 h1Var = (h1) ut2VarE;
            bb5 bb5VarF0 = F0();
            h1Var.getClass();
            h1Var.p0 = bb5VarF0;
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.alert_settings_button) {
            if (it1.c != null) {
                y0(new Intent(E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.alert_help_button) {
            return false;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.H0 = R.string.tv_monitoring_overview_dialog_body;
        gk7Var.F0 = R.string.tv_alerts_dialog_title;
        gk7Var.O0 = R.string.tv_ok;
        gk7.O0(gk7Var, C());
        return true;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        H0();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.monitoring_overview_recheckAllAlerts);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new io.sentry.q7(this, swipeRefreshLayout, (byte) 22));
        }
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.alert_tabs);
        tm7 tm7VarG = tabLayout.g();
        tm7VarG.b = I0(0);
        tm7VarG.b();
        tabLayout.a(tm7VarG, 0);
        tm7 tm7VarG2 = tabLayout.g();
        tm7VarG2.b = I0(1);
        tm7VarG2.b();
        tabLayout.a(tm7VarG2, 1);
        tm7 tm7VarG3 = tabLayout.g();
        tm7VarG3.b = I0(2);
        tm7VarG3.b();
        tabLayout.a(tm7VarG3, 2);
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            tm7 tm7VarF = tabLayout.f(i);
            View view2 = tm7VarF != null ? tm7VarF.b : null;
            TextView textView = view2 != null ? (TextView) view2.findViewById(R.id.alert_tab_textview) : null;
            if (textView != null) {
                textView.post(new fr1(textView, this, (byte) 1));
            }
        }
        gr1 gr1Var = new gr1(this, (byte) 1);
        ArrayList arrayList = tabLayout.R;
        if (!arrayList.contains(gr1Var)) {
            arrayList.add(gr1Var);
        }
        tb3 tb3Var = this.s0;
        tm7 tm7VarF2 = tabLayout.f(tb3Var != null ? ((it4) tb3Var).q : 0);
        if (tm7VarF2 != null) {
            tm7VarF2.a();
        }
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.monitoring_overview_menu, menu);
    }
}
