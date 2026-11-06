package o;

import android.opengl.GLSurfaceView;
import com.teamviewer.commonuilib.view.OpenGLView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public final class i95 implements GLSurfaceView.EGLConfigChooser {
    public final int[] a = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    public final /* synthetic */ OpenGLView b;

    public i95(OpenGLView openGLView) {
        this.b = openGLView;
    }

    public static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        egl10.getClass();
        eGLDisplay.getClass();
        int[] iArr = new int[1];
        int[] iArr2 = this.a;
        egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            hk0.g("No configs match configSpec");
            return null;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr);
        EGLConfig eGLConfig = eGLConfigArr[0];
        for (int i2 = 0; i2 < i; i2++) {
            EGLConfig eGLConfig2 = eGLConfigArr[i2];
            int iA = a(egl10, eGLDisplay, eGLConfig2, 12325);
            int iA2 = a(egl10, eGLDisplay, eGLConfig2, 12326);
            if (iA >= 0 && iA2 >= 0) {
                int iA3 = a(egl10, eGLDisplay, eGLConfig2, 12324);
                int iA4 = a(egl10, eGLDisplay, eGLConfig2, 12323);
                int iA5 = a(egl10, eGLDisplay, eGLConfig2, 12322);
                int iA6 = a(egl10, eGLDisplay, eGLConfig2, 12321);
                if (iA3 == 8 && iA4 == 8 && iA5 == 8 && iA6 == 0) {
                    return eGLConfig2;
                }
            }
        }
        return eGLConfig;
    }
}
