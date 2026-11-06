package o;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class pg2 {
    public static final String a = w86.a.b(pg2.class).f();

    public static int a() {
        tc8 tc8Var = tc8.m;
        tc8 tc8Var2 = xk0.e;
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (tc8Var2 != tc8Var) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (tc8Var2 != tc8Var) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (tc8Var2 != tc8Var) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
