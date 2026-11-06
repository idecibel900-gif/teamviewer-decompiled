package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ab7 extends vn4 implements aj1, k01 {
    public final rp3 s0;
    public final zn8 t0;
    public final r8 u0;
    public final wj5 v0;
    public int w0;
    public final nq3 x0;

    public ab7(rp3 rp3Var, zn8 zn8Var, r8 r8Var, fq6 fq6Var) {
        fq6Var.getClass();
        this.s0 = rp3Var;
        this.t0 = zn8Var;
        this.u0 = r8Var;
        this.v0 = rp3Var.b;
        this.w0 = -1;
        this.x0 = rp3Var.a.b ? null : new nq3(fq6Var);
    }

    public final lq3 A0() {
        return new nd(this.s0.a, this.u0).l();
    }

    @Override // o.vn4, o.aj1
    public final double B() {
        r8 r8Var = this.u0;
        String strM = r8Var.m();
        try {
            double d = Double.parseDouble(strM);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            r8.r(r8Var, vs1.J(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'double' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    public final rp3 B0() {
        return this.s0;
    }

    @Override // o.vn4, o.k01
    public final Object C(fq6 fq6Var, int i, nw3 nw3Var, Object obj) {
        gy8 gy8Var = (gy8) this.u0.d;
        fq6Var.getClass();
        nw3Var.getClass();
        boolean z = this.t0 == zn8.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) gy8Var.e;
            int i2 = gy8Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) gy8Var.d)[i2] = jk0.B;
            }
        }
        Object objA = a(nw3Var);
        if (z) {
            int[] iArr2 = (int[]) gy8Var.e;
            int i3 = gy8Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                gy8Var.b = i4;
                if (i4 == ((Object[]) gy8Var.d).length) {
                    gy8Var.i();
                }
            }
            Object[] objArr = (Object[]) gy8Var.d;
            int i5 = gy8Var.b;
            objArr[i5] = ((dq3) gy8Var.c).g ? objA : yl7.C;
            ((int[]) gy8Var.e)[i5] = -2;
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0130, please report this as an issue */
    @Override // o.aj1
    public final Object a(nw3 nw3Var) {
        String message;
        String strA;
        rp3 rp3Var = this.s0;
        r8 r8Var = this.u0;
        gy8 gy8Var = (gy8) r8Var.d;
        nw3Var.getClass();
        try {
            if (!(nw3Var instanceof fo5)) {
                return nw3Var.b(this);
            }
            String strB = r8Var.B(et1.t(rp3Var, ((fo5) nw3Var).d()));
            if (strB != null) {
                try {
                    it1.w((fo5) nw3Var, this, strB);
                    throw null;
                } catch (nq6 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strJ0 = ub7.j0(ub7.r0(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iY = ub7.Y(message3, '\n', 0, 6);
                    if (iY != -1) {
                        strSubstring = message3.substring(iY + 1, message3.length());
                    }
                    r8.r(r8Var, strJ0, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strT = et1.t(rp3Var, ((fo5) nw3Var).d());
            lq3 lq3VarA0 = A0();
            String strA2 = ((fo5) nw3Var).d().a();
            if (!(lq3VarA0 instanceof cr3)) {
                StringBuilder sb = new StringBuilder("Expected ");
                x86 x86Var = w86.a;
                sb.append(x86Var.b(cr3.class).f());
                sb.append(", but had ");
                sb.append(x86Var.b(lq3VarA0.getClass()).f());
                sb.append(" as the serialized body of ");
                sb.append(strA2);
                throw new jq3(vs1.u(sb.toString(), gy8Var.f(), -1, null, rp3Var.a.g ? vs1.I(-1, lq3VarA0.toString()).toString() : null));
            }
            cr3 cr3Var = (cr3) lq3VarA0;
            lq3 lq3Var = (lq3) cr3Var.get(strT);
            if (lq3Var != null) {
                gr3 gr3VarA = mq3.a(lq3Var);
                strA = gr3VarA instanceof zq3 ? null : gr3VarA.a();
            }
            try {
                it1.w((fo5) nw3Var, this, strA);
                throw null;
            } catch (nq6 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw new jq3(vs1.u(message4, null, -1, null, rp3Var.a.g ? vs1.I(-1, cr3Var.toString()).toString() : null));
            }
            message = e.getMessage();
            message.getClass();
            if (ub7.Q(message, "at path", false)) {
                throw e;
            }
            throw new mr4(e.getMessage() + " at path: " + gy8Var.f(), e, e.m, e.n);
        } catch (mr4 e3) {
            message = e3.getMessage();
            message.getClass();
            if (ub7.Q(message, "at path", false)) {
                throw e3;
            }
            throw new mr4(e3.getMessage() + " at path: " + gy8Var.f(), e3, e3.m, e3.n);
        }
    }

    @Override // o.vn4, o.aj1
    public final boolean b() {
        boolean z;
        boolean z2;
        r8 r8Var = this.u0;
        int iM = r8Var.M();
        String str = (String) r8Var.g;
        if (iM == str.length()) {
            r8.r(r8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM) == '\"') {
            iM++;
            z = true;
        } else {
            z = false;
        }
        int iG = r8Var.G(iM);
        if (iG >= str.length() || iG == -1) {
            r8.r(r8Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iG + 1;
        int iCharAt = str.charAt(iG) | ' ';
        if (iCharAt == 102) {
            r8Var.e(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                r8.r(r8Var, "Expected valid boolean literal prefix, but had '" + r8Var.m() + '\'', 0, null, 6);
                throw null;
            }
            r8Var.e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (r8Var.b == str.length()) {
            r8.r(r8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(r8Var.b) == '\"') {
            r8Var.b++;
            return z2;
        }
        r8.r(r8Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // o.vn4, o.aj1
    public final char c() {
        r8 r8Var = this.u0;
        String strM = r8Var.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        r8.r(r8Var, to7.i('\'', "Expected single char, but got '", strM), 0, null, 6);
        throw null;
    }

    @Override // o.vn4, o.aj1
    public final aj1 d(fq6 fq6Var) {
        fq6Var.getClass();
        return cb7.a(fq6Var) ? new iq3(this.u0, this.s0) : this;
    }

    @Override // o.vn4, o.aj1
    public final int e(fq6 fq6Var) {
        fq6Var.getClass();
        r8 r8Var = this.u0;
        String strL = r8Var.l();
        String strConcat = " at path ".concat(((gy8) r8Var.d).f());
        strL.getClass();
        int iC = qf0.C(fq6Var, this.s0, strL);
        if (iC != -3) {
            return iC;
        }
        throw new nq6(fq6Var.a() + " does not contain element with name '" + strL + '\'' + strConcat);
    }

    @Override // o.vn4, o.aj1
    public final int g() {
        r8 r8Var = this.u0;
        long j = r8Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        r8.r(r8Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // o.k01
    public final wj5 h() {
        return this.v0;
    }

    @Override // o.vn4, o.k01
    public final void i(fq6 fq6Var) {
        fq6Var.getClass();
        if (fq6Var.e() == 0 && qf0.H(this.s0, fq6Var)) {
            while (l(fq6Var) != -1) {
            }
        }
        r8 r8Var = this.u0;
        if (r8Var.N()) {
            vs1.D(r8Var, "");
            throw null;
        }
        r8Var.i(this.t0.n);
        gy8 gy8Var = (gy8) r8Var.d;
        int i = gy8Var.b;
        int[] iArr = (int[]) gy8Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            gy8Var.b = i;
        }
        if (i != -1) {
            gy8Var.b = i - 1;
        }
    }

    @Override // o.vn4, o.aj1
    public final String j() {
        return this.u0.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String, java.lang.Throwable] */
    @Override // o.k01
    public final int l(fq6 fq6Var) throws Throwable {
        r8 r8Var = this.u0;
        gy8 gy8Var = (gy8) r8Var.d;
        fq6Var.getClass();
        zn8 zn8Var = this.t0;
        int iOrdinal = zn8Var.ordinal();
        Throwable th = null;
        char c = ':';
        int i = 0;
        zN = false;
        boolean zN = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zN2 = r8Var.N();
            while (true) {
                boolean zC = r8Var.c();
                nq3 nq3Var = this.x0;
                if (zC) {
                    String strF = r8Var.f();
                    r8Var.i(c);
                    rp3 rp3Var = this.s0;
                    int iC = qf0.C(fq6Var, rp3Var, strF);
                    Throwable th2 = th;
                    if (iC != -3) {
                        if (nq3Var != null) {
                            q82 q82Var = nq3Var.a;
                            if (iC < 64) {
                                q82Var.a |= 1 << iC;
                            } else {
                                int i3 = (iC >>> 6) - 1;
                                long[] jArr = (long[]) q82Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iC & 63));
                            }
                        }
                        i2 = iC;
                        break;
                    }
                    if (!qf0.H(rp3Var, fq6Var)) {
                        int i4 = gy8Var.b;
                        int[] iArr = (int[]) gy8Var.e;
                        if (iArr[i4] == -2) {
                            iArr[i4] = -1;
                            i4--;
                            gy8Var.b = i4;
                        }
                        if (i4 != -1) {
                            gy8Var.b = i4 - 1;
                        }
                        r8Var.q(ub7.e0(((String) r8Var.g).subSequence(0, r8Var.b).toString(), 0, 6, strF), to7.i('\'', "Encountered an unknown key '", strF), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                        throw th2;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bC = r8Var.C();
                    if (bC == 8 || bC == 6) {
                        while (true) {
                            byte bC2 = r8Var.C();
                            if (bC2 == 1) {
                                r8Var.f();
                            } else {
                                if (bC2 == 8 || bC2 == 6) {
                                    arrayList.add(Byte.valueOf(bC2));
                                } else if (bC2 != 9) {
                                    ?? r13 = th2;
                                    if (bC2 == 7) {
                                        if (((Number) lv0.v0(arrayList)).byteValue() != 6) {
                                            r8.r(r8Var, "found } instead of ]", 0, r13, 6);
                                            throw r13;
                                        }
                                        qv0.e0(arrayList);
                                    } else if (bC2 == 10) {
                                        r8.r(r8Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, r13, 6);
                                        throw r13;
                                    }
                                } else {
                                    if (((Number) lv0.v0(arrayList)).byteValue() != 8) {
                                        ?? r14 = th2;
                                        r8.r(r8Var, "found ] instead of }", 0, r14, 6);
                                        throw r14;
                                    }
                                    qv0.e0(arrayList);
                                }
                                r8Var.g();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                                th2 = null;
                            }
                        }
                    } else {
                        r8Var.m();
                    }
                    zN2 = r8Var.N();
                    th = null;
                    c = ':';
                } else if (!zN2) {
                    if (nq3Var == null) {
                        break;
                    }
                    q82 q82Var2 = nq3Var.a;
                    ea1 ea1Var = (ea1) q82Var2.c;
                    fq6 fq6Var2 = (fq6) q82Var2.b;
                    int iE = fq6Var2.e();
                    while (true) {
                        long j = q82Var2.a;
                        long j2 = -1;
                        if (j == -1) {
                            if (iE <= 64) {
                                break;
                            }
                            long[] jArr2 = (long[]) q82Var2.d;
                            int length = jArr2.length;
                            loop3: while (i < length) {
                                int i5 = i + 1;
                                int i6 = i5 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i7 = iNumberOfTrailingZeros + i6;
                                        if (((Boolean) ea1Var.invoke(fq6Var2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i7;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i5;
                                        j2 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        q82Var2.a |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) ea1Var.invoke(fq6Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i2 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    vs1.D(r8Var, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zN3 = r8Var.N();
            if (r8Var.c()) {
                int i8 = this.w0;
                if (i8 != -1 && !zN3) {
                    r8.r(r8Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.w0 = i2;
            } else if (zN3) {
                vs1.D(r8Var, "array");
                throw null;
            }
        } else {
            int i9 = this.w0;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                r8Var.i(':');
            } else if (i9 != -1) {
                zN = r8Var.N();
            }
            if (r8Var.c()) {
                if (objArr != false) {
                    int i10 = this.w0;
                    int i11 = r8Var.b;
                    if (i10 == -1) {
                        if (zN) {
                            r8.r(r8Var, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!zN) {
                        r8.r(r8Var, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.w0 + 1;
                this.w0 = i2;
            } else if (zN) {
                vs1.D(r8Var, "object");
                throw null;
            }
        }
        if (zn8Var != zn8.MAP) {
            ((int[]) gy8Var.e)[gy8Var.b] = i2;
        }
        return i2;
    }

    @Override // o.vn4, o.aj1
    public final long p() {
        return this.u0.j();
    }

    @Override // o.vn4, o.aj1
    public final boolean r() {
        boolean z;
        nq3 nq3Var = this.x0;
        if (!(nq3Var != null ? nq3Var.b : false)) {
            r8 r8Var = this.u0;
            int iG = r8Var.G(r8Var.M());
            String str = (String) r8Var.g;
            int length = str.length() - iG;
            if (length >= 4 && iG != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || e8.j(str.charAt(iG + 4)) != 0) {
                            r8Var.b = iG + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(iG + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // o.vn4, o.aj1
    public final k01 u(fq6 fq6Var) {
        fq6Var.getClass();
        rp3 rp3Var = this.s0;
        zn8 zn8VarO = g57.o(rp3Var, fq6Var);
        r8 r8Var = this.u0;
        gy8 gy8Var = (gy8) r8Var.d;
        int i = gy8Var.b + 1;
        gy8Var.b = i;
        if (i == ((Object[]) gy8Var.d).length) {
            gy8Var.i();
        }
        ((Object[]) gy8Var.d)[i] = fq6Var;
        r8Var.i(zn8VarO.m);
        if (r8Var.C() == 4) {
            r8.r(r8Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = zn8VarO.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new ab7(rp3Var, zn8VarO, r8Var, fq6Var);
        }
        return (this.t0 == zn8VarO && rp3Var.a.b) ? this : new ab7(rp3Var, zn8VarO, r8Var, fq6Var);
    }

    @Override // o.vn4, o.aj1
    public final byte x() {
        r8 r8Var = this.u0;
        long j = r8Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        r8.r(r8Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // o.vn4, o.aj1
    public final short y() {
        r8 r8Var = this.u0;
        long j = r8Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        r8.r(r8Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // o.vn4, o.aj1
    public final float z() {
        r8 r8Var = this.u0;
        String strM = r8Var.m();
        try {
            float f = Float.parseFloat(strM);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            r8.r(r8Var, vs1.J(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'float' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}
