package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wb4 extends BaseAdapter {
    public int m = -1;
    public final /* synthetic */ xb4 n;

    public wb4(xb4 xb4Var) {
        this.n = xb4Var;
        a();
    }

    public final void a() {
        jp4 jp4Var = this.n.f2503o;
        pp4 pp4Var = jp4Var.v;
        if (pp4Var != null) {
            jp4Var.k();
            ArrayList arrayList = jp4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((pp4) arrayList.get(i)) == pp4Var) {
                    this.m = i;
                    return;
                }
            }
        }
        this.m = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pp4 getItem(int i) {
        jp4 jp4Var = this.n.f2503o;
        jp4Var.k();
        ArrayList arrayList = jp4Var.j;
        int i2 = this.m;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (pp4) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        jp4 jp4Var = this.n.f2503o;
        jp4Var.k();
        int size = jp4Var.j.size();
        return this.m < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.n.n.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((iq4) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
