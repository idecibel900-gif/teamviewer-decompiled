package o;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class gd extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView m;
    public final /* synthetic */ jd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(jd jdVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.n = jdVar;
        this.m = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.n.s;
        if (zArr != null && zArr[i]) {
            this.m.setItemChecked(i, true);
        }
        return view2;
    }
}
