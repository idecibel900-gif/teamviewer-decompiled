package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class kt implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ft m;
    public final /* synthetic */ lt n;

    public kt(lt ltVar, ft ftVar) {
        this.n = ltVar;
        this.m = ftVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.n.R.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.m);
        }
    }
}
