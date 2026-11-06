package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class nh3 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ oh3 a;

    public nh3(oh3 oh3Var) {
        this.a = oh3Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        oh3 oh3Var = this.a;
        hg hgVar = (hg) oh3Var.c;
        if (!oh3Var.b) {
            int i2 = oh3Var.a;
            if (i2 == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    i = f > 0.0f ? 1 : 2;
                    AndroidComposeView androidComposeView = hgVar.n;
                    Class cls = AndroidComposeView.U0;
                    ((lq2) androidComposeView.getFocusOwner()).h(i, false);
                    return true;
                }
            } else if (i2 == 2 && Math.abs(f2) > Math.abs(f)) {
                i = f2 > 0.0f ? 1 : 2;
                AndroidComposeView androidComposeView2 = hgVar.n;
                Class cls2 = AndroidComposeView.U0;
                ((lq2) androidComposeView2.getFocusOwner()).h(i, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
