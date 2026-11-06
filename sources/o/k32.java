package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class k32 implements rb8 {
    public static final k32 m = new k32();
    public static final jr3 n = jr3.b("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // o.rb8
    public final Object g(kr3 kr3Var, float f) {
        kr3Var.u0();
        String strR = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zJ = true;
        int i = 3;
        String strR2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (kr3Var.hasNext()) {
            switch (kr3Var.z(n)) {
                case 0:
                    strR = kr3Var.r();
                    break;
                case 1:
                    strR2 = kr3Var.r();
                    break;
                case 2:
                    fNextDouble = (float) kr3Var.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = kr3Var.nextInt();
                    i = (iNextInt2 <= 2 && iNextInt2 >= 0) ? ua5.E(3)[iNextInt2] : 3;
                    break;
                case 4:
                    iNextInt = kr3Var.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) kr3Var.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) kr3Var.nextDouble();
                    break;
                case 7:
                    iA = qr3.a(kr3Var);
                    break;
                case 8:
                    iA2 = qr3.a(kr3Var);
                    break;
                case ep1.b /* 9 */:
                    fNextDouble4 = (float) kr3Var.nextDouble();
                    break;
                case ep1.c /* 10 */:
                    zJ = kr3Var.j();
                    break;
                case 11:
                    kr3Var.D0();
                    pointF = new PointF(((float) kr3Var.nextDouble()) * f, ((float) kr3Var.nextDouble()) * f);
                    kr3Var.A0();
                    break;
                case ep1.d /* 12 */:
                    kr3Var.D0();
                    pointF = pointF;
                    pointF2 = new PointF(((float) kr3Var.nextDouble()) * f, ((float) kr3Var.nextDouble()) * f);
                    kr3Var.A0();
                    break;
                default:
                    kr3Var.F();
                    kr3Var.v();
                    break;
            }
        }
        kr3Var.Z();
        j32 j32Var = new j32();
        j32Var.a = strR;
        j32Var.b = strR2;
        j32Var.c = fNextDouble;
        j32Var.d = i;
        j32Var.e = iNextInt;
        j32Var.f = fNextDouble2;
        j32Var.g = fNextDouble3;
        j32Var.h = iA;
        j32Var.i = iA2;
        j32Var.j = fNextDouble4;
        j32Var.k = zJ;
        j32Var.l = pointF;
        j32Var.m = pointF2;
        return j32Var;
    }
}
