package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class id implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView m;
    public final /* synthetic */ md n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jd f1049o;

    public id(jd jdVar, AlertController$RecycleListView alertController$RecycleListView, md mdVar) {
        this.f1049o = jdVar;
        this.m = alertController$RecycleListView;
        this.n = mdVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        jd jdVar = this.f1049o;
        boolean[] zArr = jdVar.s;
        AlertController$RecycleListView alertController$RecycleListView = this.m;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        jdVar.w.onClick(this.n.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
