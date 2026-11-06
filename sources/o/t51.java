package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class t51 implements o57 {
    public static final r51 a = new r51();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, s51.class.getClassLoader());
            if (Conscrypt.isAvailable() && s51.a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // o.o57
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.o57
    public final boolean b() {
        return b;
    }

    @Override // o.o57
    public final void c(SSLSocket sSLSocket, String str, List list, ai0 ai0Var) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ql5 ql5Var = ql5.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ol5.a(list).toArray(new String[0]));
        }
    }

    @Override // o.o57
    public final String d(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
