package o;

import android.opengl.GLSurfaceView;
import com.teamviewer.commonuilib.view.OpenGLView;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public final class j95 implements GLSurfaceView.EGLContextFactory {
    public final /* synthetic */ OpenGLView a;

    public j95(OpenGLView openGLView) {
        this.a = openGLView;
    }

    public static void a(String str, EGL10 egl10) {
        while (true) {
            int iEglGetError = egl10.eglGetError();
            if (iEglGetError == 12288) {
                return;
            } else {
                ye4.c("OpenGLView", String.format("%s: EGL error: 0x%x", Arrays.copyOf(new Object[]{str, Integer.valueOf(iEglGetError)}, 2)));
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        egl10.getClass();
        eGLDisplay.getClass();
        eGLConfig.getClass();
        ye4.a.b("OpenGLView", "creating OpenGL ES 2.0 context");
        a("Before eglCreateContext", egl10);
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        a("After eglCreateContext", egl10);
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
