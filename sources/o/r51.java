package o;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class r51 implements jm1 {
    @Override // o.jm1
    public final o57 Q(SSLSocket sSLSocket) {
        return new t51();
    }

    @Override // o.jm1
    public final boolean a(SSLSocket sSLSocket) {
        return t51.b && Conscrypt.isConscrypt(sSLSocket);
    }
}
