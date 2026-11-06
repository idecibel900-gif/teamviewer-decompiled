package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class fy3 {
    public static n77 b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final jr3 c = jr3.b("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final jr3 d = jr3.b("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = lr4.b(pointF.x, -1.0f, 1.0f);
        pointF.y = lr4.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = lr4.b(pointF2.x, -1.0f, 1.0f);
        float fB = lr4.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = ta8.a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (fy3.class) {
            n77 n77Var = b;
            if (n77Var == null) {
                n77Var = new n77(0);
                b = n77Var;
            }
            weakReference = (WeakReference) ck3.u(n77Var, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (fy3.class) {
                b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static dy3 b(kr3 kr3Var, qh4 qh4Var, float f, rb8 rb8Var, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Object obj2;
        dy3 dy3Var;
        jr3 jr3Var;
        jr3 jr3Var2;
        PointF pointF;
        jr3 jr3Var3 = c;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            jr3 jr3Var4 = jr3Var3;
            if (!z) {
                return new dy3(rb8Var.g(kr3Var, f));
            }
            kr3Var.u0();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z3 = false;
            Object objG = null;
            float fNextDouble = 0.0f;
            Object objG2 = null;
            while (kr3Var.hasNext()) {
                jr3Var4 = jr3Var4;
                switch (kr3Var.z(jr3Var4)) {
                    case 0:
                        fNextDouble = (float) kr3Var.nextDouble();
                        continue;
                    case 1:
                        objG = rb8Var.g(kr3Var, f);
                        break;
                    case 2:
                        objG2 = rb8Var.g(kr3Var, f);
                        break;
                    case 3:
                        pointFB4 = qr3.b(kr3Var, 1.0f);
                        break;
                    case 4:
                        pointFB = qr3.b(kr3Var, 1.0f);
                        break;
                    case 5:
                        z3 = kr3Var.nextInt() == 1;
                        break;
                    case 6:
                        pointFB2 = qr3.b(kr3Var, f);
                        break;
                    case 7:
                        pointFB3 = qr3.b(kr3Var, f);
                        break;
                    default:
                        kr3Var.v();
                        break;
                }
            }
            kr3Var.Z();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objG2;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    obj = objG2;
                }
                dy3 dy3Var2 = new dy3(qh4Var, objG, obj, interpolatorA, fNextDouble, (Float) null);
                dy3Var2.f665o = pointFB2;
                dy3Var2.p = pointFB3;
                return dy3Var2;
            }
            obj = objG;
            interpolatorA = linearInterpolator;
            dy3 dy3Var3 = new dy3(qh4Var, objG, obj, interpolatorA, fNextDouble, (Float) null);
            dy3Var3.f665o = pointFB2;
            dy3Var3.p = pointFB3;
            return dy3Var3;
        }
        kr3Var.u0();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objG3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fNextDouble2 = 0.0f;
        Object objG4 = null;
        while (kr3Var.hasNext()) {
            int iZ = kr3Var.z(jr3Var3);
            jr3 jr3Var5 = d;
            linearInterpolator = linearInterpolator;
            switch (iZ) {
                case 0:
                    jr3Var = jr3Var3;
                    fNextDouble2 = (float) kr3Var.nextDouble();
                    jr3Var3 = jr3Var;
                    break;
                case 1:
                    jr3Var = jr3Var3;
                    objG3 = rb8Var.g(kr3Var, f);
                    jr3Var3 = jr3Var;
                    break;
                case 2:
                    jr3Var = jr3Var3;
                    objG4 = rb8Var.g(kr3Var, f);
                    jr3Var3 = jr3Var;
                    break;
                case 3:
                    jr3Var = jr3Var3;
                    boolean z5 = z4;
                    Object obj3 = objG3;
                    PointF pointF6 = pointF4;
                    if (kr3Var.q() == 3) {
                        kr3Var.u0();
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (kr3Var.hasNext()) {
                            int iZ2 = kr3Var.z(jr3Var5);
                            if (iZ2 != 0) {
                                if (iZ2 != 1) {
                                    kr3Var.v();
                                } else if (kr3Var.q() == 7) {
                                    fNextDouble6 = (float) kr3Var.nextDouble();
                                    fNextDouble4 = fNextDouble6;
                                } else {
                                    kr3Var.D0();
                                    fNextDouble4 = (float) kr3Var.nextDouble();
                                    fNextDouble6 = kr3Var.q() == 7 ? (float) kr3Var.nextDouble() : fNextDouble4;
                                    kr3Var.A0();
                                }
                            } else if (kr3Var.q() == 7) {
                                fNextDouble5 = (float) kr3Var.nextDouble();
                                fNextDouble3 = fNextDouble5;
                            } else {
                                kr3Var.D0();
                                fNextDouble3 = (float) kr3Var.nextDouble();
                                fNextDouble5 = kr3Var.q() == 7 ? (float) kr3Var.nextDouble() : fNextDouble3;
                                kr3Var.A0();
                            }
                        }
                        PointF pointF7 = new PointF(fNextDouble3, fNextDouble4);
                        pointF4 = new PointF(fNextDouble5, fNextDouble6);
                        kr3Var.Z();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = qr3.b(kr3Var, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objG3 = obj3;
                    jr3Var3 = jr3Var;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (kr3Var.q() == 3) {
                        kr3Var.u0();
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        float fNextDouble10 = 0.0f;
                        while (kr3Var.hasNext()) {
                            Object obj4 = objG3;
                            int iZ3 = kr3Var.z(jr3Var5);
                            if (iZ3 != 0) {
                                jr3Var2 = jr3Var3;
                                if (iZ3 != 1) {
                                    kr3Var.v();
                                } else if (kr3Var.q() == 7) {
                                    fNextDouble10 = (float) kr3Var.nextDouble();
                                    pointF4 = pointF4;
                                    fNextDouble8 = fNextDouble10;
                                } else {
                                    pointF = pointF4;
                                    kr3Var.D0();
                                    fNextDouble8 = (float) kr3Var.nextDouble();
                                    fNextDouble10 = kr3Var.q() == 7 ? (float) kr3Var.nextDouble() : fNextDouble8;
                                    kr3Var.A0();
                                    pointF4 = pointF;
                                }
                            } else {
                                jr3Var2 = jr3Var3;
                                pointF = pointF4;
                                if (kr3Var.q() == 7) {
                                    fNextDouble9 = (float) kr3Var.nextDouble();
                                    pointF4 = pointF;
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    kr3Var.D0();
                                    fNextDouble7 = (float) kr3Var.nextDouble();
                                    fNextDouble9 = kr3Var.q() == 7 ? (float) kr3Var.nextDouble() : fNextDouble7;
                                    kr3Var.A0();
                                    pointF4 = pointF;
                                }
                            }
                            objG3 = obj4;
                            jr3Var3 = jr3Var2;
                        }
                        jr3Var = jr3Var3;
                        PointF pointF8 = new PointF(fNextDouble7, fNextDouble8);
                        pointF2 = new PointF(fNextDouble9, fNextDouble10);
                        kr3Var.Z();
                        pointF5 = pointF8;
                    } else {
                        jr3Var = jr3Var3;
                        pointFB8 = qr3.b(kr3Var, f);
                    }
                    z4 = z6;
                    jr3Var3 = jr3Var;
                    break;
                case 5:
                    z4 = kr3Var.nextInt() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = qr3.b(kr3Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = qr3.b(kr3Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    kr3Var.v();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objG3;
        PointF pointF9 = pointF4;
        kr3Var.Z();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    interpolatorA2 = a(pointF3, pointF5);
                    interpolatorA3 = a(pointF9, pointF2);
                    obj2 = objG4;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    dy3Var = new dy3(qh4Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
                } else {
                    dy3Var = new dy3(qh4Var, obj5, obj2, interpolatorA2, interpolatorA3, fNextDouble2);
                }
                dy3Var.f665o = pointFB5;
                dy3Var.p = pointFB6;
                return dy3Var;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objG4;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            dy3Var = new dy3(qh4Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
        } else {
            dy3Var = new dy3(qh4Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
        }
        dy3Var.f665o = pointFB5;
        dy3Var.p = pointFB6;
        return dy3Var;
    }
}
