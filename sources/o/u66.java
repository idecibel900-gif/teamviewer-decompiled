package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u66 {
    public final /* synthetic */ RecyclerView a;

    public u66(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.F || !recyclerView.E) {
            recyclerView.M = true;
            recyclerView.requestLayout();
        } else {
            b66 b66Var = recyclerView.u;
            WeakHashMap weakHashMap = be8.a;
            recyclerView.postOnAnimation(b66Var);
        }
    }
}
