package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class sz7 extends LinearLayout {
    public final ArrayList m;
    public View n;

    public sz7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = new ArrayList();
    }

    public final ArrayList<kd3> getToolbarItemViews() {
        return this.m;
    }

    public final View getToolbarMainItemView() {
        return this.n;
    }

    public final void setDragPointOnTouchListener(View.OnTouchListener onTouchListener) {
        onTouchListener.getClass();
        View view = this.n;
        if (view != null) {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public final void setToolbarMainItemView(View view) {
        this.n = view;
    }
}
