package o;

import android.opengl.GLSurfaceView;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements GLSurfaceView.EGLContextFactory {
    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        egl10.getClass();
        eGLDisplay.getClass();
        eGLConfig.getClass();
        int i = ClientViewOpenGL.F;
        mo8.h("Before eglCreateContext", egl10);
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        mo8.h("After eglCreateContext", egl10);
        eGLContextEglCreateContext.getClass();
        return eGLContextEglCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.getClass();
        eGLDisplay.getClass();
        eGLContext.getClass();
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}
