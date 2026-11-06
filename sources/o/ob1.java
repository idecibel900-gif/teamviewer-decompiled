package o;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob1 {
    public static final jr3 a = jr3.b("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:445:0x0772 A[LOOP:1: B:443:0x076c->B:445:0x0772, LOOP_END] */
    public static nb1 a(or3 or3Var, qh4 qh4Var) throws sq3, EOFException {
        String strR;
        nb1 or0Var;
        nb1 ww6Var;
        nb1 yw6Var;
        nb1 f03Var;
        int i;
        int i2;
        or3Var.u0();
        int iNextInt = 2;
        while (true) {
            if (!or3Var.hasNext()) {
                strR = null;
                break;
            }
            int iZ = or3Var.z(a);
            if (iZ == 0) {
                strR = or3Var.r();
                break;
            }
            if (iZ != 1) {
                or3Var.F();
                or3Var.v();
            } else {
                iNextInt = or3Var.nextInt();
            }
        }
        if (strR == null) {
            return null;
        }
        boolean zJ = false;
        boolean zJ2 = false;
        int i3 = 0;
        int i4 = 3;
        switch (strR) {
            case "el":
                jr3 jr3Var = qr0.a;
                boolean z = iNextInt == 3;
                boolean zJ3 = false;
                String strR2 = null;
                tm tmVarB = null;
                lm lmVarV = null;
                while (or3Var.hasNext()) {
                    int iZ2 = or3Var.z(qr0.a);
                    if (iZ2 == 0) {
                        strR2 = or3Var.r();
                    } else if (iZ2 == 1) {
                        tmVarB = om.b(or3Var, qh4Var);
                    } else if (iZ2 == 2) {
                        lmVarV = e8.v(or3Var, qh4Var);
                    } else if (iZ2 == 3) {
                        zJ3 = or3Var.j();
                    } else if (iZ2 != 4) {
                        or3Var.F();
                        or3Var.v();
                    } else {
                        z = or3Var.nextInt() == 3;
                    }
                }
                or0Var = new or0(strR2, tmVarB, lmVarV, z, zJ3);
                ww6Var = or0Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "fl":
                jr3 jr3Var2 = xw6.a;
                int iNextInt2 = 1;
                boolean zJ4 = false;
                boolean zJ5 = false;
                lm lmVar = null;
                String strR3 = null;
                lm lmVarR = null;
                while (or3Var.hasNext()) {
                    int iZ3 = or3Var.z(xw6.a);
                    if (iZ3 == 0) {
                        strR3 = or3Var.r();
                    } else if (iZ3 == 1) {
                        lmVarR = e8.r(or3Var, qh4Var);
                    } else if (iZ3 == 2) {
                        lmVar = e8.u(or3Var, qh4Var);
                    } else if (iZ3 == 3) {
                        zJ4 = or3Var.j();
                    } else if (iZ3 == 4) {
                        iNextInt2 = or3Var.nextInt();
                    } else if (iZ3 != 5) {
                        or3Var.F();
                        or3Var.v();
                    } else {
                        zJ5 = or3Var.j();
                    }
                }
                if (lmVar == null) {
                    lmVar = new lm(Collections.singletonList(new dy3(100)), (byte) 2);
                }
                ww6Var = new ww6(strR3, zJ4, iNextInt2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, lmVarR, lmVar, zJ5);
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "gf":
                jr3 jr3Var3 = e03.a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i5 = 0;
                boolean zJ6 = false;
                lm lmVar2 = null;
                String strR4 = null;
                lm lmVarT = null;
                lm lmVarV2 = null;
                lm lmVarV3 = null;
                while (or3Var.hasNext()) {
                    switch (or3Var.z(e03.a)) {
                        case 0:
                            strR4 = or3Var.r();
                            break;
                        case 1:
                            or3Var.u0();
                            int iNextInt3 = -1;
                            while (or3Var.hasNext()) {
                                int iZ4 = or3Var.z(e03.b);
                                if (iZ4 == 0) {
                                    iNextInt3 = or3Var.nextInt();
                                } else if (iZ4 != 1) {
                                    or3Var.F();
                                    or3Var.v();
                                } else {
                                    lmVarT = e8.t(or3Var, qh4Var, iNextInt3);
                                }
                            }
                            or3Var.Z();
                            break;
                        case 2:
                            lmVar2 = e8.u(or3Var, qh4Var);
                            break;
                        case 3:
                            i5 = or3Var.nextInt() != 1 ? 2 : 1;
                            break;
                        case 4:
                            lmVarV2 = e8.v(or3Var, qh4Var);
                            break;
                        case 5:
                            lmVarV3 = e8.v(or3Var, qh4Var);
                            break;
                        case 6:
                            fillType = or3Var.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zJ6 = or3Var.j();
                            break;
                        default:
                            or3Var.F();
                            or3Var.v();
                            break;
                    }
                }
                if (lmVar2 == null) {
                    lmVar2 = new lm(Collections.singletonList(new dy3(100)), (byte) 2);
                }
                ww6Var = new c03(strR4, i5, fillType, lmVarT, lmVar2, lmVarV2, lmVarV3, zJ6);
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "gr":
                jr3 jr3Var4 = zw6.a;
                ArrayList arrayList = new ArrayList();
                String strR5 = null;
                while (or3Var.hasNext()) {
                    int iZ5 = or3Var.z(zw6.a);
                    if (iZ5 == 0) {
                        strR5 = or3Var.r();
                    } else if (iZ5 == 1) {
                        zJ = or3Var.j();
                    } else if (iZ5 != 2) {
                        or3Var.v();
                    } else {
                        or3Var.D0();
                        while (or3Var.hasNext()) {
                            nb1 nb1VarA = a(or3Var, qh4Var);
                            if (nb1VarA != null) {
                                arrayList.add(nb1VarA);
                            }
                        }
                        or3Var.A0();
                    }
                }
                yw6Var = new yw6(strR5, arrayList, zJ);
                ww6Var = yw6Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "gs":
                jr3 jr3Var5 = h03.a;
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean zJ7 = false;
                lm lmVar3 = null;
                String strR6 = null;
                lm lmVarT2 = null;
                lm lmVarV4 = null;
                lm lmVarV5 = null;
                mm mmVarS = null;
                mm mmVar = null;
                float fNextDouble = 0.0f;
                while (or3Var.hasNext()) {
                    switch (or3Var.z(h03.a)) {
                        case 0:
                            strR6 = or3Var.r();
                            break;
                        case 1:
                            or3Var.u0();
                            int iNextInt4 = -1;
                            while (or3Var.hasNext()) {
                                int iZ6 = or3Var.z(h03.b);
                                if (iZ6 == 0) {
                                    iNextInt4 = or3Var.nextInt();
                                } else if (iZ6 != 1) {
                                    or3Var.F();
                                    or3Var.v();
                                } else {
                                    lmVarT2 = e8.t(or3Var, qh4Var, iNextInt4);
                                }
                            }
                            or3Var.Z();
                            break;
                        case 2:
                            lmVar3 = e8.u(or3Var, qh4Var);
                            break;
                        case 3:
                            i6 = or3Var.nextInt() != 1 ? 2 : 1;
                            break;
                        case 4:
                            lmVarV4 = e8.v(or3Var, qh4Var);
                            break;
                        case 5:
                            lmVarV5 = e8.v(or3Var, qh4Var);
                            break;
                        case 6:
                            mmVarS = e8.s(or3Var, qh4Var, true);
                            break;
                        case 7:
                            i7 = ua5.E(3)[or3Var.nextInt() - 1];
                            break;
                        case 8:
                            i8 = ua5.E(3)[or3Var.nextInt() - 1];
                            break;
                        case ep1.b /* 9 */:
                            fNextDouble = (float) or3Var.nextDouble();
                            break;
                        case ep1.c /* 10 */:
                            zJ7 = or3Var.j();
                            break;
                        case 11:
                            or3Var.D0();
                            while (or3Var.hasNext()) {
                                or3Var.u0();
                                String strR7 = null;
                                mm mmVarS2 = null;
                                while (or3Var.hasNext()) {
                                    int iZ7 = or3Var.z(h03.c);
                                    if (iZ7 == 0) {
                                        strR7 = or3Var.r();
                                    } else if (iZ7 != 1) {
                                        or3Var.F();
                                        or3Var.v();
                                    } else {
                                        mmVarS2 = e8.s(or3Var, qh4Var, true);
                                    }
                                }
                                or3Var.Z();
                                if (strR7.equals("o")) {
                                    mmVar = mmVarS2;
                                } else if (strR7.equals("d") || strR7.equals("g")) {
                                    qh4Var.f1831o = true;
                                    arrayList2.add(mmVarS2);
                                }
                            }
                            or3Var.A0();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((mm) arrayList2.get(0));
                            }
                            break;
                        default:
                            or3Var.F();
                            or3Var.v();
                            break;
                    }
                }
                if (lmVar3 == null) {
                    lmVar3 = new lm(Collections.singletonList(new dy3(100)), (byte) 2);
                }
                f03Var = new f03(strR6, i6, lmVarT2, lmVar3, lmVarV4, lmVarV5, mmVarS, i7, i8, fNextDouble, arrayList2, mmVar, zJ7);
                ww6Var = f03Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "mm":
                jr3 jr3Var6 = nq4.a;
                boolean zJ8 = false;
                String strR8 = null;
                while (or3Var.hasNext()) {
                    int iZ8 = or3Var.z(nq4.a);
                    if (iZ8 == 0) {
                        strR8 = or3Var.r();
                    } else if (iZ8 == 1) {
                        int iNextInt5 = or3Var.nextInt();
                        if (iNextInt5 != 1) {
                            if (iNextInt5 == 2) {
                                i3 = 2;
                            } else if (iNextInt5 == 3) {
                                i3 = 3;
                            } else if (iNextInt5 == 4) {
                                i3 = 4;
                            } else if (iNextInt5 == 5) {
                                i3 = 5;
                            }
                        }
                        i3 = 1;
                    } else if (iZ8 != 2) {
                        or3Var.F();
                        or3Var.v();
                    } else {
                        zJ8 = or3Var.j();
                    }
                }
                lq4 lq4Var = new lq4(strR8, i3, zJ8);
                qh4Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                ww6Var = lq4Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "rc":
                jr3 jr3Var7 = a66.a;
                boolean zJ9 = false;
                String strR9 = null;
                tm tmVarB2 = null;
                lm lmVarV6 = null;
                mm mmVarS3 = null;
                while (or3Var.hasNext()) {
                    int iZ9 = or3Var.z(a66.a);
                    if (iZ9 == 0) {
                        strR9 = or3Var.r();
                    } else if (iZ9 == 1) {
                        tmVarB2 = om.b(or3Var, qh4Var);
                    } else if (iZ9 == 2) {
                        lmVarV6 = e8.v(or3Var, qh4Var);
                    } else if (iZ9 == 3) {
                        mmVarS3 = e8.s(or3Var, qh4Var, true);
                    } else if (iZ9 != 4) {
                        or3Var.v();
                    } else {
                        zJ9 = or3Var.j();
                    }
                }
                f03Var = new z56(strR9, tmVarB2, lmVarV6, mmVarS3, zJ9);
                ww6Var = f03Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "rd":
                jr3 jr3Var8 = wf6.a;
                String strR10 = null;
                mm mmVarS4 = null;
                while (or3Var.hasNext()) {
                    int iZ10 = or3Var.z(wf6.a);
                    if (iZ10 == 0) {
                        strR10 = or3Var.r();
                    } else if (iZ10 == 1) {
                        mmVarS4 = e8.s(or3Var, qh4Var, true);
                    } else if (iZ10 != 2) {
                        or3Var.v();
                    } else {
                        zJ2 = or3Var.j();
                    }
                }
                ww6Var = zJ2 ? null : new uf6(strR10, mmVarS4);
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "rp":
                jr3 jr3Var9 = va6.a;
                boolean zJ10 = false;
                String strR11 = null;
                mm mmVarS5 = null;
                mm mmVarS6 = null;
                rm rmVarC = null;
                while (or3Var.hasNext()) {
                    int iZ11 = or3Var.z(va6.a);
                    if (iZ11 == 0) {
                        strR11 = or3Var.r();
                    } else if (iZ11 == 1) {
                        mmVarS5 = e8.s(or3Var, qh4Var, false);
                    } else if (iZ11 == 2) {
                        mmVarS6 = e8.s(or3Var, qh4Var, false);
                    } else if (iZ11 == 3) {
                        rmVarC = sm.c(or3Var, qh4Var);
                    } else if (iZ11 != 4) {
                        or3Var.v();
                    } else {
                        zJ10 = or3Var.j();
                    }
                }
                f03Var = new z56(strR11, mmVarS5, mmVarS6, rmVarC, zJ10);
                ww6Var = f03Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "sh":
                jr3 jr3Var10 = mx6.a;
                int iNextInt6 = 0;
                boolean zJ11 = false;
                lm lmVar4 = null;
                String strR12 = null;
                while (or3Var.hasNext()) {
                    int iZ12 = or3Var.z(mx6.a);
                    if (iZ12 == 0) {
                        strR12 = or3Var.r();
                    } else if (iZ12 == 1) {
                        iNextInt6 = or3Var.nextInt();
                    } else if (iZ12 == 2) {
                        lmVar4 = new lm(gy3.a(or3Var, qh4Var, ta8.c(), uw6.m, false), (byte) 5);
                    } else if (iZ12 != 3) {
                        or3Var.v();
                    } else {
                        zJ11 = or3Var.j();
                    }
                }
                yw6Var = new lx6(strR12, iNextInt6, lmVar4, zJ11);
                ww6Var = yw6Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "sr":
                jr3 jr3Var11 = io5.a;
                boolean z2 = iNextInt == 3;
                int i9 = 0;
                boolean zJ12 = false;
                String strR13 = null;
                mm mmVarS7 = null;
                tm tmVarB3 = null;
                mm mmVarS8 = null;
                mm mmVarS9 = null;
                mm mmVarS10 = null;
                mm mmVarS11 = null;
                mm mmVarS12 = null;
                while (or3Var.hasNext()) {
                    switch (or3Var.z(io5.a)) {
                        case 0:
                            strR13 = or3Var.r();
                            break;
                        case 1:
                            int iNextInt7 = or3Var.nextInt();
                            int[] iArrE = ua5.E(2);
                            int length = iArrE.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    i9 = 0;
                                }
                                int i11 = iArrE[i10];
                                if (i11 == 1) {
                                    i = 1;
                                } else {
                                    if (i11 != 2) {
                                        throw null;
                                    }
                                    i = 2;
                                }
                                if (i == iNextInt7) {
                                    i9 = i11;
                                }
                                i10++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            mmVarS7 = e8.s(or3Var, qh4Var, false);
                            break;
                        case 3:
                            tmVarB3 = om.b(or3Var, qh4Var);
                            break;
                        case 4:
                            mmVarS8 = e8.s(or3Var, qh4Var, false);
                            break;
                        case 5:
                            mmVarS10 = e8.s(or3Var, qh4Var, true);
                            break;
                        case 6:
                            mmVarS12 = e8.s(or3Var, qh4Var, false);
                            break;
                        case 7:
                            mmVarS9 = e8.s(or3Var, qh4Var, true);
                            break;
                        case 8:
                            mmVarS11 = e8.s(or3Var, qh4Var, false);
                            break;
                        case ep1.b /* 9 */:
                            zJ12 = or3Var.j();
                            break;
                        case ep1.c /* 10 */:
                            z2 = or3Var.nextInt() == 3;
                            break;
                        default:
                            or3Var.F();
                            or3Var.v();
                            break;
                    }
                }
                f03Var = new ho5(strR13, i9, mmVarS7, tmVarB3, mmVarS8, mmVarS9, mmVarS10, mmVarS11, mmVarS12, zJ12, z2);
                ww6Var = f03Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "st":
                jr3 jr3Var12 = ox6.a;
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                boolean zJ13 = false;
                lm lmVar5 = null;
                String strR14 = null;
                mm mmVar2 = null;
                lm lmVarR2 = null;
                mm mmVarS13 = null;
                float fNextDouble2 = 0.0f;
                while (or3Var.hasNext()) {
                    switch (or3Var.z(ox6.a)) {
                        case 0:
                            strR14 = or3Var.r();
                            continue;
                        case 1:
                            lmVarR2 = e8.r(or3Var, qh4Var);
                            continue;
                        case 2:
                            mmVarS13 = e8.s(or3Var, qh4Var, true);
                            continue;
                        case 3:
                            lmVar5 = e8.u(or3Var, qh4Var);
                            continue;
                        case 4:
                            i12 = ua5.E(i4)[or3Var.nextInt() - 1];
                            continue;
                        case 5:
                            i13 = ua5.E(i4)[or3Var.nextInt() - 1];
                            continue;
                        case 6:
                            i2 = i4;
                            fNextDouble2 = (float) or3Var.nextDouble();
                            break;
                        case 7:
                            zJ13 = or3Var.j();
                            continue;
                        case 8:
                            or3Var.D0();
                            while (or3Var.hasNext()) {
                                or3Var.u0();
                                mm mmVarS14 = null;
                                String strR15 = null;
                                while (or3Var.hasNext()) {
                                    int i14 = i4;
                                    int iZ13 = or3Var.z(ox6.b);
                                    if (iZ13 == 0) {
                                        strR15 = or3Var.r();
                                    } else if (iZ13 != 1) {
                                        or3Var.F();
                                        or3Var.v();
                                    } else {
                                        mmVarS14 = e8.s(or3Var, qh4Var, true);
                                    }
                                    i4 = i14;
                                }
                                int i15 = i4;
                                or3Var.Z();
                                strR15.getClass();
                                switch (strR15) {
                                    case "d":
                                    case "g":
                                        qh4Var.f1831o = true;
                                        arrayList3.add(mmVarS14);
                                        break;
                                    case "o":
                                        mmVar2 = mmVarS14;
                                        break;
                                }
                                i4 = i15;
                            }
                            i2 = i4;
                            or3Var.A0();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((mm) arrayList3.get(0));
                            }
                            break;
                        default:
                            or3Var.v();
                            continue;
                    }
                    i4 = i2;
                }
                if (lmVar5 == null) {
                    lmVar5 = new lm(Collections.singletonList(new dy3(100)), (byte) 2);
                }
                ww6Var = new nx6(strR14, mmVar2, arrayList3, lmVarR2, lmVar5, mmVarS13, i12 == 0 ? 1 : i12, i13 == 0 ? 1 : i13, fNextDouble2, zJ13);
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "tm":
                jr3 jr3Var13 = rx6.a;
                int i16 = 0;
                boolean zJ14 = false;
                String strR16 = null;
                mm mmVarS15 = null;
                mm mmVarS16 = null;
                mm mmVarS17 = null;
                while (or3Var.hasNext()) {
                    int iZ14 = or3Var.z(rx6.a);
                    if (iZ14 == 0) {
                        mmVarS15 = e8.s(or3Var, qh4Var, false);
                    } else if (iZ14 == 1) {
                        mmVarS16 = e8.s(or3Var, qh4Var, false);
                    } else if (iZ14 == 2) {
                        mmVarS17 = e8.s(or3Var, qh4Var, false);
                    } else if (iZ14 == 3) {
                        strR16 = or3Var.r();
                    } else if (iZ14 == 4) {
                        int iNextInt8 = or3Var.nextInt();
                        if (iNextInt8 == 1) {
                            i16 = 1;
                        } else {
                            if (iNextInt8 != 2) {
                                hk0.g(fx3.e(iNextInt8, "Unknown trim path type "));
                                return null;
                            }
                            i16 = 2;
                        }
                    } else if (iZ14 != 5) {
                        or3Var.v();
                    } else {
                        zJ14 = or3Var.j();
                    }
                }
                or0Var = new qx6(strR16, i16, mmVarS15, mmVarS16, mmVarS17, zJ14);
                ww6Var = or0Var;
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            case "tr":
                ww6Var = sm.c(or3Var, qh4Var);
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
            default:
                xe4.a("Unknown shape type ".concat(strR));
                while (or3Var.hasNext()) {
                    or3Var.v();
                }
                or3Var.Z();
                return ww6Var;
        }
    }
}
