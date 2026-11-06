package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class jt implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ jt(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                lt ltVar = (lt) obj;
                ot otVar = ltVar.R;
                otVar.setSelection(i);
                if (otVar.getOnItemClickListener() != null) {
                    otVar.performItemClick(view, i, ltVar.O.getItemId(i));
                }
                ltVar.dismiss();
                break;
            case 1:
                gn4 gn4Var = (gn4) obj;
                ac4 ac4Var = gn4Var.q;
                if (i < 0) {
                    item = !ac4Var.K.isShowing() ? null : ac4Var.f313o.getSelectedItem();
                } else {
                    item = gn4Var.getAdapter().getItem(i);
                }
                gn4Var.b(item);
                AdapterView.OnItemClickListener onItemClickListener = gn4Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !ac4Var.K.isShowing() ? null : ac4Var.f313o.getSelectedView();
                        i = !ac4Var.K.isShowing() ? -1 : ac4Var.f313o.getSelectedItemPosition();
                        j = !ac4Var.K.isShowing() ? Long.MIN_VALUE : ac4Var.f313o.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(ac4Var.f313o, view, i, j);
                }
                ac4Var.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
