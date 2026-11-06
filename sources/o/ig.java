package o;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ AndroidComposeView n;

    public /* synthetic */ ig(AndroidComposeView androidComposeView, byte b) {
        this.m = b;
        this.n = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        int i = 0;
        AndroidComposeView androidComposeView = this.n;
        switch (b) {
            case 0:
                cm cmVar = androidComposeView.c0;
                if (cmVar != null) {
                    int childCount = cmVar.getChildCount();
                    while (i < childCount) {
                        View childAt = cmVar.getChildAt(i);
                        xl xlVar = childAt instanceof xl ? (xl) childAt : null;
                        if (xlVar != null && xlVar.isLayoutRequested()) {
                            xlVar.layout(xlVar.getLeft(), xlVar.getTop(), xlVar.getRight(), xlVar.getBottom());
                        }
                        i++;
                    }
                }
                return f88.a;
            case 1:
                Class cls = AndroidComposeView.U0;
                if (Build.VERSION.SDK_INT > 28 && androidComposeView.isAttachedToWindow()) {
                    if (AndroidComposeView.Y0 == null) {
                        ed edVar = new ed((byte) 1);
                        AndroidComposeView.Y0 = edVar;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (AndroidComposeView.U0 == null) {
                                AndroidComposeView.U0 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = AndroidComposeView.W0;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls2 = AndroidComposeView.U0;
                                declaredMethod = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                AndroidComposeView.W0 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, edVar);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    zw4 zw4Var = AndroidComposeView.X0;
                    synchronized (zw4Var) {
                        zw4Var.a(androidComposeView);
                    }
                }
                return f88.a;
            case 2:
                Class cls3 = AndroidComposeView.U0;
                Boolean bool = (Boolean) androidComposeView.B.getValue();
                bool.getClass();
                return bool;
            case 3:
                Class cls4 = AndroidComposeView.U0;
                LocaleList locales = androidComposeView.getConfiguration().getLocales();
                ld4 ld4Var = new ld4(new md4(locales));
                if (locales.isEmpty()) {
                    ld4Var = new ld4(new md4(LocaleList.getDefault()));
                }
                int size = ld4Var.a.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale localeB = ld4Var.b(i);
                    localeB.getClass();
                    arrayList.add(new jd4(localeB));
                    i++;
                }
                return new kd4(arrayList);
            default:
                MotionEvent motionEvent = androidComposeView.z0;
                if (motionEvent != null) {
                    boolean zContains = qf0.L(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = androidComposeView.z0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        androidComposeView.A0 = SystemClock.uptimeMillis();
                        androidComposeView.post(androidComposeView.H0);
                    }
                }
                androidComposeView.N0.a();
                return f88.a;
        }
    }
}
