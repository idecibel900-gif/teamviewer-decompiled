package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class km1 implements o57 {
    public final jm1 a;
    public o57 b;

    public km1(jm1 jm1Var) {
        this.a = jm1Var;
    }

    @Override // o.o57
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // o.o57
    public final boolean b() {
        return true;
    }

    @Override // o.o57
    public final void c(SSLSocket sSLSocket, String str, List list, ai0 ai0Var) {
        o57 o57VarE = e(sSLSocket);
        if (o57VarE != null) {
            o57VarE.c(sSLSocket, str, list, ai0Var);
        }
    }

    @Override // o.o57
    public final String d(SSLSocket sSLSocket) {
        o57 o57VarE = e(sSLSocket);
        if (o57VarE != null) {
            return o57VarE.d(sSLSocket);
        }
        return null;
    }

    public final synchronized o57 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.Q(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
