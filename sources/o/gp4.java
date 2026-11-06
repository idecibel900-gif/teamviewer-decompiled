package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gp4 extends BaseAdapter {
    public final jp4 m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f912o;
    public final boolean p;
    public final LayoutInflater q;
    public final int r;

    public gp4(jp4 jp4Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.p = z;
        this.q = layoutInflater;
        this.m = jp4Var;
        this.r = i;
        a();
    }

    public final void a() {
        jp4 jp4Var = this.m;
        pp4 pp4Var = jp4Var.v;
        if (pp4Var != null) {
            jp4Var.k();
            ArrayList arrayList = jp4Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((pp4) arrayList.get(i)) == pp4Var) {
                    this.n = i;
                    return;
                }
            }
        }
        this.n = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pp4 getItem(int i) {
        ArrayList arrayListN;
        boolean z = this.p;
        jp4 jp4Var = this.m;
        if (z) {
            jp4Var.k();
            arrayListN = jp4Var.j;
        } else {
            arrayListN = jp4Var.n();
        }
        int i2 = this.n;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (pp4) arrayListN.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListN;
        boolean z = this.p;
        jp4 jp4Var = this.m;
        if (z) {
            jp4Var.k();
            arrayListN = jp4Var.j;
        } else {
            arrayListN = jp4Var.n();
        }
        return this.n < 0 ? arrayListN.size() : arrayListN.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.q.inflate(this.r, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.m.o() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        iq4 iq4Var = (iq4) view;
        if (this.f912o) {
            listMenuItemView.setForceShowIcon(true);
        }
        iq4Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
