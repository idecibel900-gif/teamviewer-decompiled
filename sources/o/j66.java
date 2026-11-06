package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class j66 {
    public void d(Rect rect, View view, RecyclerView recyclerView) {
        ((m66) view.getLayoutParams()).m.getClass();
        rect.set(0, 0, 0, 0);
    }

    public void e(Canvas canvas, RecyclerView recyclerView) {
    }

    public abstract void f(Canvas canvas, RecyclerView recyclerView);
}
