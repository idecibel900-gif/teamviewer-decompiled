package o;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Observer;
import com.google.android.material.button.MaterialButton;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/mr1;", "Lo/h1;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mr1 extends h1<w05> {
    public long q0;
    public sa3 r0;
    public TextView s0;
    public TextView t0;
    public TextView u0;

    public final void A0(int i, String str, TextView textView) {
        SpannableString spannableString = new SpannableString(str);
        int length = String.valueOf(i).length();
        Resources resourcesH = H();
        ThreadLocal threadLocal = ic6.a;
        spannableString.setSpan(new ForegroundColorSpan(resourcesH.getColor(R.color.tv_black_high_emphasis, null)), 0, length, 34);
        spannableString.setSpan(new StyleSpan(1), 0, length, 33);
        if (textView != null) {
            textView.setText(spannableString);
        }
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("BuddyId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            jLongValue = bundle2 != null ? bundle2.getLong("BuddyId") : 0L;
        }
        this.q0 = jLongValue;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_alarms_sums, viewGroup, false);
        this.s0 = (TextView) viewInflate.findViewById(R.id.alarmsText);
        this.t0 = (TextView) viewInflate.findViewById(R.id.needsAttentionText);
        this.u0 = (TextView) viewInflate.findViewById(R.id.totalAlarmsText);
        MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.device_information_button);
        View viewFindViewById = viewInflate.findViewById(R.id.alarmsStatusIcon);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(R.id.needsAttentionStatusIcon);
        viewFindViewById2.getClass();
        ((AppCompatImageView) viewFindViewById).setImageResource(R.drawable.unacknownledged_alert_icon);
        ((AppCompatImageView) viewFindViewById2).setImageResource(R.drawable.acknownledged_alert_icon);
        if (ds1.h(new PListComputerID(this.q0)) == null) {
            return viewInflate;
        }
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        final byte b2 = 2;
        dl5 dl5Var = new dl5(new x26(this.q0, (byte) 3), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(or1.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        sa3 sa3Var = (sa3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.r0 = sa3Var;
        Observer observer = new Observer(this) { // from class: o.lr1
            public final /* synthetic */ mr1 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                byte b3 = b;
                mr1 mr1Var = this.n;
                Integer num = (Integer) obj;
                switch (b3) {
                    case 0:
                        int iIntValue = num.intValue();
                        String string = mr1Var.H().getString(R.string.tv_alertsOverviewNeedAttention, num);
                        string.getClass();
                        mr1Var.A0(iIntValue, string, mr1Var.t0);
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        String string2 = mr1Var.H().getString(R.string.tv_alertsOverviewAlarms, num);
                        string2.getClass();
                        mr1Var.A0(iIntValue2, string2, mr1Var.s0);
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        String string3 = mr1Var.H().getString(R.string.tv_alertsOverviewTotalAlarms, num);
                        string3.getClass();
                        mr1Var.A0(iIntValue3, string3, mr1Var.u0);
                        break;
                }
            }
        };
        final byte b3 = 1;
        Observer observer2 = new Observer(this) { // from class: o.lr1
            public final /* synthetic */ mr1 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                byte b4 = b3;
                mr1 mr1Var = this.n;
                Integer num = (Integer) obj;
                switch (b4) {
                    case 0:
                        int iIntValue = num.intValue();
                        String string = mr1Var.H().getString(R.string.tv_alertsOverviewNeedAttention, num);
                        string.getClass();
                        mr1Var.A0(iIntValue, string, mr1Var.t0);
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        String string2 = mr1Var.H().getString(R.string.tv_alertsOverviewAlarms, num);
                        string2.getClass();
                        mr1Var.A0(iIntValue2, string2, mr1Var.s0);
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        String string3 = mr1Var.H().getString(R.string.tv_alertsOverviewTotalAlarms, num);
                        string3.getClass();
                        mr1Var.A0(iIntValue3, string3, mr1Var.u0);
                        break;
                }
            }
        };
        Observer observer3 = new Observer(this) { // from class: o.lr1
            public final /* synthetic */ mr1 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                byte b4 = b2;
                mr1 mr1Var = this.n;
                Integer num = (Integer) obj;
                switch (b4) {
                    case 0:
                        int iIntValue = num.intValue();
                        String string = mr1Var.H().getString(R.string.tv_alertsOverviewNeedAttention, num);
                        string.getClass();
                        mr1Var.A0(iIntValue, string, mr1Var.t0);
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        String string2 = mr1Var.H().getString(R.string.tv_alertsOverviewAlarms, num);
                        string2.getClass();
                        mr1Var.A0(iIntValue2, string2, mr1Var.s0);
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        String string3 = mr1Var.H().getString(R.string.tv_alertsOverviewTotalAlarms, num);
                        string3.getClass();
                        mr1Var.A0(iIntValue3, string3, mr1Var.u0);
                        break;
                }
            }
        };
        o oVar = new o(this, materialButton, (byte) 1);
        ((or1) sa3Var).q.observe(L(), observer);
        sa3 sa3Var2 = this.r0;
        if (sa3Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        ((or1) sa3Var2).r.observe(L(), observer2);
        sa3 sa3Var3 = this.r0;
        if (sa3Var3 == null) {
            im3.e0("viewModel");
            throw null;
        }
        ((or1) sa3Var3).s.observe(L(), observer3);
        sa3 sa3Var4 = this.r0;
        if (sa3Var4 != null) {
            ((or1) sa3Var4).t.observe(L(), oVar);
            return viewInflate;
        }
        im3.e0("viewModel");
        throw null;
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putLong("BuddyId", this.q0);
    }
}
