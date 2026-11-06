package o;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/ok2;", "Lo/ik2;", "<init>", "()V", "o/cr", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ok2 extends ik2 {
    public static final /* synthetic */ int X0 = 0;

    @Override // o.ik2
    public final boolean F0(MenuItem menuItem) {
        return false;
    }

    @Override // o.ik2
    public final void G0(ContextMenu contextMenu) {
    }

    @Override // o.ik2
    public final wk2 H0(xt2 xt2Var) {
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        m26 m26Var = new m26(au2Var, (byte) 5);
        ve8 ve8VarO = xt2Var.getG0();
        bf1 bf1VarK = h57.k(xt2Var);
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, m26Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(da6.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            return (wk2) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // o.ik2
    public final int I0() {
        return R.menu.filetransfer_menu_remote;
    }

    @Override // o.ik2
    public final String J0() {
        String string = H().getString(R.string.tv_filetransfer_dropdown_switch_to_local);
        string.getClass();
        return string;
    }

    @Override // o.ik2
    public final void K0() {
        View viewFindViewById;
        View view = this.y0;
        this.w0 = view != null ? view.findViewById(R.id.filetransfer_switch_to_local) : null;
        View view2 = this.y0;
        this.x0 = view2 != null ? view2.findViewById(R.id.filetransfer_bubble_switch_to_local) : null;
        View view3 = this.y0;
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.filetransfer_switch_to_remote)) == null) {
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
            pk2Var.b(R.dimen.filetransfer_clip_offset_right_x);
        }
    }
}
