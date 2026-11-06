package o;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/ie0;", "Lo/zb0;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ie0 extends zb0 {
    public static final /* synthetic */ int H0 = 0;
    public View A0;
    public FloatingActionButton B0;
    public final b6 C0 = new b6(this, 4);
    public final c6 D0 = new c6(6);
    public final io.sentry.android.core.p2 E0 = new io.sentry.android.core.p2(this, 4);
    public final VoidSignalCallback F0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new he0(this, (byte) 0));
    public final cj3 G0 = new cj3(this);
    public ke0 s0;
    public RoundAccountPictureImageView t0;
    public TextView u0;
    public TextView v0;
    public long w0;
    public String x0;
    public String y0;
    public boolean z0;

    @Override // o.zb0, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        if (str.equals("delete_partner_positive")) {
            return this.C0;
        }
        if (str.equals("delete_partner_negative")) {
            return this.D0;
        }
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        String strContactDetailsViewModel_GetNote;
        ke0 ke0Var = this.s0;
        if (ke0Var == null) {
            return;
        }
        ContactDetailsViewModel contactDetailsViewModel = ke0Var.n;
        GroupListElementViewModel groupListElementViewModelK = ds1.k(new PListGroupID(0, ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_GetGroupID(contactDetailsViewModel.a, contactDetailsViewModel)));
        if (groupListElementViewModelK != null) {
            this.x0 = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK);
        }
        ke0 ke0Var2 = this.s0;
        if (ke0Var2 != null) {
            ContactDetailsViewModel contactDetailsViewModel2 = ke0Var2.n;
            strContactDetailsViewModel_GetNote = ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_GetNote(contactDetailsViewModel2.a, contactDetailsViewModel2);
            strContactDetailsViewModel_GetNote.getClass();
        } else {
            strContactDetailsViewModel_GetNote = null;
        }
        this.y0 = strContactDetailsViewModel_GetNote;
    }

    public final void I0() {
        ViewModelOnlineState viewModelOnlineStateSwigToEnum;
        Object next;
        String strContactDetailsViewModel_GetAccountPictureUrl;
        String strContactDetailsViewModel_GetDisplayName;
        if (this.s0 == null) {
            return;
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            ke0 ke0Var = this.s0;
            if (ke0Var != null) {
                ContactDetailsViewModel contactDetailsViewModel = ke0Var.n;
                strContactDetailsViewModel_GetDisplayName = ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_GetDisplayName(contactDetailsViewModel.a, contactDetailsViewModel);
                strContactDetailsViewModel_GetDisplayName.getClass();
            } else {
                strContactDetailsViewModel_GetDisplayName = null;
            }
            xt2VarC.setTitle(strContactDetailsViewModel_GetDisplayName);
        }
        RoundAccountPictureImageView roundAccountPictureImageView = this.t0;
        if (roundAccountPictureImageView != null) {
            ke0 ke0Var2 = this.s0;
            if (ke0Var2 != null) {
                ContactDetailsViewModel contactDetailsViewModel2 = ke0Var2.n;
                strContactDetailsViewModel_GetAccountPictureUrl = ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_GetAccountPictureUrl(contactDetailsViewModel2.a, contactDetailsViewModel2);
                strContactDetailsViewModel_GetAccountPictureUrl.getClass();
            } else {
                strContactDetailsViewModel_GetAccountPictureUrl = null;
            }
            roundAccountPictureImageView.a(strContactDetailsViewModel_GetAccountPictureUrl, false);
        } else {
            ye4.c("BuddyPDetailsFragment", "Partner image view is not initialized");
        }
        yl7 yl7Var = y4.p;
        ke0 ke0Var3 = this.s0;
        if (ke0Var3 != null) {
            ContactDetailsViewModel contactDetailsViewModel3 = ke0Var3.n;
            viewModelOnlineStateSwigToEnum = ViewModelOnlineState.swigToEnum(ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_GetOnlineState(contactDetailsViewModel3.a, contactDetailsViewModel3));
            viewModelOnlineStateSwigToEnum.getClass();
        } else {
            viewModelOnlineStateSwigToEnum = null;
        }
        yl7Var.getClass();
        Iterator it = y4.w.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((y4) next).m != viewModelOnlineStateSwigToEnum);
        y4 y4Var = (y4) next;
        if (y4Var == null) {
            y4Var = y4.NOSTATE;
        }
        int i = y4Var.f2576o;
        String strI = i != 0 ? I(i) : "";
        strI.getClass();
        KeyEvent.Callback callbackC = C();
        fa3 fa3Var = callbackC instanceof fa3 ? (fa3) callbackC : null;
        if (fa3Var != null) {
            View viewFindViewById = ((MainActivity) fa3Var).findViewById(R.id.toolbar_subtitle);
            viewFindViewById.getClass();
            ((TextView) viewFindViewById).setText(strI);
        }
        TextView textView = this.u0;
        if (textView != null) {
            String str = this.x0;
            textView.setText(str != null ? str : "");
        }
        TextView textView2 = this.v0;
        if (textView2 != null) {
            textView2.setText(this.y0);
        }
        if (this.B0 == null) {
            ye4.c("BuddyPDetailsFragment", "FAB is not initialized");
            return;
        }
        ke0 ke0Var4 = this.s0;
        if (ke0Var4 != null) {
            ContactDetailsViewModel contactDetailsViewModel4 = ke0Var4.n;
            if (ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_ShowConnect(contactDetailsViewModel4.a, contactDetailsViewModel4)) {
                FloatingActionButton floatingActionButton = this.B0;
                if (floatingActionButton != null) {
                    floatingActionButton.setOnClickListener(this.E0);
                }
                FloatingActionButton floatingActionButton2 = this.B0;
                if (floatingActionButton2 != null) {
                    floatingActionButton2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        FloatingActionButton floatingActionButton3 = this.B0;
        if (floatingActionButton3 != null) {
            floatingActionButton3.setOnClickListener(null);
        }
        FloatingActionButton floatingActionButton4 = this.B0;
        if (floatingActionButton4 != null) {
            floatingActionButton4.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        Bundle bundle2;
        super.X(bundle);
        long j = 0;
        if (bundle != null) {
            long j2 = bundle.getLong("BuddyId", 0L);
            if (j2 != 0) {
                j = j2;
            } else {
                bundle2 = this.r;
                if (bundle2 != null) {
                    j = bundle2.getLong("BuddyId", 0L);
                }
            }
        } else {
            bundle2 = this.r;
            if (bundle2 != null) {
                j = bundle2.getLong("BuddyId", 0L);
            }
        }
        this.w0 = j;
        Bundle bundle3 = this.r;
        if (bundle3 != null) {
            this.z0 = bundle3.getBoolean("ExpandToolbar", false);
        }
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        ke0 ke0Var = this.s0;
        if (ke0Var != null) {
            ContactDetailsViewModel contactDetailsViewModel = ke0Var.n;
            if (ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_IsEditableByMe(contactDetailsViewModel.a, contactDetailsViewModel)) {
                menuInflater.inflate(R.menu.buddylistpartnerdetails_menu, menu);
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        ke0 ke0VarB = c36Var.b(p0(), this.w0);
        this.s0 = ke0VarB;
        if (ke0VarB == null) {
            v0(false);
            return null;
        }
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.q(gk6.m, this.z0);
        }
        v0(true);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buddylistpartnerdetails, viewGroup, false);
        if (C() instanceof fa3) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            RoundAccountPictureImageView roundAccountPictureImageView = new RoundAccountPictureImageView(r0());
            this.t0 = roundAccountPictureImageView;
            roundAccountPictureImageView.setLayoutParams(layoutParams);
            roundAccountPictureImageView.setPlaceHolder(2131230898);
            KeyEvent.Callback callbackC = C();
            callbackC.getClass();
            ((fa3) callbackC).setExpandedToolbarView(roundAccountPictureImageView);
        }
        if (C() instanceof pa3) {
            KeyEvent.Callback callbackC2 = C();
            callbackC2.getClass();
            CoordinatorLayout coordinatorLayoutU = ((MainActivity) ((pa3) callbackC2)).U();
            View viewInflate2 = layoutInflater.inflate(R.layout.partner_details_fab_actions, (ViewGroup) coordinatorLayoutU, false);
            this.A0 = viewInflate2;
            FloatingActionButton floatingActionButton = viewInflate2 != null ? (FloatingActionButton) viewInflate2.findViewById(R.id.partner_floating_action_button) : null;
            this.B0 = floatingActionButton;
            if (floatingActionButton != null) {
                floatingActionButton.setOnClickListener(this.E0);
            }
            coordinatorLayoutU.addView(this.A0);
        }
        this.u0 = (TextView) viewInflate.findViewById(R.id.partner_group);
        this.v0 = (TextView) viewInflate.findViewById(R.id.partner_notes);
        return viewInflate;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        KeyEvent.Callback callbackC = C();
        if (callbackC instanceof fa3) {
            MainActivity mainActivity = (MainActivity) ((fa3) callbackC);
            FrameLayout frameLayout = mainActivity.T;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            View viewFindViewById = mainActivity.findViewById(R.id.toolbar_subtitle);
            viewFindViewById.getClass();
            ((TextView) viewFindViewById).setText("");
        }
        if (callbackC instanceof pa3) {
            ((MainActivity) ((pa3) callbackC)).U().removeView(this.A0);
        }
        this.z0 = false;
        this.B0 = null;
        this.v0 = null;
        this.u0 = null;
        this.t0 = null;
        this.s0 = null;
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.editPartner) {
            bb5 bb5Var = this.r0;
            if (bb5Var == null) {
                return true;
            }
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            long j = this.w0;
            le0 le0Var = new le0();
            Bundle bundle = new Bundle();
            bundle.putLong("BuddyId", j);
            bundle.putBoolean("ExpandToolbar", false);
            le0Var.u0(bundle);
            bb5Var.I0(le0Var, true);
            return true;
        }
        if (menuItem.getItemId() != R.id.deletePartner) {
            return false;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.H0 = R.string.tv_partner_dialog_deleteBuddyBody;
        gk7Var.F0 = R.string.tv_partner_dialog_deleteBuddyHeader;
        gk7Var.O0 = R.string.tv_no;
        gk7Var.K0 = R.string.tv_yes;
        D0("delete_partner_positive", new r02(gk7Var, p02.Positive));
        D0("delete_partner_negative", new r02(gk7Var, p02.Negative));
        gk7.O0(gk7Var, C());
        return true;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("BuddyId", this.w0);
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        H0();
        I0();
        ke0 ke0Var = this.s0;
        if (ke0Var != null) {
            ContactDetailsViewModel contactDetailsViewModel = ke0Var.n;
            long j = contactDetailsViewModel.a;
            VoidSignalCallback voidSignalCallback = this.F0;
            ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_RegisterForChanges(j, contactDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
            ke0 ke0Var2 = this.s0;
            if (ke0Var2 != null) {
                he0 he0Var = new he0(this, (byte) 1);
                ContactDetailsViewModel contactDetailsViewModel2 = ke0Var2.n;
                jc0 jc0Var = new jc0(new WeakReference(he0Var), (byte) 1);
                ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_RegisterForGroupDelete(contactDetailsViewModel2.a, contactDetailsViewModel2, VoidSignalCallback.getCPtr((VoidSignalCallback) jc0Var), jc0Var);
            }
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        this.F0.Disconnect();
    }
}
