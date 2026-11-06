package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ActionBarOverlayLayout n;

    public /* synthetic */ q6(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.m = b;
        this.n = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ActionBarOverlayLayout actionBarOverlayLayout = this.n;
        switch (b) {
            case 0:
                actionBarOverlayLayout.a();
                actionBarOverlayLayout.L = actionBarOverlayLayout.p.animate().translationY(0.0f).setListener(actionBarOverlayLayout.M);
                break;
            default:
                actionBarOverlayLayout.a();
                actionBarOverlayLayout.L = actionBarOverlayLayout.p.animate().translationY(-actionBarOverlayLayout.p.getHeight()).setListener(actionBarOverlayLayout.M);
                break;
        }
    }
}
