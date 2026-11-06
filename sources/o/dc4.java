package o;

import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f607o;

    public /* synthetic */ dc4(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f607o = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.m;
        Object obj = this.f607o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                SparseArray sparseArray = fc4.i1;
                ((fc4) obj2).f1 = ((ListView) obj).getItemAtPosition(i);
                break;
            case 1:
                ((e26) ((d7) obj2).f591o.get(i)).f.a();
                ((cq5) obj).A0();
                break;
            default:
                ((hc3) ((d7) obj2).f591o.get(i)).b().a();
                ((az5) obj).A0();
                break;
        }
    }
}
