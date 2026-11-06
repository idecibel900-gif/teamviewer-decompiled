package o;

import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class o83 extends xx {
    public final /* synthetic */ p83 n;

    public o83(p83 p83Var) {
        this.n = p83Var;
    }

    @Override // o.xx
    public final void j() {
        this.n.f(tc2.CANCEL);
        i83 i83Var = this.n.n;
        synchronized (i83Var) {
            long j = i83Var.z;
            long j2 = i83Var.y;
            if (j < j2) {
                return;
            }
            i83Var.y = j2 + 1;
            i83Var.A = System.nanoTime() + 1000000000;
            go7.b(i83Var.t, e41.l(new StringBuilder(), i83Var.f1043o, " ping"), new zz0(i83Var, (byte) 23));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
