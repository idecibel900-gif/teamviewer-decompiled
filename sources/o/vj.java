package o;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class vj extends ql5 implements wb1 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public vj() {
        o87 o87Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            o87Var = new o87(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = dj.a;
            dj.a(c75.class.getName(), 5, "unable to load android socket classes", e2);
            o87Var = null;
        }
        ArrayList arrayListQ0 = cx.Q0(new o57[]{o87Var, new km1(vk.e), new km1(t51.a), new km1(ha0.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (((o57) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // o.wb1
    public final void a(Context context) {
        this.c = context;
    }

    @Override // o.wb1
    public final Context b() {
        return this.c;
    }

    @Override // o.ql5
    public final iq8 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i38 i50Var;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        eg egVar = x509TrustManagerExtensions != null ? new eg(x509TrustManager, x509TrustManagerExtensions) : null;
        if (egVar != null) {
            return egVar;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            i50Var = new uj(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            i50Var = new i50((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new j40(i50Var);
    }

    @Override // o.ql5
    public final void d(SSLSocket sSLSocket, String str, List list, ai0 ai0Var) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o57) next).a(sSLSocket));
        o57 o57Var = (o57) next;
        if (o57Var != null) {
            o57Var.c(sSLSocket, str, list, ai0Var);
        }
    }

    @Override // o.ql5
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // o.ql5
    public final String g(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o57) next).a(sSLSocket));
        o57 o57Var = (o57) next;
        if (o57Var != null) {
            return o57Var.d(sSLSocket);
        }
        return null;
    }

    @Override // o.ql5
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o.ql5
    public final void j(int i, String str, Throwable th) {
        if (i == 5) {
            io.sentry.android.core.v0.l("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // o.ql5
    public final SSLContext l() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
