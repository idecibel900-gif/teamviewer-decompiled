package io.sentry.android.replay;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.b5;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import o.e96;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends yz3 implements Function0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f137o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public final /* synthetic */ byte n;

    static {
        int i = 0;
        f137o = new a(i, (byte) 0);
        p = new a(i, (byte) 1);
        q = new a(i, (byte) 2);
        r = new a(i, (byte) 3);
        s = new a(i, (byte) 4);
        t = new a(i, (byte) 5);
        u = new a(i, (byte) 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws NoSuchFieldException {
        Method method;
        switch (this.n) {
            case 0:
                return new e96("_[a-z]");
            case 1:
                y yVar = new y();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new b5((Object) yVar, (byte) 15));
                return yVar;
            case 2:
                Class cls = (Class) f0.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 3:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                    return null;
                }
            case 4:
                Class cls2 = (Class) f0.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 5:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th2) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                    return null;
                }
            default:
                Class cls3 = (Class) l0.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls3 + "#mWindow on API " + Build.VERSION.SDK_INT, e);
                    return null;
                }
        }
    }
}
