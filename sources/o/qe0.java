package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.gui.view.picture.AccountPictureView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberIdSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends w implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final ge0 G;
    public final ze0 H;
    public final TextView I;
    public final ImageView J;
    public final ImageButton K;
    public final AccountPictureView L;
    public final View M;
    public final View N;
    public final View O;
    public g1 P;
    public GroupMemberId Q;
    public final l07 R;
    public final VoidSignalCallback S;
    public final xc0 T;
    public final pe0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(View view, ge0 ge0Var, ze0 ze0Var) {
        super(view);
        ge0Var.getClass();
        ze0Var.getClass();
        this.G = ge0Var;
        this.H = ze0Var;
        View viewFindViewById = view.findViewById(R.id.buddy_name);
        viewFindViewById.getClass();
        this.I = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.buddy_icon);
        viewFindViewById2.getClass();
        this.J = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.connect_button_partner);
        viewFindViewById3.getClass();
        this.K = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.buddy_account_picture_view);
        viewFindViewById4.getClass();
        this.L = (AccountPictureView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.buddy_connect_button_container);
        viewFindViewById5.getClass();
        this.M = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.buddy_wake_up_button_container);
        viewFindViewById6.getClass();
        this.N = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.buddy_start_app_button_container);
        viewFindViewById7.getClass();
        this.O = viewFindViewById7;
        ep3 ep3Var = it1.c;
        if (ep3Var == null) {
            im3.e0("viewFactory");
            throw null;
        }
        this.R = ep3Var.p();
        view.findViewById(R.id.tableRow).setOnClickListener(this);
        view.addOnAttachStateChangeListener(this);
        this.S = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 22));
        this.T = new xc0(this, (byte) 3);
        this.U = new pe0(this, (byte) 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        g1 g1Var = this.P;
        if (g1Var != null) {
            t33 t33VarB1 = g1Var.b1();
            GroupMemberId groupMemberId = this.Q;
            if (groupMemberId != null) {
                long jGroupMemberId_getMemberId = GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(groupMemberId.a, groupMemberId);
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                fv1 fv1Var = new fv1();
                Bundle bundle = new Bundle();
                bundle.putSerializable("memberType", t33VarB1);
                bundle.putLong("memberId", jGroupMemberId_getMemberId);
                fv1Var.u0(bundle);
                this.H.x(fv1Var);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        g1 g1Var;
        view.getClass();
        VoidSignalCallback voidSignalCallback = this.S;
        if (voidSignalCallback.IsConnected() || (g1Var = this.P) == null) {
            return;
        }
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.S.Disconnect();
        this.U.Disconnect();
    }

    @Override // o.fl6
    public final void r(g1 g1Var, GroupMemberId groupMemberId, long j) {
        if (g1Var == null) {
            return;
        }
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        this.P = g1Var;
        this.Q = groupMemberId;
        boolean zGroupMemberListElementViewModel_IsOnline = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsOnline(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        int i = R.color.colorPartnerNameOnline;
        if (!zGroupMemberListElementViewModel_IsOnline && !GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsMobileWakeActive(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
            i = R.color.colorPartnerNameOffline;
        }
        View view = this.m;
        this.I.setTextColor(view.getContext().getColor(i));
        boolean zGroupMemberListElementViewModel_IsOnline2 = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsOnline(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        int i2 = R.color.connectIconOnlineColor;
        if (!zGroupMemberListElementViewModel_IsOnline2 && !GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsMobileWakeActive(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
            i2 = R.color.connectIconOfflineColor;
        }
        this.K.setColorFilter(view.getContext().getColor(i2), PorterDuff.Mode.SRC_IN);
        v(false);
        g1 g1Var2 = this.P;
        view.setActivated((g1Var2 != null ? g1Var2.a1() : 0L) == j);
    }

    @Override // o.fl6
    public final void s(qb3 qb3Var, ManagedDevicesV2MemberId managedDevicesV2MemberId, long j, String str) {
    }

    public final void t(String str) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.L0(str);
        gk7Var.O0 = R.string.tv_ok;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        this.H.g(gk7Var);
    }

    public final void u(int i) {
        String strGroupMemberListElementViewModel_GetName;
        Context context = this.m.getContext();
        g1 g1Var = this.P;
        if (g1Var != null) {
            GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
            strGroupMemberListElementViewModel_GetName = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetName(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
            strGroupMemberListElementViewModel_GetName.getClass();
        } else {
            strGroupMemberListElementViewModel_GetName = "";
        }
        String string = context.getString(i, strGroupMemberListElementViewModel_GetName);
        string.getClass();
        t(string);
    }

    public final void v(boolean z) {
        Object next;
        int i;
        final g1 g1Var = this.P;
        if (g1Var == null) {
            return;
        }
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        int i2 = oe0.a[g1Var.b1().ordinal()];
        final byte b = 1;
        ImageView imageView = this.J;
        AccountPictureView accountPictureView = this.L;
        final byte b2 = 0;
        if (i2 == 1) {
            imageView.setVisibility(8);
            String strGroupMemberListElementViewModel_GetAccountPictureUrl = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetAccountPictureUrl(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
            strGroupMemberListElementViewModel_GetAccountPictureUrl.getClass();
            z06 z06Var = x4.f2479o;
            ViewModelOnlineState viewModelOnlineStateSwigToEnum = ViewModelOnlineState.swigToEnum(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetOnlineState(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
            viewModelOnlineStateSwigToEnum.getClass();
            z06Var.getClass();
            Iterator it = x4.r.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((x4) next).m != viewModelOnlineStateSwigToEnum);
            x4 x4Var = (x4) next;
            if (x4Var == null) {
                x4Var = x4.NOSTATE;
            }
            accountPictureView.getClass();
            x4Var.getClass();
            RoundAccountPictureImageView roundAccountPictureImageView = accountPictureView.m;
            if (roundAccountPictureImageView != null) {
                roundAccountPictureImageView.a(strGroupMemberListElementViewModel_GetAccountPictureUrl, z);
            }
            accountPictureView.setOnlineState(x4Var);
            accountPictureView.setVisibility(0);
        } else if (i2 != 2) {
            ye4.a.b("BuddyLPItemViewHolder", "Unsupported view model type.");
        } else {
            accountPictureView.setVisibility(8);
            if (GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsOnline(groupMemberListElementViewModel.a, groupMemberListElementViewModel)) {
                i = R.drawable.device_with_online_state;
            } else {
                i = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsMobileWakeActive(groupMemberListElementViewModel.a, groupMemberListElementViewModel) ? R.drawable.device_with_away_state : R.drawable.device_with_offline_state;
            }
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
        String strGroupMemberListElementViewModel_GetName = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetName(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        strGroupMemberListElementViewModel_GetName.getClass();
        this.I.setText(strGroupMemberListElementViewModel_GetName);
        boolean zGroupMemberListElementViewModel_ShowConnect = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnect(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        View view = this.M;
        if (zGroupMemberListElementViewModel_ShowConnect) {
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ne0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b3 = b2;
                    qe0 qe0Var = this;
                    g1 g1Var2 = g1Var;
                    switch (b3) {
                        case 0:
                            g1Var2.X0(qe0Var.T);
                            qe0Var.G.j();
                            break;
                        default:
                            GroupMemberListElementViewModel groupMemberListElementViewModel2 = g1Var2.n;
                            GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_WakeOnLan(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2);
                            qe0Var.G.j();
                            IStatisticsHandler iStatisticsHandler = ga7.a;
                            ga7.a(dh8.WakeUpFromDeviceList);
                            break;
                    }
                }
            });
        } else {
            view.setVisibility(8);
        }
        boolean zGroupMemberListElementViewModel_ShowWakeOnLan = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowWakeOnLan(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        View view2 = this.N;
        if (zGroupMemberListElementViewModel_ShowWakeOnLan) {
            view2.setVisibility(0);
            view2.setOnClickListener(new View.OnClickListener() { // from class: o.ne0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    byte b3 = b;
                    qe0 qe0Var = this;
                    g1 g1Var2 = g1Var;
                    switch (b3) {
                        case 0:
                            g1Var2.X0(qe0Var.T);
                            qe0Var.G.j();
                            break;
                        default:
                            GroupMemberListElementViewModel groupMemberListElementViewModel2 = g1Var2.n;
                            GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_WakeOnLan(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2);
                            qe0Var.G.j();
                            IStatisticsHandler iStatisticsHandler = ga7.a;
                            ga7.a(dh8.WakeUpFromDeviceList);
                            break;
                    }
                }
            });
        } else {
            view2.setVisibility(8);
        }
        boolean zGroupMemberListElementViewModel_ShowStartApp = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowStartApp(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        View view3 = this.O;
        if (zGroupMemberListElementViewModel_ShowStartApp) {
            view3.setVisibility(0);
        } else {
            view3.setVisibility(8);
        }
    }
}
