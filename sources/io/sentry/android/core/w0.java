package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.lang.ref.WeakReference;
import o.b8;
import o.c8;
import o.e8;
import o.jk0;
import o.k8;
import o.my0;
import o.ok5;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public static final w0 b = new w0();
    public Object a = new Handler(Looper.getMainLooper());

    public static w0 b(Activity activity, e eVar) {
        if (!(activity instanceof my0)) {
            return null;
        }
        byte b2 = 0;
        k8 k8VarD = ((my0) activity).u.d("sentry_user_feedback_screenshot_picker", new e8(b2), new h2(eVar, b2));
        w0 w0Var = new w0();
        w0Var.a = k8VarD;
        return w0Var;
    }

    public void a() {
        k8 k8Var = (k8) this.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        jk0 jk0Var = jk0.n;
        ok5 ok5Var = new ok5();
        ok5Var.a = b8.a;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        ok5Var.a = c8.a;
        ok5Var.b = jk0Var;
        k8Var.a(ok5Var, null);
    }

    public void c(Activity activity) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference == null || weakReference.get() != activity) {
            this.a = new WeakReference(activity);
        }
    }
}
