package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class xf6 {
    public final dc a;
    public final Proxy b;
    public final InetSocketAddress c;
    public final ai0 d;

    public xf6(dc dcVar, Proxy proxy, InetSocketAddress inetSocketAddress, ai0 ai0Var) {
        dcVar.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = dcVar;
        this.b = proxy;
        this.c = inetSocketAddress;
        this.d = ai0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xf6)) {
            return false;
        }
        xf6 xf6Var = (xf6) obj;
        return im3.n(xf6Var.a, this.a) && im3.n(xf6Var.b, this.b) && im3.n(xf6Var.c, this.c) && im3.n(xf6Var.d, this.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31;
        ai0 ai0Var = this.d;
        return iHashCode + (ai0Var != null ? ai0Var.hashCode() : 0);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        dc dcVar = this.a;
        h93 h93Var = dcVar.h;
        h93 h93Var2 = dcVar.h;
        String str = h93Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : no8.b(hostAddress);
        if (ub7.R(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (h93Var2.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(h93Var2.e);
        }
        if (!str.equals(strB)) {
            if (im3.n(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (ub7.R(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        if (this.d != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }
}
