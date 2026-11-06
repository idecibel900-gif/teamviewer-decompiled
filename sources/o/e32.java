package o;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class e32 {
    public final InetAddress a;
    public final String b;

    public e32(String str, InetAddress inetAddress) {
        inetAddress.getClass();
        this.a = inetAddress;
        String strB = no8.b(str);
        if (strB != null) {
            this.b = strB;
        } else {
            hk0.g("unexpected hostname: ".concat(str));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e32)) {
            return false;
        }
        e32 e32Var = (e32) obj;
        return e32Var.b.equals(this.b) && im3.n(e32Var.a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return this.b + '/' + this.a.getHostAddress();
    }
}
