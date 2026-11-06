package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s28 {
    public static final s28 e = new s28(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final aw c;
    public Object[] d;

    public s28(int i, int i2, Object[] objArr, aw awVar) {
        this.a = i;
        this.b = i2;
        this.c = awVar;
        this.d = objArr;
    }

    public static s28 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, aw awVar) {
        if (i3 > 30) {
            return new s28(0, 0, new Object[]{obj, obj2, obj3, obj4}, awVar);
        }
        int iM = h57.m(i, i3);
        int iM2 = h57.m(i2, i3);
        if (iM != iM2) {
            return new s28((1 << iM) | (1 << iM2), 0, iM < iM2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, awVar);
        }
        return new s28(0, 1 << iM, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, awVar)}, awVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, aw awVar) {
        Object obj3 = this.d[i];
        s28 s28VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, awVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        cx.J0(0, i, 6, objArr, objArr2);
        cx.G0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = s28VarJ;
        cx.G0(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        wk3 wk3VarZ = ct1.Z(ct1.b0(0, this.d.length), 2);
        int i = wk3VarZ.m;
        int i2 = wk3VarZ.n;
        int i3 = wk3VarZ.f2422o;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!im3.n(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iM = 1 << h57.m(i, i2);
        if (h(iM)) {
            return im3.n(obj, this.d[f(iM)]);
        }
        if (!i(iM)) {
            return false;
        }
        s28 s28VarS = s(t(iM));
        return i2 == 30 ? s28VarS.c(obj) : s28VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(s28 s28Var) {
        if (this == s28Var) {
            return true;
        }
        if (this.b == s28Var.b && this.a == s28Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == s28Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iM = 1 << h57.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (im3.n(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iM)) {
            return null;
        }
        s28 s28VarS = s(t(iM));
        if (i2 != 30) {
            return s28VarS.g(i, i2 + 5, obj);
        }
        wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28VarS.d.length), 2);
        int i3 = wk3VarZ.m;
        int i4 = wk3VarZ.n;
        int i5 = wk3VarZ.f2422o;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!im3.n(obj, s28VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s28VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final s28 k(int i, bk5 bk5Var) {
        bk5Var.g(bk5Var.r - 1);
        bk5Var.p = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != bk5Var.n) {
            return new s28(0, 0, h57.u(i, objArr), bk5Var.n);
        }
        this.d = h57.u(i, objArr);
        return this;
    }

    public final s28 l(int i, Object obj, Object obj2, int i2, bk5 bk5Var) {
        bk5 bk5Var2;
        s28 s28VarL;
        int iM = 1 << h57.m(i, i2);
        boolean zH = h(iM);
        aw awVar = this.c;
        if (zH) {
            int iF = f(iM);
            if (!im3.n(obj, this.d[iF])) {
                bk5Var.g(bk5Var.r + 1);
                aw awVar2 = bk5Var.n;
                if (awVar != awVar2) {
                    return new s28(this.a ^ iM, this.b | iM, a(iF, iM, i, obj, obj2, i2, awVar2), awVar2);
                }
                this.d = a(iF, iM, i, obj, obj2, i2, awVar2);
                this.a ^= iM;
                this.b |= iM;
                return this;
            }
            bk5Var.p = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (awVar == bk5Var.n) {
                this.d[iF + 1] = obj2;
                return this;
            }
            bk5Var.q++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new s28(this.a, this.b, objArrCopyOf, bk5Var.n);
        }
        if (!i(iM)) {
            bk5Var.g(bk5Var.r + 1);
            aw awVar3 = bk5Var.n;
            int iF2 = f(iM);
            Object[] objArr2 = this.d;
            if (awVar != awVar3) {
                return new s28(this.a | iM, this.b, h57.n(objArr2, iF2, obj, obj2), awVar3);
            }
            this.d = h57.n(objArr2, iF2, obj, obj2);
            this.a |= iM;
            return this;
        }
        int iT = t(iM);
        s28 s28VarS = s(iT);
        if (i2 == 30) {
            wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28VarS.d.length), 2);
            int i3 = wk3VarZ.m;
            int i4 = wk3VarZ.n;
            int i5 = wk3VarZ.f2422o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!im3.n(obj, s28VarS.d[i3])) {
                        if (i3 == i4) {
                            bk5Var.g(bk5Var.r + 1);
                            s28VarL = new s28(0, 0, h57.n(s28VarS.d, 0, obj, obj2), bk5Var.n);
                            break;
                        }
                        i3 += i5;
                    } else {
                        bk5Var.p = s28VarS.x(i3);
                        if (s28VarS.c != bk5Var.n) {
                            bk5Var.q++;
                            Object[] objArr3 = s28VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            s28VarL = new s28(0, 0, objArrCopyOf2, bk5Var.n);
                            break;
                        }
                        s28VarS.d[i3 + 1] = obj2;
                        s28VarL = s28VarS;
                        break;
                    }
                }
            } else {
                bk5Var.g(bk5Var.r + 1);
                s28VarL = new s28(0, 0, h57.n(s28VarS.d, 0, obj, obj2), bk5Var.n);
                break;
            }
            bk5Var2 = bk5Var;
        } else {
            bk5Var2 = bk5Var;
            s28VarL = s28VarS.l(i, obj, obj2, i2 + 5, bk5Var2);
        }
        return s28VarS == s28VarL ? this : r(iT, s28VarL, bk5Var2.n);
    }

    public final s28 m(s28 s28Var, int i, hn1 hn1Var, bk5 bk5Var) {
        s28 s28Var2;
        Object[] objArr;
        s28 s28VarJ;
        if (this == s28Var) {
            hn1Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            aw awVar = bk5Var.n;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + s28Var.d.length);
            int length = this.d.length;
            wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28Var.d.length), 2);
            int i3 = wk3VarZ.m;
            int i4 = wk3VarZ.n;
            int i5 = wk3VarZ.f2422o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(s28Var.d[i3])) {
                        hn1Var.a++;
                    } else {
                        Object[] objArr3 = s28Var.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != s28Var.d.length) {
                    return length == objArrCopyOf.length ? new s28(0, 0, objArrCopyOf, awVar) : new s28(0, 0, Arrays.copyOf(objArrCopyOf, length), awVar);
                }
            }
            return this;
        }
        int i6 = this.b | s28Var.b;
        int i7 = this.a;
        int i8 = s28Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (im3.n(this.d[f(iLowestOneBit)], s28Var.d[s28Var.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            up5.b("Check failed.");
        }
        if (im3.n(this.c, bk5Var.n) && this.a == i11 && this.b == i6) {
            s28Var2 = this;
        } else {
            s28Var2 = new s28(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = s28Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(iLowestOneBit2)) {
                s28VarJ = s(t(iLowestOneBit2));
                if (s28Var.i(iLowestOneBit2)) {
                    s28VarJ = s28VarJ.m(s28Var.s(s28Var.t(iLowestOneBit2)), i + 5, hn1Var, bk5Var);
                    objArr = objArr4;
                } else if (s28Var.h(iLowestOneBit2)) {
                    int iF = s28Var.f(iLowestOneBit2);
                    Object obj = s28Var.d[iF];
                    Object objX = s28Var.x(iF);
                    int i14 = bk5Var.r;
                    objArr = objArr4;
                    s28VarJ = s28VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, bk5Var);
                    if (bk5Var.r == i14) {
                        hn1Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (s28Var.i(iLowestOneBit2)) {
                    s28 s28VarS = s28Var.s(s28Var.t(iLowestOneBit2));
                    if (h(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (s28VarS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            hn1Var.a++;
                            s28VarJ = s28VarS;
                        } else {
                            s28VarJ = s28VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i15, bk5Var);
                        }
                    } else {
                        s28VarJ = s28VarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = s28Var.f(iLowestOneBit2);
                    Object obj4 = s28Var.d[iF4];
                    s28VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, s28Var.x(iF4), i + 5, bk5Var.n);
                }
            }
            objArr[length2] = s28VarJ;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (s28Var.h(iLowestOneBit3)) {
                int iF5 = s28Var.f(iLowestOneBit3);
                Object[] objArr5 = s28Var2.d;
                objArr5[i17] = s28Var.d[iF5];
                objArr5[i17 + 1] = s28Var.x(iF5);
                if (h(iLowestOneBit3)) {
                    hn1Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = s28Var2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = x(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(s28Var2)) {
            return s28Var.e(s28Var2) ? s28Var : s28Var2;
        }
        return this;
    }

    public final s28 n(int i, Object obj, int i2, bk5 bk5Var) {
        s28 s28VarN;
        int iM = 1 << h57.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (im3.n(obj, this.d[iF])) {
                return p(iF, iM, bk5Var);
            }
        } else if (i(iM)) {
            int iT = t(iM);
            s28 s28VarS = s(iT);
            if (i2 == 30) {
                wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28VarS.d.length), 2);
                int i3 = wk3VarZ.m;
                int i4 = wk3VarZ.n;
                int i5 = wk3VarZ.f2422o;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!im3.n(obj, s28VarS.d[i3])) {
                            if (i3 == i4) {
                                s28VarN = s28VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            s28VarN = s28VarS.k(i3, bk5Var);
                            break;
                        }
                    }
                } else {
                    s28VarN = s28VarS;
                    break;
                }
            } else {
                s28VarN = s28VarS.n(i, obj, i2 + 5, bk5Var);
            }
            return q(s28VarS, s28VarN, iT, iM, bk5Var.n);
        }
        return this;
    }

    public final s28 o(int i, Object obj, Object obj2, int i2, bk5 bk5Var) {
        bk5 bk5Var2;
        s28 s28VarO;
        int iM = 1 << h57.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            return (im3.n(obj, this.d[iF]) && im3.n(obj2, x(iF))) ? p(iF, iM, bk5Var) : this;
        }
        if (!i(iM)) {
            return this;
        }
        int iT = t(iM);
        s28 s28VarS = s(iT);
        if (i2 == 30) {
            wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28VarS.d.length), 2);
            int i3 = wk3VarZ.m;
            int i4 = wk3VarZ.n;
            int i5 = wk3VarZ.f2422o;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!im3.n(obj, s28VarS.d[i3]) || !im3.n(obj2, s28VarS.x(i3))) {
                        if (i3 == i4) {
                            s28VarO = s28VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        s28VarO = s28VarS.k(i3, bk5Var);
                        break;
                    }
                }
            } else {
                s28VarO = s28VarS;
                break;
            }
            bk5Var2 = bk5Var;
        } else {
            bk5Var2 = bk5Var;
            s28VarO = s28VarS.o(i, obj, obj2, i2 + 5, bk5Var2);
        }
        return q(s28VarS, s28VarO, iT, iM, bk5Var2.n);
    }

    public final s28 p(int i, int i2, bk5 bk5Var) {
        bk5Var.g(bk5Var.r - 1);
        bk5Var.p = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != bk5Var.n) {
            return new s28(i2 ^ this.a, this.b, h57.u(i, objArr), bk5Var.n);
        }
        this.d = h57.u(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final s28 q(s28 s28Var, s28 s28Var2, int i, int i2, aw awVar) {
        aw awVar2 = this.c;
        if (s28Var2 != null) {
            return (awVar2 == awVar || s28Var != s28Var2) ? r(i, s28Var2, awVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (awVar2 != awVar) {
            return new s28(this.a, this.b ^ i2, h57.v(i, objArr), awVar);
        }
        this.d = h57.v(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final s28 r(int i, s28 s28Var, aw awVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && s28Var.d.length == 2 && s28Var.b == 0) {
            s28Var.a = this.b;
            return s28Var;
        }
        if (this.c == awVar) {
            objArr[i] = s28Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = s28Var;
        return new s28(this.a, this.b, objArrCopyOf, awVar);
    }

    public final s28 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (s28) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.f127o = w(r11, r4, (o.s28) r13.f127o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.android.core.u0 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s28.u(int, int, java.lang.Object, java.lang.Object):io.sentry.android.core.u0");
    }

    public final s28 v(int i, int i2, Object obj) {
        s28 s28VarV;
        int iM = 1 << h57.m(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (!im3.n(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new s28(this.a ^ iM, this.b, h57.u(iF, objArr), null);
            }
        } else {
            if (!i(iM)) {
                return this;
            }
            int iT = t(iM);
            s28 s28VarS = s(iT);
            if (i2 == 30) {
                wk3 wk3VarZ = ct1.Z(ct1.b0(0, s28VarS.d.length), 2);
                int i3 = wk3VarZ.m;
                int i4 = wk3VarZ.n;
                int i5 = wk3VarZ.f2422o;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!im3.n(obj, s28VarS.d[i3])) {
                            if (i3 == i4) {
                                s28VarV = s28VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = s28VarS.d;
                            if (objArr2.length != 2) {
                                s28VarV = new s28(0, 0, h57.u(i3, objArr2), null);
                                break;
                            }
                            s28VarV = null;
                            break;
                        }
                    }
                } else {
                    s28VarV = s28VarS;
                    break;
                }
            } else {
                s28VarV = s28VarS.v(i, i2 + 5, obj);
            }
            if (s28VarV != null) {
                return s28VarS != s28VarV ? w(iT, iM, s28VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new s28(this.a, this.b ^ iM, h57.v(iT, objArr3), null);
            }
        }
        return null;
    }

    public final s28 w(int i, int i2, s28 s28Var) {
        Object[] objArr = s28Var.d;
        if (objArr.length != 2 || s28Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = s28Var;
            return new s28(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            s28Var.a = this.b;
            return s28Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        cx.G0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        cx.G0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new s28(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
