package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class z41 {
    public static final List e;
    public static final List f;
    public static final z41 g;
    public static final z41 h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        mr0 mr0Var = mr0.r;
        mr0 mr0Var2 = mr0.s;
        mr0 mr0Var3 = mr0.t;
        mr0 mr0Var4 = mr0.l;
        mr0 mr0Var5 = mr0.n;
        mr0 mr0Var6 = mr0.m;
        mr0 mr0Var7 = mr0.f1499o;
        mr0 mr0Var8 = mr0.q;
        mr0 mr0Var9 = mr0.p;
        List listL = qf0.L(mr0Var, mr0Var2, mr0Var3, mr0Var4, mr0Var5, mr0Var6, mr0Var7, mr0Var8, mr0Var9);
        e = listL;
        List listL2 = qf0.L(mr0Var, mr0Var2, mr0Var3, mr0Var4, mr0Var5, mr0Var6, mr0Var7, mr0Var8, mr0Var9, mr0.j, mr0.k, mr0.h, mr0.i, mr0.f, mr0.g, mr0.e);
        f = listL2;
        y41 y41Var = new y41();
        mr0[] mr0VarArr = (mr0[]) listL.toArray(new mr0[0]);
        y41Var.e((mr0[]) Arrays.copyOf(mr0VarArr, mr0VarArr.length));
        sv7 sv7Var = sv7.TLS_1_3;
        sv7 sv7Var2 = sv7.TLS_1_2;
        y41Var.f(sv7Var, sv7Var2);
        y41Var.b = true;
        y41Var.c();
        y41 y41Var2 = new y41();
        mr0[] mr0VarArr2 = (mr0[]) listL2.toArray(new mr0[0]);
        y41Var2.e((mr0[]) Arrays.copyOf(mr0VarArr2, mr0VarArr2.length));
        y41Var2.f(sv7Var, sv7Var2);
        y41Var2.b = true;
        g = y41Var2.c();
        y41 y41Var3 = new y41();
        mr0[] mr0VarArr3 = (mr0[]) listL2.toArray(new mr0[0]);
        y41Var3.e((mr0[]) Arrays.copyOf(mr0VarArr3, mr0VarArr3.length));
        y41Var3.f(sv7Var, sv7Var2, sv7.TLS_1_1, sv7.TLS_1_0);
        y41Var3.b = true;
        y41Var3.c();
        h = new z41(false, false, null, null);
    }

    public z41(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = po8.i(strArr, enabledCipherSuites, mr0.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = po8.i(enabledProtocols2, strArr2, c05.n);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        gj2 gj2Var = mr0.c;
        byte[] bArr = po8.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (gj2Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            hk0.g("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            hk0.g("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            hk0.g("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            hk0.g("At least one TLS version is required");
            return;
        }
        z41 z41Var = new z41(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (z41Var.c() != null) {
            sSLSocket.setEnabledProtocols(z41Var.d);
        }
        if (z41Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(z41Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(mr0.b.l(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            sv7.n.getClass();
            arrayList.add(el5.b(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z41)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        z41 z41Var = (z41) obj;
        boolean z = z41Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, z41Var.c) && Arrays.equals(this.d, z41Var.d) && this.b == z41Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
