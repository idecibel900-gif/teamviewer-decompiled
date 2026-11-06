package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ut2 n;

    public /* synthetic */ fk2(ut2 ut2Var, byte b) {
        this.m = b;
        this.n = ut2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.m;
        ut2 ut2Var = this.n;
        switch (b) {
            case 0:
                ik2 ik2Var = (ik2) ut2Var;
                wk2 wk2Var = ik2Var.F0;
                if (wk2Var != null && wk2Var.s) {
                    ye4.a("FileTransferFragment", "item click not processed");
                } else {
                    ik2Var.V0 = i;
                    lk2 lk2Var = ik2Var.A0;
                    if (lk2Var != null) {
                        nk7 nk7Var = (nk7) lv0.p0(i, lk2Var.f1370o);
                        wk2 wk2Var2 = ik2Var.F0;
                        if (wk2Var2 != null) {
                            if (nk7Var != null) {
                                lk7 lk7Var = nk7Var.n;
                                if (lk7Var == lk7.m || lk7Var == lk7.f1374o) {
                                    wk2Var2.g1(nk7Var.f1575o, new xk1((Object) wk2Var2, (byte) 18));
                                } else {
                                    wk2Var2.h1(nk7Var);
                                }
                            } else {
                                ye4.a("FileTransferVM", "open(): TVFile is NULL");
                            }
                        }
                    } else {
                        ye4.c("FileTransferFragment", "open: adapter is null");
                    }
                }
                break;
            default:
                bb4 bb4Var = (bb4) ut2Var;
                DialogInterface.OnClickListener onClickListener = bb4Var.g1;
                if (onClickListener != null) {
                    onClickListener.onClick(bb4Var.A0, i);
                } else {
                    ye4.c("ListDialogFragment", "ClickListener is null!");
                }
                bb4Var.A0();
                break;
        }
    }
}
