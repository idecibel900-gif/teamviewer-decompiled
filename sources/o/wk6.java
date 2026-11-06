package o;

import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class wk6 {
    public final /* synthetic */ yk6 a;

    public wk6(yk6 yk6Var) {
        this.a = yk6Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:136:0x0283  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x0307  */
    /* JADX WARN: Code duplicated, block: B:175:0x0324  */
    /* JADX WARN: Code duplicated, block: B:177:0x0335  */
    /* JADX WARN: Code duplicated, block: B:178:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x0349  */
    /* JADX WARN: Code duplicated, block: B:189:0x0351  */
    /* JADX WARN: Code duplicated, block: B:192:0x0355  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c A[PHI: r8
      0x013c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x016a, B:65:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fH;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        nz2 nz2Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        nz2 nz2Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        nz2 nz2Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        yk6 yk6Var = this.a;
        yk6Var.j = i;
        li liVar = yk6Var.b;
        if (liVar == null || !yk6Var.b()) {
            return yk6Var.d(yk6Var.k, j, i);
        }
        byte b = yk6Var.j;
        y46 y46Var = yk6Var.m;
        v72 v72Var = liVar.c;
        if (y07.c(liVar.g)) {
            return ((t65) y46Var.invoke(new t65(j))).a;
        }
        if (!liVar.f) {
            if (v72.g(v72Var.f)) {
                liVar.g(0L);
            }
            if (v72.g(v72Var.g)) {
                liVar.h(0L);
            }
            if (v72.g(v72Var.d)) {
                liVar.i(0L);
            }
            if (v72.g(v72Var.e)) {
                liVar.f(0L);
            }
            liVar.f = true;
        }
        int i5 = kj.a;
        float f4 = b == 2 ? 4.0f : 1.0f;
        long jF = t65.f(f4, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!v72.g(v72Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (v72.g(v72Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f5 = liVar.f(jF);
                    if (!v72.g(v72Var.e)) {
                        v72Var.b().finish();
                    }
                    fIntBitsToFloat = f5 == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : f5 / f4;
                }
            } else {
                float fI = liVar.i(jF);
                j2 = 4294967295L;
                if (!v72.g(v72Var.d)) {
                    v72Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fI / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!v72.g(v72Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fH = liVar.g(jF);
                if (!v72.g(v72Var.f)) {
                    v72Var.c().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            } else if (v72.g(v72Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fH = liVar.h(jF);
                if (!v72.g(v72Var.g)) {
                    v72Var.d().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!t65.b(jFloatToRawIntBits, 0L)) {
                liVar.d();
            }
            jD = t65.d(j, jFloatToRawIntBits);
            long j3 = ((t65) y46Var.invoke(new t65(jD))).a;
            jD2 = t65.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (v72.g(v72Var.f) || v72.g(v72Var.d) || v72.g(v72Var.g) || v72.g(v72Var.e)))) {
                liVar.a();
            }
            if (b == 1) {
                i3 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    liVar.g(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        liVar.h(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        liVar.i(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            liVar.f(jD2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    liVar.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        liVar.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!t65.b(jD, 0L)) {
                if (v72.f(v72Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = v72Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof nz2) {
                        nz2 nz2Var4 = (nz2) edgeEffectC;
                        float f6 = nz2Var4.b + fIntBitsToFloat6;
                        nz2Var4.b = f6;
                        if (Math.abs(f6) > nz2Var4.a) {
                            nz2Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = v72.f(v72Var.f);
                }
                if (v72.f(v72Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = v72Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof nz2) {
                        nz2Var3 = (nz2) edgeEffectD;
                        f3 = nz2Var3.b + fIntBitsToFloat5;
                        nz2Var3.b = f3;
                        if (Math.abs(f3) > nz2Var3.a) {
                            nz2Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || v72.f(v72Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (v72.f(v72Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    edgeEffectE = v72Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof nz2) {
                        nz2Var2 = (nz2) edgeEffectE;
                        f2 = nz2Var2.b + fIntBitsToFloat4;
                        nz2Var2.b = f2;
                        if (Math.abs(f2) > nz2Var2.a) {
                            nz2Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || v72.f(v72Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (v72.f(v72Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    edgeEffectB = v72Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof nz2) {
                        nz2Var = (nz2) edgeEffectB;
                        f = nz2Var.b + fIntBitsToFloat3;
                        nz2Var.b = f;
                        if (Math.abs(f) > nz2Var.a) {
                            nz2Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || v72.f(v72Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                liVar.d();
            }
            return t65.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!v72.g(v72Var.f)) {
            if (v72.g(v72Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (v72.g(v72Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!t65.b(jFloatToRawIntBits, 0L)) {
            liVar.d();
        }
        jD = t65.d(j, jFloatToRawIntBits);
        long j4 = ((t65) y46Var.invoke(new t65(jD))).a;
        jD2 = t65.d(jD, j4);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            liVar.a();
        } else {
            liVar.a();
        }
        if (b == 1) {
            i3 = (int) (jD2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                liVar.g(jD2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    liVar.h(jD2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    liVar.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        liVar.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jD2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                liVar.i(jD2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    liVar.f(jD2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!t65.b(jD, 0L)) {
            if (v72.f(v72Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (v72.f(v72Var.g)) {
                edgeEffectD = v72Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof nz2) {
                    nz2Var3 = (nz2) edgeEffectD;
                    f3 = nz2Var3.b + fIntBitsToFloat5;
                    nz2Var3.b = f3;
                    if (Math.abs(f3) > nz2Var3.a) {
                        nz2Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (v72.f(v72Var.d)) {
                edgeEffectE = v72Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                if (edgeEffectE instanceof nz2) {
                    nz2Var2 = (nz2) edgeEffectE;
                    f2 = nz2Var2.b + fIntBitsToFloat4;
                    nz2Var2.b = f2;
                    if (Math.abs(f2) > nz2Var2.a) {
                        nz2Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (v72.f(v72Var.e)) {
                edgeEffectB = v72Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                if (edgeEffectB instanceof nz2) {
                    nz2Var = (nz2) edgeEffectB;
                    f = nz2Var.b + fIntBitsToFloat3;
                    nz2Var.b = f;
                    if (Math.abs(f) > nz2Var.a) {
                        nz2Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            liVar.d();
        }
        return t65.e(jFloatToRawIntBits, j4);
    }
}
