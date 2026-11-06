package o;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes.dex */
public final class jv4 implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ kv4 a;

    public jv4(kv4 kv4Var) {
        this.a = kv4Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getClass();
        if (!scaleGestureDetector.isInProgress()) {
            return false;
        }
        aj4 aj4Var = this.a.p;
        if (aj4Var == null) {
            return true;
        }
        aj4Var.f(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getClass();
        iv4 iv4Var = iv4.f1107o;
        kv4 kv4Var = this.a;
        kv4Var.s = iv4Var;
        kv4Var.f1307o = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getClass();
        this.a.s = iv4.m;
    }
}
