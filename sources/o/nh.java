package o;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class nh {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(ph phVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        hp6 hp6Var;
        fp6 fp6Var;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseK = gh.k(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseK != null && (value = viewTranslationResponseK.getValue("android:text")) != null && (text = value.getText()) != null && (hp6Var = (hp6) phVar.c().b((int) jKeyAt)) != null && (fp6Var = hp6Var.a) != null) {
                Object objG = fp6Var.d.m.g(zo6.l);
                if (objG == null) {
                    objG = null;
                }
                m3 m3Var = (m3) objG;
                if (m3Var != null && (function1 = (Function1) m3Var.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int e(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.q;
        switch (stopReason) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void f(ph phVar, long[] jArr, Consumer consumer) {
        fp6 fp6Var;
        for (long j : jArr) {
            hp6 hp6Var = (hp6) phVar.c().b((int) j);
            if (hp6Var != null && (fp6Var = hp6Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(phVar.m.getAutofillId(), fp6Var.f);
                Object objG = fp6Var.d.m.g(kp6.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new xo(gc4.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void h(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }
}
