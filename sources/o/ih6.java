package o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class ih6 {
    public final ClassLoader a;
    public final f71 b;
    public final f71 c;

    public ih6(ClassLoader classLoader, f71 f71Var) {
        this.a = classLoader;
        this.b = f71Var;
        this.c = new f71(classLoader, false);
    }

    public static final boolean d(ih6 ih6Var) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = ih6Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        int iA;
        f71 f71Var = this.c;
        boolean zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        try {
            f71Var.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            byte b = 3;
            if (it1.N("WindowExtensionsProvider#getWindowExtensions is not valid", new y26(f71Var, b)) && it1.N("WindowExtensions#getWindowLayoutComponent is not valid", new hh6(this, zB ? (byte) 1 : (byte) 0)) && it1.N("FoldingFeature class is not valid", new hh6(this, (byte) 1)) && (iA = pg2.a()) >= 1) {
                if (iA == 1) {
                    zB = c();
                } else if (iA < 5) {
                    zB = b();
                } else if (b() && it1.N("DisplayFoldFeature is not valid", new hh6(this, b)) && it1.N("SupportedWindowFeatures is not valid", new hh6(this, (byte) 2)) && it1.N("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new hh6(this, (byte) 4))) {
                    zB = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        boolean zD;
        if (c()) {
            String str = "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid";
            try {
                zD = d(this);
                if (!zD) {
                    io.sentry.android.core.v0.c("ReflectionGuard", str);
                }
            } catch (ClassNotFoundException unused) {
                io.sentry.android.core.v0.c("ReflectionGuard", "ClassNotFound: ".concat(str));
                zD = false;
            } catch (NoSuchFieldException unused2) {
                io.sentry.android.core.v0.c("ReflectionGuard", "NoSuchField: ".concat(str));
                zD = false;
            } catch (NoSuchMethodException unused3) {
                io.sentry.android.core.v0.c("ReflectionGuard", "NoSuchMethod: ".concat(str));
                zD = false;
            }
            if (zD) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return it1.N("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new hh6(this, (byte) 5));
    }
}
