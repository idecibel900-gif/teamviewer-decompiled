package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class kn3 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ ln3 b;

    public kn3(ln3 ln3Var) {
        this.b = ln3Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ln3 ln3Var;
        View viewL;
        c76 c76VarL;
        if (!this.a || (viewL = (ln3Var = this.b).l(motionEvent)) == null || (c76VarL = ln3Var.r.L(viewL)) == null) {
            return;
        }
        ae aeVar = ln3Var.m;
        RecyclerView recyclerView = ln3Var.r;
        if ((ae.d(aeVar.h(recyclerView, c76VarL), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = ln3Var.l;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                ln3Var.d = x;
                ln3Var.e = y;
                ln3Var.i = 0.0f;
                ln3Var.h = 0.0f;
                ln3Var.p(c76VarL, 2);
            }
        }
    }
}
