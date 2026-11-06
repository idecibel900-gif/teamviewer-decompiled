package o;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class xp4 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ yp4 m;

    public xp4(yp4 yp4Var) {
        this.m = yp4Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.m.c();
    }
}
