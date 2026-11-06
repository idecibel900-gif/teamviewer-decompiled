package o;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1475o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ mk(px4 px4Var, ArrayList arrayList, List list, boolean z) {
        this.m = (byte) 1;
        this.f1475o = px4Var;
        this.p = arrayList;
        this.q = list;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        boolean z = this.n;
        Object obj4 = this.f1475o;
        switch (b) {
            case 0:
                vi viVar = (vi) obj3;
                t70 t70Var = (t70) obj2;
                d14 d14Var = (d14) obj;
                d14Var.a();
                nl0 nl0Var = d14Var.m;
                if (((Boolean) ((Function0) obj4).a()).booleanValue()) {
                    if (z) {
                        long jT0 = nl0Var.t0();
                        iu iuVar = nl0Var.n;
                        long jD = iuVar.D();
                        iuVar.x().g();
                        try {
                            ((xc0) iuVar.f1103o).U(-1.0f, 1.0f, jT0);
                            u52.S(d14Var, viVar, 0L, 0.0f, t70Var, 46);
                        } finally {
                            ua5.x(iuVar, jD);
                        }
                    } else {
                        u52.S(d14Var, viVar, 0L, 0.0f, t70Var, 46);
                    }
                }
                return f88Var;
            case 1:
                px4 px4Var = (px4) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                il5 il5Var = (il5) obj;
                il5Var.m = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((p44) arrayList.get(i)).c(il5Var, z);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((p44) list.get(i2)).c(il5Var, z);
                }
                il5Var.m = false;
                px4Var.getValue();
                return f88Var;
            case 2:
                px4 px4Var2 = (px4) obj4;
                px4 px4Var3 = (px4) obj3;
                px4 px4Var4 = (px4) obj2;
                WebView webView = (WebView) obj;
                webView.getClass();
                if (z && ((Boolean) px4Var2.getValue()).booleanValue()) {
                    Boolean bool = Boolean.FALSE;
                    px4Var3.setValue(bool);
                    px4Var4.setValue(bool);
                    webView.reload();
                }
                return f88Var;
            default:
                nc4 nc4Var = (nc4) obj4;
                String strSubstring = (String) obj3;
                nn8 nn8Var = (nn8) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof en8) {
                    nc4Var.c.compareAndSet(-256, ((en8) th).m);
                }
                if (!z || strSubstring == null) {
                    return f88Var;
                }
                int iHashCode = nn8Var.a.hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    if (strSubstring.length() > 127) {
                        strSubstring = strSubstring.substring(0, 127);
                    }
                    eq.d(iHashCode, strSubstring);
                    return f88Var;
                }
                if (strSubstring.length() > 127) {
                    strSubstring = strSubstring.substring(0, 127);
                }
                try {
                    Method method = x37.d;
                    if (method == null) {
                        method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        x37.d = method;
                    }
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    method.invoke(null, Long.valueOf(x37.a), strSubstring, Integer.valueOf(iHashCode));
                    return f88Var;
                } catch (Exception e) {
                    if (!(e instanceof InvocationTargetException)) {
                        Log.v("Trace", "Unable to call asyncTraceEnd via reflection", e);
                        return f88Var;
                    }
                    Throwable cause = ((InvocationTargetException) e).getCause();
                    if (cause instanceof RuntimeException) {
                        throw cause;
                    }
                    gk0.r(cause);
                    return null;
                }
        }
    }

    public /* synthetic */ mk(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.m = b;
        this.f1475o = obj;
        this.n = z;
        this.p = obj2;
        this.q = obj3;
    }

    public /* synthetic */ mk(boolean z, px4 px4Var, px4 px4Var2, px4 px4Var3) {
        this.m = (byte) 2;
        this.n = z;
        this.f1475o = px4Var;
        this.p = px4Var2;
        this.q = px4Var3;
    }
}
