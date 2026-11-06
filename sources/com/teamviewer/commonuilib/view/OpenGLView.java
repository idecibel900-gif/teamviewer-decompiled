package com.teamviewer.commonuilib.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModelSWIGJNI;
import o.i95;
import o.im3;
import o.j95;
import o.l07;
import o.nd;
import o.vt0;
import o.zf8;

/* JADX INFO: loaded from: classes.dex */
public final class OpenGLView extends GLSurfaceView {
    public volatile l07 m;
    public nd n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GestureDetector f60o;
    public float[] p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        a();
    }

    public final void a() {
        this.n = new nd(this);
        setEGLContextFactory(new j95(this));
        setEGLConfigChooser(new i95(this));
        setRenderer(new vt0(this, (byte) 1));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        GestureDetector gestureDetector = this.f60o;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        view.getClass();
        super.onVisibilityChanged(view, i);
        nd ndVar = this.n;
        if (ndVar == null) {
            im3.e0("autoHideHelper");
            throw null;
        }
        OpenGLView openGLView = (OpenGLView) ndVar.f1562o;
        if (openGLView != view) {
            if (i == 0) {
                Object parent = openGLView.getParent();
                while (true) {
                    if (parent != null) {
                        if (!(parent instanceof View)) {
                            i = ndVar.n;
                            break;
                        } else {
                            View view2 = (View) parent;
                            if (view2.getVisibility() == 0) {
                                parent = view2.getParent();
                            }
                        }
                    }
                    i = -1;
                    break;
                }
            }
        } else {
            i = -1;
            break;
        }
        if (i >= 0) {
            super.setVisibility(i);
        }
    }

    public final void setBackgroundColor(float[] fArr) {
        fArr.getClass();
        this.p = fArr;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        gestureDetector.getClass();
        this.f60o = gestureDetector;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        nd ndVar = this.n;
        if (ndVar == null) {
            im3.e0("autoHideHelper");
            throw null;
        }
        ndVar.n = i;
        if (i == 0) {
            Object parent = ((OpenGLView) ndVar.f1562o).getParent();
            while (parent != null) {
                if (parent instanceof View) {
                    View view = (View) parent;
                    if (view.getVisibility() != 0) {
                        return;
                    } else {
                        parent = view.getParent();
                    }
                }
            }
            return;
        }
        super.setVisibility(i);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        super.surfaceDestroyed(surfaceHolder);
        l07 l07Var = this.m;
        if (l07Var == null) {
            im3.e0("openGLViewRenderer");
            throw null;
        }
        IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) l07Var.n).q0;
        if (iVideoStreamClientViewModel != null) {
            IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_ViewportDestroyed(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
        } else {
            im3.e0("videoStreamClientViewModel");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGLView(Context context) {
        super(context);
        context.getClass();
        a();
    }
}
