package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d32 implements g32 {
    @Override // o.g32
    public final List a(String str) throws UnknownHostException {
        str.getClass();
        ql5 ql5Var = ql5.a;
        ql5.a.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return cx.g1(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // o.g32
    public final dh4 b(f32 f32Var) {
        ql5 ql5Var = ql5.a;
        ql5.a.getClass();
        return new dh4(io7.l, ph3.b, f32Var);
    }

    public final String toString() {
        return "Dns.SYSTEM";
    }
}
