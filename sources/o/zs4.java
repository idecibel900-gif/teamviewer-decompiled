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
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/zs4;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zs4 extends ut2 {
    public sb3 p0;
    public TextView q0;
    public TextView r0;

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
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_monitored_devices_alarms_sums, viewGroup, false);
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new x85((byte) 29), (byte) 2);
        ve8 g0 = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(vs4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.p0 = (sb3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.q0 = (TextView) viewInflate.findViewById(R.id.alarmsText);
        this.r0 = (TextView) viewInflate.findViewById(R.id.needsAttentionText);
        View viewFindViewById = viewInflate.findViewById(R.id.alarmsStatusIcon);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(R.id.needsAttentionStatusIcon);
        viewFindViewById2.getClass();
        ((AppCompatImageView) viewFindViewById).setImageResource(R.drawable.unacknownledged_alert_icon);
        ((AppCompatImageView) viewFindViewById2).setImageResource(R.drawable.acknownledged_alert_icon);
        Observer observer = new Observer(this) { // from class: o.ys4
            public final /* synthetic */ zs4 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                byte b2 = b;
                zs4 zs4Var = this.n;
                Integer num = (Integer) obj;
                switch (b2) {
                    case 0:
                        int iIntValue = num.intValue();
                        String string = zs4Var.H().getString(R.string.tv_alertsOverviewNeedAttention, num);
                        string.getClass();
                        zs4Var.A0(iIntValue, string, zs4Var.r0);
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        String string2 = zs4Var.H().getString(R.string.tv_alertsOverviewAlarms, num);
                        string2.getClass();
                        zs4Var.A0(iIntValue2, string2, zs4Var.q0);
                        break;
                }
            }
        };
        final byte b2 = 1;
        Observer observer2 = new Observer(this) { // from class: o.ys4
            public final /* synthetic */ zs4 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                byte b3 = b2;
                zs4 zs4Var = this.n;
                Integer num = (Integer) obj;
                switch (b3) {
                    case 0:
                        int iIntValue = num.intValue();
                        String string = zs4Var.H().getString(R.string.tv_alertsOverviewNeedAttention, num);
                        string.getClass();
                        zs4Var.A0(iIntValue, string, zs4Var.r0);
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        String string2 = zs4Var.H().getString(R.string.tv_alertsOverviewAlarms, num);
                        string2.getClass();
                        zs4Var.A0(iIntValue2, string2, zs4Var.q0);
                        break;
                }
            }
        };
        sb3 sb3Var = this.p0;
        if (sb3Var != null && (nw4Var2 = ((vs4) sb3Var).f2341o) != null) {
            nw4Var2.observe(L(), observer);
        }
        sb3 sb3Var2 = this.p0;
        if (sb3Var2 != null && (nw4Var = ((vs4) sb3Var2).p) != null) {
            nw4Var.observe(L(), observer2);
        }
        return viewInflate;
    }
}
