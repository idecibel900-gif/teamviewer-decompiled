package o;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class w73 extends u73 {
    public long q;
    public boolean r;
    public final /* synthetic */ z73 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(z73 z73Var, h93 h93Var) {
        super(z73Var, h93Var);
        h93Var.getClass();
        this.s = z73Var;
        this.q = -1L;
        this.r = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.f2179o) {
            return;
        }
        if (this.r) {
            TimeZone timeZone = ro8.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = ro8.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.s.b.f();
                e(z73.f);
            }
        }
        this.f2179o = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r18.r == false) goto L48;
     */
    @Override // o.u73, o.q67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i0(o.bf0 r19, long r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w73.i0(o.bf0, long):long");
    }
}
