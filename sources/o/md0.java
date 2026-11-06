package o;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModel;
import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md0 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ sd0 n;

    public /* synthetic */ md0(sd0 sd0Var, byte b) {
        this.m = b;
        this.n = sd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.m;
        sd0 sd0Var = this.n;
        switch (b) {
            case 0:
                w93 w93Var = sd0Var.y0;
                if (w93Var == null) {
                    im3.e0("buddyListMainFragmentViewModel");
                    throw null;
                }
                IBuddyListMainViewModel iBuddyListMainViewModel = ((ud0) w93Var).n;
                if (iBuddyListMainViewModel != null) {
                    IBuddyListMainViewModelSWIGJNI.IBuddyListMainViewModel_ReportEvent(iBuddyListMainViewModel.a, iBuddyListMainViewModel, 0);
                }
                bb5 bb5Var = sd0Var.r0;
                if (bb5Var != null) {
                    bb5Var.I0(new ht4(), true);
                    return;
                }
                return;
            case 1:
                w93 w93Var2 = sd0Var.y0;
                if (w93Var2 == null) {
                    im3.e0("buddyListMainFragmentViewModel");
                    throw null;
                }
                IBuddyListMainViewModel iBuddyListMainViewModel2 = ((ud0) w93Var2).n;
                if (iBuddyListMainViewModel2 != null) {
                    IBuddyListMainViewModelSWIGJNI.IBuddyListMainViewModel_ReportEvent(iBuddyListMainViewModel2.a, iBuddyListMainViewModel2, 1);
                }
                bb5 bb5Var2 = sd0Var.r0;
                if (bb5Var2 != null) {
                    bb5Var2.I0(new br6(), true);
                    return;
                }
                return;
            case 2:
                int i = sd0.I0;
                le0 le0Var = new le0();
                bb5 bb5Var3 = sd0Var.r0;
                if (bb5Var3 != null) {
                    bb5Var3.I0(le0Var, true);
                    return;
                }
                return;
            case 3:
                int i2 = sd0.I0;
                le0 le0Var2 = new le0();
                bb5 bb5Var4 = sd0Var.r0;
                if (bb5Var4 != null) {
                    bb5Var4.I0(le0Var2, true);
                    return;
                }
                return;
            case 4:
                int i3 = sd0.I0;
                lc0 lc0Var = new lc0();
                bb5 bb5Var5 = sd0Var.r0;
                if (bb5Var5 != null) {
                    bb5Var5.I0(lc0Var, true);
                    return;
                }
                return;
            case 5:
                int i4 = sd0.I0;
                lc0 lc0Var2 = new lc0();
                bb5 bb5Var6 = sd0Var.r0;
                if (bb5Var6 != null) {
                    bb5Var6.I0(lc0Var2, true);
                    return;
                }
                return;
            case 6:
                int i5 = sd0.I0;
                sd0Var.L0();
                return;
            case 7:
                int i6 = sd0.I0;
                sd0Var.L0();
                return;
            case 8:
                int i7 = sd0.I0;
                sd0Var.M0();
                return;
            case ep1.b /* 9 */:
                int i8 = sd0.I0;
                bb5 bb5Var7 = sd0Var.r0;
                if (bb5Var7 != null) {
                    bb5Var7.I0(new cm4(), true);
                    return;
                }
                return;
            case ep1.c /* 10 */:
                int i9 = sd0.I0;
                sd0Var.M0();
                return;
            default:
                int i10 = sd0.I0;
                Context contextE = sd0Var.E();
                if (contextE == null) {
                    return;
                }
                if (sd0Var.A0) {
                    sd0Var.K0();
                } else {
                    nf nfVar = sd0Var.C0;
                    if (nfVar != null) {
                        ((FloatingActionButton) nfVar.c).setBackgroundTintList(hm3.m(contextE, R.color.fab_button_opened_dimmed_color));
                    }
                    au2 au2Var = sd0Var.B0;
                    if (au2Var != null) {
                        ((View) au2Var.c).setVisibility(0);
                    }
                    nf nfVar2 = sd0Var.C0;
                    if (nfVar2 != null) {
                        ((FloatingActionButton) nfVar2.c).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_rotate_forward));
                    }
                    nf nfVar3 = sd0Var.C0;
                    if (nfVar3 != null) {
                        ((TextView) nfVar3.g).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar4 = sd0Var.C0;
                    if (nfVar4 != null) {
                        ((FloatingActionButton) nfVar4.f).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar5 = sd0Var.C0;
                    if (nfVar5 != null) {
                        ((TextView) nfVar5.e).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar6 = sd0Var.C0;
                    if (nfVar6 != null) {
                        ((FloatingActionButton) nfVar6.d).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar7 = sd0Var.C0;
                    if (nfVar7 != null) {
                        ((TextView) nfVar7.i).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar8 = sd0Var.C0;
                    if (nfVar8 != null) {
                        ((FloatingActionButton) nfVar8.h).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar9 = sd0Var.C0;
                    if (nfVar9 != null) {
                        ((TextView) nfVar9.k).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    nf nfVar10 = sd0Var.C0;
                    if (nfVar10 != null) {
                        ((FloatingActionButton) nfVar10.j).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
                    }
                    sd0Var.A0 = true;
                }
                nf nfVar11 = sd0Var.C0;
                if (nfVar11 != null) {
                    ((FloatingActionButton) nfVar11.f).setClickable(sd0Var.A0);
                    ((TextView) nfVar11.g).setClickable(sd0Var.A0);
                    ((FloatingActionButton) nfVar11.d).setClickable(sd0Var.A0);
                    ((TextView) nfVar11.e).setClickable(sd0Var.A0);
                    ((FloatingActionButton) nfVar11.h).setClickable(sd0Var.A0);
                    ((TextView) nfVar11.i).setClickable(sd0Var.A0);
                    ((FloatingActionButton) nfVar11.j).setClickable(sd0Var.A0);
                    ((TextView) nfVar11.k).setClickable(sd0Var.A0);
                    return;
                }
                return;
        }
    }
}
