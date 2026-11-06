package o;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g33 extends ArrayAdapter {
    public final ArrayList m;

    public g33(Context context, ArrayList arrayList) {
        super(context, R.layout.simple_list_item_1, arrayList);
        this.m = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new tf1(this);
    }
}
