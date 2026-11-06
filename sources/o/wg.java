package o;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class wg {
    public static void a(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void b(fp6 fp6Var, AccessibilityEvent accessibilityEvent) {
        ap6 ap6Var = fp6Var.d;
        Object objG = ap6Var.m.g(kp6.M);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            io.sentry.h2.f();
        } else {
            Object objG2 = ap6Var.m.g(kp6.I);
            accessibilityEvent.setTextChangeTypes((((gt7) (objG2 != null ? objG2 : null)) != null ? 1 : 0) | accessibilityEvent.getTextChangeTypes());
        }
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
