package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class i94 extends ft2 {
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1045o;
    public long p;

    public i94(q67 q67Var, long j, boolean z) {
        super(q67Var);
        this.n = j;
        this.f1045o = z;
        if (j >= 0) {
            return;
        }
        gk0.h(e41.g("byteCount < 0: ", j));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x003d, please report this as an issue */
    @Override // o.ft2, o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        long jI0;
        long j2;
        bf0Var.getClass();
        long j3 = this.p;
        long j4 = this.n;
        long j5 = j4 - j3;
        if (j5 < 0) {
            gk0.n("expected ", j4, " bytes but got ", this.p);
            return 0L;
        }
        if (this.f1045o) {
            j5++;
            if (j <= j5) {
                j5 = j;
            }
            jI0 = this.m.i0(bf0Var, j5);
            if (jI0 == -1) {
                long j6 = this.p + jI0;
                this.p = j6;
                j2 = j6 - j4;
                if (j2 <= 0) {
                    return jI0;
                }
                long j7 = bf0Var.n - j2;
                bf0 bf0Var2 = new bf0();
                bf0Var2.T0(bf0Var);
                bf0Var.W(bf0Var2, j7);
                bf0Var2.e();
                gk0.n("expected ", j4, " bytes but got ", this.p);
                return 0L;
            }
            if (j5 != 0) {
                throw new EOFException("expected " + j4 + " bytes but got " + this.p);
            }
        } else if (j5 != 0) {
            if (j <= j5) {
                j5 = j;
            }
            jI0 = this.m.i0(bf0Var, j5);
            if (jI0 == -1) {
                long j8 = this.p + jI0;
                this.p = j8;
                j2 = j8 - j4;
                if (j2 <= 0) {
                    return jI0;
                }
                long j9 = bf0Var.n - j2;
                bf0 bf0Var3 = new bf0();
                bf0Var3.T0(bf0Var);
                bf0Var.W(bf0Var3, j9);
                bf0Var3.e();
                gk0.n("expected ", j4, " bytes but got ", this.p);
                return 0L;
            }
            if (j5 != 0) {
                throw new EOFException("expected " + j4 + " bytes but got " + this.p);
            }
        }
        return -1L;
    }
}
