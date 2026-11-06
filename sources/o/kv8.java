package o;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class kv8 {
    public static final kv8 b = new kv8();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:149:0x030f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0314  */
    /* JADX WARN: Code duplicated, block: B:154:0x0332  */
    /* JADX WARN: Code duplicated, block: B:155:0x0335  */
    /* JADX WARN: Code duplicated, block: B:196:0x040a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0477  */
    /* JADX WARN: Code duplicated, block: B:215:0x047a  */
    /* JADX WARN: Code duplicated, block: B:218:0x047f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0482  */
    /* JADX WARN: Code duplicated, block: B:221:0x0485  */
    /* JADX WARN: Code duplicated, block: B:222:0x0488  */
    public final qv8 a(Class cls) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        qv8 iv8Var;
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i25;
        Field fieldB;
        int i26;
        int i27;
        char cCharAt8;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldB2;
        int i36;
        Object obj2;
        Field fieldB3;
        int i37;
        char cCharAt9;
        int i38;
        int i39;
        char cCharAt10;
        int i40;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj3 = concurrentHashMap.get(cls);
        if (obj3 != null) {
            return (qv8) obj3;
        }
        wj5 wj5Var = ka0.y;
        rk5 rk5Var = rv8.a;
        if (!vu8.class.isAssignableFrom(cls)) {
            int i43 = ku8.a;
        }
        int i44 = ku8.a;
        if (!vu8.class.isAssignableFrom(cls)) {
            hk0.g("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            pv8 pv8Var = (pv8) vu8.m(cls.asSubclass(vu8.class)).j(3);
            int i45 = 0;
            if ((pv8Var.d & 2) == 2) {
                iv8Var = new jv8(rv8.a, pv8Var.a);
            } else {
                rk5 rk5Var2 = rv8.a;
                wj5 wj5Var2 = pv8Var.a() + (-1) != 1 ? wj5Var : null;
                Unsafe unsafe = iv8.j;
                if (unsafe == null) {
                    hk0.o("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                    return null;
                }
                if (!(pv8Var instanceof pv8)) {
                    io.sentry.h2.f();
                    return null;
                }
                String str = pv8Var.b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i46 = 1;
                    while (true) {
                        i = i46 + 1;
                        if (str.charAt(i46) < 55296) {
                            break;
                        }
                        i46 = i;
                    }
                } else {
                    i = 1;
                }
                int i47 = i + 1;
                int iCharAt = str.charAt(i);
                if (iCharAt >= 55296) {
                    int i48 = iCharAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i42 = i47 + 1;
                        cCharAt12 = str.charAt(i47);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt12 & 8191) << i49;
                        i49 += 13;
                        i47 = i42;
                    }
                    iCharAt = i48 | (cCharAt12 << i49);
                    i47 = i42;
                }
                if (iCharAt == 0) {
                    iArr = iv8.i;
                    i12 = 0;
                    i7 = 0;
                    i11 = 0;
                    i10 = 0;
                    i9 = 0;
                    i8 = 0;
                } else {
                    int i50 = i47 + 1;
                    int iCharAt2 = str.charAt(i47);
                    if (iCharAt2 >= 55296) {
                        int i51 = iCharAt2 & 8191;
                        int i52 = 13;
                        while (true) {
                            i20 = i50 + 1;
                            cCharAt7 = str.charAt(i50);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i51 |= (cCharAt7 & 8191) << i52;
                            i52 += 13;
                            i50 = i20;
                        }
                        iCharAt2 = i51 | (cCharAt7 << i52);
                        i50 = i20;
                    }
                    int i53 = i50 + 1;
                    int iCharAt3 = str.charAt(i50);
                    if (iCharAt3 >= 55296) {
                        int i54 = iCharAt3 & 8191;
                        int i55 = 13;
                        while (true) {
                            i19 = i53 + 1;
                            cCharAt6 = str.charAt(i53);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i54 |= (cCharAt6 & 8191) << i55;
                            i55 += 13;
                            i53 = i19;
                        }
                        iCharAt3 = i54 | (cCharAt6 << i55);
                        i53 = i19;
                    }
                    int i56 = i53 + 1;
                    int iCharAt4 = str.charAt(i53);
                    if (iCharAt4 >= 55296) {
                        int i57 = iCharAt4 & 8191;
                        int i58 = i56;
                        int i59 = 13;
                        while (true) {
                            i18 = i58 + 1;
                            cCharAt5 = str.charAt(i58);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i57 |= (cCharAt5 & 8191) << i59;
                            i59 += 13;
                            i58 = i18;
                        }
                        iCharAt4 = i57 | (cCharAt5 << i59);
                        i2 = i18;
                    } else {
                        i2 = i56;
                    }
                    int i60 = i2 + 1;
                    int iCharAt5 = str.charAt(i2);
                    if (iCharAt5 >= 55296) {
                        int i61 = iCharAt5 & 8191;
                        int i62 = i60;
                        int i63 = 13;
                        while (true) {
                            i17 = i62 + 1;
                            cCharAt4 = str.charAt(i62);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i61 |= (cCharAt4 & 8191) << i63;
                            i63 += 13;
                            i62 = i17;
                        }
                        iCharAt5 = i61 | (cCharAt4 << i63);
                        i3 = i17;
                    } else {
                        i3 = i60;
                    }
                    int i64 = i3 + 1;
                    int iCharAt6 = str.charAt(i3);
                    if (iCharAt6 >= 55296) {
                        int i65 = iCharAt6 & 8191;
                        int i66 = i64;
                        int i67 = 13;
                        while (true) {
                            i16 = i66 + 1;
                            cCharAt3 = str.charAt(i66);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i65 |= (cCharAt3 & 8191) << i67;
                            i67 += 13;
                            i66 = i16;
                        }
                        iCharAt6 = i65 | (cCharAt3 << i67);
                        i4 = i16;
                    } else {
                        i4 = i64;
                    }
                    int i68 = i4 + 1;
                    int iCharAt7 = str.charAt(i4);
                    if (iCharAt7 >= 55296) {
                        int i69 = iCharAt7 & 8191;
                        int i70 = i68;
                        int i71 = 13;
                        while (true) {
                            i15 = i70 + 1;
                            cCharAt2 = str.charAt(i70);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i69 |= (cCharAt2 & 8191) << i71;
                            i71 += 13;
                            i70 = i15;
                        }
                        iCharAt7 = i69 | (cCharAt2 << i71);
                        i5 = i15;
                    } else {
                        i5 = i68;
                    }
                    int i72 = i5 + 1;
                    if (str.charAt(i5) >= 55296) {
                        do {
                            i14 = i72;
                            i72 = i14 + 1;
                        } while (str.charAt(i14) >= 55296);
                    }
                    int i73 = i72;
                    int i74 = i73 + 1;
                    int iCharAt8 = str.charAt(i73);
                    if (iCharAt8 >= 55296) {
                        int i75 = iCharAt8 & 8191;
                        int i76 = i74;
                        int i77 = 13;
                        while (true) {
                            i13 = i76 + 1;
                            cCharAt = str.charAt(i76);
                            i6 = iCharAt5;
                            if (cCharAt < 55296) {
                                break;
                            }
                            i75 |= (cCharAt & 8191) << i77;
                            i77 += 13;
                            i76 = i13;
                            iCharAt5 = i6;
                        }
                        iCharAt8 = i75 | (cCharAt << i77);
                        i74 = i13;
                    } else {
                        i6 = iCharAt5;
                    }
                    i7 = iCharAt2 + iCharAt2 + iCharAt3;
                    iArr = new int[iCharAt8 + iCharAt7 + iCharAt2];
                    i8 = iCharAt6;
                    i45 = iCharAt2;
                    i47 = i74;
                    i9 = iCharAt4;
                    i10 = iCharAt7;
                    i11 = iCharAt8;
                    i12 = i6;
                }
                Object[] objArr2 = pv8Var.c;
                Class<?> cls2 = pv8Var.a.getClass();
                int i78 = i10 + i11;
                int i79 = i47;
                int i80 = i45;
                int[] iArr2 = new int[i8 * 3];
                Object[] objArr3 = new Object[i8 + i8];
                int i81 = i7;
                int i82 = i11;
                int i83 = i78;
                int i84 = i79;
                int i85 = 0;
                int i86 = 0;
                while (i84 < length) {
                    int i87 = i84 + 1;
                    int iCharAt9 = str.charAt(i84);
                    int i88 = length;
                    if (iCharAt9 >= 55296) {
                        int i89 = iCharAt9 & 8191;
                        int i90 = i87;
                        int i91 = 13;
                        while (true) {
                            i41 = i90 + 1;
                            cCharAt11 = str.charAt(i90);
                            objArr = objArr3;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt11 & 8191) << i91;
                            i91 += 13;
                            i90 = i41;
                            objArr3 = objArr;
                        }
                        iCharAt9 = i89 | (cCharAt11 << i91);
                        i21 = i41;
                    } else {
                        objArr = objArr3;
                        i21 = i87;
                    }
                    int i92 = i21 + 1;
                    int iCharAt10 = str.charAt(i21);
                    if (iCharAt10 >= 55296) {
                        int i93 = iCharAt10 & 8191;
                        int i94 = i92;
                        int i95 = 13;
                        while (true) {
                            i39 = i94 + 1;
                            cCharAt10 = str.charAt(i94);
                            i40 = i93;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i93 = i40 | ((cCharAt10 & 8191) << i95);
                            i95 += 13;
                            i94 = i39;
                        }
                        iCharAt10 = i40 | (cCharAt10 << i95);
                        i22 = i39;
                    } else {
                        i22 = i92;
                    }
                    int[] iArr3 = iArr2;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i86] = i85;
                        i86++;
                    }
                    int i96 = iCharAt10 & 255;
                    int i97 = i12;
                    int i98 = iCharAt10 & 2048;
                    if (i96 >= 51) {
                        int i99 = i22 + 1;
                        int iCharAt11 = str.charAt(i22);
                        if (iCharAt11 >= 55296) {
                            int i100 = iCharAt11 & 8191;
                            int i101 = i99;
                            int i102 = 13;
                            while (true) {
                                i37 = i101 + 1;
                                cCharAt9 = str.charAt(i101);
                                i38 = i100;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i100 = i38 | ((cCharAt9 & 8191) << i102);
                                i102 += 13;
                                i101 = i37;
                            }
                            iCharAt11 = i38 | (cCharAt9 << i102);
                            i32 = i37;
                        } else {
                            i32 = i99;
                        }
                        int i103 = iCharAt11;
                        int i104 = i96 - 51;
                        int i105 = i32;
                        if (i104 == 9 || i104 == 17) {
                            i33 = i81 + 1;
                            int i106 = i85 / 3;
                            objArr[i106 + i106 + 1] = objArr2[i81];
                        } else {
                            if (i104 != 12) {
                                i34 = i98;
                            } else if (pv8Var.a() == 1 || i98 != 0) {
                                i33 = i81 + 1;
                                int i107 = i85 / 3;
                                objArr[i107 + i107 + 1] = objArr2[i81];
                            } else {
                                i34 = 0;
                            }
                            i35 = i103 + i103;
                            obj = objArr2[i35];
                            int i108 = i34;
                            if (obj instanceof Field) {
                                fieldB2 = (Field) obj;
                            } else {
                                fieldB2 = iv8.B(cls2, (String) obj);
                                objArr2[i35] = fieldB2;
                                iArr[i83] = i85;
                                i83++;
                            }
                            i23 = iCharAt9;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldB2);
                            i36 = i35 + 1;
                            obj2 = objArr2[i36];
                            if (obj2 instanceof Field) {
                                fieldB3 = (Field) obj2;
                            } else {
                                fieldB3 = iv8.B(cls2, (String) obj2);
                                objArr2[i36] = fieldB3;
                            }
                            int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldB3);
                            iArr = iArr;
                            i11 = i11;
                            i24 = i108;
                            i84 = i105;
                            iObjectFieldOffset2 = iObjectFieldOffset4;
                            i25 = iObjectFieldOffset3;
                        }
                        i81 = i33;
                        i34 = i98;
                        i35 = i103 + i103;
                        obj = objArr2[i35];
                        int i109 = i34;
                        if (obj instanceof Field) {
                            fieldB2 = (Field) obj;
                        } else {
                            fieldB2 = iv8.B(cls2, (String) obj);
                            objArr2[i35] = fieldB2;
                            iArr[i83] = i85;
                            i83++;
                        }
                        i23 = iCharAt9;
                        int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldB2);
                        i36 = i35 + 1;
                        obj2 = objArr2[i36];
                        if (obj2 instanceof Field) {
                            fieldB3 = (Field) obj2;
                        } else {
                            fieldB3 = iv8.B(cls2, (String) obj2);
                            objArr2[i36] = fieldB3;
                        }
                        int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldB3);
                        iArr = iArr;
                        i11 = i11;
                        i24 = i109;
                        i84 = i105;
                        iObjectFieldOffset2 = iObjectFieldOffset6;
                        i25 = iObjectFieldOffset5;
                    } else {
                        i23 = iCharAt9;
                        int i110 = i81 + 1;
                        Field fieldB4 = iv8.B(cls2, (String) objArr2[i81]);
                        if (i96 == 9 || i96 == 17) {
                            int i111 = i85 / 3;
                            objArr[i111 + i111 + 1] = fieldB4.getType();
                        } else {
                            if (i96 != 27) {
                                if (i96 == 49) {
                                    i81 += 2;
                                    i28 = 1;
                                } else if (i96 == 12 || i96 == 30 || i96 == 44) {
                                    iArr = iArr;
                                    if (pv8Var.a() == 1 || i98 != 0) {
                                        i81 += 2;
                                        int i112 = i85 / 3;
                                        objArr[i112 + i112 + 1] = objArr2[i110];
                                        i11 = i11;
                                        i24 = i98;
                                    } else {
                                        i11 = i11;
                                        i81 = i110;
                                        i24 = 0;
                                    }
                                } else if (i96 == 50) {
                                    int i113 = i81 + 2;
                                    i82++;
                                    iArr[i82] = i85;
                                    int i114 = i85 / 3;
                                    int i115 = i114 + i114;
                                    objArr[i115] = objArr2[i110];
                                    if (i98 != 0) {
                                        i81 += 3;
                                        objArr[i115 + 1] = objArr2[i113];
                                        i24 = i98;
                                    } else {
                                        i81 = i113;
                                        i24 = 0;
                                    }
                                    iArr = iArr;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i96 > 17) {
                                    i84 = i22;
                                    i25 = iObjectFieldOffset;
                                } else {
                                    int i116 = i22 + 1;
                                    int iCharAt12 = str.charAt(i22);
                                    if (iCharAt12 >= 55296) {
                                        int i117 = iCharAt12 & 8191;
                                        int i118 = 13;
                                        while (true) {
                                            i27 = i116 + 1;
                                            cCharAt8 = str.charAt(i116);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i117 |= (cCharAt8 & 8191) << i118;
                                            i118 += 13;
                                            i116 = i27;
                                        }
                                        iCharAt12 = i117 | (cCharAt8 << i118);
                                        i116 = i27;
                                    }
                                    int i119 = (iCharAt12 / 32) + i80 + i80;
                                    Object obj4 = objArr2[i119];
                                    str = str;
                                    if (obj4 instanceof Field) {
                                        fieldB = (Field) obj4;
                                    } else {
                                        fieldB = iv8.B(cls2, (String) obj4);
                                        objArr2[i119] = fieldB;
                                    }
                                    cls2 = cls2;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB);
                                    i26 = iCharAt12 % 32;
                                    i25 = iObjectFieldOffset;
                                    i84 = i116;
                                }
                                int i120 = i85 + 1;
                                iArr3[i85] = i23;
                                int i121 = i85 + 2;
                                Unsafe unsafe2 = unsafe;
                                if ((iCharAt10 & 512) != 0) {
                                    i29 = 536870912;
                                } else {
                                    i29 = 0;
                                }
                                if ((iCharAt10 & 256) != 0) {
                                    i30 = 268435456;
                                } else {
                                    i30 = 0;
                                }
                                if (i24 != 0) {
                                    i31 = Integer.MIN_VALUE;
                                } else {
                                    i31 = 0;
                                }
                                iArr3[i120] = i29 | i30 | i31 | (i96 << 20) | i25;
                                i85 += 3;
                                iArr3[i121] = (i26 << 20) | iObjectFieldOffset2;
                                length = i88;
                                i11 = i11;
                                iArr2 = iArr3;
                                i12 = i97;
                                objArr3 = objArr;
                                cls2 = cls2;
                                iArr = iArr;
                                str = str;
                                unsafe = unsafe2;
                            } else {
                                i28 = 1;
                                i81 += 2;
                            }
                            int i122 = i85 / 3;
                            objArr[i122 + i122 + i28] = objArr2[i110];
                            i11 = i11;
                            i24 = i98;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                            }
                            i84 = i22;
                            i25 = iObjectFieldOffset;
                        }
                        i11 = i11;
                        i24 = i98;
                        i81 = i110;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                        }
                        i84 = i22;
                        i25 = iObjectFieldOffset;
                    }
                    i26 = 0;
                    int i123 = i85 + 1;
                    iArr3[i85] = i23;
                    int i124 = i85 + 2;
                    Unsafe unsafe3 = unsafe;
                    if ((iCharAt10 & 512) != 0) {
                        i29 = 536870912;
                    } else {
                        i29 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i30 = 268435456;
                    } else {
                        i30 = 0;
                    }
                    if (i24 != 0) {
                        i31 = Integer.MIN_VALUE;
                    } else {
                        i31 = 0;
                    }
                    iArr3[i123] = i29 | i30 | i31 | (i96 << 20) | i25;
                    i85 += 3;
                    iArr3[i124] = (i26 << 20) | iObjectFieldOffset2;
                    length = i88;
                    i11 = i11;
                    iArr2 = iArr3;
                    i12 = i97;
                    objArr3 = objArr;
                    cls2 = cls2;
                    iArr = iArr;
                    str = str;
                    unsafe = unsafe3;
                }
                iv8Var = new iv8(iArr2, objArr3, i9, i12, pv8Var.a, iArr, i11, i78, rk5Var2, wj5Var2);
            }
            qv8 qv8Var = (qv8) concurrentHashMap.putIfAbsent(cls, iv8Var);
            return qv8Var != null ? qv8Var : iv8Var;
        } catch (Exception e) {
            an4.n("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
