package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class hd implements AdapterView.OnItemClickListener {
    public final /* synthetic */ md m;
    public final /* synthetic */ jd n;

    public hd(jd jdVar, md mdVar) {
        this.n = jdVar;
        this.m = mdVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        jd jdVar = this.n;
        DialogInterface.OnClickListener onClickListener = jdVar.q;
        md mdVar = this.m;
        onClickListener.onClick(mdVar.b, i);
        if (jdVar.u) {
            return;
        }
        mdVar.b.dismiss();
    }
}
