package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class i43 implements q67 {
    public byte m;
    public final w36 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Inflater f1035o;
    public final uh3 p;
    public final CRC32 q;

    public i43(of0 of0Var) {
        of0Var.getClass();
        w36 w36Var = new w36(of0Var);
        this.n = w36Var;
        Inflater inflater = new Inflater(true);
        this.f1035o = inflater;
        this.p = new uh3(w36Var, inflater);
        this.q = new CRC32();
    }

    public static void e(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ub7.g0(8, ck3.w0(i2)) + " != expected 0x" + ub7.g0(8, ck3.w0(i)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.close();
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.n.m.i();
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) throws IOException {
        byte b;
        i43 i43Var = this;
        w36 w36Var = i43Var.n;
        bf0 bf0Var2 = w36Var.n;
        bf0Var.getClass();
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = i43Var.m;
        CRC32 crc32 = i43Var.q;
        if (b2 == 0) {
            w36Var.k0(10L);
            byte bF = bf0Var2.F(3L);
            boolean z = ((bF >> 1) & 1) == 1;
            if (z) {
                i43Var.j(bf0Var2, 0L, 10L);
            }
            e(8075, w36Var.J(), "ID1ID2");
            w36Var.skip(8L);
            if (((bF >> 2) & 1) == 1) {
                w36Var.k0(2L);
                if (z) {
                    j(bf0Var2, 0L, 2L);
                }
                long jL0 = bf0Var2.L0() & 65535;
                w36Var.k0(jL0);
                if (z) {
                    j(bf0Var2, 0L, jL0);
                }
                w36Var.skip(jL0);
            }
            if (((bF >> 3) & 1) == 1) {
                long j2 = w36Var.j(0L, (byte) 0, Long.MAX_VALUE);
                if (j2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j(bf0Var2, 0L, j2 + 1);
                }
                w36Var.skip(j2 + 1);
            }
            if (((bF >> 4) & 1) == 1) {
                long j3 = w36Var.j(0L, (byte) 0, Long.MAX_VALUE);
                if (j3 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    i43Var = this;
                    i43Var.j(bf0Var2, 0L, j3 + 1);
                } else {
                    i43Var = this;
                }
                w36Var.skip(j3 + 1);
            } else {
                i43Var = this;
            }
            if (z) {
                e(w36Var.Y(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            i43Var.m = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j4 = bf0Var.n;
            long jI0 = i43Var.p.i0(bf0Var, j);
            if (jI0 != -1) {
                i43Var.j(bf0Var, j4, jI0);
                return jI0;
            }
            b = 2;
            i43Var.m = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            e(w36Var.F(), (int) crc32.getValue(), "CRC");
            e(w36Var.F(), (int) i43Var.f1035o.getBytesWritten(), "ISIZE");
            i43Var.m = (byte) 3;
            if (!w36Var.e()) {
                gk0.l("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public final void j(bf0 bf0Var, long j, long j2) {
        sn6 sn6Var = bf0Var.m;
        sn6Var.getClass();
        while (true) {
            long j3 = sn6Var.c - sn6Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            sn6Var = sn6Var.f;
            sn6Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) sn6Var.b) + j);
            int iMin = (int) Math.min(sn6Var.c - i, j2);
            this.q.update(sn6Var.a, i, iMin);
            j2 -= (long) iMin;
            sn6Var = sn6Var.f;
            sn6Var.getClass();
            j = 0;
        }
    }
}
