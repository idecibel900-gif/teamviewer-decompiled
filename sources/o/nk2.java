package o;

import android.content.IntentFilter;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/nk2;", "Lo/ik2;", "<init>", "()V", "o/mk2", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nk2 extends ik2 {
    public static final /* synthetic */ int b1 = 0;
    public ns X0;
    public boolean Y0;
    public final b6 Z0 = new b6(this, 6);
    public final c6 a1 = new c6(11);

    @Override // o.ik2, o.fv2
    public final hk7 C0(String str) {
        str.getClass();
        if (str.equals("rename_file_positive")) {
            return this.Z0;
        }
        return str.equals("rename_file_negative") ? this.a1 : super.C0(str);
    }

    @Override // o.ik2
    public final boolean F0(MenuItem menuItem) {
        if (menuItem.getItemId() == mk2.Rename.m) {
            lk2 lk2Var = this.A0;
            if (lk2Var == null) {
                ye4.c("FileTransferLocalFragment", "onContextItemSelected: adapter is null");
                return true;
            }
            nk7 nk7Var = (nk7) lv0.p0(this.V0, lk2Var.f1370o);
            if (nk7Var == null) {
                ye4.c("FileTransferLocalFragment", "onContextItemSelected: File is NULL");
                return true;
            }
            if (nv1.d == null) {
                im3.e0("dialogFactory");
                throw null;
            }
            fs7 fs7VarE = yi5.e(nk7Var.m);
            if (nk7Var.n == lk7.n) {
                fs7VarE.F0 = R.string.tv_filetransfer_rename_dialog_header_file;
            } else {
                fs7VarE.F0 = R.string.tv_filetransfer_rename_dialog_header_folder;
            }
            fs7VarE.K0 = R.string.tv_filetransfer_rename_positive;
            fs7VarE.O0 = R.string.tv_cancel;
            this.G0 = nk7Var;
            D0("rename_file_positive", new r02(fs7VarE, p02.Positive));
            D0("rename_file_negative", new r02(fs7VarE, p02.Negative));
            gk7.O0(fs7VarE, C());
            return true;
        }
        if (menuItem.getItemId() == mk2.Delete.m) {
            lk2 lk2Var2 = this.A0;
            if (lk2Var2 != null) {
                nk7 nk7Var2 = (nk7) lv0.p0(this.V0, lk2Var2.f1370o);
                if (nk7Var2 == null) {
                    ye4.c("FileTransferLocalFragment", "onContextItemSelected: File is NULL");
                    return true;
                }
                this.D0 = nk7Var2.f1575o;
                x02 x02VarA = ik7.a();
                gk7 gk7Var = new gk7();
                fx3.o(1, "dialogId", x02VarA, gk7Var);
                gk7Var.Z0 = x02VarA;
                gk7Var.H0 = R.string.tv_filetransfer_delete_dialog_body;
                gk7Var.F0 = R.string.tv_filetransfer_delete_dialog_header;
                gk7Var.a1 = true;
                gk7Var.K0 = R.string.tv_yes;
                gk7Var.O0 = R.string.tv_no;
                D0("delete_file_positive", new r02(gk7Var, p02.Positive));
                D0("delete_file_negative", new r02(gk7Var, p02.Negative));
                gk7.O0(gk7Var, C());
                return true;
            }
            ye4.c("FileTransferLocalFragment", "onContextItemSelected: adapter is null");
        }
        return true;
    }

    @Override // o.ik2
    public final void G0(ContextMenu contextMenu) {
        ListView listView = this.v0;
        ListAdapter adapter = listView != null ? listView.getAdapter() : null;
        lk2 lk2Var = adapter instanceof lk2 ? (lk2) adapter : null;
        nk7 nk7Var = lk2Var != null ? (nk7) lv0.p0(this.V0, lk2Var.f1370o) : null;
        if (nk7Var != null) {
            contextMenu.setHeaderTitle(nk7Var.m);
        }
        contextMenu.add(0, mk2.Rename.m, 0, R.string.tv_filetransfer_context_rename);
        contextMenu.add(0, mk2.Delete.m, 0, R.string.tv_filetransfer_context_delete);
    }

    @Override // o.ik2
    public final wk2 H0(xt2 xt2Var) {
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        m26 m26Var = new m26(au2Var, (byte) 4);
        ve8 ve8VarO = xt2Var.getG0();
        bf1 bf1VarK = h57.k(xt2Var);
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, m26Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(cd4.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            return (wk2) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // o.ik2
    public final int I0() {
        return R.menu.filetransfer_menu_local;
    }

    @Override // o.ik2
    public final String J0() {
        String string = H().getString(R.string.tv_filetransfer_dropdown_switch_to_remote);
        string.getClass();
        return string;
    }

    @Override // o.ik2
    public final void K0() {
        View viewFindViewById;
        View view = this.y0;
        this.w0 = view != null ? view.findViewById(R.id.filetransfer_switch_to_remote) : null;
        View view2 = this.y0;
        this.x0 = view2 != null ? view2.findViewById(R.id.filetransfer_bubble_switch_to_remote) : null;
        View view3 = this.y0;
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.filetransfer_switch_to_local)) == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
    }

    @Override // o.ik2
    public final void M0() {
        m6 m6Var = (m6) C();
        if (m6Var != null) {
            m6Var.J();
        }
    }

    @Override // o.ik2
    public final void N0() {
        pk2 pk2Var = this.z0;
        if (pk2Var != null) {
            pk2Var.b(R.dimen.filetransfer_clip_offset_right_x2);
        }
    }

    @Override // o.ik2, o.fv2, o.ut2
    public final void b0() {
        super.b0();
        this.X0 = null;
    }

    @Override // o.ik2, o.fv2, o.ut2
    public final void f0() {
        super.f0();
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            ns nsVar = this.X0;
            if (nsVar == null || !this.Y0) {
                ye4.c("FileTransferLocalFragment", "unregisterSDCardStateChangeListener(): Activity is NULL");
            } else {
                xt2VarC.unregisterReceiver(nsVar);
                this.Y0 = false;
            }
        }
    }

    @Override // o.ik2, o.fv2, o.ut2
    public final void g0() {
        super.g0();
        wk2 wk2Var = this.F0;
        if (wk2Var != null) {
            wk2Var.j1(wk2Var.f2421o.i());
        }
        this.X0 = new ns(this, (byte) 3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addDataScheme("file");
        xt2 xt2VarC = C();
        if (xt2VarC == null) {
            ye4.c("FileTransferLocalFragment", "registerSDCardStateChangeListener(): Activity is NULL");
        } else {
            xt2VarC.registerReceiver(this.X0, intentFilter);
            this.Y0 = true;
        }
    }
}
