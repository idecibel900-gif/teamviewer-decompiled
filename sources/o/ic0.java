package o;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Spinner;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/ic0;", "Lo/zb0;", "Lo/eb3;", "Lo/db3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ic0 extends zb0 implements eb3, db3 {
    public static final /* synthetic */ int C0 = 0;
    public final fc0 A0;
    public final fc0 B0;
    public long s0;
    public int u0;
    public Spinner v0;
    public boolean w0;
    public boolean x0;
    public PListGroupID t0 = new PListGroupID(0);
    public final gc0 y0 = new gc0(this, (byte) 0);
    public final hc0 z0 = new hc0(this, (byte) 0);

    /* JADX WARN: Type inference failed for: r0v3, types: [o.fc0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.fc0] */
    public ic0() {
        final byte b = 0;
        this.A0 = new hk7(this) { // from class: o.fc0
            public final /* synthetic */ ic0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b2 = b;
                ic0 ic0Var = this.b;
                switch (b2) {
                    case 0:
                        int i = ic0.C0;
                        gk7Var.A0();
                        if (!ic0Var.J0()) {
                            d82.t(ic0Var.r0(), R.string.tv_toastSavingFailedItemNotEditable);
                        } else {
                            ic0Var.K0();
                        }
                        break;
                    default:
                        int i2 = ic0.C0;
                        gk7Var.A0();
                        bb5 bb5Var = ic0Var.r0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.B0 = new hk7(this) { // from class: o.fc0
            public final /* synthetic */ ic0 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                ic0 ic0Var = this.b;
                switch (b3) {
                    case 0:
                        int i = ic0.C0;
                        gk7Var.A0();
                        if (!ic0Var.J0()) {
                            d82.t(ic0Var.r0(), R.string.tv_toastSavingFailedItemNotEditable);
                        } else {
                            ic0Var.K0();
                        }
                        break;
                    default:
                        int i2 = ic0.C0;
                        gk7Var.A0();
                        bb5 bb5Var = ic0Var.r0;
                        if (bb5Var != null) {
                            bb5Var.G0();
                        }
                        break;
                }
            }
        };
    }

    @Override // o.zb0, o.fv2
    public hk7 C0(String str) {
        str.getClass();
        if (str.equals("really_save_positive")) {
            return this.A0;
        }
        if (str.equals("really_save_negative")) {
            return this.B0;
        }
        return null;
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        View view = this.U;
        if (view == null) {
            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            return;
        }
        Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final boolean I0() {
        if (!this.w0) {
            return false;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.F0 = R.string.tv_popupSaveChangesHead;
        gk7Var.H0 = R.string.tv_popupSaveChanges;
        gk7Var.K0 = R.string.tv_yes;
        gk7Var.O0 = R.string.tv_no;
        D0("really_save_positive", new r02(gk7Var, p02.Positive));
        D0("really_save_negative", new r02(gk7Var, p02.Negative));
        gk7.O0(gk7Var, C());
        return true;
    }

    public abstract boolean J0();

    public abstract void K0();

    public abstract boolean L0();

    public final void M0(Bundle bundle) {
        if (bundle != null) {
            this.s0 = bundle.getLong("BuddyId", 0L);
            this.u0 = bundle.getInt("SelectedItem", 0);
            this.w0 = bundle.getBoolean("Changed", false);
            this.t0 = new PListGroupID(bundle.getLong("Group", 0L));
        }
    }

    @Override // o.ut2
    public boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        H0();
        if (menuItem.getItemId() != R.id.saveBuddy) {
            if (menuItem.getItemId() != R.id.cancelBuddy) {
                return false;
            }
            bb5 bb5Var = this.r0;
            if (bb5Var != null) {
                bb5Var.G0();
            }
            return true;
        }
        if (!L0()) {
            d82.t(r0(), R.string.tv_unexpected_options_menu_item_selected);
            ye4.c("BuddyAbstEditFragment", "Cannot handle selected options item, illegal state!");
            return true;
        }
        if (J0()) {
            K0();
            return true;
        }
        d82.t(r0(), R.string.tv_toastSavingFailedItemNotEditable);
        return true;
    }

    @Override // o.eb3
    public final boolean g() {
        H0();
        return I0();
    }

    @Override // o.fv2, o.ut2
    public void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("BuddyId", this.s0);
        PListGroupID pListGroupID = this.t0;
        bundle.putLong("Group", PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID.a, pListGroupID));
        bundle.putBoolean("Changed", this.w0);
        Spinner spinner = this.v0;
        if (spinner != null) {
            bundle.putInt("SelectedItem", spinner.getSelectedItemPosition());
        }
    }

    @Override // o.ut2
    public void i0() {
        this.S = true;
        Spinner spinner = this.v0;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this.y0);
        }
    }

    @Override // o.ut2
    public final void u0(Bundle bundle) {
        super.u0(bundle);
        if (bundle != null) {
            this.s0 = bundle.getLong("BuddyId", 0L);
            this.t0 = new PListGroupID(bundle.getLong("Group", 0L));
            this.x0 = bundle.getBoolean("ExpandToolbar", false);
        }
    }

    @Override // o.db3
    public final boolean v() {
        return I0();
    }
}
