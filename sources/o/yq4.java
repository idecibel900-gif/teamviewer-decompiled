package o;

import android.util.Log;
import com.google.firebase.components.DependencyException;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yq4 implements f18, f36, t50, q32, jo6, ds7, tg8 {
    public final /* synthetic */ byte m;

    public /* synthetic */ yq4(byte b) {
        this.m = b;
    }

    public static /* synthetic */ void f() {
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new kz3(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void r(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // o.f36
    public void a(String str) {
        switch (this.m) {
            case 3:
                Log.d("ReLinker", str);
                break;
            default:
                Log.d("ReLinker", str);
                break;
        }
    }

    @Override // o.f18
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // o.jo6
    public io6 b(io.sentry.android.core.n1 n1Var) {
        switch (this.m) {
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                rr0 rr0Var = (rr0) n1Var.p;
                return new io6(rr0Var.d(rr0Var.b), rr0Var.d(rr0Var.c), n1Var.h() == ef1.m);
            default:
                return wo1.w(n1Var, z06.H);
        }
    }

    @Override // o.tg8
    public e18 c(xo xoVar) {
        return new e18(xoVar, u65.a);
    }

    @Override // o.ds7
    public boolean d(v56 v56Var, v56 v56Var2) {
        return v56Var2.a(v56Var.b());
    }

    @Override // o.q32
    public double e(double d) {
        return d;
    }
}
