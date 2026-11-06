package o;

import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class sf implements o57 {
    public final /* synthetic */ byte a;

    public /* synthetic */ sf(byte b) {
        this.a = b;
    }

    @Override // o.o57
    public final boolean a(SSLSocket sSLSocket) {
        switch (this.a) {
            case 0:
                break;
        }
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // o.o57
    public final boolean b() {
        switch (this.a) {
            case 0:
                ql5 ql5Var = ql5.a;
                return Build.VERSION.SDK_INT >= 29;
            default:
                ql5 ql5Var2 = ql5.a;
                return Build.VERSION.SDK_INT >= 37;
        }
    }

    @Override // o.o57
    public final void c(SSLSocket sSLSocket, String str, List list, ai0 ai0Var) throws IOException {
        EchConfigList echConfigListFromBytes;
        switch (this.a) {
            case 0:
                try {
                    SSLSockets.setUseSessionTickets(sSLSocket, true);
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    ql5 ql5Var = ql5.a;
                    sSLParameters.setApplicationProtocols((String[]) ol5.a(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                } catch (IllegalArgumentException e) {
                    throw new IOException("Android internal error", e);
                }
            default:
                SSLSockets.setUseSessionTickets(sSLSocket, true);
                try {
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    ql5 ql5Var2 = ql5.a;
                    sSLParameters2.setApplicationProtocols((String[]) ol5.a(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters2);
                    if (str == null || ai0Var == null) {
                        return;
                    }
                    try {
                        echConfigListFromBytes = EchConfigList.fromBytes(ai0Var.r());
                        break;
                    } catch (InvalidEchDataException unused) {
                        echConfigListFromBytes = null;
                    }
                    if (echConfigListFromBytes != null) {
                        SSLSockets.setEchConfigList(sSLSocket, echConfigListFromBytes);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e2) {
                    throw new IOException("Android internal error", e2);
                }
        }
    }

    @Override // o.o57
    public final String d(SSLSocket sSLSocket) {
        switch (this.a) {
            case 0:
                try {
                    String applicationProtocol = sSLSocket.getApplicationProtocol();
                    if (applicationProtocol == null || applicationProtocol.equals("")) {
                        return null;
                    }
                    return applicationProtocol;
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            default:
                String applicationProtocol2 = sSLSocket.getApplicationProtocol();
                if (applicationProtocol2 == null || applicationProtocol2.equals("")) {
                    return null;
                }
                return applicationProtocol2;
        }
    }
}
