package io.sentry.util;

import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        Boolean bool = Boolean.TRUE;
        map.put("androidx.compose.ui.node.Owner", bool);
        map.put("androidx.core.view.ScrollingView", bool);
        map.put("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", bool);
        map.put("o.x84", bool);
        Boolean bool2 = Boolean.FALSE;
        map.put("io.sentry.android.distribution.DistributionIntegration", bool2);
        map.put("io.sentry.android.fragment.FragmentLifecycleIntegration", bool);
        map.put("io.sentry.android.replay.ReplayIntegration", bool);
        map.put("io.sentry.android.timber.SentryTimberIntegration", bool2);
        map.put("io.sentry.compose.gestures.ComposeGestureTargetLocator", bool);
        map.put("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", bool);
        map.put("timber.log.Timber", bool2);
        a = map;
    }

    public static boolean a(g1 g1Var, String str) {
        Boolean bool;
        HashMap map = a;
        if (map == null || (bool = (Boolean) map.get(str)) == null) {
            return c(g1Var, str, false) != null;
        }
        if (!bool.booleanValue() && g1Var != null) {
            g1Var.g(f6.INFO, "Class not available: ".concat(str), new Object[0]);
        }
        return bool.booleanValue();
    }

    public static boolean b(g7 g7Var, String str) {
        return a(g7Var != null ? g7Var.getLogger() : null, str);
    }

    public static Class c(g1 g1Var, String str, boolean z) {
        try {
            return Class.forName(str, z, i.class.getClassLoader());
        } catch (ClassNotFoundException unused) {
            if (g1Var == null) {
                return null;
            }
            g1Var.g(f6.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (g1Var == null) {
                return null;
            }
            g1Var.d(f6.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (g1Var == null) {
                return null;
            }
            g1Var.d(f6.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }
}
