package o;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.net.ssl.EchConfigList;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class rf extends ql5 implements wb1 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public rf() {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayListQ0 = cx.Q0(new o57[]{i >= 37 ? new sf((byte) 1) : null, i >= 29 ? new sf((byte) 0) : null, new km1(vk.e), new km1(t51.a), new km1(ha0.a)});
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
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        eg egVar = x509TrustManagerExtensions != null ? new eg(x509TrustManager, x509TrustManagerExtensions) : null;
        if (egVar != null) {
            return egVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new j40(new i50((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
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
    public final r72 f(SSLException sSLException) {
        String publicHostname;
        ai0 ai0VarW;
        byte[] bytes;
        if (Build.VERSION.SDK_INT >= 37 && qf.f(sSLException) && (publicHostname = qf.c(sSLException).getPublicHostname()) != null) {
            e96 e96Var = r72.c;
            EchConfigList retryConfigList = qf.c(sSLException).getRetryConfigList();
            if (retryConfigList == null || (bytes = retryConfigList.toBytes()) == null) {
                ai0VarW = null;
            } else {
                ai0 ai0Var = ai0.p;
                ai0VarW = ju.w(bytes);
            }
            String strB = no8.b(publicHostname);
            if (strB != null && !no8.a.c(strB) && !r72.c.c(strB)) {
                return new r72(publicHostname, ai0VarW);
            }
        }
        return null;
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // o.ql5
    public final void k(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            obj.getClass();
            z3.h(obj).warnIfOpen();
        }
    }
}
