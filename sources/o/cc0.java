package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.google.android.material.navigation.NavigationView;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/cc0;", "Lo/t90;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cc0 extends t90 {
    public long F0;
    public s93 G0;
    public final ac0 H0;
    public final ac0 I0;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.ac0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.ac0] */
    public cc0() {
        final byte b = 0;
        this.H0 = new hk7(this) { // from class: o.ac0
            public final /* synthetic */ cc0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                GroupMemberListViewModel groupMemberListViewModel;
                byte b2 = b;
                cc0 cc0Var = this.b;
                switch (b2) {
                    case 0:
                        if (gk7Var instanceof fs7) {
                            s93 s93Var = cc0Var.G0;
                            if (s93Var != null) {
                                Context contextR0 = cc0Var.r0();
                                String strP0 = ((fs7) gk7Var).P0();
                                ec0 ec0Var = (ec0) s93Var;
                                strP0.getClass();
                                if (strP0.length() > 0 && (groupMemberListViewModel = ec0Var.n) != null) {
                                    vy2 vy2Var = new vy2(contextR0, "BuddyListBottomSheetViewModel", "rename group failed");
                                    GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RenameGroup(groupMemberListViewModel.a, groupMemberListViewModel, strP0, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
                                }
                            }
                        } else {
                            ye4.c("BuddyListBottomSheetFragment", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    default:
                        s93 s93Var2 = cc0Var.G0;
                        if (s93Var2 != null) {
                            Context contextR1 = cc0Var.r0();
                            GroupMemberListViewModel groupMemberListViewModel2 = ((ec0) s93Var2).n;
                            if (groupMemberListViewModel2 != null) {
                                vy2 vy2Var2 = new vy2(contextR1, "BuddyListBottomSheetViewModel", "remove group failed");
                                GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RemoveGroup(groupMemberListViewModel2.a, groupMemberListViewModel2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var2), vy2Var2);
                            }
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.I0 = new hk7(this) { // from class: o.ac0
            public final /* synthetic */ cc0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                GroupMemberListViewModel groupMemberListViewModel;
                byte b3 = b2;
                cc0 cc0Var = this.b;
                switch (b3) {
                    case 0:
                        if (gk7Var instanceof fs7) {
                            s93 s93Var = cc0Var.G0;
                            if (s93Var != null) {
                                Context contextR0 = cc0Var.r0();
                                String strP0 = ((fs7) gk7Var).P0();
                                ec0 ec0Var = (ec0) s93Var;
                                strP0.getClass();
                                if (strP0.length() > 0 && (groupMemberListViewModel = ec0Var.n) != null) {
                                    vy2 vy2Var = new vy2(contextR0, "BuddyListBottomSheetViewModel", "rename group failed");
                                    GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RenameGroup(groupMemberListViewModel.a, groupMemberListViewModel, strP0, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
                                }
                            }
                        } else {
                            ye4.c("BuddyListBottomSheetFragment", "dialog is not a text input dialog!");
                        }
                        gk7Var.A0();
                        break;
                    default:
                        s93 s93Var2 = cc0Var.G0;
                        if (s93Var2 != null) {
                            Context contextR1 = cc0Var.r0();
                            GroupMemberListViewModel groupMemberListViewModel2 = ((ec0) s93Var2).n;
                            if (groupMemberListViewModel2 != null) {
                                vy2 vy2Var2 = new vy2(contextR1, "BuddyListBottomSheetViewModel", "remove group failed");
                                GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_RemoveGroup(groupMemberListViewModel2.a, groupMemberListViewModel2, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var2), vy2Var2);
                            }
                        }
                        break;
                }
            }
        };
    }

    @Override // o.t90, o.ts, o.v02
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setOnShowListener(new bc0((byte) 0));
        return dialogC0;
    }

    @Override // o.v02, o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("GroupId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            jLongValue = bundle2 != null ? bundle2.getLong("GroupId") : 0L;
        }
        this.F0 = jLongValue;
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new x26(jLongValue, (byte) 0), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(ec0.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            this.G0 = (s93) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            hk0.g("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qf2 qf2Var;
        LiveData liveData;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylist_bottomsheet, viewGroup, false);
        int i = R.id.bottom_sheet_partner_list_nav_view;
        NavigationView navigationView = (NavigationView) r47.s(viewInflate, R.id.bottom_sheet_partner_list_nav_view);
        if (navigationView != null) {
            i = R.id.group_folder_id;
            if (((AppCompatImageView) r47.s(viewInflate, R.id.group_folder_id)) != null) {
                i = R.id.group_members_number_bottom_sheet_id;
                TextView textView = (TextView) r47.s(viewInflate, R.id.group_members_number_bottom_sheet_id);
                if (textView != null) {
                    i = R.id.group_title_bottom_sheet_id;
                    TextView textView2 = (TextView) r47.s(viewInflate, R.id.group_title_bottom_sheet_id);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        yt2 yt2Var = new yt2(linearLayout, navigationView, textView, textView2);
                        navigationView.setNavigationItemSelectedListener(new ar(this, (byte) 2));
                        s93 s93Var = this.G0;
                        byte b = 19;
                        if (s93Var != null && (liveData = ((ec0) s93Var).f702o) != null) {
                            liveData.observe(L(), new b7(new q0(yt2Var, (byte) 19), (byte) 3));
                        }
                        s93 s93Var2 = this.G0;
                        if (s93Var2 != null && (qf2Var = ((ec0) s93Var2).p) != null) {
                            qf2Var.observe(L(), new b7(new g0(yt2Var, this, b), (byte) 3));
                        }
                        linearLayout.getClass();
                        return linearLayout;
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putLong("GroupId", this.F0);
    }
}
