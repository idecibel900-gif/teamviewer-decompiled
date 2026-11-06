package o;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class dc {
    public final g32 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final jm0 e;
    public final d82 f;
    public final ProxySelector g;
    public final h93 h;
    public final List i;
    public final List j;

    public dc(String str, int i, g32 g32Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, jm0 jm0Var, d82 d82Var, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        g32Var.getClass();
        socketFactory.getClass();
        d82Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = g32Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = jm0Var;
        this.f = d82Var;
        this.g = proxySelector;
        g93 g93Var = new g93();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            g93Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                hk0.g("unexpected scheme: ".concat(str2));
                throw null;
            }
            g93Var.a = "https";
        }
        String strB = no8.b(au8.L(str, 0, 0, 7));
        if (strB == null) {
            hk0.g("unexpected host: ".concat(str));
            throw null;
        }
        g93Var.d = strB;
        if (1 > i || i >= 65536) {
            gk0.h(fx3.e(i, "unexpected port: "));
            throw null;
        }
        g93Var.e = i;
        this.h = g93Var.a();
        this.i = ro8.j(list);
        this.j = ro8.j(list2);
    }

    public final boolean a(dc dcVar) {
        return im3.n(this.a, dcVar.a) && im3.n(this.f, dcVar.f) && this.i.equals(dcVar.i) && this.j.equals(dcVar.j) && im3.n(this.g, dcVar.g) && im3.n(this.c, dcVar.c) && im3.n(this.d, dcVar.d) && im3.n(this.e, dcVar.e) && this.h.e == dcVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return this.h.equals(dcVar.h) && a(dcVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + to7.g(this.j, to7.g(this.i, (this.f.hashCode() + ((this.a.hashCode() + to7.e(527, 31, this.h.i)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        h93 h93Var = this.h;
        sb.append(h93Var.d);
        sb.append(':');
        sb.append(h93Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
