package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/dt4;", "Lo/h1;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dt4 extends h1<w05> {
    public de q0;
    public zd r0;
    public dd s0 = dd.m;
    public TextView t0;
    public ImageView u0;
    public Space v0;
    public boolean w0;
    public boolean x0;

    public final void A0(boolean z) {
        String strI;
        TextView textView = this.t0;
        if (textView != null) {
            int iOrdinal = this.s0.ordinal();
            if (iOrdinal != 0) {
                strI = iOrdinal != 1 ? I(R.string.tv_alarm_monitoring_filter_empty_text_acknowledged) : I(R.string.tv_alarm_monitoring_filter_empty_text_failed);
            } else {
                strI = I(R.string.tv_alarm_monitoring_filter_empty_text_all);
            }
            textView.setText(strI);
        }
        TextView textView2 = this.t0;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 8);
        }
        Space space = this.v0;
        if (space != null) {
            space.setVisibility(z ? 0 : 8);
        }
        ImageView imageView = this.u0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void B0() {
        if (this.w0 || !this.x0) {
            return;
        }
        de deVar = this.q0;
        if (deVar != null) {
            deVar.d();
        }
        boolean z = false;
        this.x0 = false;
        zd zdVar = this.r0;
        if (zdVar != null && zdVar.o() == 0) {
            z = true;
        }
        A0(z);
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        dd ddVar;
        super.X(bundle);
        if (bundle == null || (ddVar = (dd) pm8.w(bundle, "AlarmFilter", dd.class)) == null) {
            Bundle bundle2 = this.r;
            ddVar = bundle2 != null ? (dd) pm8.w(bundle2, "AlarmFilter", dd.class) : null;
            if (ddVar == null) {
                ddVar = dd.m;
            }
        }
        this.s0 = ddVar;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dd ddVar = this.s0;
        ddVar.getClass();
        dl5 dl5Var = new dl5(new a26((Object) this, (Object) ddVar, (byte) 2), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(bt4.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.r0 = (zd) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistmonitoringalerts, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.alerts_list);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.alerts_list_mask);
        viewFindViewById2.getClass();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.t0 = (TextView) viewInflate.findViewById(R.id.empty_alerts);
        this.u0 = (ImageView) viewInflate.findViewById(R.id.image_tick);
        this.v0 = (Space) viewInflate.findViewById(R.id.empty_space);
        recyclerView.setLayoutManager(linearLayoutManager);
        i66 itemAnimator = recyclerView.getItemAnimator();
        nk1 nk1Var = itemAnimator instanceof nk1 ? (nk1) itemAnimator : null;
        if (nk1Var != null) {
            nk1Var.f = (short) 0;
        }
        nx3 nx3Var = new nx3(this, (byte) 22);
        zd zdVar = this.r0;
        A0(zdVar != null && zdVar.o() == 0);
        de deVar = new de(this.r0, new d82((byte) 28), nx3Var);
        this.q0 = deVar;
        new ln3(new ae(viewFindViewById2, new j93(deVar, this.r0, new ct4(this, (byte) 0), new ct4(this, (byte) 1), (byte) 4))).g(recyclerView);
        recyclerView.setAdapter(this.q0);
        return viewInflate;
    }

    @Override // o.ut2
    public final void f0() {
        this.S = true;
        zd zdVar = this.r0;
        if (zdVar != null) {
            zdVar.M0();
        }
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        zd zdVar = this.r0;
        if (zdVar != null) {
            zdVar.Q(new ct4(this, (byte) 2));
        }
    }
}
