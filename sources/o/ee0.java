package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/ee0;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ee0 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int t0 = 0;
    public y93 s0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return false;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistoffline, viewGroup, false);
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.n, false);
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new a26((Object) c36Var, (Object) this, (byte) 3), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(fe0.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.s0 = (y93) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        TextView textView = (TextView) viewInflate.findViewById(R.id.buddy_list_offline_header);
        y93 y93Var = this.s0;
        if (y93Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        String string = ((fe0) y93Var).f787o.getString(R.string.buddy_list_offline_header);
        string.getClass();
        textView.setText(string);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.buddy_list_offline_explanation);
        y93 y93Var2 = this.s0;
        if (y93Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        String string2 = ((fe0) y93Var2).f787o.getString(R.string.buddy_list_offline_progress_explanation);
        string2.getClass();
        textView2.setText(string2);
        y93 y93Var3 = this.s0;
        if (y93Var3 == null) {
            im3.e0("viewModel");
            throw null;
        }
        byte b2 = 7;
        final byte b3 = 1;
        ((ComposeView) viewInflate.findViewById(R.id.buddy_list_connecting_container)).setContent(new yy0(-1058143573, true, new t0((Boolean) ((fe0) y93Var3).p.getValue(), b2)));
        y93 y93Var4 = this.s0;
        if (y93Var4 == null) {
            im3.e0("viewModel");
            throw null;
        }
        Boolean bool = (Boolean) ((fe0) y93Var4).p.getValue();
        View viewFindViewById = viewInflate.findViewById(R.id.buddy_list_offline_container);
        int i = 8;
        if (bool != null && bool.booleanValue()) {
            i = 0;
        }
        viewFindViewById.setVisibility(i);
        y93 y93Var5 = this.s0;
        if (y93Var5 == null) {
            im3.e0("viewModel");
            throw null;
        }
        ((fe0) y93Var5).p.observe(L(), new b7(new Function1(this) { // from class: o.de0
            public final /* synthetic */ ee0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                f88 f88Var = f88.a;
                ee0 ee0Var = this.n;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                switch (b4) {
                    case 0:
                        int i2 = ee0.t0;
                        View view = ee0Var.U;
                        if (view != null) {
                            view.findViewById(R.id.buddy_list_connecting_container).setVisibility(bool2.booleanValue() ? 0 : 8);
                        }
                        break;
                    default:
                        int i3 = ee0.t0;
                        View view2 = ee0Var.U;
                        if (view2 != null) {
                            view2.findViewById(R.id.buddy_list_offline_container).setVisibility(bool2.booleanValue() ? 0 : 8);
                        }
                        break;
                }
                return f88Var;
            }
        }, b2));
        y93 y93Var6 = this.s0;
        if (y93Var6 == null) {
            im3.e0("viewModel");
            throw null;
        }
        ((fe0) y93Var6).q.observe(L(), new b7(new Function1(this) { // from class: o.de0
            public final /* synthetic */ ee0 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                f88 f88Var = f88.a;
                ee0 ee0Var = this.n;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                switch (b4) {
                    case 0:
                        int i2 = ee0.t0;
                        View view = ee0Var.U;
                        if (view != null) {
                            view.findViewById(R.id.buddy_list_connecting_container).setVisibility(bool2.booleanValue() ? 0 : 8);
                        }
                        break;
                    default:
                        int i3 = ee0.t0;
                        View view2 = ee0Var.U;
                        if (view2 != null) {
                            view2.findViewById(R.id.buddy_list_offline_container).setVisibility(bool2.booleanValue() ? 0 : 8);
                        }
                        break;
                }
                return f88Var;
            }
        }, b2));
        p0().v(this, L());
        return viewInflate;
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.buddylist_offline_settings_button) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        menuInflater.inflate(R.menu.buddylist_offline_menu, menu);
    }
}
