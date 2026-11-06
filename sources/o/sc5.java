package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sc5 implements n36 {
    public static final uc6[] b = new uc6[0];
    public final /* synthetic */ byte a;

    public /* synthetic */ sc5(byte b2) {
        this.a = b2;
    }

    public static int b(wc6 wc6Var, wc6 wc6Var2) {
        if (wc6Var == null || wc6Var2 == null) {
            return 0;
        }
        return (int) Math.abs(wc6Var.a - wc6Var2.a);
    }

    public static int c(wc6 wc6Var, wc6 wc6Var2) {
        if (wc6Var == null || wc6Var2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(wc6Var.a - wc6Var2.a);
    }

    private final void d() {
    }

    private final void e() {
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02f7 A[PHI: r32
      0x02f7: PHI (r32v2 java.util.Iterator) = (r32v0 java.util.Iterator), (r32v4 java.util.Iterator) binds: [B:128:0x02fa, B:126:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:189:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:199:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x040c  */
    /* JADX WARN: Code duplicated, block: B:201:0x040f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0412  */
    /* JADX WARN: Code duplicated, block: B:220:0x0451  */
    /* JADX WARN: Code duplicated, block: B:221:0x0454  */
    /* JADX WARN: Code duplicated, block: B:225:0x045c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0464  */
    /* JADX WARN: Code duplicated, block: B:230:0x046c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0484  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086 A[LOOP:0: B:43:0x0084->B:44:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:466:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:481:0x08d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [o.w20] */
    /* JADX WARN: Type inference failed for: r0v37, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r0v57, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v15, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r10v18, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r12v26, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r12v27, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r13v23, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r13v45, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r13v54, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r14v17, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r14v40, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r14v46, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r14v60, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [o.nq1] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v2, types: [o.nq1] */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r8v13, types: [o.gy8] */
    /* JADX WARN: Type inference failed for: r8v14, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r8v21, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r8v28, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r8v73, types: [o.wk0] */
    /* JADX WARN: Type inference failed for: r8v75, types: [o.w20[]] */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r9v11, types: [o.w20] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [o.wk0[]] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    @Override // o.n36
    public final uc6 a(cj3 cj3Var, Map map) throws at2, d55, lq0 {
        char c;
        char c2;
        int i;
        char c3;
        char c4;
        byte[] bArr;
        ae aeVar;
        uc6 uc6Var;
        int i2;
        char c5;
        int i3;
        int i4;
        int i5;
        k70 k70Var;
        la0 la0Var;
        ?? D;
        wc6 wc6Var;
        ?? D2;
        la0 la0Var2;
        Iterator it;
        ?? L;
        w20 w20VarL;
        w20 w20VarL2;
        ?? gy8Var;
        int i6;
        ?? r9;
        int i7;
        w20[] w20VarArr;
        int i8;
        int i9;
        w20[] w20VarArr2;
        int i10;
        int i11;
        int i12;
        w20[] w20VarArr3;
        int i13;
        int i14;
        cj1 cj1VarB;
        int i15;
        int i16;
        ?? r14;
        w20 w20Var;
        int i17;
        ArrayList arrayList;
        int i18;
        ?? r0;
        w20 w20VarQ;
        int i19;
        int i20;
        int i21;
        la0 la0Var3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iMax;
        w20 w20VarC;
        w20 w20Var2;
        k70 k70Var2;
        int i27;
        int i28;
        wc6[] wc6VarArr;
        d55 d55Var;
        wc6[] wc6VarArr2;
        int i29;
        cj1 cj1VarA;
        at2 at2Var;
        wc6[] wc6VarArr3;
        uc6 uc6Var2;
        List list;
        String str;
        xc6 xc6Var;
        int length;
        byte b2 = this.a;
        vc6 vc6Var = vc6.y;
        vc6 vc6Var2 = vc6.p;
        vc6 vc6Var3 = vc6.f2300o;
        int i30 = 0;
        int i31 = 1;
        switch (b2) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                k70 k70VarD = cj3Var.D();
                int[] iArr = iq8.z;
                int i32 = 0;
                while (true) {
                    c = '\b';
                    c2 = 4;
                    if (i32 < 4) {
                        int i33 = iArr[i32];
                        c3 = 3;
                        int i34 = i33 % 360;
                        if (i34 == 0) {
                            k70Var2 = k70VarD;
                            i27 = i30;
                            i = i31;
                            c4 = 5;
                            bArr = null;
                        } else {
                            c4 = 5;
                            bArr = null;
                            int i35 = k70VarD.m;
                            i = i31;
                            int i36 = k70VarD.n;
                            i27 = i30;
                            int i37 = k70VarD.f1233o;
                            int[] iArr2 = (int[]) k70VarD.p.clone();
                            k70Var2 = new k70();
                            k70Var2.m = i35;
                            k70Var2.n = i36;
                            k70Var2.f1233o = i37;
                            k70Var2.p = iArr2;
                            if (i34 != 0) {
                                if (i34 == 90) {
                                    k70Var2.h();
                                } else if (i34 == 180) {
                                    k70Var2.g();
                                } else {
                                    if (i34 != 270) {
                                        hk0.g("degrees must be a multiple of 0, 90, 180, or 270");
                                        return null;
                                    }
                                    k70Var2.h();
                                    k70Var2.g();
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int i38 = k70Var2.n;
                        if (i38 > 0) {
                            int i39 = k70Var2.m;
                            wc6[] wc6VarArr4 = new wc6[8];
                            int i40 = 0;
                            int i41 = 0;
                            int iMax2 = 10;
                            k70 k70Var3 = k70Var2;
                            wc6[] wc6VarArrP = iq8.p(k70Var3, i38, i39, 0, 0, 10, iq8.x);
                            int[] iArr3 = iq8.v;
                            for (int i42 = i27; i42 < 4; i42++) {
                                wc6VarArr4[iArr3[i42]] = wc6VarArrP[i42];
                            }
                            wc6 wc6Var2 = wc6VarArr4[4];
                            if (wc6Var2 != null) {
                                int i43 = (int) wc6Var2.a;
                                int i44 = (int) wc6Var2.b;
                                wc6 wc6Var3 = wc6VarArr4[c4];
                                if (wc6Var3 != null) {
                                    i40 = i44;
                                    i41 = i43;
                                    iMax2 = (int) Math.max((((int) wc6Var3.b) - i44) * 0.5f, 10.0f);
                                } else {
                                    i40 = i44;
                                    i41 = i43;
                                }
                            }
                            wc6[] wc6VarArrP2 = iq8.p(k70Var3, i38, i39, i40, i41, iMax2, iq8.y);
                            k70Var2 = k70Var3;
                            int[] iArr4 = iq8.w;
                            for (int i45 = i27; i45 < 4; i45++) {
                                wc6VarArr4[iArr4[i45]] = wc6VarArrP2[i45];
                            }
                            if (wc6VarArr4[i27] != null || wc6VarArr4[3] != null) {
                                arrayList3.add(wc6VarArr4);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            i32++;
                            i31 = i;
                            i30 = i27;
                        } else {
                            aeVar = new ae(k70Var2, arrayList3, i33, (byte) 10);
                        }
                    } else {
                        i = i31;
                        c3 = 3;
                        c4 = 5;
                        bArr = null;
                        aeVar = new ae(k70VarD, new ArrayList(), i30, (byte) 10);
                    }
                }
                Iterator it2 = ((ArrayList) aeVar.d).iterator();
                while (it2.hasNext()) {
                    wc6[] wc6VarArr5 = (wc6[]) it2.next();
                    k70 k70Var4 = (k70) aeVar.c;
                    wc6 wc6Var4 = wc6VarArr5[c2];
                    wc6 wc6Var5 = wc6VarArr5[c4];
                    wc6 wc6Var6 = wc6VarArr5[6];
                    wc6 wc6Var7 = wc6VarArr5[7];
                    int iMin = Math.min(Math.min(c(wc6VarArr5[0], wc6Var4), (c(wc6VarArr5[6], wc6VarArr5[2]) * 17) / 18), Math.min(c(wc6VarArr5[i], wc6VarArr5[c4]), (c(wc6VarArr5[7], wc6VarArr5[c3]) * 17) / 18));
                    int iMax3 = Math.max(Math.max(b(wc6VarArr5[0], wc6VarArr5[c2]), (b(wc6VarArr5[6], wc6VarArr5[2]) * 17) / 18), Math.max(b(wc6VarArr5[i], wc6VarArr5[c4]), (b(wc6VarArr5[7], wc6VarArr5[c3]) * 17) / 18));
                    xk1 xk1Var = uc5.a;
                    k70 k70Var5 = k70Var4;
                    wc6 wc6Var8 = wc6Var4;
                    wc6 wc6Var9 = wc6Var6;
                    char c6 = c;
                    byte[] bArr2 = bArr;
                    ?? r25 = bArr2;
                    int i46 = i;
                    la0 la0Var4 = new la0(k70Var5, wc6Var8, wc6Var5, wc6Var6, wc6Var7);
                    ?? r15 = bArr2;
                    while (true) {
                        i2 = la0Var4.i;
                        c5 = c2;
                        i3 = la0Var4.h;
                        if (wc6Var8 != null) {
                            i4 = iMin;
                            i5 = iMax3;
                            k70Var = k70Var5;
                            la0Var = la0Var4;
                            D = uc5.d(k70Var, la0Var, wc6Var8, true, i4, i5);
                        } else {
                            i4 = iMin;
                            i5 = iMax3;
                            k70Var = k70Var5;
                            la0Var = la0Var4;
                            D = r15;
                        }
                        wc6 wc6Var10 = wc6Var8;
                        if (wc6Var9 != null) {
                            wc6Var = wc6Var9;
                            D2 = uc5.d(k70Var, la0Var, wc6Var, false, i4, i5);
                        } else {
                            wc6Var = wc6Var9;
                            D2 = r25;
                        }
                        la0Var2 = la0Var;
                        if (D == 0 && D2 == 0) {
                            it = it2;
                        } else {
                            if (D == 0 || (w20VarL = D.L()) == null) {
                                it = it2;
                                if (D2 == 0) {
                                    L = w20VarL;
                                    L = w20VarL;
                                    L = w20VarL;
                                    L = bArr;
                                } else {
                                    L = D2.L();
                                }
                            } else if (D2 == 0 || (w20VarL2 = D2.L()) == null) {
                                it = it2;
                                L = w20VarL;
                            } else {
                                it = it2;
                                if (w20VarL.b != w20VarL2.b && w20VarL.c != w20VarL2.c && w20VarL.f != w20VarL2.f) {
                                    L = w20VarL;
                                    L = w20VarL;
                                    L = w20VarL;
                                    L = bArr;
                                }
                            }
                            if (L != 0) {
                                la0 la0VarA = uc5.a(D);
                                la0 la0VarA2 = uc5.a(D2);
                                if (la0VarA == null) {
                                    la0VarA = la0VarA2;
                                } else if (la0VarA2 != null) {
                                    la0VarA = new la0(la0VarA.a, la0VarA.b, la0VarA.c, la0VarA2.d, la0VarA2.e);
                                }
                                gy8Var = new gy8((w20) L, la0VarA);
                            }
                            if (gy8Var != 0) {
                                throw d55.a();
                            }
                            i6 = gy8Var.b;
                            r9 = (wk0[]) gy8Var.d;
                            la0Var4 = (la0) gy8Var.e;
                            if (i46 == 0 && la0Var4 != null && (la0Var4.h < i3 || la0Var4.i > i2)) {
                                wc6Var9 = wc6Var;
                                iMin = i4;
                                iMax3 = i5;
                                c2 = c5;
                                it2 = it;
                                i46 = 0;
                                wc6Var8 = wc6Var10;
                                k70Var5 = k70Var;
                                r15 = D;
                                r25 = D2;
                            }
                        }
                        wc6Var10 = wc6Var10;
                        gy8Var = bArr;
                        if (gy8Var != 0) {
                            throw d55.a();
                        }
                        i6 = gy8Var.b;
                        r9 = (wk0[]) gy8Var.d;
                        la0Var4 = (la0) gy8Var.e;
                        if (i46 == 0) {
                        }
                    }
                    gy8Var.e = la0Var2;
                    int i47 = i6 + 1;
                    r9[0] = D;
                    r9[i47] = D2;
                    ?? r22 = D != 0 ? i : 0;
                    int i48 = i;
                    while (i48 <= i47) {
                        int i49 = r22 != 0 ? i48 : i47 - i48;
                        if (r9[i49] != 0) {
                            arrayList = arrayList2;
                            i48 = i48;
                        } else {
                            wk0 nq1Var = (i49 == 0 || i49 == i47) ? new nq1(la0Var2, i49 == 0 ? i : 0) : new wk0(la0Var2);
                            r9[i49] = nq1Var;
                            int i50 = i49;
                            int i51 = i3;
                            int i52 = i4;
                            int i53 = i5;
                            int i54 = -1;
                            while (i51 <= i2) {
                                int i55 = r22 != 0 ? i : -1;
                                int i56 = i2;
                                int i57 = i50 - i55;
                                if (i57 >= 0) {
                                    i18 = i3;
                                    if (i57 <= i6 + 1) {
                                        ?? r16 = r9[i57];
                                        w20Var2 = ((w20[]) r16.f2420o)[r16.t(i51)];
                                    }
                                    if (r0 != 0) {
                                        w20VarQ = r9[i50].q(i51);
                                        if (w20VarQ != null) {
                                            if (i57 >= 0 && i57 <= i6 + 1) {
                                                w20VarQ = r9[i57].q(i51);
                                            }
                                            if (w20VarQ != null) {
                                                i19 = i50;
                                                i20 = 0;
                                                while (true) {
                                                    i21 = i19 - i55;
                                                    if (i21 >= 0 || i21 > i6 + 1) {
                                                        la0Var3 = (la0) gy8Var.e;
                                                        if (r22 != 0) {
                                                            i22 = la0Var3.f;
                                                        } else {
                                                            i22 = la0Var3.g;
                                                        }
                                                    } else {
                                                        w20[] w20VarArr4 = (w20[]) r9[i21].f2420o;
                                                        i23 = i20;
                                                        int length2 = w20VarArr4.length;
                                                        int i58 = 0;
                                                        while (true) {
                                                            if (i58 < length2) {
                                                                int i59 = length2;
                                                                w20 w20Var3 = w20VarArr4[i58];
                                                                if (w20Var3 != null) {
                                                                    int i60 = w20Var3.b;
                                                                    int i61 = w20Var3.c;
                                                                    i22 = ((i61 - i60) * i55 * i23) + (r22 != 0 ? i61 : i60);
                                                                } else {
                                                                    i58++;
                                                                    length2 = i59;
                                                                }
                                                            } else {
                                                                i20 = i23 + 1;
                                                                i19 = i21;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (r22 != 0) {
                                                i22 = w20VarQ.c;
                                            } else {
                                                i22 = w20VarQ.b;
                                            }
                                        } else if (r22 != 0) {
                                            i22 = w20VarQ.b;
                                        } else {
                                            i22 = w20VarQ.c;
                                        }
                                    } else if (r22 != 0) {
                                        i22 = r0.c;
                                    } else {
                                        i22 = r0.b;
                                    }
                                    if (i22 >= 0 || i22 > la0Var2.g) {
                                        if (i54 == -1) {
                                            i25 = i51;
                                            i26 = i52;
                                            iMax = i53;
                                        } else {
                                            i24 = i54;
                                        }
                                        i52 = i26;
                                        i53 = iMax;
                                        i51 = i25 + 1;
                                        la0Var2 = la0Var2;
                                        i2 = i56;
                                        i3 = i18;
                                        arrayList2 = arrayList2;
                                    } else {
                                        i24 = i22;
                                    }
                                    int i62 = i51;
                                    w20VarC = uc5.c(k70Var, la0Var2.f, la0Var2.g, r22, i24, i62, i52, i53);
                                    i25 = i62;
                                    i26 = i52;
                                    iMax = i53;
                                    if (w20VarC != null) {
                                        int i63 = w20VarC.b;
                                        int i64 = w20VarC.c;
                                        ((w20[]) nq1Var.f2420o)[nq1Var.t(i25)] = w20VarC;
                                        int iMin2 = Math.min(i26, i64 - i63);
                                        iMax = Math.max(iMax, i64 - i63);
                                        i52 = iMin2;
                                        i54 = i24;
                                    } else {
                                        i52 = i26;
                                    }
                                    i53 = iMax;
                                    i51 = i25 + 1;
                                    la0Var2 = la0Var2;
                                    i2 = i56;
                                    i3 = i18;
                                    arrayList2 = arrayList2;
                                } else {
                                    i18 = i3;
                                }
                                r0 = bArr;
                                if (r0 != 0) {
                                    w20VarQ = r9[i50].q(i51);
                                    if (w20VarQ != null) {
                                        if (i57 >= 0) {
                                            w20VarQ = r9[i57].q(i51);
                                        }
                                        if (w20VarQ != null) {
                                            i19 = i50;
                                            i20 = 0;
                                            while (true) {
                                                i21 = i19 - i55;
                                                if (i21 >= 0) {
                                                }
                                                la0Var3 = (la0) gy8Var.e;
                                                if (r22 != 0) {
                                                    i22 = la0Var3.f;
                                                } else {
                                                    i22 = la0Var3.g;
                                                }
                                                i20 = i23 + 1;
                                                i19 = i21;
                                            }
                                        } else if (r22 != 0) {
                                            i22 = w20VarQ.c;
                                        } else {
                                            i22 = w20VarQ.b;
                                        }
                                    } else if (r22 != 0) {
                                        i22 = w20VarQ.b;
                                    } else {
                                        i22 = w20VarQ.c;
                                    }
                                } else if (r22 != 0) {
                                    i22 = r0.c;
                                } else {
                                    i22 = r0.b;
                                }
                                if (i22 >= 0) {
                                    if (i54 == -1) {
                                        i25 = i51;
                                        i26 = i52;
                                        iMax = i53;
                                    } else {
                                        i24 = i54;
                                        int i65 = i51;
                                        w20VarC = uc5.c(k70Var, la0Var2.f, la0Var2.g, r22, i24, i65, i52, i53);
                                        i25 = i65;
                                        i26 = i52;
                                        iMax = i53;
                                        if (w20VarC != null) {
                                            int i66 = w20VarC.b;
                                            int i67 = w20VarC.c;
                                            ((w20[]) nq1Var.f2420o)[nq1Var.t(i25)] = w20VarC;
                                            int iMin3 = Math.min(i26, i67 - i66);
                                            iMax = Math.max(iMax, i67 - i66);
                                            i52 = iMin3;
                                            i54 = i24;
                                        }
                                        i53 = iMax;
                                        i51 = i25 + 1;
                                        la0Var2 = la0Var2;
                                        i2 = i56;
                                        i3 = i18;
                                        arrayList2 = arrayList2;
                                    }
                                } else if (i54 == -1) {
                                    i25 = i51;
                                    i26 = i52;
                                    iMax = i53;
                                } else {
                                    i24 = i54;
                                    int i68 = i51;
                                    w20VarC = uc5.c(k70Var, la0Var2.f, la0Var2.g, r22, i24, i68, i52, i53);
                                    i25 = i68;
                                    i26 = i52;
                                    iMax = i53;
                                    if (w20VarC != null) {
                                        int i69 = w20VarC.b;
                                        int i610 = w20VarC.c;
                                        ((w20[]) nq1Var.f2420o)[nq1Var.t(i25)] = w20VarC;
                                        int iMin4 = Math.min(i26, i610 - i69);
                                        iMax = Math.max(iMax, i610 - i69);
                                        i52 = iMin4;
                                        i54 = i24;
                                    }
                                    i53 = iMax;
                                    i51 = i25 + 1;
                                    la0Var2 = la0Var2;
                                    i2 = i56;
                                    i3 = i18;
                                    arrayList2 = arrayList2;
                                }
                                i52 = i26;
                                i53 = iMax;
                                i51 = i25 + 1;
                                la0Var2 = la0Var2;
                                i2 = i56;
                                i3 = i18;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i5 = i53;
                            i4 = i52;
                        }
                        i48++;
                        la0Var2 = la0Var2;
                        i2 = i2;
                        i3 = i3;
                        arrayList2 = arrayList;
                    }
                    ArrayList arrayList4 = arrayList2;
                    w20 w20Var4 = (w20) gy8Var.c;
                    int i70 = w20Var4.f;
                    int[] iArr5 = new int[2];
                    iArr5[i] = i6 + 2;
                    iArr5[0] = i70;
                    y20[][] y20VarArr = (y20[][]) Array.newInstance((Class<?>) y20.class, iArr5);
                    for (y20[] y20VarArr2 : y20VarArr) {
                        int i71 = 0;
                        while (true) {
                            if (i71 < y20VarArr2.length) {
                                y20VarArr2[i71] = new y20();
                                i71++;
                            }
                        }
                    }
                    char c7 = 0;
                    gy8Var.b(r9[0]);
                    gy8Var.b(r9[i47]);
                    int i72 = 928;
                    while (true) {
                        ?? r13 = r9[c7];
                        if (r13 != 0 && (r14 = r9[i47]) != 0) {
                            w20[] w20VarArr5 = (w20[]) r13.f2420o;
                            w20[] w20VarArr6 = (w20[]) r14.f2420o;
                            int i73 = 0;
                            while (i73 < w20VarArr5.length) {
                                w20 w20Var5 = w20VarArr5[i73];
                                w20[] w20VarArr7 = w20VarArr5;
                                if (w20Var5 != null && (w20Var = w20VarArr6[i73]) != null && w20Var5.f == w20Var.f) {
                                    int i74 = i;
                                    while (i74 <= i6) {
                                        w20 w20Var6 = ((w20[]) r9[i74].f2420o)[i73];
                                        if (w20Var6 == null) {
                                            i17 = i74;
                                        } else {
                                            i17 = i74;
                                            int i75 = w20VarArr7[i73].f;
                                            w20Var6.f = i75;
                                            if (!w20Var6.b(i75)) {
                                                ((w20[]) r9[i17].f2420o)[i73] = bArr;
                                            }
                                        }
                                        i74 = i17 + 1;
                                    }
                                }
                                i73++;
                                w20VarArr5 = w20VarArr7;
                            }
                        }
                        ?? r8 = r9[0];
                        if (r8 == 0) {
                            i7 = 0;
                        } else {
                            w20[] w20VarArr8 = (w20[]) r8.f2420o;
                            int i76 = 0;
                            i7 = 0;
                            while (i76 < w20VarArr8.length) {
                                w20 w20Var7 = w20VarArr8[i76];
                                if (w20Var7 != null) {
                                    int i77 = w20Var7.f;
                                    w20VarArr = w20VarArr8;
                                    i8 = i76;
                                    int i78 = i;
                                    int i79 = 0;
                                    while (i78 < i47) {
                                        int i80 = i78;
                                        if (i79 >= 2) {
                                        }
                                        w20 w20Var8 = ((w20[]) r9[i80].f2420o)[i8];
                                        int i81 = i79;
                                        if (w20Var8 != null) {
                                            if (!w20Var8.b(w20Var8.f)) {
                                                if (w20Var8.b(i77)) {
                                                    w20Var8.f = i77;
                                                    i81 = 0;
                                                } else {
                                                    i81++;
                                                }
                                            }
                                            if (!w20Var8.b(w20Var8.f)) {
                                                i7++;
                                            }
                                            i79 = i81;
                                        }
                                        i78 = i80 + 1;
                                    }
                                } else {
                                    w20VarArr = w20VarArr8;
                                    i8 = i76;
                                }
                                i76 = i8 + 1;
                                w20VarArr8 = w20VarArr;
                            }
                        }
                        ?? r10 = r9[i47];
                        if (r10 == 0) {
                            i9 = 0;
                        } else {
                            w20[] w20VarArr9 = (w20[]) r10.f2420o;
                            int i82 = 0;
                            i9 = 0;
                            while (i82 < w20VarArr9.length) {
                                w20 w20Var9 = w20VarArr9[i82];
                                if (w20Var9 == null) {
                                    w20VarArr2 = w20VarArr9;
                                    i10 = i82;
                                } else {
                                    int i83 = w20Var9.f;
                                    w20VarArr2 = w20VarArr9;
                                    int i84 = i47;
                                    int i85 = 0;
                                    while (true) {
                                        i10 = i82;
                                        if (i84 <= 0 || i85 >= 2) {
                                        }
                                        w20 w20Var10 = ((w20[]) r9[i84].f2420o)[i10];
                                        int i86 = i85;
                                        if (w20Var10 != null) {
                                            if (!w20Var10.b(w20Var10.f)) {
                                                if (w20Var10.b(i83)) {
                                                    w20Var10.f = i83;
                                                    i86 = 0;
                                                } else {
                                                    i86++;
                                                }
                                            }
                                            if (!w20Var10.b(w20Var10.f)) {
                                                i9++;
                                            }
                                            i85 = i86;
                                        }
                                        i84--;
                                        i82 = i10;
                                    }
                                }
                                i82 = i10 + 1;
                                w20VarArr9 = w20VarArr2;
                            }
                        }
                        int i87 = i7 + i9;
                        if (i87 == 0) {
                            i87 = 0;
                        } else {
                            int i88 = i;
                            while (i88 < i47) {
                                w20[] w20VarArr10 = (w20[]) r9[i88].f2420o;
                                int i89 = i87;
                                int i90 = 0;
                                while (i90 < w20VarArr10.length) {
                                    w20 w20Var11 = w20VarArr10[i90];
                                    if (w20Var11 == null) {
                                        i11 = i47;
                                    } else {
                                        i11 = i47;
                                        if (!w20Var11.b(w20Var11.f)) {
                                            w20 w20Var12 = w20VarArr10[i90];
                                            w20[] w20VarArr11 = (w20[]) r9[i88 - 1].f2420o;
                                            ?? r11 = r9[i88 + 1];
                                            w20[] w20VarArr12 = r11 != 0 ? (w20[]) r11.f2420o : w20VarArr11;
                                            i12 = i88;
                                            w20[] w20VarArr13 = new w20[14];
                                            w20VarArr13[2] = w20VarArr11[i90];
                                            w20VarArr13[c3] = w20VarArr12[i90];
                                            if (i90 > 0) {
                                                int i91 = i90 - 1;
                                                w20VarArr13[0] = w20VarArr10[i91];
                                                w20VarArr13[c5] = w20VarArr11[i91];
                                                w20VarArr13[c4] = w20VarArr12[i91];
                                            }
                                            if (i90 > i) {
                                                int i92 = i90 - 2;
                                                w20VarArr13[c6] = w20VarArr10[i92];
                                                w20VarArr13[10] = w20VarArr11[i92];
                                                w20VarArr13[11] = w20VarArr12[i92];
                                            }
                                            if (i90 < w20VarArr10.length - 1) {
                                                int i93 = i90 + 1;
                                                w20VarArr13[1] = w20VarArr10[i93];
                                                w20VarArr13[6] = w20VarArr11[i93];
                                                w20VarArr13[7] = w20VarArr12[i93];
                                            }
                                            if (i90 < w20VarArr10.length - 2) {
                                                int i94 = i90 + 2;
                                                w20VarArr13[9] = w20VarArr10[i94];
                                                w20VarArr13[12] = w20VarArr11[i94];
                                                w20VarArr13[13] = w20VarArr12[i94];
                                            }
                                            int i95 = 0;
                                            while (true) {
                                                if (i95 >= 14) {
                                                    w20VarArr3 = w20VarArr10;
                                                }
                                                w20 w20Var13 = w20VarArr13[i95];
                                                if (w20Var13 == null) {
                                                    i13 = i95;
                                                } else {
                                                    i13 = i95;
                                                    if (w20Var13.b(w20Var13.f)) {
                                                        w20VarArr3 = w20VarArr10;
                                                        if (w20Var13.d == w20Var12.d) {
                                                            w20Var12.f = w20Var13.f;
                                                        }
                                                    }
                                                    i95 = i13 + 1;
                                                    w20VarArr10 = w20VarArr3;
                                                }
                                                w20VarArr3 = w20VarArr10;
                                                i95 = i13 + 1;
                                                w20VarArr10 = w20VarArr3;
                                            }
                                        }
                                        i90++;
                                        w20VarArr10 = w20VarArr3;
                                        i47 = i11;
                                        i88 = i12;
                                        i = 1;
                                    }
                                    i12 = i88;
                                    w20VarArr3 = w20VarArr10;
                                    i90++;
                                    w20VarArr10 = w20VarArr3;
                                    i47 = i11;
                                    i88 = i12;
                                    i = 1;
                                    break;
                                }
                                i88++;
                                i87 = i89;
                                i = 1;
                            }
                        }
                        int i96 = i47;
                        if (i87 > 0 && i87 < i72) {
                            i72 = i87;
                            i47 = i96;
                            i = 1;
                            c7 = 0;
                        }
                        break;
                    }
                    int length3 = r9.length;
                    int i97 = 0;
                    int i98 = 0;
                    ?? r12 = r9;
                    while (i97 < length3) {
                        ?? r17 = r12[i97];
                        if (r17 != 0) {
                            w20[] w20VarArr14 = (w20[]) r17.f2420o;
                            int length4 = w20VarArr14.length;
                            int i99 = 0;
                            while (i99 < length4) {
                                int i100 = length3;
                                w20 w20Var14 = w20VarArr14[i99];
                                ?? r41 = r12;
                                if (w20Var14 != null) {
                                    int i101 = w20Var14.f;
                                    i16 = i97;
                                    if (i101 < 0 || i101 >= y20VarArr.length) {
                                        r12 = r12;
                                    } else {
                                        r12 = r12;
                                        y20VarArr[i101][i98].b(w20Var14.e);
                                    }
                                } else {
                                    r12 = r12;
                                    i16 = i97;
                                }
                                i99++;
                                r12 = r41;
                                length3 = i100;
                                i97 = i16;
                            }
                            r12 = r12;
                        }
                        i98++;
                        i97++;
                        r12 = r12;
                        length3 = length3;
                    }
                    y20 y20Var = y20VarArr[0][1];
                    int[] iArrA = y20Var.a();
                    int i102 = w20Var4.c;
                    int i103 = i6 * i70;
                    int i104 = i103 - (2 << i102);
                    if (iArrA.length == 0) {
                        if (i104 < 1 || i104 > 928) {
                            throw d55.a();
                        }
                        y20Var.b(i104);
                    } else if (iArrA[0] != i104 && i104 >= 1 && i104 <= 928) {
                        y20Var.b(i104);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int[] iArr6 = new int[i103];
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i105 = 0; i105 < i70; i105++) {
                        int i106 = 0;
                        while (i106 < i6) {
                            int i107 = i106 + 1;
                            int[] iArrA2 = y20VarArr[i105][i107].a();
                            int i108 = (i105 * i6) + i106;
                            if (iArrA2.length == 0) {
                                arrayList5.add(Integer.valueOf(i108));
                                i15 = i6;
                            } else {
                                i15 = i6;
                                if (iArrA2.length == 1) {
                                    iArr6[i108] = iArrA2[0];
                                } else {
                                    arrayList7.add(Integer.valueOf(i108));
                                    arrayList6.add(iArrA2);
                                }
                            }
                            i106 = i107;
                            i6 = i15;
                        }
                    }
                    int size = arrayList6.size();
                    int[][] iArr7 = new int[size][];
                    for (int i109 = 0; i109 < size; i109++) {
                        iArr7[i109] = (int[]) arrayList6.get(i109);
                    }
                    int[] iArrH = kh.H(arrayList5);
                    int[] iArrH2 = kh.H(arrayList7);
                    int length5 = iArrH2.length;
                    int[] iArr8 = new int[length5];
                    int i110 = 100;
                    while (true) {
                        int i111 = i110 - 1;
                        if (i110 <= 0) {
                            throw lq0.a();
                        }
                        for (int i112 = 0; i112 < length5; i112++) {
                            iArr6[iArrH2[i112]] = iArr7[i112][iArr8[i112]];
                        }
                        try {
                            cj1VarB = uc5.b(iArr6, i102, iArrH);
                        } catch (lq0 unused) {
                            ArrayList arrayList8 = arrayList4;
                            if (length5 == 0) {
                                throw lq0.a();
                            }
                            int i113 = 0;
                            while (true) {
                                if (i113 >= length5) {
                                    i14 = i102;
                                }
                                int i114 = iArr8[i113];
                                i14 = i102;
                                if (i114 < iArr7[i113].length - 1) {
                                    iArr8[i113] = i114 + 1;
                                }
                                iArr8[i113] = 0;
                                if (i113 == length5 - 1) {
                                    throw lq0.a();
                                }
                                i113++;
                                i102 = i14;
                                break;
                                break;
                            }
                            i110 = i111;
                            arrayList4 = arrayList8;
                            i102 = i14;
                            bArr = null;
                        }
                        break;
                    }
                    byte[] bArr3 = bArr;
                    uc6 uc6Var3 = new uc6(cj1VarB.b, bArr3, wc6VarArr5, v20.w);
                    uc6Var3.b(vc6Var3, cj1VarB.d);
                    uc6Var3.b(vc6Var2, cj1VarB.e);
                    uc6Var3.b(vc6.q, cj1VarB.f);
                    tc5 tc5Var = (tc5) cj1VarB.g;
                    if (tc5Var != null) {
                        uc6Var3.b(vc6.v, tc5Var);
                    }
                    uc6Var3.b(vc6.m, Integer.valueOf(aeVar.b));
                    uc6Var3.b(vc6Var, "]L0");
                    ArrayList arrayList9 = arrayList4;
                    arrayList9.add(uc6Var3);
                    bArr = bArr3;
                    arrayList2 = arrayList9;
                    c = c6;
                    c2 = c5;
                    it2 = it;
                    i = 1;
                }
                uc6[] uc6VarArr = (uc6[]) arrayList2.toArray(b);
                if (uc6VarArr.length == 0 || (uc6Var = uc6VarArr[0]) == null) {
                    throw d55.a();
                }
                return uc6Var;
            default:
                oq1 oq1Var = new oq1(cj3Var.D());
                try {
                    f10 f10VarA = oq1Var.a(false);
                    wc6VarArr = (wc6[]) f10VarA.f;
                    try {
                        i28 = f10VarA.d;
                        try {
                            cj1VarA = new xi1().a(f10VarA);
                            wc6VarArr2 = wc6VarArr;
                            i29 = i28;
                            d55Var = null;
                        } catch (at2 e) {
                            e = e;
                            i29 = i28;
                            cj1VarA = null;
                            at2Var = e;
                            wc6VarArr2 = wc6VarArr;
                            d55Var = null;
                            if (cj1VarA == null) {
                                try {
                                    f10 f10VarA2 = oq1Var.a(true);
                                    wc6[] wc6VarArr6 = (wc6[]) f10VarA2.f;
                                    i29 = f10VarA2.d;
                                    cj1VarA = new xi1().a(f10VarA2);
                                    wc6VarArr3 = wc6VarArr6;
                                } catch (at2 | d55 e2) {
                                    if (d55Var != null) {
                                        throw d55Var;
                                    }
                                    if (at2Var != null) {
                                        throw at2Var;
                                    }
                                    throw e2;
                                }
                            } else {
                                wc6VarArr3 = wc6VarArr2;
                            }
                            int i115 = i29;
                            if (map != null) {
                                length = wc6VarArr3.length;
                                while (i30 < length) {
                                    xc6Var.a(wc6VarArr3[i30]);
                                    i30++;
                                }
                            }
                            String str2 = cj1VarA.b;
                            byte[] bArr4 = cj1VarA.a;
                            System.currentTimeMillis();
                            uc6Var2 = new uc6(str2, bArr4, wc6VarArr3, v20.m, 0);
                            list = cj1VarA.c;
                            if (list != null) {
                                uc6Var2.b(vc6.n, list);
                            }
                            str = cj1VarA.d;
                            if (str != null) {
                                uc6Var2.b(vc6Var3, str);
                            }
                            uc6Var2.b(vc6Var2, Integer.valueOf(cj1VarA.e.intValue() + i115));
                            uc6Var2.b(vc6Var, "]z" + cj1VarA.j);
                            return uc6Var2;
                        } catch (d55 e3) {
                            e = e3;
                            wc6[] wc6VarArr7 = wc6VarArr;
                            d55Var = e;
                            wc6VarArr2 = wc6VarArr7;
                            i29 = i28;
                            cj1VarA = null;
                        }
                    } catch (at2 e4) {
                        e = e4;
                        i28 = 0;
                    } catch (d55 e5) {
                        e = e5;
                        i28 = 0;
                    }
                } catch (at2 e6) {
                    e = e6;
                    i28 = 0;
                    wc6VarArr = null;
                } catch (d55 e7) {
                    e = e7;
                    i28 = 0;
                    wc6VarArr = null;
                }
                at2Var = null;
                if (cj1VarA == null) {
                    f10 f10VarA3 = oq1Var.a(true);
                    wc6[] wc6VarArr8 = (wc6[]) f10VarA3.f;
                    i29 = f10VarA3.d;
                    cj1VarA = new xi1().a(f10VarA3);
                    wc6VarArr3 = wc6VarArr8;
                } else {
                    wc6VarArr3 = wc6VarArr2;
                }
                int i116 = i29;
                if (map != null && (xc6Var = (xc6) map.get(pi1.NEED_RESULT_POINT_CALLBACK)) != null) {
                    length = wc6VarArr3.length;
                    while (i30 < length) {
                        xc6Var.a(wc6VarArr3[i30]);
                        i30++;
                    }
                }
                String str3 = cj1VarA.b;
                byte[] bArr5 = cj1VarA.a;
                System.currentTimeMillis();
                uc6Var2 = new uc6(str3, bArr5, wc6VarArr3, v20.m, 0);
                list = cj1VarA.c;
                if (list != null) {
                    uc6Var2.b(vc6.n, list);
                }
                str = cj1VarA.d;
                if (str != null) {
                    uc6Var2.b(vc6Var3, str);
                }
                uc6Var2.b(vc6Var2, Integer.valueOf(cj1VarA.e.intValue() + i116));
                uc6Var2.b(vc6Var, "]z" + cj1VarA.j);
                return uc6Var2;
        }
    }

    @Override // o.n36
    public final void reset() {
        byte b2 = this.a;
    }
}
