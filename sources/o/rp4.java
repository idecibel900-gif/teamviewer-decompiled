package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 extends FrameLayout implements dv0 {
    public final CollapsibleActionView m;

    /* JADX WARN: Multi-variable type inference failed */
    public rp4(View view) {
        super(view.getContext());
        this.m = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // o.dv0
    public final void onActionViewCollapsed() {
        this.m.onActionViewCollapsed();
    }

    @Override // o.dv0
    public final void onActionViewExpanded() {
        this.m.onActionViewExpanded();
    }
}
