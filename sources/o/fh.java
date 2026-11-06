package o;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fh implements ViewTranslationCallback {
    public static final fh a = new fh();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        ph contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.q = mh.m;
        tk3 tk3VarC = contentCaptureManager.c();
        Object[] objArr = tk3VarC.c;
        long[] jArr = tk3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        jx4 jx4Var = ((hp6) objArr[(i << 3) + i3]).a.d.m;
                        Object objG = jx4Var.g(kp6.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = jx4Var.g(zo6.n);
                            m3 m3Var = (m3) (objG2 != null ? objG2 : null);
                            if (m3Var != null && (function0 = (Function0) m3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        ph contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.q = mh.m;
        tk3 tk3VarC = contentCaptureManager.c();
        Object[] objArr = tk3VarC.c;
        long[] jArr = tk3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        jx4 jx4Var = ((hp6) objArr[(i << 3) + i3]).a.d.m;
                        Object objG = jx4Var.g(kp6.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (im3.n(objG, Boolean.TRUE)) {
                            Object objG2 = jx4Var.g(zo6.m);
                            m3 m3Var = (m3) (objG2 != null ? objG2 : null);
                            if (m3Var != null && (function1 = (Function1) m3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        ph contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.q = mh.n;
        tk3 tk3VarC = contentCaptureManager.c();
        Object[] objArr = tk3VarC.c;
        long[] jArr = tk3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        jx4 jx4Var = ((hp6) objArr[(i << 3) + i3]).a.d.m;
                        Object objG = jx4Var.g(kp6.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (im3.n(objG, Boolean.FALSE)) {
                            Object objG2 = jx4Var.g(zo6.m);
                            m3 m3Var = (m3) (objG2 != null ? objG2 : null);
                            if (m3Var != null && (function1 = (Function1) m3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
