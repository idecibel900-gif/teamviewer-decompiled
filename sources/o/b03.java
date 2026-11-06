package o;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b03 implements rb8, m36 {
    public int m;

    @Override // o.m36
    public Object a(Object obj, fw3 fw3Var) {
        g48 g48Var = (g48) obj;
        g48Var.getClass();
        fw3Var.getClass();
        return g48Var.m.get(this.m);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    @Override // o.rb8
    public Object g(kr3 kr3Var, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fE;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = kr3Var.q() == 1;
        if (z) {
            kr3Var.D0();
        }
        while (kr3Var.hasNext()) {
            arrayList.add(Float.valueOf((float) kr3Var.nextDouble()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.m = 2;
        }
        if (z) {
            kr3Var.A0();
        }
        int size = this.m;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.m = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.m * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i3;
            int i10 = i5 % 4;
            if (i10 != 0) {
                if (i10 == i2) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 3) {
                    iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f4) {
                    fArr[i8] = f4 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            } else {
                fArr[i8] = (float) dFloatValue;
            }
            i5++;
            i3 = i9;
            i2 = 1;
        }
        int i11 = i3;
        yz2 yz2Var = new yz2(fArr, iArr);
        if (arrayList.size() <= i) {
            return yz2Var;
        }
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i12 = i11;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i12] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i12] = ((Float) arrayList.get(i)).floatValue();
                i12++;
            }
            i++;
        }
        float[] fArrCopyOf = yz2Var.a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size2 != 0) {
            int length = fArrCopyOf.length + size2;
            float[] fArr4 = new float[length];
            int i13 = i11;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            while (i13 < length) {
                float f5 = i15 < fArrCopyOf.length ? fArrCopyOf[i15] : Float.NaN;
                float f6 = i16 < size2 ? fArr2[i16] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i13] = f5;
                    i15++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i13] = f6;
                    i16++;
                } else {
                    fArr4[i13] = f5;
                    i15++;
                    i16++;
                    i14++;
                }
                i13++;
            }
            fArrCopyOf = i14 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i14);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = i11;
        while (i17 < length2) {
            float f7 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (size < i4 || f7 == fArr[i11]) {
                    iArgb = iArr[i11];
                } else {
                    int i18 = 1;
                    while (true) {
                        if (i18 >= size) {
                            hk0.g("Unreachable code.");
                            return null;
                        }
                        f2 = fArr[i18];
                        if (f2 >= f7 || i18 == size - 1) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != size - 1 || f7 < f2) {
                        int i19 = i18 - 1;
                        float f9 = fArr[i19];
                        int iA = yo1.A((f7 - f9) / (f2 - f9), iArr[i19], iArr[i18]);
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iA), Color.green(iA), Color.blue(iA));
                    } else {
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i18]), Color.green(iArr[i18]), Color.blue(iArr[i18]));
                    }
                }
                iArr2[i17] = iArgb;
            } else {
                int i20 = iArr[iBinarySearch];
                if (size2 < i4 || f7 <= fArr2[i11]) {
                    iArgb2 = Color.argb((int) (fArr3[i11] * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                } else {
                    int i21 = 1;
                    while (true) {
                        if (i21 >= size2) {
                            hk0.g("Unreachable code.");
                            return null;
                        }
                        f3 = fArr2[i21];
                        if (f3 >= f7 || i21 == size2 - 1) {
                            break;
                        }
                        i21++;
                    }
                    if (f3 <= f7) {
                        fE = fArr3[i21];
                    } else {
                        int i22 = i21 - 1;
                        float f10 = fArr2[i22];
                        fE = lr4.e(fArr3[i22], fArr3[i21], (f7 - f10) / (f3 - f10));
                    }
                    iArgb2 = Color.argb((int) (fE * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                }
                iArr2[i17] = iArgb2;
            }
            i17++;
            i4 = 2;
        }
        return new yz2(fArrCopyOf, iArr2);
    }
}
