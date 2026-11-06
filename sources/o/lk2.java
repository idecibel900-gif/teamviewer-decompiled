package o;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lk2 extends BaseAdapter {
    public final Activity m;
    public final ListView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1370o;
    public final ek2 p;
    public boolean q;
    public final ek2 r;

    public lk2(xt2 xt2Var, ListView listView, List list, ek2 ek2Var, boolean z, ek2 ek2Var2) {
        list.getClass();
        ek2Var.getClass();
        ek2Var2.getClass();
        this.m = xt2Var;
        this.n = listView;
        this.f1370o = list;
        this.p = ek2Var;
        this.q = z;
        this.r = ek2Var2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1370o.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (nk7) lv0.p0(i, this.f1370o);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final synchronized View getView(final int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        try {
            d11 d11VarC = d11.C(LayoutInflater.from(this.m), viewGroup);
            ((TextView) d11VarC.q).setText(((nk7) this.f1370o.get(i)).m);
            ((LinearLayout) d11VarC.r).setOnClickListener(new jk2(this, d11VarC, i));
            ((LinearLayout) d11VarC.r).setOnLongClickListener(new View.OnLongClickListener() { // from class: o.kk2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    lk2 lk2Var = this.a;
                    lk2Var.r.a.V0 = i;
                    ListView listView = lk2Var.n;
                    return listView != null && listView.showContextMenu();
                }
            });
            boolean z = this.q;
            LinearLayout linearLayout2 = (LinearLayout) d11VarC.f578o;
            if (z) {
                linearLayout2.setVisibility(0);
                ((CheckBox) d11VarC.n).setChecked(((nk7) this.f1370o.get(i)).q);
                ((LinearLayout) d11VarC.f578o).setOnClickListener(new jk2((CheckBox) d11VarC.n, this, i));
            } else {
                linearLayout2.setVisibility(4);
                ((LinearLayout) d11VarC.f578o).setOnClickListener(null);
            }
            int iOrdinal = ((nk7) this.f1370o.get(i)).n.ordinal();
            if (iOrdinal == 0) {
                ((ImageView) d11VarC.p).setImageResource(R.drawable.filetransfer_icon_folder);
            } else if (iOrdinal == 1) {
                ((ImageView) d11VarC.p).setImageResource(R.drawable.filetransfer_icon_file);
            } else {
                if (iOrdinal != 2) {
                    throw new w35();
                }
                ((ImageView) d11VarC.p).setImageResource(R.drawable.filetransfer_icon_folder);
                ((LinearLayout) d11VarC.f578o).setVisibility(4);
                ((LinearLayout) d11VarC.f578o).setOnClickListener(null);
            }
            linearLayout = (LinearLayout) d11VarC.m;
            linearLayout.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return linearLayout;
    }
}
