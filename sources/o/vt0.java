package o;

import android.opengl.GLSurfaceView;
import com.teamviewer.commonuilib.view.OpenGLView;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModelSWIGJNI;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 implements GLSurfaceView.Renderer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GLSurfaceView b;

    public /* synthetic */ vt0(GLSurfaceView gLSurfaceView, byte b) {
        this.a = b;
        this.b = gLSurfaceView;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        byte b = 1;
        switch (this.a) {
            case 0:
                gl10.getClass();
                ClientViewOpenGL clientViewOpenGL = (ClientViewOpenGL) this.b;
                da3 da3Var = clientViewOpenGL.E;
                if (!clientViewOpenGL.y && !da3Var.V()) {
                    bu7.MAIN.a(new st0(clientViewOpenGL, b));
                }
                j97 zoomState = clientViewOpenGL.getZoomState();
                v97 v97Var = zoomState != null ? (v97) zoomState.getValue() : null;
                if (v97Var == null) {
                    ye4.c("ClientViewOpenGL", "render: already destroyed");
                    return;
                }
                da3Var.y(v97Var.b, v97Var.c, -((int) v97Var.d), -((int) v97Var.e));
                if (clientViewOpenGL.B) {
                    clientViewOpenGL.B = false;
                    j97 j97Var = clientViewOpenGL.z;
                    r97 r97Var = j97Var != null ? (r97) j97Var.getValue() : null;
                    if (r97Var == null || !r97Var.c) {
                        bu7.MAIN.a(new pc0((Object) this, (byte) 5));
                        return;
                    } else {
                        bu7.MAIN.a(new io.sentry.u4((Object) clientViewOpenGL, (Object) r97Var, (byte) 20));
                        return;
                    }
                }
                return;
            default:
                float[] fArr = ((OpenGLView) this.b).p;
                if (fArr != null && gl10 != null) {
                    gl10.glClearColor(fArr[0], fArr[1], fArr[2], 1.0f);
                }
                l07 l07Var = ((OpenGLView) this.b).m;
                if (l07Var == null) {
                    im3.e0("openGLViewRenderer");
                    throw null;
                }
                IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) l07Var.n).q0;
                if (iVideoStreamClientViewModel != null) {
                    IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_ViewportRender(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                    return;
                } else {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        switch (this.a) {
            case 0:
                gl10.getClass();
                ClientViewOpenGL clientViewOpenGL = (ClientViewOpenGL) this.b;
                int i3 = (int) (clientViewOpenGL.getResources().getDisplayMetrics().density * 100.0f);
                da3 da3Var = clientViewOpenGL.E;
                da3Var.i0(i, i2, i3);
                da3Var.B();
                return;
            default:
                l07 l07Var = ((OpenGLView) this.b).m;
                if (l07Var == null) {
                    im3.e0("openGLViewRenderer");
                    throw null;
                }
                IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) l07Var.n).q0;
                if (iVideoStreamClientViewModel != null) {
                    IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_ViewportSizeChanged(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel, i, i2);
                    return;
                } else {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        switch (this.a) {
            case 0:
                gl10.getClass();
                eGLConfig.getClass();
                int[] iArr = new int[1];
                gl10.glGetIntegerv(3379, iArr, 0);
                ClientViewOpenGL.F = iArr[0];
                ClientViewOpenGL clientViewOpenGL = (ClientViewOpenGL) this.b;
                da3 da3Var = clientViewOpenGL.E;
                i12 i12Var = (i12) ((l97) clientViewOpenGL.m18getDimensionBitmap()).getValue();
                int i = i12Var.a;
                int i2 = i12Var.b;
                int i3 = ClientViewOpenGL.F;
                if ((1 <= i3 && i3 < i) || i2 > i3) {
                    da3Var.z0(iArr[0]);
                }
                da3Var.u0();
                return;
            default:
                l07 l07Var = ((OpenGLView) this.b).m;
                if (l07Var == null) {
                    im3.e0("openGLViewRenderer");
                    throw null;
                }
                IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) l07Var.n).q0;
                if (iVideoStreamClientViewModel != null) {
                    IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_ViewportCreated(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                    return;
                } else {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
        }
    }
}
