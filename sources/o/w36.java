package o;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class w36 implements of0 {
    public final q67 m;
    public final bf0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2372o;

    public w36(q67 q67Var) {
        q67Var.getClass();
        this.m = q67Var;
        this.n = new bf0();
    }

    @Override // o.of0
    public final long C(ai0 ai0Var) {
        ai0Var.getClass();
        return j51.w(this, ai0Var, ai0Var.d(), Long.MAX_VALUE);
    }

    @Override // o.of0
    public final boolean C0(ai0 ai0Var) {
        ai0Var.getClass();
        int iD = ai0Var.d();
        if (!this.f2372o) {
            return iD >= 0 && iD <= ai0Var.d() && (iD == 0 || j51.w(this, ai0Var, iD, 1L) != -1);
        }
        hk0.l("closed");
        return false;
    }

    public final int F() throws EOFException {
        k0(4L);
        int iH0 = this.n.H0();
        return ((iH0 & 255) << 24) | (((-16777216) & iH0) >>> 24) | ((16711680 & iH0) >>> 8) | ((65280 & iH0) << 8);
    }

    public final long G() throws EOFException {
        char c;
        char c2;
        long jH0;
        k0(8L);
        bf0 bf0Var = this.n;
        if (bf0Var.n < 8) {
            throw new EOFException();
        }
        sn6 sn6Var = bf0Var.m;
        sn6Var.getClass();
        int i = sn6Var.b;
        int i2 = sn6Var.c;
        if (i2 - i < 8) {
            jH0 = ((((long) bf0Var.H0()) & 4294967295L) << 32) | (4294967295L & ((long) bf0Var.H0()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = sn6Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j2 = j | (((long) bArr[i3]) & 255);
            bf0Var.n -= 8;
            if (i4 == i2) {
                bf0Var.m = sn6Var.a();
                vn6.a(sn6Var);
            } else {
                sn6Var.b = i4;
            }
            jH0 = j2;
        }
        return ((jH0 & 255) << 56) | (((-72057594037927936L) & jH0) >>> 56) | ((71776119061217280L & jH0) >>> c2) | ((280375465082880L & jH0) >>> c) | ((1095216660480L & jH0) >>> 8) | ((4278190080L & jH0) << 8) | ((16711680 & jH0) << c) | ((65280 & jH0) << c2);
    }

    @Override // o.of0
    public final int I0(ya5 ya5Var) throws EOFException {
        bf0 bf0Var;
        ya5Var.getClass();
        if (this.f2372o) {
            hk0.l("closed");
            return 0;
        }
        do {
            bf0Var = this.n;
            int iD = b.d(bf0Var, ya5Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                bf0Var.skip(ya5Var.m[iD].d());
                return iD;
            }
        } while (this.m.i0(bf0Var, 8192L) != -1);
        return -1;
    }

    public final short J() {
        k0(2L);
        return this.n.K0();
    }

    @Override // o.of0
    public final long T(ai0 ai0Var) {
        ai0Var.getClass();
        long jMax = 0;
        if (this.f2372o) {
            hk0.l("closed");
            return 0L;
        }
        while (true) {
            bf0 bf0Var = this.n;
            long J = bf0Var.J(ai0Var, jMax);
            if (J != -1) {
                return J;
            }
            long j = bf0Var.n;
            if (this.m.i0(bf0Var, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public final short Y() {
        k0(2L);
        return this.n.L0();
    }

    @Override // o.of0
    public final String a0(Charset charset) {
        charset.getClass();
        q67 q67Var = this.m;
        bf0 bf0Var = this.n;
        bf0Var.T0(q67Var);
        return bf0Var.M0(bf0Var.n, charset);
    }

    public final String b0(long j) {
        k0(j);
        return this.n.M0(j, vn0.a);
    }

    public final String c0(long j) {
        if (j < 0) {
            gk0.h(e41.g("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long j3 = j(0L, (byte) 10, j2);
        bf0 bf0Var = this.n;
        if (j3 != -1) {
            return b.c(bf0Var, j3);
        }
        if (j2 < Long.MAX_VALUE && m0(j2) && bf0Var.F(j2 - 1) == 13 && m0(j2 + 1) && bf0Var.F(j2) == 10) {
            return b.c(bf0Var, j2);
        }
        bf0 bf0Var2 = new bf0();
        bf0Var.u(bf0Var2, 0L, Math.min(32L, bf0Var.n));
        throw new EOFException("\\n not found: limit=" + Math.min(bf0Var.n, j) + " content=" + bf0Var2.o0(bf0Var2.n).e() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f2372o) {
            return;
        }
        this.f2372o = true;
        this.m.close();
        this.n.e();
    }

    public final boolean e() {
        if (this.f2372o) {
            hk0.l("closed");
            return false;
        }
        bf0 bf0Var = this.n;
        return bf0Var.z() && this.m.i0(bf0Var, 8192L) == -1;
    }

    @Override // o.of0, o.nf0
    public final bf0 h() {
        return this.n;
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return this.m.i();
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) {
        bf0Var.getClass();
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f2372o) {
            hk0.l("closed");
            return 0L;
        }
        bf0 bf0Var2 = this.n;
        if (bf0Var2.n == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.m.i0(bf0Var2, 8192L) == -1) {
                return -1L;
            }
        }
        return bf0Var2.i0(bf0Var, Math.min(j, bf0Var2.n));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2372o;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef A[SYNTHETIC] */
    public final long j(long j, byte b, long j2) {
        sn6 sn6Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7 = 0;
        if (this.f2372o) {
            hk0.l("closed");
            return 0L;
        }
        if (0 > j2) {
            gk0.h(e41.g("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            bf0 bf0Var = this.n;
            if (j7 > jMax || jMax > j2) {
                throw new IllegalArgumentException(("size=" + bf0Var.n + " fromIndex=" + jMax + " toIndex=" + j2).toString());
            }
            long j8 = bf0Var.n;
            long j9 = j2 > j8 ? j8 : j2;
            if (jMax == j9 || (sn6Var = bf0Var.m) == null) {
                j3 = j7;
            } else {
                if (j8 - jMax >= jMax) {
                    j3 = j7;
                    j4 = -1;
                    while (true) {
                        long j10 = ((long) (sn6Var.c - sn6Var.b)) + j7;
                        if (j10 > jMax) {
                            break;
                        }
                        sn6Var = sn6Var.f;
                        sn6Var.getClass();
                        j7 = j10;
                    }
                    long j11 = jMax;
                    while (true) {
                        if (j7 >= j9) {
                            j5 = j4;
                            break;
                        }
                        byte[] bArr = sn6Var.a;
                        long j12 = j7;
                        int iMin = (int) Math.min(sn6Var.c, (((long) sn6Var.b) + j9) - j12);
                        for (int i = (int) ((((long) sn6Var.b) + j11) - j12); i < iMin; i++) {
                            if (bArr[i] == b) {
                                j5 = ((long) (i - sn6Var.b)) + j12;
                                break;
                            }
                        }
                        j11 = j12 + ((long) (sn6Var.c - sn6Var.b));
                        sn6Var = sn6Var.f;
                        sn6Var.getClass();
                        j7 = j11;
                    }
                } else {
                    while (j8 > jMax) {
                        sn6Var = sn6Var.g;
                        sn6Var.getClass();
                        j8 -= (long) (sn6Var.c - sn6Var.b);
                        j7 = j7;
                    }
                    j3 = j7;
                    long j13 = jMax;
                    while (true) {
                        if (j8 < j9) {
                            j4 = -1;
                            byte[] bArr2 = sn6Var.a;
                            long j14 = j13;
                            int iMin2 = (int) Math.min(sn6Var.c, (((long) sn6Var.b) + j9) - j8);
                            int i2 = (int) ((((long) sn6Var.b) + j14) - j8);
                            while (true) {
                                if (i2 >= iMin2) {
                                    j13 = ((long) (sn6Var.c - sn6Var.b)) + j8;
                                    sn6Var = sn6Var.f;
                                    sn6Var.getClass();
                                    j8 = j13;
                                } else if (bArr2[i2] == b) {
                                    j5 = ((long) (i2 - sn6Var.b)) + j8;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (j5 != j4) {
                    return j5;
                }
                j6 = bf0Var.n;
                if (j6 >= j2 && this.m.i0(bf0Var, 8192L) != j4) {
                    jMax = Math.max(jMax, j6);
                    j7 = j3;
                }
            }
            j4 = -1;
            j5 = j4;
            if (j5 != j4) {
                return j5;
            }
            j6 = bf0Var.n;
            return j6 >= j2 ? j4 : j4;
        }
        return -1L;
    }

    public final void k0(long j) {
        if (!m0(j)) {
            throw new EOFException();
        }
    }

    @Override // o.of0
    public final boolean m0(long j) {
        bf0 bf0Var;
        if (j < 0) {
            gk0.h(e41.g("byteCount < 0: ", j));
            return false;
        }
        if (this.f2372o) {
            hk0.l("closed");
            return false;
        }
        do {
            bf0Var = this.n;
            if (bf0Var.n >= j) {
                return true;
            }
        } while (this.m.i0(bf0Var, 8192L) != -1);
        return false;
    }

    @Override // o.of0
    public final w36 peek() {
        return new w36(new bi5(this));
    }

    public final byte q() {
        k0(1L);
        return this.n.c0();
    }

    @Override // o.of0
    public final long r0(nf0 nf0Var) {
        bf0 bf0Var;
        long j = 0;
        while (true) {
            q67 q67Var = this.m;
            bf0Var = this.n;
            if (q67Var.i0(bf0Var, 8192L) == -1) {
                break;
            }
            long j2 = bf0Var.j();
            if (j2 > 0) {
                j += j2;
                nf0Var.W(bf0Var, j2);
            }
        }
        long j3 = bf0Var.n;
        if (j3 <= 0) {
            return j;
        }
        long j4 = j + j3;
        nf0Var.W(bf0Var, j3);
        return j4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        bf0 bf0Var = this.n;
        if (bf0Var.n == 0 && this.m.i0(bf0Var, 8192L) == -1) {
            return -1;
        }
        return bf0Var.read(byteBuffer);
    }

    @Override // o.of0
    public final void skip(long j) throws EOFException {
        if (this.f2372o) {
            hk0.l("closed");
            return;
        }
        while (j > 0) {
            bf0 bf0Var = this.n;
            if (bf0Var.n == 0 && this.m.i0(bf0Var, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, bf0Var.n);
            bf0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.m + ')';
    }

    public final ai0 u(long j) {
        k0(j);
        return this.n.o0(j);
    }

    public final int z() {
        k0(4L);
        return this.n.H0();
    }
}
