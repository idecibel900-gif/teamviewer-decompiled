package o;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class dq {
    public static Typeface a(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static TextClassifier d(Context context, go6 go6Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = go6Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List e(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] f(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long g(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor h(RemoteControlApplication remoteControlApplication) {
        return remoteControlApplication.getMainExecutor();
    }

    public static void i(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String j() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int k(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String l(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params q(yt ytVar) {
        return ytVar.getTextMetricsParams();
    }

    public static int r(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri s(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void t(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void u(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
