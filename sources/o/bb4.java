package o;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/bb4;", "Lo/gk7;", "<init>", "()V", "o/ab4", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bb4 extends gk7 {
    public static final SparseArray h1 = new SparseArray(1);
    public int e1;
    public ListAdapter f1;
    public DialogInterface.OnClickListener g1;

    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        int i = bundle != null ? bundle.getInt("WRAPPER_KEY") : q0().getInt("WRAPPER_KEY");
        this.e1 = i;
        SparseArray sparseArray = h1;
        ab4 ab4Var = (ab4) sparseArray.get(i);
        if (ab4Var != null) {
            this.f1 = ab4Var.a;
            this.g1 = ab4Var.b;
            sparseArray.delete(this.e1);
        } else {
            ye4.a.g("ListDialogFragment", "no saved instance entry!");
        }
        if (sparseArray.size() != 0) {
            ye4.c("ListDialogFragment", "Memory Leak!? Currently only one instance of this fragment is allowed at any time");
        }
        super.X(bundle);
        if (this.f1 == null) {
            ye4.c("ListDialogFragment", "no adapter set!");
            return;
        }
        ListView listView = new ListView(E());
        listView.setAdapter(this.f1);
        listView.setDivider(null);
        listView.setPadding(0, H().getDimensionPixelSize(R.dimen.material_list_padding_vertical), 0, H().getDimensionPixelSize(R.dimen.material_list_padding_vertical));
        listView.setOnItemClickListener(new fk2(this, (byte) 1));
        this.Y0 = false;
        K0(listView);
    }

    @Override // o.ut2
    public final void a0() {
        this.f1 = null;
        this.g1 = null;
        this.S = true;
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        ab4 ab4Var = new ab4(this.f1, this.g1);
        bundle.putInt("WRAPPER_KEY", this.e1);
        h1.put(this.e1, ab4Var);
        super.h0(bundle);
    }

    @Override // o.v02, o.ut2
    public final void i0() {
        super.i0();
        h1.delete(this.e1);
    }
}
