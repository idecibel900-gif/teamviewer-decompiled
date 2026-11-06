package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class uw6 implements rb8 {
    public static final uw6 m = new uw6();
    public static final jr3 n = jr3.b("c", "v", "i", "o");

    @Override // o.rb8
    public final Object g(kr3 kr3Var, float f) {
        if (kr3Var.q() == 1) {
            kr3Var.D0();
        }
        kr3Var.u0();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zJ = false;
        while (kr3Var.hasNext()) {
            int iZ = kr3Var.z(n);
            if (iZ == 0) {
                zJ = kr3Var.j();
            } else if (iZ == 1) {
                arrayListC = qr3.c(kr3Var, f);
            } else if (iZ == 2) {
                arrayListC2 = qr3.c(kr3Var, f);
            } else if (iZ != 3) {
                kr3Var.F();
                kr3Var.v();
            } else {
                arrayListC3 = qr3.c(kr3Var, f);
            }
        }
        kr3Var.Z();
        if (kr3Var.q() == 2) {
            kr3Var.A0();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            hk0.g("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new tw6(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new kf1(lr4.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), lr4.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zJ) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new kf1(lr4.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), lr4.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new tw6(pointF, zJ, arrayList);
    }
}
