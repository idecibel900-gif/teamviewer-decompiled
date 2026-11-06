package o;

import android.database.Cursor;
import android.widget.BaseAdapter;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends Filter {
    public final /* synthetic */ byte a = 0;
    public BaseAdapter b;

    public tf1(g33 g33Var) {
        this.b = g33Var;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 0:
                return ((qf1) this.b).c((Cursor) obj);
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorF;
        switch (this.a) {
            case 0:
                pe7 pe7Var = (pe7) ((qf1) this.b);
                SearchView searchView = pe7Var.w;
                String string = charSequence == null ? "" : charSequence.toString();
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursorF = pe7Var.f(pe7Var.x, string);
                        if (cursorF != null) {
                            cursorF.getCount();
                        } else {
                            cursorF = null;
                        }
                    } catch (RuntimeException e) {
                        io.sentry.android.core.v0.l("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
                    }
                    break;
                } else {
                    cursorF = null;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursorF != null) {
                    filterResults.count = cursorF.getCount();
                    filterResults.values = cursorF;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            default:
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                ArrayList arrayList = ((g33) this.b).m;
                filterResults2.values = arrayList;
                filterResults2.count = arrayList.size();
                return filterResults2;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        switch (this.a) {
            case 0:
                qf1 qf1Var = (qf1) this.b;
                Cursor cursor = qf1Var.f1827o;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    qf1Var.b((Cursor) obj);
                    break;
                }
                break;
            default:
                ((g33) this.b).notifyDataSetChanged();
                break;
        }
    }

    public /* synthetic */ tf1() {
    }
}
