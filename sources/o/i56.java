package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i56 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1038o;
    public final /* synthetic */ Object p;

    public /* synthetic */ i56(kd8 kd8Var, jl5 jl5Var, int i) {
        this.m = (byte) 2;
        this.f1038o = kd8Var;
        this.p = jl5Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m01 m01Var;
        f88 f88Var;
        m01 m01Var2;
        f88 f88Var2;
        int i;
        byte b = this.m;
        f88 f88Var3 = f88.a;
        int i2 = 0;
        int i3 = this.n;
        Object obj2 = this.p;
        Object obj3 = this.f1038o;
        switch (b) {
            case 0:
                j56 j56Var = (j56) obj3;
                vw4 vw4Var = (vw4) obj2;
                m01 m01Var3 = (m01) obj;
                if (j56Var.e == i3 && im3.n(vw4Var, j56Var.f) && (m01Var3 instanceof s01)) {
                    long[] jArr = vw4Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = i2;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj4 = vw4Var.b[i8];
                                        boolean z = vw4Var.c[i8] != i3;
                                        if (z) {
                                            i = i5;
                                            s01 s01Var = (s01) m01Var3;
                                            m01Var2 = m01Var3;
                                            jx4 jx4Var = s01Var.s;
                                            xo1.V(jx4Var, obj4, j56Var);
                                            f88Var2 = f88Var3;
                                            if (obj4 instanceof eo1) {
                                                eo1 eo1Var = (eo1) obj4;
                                                if (!jx4Var.c(eo1Var)) {
                                                    xo1.W(s01Var.v, eo1Var);
                                                }
                                                jx4 jx4Var2 = j56Var.g;
                                                if (jx4Var2 != null) {
                                                    jx4Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            m01Var2 = m01Var3;
                                            f88Var2 = f88Var3;
                                            i = i5;
                                        }
                                        if (z) {
                                            vw4Var.f(i8);
                                        }
                                    } else {
                                        m01Var2 = m01Var3;
                                        f88Var2 = f88Var3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    m01Var3 = m01Var2;
                                    f88Var3 = f88Var2;
                                }
                                m01Var = m01Var3;
                                f88Var = f88Var3;
                                if (i6 != i5) {
                                    return f88Var;
                                }
                            } else {
                                m01Var = m01Var3;
                                f88Var = f88Var3;
                            }
                            if (i4 == length) {
                                return f88Var;
                            }
                            i4++;
                            m01Var3 = m01Var;
                            f88Var3 = f88Var;
                            i2 = 0;
                        }
                    }
                }
                return f88Var3;
            case 1:
                bk6 bk6Var = (bk6) obj3;
                jl5 jl5Var = (jl5) obj2;
                il5 il5Var = (il5) obj;
                int iZ = bk6Var.A.a.z();
                if (iZ < 0) {
                    iZ = 0;
                }
                if (iZ <= i3) {
                    i3 = iZ;
                }
                int i9 = -i3;
                boolean z2 = bk6Var.B;
                int i10 = z2 ? 0 : i9;
                int i11 = z2 ? i9 : 0;
                il5Var.m = true;
                il5.l(il5Var, jl5Var, i10, i11, null, 12);
                il5Var.m = false;
                return f88Var3;
            default:
                kd8 kd8Var = (kd8) obj3;
                jl5 jl5Var2 = (jl5) obj2;
                il5 il5Var2 = (il5) obj;
                int i12 = kd8Var.c;
                hr7 hr7Var = kd8Var.b;
                e18 e18Var = kd8Var.d;
                ws7 ws7Var = (ws7) kd8Var.e.a();
                hr7Var.a(gb5.m, x37.i(il5Var2, i12, e18Var, ws7Var != null ? ws7Var.a : null, false, jl5Var2.m), i3, jl5Var2.n);
                il5.k(il5Var2, jl5Var2, 0, Math.round(-hr7Var.a.z()));
                return f88Var3;
        }
    }

    public /* synthetic */ i56(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.f1038o = obj;
        this.n = i;
        this.p = obj2;
    }
}
