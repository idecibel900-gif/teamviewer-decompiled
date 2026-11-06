package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class qq5 extends j66 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ rq5 d;

    public qq5(rq5 rq5Var) {
        this.d = rq5Var;
    }

    @Override // o.j66
    public final void d(Rect rect, View view, RecyclerView recyclerView) {
        if (g(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // o.j66
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (g(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean g(View view, RecyclerView recyclerView) {
        c76 c76VarL = recyclerView.L(view);
        if (!(c76VarL instanceof dr5) || !((dr5) c76VarL).K) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        c76 c76VarL2 = recyclerView.L(recyclerView.getChildAt(iIndexOfChild + 1));
        return (c76VarL2 instanceof dr5) && ((dr5) c76VarL2).J;
    }
}
