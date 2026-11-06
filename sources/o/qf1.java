package o;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class qf1 extends BaseAdapter implements Filterable {
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Cursor f1827o;
    public int p;
    public uy q;
    public pf1 r;
    public tf1 s;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1827o;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                uy uyVar = this.q;
                if (uyVar != null) {
                    cursor2.unregisterContentObserver(uyVar);
                }
                pf1 pf1Var = this.r;
                if (pf1Var != null) {
                    cursor2.unregisterDataSetObserver(pf1Var);
                }
            }
            this.f1827o = cursor;
            if (cursor != null) {
                uy uyVar2 = this.q;
                if (uyVar2 != null) {
                    cursor.registerContentObserver(uyVar2);
                }
                pf1 pf1Var2 = this.r;
                if (pf1Var2 != null) {
                    cursor.registerDataSetObserver(pf1Var2);
                }
                this.p = cursor.getColumnIndexOrThrow("_id");
                this.m = true;
                notifyDataSetChanged();
            } else {
                this.p = -1;
                this.m = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.m || (cursor = this.f1827o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.m) {
            return null;
        }
        this.f1827o.moveToPosition(i);
        if (view == null) {
            pe7 pe7Var = (pe7) this;
            view = pe7Var.v.inflate(pe7Var.u, viewGroup, false);
        }
        a(view, this.f1827o);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        tf1 tf1Var = this.s;
        if (tf1Var != null) {
            return tf1Var;
        }
        tf1 tf1Var2 = new tf1();
        tf1Var2.b = this;
        this.s = tf1Var2;
        return tf1Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.m || (cursor = this.f1827o) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1827o;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.m && (cursor = this.f1827o) != null && cursor.moveToPosition(i)) {
            return this.f1827o.getLong(this.p);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.m) {
            hk0.l("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f1827o.moveToPosition(i)) {
            hk0.l(fx3.e(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            pe7 pe7Var = (pe7) this;
            view = pe7Var.v.inflate(pe7Var.t, viewGroup, false);
            view.setTag(new oe7(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(pe7Var.A);
        }
        a(view, this.f1827o);
        return view;
    }
}
