package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t47 implements Iterable, su3 {
    public static final t47 q = new t47(0, 0, 0, null);
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2083o;
    public final long[] p;

    public t47(long j, long j2, long j3, long[] jArr) {
        this.m = j;
        this.n = j2;
        this.f2083o = j3;
        this.p = jArr;
    }

    public final t47 a(t47 t47Var) {
        long[] jArr;
        t47 t47VarB = this;
        t47 t47Var2 = q;
        if (t47Var == t47Var2) {
            return t47VarB;
        }
        if (t47VarB == t47Var2) {
            return t47Var2;
        }
        long j = t47Var.f2083o;
        long j2 = t47Var.f2083o;
        long[] jArr2 = t47Var.p;
        long j3 = t47Var.n;
        long j4 = t47Var.m;
        long j5 = t47VarB.f2083o;
        if (j == j5 && jArr2 == (jArr = t47VarB.p)) {
            return new t47(t47VarB.m & (~j4), t47VarB.n & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                t47VarB = t47VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    t47VarB = t47VarB.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    t47VarB = t47VarB.b(((long) i2) + j2 + 64);
                }
            }
        }
        return t47VarB;
    }

    public final t47 b(long j) {
        long[] jArr;
        int iE;
        long[] jArr2;
        long j2 = j - this.f2083o;
        if (im3.u(j2, 0L) >= 0 && im3.u(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.n;
            if ((j4 & j3) != 0) {
                return new t47(this.m, j4 & (~j3), this.f2083o, this.p);
            }
        } else if (im3.u(j2, 64L) >= 0 && im3.u(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.m;
            if ((j6 & j5) != 0) {
                return new t47(j6 & (~j5), this.n, this.f2083o, this.p);
            }
        } else if (im3.u(j2, 0L) < 0 && (jArr = this.p) != null && (iE = u47.e(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iE > 0) {
                    cx.H0(jArr, jArr3, 0, 0, iE);
                }
                if (iE < i) {
                    cx.H0(jArr, jArr3, iE, iE + 1, length);
                }
                jArr2 = jArr3;
            }
            return new t47(this.m, this.n, this.f2083o, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.f2083o;
        if (im3.u(j2, 0L) >= 0 && im3.u(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.n) != 0;
        }
        if (im3.u(j2, 64L) < 0 || im3.u(j2, 128L) >= 0) {
            return im3.u(j2, 0L) <= 0 && (jArr = this.p) != null && u47.e(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.m) != 0;
    }

    public final t47 d(t47 t47Var) {
        t47 t47VarF;
        long[] jArr;
        t47 t47VarF2 = this;
        t47 t47Var2 = q;
        if (t47Var == t47Var2) {
            return t47VarF2;
        }
        if (t47VarF2 == t47Var2) {
            return t47Var;
        }
        long j = t47Var.f2083o;
        long j2 = t47Var.f2083o;
        long[] jArr2 = t47Var.p;
        long j3 = t47Var.n;
        long j4 = t47Var.m;
        long j5 = t47VarF2.f2083o;
        long j6 = t47VarF2.n;
        long j7 = t47VarF2.m;
        if (j == j5 && jArr2 == (jArr = t47VarF2.p)) {
            return new t47(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = t47VarF2.p;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    t47VarF2 = t47VarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        t47VarF2 = t47VarF2.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        t47VarF2 = t47VarF2.f(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return t47VarF2;
        }
        if (jArr3 != null) {
            t47VarF = t47Var;
            for (long j9 : jArr3) {
                t47VarF = t47VarF.f(j9);
            }
        } else {
            t47VarF = t47Var;
        }
        long j10 = t47VarF2.f2083o;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    t47VarF = t47VarF.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    t47VarF = t47VarF.f(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return t47VarF;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final t47 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.f2083o;
        long j5 = j - j4;
        long j6 = 0;
        int iU = im3.u(j5, 0L);
        long j7 = this.n;
        if (iU < 0 || im3.u(j5, 64L) >= 0) {
            int iU2 = im3.u(j5, 64L);
            long j8 = this.m;
            int i2 = 64;
            if (iU2 < 0 || im3.u(j5, 128L) >= 0) {
                int iU3 = im3.u(j5, 128L);
                long[] jArr3 = this.p;
                if (iU3 < 0) {
                    if (jArr3 == null) {
                        return new t47(this.m, this.n, this.f2083o, new long[]{j});
                    }
                    int iE = u47.e(jArr3, j);
                    if (iE < 0) {
                        int i3 = -(iE + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        cx.H0(jArr3, jArr4, 0, 0, i3);
                        cx.H0(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new t47(this.m, this.n, this.f2083o, jArr4);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (im3.u(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    l07 l07Var = null;
                    while (true) {
                        if (im3.u(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (l07Var == null) {
                                l07Var = new l07(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((ow4) l07Var.n).a(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (l07Var == null) {
                        jArr = jArr3;
                    } else {
                        ow4 ow4Var = (ow4) l07Var.n;
                        int i5 = ow4Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = ow4Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new t47(j10, j3, j2, jArr).f(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new t47(j8 | j12, this.n, this.f2083o, this.p);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new t47(this.m, j7 | j13, this.f2083o, this.p);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ct1.M(new s47(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(mv0.Z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
