package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bx6 extends o30 {
    public final tw6 h;
    public final Path i;
    public ArrayList j;

    public bx6(List list) {
        super(list);
        this.h = new tw6();
        this.i = new Path();
    }

    @Override // o.o30
    public final Object e(dy3 dy3Var, float f) {
        int i;
        float f2;
        tw6 tw6Var = (tw6) dy3Var.b;
        tw6 tw6Var2 = (tw6) dy3Var.c;
        if (tw6Var2 == null) {
            tw6Var2 = tw6Var;
        }
        tw6 tw6Var3 = this.h;
        ArrayList arrayList = tw6Var3.a;
        if (tw6Var3.b == null) {
            tw6Var3.b = new PointF();
        }
        boolean z = tw6Var.c;
        ArrayList arrayList2 = tw6Var.a;
        boolean z2 = true;
        tw6Var3.c = z || tw6Var2.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = tw6Var2.a;
        if (size != arrayList3.size()) {
            xe4.a("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new kf1());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = tw6Var.b;
        PointF pointF2 = tw6Var2.b;
        float fE = lr4.e(pointF.x, pointF2.x, f);
        float fE2 = lr4.e(pointF.y, pointF2.y, f);
        PointF pointF3 = tw6Var3.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            tw6Var3.b = pointF3;
        }
        pointF3.set(fE, fE2);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            kf1 kf1Var = (kf1) arrayList2.get(size4);
            kf1 kf1Var2 = (kf1) arrayList3.get(size4);
            PointF pointF4 = kf1Var.a;
            PointF pointF5 = kf1Var.b;
            PointF pointF6 = kf1Var.c;
            PointF pointF7 = kf1Var2.a;
            PointF pointF8 = kf1Var2.b;
            PointF pointF9 = kf1Var2.c;
            ((kf1) arrayList.get(size4)).a.set(lr4.e(pointF4.x, pointF7.x, f), lr4.e(pointF4.y, pointF7.y, f));
            ((kf1) arrayList.get(size4)).b.set(lr4.e(pointF5.x, pointF8.x, f), lr4.e(pointF5.y, pointF8.y, f));
            ((kf1) arrayList.get(size4)).c.set(lr4.e(pointF6.x, pointF9.x, f), lr4.e(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z2;
        }
        boolean z3 = z2;
        ArrayList arrayList4 = this.j;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = tw6Var3.a;
                if (size5 < 0) {
                    break;
                }
                vf6 vf6Var = (vf6) this.j.get(size5);
                vf6Var.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) vf6Var.b.d()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z4 = tw6Var3.c;
                        int size6 = arrayList5.size() - 1;
                        int i2 = 0;
                        while (size6 >= 0) {
                            kf1 kf1Var3 = (kf1) arrayList5.get(size6);
                            kf1 kf1Var4 = (kf1) arrayList5.get(vf6.d(size6 - 1, arrayList5.size()));
                            PointF pointF10 = (size6 != 0 || z4) ? kf1Var4.c : tw6Var3.b;
                            i2 = (((size6 != 0 || z4) ? kf1Var4.b : pointF10).equals(pointF10) && kf1Var3.a.equals(pointF10) && !((tw6Var3.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z3)) ? i2 + 2 : i2 + 1;
                            size6--;
                        }
                        tw6 tw6Var4 = vf6Var.c;
                        if (tw6Var4 == null || tw6Var4.a.size() != i2) {
                            ArrayList arrayList6 = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList6.add(new kf1());
                            }
                            i = 0;
                            vf6Var.c = new tw6(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        tw6 tw6Var5 = vf6Var.c;
                        tw6Var5.c = z4;
                        PointF pointF11 = tw6Var3.b;
                        float f3 = pointF11.x;
                        float f4 = pointF11.y;
                        PointF pointF12 = tw6Var5.b;
                        if (pointF12 == null) {
                            pointF12 = new PointF();
                            tw6Var5.b = pointF12;
                        }
                        pointF12.set(f3, f4);
                        ArrayList arrayList7 = tw6Var5.a;
                        boolean z5 = tw6Var3.c;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < arrayList5.size()) {
                            kf1 kf1Var5 = (kf1) arrayList5.get(i4);
                            kf1 kf1Var6 = (kf1) arrayList5.get(vf6.d(i4 - 1, arrayList5.size()));
                            kf1 kf1Var7 = (kf1) arrayList5.get(vf6.d(i4 - 2, arrayList5.size()));
                            PointF pointF13 = (i4 != 0 || z5) ? kf1Var6.c : tw6Var3.b;
                            PointF pointF14 = (i4 != 0 || z5) ? kf1Var6.b : pointF13;
                            PointF pointF15 = kf1Var5.a;
                            PointF pointF16 = kf1Var7.c;
                            int i6 = size5;
                            PointF pointF17 = kf1Var5.c;
                            ArrayList arrayList8 = arrayList5;
                            boolean z6 = (tw6Var3.c || !(i4 == 0 || i4 == arrayList8.size() + (-1))) ? false : z3;
                            if (pointF14.equals(pointF13) && pointF15.equals(pointF13) && !z6) {
                                float f5 = pointF13.x;
                                float f6 = f5 - pointF16.x;
                                float f7 = pointF13.y;
                                float f8 = f7 - pointF16.y;
                                float f9 = pointF17.x - f5;
                                float f10 = pointF17.y - f7;
                                f2 = fFloatValue;
                                float fHypot = (float) Math.hypot(f6, f8);
                                float fHypot2 = (float) Math.hypot(f9, f10);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f11 = pointF13.x;
                                float fC = ua5.c(pointF16.x, f11, fMin, f11);
                                float f12 = pointF13.y;
                                float fC2 = ua5.c(pointF16.y, f12, fMin, f12);
                                float fC3 = ua5.c(pointF17.x, f11, fMin2, f11);
                                float fC4 = ua5.c(pointF17.y, f12, fMin2, f12);
                                float f13 = fC - ((fC - f11) * 0.5519f);
                                float f14 = fC2 - ((fC2 - f12) * 0.5519f);
                                float f15 = fC3 - ((fC3 - f11) * 0.5519f);
                                float f16 = fC4 - ((fC4 - f12) * 0.5519f);
                                kf1 kf1Var8 = (kf1) arrayList7.get(vf6.d(i5 - 1, arrayList7.size()));
                                kf1 kf1Var9 = (kf1) arrayList7.get(i5);
                                kf1Var8.b.set(fC, fC2);
                                kf1Var8.c.set(fC, fC2);
                                if (i4 == 0) {
                                    PointF pointF18 = tw6Var5.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        tw6Var5.b = pointF18;
                                    }
                                    pointF18.set(fC, fC2);
                                }
                                kf1Var9.a.set(f13, f14);
                                kf1 kf1Var10 = (kf1) arrayList7.get(i5 + 1);
                                kf1Var9.b.set(f15, f16);
                                kf1Var9.c.set(fC3, fC4);
                                kf1Var10.a.set(fC3, fC4);
                                i5 += 2;
                            } else {
                                f2 = fFloatValue;
                                kf1 kf1Var11 = (kf1) arrayList7.get(vf6.d(i5 - 1, arrayList7.size()));
                                kf1 kf1Var12 = (kf1) arrayList7.get(i5);
                                PointF pointF19 = kf1Var6.b;
                                kf1Var11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = kf1Var6.c;
                                kf1Var11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = kf1Var5.a;
                                kf1Var12.a.set(pointF21.x, pointF21.y);
                                i5++;
                            }
                            i4++;
                            size5 = i6;
                            arrayList5 = arrayList8;
                            tw6Var3 = tw6Var3;
                            fFloatValue = f2;
                            z5 = z5;
                        }
                        tw6Var3 = tw6Var5;
                    }
                }
                size5--;
            }
        }
        Path path = this.i;
        path.reset();
        PointF pointF22 = tw6Var3.b;
        ArrayList arrayList9 = tw6Var3.a;
        path.moveTo(pointF22.x, pointF22.y);
        PointF pointF23 = lr4.a;
        pointF23.set(pointF22.x, pointF22.y);
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            kf1 kf1Var13 = (kf1) arrayList9.get(i7);
            PointF pointF24 = kf1Var13.a;
            PointF pointF25 = kf1Var13.b;
            PointF pointF26 = kf1Var13.c;
            if (pointF24.equals(pointF23) && pointF25.equals(pointF26)) {
                path.lineTo(pointF26.x, pointF26.y);
            } else {
                path.cubicTo(pointF24.x, pointF24.y, pointF25.x, pointF25.y, pointF26.x, pointF26.y);
            }
            pointF23.set(pointF26.x, pointF26.y);
        }
        if (tw6Var3.c) {
            path.close();
        }
        return path;
    }

    @Override // o.o30
    public final boolean h() {
        ArrayList arrayList = this.j;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
