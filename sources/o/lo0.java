package o;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements View.OnTouchListener {
    public final /* synthetic */ byte m = 2;
    public final Object n;

    public lo0(yo0 yo0Var) {
        this.n = new GestureDetector(yo0Var.r0().getApplicationContext(), new ko0(yo0Var, (byte) 1));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                view.getClass();
                motionEvent.getClass();
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
            case 1:
                view.getClass();
                motionEvent.getClass();
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
            default:
                ac4 ac4Var = (ac4) obj;
                yb4 yb4Var = ac4Var.C;
                Handler handler = ac4Var.G;
                zs zsVar = ac4Var.K;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && zsVar != null && zsVar.isShowing() && x >= 0 && x < zsVar.getWidth() && y >= 0 && y < zsVar.getHeight()) {
                    handler.postDelayed(yb4Var, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(yb4Var);
                return false;
        }
    }

    public lo0(xt2 xt2Var, po0 po0Var) {
        this.n = new GestureDetector(xt2Var.getApplicationContext(), new ko0(po0Var, (byte) 0));
    }

    public lo0(ac4 ac4Var) {
        this.n = ac4Var;
    }
}
