package o;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.PopupWindow;
import androidx.work.impl.foreground.SystemForegroundService;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq {
    public static void A(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void B(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void C(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            we4.f().k(SystemForegroundService.q, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            we4.f().k(SystemForegroundService.q, "Unable to start foreground service", e2);
        }
    }

    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(NotificationChannel notificationChannel) {
        notificationChannel.canBubble();
    }

    public static void c(Rect rect, Rect rect2, View view) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static void d(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static ContentCaptureSession e(View view) {
        return view.getContentCaptureSession();
    }

    public static String f(Context context) {
        return context.getOpPackageName();
    }

    public static Insets g(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    public static int h(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static boolean i() {
        return Trace.isEnabled();
    }

    public static boolean j() {
        return Trace.isEnabled();
    }

    public static AutofillId k(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure l(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void m(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void n(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void o(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void p(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Object q(int i) {
        switch (ua5.B(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case ep1.b /* 9 */:
                return BlendMode.SRC_ATOP;
            case ep1.c /* 10 */:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case ep1.d /* 12 */:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return BlendMode.COLOR_DODGE;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets r(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void s(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void t(Activity activity, ws5.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void u(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void v(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void w(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void x(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void y(zs zsVar, Rect rect) {
        zsVar.setEpicenterBounds(rect);
    }

    public static void z(zs zsVar) {
        zsVar.setIsClippedToScreen(true);
    }
}
