package o;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l03 {
    public boolean A;
    public RectF B;
    public final n03 a;
    public Outline f;
    public float j;
    public vs1 k;
    public rj l;
    public rj m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public nl0 f1316o;
    public gy8 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public in1 b = xk0.n;
    public j04 c = j04.m;
    public Function1 d = zm.B;
    public final io.sentry.okhttp.b e = new io.sentry.okhttp.b(this, 7);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ll2 r = new ll2();

    static {
        im3.n(Build.FINGERPRINT, "robolectric");
    }

    public l03(n03 n03Var) {
        this.a = n03Var;
        n03Var.C(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            n03 n03Var = this.a;
            if (z || n03Var.K() > 0.0f) {
                rj rjVar = this.l;
                if (rjVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = rjVar instanceof rj;
                    if (!z2) {
                        yq4.r("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = rjVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                yq4.r("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                yq4.r("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = rjVar;
                    if (outline != null) {
                        outline.setAlpha(n03Var.a());
                        outline2 = outline;
                    }
                    n03Var.g(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        n03Var.C(false);
                        n03Var.i();
                    } else {
                        n03Var.C(this.A);
                    }
                } else {
                    n03Var.C(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jA0 = xs1.a0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jA0 = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jA0 >> 32);
                    int i5 = (int) (jA0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(n03Var.a());
                    n03Var.g(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                n03Var.C(false);
                n03Var.g(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            ll2 ll2Var = this.r;
            l03 l03Var = (l03) ll2Var.n;
            if (l03Var != null) {
                l03Var.q--;
                l03Var.b();
                ll2Var.n = null;
            }
            kx4 kx4Var = (kx4) ll2Var.p;
            if (kx4Var != null) {
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    l03 l03Var2 = (l03) objArr[(i << 3) + i3];
                                    l03Var2.q--;
                                    l03Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                kx4Var.b();
            }
            this.a.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(u52 u52Var) {
        ll2 ll2Var = this.r;
        ll2Var.f1375o = (l03) ll2Var.n;
        kx4 kx4Var = (kx4) ll2Var.p;
        if (kx4Var != null && kx4Var.h()) {
            kx4 kx4Var2 = (kx4) ll2Var.q;
            if (kx4Var2 == null) {
                kx4 kx4Var3 = ui6.a;
                kx4Var2 = new kx4();
                ll2Var.q = kx4Var2;
            }
            kx4Var2.k(kx4Var);
            kx4Var.b();
        }
        ll2Var.m = true;
        this.d.invoke(u52Var);
        ll2Var.m = false;
        l03 l03Var = (l03) ll2Var.f1375o;
        if (l03Var != null) {
            l03Var.q--;
            l03Var.b();
        }
        kx4 kx4Var4 = (kx4) ll2Var.q;
        if (kx4Var4 == null || !kx4Var4.h()) {
            return;
        }
        Object[] objArr = kx4Var4.b;
        long[] jArr = kx4Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            l03 l03Var2 = (l03) objArr[(i << 3) + i3];
                            l03Var2.q--;
                            l03Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        kx4Var4.b();
    }

    public final vs1 d() {
        vs1 ob5Var;
        vs1 vs1Var = this.k;
        rj rjVar = this.l;
        if (vs1Var != null) {
            return vs1Var;
        }
        if (rjVar != null) {
            nb5 nb5Var = new nb5(rjVar);
            this.k = nb5Var;
            return nb5Var;
        }
        long jA0 = xs1.a0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jA0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jA0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jA0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
            ob5Var = new pb5(new lf6(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2));
        } else {
            ob5Var = new ob5(new v56(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = ob5Var;
        return ob5Var;
    }

    public final void e(in1 in1Var, j04 j04Var, long j, Function1 function1) {
        boolean zB = dl3.b(this.u, j);
        n03 n03Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            n03Var.m((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = in1Var;
        this.c = j04Var;
        this.d = function1;
        n03Var.B(in1Var, j04Var, this, this.e);
    }

    public final void f(float f) {
        n03 n03Var = this.a;
        if (n03Var.a() == f) {
            return;
        }
        n03Var.s(f);
    }

    public final void g(long j, long j2, float f) {
        float f2 = this.v;
        long jE = t65.e(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (t65.b(this.h, jE) && y07.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
