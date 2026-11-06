package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModel;
import com.teamviewer.remotecontrollib.swig.IBuddyListMainViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/sd0;", "Lo/ye0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sd0 extends ye0 {
    public static final /* synthetic */ int I0 = 0;
    public boolean A0;
    public au2 B0;
    public nf C0;
    public boolean D0;
    public final qd0 E0 = new qd0(this);
    public final c6 F0 = new c6((byte) 5);
    public final md0 G0 = new md0(this, 0);
    public final md0 H0 = new md0(this, 1);
    public LinearLayoutManager t0;
    public Parcelable u0;
    public LinearLayoutManager v0;
    public Parcelable w0;
    public de x0;
    public w93 y0;
    public vc5 z0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        if (str.equals("new_group_positive")) {
            return this.E0;
        }
        if (str.equals("new_group_negative")) {
            return this.F0;
        }
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return false;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final boolean getD0() {
        return this.D0;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: I0 */
    public final boolean getB0() {
        return false;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: J0 */
    public final boolean getC0() {
        return false;
    }

    public final void K0() {
        Context contextE = E();
        if (contextE != null && this.A0) {
            nf nfVar = this.C0;
            if (nfVar != null) {
                ((FloatingActionButton) nfVar.c).setBackgroundTintList(hm3.m(contextE, R.color.fabColor));
            }
            au2 au2Var = this.B0;
            if (au2Var != null) {
                ((View) au2Var.c).setVisibility(8);
            }
            nf nfVar2 = this.C0;
            if (nfVar2 != null) {
                ((FloatingActionButton) nfVar2.c).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_rotate_backward));
            }
            nf nfVar3 = this.C0;
            if (nfVar3 != null) {
                ((TextView) nfVar3.g).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar4 = this.C0;
            if (nfVar4 != null) {
                ((FloatingActionButton) nfVar4.f).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar5 = this.C0;
            if (nfVar5 != null) {
                ((TextView) nfVar5.e).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar6 = this.C0;
            if (nfVar6 != null) {
                ((FloatingActionButton) nfVar6.d).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar7 = this.C0;
            if (nfVar7 != null) {
                ((TextView) nfVar7.i).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar8 = this.C0;
            if (nfVar8 != null) {
                ((FloatingActionButton) nfVar8.h).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar9 = this.C0;
            if (nfVar9 != null) {
                ((TextView) nfVar9.k).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar10 = this.C0;
            if (nfVar10 != null) {
                ((FloatingActionButton) nfVar10.j).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            this.A0 = false;
        }
    }

    public final void L0() {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.F0 = R.string.tv_newGroup;
        gk7Var.W0 = R.layout.dialog_fragment_new_group;
        gk7Var.X0 = null;
        gk7Var.O0 = android.R.string.cancel;
        gk7Var.K0 = R.string.tv_add_group;
        D0("new_group_positive", new r02(gk7Var, p02.Positive));
        D0("new_group_negative", new r02(gk7Var, p02.Negative));
        gk7.O0(gk7Var, C());
    }

    public final void M0() {
        if (nv1.d == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        ia iaVarB = yi5.b();
        su2 su2VarD = D();
        su2VarD.getClass();
        w10 w10Var = new w10(su2VarD);
        w10Var.h(0, iaVarB, null, 1);
        w10Var.f();
        w93 w93Var = this.y0;
        if (w93Var == null) {
            im3.e0("buddyListMainFragmentViewModel");
            throw null;
        }
        IBuddyListMainViewModel iBuddyListMainViewModel = ((ud0) w93Var).n;
        if (iBuddyListMainViewModel != null) {
            IBuddyListMainViewModelSWIGJNI.IBuddyListMainViewModel_ReportEvent(iBuddyListMainViewModel.a, iBuddyListMainViewModel, 2);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LiveData nw4Var;
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylisttensor, viewGroup, false);
        int i = R.id.fabDarkBackground;
        View viewS = r47.s(viewInflate, R.id.fabDarkBackground);
        if (viewS != null) {
            i = R.id.group_loading_progress_bar;
            ProgressBar progressBar = (ProgressBar) r47.s(viewInflate, R.id.group_loading_progress_bar);
            if (progressBar != null) {
                i = R.id.included_managed_groups;
                View viewS2 = r47.s(viewInflate, R.id.included_managed_groups);
                if (viewS2 != null) {
                    int i2 = R.id.group_image;
                    if (((ImageView) r47.s(viewS2, R.id.group_image)) != null) {
                        i2 = R.id.group_name;
                        if (((TextView) r47.s(viewS2, R.id.group_name)) != null) {
                            i2 = R.id.managed_devices;
                            LinearLayout linearLayout = (LinearLayout) r47.s(viewS2, R.id.managed_devices);
                            if (linearLayout != null) {
                                i2 = R.id.plManagedGroupRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) r47.s(viewS2, R.id.plManagedGroupRecyclerView);
                                if (recyclerView != null) {
                                    byte b2 = 3;
                                    yt2 yt2Var = new yt2(linearLayout, recyclerView, (byte) 3);
                                    int i3 = R.id.list_header_groups;
                                    if (((TextView) r47.s(viewInflate, R.id.list_header_groups)) != null) {
                                        i3 = R.id.list_header_manged_groups;
                                        if (((TextView) r47.s(viewInflate, R.id.list_header_manged_groups)) != null) {
                                            i3 = R.id.list_header_title;
                                            if (((TextView) r47.s(viewInflate, R.id.list_header_title)) != null) {
                                                i3 = R.id.plGroupRecyclerView;
                                                RecyclerView recyclerView2 = (RecyclerView) r47.s(viewInflate, R.id.plGroupRecyclerView);
                                                if (recyclerView2 != null) {
                                                    i3 = R.id.plGroupsLayout;
                                                    if (((ConstraintLayout) r47.s(viewInflate, R.id.plGroupsLayout)) != null) {
                                                        i3 = R.id.plManagerGroupsLayout;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) r47.s(viewInflate, R.id.plManagerGroupsLayout);
                                                        if (constraintLayout != null) {
                                                            i3 = R.id.plMonitoringOverviewIcon;
                                                            if (((ImageView) r47.s(viewInflate, R.id.plMonitoringOverviewIcon)) != null) {
                                                                i3 = R.id.plMonitoringOverviewLayout;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) r47.s(viewInflate, R.id.plMonitoringOverviewLayout);
                                                                if (constraintLayout2 != null) {
                                                                    i3 = R.id.plMonitoringOverviewSubtext;
                                                                    TextView textView = (TextView) r47.s(viewInflate, R.id.plMonitoringOverviewSubtext);
                                                                    if (textView != null) {
                                                                        i3 = R.id.plMonitoringOverviewText;
                                                                        if (((TextView) r47.s(viewInflate, R.id.plMonitoringOverviewText)) != null) {
                                                                            i3 = R.id.plQuickAccessLayout;
                                                                            if (((ConstraintLayout) r47.s(viewInflate, R.id.plQuickAccessLayout)) != null) {
                                                                                i3 = R.id.plServiceQueueIcon;
                                                                                if (((ImageView) r47.s(viewInflate, R.id.plServiceQueueIcon)) != null) {
                                                                                    i3 = R.id.plServiceQueueLayout;
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) r47.s(viewInflate, R.id.plServiceQueueLayout);
                                                                                    if (constraintLayout3 != null) {
                                                                                        i3 = R.id.plServiceQueueText;
                                                                                        if (((TextView) r47.s(viewInflate, R.id.plServiceQueueText)) != null) {
                                                                                            i3 = R.id.view3;
                                                                                            View viewS3 = r47.s(viewInflate, R.id.view3);
                                                                                            if (viewS3 != null) {
                                                                                                i3 = R.id.view4;
                                                                                                View viewS4 = r47.s(viewInflate, R.id.view4);
                                                                                                if (viewS4 != null) {
                                                                                                    this.B0 = new au2((NestedScrollView) viewInflate, viewS, progressBar, yt2Var, recyclerView2, constraintLayout, constraintLayout2, textView, constraintLayout3, viewS3, viewS4);
                                                                                                    this.u0 = bundle != null ? (Parcelable) pm8.u(bundle, "mainListState", Parcelable.class) : null;
                                                                                                    this.w0 = bundle != null ? (Parcelable) pm8.u(bundle, "managedGroupListState", Parcelable.class) : null;
                                                                                                    if (zu1.c == null) {
                                                                                                        hk0.g("Required value was null.");
                                                                                                        return null;
                                                                                                    }
                                                                                                    xt2 xt2VarP0 = p0();
                                                                                                    final byte b3 = 2;
                                                                                                    dl5 dl5Var = new dl5(new x85((byte) 29), (byte) 2);
                                                                                                    ve8 g0 = xt2VarP0.getG0();
                                                                                                    bf1 bf1VarK = h57.k(xt2VarP0);
                                                                                                    pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
                                                                                                    x86 x86Var = w86.a;
                                                                                                    wt3 wt3VarB = x86Var.b(vs4.class);
                                                                                                    String strC = wt3VarB.c();
                                                                                                    if (strC == null) {
                                                                                                        hk0.g("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    final sb3 sb3Var = (sb3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                                                                                                    au2 au2Var = vt1.c;
                                                                                                    if (au2Var == null) {
                                                                                                        hk0.g("Required value was null.");
                                                                                                        return null;
                                                                                                    }
                                                                                                    m26 m26Var = new m26(au2Var, b);
                                                                                                    ve8 g1 = getG0();
                                                                                                    bf1 bf1VarK2 = h57.k(this);
                                                                                                    bf1VarK2.getClass();
                                                                                                    pn5 pn5Var = new pn5(g1, m26Var, bf1VarK2);
                                                                                                    wt3 wt3VarB2 = x86Var.b(ud0.class);
                                                                                                    String strC2 = wt3VarB2.c();
                                                                                                    if (strC2 == null) {
                                                                                                        hk0.g("Local and anonymous classes can not be ViewModels");
                                                                                                        return null;
                                                                                                    }
                                                                                                    this.y0 = (w93) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
                                                                                                    p0().setTitle(R.string.tv_navigation_devices);
                                                                                                    p0().v(this, L());
                                                                                                    w93 w93Var = this.y0;
                                                                                                    if (w93Var == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ((ud0) w93Var).q;
                                                                                                    if (pLManagerGroupsListV2ViewModel == null || (nw4Var = NativeLiveDataBool.newInstance(PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_IsDeviceManagementEnabled(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel), false)) == null) {
                                                                                                        nw4Var = new nw4(Boolean.FALSE);
                                                                                                    }
                                                                                                    nw4Var.observe(L(), new Observer(this) { // from class: o.ld0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // androidx.lifecycle.Observer
                                                                                                        public final void a(Object obj) {
                                                                                                            byte b4 = b;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            switch (b4) {
                                                                                                                case 0:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    int i5 = ((Boolean) obj).booleanValue() ? 0 : 8;
                                                                                                                    au2 au2Var2 = sd0Var.B0;
                                                                                                                    if (au2Var2 != null) {
                                                                                                                        ((ConstraintLayout) au2Var2.i).setVisibility(i5);
                                                                                                                    }
                                                                                                                    au2 au2Var3 = sd0Var.B0;
                                                                                                                    if (au2Var3 != null) {
                                                                                                                        ((LinearLayout) ((yt2) au2Var3.g).n).setVisibility(i5);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    Integer num = (Integer) obj;
                                                                                                                    vc5 vc5Var = sd0Var.z0;
                                                                                                                    if (vc5Var != null) {
                                                                                                                        num.getClass();
                                                                                                                        vc5Var.e = num.intValue();
                                                                                                                        vc5Var.d();
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    au2 au2Var2 = this.B0;
                                                                                                    if (au2Var2 != null) {
                                                                                                        ((LinearLayout) ((yt2) au2Var2.g).n).setOnClickListener(new md0(this, (byte) 9));
                                                                                                    }
                                                                                                    w93 w93Var2 = this.y0;
                                                                                                    if (w93Var2 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    final byte b4 = 1;
                                                                                                    ((ud0) w93Var2).v.observe(L(), new Observer(this) { // from class: o.ld0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // androidx.lifecycle.Observer
                                                                                                        public final void a(Object obj) {
                                                                                                            byte b5 = b4;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            switch (b5) {
                                                                                                                case 0:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    int i5 = ((Boolean) obj).booleanValue() ? 0 : 8;
                                                                                                                    au2 au2Var3 = sd0Var.B0;
                                                                                                                    if (au2Var3 != null) {
                                                                                                                        ((ConstraintLayout) au2Var3.i).setVisibility(i5);
                                                                                                                    }
                                                                                                                    au2 au2Var4 = sd0Var.B0;
                                                                                                                    if (au2Var4 != null) {
                                                                                                                        ((LinearLayout) ((yt2) au2Var4.g).n).setVisibility(i5);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    Integer num = (Integer) obj;
                                                                                                                    vc5 vc5Var = sd0Var.z0;
                                                                                                                    if (vc5Var != null) {
                                                                                                                        num.getClass();
                                                                                                                        vc5Var.e = num.intValue();
                                                                                                                        vc5Var.d();
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    w93 w93Var3 = this.y0;
                                                                                                    if (w93Var3 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    byte b5 = 5;
                                                                                                    ((ud0) w93Var3).u.observe(L(), new b7(new Function1(this) { // from class: o.nd0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                        public final Object invoke(Object obj) {
                                                                                                            byte b6 = b;
                                                                                                            f88 f88Var = f88.a;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            Boolean bool = (Boolean) obj;
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    au2 au2Var3 = sd0Var.B0;
                                                                                                                    if (au2Var3 != null) {
                                                                                                                        ((ProgressBar) au2Var3.f).setVisibility(0);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    au2 au2Var4 = sd0Var.B0;
                                                                                                                    if (au2Var4 != null) {
                                                                                                                        ((ProgressBar) au2Var4.f).setVisibility(8);
                                                                                                                    }
                                                                                                                    de deVar = sd0Var.x0;
                                                                                                                    if (deVar != null) {
                                                                                                                        deVar.d();
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    bool.getClass();
                                                                                                                    sd0Var.D0 = bool.booleanValue();
                                                                                                                    xt2 xt2VarC = sd0Var.C();
                                                                                                                    if (xt2VarC != null) {
                                                                                                                        xt2VarC.invalidateOptionsMenu();
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            return f88Var;
                                                                                                        }
                                                                                                    }, b5));
                                                                                                    w93 w93Var4 = this.y0;
                                                                                                    if (w93Var4 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    ((ud0) w93Var4).t.observe(L(), new b7(new Function1(this) { // from class: o.nd0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                        public final Object invoke(Object obj) {
                                                                                                            byte b6 = b4;
                                                                                                            f88 f88Var = f88.a;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            Boolean bool = (Boolean) obj;
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    au2 au2Var3 = sd0Var.B0;
                                                                                                                    if (au2Var3 != null) {
                                                                                                                        ((ProgressBar) au2Var3.f).setVisibility(0);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    au2 au2Var4 = sd0Var.B0;
                                                                                                                    if (au2Var4 != null) {
                                                                                                                        ((ProgressBar) au2Var4.f).setVisibility(8);
                                                                                                                    }
                                                                                                                    de deVar = sd0Var.x0;
                                                                                                                    if (deVar != null) {
                                                                                                                        deVar.d();
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    bool.getClass();
                                                                                                                    sd0Var.D0 = bool.booleanValue();
                                                                                                                    xt2 xt2VarC = sd0Var.C();
                                                                                                                    if (xt2VarC != null) {
                                                                                                                        xt2VarC.invalidateOptionsMenu();
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            return f88Var;
                                                                                                        }
                                                                                                    }, b5));
                                                                                                    w93 w93Var5 = this.y0;
                                                                                                    if (w93Var5 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    ((ud0) w93Var5).w.observe(L(), new b7(new Function1(this) { // from class: o.nd0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                        public final Object invoke(Object obj) {
                                                                                                            byte b6 = b3;
                                                                                                            f88 f88Var = f88.a;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            Boolean bool = (Boolean) obj;
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    au2 au2Var3 = sd0Var.B0;
                                                                                                                    if (au2Var3 != null) {
                                                                                                                        ((ProgressBar) au2Var3.f).setVisibility(0);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    au2 au2Var4 = sd0Var.B0;
                                                                                                                    if (au2Var4 != null) {
                                                                                                                        ((ProgressBar) au2Var4.f).setVisibility(8);
                                                                                                                    }
                                                                                                                    de deVar = sd0Var.x0;
                                                                                                                    if (deVar != null) {
                                                                                                                        deVar.d();
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    bool.getClass();
                                                                                                                    sd0Var.D0 = bool.booleanValue();
                                                                                                                    xt2 xt2VarC = sd0Var.C();
                                                                                                                    if (xt2VarC != null) {
                                                                                                                        xt2VarC.invalidateOptionsMenu();
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            return f88Var;
                                                                                                        }
                                                                                                    }, b5));
                                                                                                    rd0 rd0Var = new rd0(this);
                                                                                                    rd0 rd0Var2 = new rd0(this);
                                                                                                    w93 w93Var6 = this.y0;
                                                                                                    if (w93Var6 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    this.z0 = new vc5(w93Var6, rd0Var2);
                                                                                                    p0();
                                                                                                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
                                                                                                    this.v0 = linearLayoutManager;
                                                                                                    au2 au2Var3 = this.B0;
                                                                                                    if (au2Var3 != null) {
                                                                                                        RecyclerView recyclerView3 = (RecyclerView) ((yt2) au2Var3.g).f2642o;
                                                                                                        recyclerView3.setLayoutManager(linearLayoutManager);
                                                                                                        recyclerView3.setAdapter(this.z0);
                                                                                                        recyclerView3.setNestedScrollingEnabled(false);
                                                                                                    }
                                                                                                    w93 w93Var7 = this.y0;
                                                                                                    if (w93Var7 == null) {
                                                                                                        im3.e0("buddyListMainFragmentViewModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    this.x0 = new de(w93Var7, rd0Var);
                                                                                                    bb5 bb5Var = this.r0;
                                                                                                    if (bb5Var != null) {
                                                                                                        bb5Var.q(gk6.n, false);
                                                                                                    }
                                                                                                    p0();
                                                                                                    LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(0);
                                                                                                    this.t0 = linearLayoutManager2;
                                                                                                    au2 au2Var4 = this.B0;
                                                                                                    if (au2Var4 != null) {
                                                                                                        RecyclerView recyclerView4 = (RecyclerView) au2Var4.h;
                                                                                                        recyclerView4.setLayoutManager(linearLayoutManager2);
                                                                                                        recyclerView4.setAdapter(this.x0);
                                                                                                        recyclerView4.setNestedScrollingEnabled(false);
                                                                                                    }
                                                                                                    if (C() instanceof fa3) {
                                                                                                        KeyEvent.Callback callbackC = C();
                                                                                                        callbackC.getClass();
                                                                                                        View viewFindViewById = ((MainActivity) ((fa3) callbackC)).findViewById(R.id.app_bar_layout);
                                                                                                        viewFindViewById.getClass();
                                                                                                        ((AppBarLayout) viewFindViewById).d(true, false, true);
                                                                                                    }
                                                                                                    au2 au2Var5 = this.B0;
                                                                                                    if (au2Var5 != null) {
                                                                                                        ((ConstraintLayout) au2Var5.j).setOnClickListener(this.G0);
                                                                                                    }
                                                                                                    au2 au2Var6 = this.B0;
                                                                                                    if (au2Var6 != null) {
                                                                                                        ((ConstraintLayout) au2Var6.k).setOnClickListener(this.H0);
                                                                                                    }
                                                                                                    Observer observer = new Observer(this) { // from class: o.od0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // androidx.lifecycle.Observer
                                                                                                        public final void a(Object obj) {
                                                                                                            byte b6 = b;
                                                                                                            sb3 sb3Var2 = sb3Var;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            Integer num = (Integer) obj;
                                                                                                            num.getClass();
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    au2 au2Var7 = sd0Var.B0;
                                                                                                                    if (au2Var7 != null) {
                                                                                                                        ((TextView) au2Var7.a).setText(sd0Var.J(R.string.tv_monitoring_overview_subtext, ((vs4) sb3Var2).p.getValue(), num));
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    au2 au2Var8 = sd0Var.B0;
                                                                                                                    if (au2Var8 != null) {
                                                                                                                        ((TextView) au2Var8.a).setText(sd0Var.J(R.string.tv_monitoring_overview_subtext, num, ((vs4) sb3Var2).f2341o.getValue()));
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    };
                                                                                                    Observer observer2 = new Observer(this) { // from class: o.od0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // androidx.lifecycle.Observer
                                                                                                        public final void a(Object obj) {
                                                                                                            byte b6 = b4;
                                                                                                            sb3 sb3Var2 = sb3Var;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            Integer num = (Integer) obj;
                                                                                                            num.getClass();
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    au2 au2Var7 = sd0Var.B0;
                                                                                                                    if (au2Var7 != null) {
                                                                                                                        ((TextView) au2Var7.a).setText(sd0Var.J(R.string.tv_monitoring_overview_subtext, ((vs4) sb3Var2).p.getValue(), num));
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    au2 au2Var8 = sd0Var.B0;
                                                                                                                    if (au2Var8 != null) {
                                                                                                                        ((TextView) au2Var8.a).setText(sd0Var.J(R.string.tv_monitoring_overview_subtext, num, ((vs4) sb3Var2).f2341o.getValue()));
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    };
                                                                                                    vs4 vs4Var = (vs4) sb3Var;
                                                                                                    vs4Var.f2341o.observe(L(), observer);
                                                                                                    vs4Var.p.observe(L(), observer2);
                                                                                                    if (C() instanceof pa3) {
                                                                                                        KeyEvent.Callback callbackC2 = C();
                                                                                                        callbackC2.getClass();
                                                                                                        CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC2)).U();
                                                                                                        nf nfVarG = nf.g(layoutInflater, coordinatorLayoutU);
                                                                                                        this.C0 = nfVarG;
                                                                                                        ((TextView) nfVarG.g).setOnClickListener(new md0(this, b3));
                                                                                                        ((FloatingActionButton) nfVarG.f).setOnClickListener(new md0(this, b2));
                                                                                                        ((TextView) nfVarG.e).setOnClickListener(new md0(this, (byte) 4));
                                                                                                        ((FloatingActionButton) nfVarG.d).setOnClickListener(new md0(this, b5));
                                                                                                        ((TextView) nfVarG.i).setOnClickListener(new md0(this, (byte) 6));
                                                                                                        ((FloatingActionButton) nfVarG.h).setOnClickListener(new md0(this, (byte) 7));
                                                                                                        ((TextView) nfVarG.k).setOnClickListener(new md0(this, (byte) 8));
                                                                                                        ((FloatingActionButton) nfVarG.j).setOnClickListener(new md0(this, (byte) 10));
                                                                                                        ((FloatingActionButton) nfVarG.c).setOnClickListener(new md0(this, (byte) 11));
                                                                                                        coordinatorLayoutU.addView((GridLayout) nfVarG.b);
                                                                                                        this.A0 = false;
                                                                                                    }
                                                                                                    D().f0("NearbyDeviceAddCallbackRequestKey", L(), new xu2(this) { // from class: o.pd0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // o.xu2
                                                                                                        public final void b(String str, Bundle bundle2) {
                                                                                                            byte b6 = b;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    bundle2.getClass();
                                                                                                                    String string = bundle2.getString("DeviceDyngateId");
                                                                                                                    String string2 = bundle2.getString("DeviceAlias");
                                                                                                                    if (string != null && string2 != null) {
                                                                                                                        lc0 lc0Var = new lc0();
                                                                                                                        Bundle bundle3 = new Bundle();
                                                                                                                        bundle3.putString("TeamViewerID", string);
                                                                                                                        bundle3.putString("Alias", string2);
                                                                                                                        bundle3.putBoolean("ExpandToolbar", true);
                                                                                                                        bundle3.putBoolean("NearbyDevice", true);
                                                                                                                        lc0Var.u0(bundle3);
                                                                                                                        bb5 bb5Var2 = sd0Var.r0;
                                                                                                                        if (bb5Var2 != null) {
                                                                                                                            bb5Var2.I0(lc0Var, true);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    int i5 = sd0.I0;
                                                                                                                    bundle2.getClass();
                                                                                                                    long j = bundle2.getLong("PartnerAccountId");
                                                                                                                    le0 le0Var = new le0();
                                                                                                                    Bundle bundle4 = new Bundle();
                                                                                                                    bundle4.putLong("AccountId", j);
                                                                                                                    bundle4.putBoolean("NearbyContact", true);
                                                                                                                    le0Var.u0(bundle4);
                                                                                                                    bb5 bb5Var3 = sd0Var.r0;
                                                                                                                    if (bb5Var3 != null) {
                                                                                                                        bb5Var3.I0(le0Var, true);
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    D().f0("NearbyPartnerAddCallbackRequestKey", L(), new xu2(this) { // from class: o.pd0
                                                                                                        public final /* synthetic */ sd0 n;

                                                                                                        {
                                                                                                            this.n = this;
                                                                                                        }

                                                                                                        @Override // o.xu2
                                                                                                        public final void b(String str, Bundle bundle2) {
                                                                                                            byte b6 = b4;
                                                                                                            sd0 sd0Var = this.n;
                                                                                                            switch (b6) {
                                                                                                                case 0:
                                                                                                                    int i4 = sd0.I0;
                                                                                                                    bundle2.getClass();
                                                                                                                    String string = bundle2.getString("DeviceDyngateId");
                                                                                                                    String string2 = bundle2.getString("DeviceAlias");
                                                                                                                    if (string != null && string2 != null) {
                                                                                                                        lc0 lc0Var = new lc0();
                                                                                                                        Bundle bundle3 = new Bundle();
                                                                                                                        bundle3.putString("TeamViewerID", string);
                                                                                                                        bundle3.putString("Alias", string2);
                                                                                                                        bundle3.putBoolean("ExpandToolbar", true);
                                                                                                                        bundle3.putBoolean("NearbyDevice", true);
                                                                                                                        lc0Var.u0(bundle3);
                                                                                                                        bb5 bb5Var2 = sd0Var.r0;
                                                                                                                        if (bb5Var2 != null) {
                                                                                                                            bb5Var2.I0(lc0Var, true);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    int i5 = sd0.I0;
                                                                                                                    bundle2.getClass();
                                                                                                                    long j = bundle2.getLong("PartnerAccountId");
                                                                                                                    le0 le0Var = new le0();
                                                                                                                    Bundle bundle4 = new Bundle();
                                                                                                                    bundle4.putLong("AccountId", j);
                                                                                                                    bundle4.putBoolean("NearbyContact", true);
                                                                                                                    le0Var.u0(bundle4);
                                                                                                                    bb5 bb5Var3 = sd0Var.r0;
                                                                                                                    if (bb5Var3 != null) {
                                                                                                                        bb5Var3.I0(le0Var, true);
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    au2 au2Var7 = this.B0;
                                                                                                    if (au2Var7 != null) {
                                                                                                        return (NestedScrollView) au2Var7.b;
                                                                                                    }
                                                                                                    return null;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i3;
                                }
                            }
                        }
                    }
                    yq4.l("Missing required view with ID: ".concat(viewS2.getResources().getResourceName(i2)));
                    return null;
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        if (C() instanceof pa3) {
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC)).U();
            nf nfVar = this.C0;
            coordinatorLayoutU.removeView(nfVar != null ? (GridLayout) nfVar.b : null);
        }
        this.x0 = null;
        this.u0 = null;
        this.t0 = null;
        this.v0 = null;
        this.w0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        super.g0();
        Parcelable parcelable = this.u0;
        if (parcelable != null && (linearLayoutManager2 = this.t0) != null) {
            linearLayoutManager2.o0(parcelable);
        }
        Parcelable parcelable2 = this.w0;
        if (parcelable2 == null || (linearLayoutManager = this.v0) == null) {
            return;
        }
        linearLayoutManager.o0(parcelable2);
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        LinearLayoutManager linearLayoutManager = this.t0;
        if (linearLayoutManager != null) {
            Parcelable parcelableP0 = linearLayoutManager.p0();
            this.u0 = parcelableP0;
            bundle.putParcelable("mainListState", parcelableP0);
        }
        LinearLayoutManager linearLayoutManager2 = this.v0;
        if (linearLayoutManager2 != null) {
            Parcelable parcelableP1 = linearLayoutManager2.p0();
            this.w0 = parcelableP1;
            bundle.putParcelable("managedGroupListState", parcelableP1);
        }
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
        return false;
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.e(this);
    }
}
