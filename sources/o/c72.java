package o;

/* JADX INFO: loaded from: classes.dex */
public final class c72 implements Comparable {
    public static final aw n = new aw(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f496o = lq1.p(4611686018427387903L);
    public static final long p = lq1.p(-4611686018427387903L);
    public static final long q = 9223372036854759646L;
    public final long m;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jI = lq1.i(j, j3);
        if (-4611686018426L > jI || jI >= 4611686018427L) {
            return lq1.p(jI);
        }
        long j4 = ((jI * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = e72.a;
        return j4;
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strG0 = ub7.g0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strG0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strG0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strG0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strG0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == f496o || j == p;
    }

    public static final boolean e(long j) {
        return j < 0;
    }

    public static final long f(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return lq1.p(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i2 = e72.a;
            return j4;
        }
        long jI = lq1.i(j >> 1, j2 >> 1);
        if (jI == 9223372036854759646L) {
            hk0.g("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jI == 4611686018427387903L || jI == -4611686018427387903L) {
            return lq1.p(jI);
        }
        if (-4611686018426L > jI || jI >= 4611686018427L) {
            return lq1.p(ct1.w(jI, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jI * 1000000) << 1;
        int i3 = e72.a;
        return j5;
    }

    public static final long g(long j, g72 g72Var) {
        if (j == f496o) {
            return Long.MAX_VALUE;
        }
        if (j == p) {
            return Long.MIN_VALUE;
        }
        return g72Var.m.convert(j >> 1, ((((int) j) & 1) == 0 ? g72.NANOSECONDS : g72.MILLISECONDS).m);
    }

    public static final long h(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = e72.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((c72) obj).m;
        long j2 = this.m;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return im3.u(j2, j);
        }
        int i = (((int) j2) & 1) - (((int) j) & 1);
        return e(j2) ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c72) {
            return this.m == ((c72) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.m);
    }

    public final String toString() {
        long jH = this.m;
        if (jH == 0) {
            return "0s";
        }
        if (jH == f496o) {
            return "Infinity";
        }
        if (jH == p) {
            return "-Infinity";
        }
        boolean zE = e(jH);
        StringBuilder sb = new StringBuilder();
        if (zE) {
            sb.append('-');
        }
        if (e(jH)) {
            jH = h(jH);
        }
        long jG = g(jH, g72.DAYS);
        int i = 0;
        int iG = d(jH) ? 0 : (int) (g(jH, g72.HOURS) % 24);
        int iG2 = d(jH) ? 0 : (int) (g(jH, g72.MINUTES) % 60);
        int iG3 = d(jH) ? 0 : (int) (g(jH, g72.SECONDS) % 60);
        int iC = c(jH);
        boolean z = jG != 0;
        boolean z2 = iG != 0;
        boolean z3 = iG2 != 0;
        boolean z4 = (iG3 == 0 && iC == 0) ? false : true;
        if (z) {
            sb.append(jG);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG2);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iG3 != 0 || z || z2 || z3) {
                b(sb, iG3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i = i4;
        }
        if (zE && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
