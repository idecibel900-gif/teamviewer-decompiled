package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.guielement.TVLinearLayoutManager;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/yc0;", "Lo/ye0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yc0 extends ye0 {
    public static final /* synthetic */ int G0 = 0;
    public PListGroupID A0 = new PListGroupID(0);
    public final boolean B0 = true;
    public final boolean C0 = true;
    public final xc0 D0 = new xc0(this, (byte) 0);
    public final c6 E0 = new c6((byte) 4);
    public final b6 F0 = new b6(this, 3);
    public tc0 t0;
    public TVLinearLayoutManager u0;
    public Parcelable v0;
    public boolean w0;
    public nf x0;
    public j93 y0;
    public u93 z0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final boolean getB0() {
        return this.B0;
    }

    @Override // o.ye0
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getC0() {
        return this.C0;
    }

    public final void K0() {
        Context contextE = E();
        if (contextE != null && this.w0) {
            nf nfVar = this.x0;
            if (nfVar != null) {
                ((FloatingActionButton) nfVar.c).setBackgroundTintList(hm3.m(contextE, R.color.fabColor));
            }
            j93 j93Var = this.y0;
            if (j93Var != null) {
                ((View) j93Var.f1141o).setVisibility(8);
            }
            nf nfVar2 = this.x0;
            if (nfVar2 != null) {
                ((FloatingActionButton) nfVar2.c).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_rotate_backward));
            }
            nf nfVar3 = this.x0;
            if (nfVar3 != null) {
                ((TextView) nfVar3.g).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar4 = this.x0;
            if (nfVar4 != null) {
                ((FloatingActionButton) nfVar4.f).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar5 = this.x0;
            if (nfVar5 != null) {
                ((TextView) nfVar5.e).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar6 = this.x0;
            if (nfVar6 != null) {
                ((FloatingActionButton) nfVar6.d).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar7 = this.x0;
            if (nfVar7 != null) {
                ((TextView) nfVar7.i).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar8 = this.x0;
            if (nfVar8 != null) {
                ((FloatingActionButton) nfVar8.h).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar9 = this.x0;
            if (nfVar9 != null) {
                ((TextView) nfVar9.k).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            nf nfVar10 = this.x0;
            if (nfVar10 != null) {
                ((FloatingActionButton) nfVar10.j).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_close));
            }
            this.w0 = false;
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
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1.M(this.F0, new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1.M(this.E0, new r02(gk7Var, p02.Negative));
        }
        gk7.O0(gk7Var, C());
    }

    public final void M0() {
        GroupListViewModel groupListViewModel;
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
        u93 u93Var = this.z0;
        if (u93Var == null || (groupListViewModel = ((bd0) u93Var).f415o) == null) {
            return;
        }
        GroupListViewModelSWIGJNI.GroupListViewModel_ReportEvent(groupListViewModel.a, groupListViewModel, 0);
    }

    public final void N0() {
        Context contextE = E();
        if (contextE == null) {
            return;
        }
        if (this.w0) {
            K0();
        } else {
            nf nfVar = this.x0;
            if (nfVar != null) {
                ((FloatingActionButton) nfVar.c).setBackgroundTintList(hm3.m(contextE, R.color.fab_button_opened_dimmed_color));
            }
            j93 j93Var = this.y0;
            if (j93Var != null) {
                ((View) j93Var.f1141o).setVisibility(0);
            }
            nf nfVar2 = this.x0;
            if (nfVar2 != null) {
                ((FloatingActionButton) nfVar2.c).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_rotate_forward));
            }
            nf nfVar3 = this.x0;
            if (nfVar3 != null) {
                ((TextView) nfVar3.g).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar4 = this.x0;
            if (nfVar4 != null) {
                ((FloatingActionButton) nfVar4.f).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar5 = this.x0;
            if (nfVar5 != null) {
                ((TextView) nfVar5.e).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar6 = this.x0;
            if (nfVar6 != null) {
                ((FloatingActionButton) nfVar6.d).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar7 = this.x0;
            if (nfVar7 != null) {
                ((TextView) nfVar7.i).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar8 = this.x0;
            if (nfVar8 != null) {
                ((FloatingActionButton) nfVar8.h).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar9 = this.x0;
            if (nfVar9 != null) {
                ((TextView) nfVar9.k).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            nf nfVar10 = this.x0;
            if (nfVar10 != null) {
                ((FloatingActionButton) nfVar10.j).startAnimation(AnimationUtils.loadAnimation(contextE, R.anim.fab_open));
            }
            this.w0 = true;
        }
        nf nfVar11 = this.x0;
        if (nfVar11 != null) {
            ((FloatingActionButton) nfVar11.f).setClickable(this.w0);
            ((TextView) nfVar11.g).setClickable(this.w0);
            ((FloatingActionButton) nfVar11.d).setClickable(this.w0);
            ((TextView) nfVar11.e).setClickable(this.w0);
            ((FloatingActionButton) nfVar11.h).setClickable(this.w0);
            ((TextView) nfVar11.i).setClickable(this.w0);
            ((FloatingActionButton) nfVar11.j).setClickable(this.w0);
            ((TextView) nfVar11.k).setClickable(this.w0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        LiveData liveData;
        nw4 nw4Var;
        nw4 nw4Var2;
        j93 j93Var;
        layoutInflater.getClass();
        long j = 0;
        if (bundle != null) {
            long j2 = bundle.getLong("groupId", 0L);
            if (j2 != 0) {
                j = j2;
            } else {
                bundle2 = this.r;
                if (bundle2 != null) {
                    j = bundle2.getLong("groupId", 0L);
                }
            }
        } else {
            bundle2 = this.r;
            if (bundle2 != null) {
                j = bundle2.getLong("groupId", 0L);
            }
        }
        PListGroupID pListGroupID = new PListGroupID(j);
        this.A0 = pListGroupID;
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        final byte b = 2;
        dl5 dl5Var = new dl5(new vm3(pListGroupID, (byte) 29), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(bd0.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        u93 u93Var = (u93) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.z0 = u93Var;
        nw4 nw4Var3 = ((bd0) u93Var).p;
        final byte b2 = 4;
        final byte b3 = 0;
        if (nw4Var3 != null) {
            nw4Var3.observe(L(), new b7(new Function1(this) { // from class: o.vc0
                public final /* synthetic */ yc0 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    bb5 bb5Var;
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    yc0 yc0Var = this.n;
                    Boolean bool = (Boolean) obj;
                    switch (b4) {
                        case 0:
                            int i = yc0.G0;
                            if (bool.booleanValue() && (bb5Var = yc0Var.r0) != null) {
                                bb5Var.G0();
                            }
                            break;
                        case 1:
                            int i2 = yc0.G0;
                            bool.getClass();
                            boolean zBooleanValue = bool.booleanValue();
                            j93 j93Var2 = yc0Var.y0;
                            if (!zBooleanValue) {
                                if (j93Var2 != null) {
                                    ((RecyclerView) j93Var2.q).setVisibility(8);
                                }
                                j93 j93Var3 = yc0Var.y0;
                                if (j93Var3 != null) {
                                    ((TextView) j93Var3.p).setVisibility(0);
                                }
                                bb5 bb5Var2 = yc0Var.r0;
                                if (bb5Var2 != null) {
                                    bb5Var2.q(gk6.n, false);
                                }
                            } else {
                                if (j93Var2 != null) {
                                    ((RecyclerView) j93Var2.q).setVisibility(0);
                                }
                                j93 j93Var4 = yc0Var.y0;
                                if (j93Var4 != null) {
                                    ((TextView) j93Var4.p).setVisibility(8);
                                }
                                tc0 tc0Var = yc0Var.t0;
                                if (tc0Var != null) {
                                    tc0Var.g = tc0Var.h(1);
                                    tc0Var.h = tc0Var.h(2);
                                    tc0Var.d();
                                }
                            }
                            break;
                        default:
                            int i3 = yc0.G0;
                            w10 w10Var = new w10(yc0Var.p0().D());
                            ut2 ut2VarF = yc0Var.p0().D().F("bottom_sheet_fragment");
                            if (ut2VarF != null) {
                                w10Var.j(ut2VarF);
                                w10Var.f();
                            }
                            bb5 bb5Var3 = yc0Var.r0;
                            if (bb5Var3 != null) {
                                bb5Var3.G0();
                            }
                            break;
                    }
                    return f88Var;
                }
            }, (byte) 4));
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistgroup, viewGroup, false);
        int i = R.id.fabDarkBackground;
        View viewS = r47.s(viewInflate, R.id.fabDarkBackground);
        if (viewS != null) {
            i = R.id.plGroupDetailsListNoItems;
            TextView textView = (TextView) r47.s(viewInflate, R.id.plGroupDetailsListNoItems);
            if (textView != null) {
                i = R.id.plGroupDetailsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) r47.s(viewInflate, R.id.plGroupDetailsRecyclerView);
                if (recyclerView != null) {
                    this.y0 = new j93((FrameLayout) viewInflate, viewS, textView, recyclerView, (byte) 19);
                    if (bundle != null) {
                        this.v0 = (Parcelable) pm8.u(bundle, "partnerListState", Parcelable.class);
                    }
                    xt2 xt2VarC = C();
                    if (this.z0 != null) {
                        p0().v(this, L());
                    }
                    u93 u93Var2 = this.z0;
                    u93Var2.getClass();
                    final byte b4 = 3;
                    this.t0 = new tc0(u93Var2, new ju((byte) 3), this.D0, bundle, new PListNavigationStatisticsViewModel(), p0());
                    bb5 bb5Var = this.r0;
                    if (bb5Var != null) {
                        this.u0 = new TVLinearLayoutManager(r0(), bb5Var);
                    }
                    j93 j93Var2 = this.y0;
                    if (j93Var2 != null) {
                        ((RecyclerView) j93Var2.q).setAdapter(this.t0);
                    }
                    j93 j93Var3 = this.y0;
                    if (j93Var3 != null) {
                        ((RecyclerView) j93Var3.q).setLayoutManager(this.u0);
                    }
                    u93 u93Var3 = this.z0;
                    if (u93Var3 != null) {
                        GroupMemberListViewModel groupMemberListViewModel = ((bd0) u93Var3).n;
                        if ((groupMemberListViewModel != null ? us1.R(GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetTotalListSize(groupMemberListViewModel.a, groupMemberListViewModel)) : 0) == 0 && (j93Var = this.y0) != null) {
                            ((TextView) j93Var.p).setVisibility(0);
                        }
                    }
                    u93 u93Var4 = this.z0;
                    final byte b5 = 1;
                    if (u93Var4 != null && (nw4Var2 = ((bd0) u93Var4).q) != null) {
                        nw4Var2.observe(L(), new b7(new Function1(this) { // from class: o.vc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                bb5 bb5Var2;
                                byte b6 = b5;
                                f88 f88Var = f88.a;
                                yc0 yc0Var = this.n;
                                Boolean bool = (Boolean) obj;
                                switch (b6) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        if (bool.booleanValue() && (bb5Var2 = yc0Var.r0) != null) {
                                            bb5Var2.G0();
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        bool.getClass();
                                        boolean zBooleanValue = bool.booleanValue();
                                        j93 j93Var4 = yc0Var.y0;
                                        if (!zBooleanValue) {
                                            if (j93Var4 != null) {
                                                ((RecyclerView) j93Var4.q).setVisibility(8);
                                            }
                                            j93 j93Var5 = yc0Var.y0;
                                            if (j93Var5 != null) {
                                                ((TextView) j93Var5.p).setVisibility(0);
                                            }
                                            bb5 bb5Var3 = yc0Var.r0;
                                            if (bb5Var3 != null) {
                                                bb5Var3.q(gk6.n, false);
                                            }
                                        } else {
                                            if (j93Var4 != null) {
                                                ((RecyclerView) j93Var4.q).setVisibility(0);
                                            }
                                            j93 j93Var6 = yc0Var.y0;
                                            if (j93Var6 != null) {
                                                ((TextView) j93Var6.p).setVisibility(8);
                                            }
                                            tc0 tc0Var = yc0Var.t0;
                                            if (tc0Var != null) {
                                                tc0Var.g = tc0Var.h(1);
                                                tc0Var.h = tc0Var.h(2);
                                                tc0Var.d();
                                            }
                                        }
                                        break;
                                    default:
                                        int i4 = yc0.G0;
                                        w10 w10Var = new w10(yc0Var.p0().D());
                                        ut2 ut2VarF = yc0Var.p0().D().F("bottom_sheet_fragment");
                                        if (ut2VarF != null) {
                                            w10Var.j(ut2VarF);
                                            w10Var.f();
                                        }
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.G0();
                                        }
                                        break;
                                }
                                return f88Var;
                            }
                        }, (byte) 4));
                    }
                    u93 u93Var5 = this.z0;
                    if (u93Var5 != null && (nw4Var = ((bd0) u93Var5).r) != null) {
                        nw4Var.observe(L(), new b7(new Function1(this) { // from class: o.vc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                bb5 bb5Var2;
                                byte b6 = b;
                                f88 f88Var = f88.a;
                                yc0 yc0Var = this.n;
                                Boolean bool = (Boolean) obj;
                                switch (b6) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        if (bool.booleanValue() && (bb5Var2 = yc0Var.r0) != null) {
                                            bb5Var2.G0();
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        bool.getClass();
                                        boolean zBooleanValue = bool.booleanValue();
                                        j93 j93Var4 = yc0Var.y0;
                                        if (!zBooleanValue) {
                                            if (j93Var4 != null) {
                                                ((RecyclerView) j93Var4.q).setVisibility(8);
                                            }
                                            j93 j93Var5 = yc0Var.y0;
                                            if (j93Var5 != null) {
                                                ((TextView) j93Var5.p).setVisibility(0);
                                            }
                                            bb5 bb5Var3 = yc0Var.r0;
                                            if (bb5Var3 != null) {
                                                bb5Var3.q(gk6.n, false);
                                            }
                                        } else {
                                            if (j93Var4 != null) {
                                                ((RecyclerView) j93Var4.q).setVisibility(0);
                                            }
                                            j93 j93Var6 = yc0Var.y0;
                                            if (j93Var6 != null) {
                                                ((TextView) j93Var6.p).setVisibility(8);
                                            }
                                            tc0 tc0Var = yc0Var.t0;
                                            if (tc0Var != null) {
                                                tc0Var.g = tc0Var.h(1);
                                                tc0Var.h = tc0Var.h(2);
                                                tc0Var.d();
                                            }
                                        }
                                        break;
                                    default:
                                        int i4 = yc0.G0;
                                        w10 w10Var = new w10(yc0Var.p0().D());
                                        ut2 ut2VarF = yc0Var.p0().D().F("bottom_sheet_fragment");
                                        if (ut2VarF != null) {
                                            w10Var.j(ut2VarF);
                                            w10Var.f();
                                        }
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.G0();
                                        }
                                        break;
                                }
                                return f88Var;
                            }
                        }, (byte) 4));
                    }
                    u93 u93Var6 = this.z0;
                    if (u93Var6 != null && (liveData = ((bd0) u93Var6).s) != null) {
                        liveData.observe(L(), new b7(new c80(xt2VarC, (byte) 1), (byte) 4));
                    }
                    if (C() instanceof pa3) {
                        KeyEvent.Callback callbackC = C();
                        callbackC.getClass();
                        CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC)).U();
                        nf nfVarG = nf.g(layoutInflater, coordinatorLayoutU);
                        this.x0 = nfVarG;
                        final byte b6 = 7;
                        ((TextView) nfVarG.g).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b7 = b6;
                                yc0 yc0Var = this.n;
                                switch (b7) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        final byte b7 = 8;
                        ((FloatingActionButton) nfVarG.f).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b7;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        ((TextView) nfVarG.e).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b3;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        ((FloatingActionButton) nfVarG.d).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b5;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        ((TextView) nfVarG.i).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        ((FloatingActionButton) nfVarG.h).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b4;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        ((TextView) nfVarG.k).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b8 = b2;
                                yc0 yc0Var = this.n;
                                switch (b8) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        final byte b8 = 5;
                        ((FloatingActionButton) nfVarG.j).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b9 = b8;
                                yc0 yc0Var = this.n;
                                switch (b9) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        final byte b9 = 6;
                        ((FloatingActionButton) nfVarG.c).setOnClickListener(new View.OnClickListener(this) { // from class: o.uc0
                            public final /* synthetic */ yc0 n;

                            {
                                this.n = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b10 = b9;
                                yc0 yc0Var = this.n;
                                switch (b10) {
                                    case 0:
                                        int i2 = yc0.G0;
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle3 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle3.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle3.putBoolean("ExpandToolbar", true);
                                        lc0Var.u0(bundle3);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    case 1:
                                        int i3 = yc0.G0;
                                        lc0 lc0Var2 = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID3 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        lc0Var2.u0(bundle4);
                                        bb5 bb5Var3 = yc0Var.r0;
                                        if (bb5Var3 != null) {
                                            bb5Var3.I0(lc0Var2, true);
                                        }
                                        break;
                                    case 2:
                                        int i4 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 3:
                                        int i5 = yc0.G0;
                                        yc0Var.L0();
                                        break;
                                    case 4:
                                        int i6 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 5:
                                        int i7 = yc0.G0;
                                        yc0Var.M0();
                                        break;
                                    case 6:
                                        int i8 = yc0.G0;
                                        yc0Var.N0();
                                        break;
                                    case 7:
                                        int i9 = yc0.G0;
                                        le0 le0Var = new le0();
                                        Bundle bundle5 = new Bundle();
                                        PListGroupID pListGroupID4 = yc0Var.A0;
                                        bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID4.a, pListGroupID4));
                                        bundle5.putBoolean("ExpandToolbar", true);
                                        le0Var.u0(bundle5);
                                        bb5 bb5Var4 = yc0Var.r0;
                                        if (bb5Var4 != null) {
                                            bb5Var4.I0(le0Var, true);
                                        }
                                        break;
                                    default:
                                        int i10 = yc0.G0;
                                        le0 le0Var2 = new le0();
                                        Bundle bundle6 = new Bundle();
                                        PListGroupID pListGroupID5 = yc0Var.A0;
                                        bundle6.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID5.a, pListGroupID5));
                                        bundle6.putBoolean("ExpandToolbar", true);
                                        le0Var2.u0(bundle6);
                                        bb5 bb5Var5 = yc0Var.r0;
                                        if (bb5Var5 != null) {
                                            bb5Var5.I0(le0Var2, true);
                                        }
                                        break;
                                }
                            }
                        });
                        coordinatorLayoutU.addView((GridLayout) nfVarG.b);
                        this.w0 = false;
                    }
                    D().f0("NearbyDeviceAddCallbackRequestKey", L(), new xu2(this) { // from class: o.wc0
                        public final /* synthetic */ yc0 n;

                        {
                            this.n = this;
                        }

                        @Override // o.xu2
                        public final void b(String str, Bundle bundle3) {
                            byte b10 = b3;
                            yc0 yc0Var = this.n;
                            switch (b10) {
                                case 0:
                                    int i2 = yc0.G0;
                                    bundle3.getClass();
                                    String string = bundle3.getString("DeviceDyngateId");
                                    String string2 = bundle3.getString("DeviceAlias");
                                    if (string != null && string2 != null) {
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle4.putString("TeamViewerID", string);
                                        bundle4.putString("Alias", string2);
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        bundle4.putBoolean("NearbyDevice", true);
                                        lc0Var.u0(bundle4);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    int i3 = yc0.G0;
                                    bundle3.getClass();
                                    long j3 = bundle3.getLong("PartnerAccountId");
                                    le0 le0Var = new le0();
                                    Bundle bundle5 = new Bundle();
                                    PListGroupID pListGroupID3 = yc0Var.A0;
                                    bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                    bundle5.putLong("AccountId", j3);
                                    bundle5.putBoolean("NearbyContact", true);
                                    le0Var.u0(bundle5);
                                    bb5 bb5Var3 = yc0Var.r0;
                                    if (bb5Var3 != null) {
                                        bb5Var3.I0(le0Var, true);
                                    }
                                    break;
                            }
                        }
                    });
                    D().f0("NearbyPartnerAddCallbackRequestKey", L(), new xu2(this) { // from class: o.wc0
                        public final /* synthetic */ yc0 n;

                        {
                            this.n = this;
                        }

                        @Override // o.xu2
                        public final void b(String str, Bundle bundle3) {
                            byte b10 = b5;
                            yc0 yc0Var = this.n;
                            switch (b10) {
                                case 0:
                                    int i2 = yc0.G0;
                                    bundle3.getClass();
                                    String string = bundle3.getString("DeviceDyngateId");
                                    String string2 = bundle3.getString("DeviceAlias");
                                    if (string != null && string2 != null) {
                                        lc0 lc0Var = new lc0();
                                        Bundle bundle4 = new Bundle();
                                        PListGroupID pListGroupID2 = yc0Var.A0;
                                        bundle4.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID2.a, pListGroupID2));
                                        bundle4.putString("TeamViewerID", string);
                                        bundle4.putString("Alias", string2);
                                        bundle4.putBoolean("ExpandToolbar", true);
                                        bundle4.putBoolean("NearbyDevice", true);
                                        lc0Var.u0(bundle4);
                                        bb5 bb5Var2 = yc0Var.r0;
                                        if (bb5Var2 != null) {
                                            bb5Var2.I0(lc0Var, true);
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    int i3 = yc0.G0;
                                    bundle3.getClass();
                                    long j3 = bundle3.getLong("PartnerAccountId");
                                    le0 le0Var = new le0();
                                    Bundle bundle5 = new Bundle();
                                    PListGroupID pListGroupID3 = yc0Var.A0;
                                    bundle5.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID3.a, pListGroupID3));
                                    bundle5.putLong("AccountId", j3);
                                    bundle5.putBoolean("NearbyContact", true);
                                    le0Var.u0(bundle5);
                                    bb5 bb5Var3 = yc0Var.r0;
                                    if (bb5Var3 != null) {
                                        bb5Var3.I0(le0Var, true);
                                    }
                                    break;
                            }
                        }
                    });
                    if (xt2VarC instanceof fa3) {
                        View viewFindViewById = ((MainActivity) ((fa3) xt2VarC)).findViewById(R.id.app_bar_layout);
                        viewFindViewById.getClass();
                        ((AppBarLayout) viewFindViewById).d(true, false, true);
                    }
                    j93 j93Var4 = this.y0;
                    if (j93Var4 != null) {
                        return (FrameLayout) j93Var4.n;
                    }
                    return null;
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.ut2
    public final void a0() {
        this.S = true;
        this.v0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        KeyEvent.Callback callbackC = C();
        if (callbackC instanceof pa3) {
            CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC)).U();
            nf nfVar = this.x0;
            coordinatorLayoutU.removeView(nfVar != null ? (GridLayout) nfVar.b : null);
        }
        this.x0 = null;
        this.y0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void f0() {
        super.f0();
        TVLinearLayoutManager tVLinearLayoutManager = this.u0;
        this.v0 = tVLinearLayoutManager != null ? tVLinearLayoutManager.p0() : null;
    }

    @Override // o.fv2, o.ut2
    public final void g0() {
        super.g0();
        TVLinearLayoutManager tVLinearLayoutManager = this.u0;
        if (tVLinearLayoutManager != null) {
            tVLinearLayoutManager.o0(this.v0);
        }
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        PListGroupID pListGroupID = this.A0;
        bundle.putLong("groupId", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID.a, pListGroupID));
        TVLinearLayoutManager tVLinearLayoutManager = this.u0;
        this.v0 = tVLinearLayoutManager != null ? tVLinearLayoutManager.p0() : null;
        tc0 tc0Var = this.t0;
        if (tc0Var != null) {
            bundle.putLong("PartnerSelectedItemId", ((bi7) tc0Var.k).a);
        }
        Parcelable parcelable = this.v0;
        if (parcelable != null) {
            bundle.putParcelable("partnerListState", parcelable);
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        boolean z = this.z0 != null;
        if (menuItem.getItemId() == R.id.bottom_drawer_trigger_button) {
            if (z) {
                PListGroupID pListGroupID = this.A0;
                long jPListGroupID_GetInternalID = PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID.a, pListGroupID);
                cc0 cc0Var = new cc0();
                Bundle bundle = new Bundle();
                bundle.putLong("GroupId", jPListGroupID_GetInternalID);
                cc0Var.u0(bundle);
                cc0Var.E0(p0().D(), "bottom_sheet_fragment");
                K0();
                return true;
            }
            if (!z) {
                d82.t(r0(), R.string.tv_unexpected_options_menu_item_selected);
                ye4.c("BuddyListGroupFragment1", "Cannot handle selected options item, illegal state!");
                return true;
            }
        }
        return false;
    }

    @Override // o.ye0, o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        super.u(menu, menuInflater);
        menuInflater.inflate(R.menu.buddylistgroup_trigger_options, menu);
    }
}
