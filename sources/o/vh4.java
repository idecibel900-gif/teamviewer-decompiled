package o;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class vh4 {
    public static final jr3 a = jr3.b("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final jr3 b = jr3.b("id", "layers", "w", "h", "p", "u");
    public static final jr3 c = jr3.b("list");
    public static final jr3 d = jr3.b("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static qh4 a(or3 or3Var) throws sq3, EOFException {
        float f;
        qh4 qh4Var;
        int i;
        float f2;
        qh4 qh4Var2;
        int i2;
        float f3;
        float f4;
        float fC = ta8.c();
        mg4 mg4Var = new mg4((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        n77 n77Var = new n77(0);
        qh4 qh4Var3 = new qh4();
        or3Var.u0();
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (or3Var.hasNext()) {
            switch (or3Var.z(a)) {
                case 0:
                    iNextDouble = (int) or3Var.nextDouble();
                    qh4Var3 = qh4Var3;
                    break;
                case 1:
                    iNextDouble2 = (int) or3Var.nextDouble();
                    qh4Var3 = qh4Var3;
                    break;
                case 2:
                    fNextDouble2 = (float) or3Var.nextDouble();
                    qh4Var3 = qh4Var3;
                    break;
                case 3:
                    fNextDouble = ((float) or3Var.nextDouble()) - 0.01f;
                    qh4Var3 = qh4Var3;
                    fC = fC;
                    break;
                case 4:
                    fNextDouble3 = (float) or3Var.nextDouble();
                    qh4Var3 = qh4Var3;
                    fC = fC;
                    break;
                case 5:
                    f = fC;
                    qh4Var = qh4Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    String[] strArrSplit = or3Var.r().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        qh4Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 6:
                    f = fC;
                    qh4 qh4Var4 = qh4Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    or3Var.D0();
                    int i6 = 0;
                    while (or3Var.hasNext()) {
                        qh4 qh4Var5 = qh4Var4;
                        c04 c04VarA = e04.a(or3Var, qh4Var5);
                        if (c04VarA.e == 3) {
                            i6++;
                        }
                        arrayList.add(c04VarA);
                        mg4Var.e(c04VarA.d, c04VarA);
                        if (i6 > 4) {
                            xe4.a("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        qh4Var4 = qh4Var5;
                    }
                    qh4Var = qh4Var4;
                    or3Var.A0();
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 7:
                    f = fC;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    or3Var.D0();
                    while (or3Var.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        mg4 mg4Var2 = new mg4((Object) null);
                        or3Var.u0();
                        String strR = null;
                        String strR2 = null;
                        String strR3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (or3Var.hasNext()) {
                            int iZ = or3Var.z(b);
                            if (iZ != 0) {
                                if (iZ == 1) {
                                    or3Var.D0();
                                    while (or3Var.hasNext()) {
                                        c04 c04VarA2 = e04.a(or3Var, qh4Var3);
                                        mg4Var2.e(c04VarA2.d, c04VarA2);
                                        arrayList3.add(c04VarA2);
                                        qh4Var3 = qh4Var3;
                                    }
                                    qh4Var2 = qh4Var3;
                                    or3Var.A0();
                                } else if (iZ == 2) {
                                    iNextInt = or3Var.nextInt();
                                } else if (iZ == 3) {
                                    iNextInt2 = or3Var.nextInt();
                                } else if (iZ == 4) {
                                    strR2 = or3Var.r();
                                } else if (iZ != 5) {
                                    or3Var.F();
                                    or3Var.v();
                                    qh4Var2 = qh4Var3;
                                } else {
                                    strR3 = or3Var.r();
                                }
                                qh4Var3 = qh4Var2;
                            } else {
                                strR = or3Var.r();
                            }
                        }
                        qh4 qh4Var6 = qh4Var3;
                        or3Var.Z();
                        if (strR2 != null) {
                            map2.put(strR, new gi4(iNextInt, iNextInt2, strR, strR2, strR3));
                        } else {
                            map.put(strR, arrayList3);
                        }
                        qh4Var3 = qh4Var6;
                    }
                    or3Var.A0();
                    qh4Var = qh4Var3;
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case 8:
                    f = fC;
                    int i7 = iNextDouble2;
                    float f5 = fNextDouble2;
                    or3Var.u0();
                    while (or3Var.hasNext()) {
                        if (or3Var.z(c) != 0) {
                            or3Var.F();
                            or3Var.v();
                        } else {
                            or3Var.D0();
                            while (or3Var.hasNext()) {
                                jr3 jr3Var = tr2.a;
                                or3Var.u0();
                                String strR4 = null;
                                String strR5 = null;
                                String strR6 = null;
                                while (or3Var.hasNext()) {
                                    i7 = i7;
                                    int iZ2 = or3Var.z(tr2.a);
                                    if (iZ2 != 0) {
                                        float f6 = f5;
                                        if (iZ2 == 1) {
                                            strR5 = or3Var.r();
                                        } else if (iZ2 == 2) {
                                            strR6 = or3Var.r();
                                        } else if (iZ2 != 3) {
                                            or3Var.F();
                                            or3Var.v();
                                        } else {
                                            or3Var.nextDouble();
                                        }
                                        f5 = f6;
                                    } else {
                                        strR4 = or3Var.r();
                                    }
                                }
                                or3Var.Z();
                                map3.put(strR5, new jr2(strR4, strR5, strR6));
                                i7 = i7;
                            }
                            or3Var.A0();
                        }
                    }
                    i = i7;
                    f2 = f5;
                    or3Var.Z();
                    qh4Var = qh4Var3;
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case ep1.b /* 9 */:
                    f = fC;
                    i2 = iNextDouble2;
                    f3 = fNextDouble2;
                    or3Var.D0();
                    while (or3Var.hasNext()) {
                        jr3 jr3Var2 = lr2.a;
                        ArrayList arrayList4 = new ArrayList();
                        or3Var.u0();
                        double dNextDouble = 0.0d;
                        char cCharAt = 0;
                        String strR7 = null;
                        String strR8 = null;
                        while (or3Var.hasNext()) {
                            int iZ3 = or3Var.z(lr2.a);
                            if (iZ3 == 0) {
                                cCharAt = or3Var.r().charAt(0);
                            } else if (iZ3 == 1) {
                                or3Var.nextDouble();
                            } else if (iZ3 == 2) {
                                dNextDouble = or3Var.nextDouble();
                            } else if (iZ3 == 3) {
                                strR7 = or3Var.r();
                            } else if (iZ3 == 4) {
                                strR8 = or3Var.r();
                            } else if (iZ3 != 5) {
                                or3Var.F();
                                or3Var.v();
                            } else {
                                or3Var.u0();
                                while (or3Var.hasNext()) {
                                    if (or3Var.z(lr2.b) != 0) {
                                        or3Var.F();
                                        or3Var.v();
                                    } else {
                                        or3Var.D0();
                                        while (or3Var.hasNext()) {
                                            arrayList4.add((yw6) ob1.a(or3Var, qh4Var3));
                                        }
                                        or3Var.A0();
                                    }
                                }
                                or3Var.Z();
                            }
                        }
                        or3Var.Z();
                        kr2 kr2Var = new kr2(arrayList4, cCharAt, dNextDouble, strR7, strR8);
                        n77Var.c(kr2Var.hashCode(), kr2Var);
                    }
                    or3Var.A0();
                    i = i2;
                    f2 = f3;
                    qh4Var = qh4Var3;
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                case ep1.c /* 10 */:
                    or3Var.D0();
                    while (or3Var.hasNext()) {
                        or3Var.u0();
                        String strR9 = null;
                        float fNextDouble4 = 0.0f;
                        while (or3Var.hasNext()) {
                            int iZ4 = or3Var.z(d);
                            if (iZ4 != 0) {
                                f4 = fC;
                                if (iZ4 == 1) {
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) or3Var.nextDouble();
                                    iNextDouble2 = iNextDouble2;
                                } else if (iZ4 != 2) {
                                    or3Var.F();
                                    or3Var.v();
                                } else {
                                    or3Var.nextDouble();
                                }
                            } else {
                                f4 = fC;
                                strR9 = or3Var.r();
                            }
                            fC = f4;
                        }
                        or3Var.Z();
                        arrayList2.add(new ym4(strR9, fNextDouble4));
                        iNextDouble2 = iNextDouble2;
                        fNextDouble2 = fNextDouble2;
                        fC = fC;
                    }
                    f = fC;
                    i2 = iNextDouble2;
                    f3 = fNextDouble2;
                    or3Var.A0();
                    i = i2;
                    f2 = f3;
                    qh4Var = qh4Var3;
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
                default:
                    or3Var.F();
                    or3Var.v();
                    f = fC;
                    qh4Var = qh4Var3;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    qh4Var3 = qh4Var;
                    iNextDouble2 = i;
                    fC = f;
                    fNextDouble2 = f2;
                    break;
            }
        }
        float f7 = fC;
        qh4 qh4Var7 = qh4Var3;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f7), (int) (iNextDouble2 * f7));
        float fC2 = ta8.c();
        qh4Var7.k = rect;
        qh4Var7.l = fNextDouble2;
        qh4Var7.m = fNextDouble;
        qh4Var7.n = fNextDouble3;
        qh4Var7.j = arrayList;
        qh4Var7.i = mg4Var;
        qh4Var7.c = map;
        qh4Var7.d = map2;
        qh4Var7.e = fC2;
        qh4Var7.h = n77Var;
        qh4Var7.f = map3;
        qh4Var7.g = arrayList2;
        return qh4Var7;
    }
}
