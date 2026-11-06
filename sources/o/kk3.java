package o;

import android.widget.HorizontalScrollView;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk3 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ InstructionsOverlayView n;

    public /* synthetic */ kk3(InstructionsOverlayView instructionsOverlayView, byte b) {
        this.m = b;
        this.n = instructionsOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        InstructionsOverlayView instructionsOverlayView = this.n;
        switch (b) {
            case 0:
                int i = InstructionsOverlayView.v;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) instructionsOverlayView.findViewById(R.id.videos_scroll_container);
                if (horizontalScrollView != null) {
                    horizontalScrollView.fullScroll(66);
                }
                break;
            default:
                int i2 = InstructionsOverlayView.v;
                instructionsOverlayView.c();
                break;
        }
    }
}
