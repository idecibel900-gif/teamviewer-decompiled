package o;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a95 implements n36 {
    public static float d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void e(int i, i70 i70Var, int[] iArr) throws d55 {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i3 = i70Var.n;
        if (i >= i3) {
            throw d55.a();
        }
        boolean z = !i70Var.a(i);
        while (i < i3) {
            if (i70Var.a(i) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != i3) {
                throw d55.a();
            }
        }
    }

    public static void f(int i, i70 i70Var, int[] iArr) throws d55 {
        int length = iArr.length;
        boolean zA = i70Var.a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (i70Var.a(i) != zA) {
                length--;
                zA = !zA;
            }
        }
        if (length >= 0) {
            throw d55.a();
        }
        e(i + 1, i70Var, iArr);
    }

    @Override // o.n36
    public uc6 a(cj3 cj3Var, Map map) throws d55 {
        try {
            return c(cj3Var, map);
        } catch (d55 e) {
            if (map == null || !map.containsKey(pi1.TRY_HARDER) || !((hm2) ((j93) cj3Var.n).n).g()) {
                throw e;
            }
            hm2 hm2VarH = ((hm2) ((j93) cj3Var.n).n).h();
            uc6 uc6VarC = c(new cj3((Object) new j93(hm2VarH), (byte) 25), map);
            Map map2 = uc6VarC.e;
            vc6 vc6Var = vc6.m;
            int iIntValue = 270;
            if (map2 != null && map2.containsKey(vc6Var)) {
                iIntValue = (((Integer) map2.get(vc6Var)).intValue() + 270) % 360;
            }
            uc6VarC.b(vc6Var, Integer.valueOf(iIntValue));
            wc6[] wc6VarArr = uc6VarC.c;
            if (wc6VarArr != null) {
                int i = hm2VarH.c;
                for (int i2 = 0; i2 < wc6VarArr.length; i2++) {
                    wc6 wc6Var = wc6VarArr[i2];
                    wc6VarArr[i2] = new wc6((i - wc6Var.b) - 1.0f, wc6Var.a);
                }
            }
            return uc6VarC;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8 A[FALL_THROUGH, PHI: r25 r26
      0x01e8: PHI (r25v20 int) = 
      (r25v3 int)
      (r25v3 int)
      (r25v3 int)
      (r25v3 int)
      (r25v2 int)
      (r25v7 int)
      (r25v7 int)
      (r25v7 int)
      (r25v7 int)
      (r25v17 int)
      (r25v17 int)
      (r25v17 int)
      (r25v17 int)
      (r25v2 int)
     binds: [B:131:0x01f3, B:139:0x0209, B:143:0x0215, B:142:0x0211, B:125:0x01e5, B:100:0x01a4, B:108:0x01ba, B:112:0x01c6, B:111:0x01c2, B:69:0x0136, B:77:0x014d, B:81:0x015a, B:80:0x0155, B:54:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r26v13 int) = 
      (r26v1 int)
      (r26v3 int)
      (r26v3 int)
      (r26v3 int)
      (r26v1 int)
      (r26v1 int)
      (r26v6 int)
      (r26v6 int)
      (r26v6 int)
      (r26v1 int)
      (r26v10 int)
      (r26v10 int)
      (r26v10 int)
      (r26v1 int)
     binds: [B:131:0x01f3, B:139:0x0209, B:143:0x0215, B:142:0x0211, B:125:0x01e5, B:100:0x01a4, B:108:0x01ba, B:112:0x01c6, B:111:0x01c2, B:69:0x0136, B:77:0x014d, B:81:0x015a, B:80:0x0155, B:54:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:138:0x0207  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:144:0x021b A[PHI: r25
      0x021b: PHI (r25v5 int) = (r25v3 int), (r25v7 int) binds: [B:131:0x01f3, B:100:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0220 A[PHI: r25
      0x0220: PHI (r25v10 int) = (r25v3 int), (r25v17 int) binds: [B:131:0x01f3, B:69:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0225 A[PHI: r25
      0x0225: PHI (r25v9 int) = (r25v3 int), (r25v7 int), (r25v17 int) binds: [B:130:0x01f1, B:99:0x01a2, B:68:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x022d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:199:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[LOOP:4: B:49:0x00ed->B:50:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:81:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0165 A[PHI: r25
      0x0165: PHI (r25v16 int) = (r25v7 int), (r25v17 int) binds: [B:114:0x01ce, B:83:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x016f A[PHI: r25
      0x016f: PHI (r25v15 int) = (r25v7 int), (r25v17 int) binds: [B:117:0x01d3, B:86:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0175 A[PHI: r25
      0x0175: PHI (r25v14 int) = (r25v7 int), (r25v7 int), (r25v17 int), (r25v17 int) binds: [B:116:0x01d1, B:117:0x01d3, B:85:0x016b, B:86:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x017a A[PHI: r25
      0x017a: PHI (r25v13 int) = (r25v7 int), (r25v17 int) binds: [B:100:0x01a4, B:69:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183 A[PHI: r25
      0x0183: PHI (r25v11 int) = (r25v7 int), (r25v17 int) binds: [B:100:0x01a4, B:69:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00fd. Please report as an issue. */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public o.uc6 b(int r30, o.i70 r31, java.util.Map r32) throws o.at2, o.d55, o.lq0 {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a95.b(int, o.i70, java.util.Map):o.uc6");
    }

    public final uc6 c(cj3 cj3Var, Map map) throws d55 {
        int i;
        cj3 cj3Var2 = cj3Var;
        Map map2 = map;
        hm2 hm2Var = (hm2) ((j93) cj3Var2.n).n;
        int i2 = hm2Var.b;
        int i3 = hm2Var.c;
        i70 i70Var = new i70(i2);
        int i4 = 1;
        boolean z = map2 != null && map2.containsKey(pi1.TRY_HARDER);
        int iMax = Math.max(1, i3 >> (z ? 8 : 5));
        int i5 = z ? i3 : 15;
        int i6 = i3 / 2;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if ((i7 & 1) != 0) {
                i9 = -i9;
            }
            int i10 = (i9 * iMax) + i6;
            if (i10 < 0 || i10 >= i3) {
                break;
            }
            try {
                i70Var = cj3Var2.E(i70Var, i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == i4) {
                        i70Var.e();
                        if (map2 != null) {
                            Object obj = pi1.NEED_RESULT_POINT_CALLBACK;
                            if (map2.containsKey(obj)) {
                                EnumMap enumMap = new EnumMap(pi1.class);
                                enumMap.putAll(map2);
                                enumMap.remove(obj);
                                map2 = enumMap;
                            }
                        }
                    }
                    try {
                        uc6 uc6VarB = b(i10, i70Var, map2);
                        if (i11 == i4) {
                            try {
                                uc6VarB.b(vc6.m, 180);
                                wc6[] wc6VarArr = uc6VarB.c;
                                if (wc6VarArr != null) {
                                    i = i4;
                                    float f = i2;
                                    try {
                                        wc6 wc6Var = wc6VarArr[0];
                                        try {
                                            wc6VarArr[0] = new wc6((f - wc6Var.a) - 1.0f, wc6Var.b);
                                            wc6 wc6Var2 = wc6VarArr[i];
                                            wc6VarArr[i] = new wc6((f - wc6Var2.a) - 1.0f, wc6Var2.b);
                                        } catch (p36 unused) {
                                            continue;
                                            i11++;
                                            map2 = map2;
                                            i4 = i;
                                        }
                                    } catch (p36 unused2) {
                                    }
                                }
                            } catch (p36 unused3) {
                                i = i4;
                            }
                        }
                        return uc6VarB;
                    } catch (p36 unused4) {
                        i = i4;
                    }
                }
            } catch (d55 unused5) {
            }
            cj3Var2 = cj3Var;
            i7 = i8;
            i4 = i4;
        }
        throw d55.a();
    }

    @Override // o.n36
    public void reset() {
    }
}
