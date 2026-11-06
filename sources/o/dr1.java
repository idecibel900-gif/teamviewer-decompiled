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
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/dr1;", "Lo/h1;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dr1 extends h1<w05> {
    public long q0;
    public dd r0 = dd.m;
    public de s0;
    public zd t0;
    public TextView u0;
    public ImageView v0;
    public Space w0;
    public boolean x0;
    public boolean y0;

    public final void A0(boolean z) {
        String string;
        TextView textView = this.u0;
        if (textView != null) {
            int iOrdinal = this.r0.ordinal();
            if (iOrdinal != 0) {
                string = iOrdinal != 1 ? H().getString(R.string.tv_alarm_overview_filter_empty_text_acknowledged) : H().getString(R.string.tv_alarm_overview_filter_empty_text_failed);
            } else {
                string = H().getString(R.string.tv_alarm_overview_filter_empty_text_all);
            }
            textView.setText(string);
        }
        TextView textView2 = this.u0;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 8);
        }
        Space space = this.w0;
        if (space != null) {
            space.setVisibility(z ? 0 : 8);
        }
        ImageView imageView = this.v0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void B0() {
        if (this.x0 || !this.y0) {
            return;
        }
        de deVar = this.s0;
        if (deVar != null) {
            deVar.d();
        }
        boolean z = false;
        this.y0 = false;
        zd zdVar = this.t0;
        if (zdVar != null && zdVar.o() == 0) {
            z = true;
        }
        A0(z);
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        dd ddVar;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("BuddyId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            jLongValue = bundle2 != null ? bundle2.getLong("BuddyId") : 0L;
        }
        this.q0 = jLongValue;
        if (bundle == null || (ddVar = (dd) pm8.w(bundle, "AlarmFilter", dd.class)) == null) {
            Bundle bundle3 = this.r;
            dd ddVar2 = bundle3 != null ? (dd) pm8.w(bundle3, "AlarmFilter", dd.class) : null;
            ddVar = ddVar2 == null ? dd.m : ddVar2;
        }
        this.r0 = ddVar;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (ds1.h(new PListComputerID(this.q0)) != null) {
            final c36 c36Var = zu1.c;
            if (c36Var == null) {
                hk0.g("Required value was null.");
                return null;
            }
            final dd ddVar = this.r0;
            final long j = this.q0;
            ddVar.getClass();
            dl5 dl5Var = new dl5(new Function0() { // from class: o.a36
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    c36 c36Var2 = c36Var;
                    dr1 dr1Var = this;
                    long j2 = j;
                    kc0 kc0VarA = c36Var2.a(dr1Var, j2);
                    br1 br1Var = kc0VarA != null ? new br1(kc0VarA, j2, ddVar) : null;
                    br1Var.getClass();
                    return br1Var;
                }
            }, (byte) 2);
            ve8 g0 = getG0();
            bf1 bf1VarK = h57.k(this);
            pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(br1.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
            this.t0 = (zd) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        boolean z = false;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistmonitoringalerts, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.alerts_list);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.alerts_list_mask);
        viewFindViewById2.getClass();
        this.u0 = (TextView) viewInflate.findViewById(R.id.empty_alerts);
        this.v0 = (ImageView) viewInflate.findViewById(R.id.image_tick);
        this.w0 = (Space) viewInflate.findViewById(R.id.empty_space);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        i66 itemAnimator = recyclerView.getItemAnimator();
        nk1 nk1Var = itemAnimator instanceof nk1 ? (nk1) itemAnimator : null;
        if (nk1Var != null) {
            nk1Var.f = (short) 0;
        }
        xk1 xk1Var = new xk1(this, (byte) 4);
        zd zdVar = this.t0;
        if (zdVar != null && zdVar.o() == 0) {
            z = true;
        }
        A0(z);
        zd zdVar2 = this.t0;
        if (zdVar2 != null) {
            this.s0 = new de(zdVar2, new d82((byte) 28), xk1Var);
        }
        new ln3(new ae(viewFindViewById2, new j93(this.s0, this.t0, new cr1(this, (byte) 1), new cr1(this, (byte) 2), (byte) 4))).g(recyclerView);
        recyclerView.setAdapter(this.s0);
        return viewInflate;
    }

    @Override // o.ut2
    public final void f0() {
        this.S = true;
        zd zdVar = this.t0;
        if (zdVar != null) {
            zdVar.M0();
        }
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putLong("BuddyId", this.q0);
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        zd zdVar = this.t0;
        if (zdVar != null) {
            zdVar.Q(new cr1(this, (byte) 0));
        }
    }
}
