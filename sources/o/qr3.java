package o;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr3 {
    public static final jr3 a = jr3.b("x", "y");

    public static int a(kr3 kr3Var) {
        kr3Var.D0();
        int iNextDouble = (int) (kr3Var.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (kr3Var.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (kr3Var.nextDouble() * 255.0d);
        while (kr3Var.hasNext()) {
            kr3Var.v();
        }
        kr3Var.A0();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(kr3 kr3Var, float f) {
        int iB = ua5.B(kr3Var.q());
        if (iB == 0) {
            kr3Var.D0();
            float fNextDouble = (float) kr3Var.nextDouble();
            float fNextDouble2 = (float) kr3Var.nextDouble();
            while (kr3Var.q() != 2) {
                kr3Var.v();
            }
            kr3Var.A0();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iB != 2) {
            if (iB != 6) {
                hk0.g("Unknown point starts with ".concat(e41.w(kr3Var.q())));
                return null;
            }
            float fNextDouble3 = (float) kr3Var.nextDouble();
            float fNextDouble4 = (float) kr3Var.nextDouble();
            while (kr3Var.hasNext()) {
                kr3Var.v();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        kr3Var.u0();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (kr3Var.hasNext()) {
            int iZ = kr3Var.z(a);
            if (iZ == 0) {
                fD = d(kr3Var);
            } else if (iZ != 1) {
                kr3Var.F();
                kr3Var.v();
            } else {
                fD2 = d(kr3Var);
            }
        }
        kr3Var.Z();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(kr3 kr3Var, float f) {
        ArrayList arrayList = new ArrayList();
        kr3Var.D0();
        while (kr3Var.q() == 1) {
            kr3Var.D0();
            arrayList.add(b(kr3Var, f));
            kr3Var.A0();
        }
        kr3Var.A0();
        return arrayList;
    }

    public static float d(kr3 kr3Var) {
        int iQ = kr3Var.q();
        int iB = ua5.B(iQ);
        if (iB != 0) {
            if (iB == 6) {
                return (float) kr3Var.nextDouble();
            }
            hk0.g("Unknown value for token of type ".concat(e41.w(iQ)));
            return 0.0f;
        }
        kr3Var.D0();
        float fNextDouble = (float) kr3Var.nextDouble();
        while (kr3Var.hasNext()) {
            kr3Var.v();
        }
        kr3Var.A0();
        return fNextDouble;
    }
}
