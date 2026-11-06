package o;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ec5 implements v07 {
    public final FileOutputStream m;
    public final ov7 n;

    public ec5(FileOutputStream fileOutputStream, ov7 ov7Var) {
        this.m = fileOutputStream;
        this.n = ov7Var;
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) throws IOException {
        ck3.p(bf0Var.n, 0L, j);
        while (j > 0) {
            this.n.f();
            sn6 sn6Var = bf0Var.m;
            sn6Var.getClass();
            int iMin = (int) Math.min(j, sn6Var.c - sn6Var.b);
            this.m.write(sn6Var.a, sn6Var.b, iMin);
            int i = sn6Var.b + iMin;
            sn6Var.b = i;
            long j2 = iMin;
            j -= j2;
            bf0Var.n -= j2;
            if (i == sn6Var.c) {
                bf0Var.m = sn6Var.a();
                vn6.a(sn6Var);
            }
        }
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() throws IOException {
        this.m.flush();
    }

    @Override // o.v07
    public final ov7 i() {
        return this.n;
    }

    public final String toString() {
        return "sink(" + this.m + ')';
    }
}
