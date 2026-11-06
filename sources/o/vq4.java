package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 implements cj6 {
    public static final int[] n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f2335o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final u1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final l35 j;
    public final hb4 k;
    public final j88 l;
    public final sm4 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new z88((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f2335o = unsafe;
    }

    public vq4(int[] iArr, Object[] objArr, int i, int i2, u1 u1Var, int[] iArr2, int i3, int i4, l35 l35Var, hb4 hb4Var, j88 j88Var, gg2 gg2Var, sm4 sm4Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = u1Var instanceof py2;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = l35Var;
        this.k = hb4Var;
        this.l = j88Var;
        this.e = u1Var;
        this.m = sm4Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbP = ua5.p("Field ", str, " for ");
            sbP.append(cls.getName());
            sbP.append(" not found. Known fields are ");
            sbP.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbP.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof py2) {
            return ((py2) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    public static vq4 w(w06 w06Var, l35 l35Var, hb4 hb4Var, j88 j88Var, gg2 gg2Var, sm4 sm4Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldF;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldF2;
        int i26;
        Object obj2;
        Field fieldF3;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(w06Var instanceof w06)) {
            io.sentry.h2.f();
            return null;
        }
        String str = w06Var.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = str.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = str.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = str.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = str.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt3;
            i33 = i57;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt9;
        }
        Object[] objArr = w06Var.c;
        Class<?> cls = w06Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = str.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                    length = i17;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i18 = i29;
            } else {
                i17 = length;
                i18 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i77 = i4;
            Unsafe unsafe = f2335o;
            if (i75 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i27 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        i28 = i79;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 = i28 | ((cCharAt10 & 8191) << i81);
                        i81 += 13;
                        i80 = i27;
                    }
                    iCharAt12 = i28 | (cCharAt10 << i81);
                    i23 = i27;
                } else {
                    i23 = i78;
                }
                int i82 = iCharAt12;
                int i83 = i75 - 51;
                int i84 = i23;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                } else {
                    if (i83 == 12 && (ua5.a(w06Var.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i24 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                    }
                    i25 = i82 * 2;
                    obj = objArr[i25];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr[i25] = fieldF2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                    i26 = i25 + 1;
                    obj2 = objArr[i26];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr[i26] = fieldF3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                    objArr2 = objArr2;
                    i20 = i84;
                    i21 = 0;
                }
                i6 = i24;
                i25 = i82 * 2;
                obj = objArr[i25];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i25] = fieldF2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                i26 = i25 + 1;
                obj2 = objArr[i26];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i26] = fieldF3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                objArr2 = objArr2;
                i20 = i84;
                i21 = 0;
            } else {
                int i85 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr[i6]);
                if (i75 == 9 || i75 == 17) {
                    i19 = i85;
                    objArr2[((i66 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i19 = i85;
                        if (w06Var.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr[i19];
                        }
                    } else if (i75 == 50) {
                        int i86 = i64 + 1;
                        iArr[i64] = i66;
                        int i87 = (i66 / 3) * 2;
                        i19 = i6 + 2;
                        objArr2[i87] = objArr[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i87 + 1] = objArr[i19];
                            i19 = i6 + 3;
                        }
                        i64 = i86;
                    } else {
                        i19 = i85;
                    }
                    i19 = i22;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    int i88 = i18 + 1;
                    int iCharAt13 = str.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i20 = i88 + 1;
                            cCharAt9 = str.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i20;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i20 = i88;
                    }
                    int i91 = (iCharAt13 / 32) + (i77 * 2);
                    Object obj3 = objArr[i91];
                    if (obj3 instanceof Field) {
                        fieldF = (Field) obj3;
                    } else {
                        fieldF = F(cls, (String) obj3);
                        objArr[i91] = fieldF;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                    i21 = iCharAt13 % 32;
                }
                if (i75 < 18 || i75 > 49) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                } else {
                    iArr[i63] = iObjectFieldOffset;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i63++;
                }
                i6 = i19;
            }
            int i92 = i66 + 1;
            iArr3[i66] = i76;
            int i93 = i66 + 2;
            String str2 = str;
            iArr3[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i93] = (i21 << 20) | iObjectFieldOffset3;
            objArr2 = objArr2;
            str = str2;
            i33 = i20;
            length = i17;
            i4 = i77;
            iArr3 = iArr3;
            i62 = i62;
            c = 55296;
        }
        return new vq4(iArr3, objArr2, i2, i5, w06Var.a, iArr, i7, i62, l35Var, hb4Var, j88Var, gg2Var, sm4Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) e98.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) e98.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, xu0 xu0Var, cj6 cj6Var, eg2 eg2Var) throws pm3.a {
        int iB;
        this.k.getClass();
        rl3 rl3VarA = hb4.a(j, obj);
        uu0 uu0Var = xu0Var.a;
        int i = xu0Var.b;
        if ((i & 7) != 3) {
            throw pm3.b();
        }
        do {
            py2 py2VarC = cj6Var.c();
            xu0Var.b(py2VarC, cj6Var, eg2Var);
            cj6Var.a(py2VarC);
            ((xw5) rl3VarA).add(py2VarC);
            if (uu0Var.e() || xu0Var.d != 0) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == i);
        xu0Var.d = iB;
    }

    public final void C(Object obj, int i, xu0 xu0Var, cj6 cj6Var, eg2 eg2Var) throws pm3 {
        int iB;
        this.k.getClass();
        rl3 rl3VarA = hb4.a(i & 1048575, obj);
        uu0 uu0Var = xu0Var.a;
        int i2 = xu0Var.b;
        if ((i2 & 7) != 2) {
            throw pm3.b();
        }
        do {
            py2 py2VarC = cj6Var.c();
            xu0Var.c(py2VarC, cj6Var, eg2Var);
            cj6Var.a(py2VarC);
            ((xw5) rl3VarA).add(py2VarC);
            if (uu0Var.e() || xu0Var.d != 0) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == i2);
        xu0Var.d = iB;
    }

    public final void D(int i, Object obj, xu0 xu0Var) throws pm3.a {
        uu0 uu0Var = xu0Var.a;
        if ((536870912 & i) != 0) {
            xu0Var.w(2);
            e98.o(i & 1048575, obj, uu0Var.A());
        } else if (!this.f) {
            e98.o(i & 1048575, obj, xu0Var.e());
        } else {
            xu0Var.w(2);
            e98.o(i & 1048575, obj, uu0Var.z());
        }
    }

    public final void E(int i, Object obj, xu0 xu0Var) throws pm3.a {
        boolean z = (536870912 & i) != 0;
        hb4 hb4Var = this.k;
        if (z) {
            hb4Var.getClass();
            xu0Var.s(hb4.a(i & 1048575, obj), true);
        } else {
            hb4Var.getClass();
            xu0Var.s(hb4.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        e98.m((1 << (i2 >>> 20)) | e98.f(j, obj), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        e98.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[SYNTHETIC] */
    @Override // o.cj6
    public final void a(Object obj) {
        if (p(obj)) {
            if (obj instanceof py2) {
                py2 py2Var = (py2) obj;
                py2Var.k(Integer.MAX_VALUE);
                py2Var.memoizedHashCode = 0;
                py2Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iJ = J(i);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = f2335o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (n(i, obj)) {
                                    m(i).a(unsafe.getObject(obj, j));
                                }
                                break;
                            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.k.getClass();
                                xw5 xw5Var = (xw5) ((rl3) e98.h(j, obj));
                                if (xw5Var.m) {
                                    xw5Var.m = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((qm4) object).m = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).a(unsafe.getObject(obj, j));
                    }
                } else if (n(i, obj)) {
                    m(i).a(unsafe.getObject(obj, j));
                }
            }
            ((n88) this.l).getClass();
            l88 l88Var = ((py2) obj).unknownFields;
            if (l88Var.e) {
                l88Var.e = false;
            }
        }
    }

    @Override // o.cj6
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iJ = J(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f2335o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iJ) == 0 || o(obj, i6, i, i2, i10)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i7, i6, obj) || m(i6).b(e98.h(iJ & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objH = e98.h(iJ & 1048575, obj);
                                this.m.getClass();
                                qm4 qm4Var = (qm4) objH;
                                if (qm4Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((zl8) ((mm4) this.b[(i6 / 3) * 2]).a.f733o).m != bm8.u) {
                                        continue;
                                    } else {
                                        cj6 cj6VarA = null;
                                        for (Object obj2 : qm4Var.values()) {
                                            if (cj6VarA == null) {
                                                cj6VarA = vw5.c.a(obj2.getClass());
                                            }
                                            if (!cj6VarA.b(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) e98.h(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        cj6 cj6VarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (cj6VarM.b(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!o(obj, i6, i, i2, i10) || m(i6).b(e98.h(iJ & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // o.cj6
    public final py2 c() {
        this.j.getClass();
        return ((py2) this.e).i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // o.cj6
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            an4.i(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                hj6.k(this.l, obj, obj2);
                return;
            }
            int iJ = J(i);
            long j = 1048575 & iJ;
            int i2 = iArr[i];
            switch (I(iJ)) {
                case 0:
                    if (!n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        c98 c98Var = e98.c;
                        obj3 = obj;
                        c98Var.g(obj3, j, c98Var.c(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (n(i, obj2)) {
                        c98 c98Var2 = e98.c;
                        c98Var2.h(obj, j, c98Var2.d(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        e98.n(obj, j, e98.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        e98.n(obj, j, e98.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        e98.n(obj, j, e98.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        c98 c98Var3 = e98.c;
                        c98Var3.e(obj, j, c98Var3.a(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        e98.o(j, obj, e98.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ep1.b /* 9 */:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case ep1.c /* 10 */:
                    if (n(i, obj2)) {
                        e98.o(j, obj, e98.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ep1.d /* 12 */:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        e98.n(obj, j, e98.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        e98.m(e98.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (n(i, obj2)) {
                        e98.n(obj, j, e98.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.k.getClass();
                    rl3 rl3VarC = (rl3) e98.h(j, obj);
                    rl3 rl3Var = (rl3) e98.h(j, obj2);
                    int i3 = ((xw5) rl3VarC).f2558o;
                    int i4 = ((xw5) rl3Var).f2558o;
                    if (i3 > 0 && i4 > 0) {
                        if (!((xw5) rl3VarC).m) {
                            rl3VarC = ((xw5) rl3VarC).c(i4 + i3);
                        }
                        ((xw5) rl3VarC).addAll(rl3Var);
                    }
                    if (i3 > 0) {
                        rl3Var = rl3VarC;
                    }
                    e98.o(j, obj, rl3Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = hj6.a;
                    Object objH = e98.h(j, obj);
                    Object objH2 = e98.h(j, obj2);
                    this.m.getClass();
                    e98.o(j, obj, sm4.a(objH, objH2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i2, i, obj2)) {
                        e98.o(j, obj, e98.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        e98.o(j, obj, e98.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // o.cj6
    public final boolean e(py2 py2Var, py2 py2Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iJ = J(i);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!j(py2Var, py2Var2, i)) {
                            zL = false;
                        } else {
                            c98 c98Var = e98.c;
                            if (Double.doubleToLongBits(c98Var.c(j, py2Var)) != Double.doubleToLongBits(c98Var.c(j, py2Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(py2Var, py2Var2, i)) {
                            zL = false;
                        } else {
                            c98 c98Var2 = e98.c;
                            if (Float.floatToIntBits(c98Var2.d(j, py2Var)) != Float.floatToIntBits(c98Var2.d(j, py2Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(py2Var, py2Var2, i) || e98.g(j, py2Var) != e98.g(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 3:
                        if (!j(py2Var, py2Var2, i) || e98.g(j, py2Var) != e98.g(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 4:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 5:
                        if (!j(py2Var, py2Var2, i) || e98.g(j, py2Var) != e98.g(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 6:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 7:
                        if (!j(py2Var, py2Var2, i)) {
                            zL = false;
                        } else {
                            c98 c98Var3 = e98.c;
                            if (c98Var3.a(j, py2Var) != c98Var3.a(j, py2Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(py2Var, py2Var2, i) || !hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2))) {
                            zL = false;
                        }
                        break;
                    case ep1.b /* 9 */:
                        if (!j(py2Var, py2Var2, i) || !hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2))) {
                            zL = false;
                        }
                        break;
                    case ep1.c /* 10 */:
                        if (!j(py2Var, py2Var2, i) || !hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2))) {
                            zL = false;
                        }
                        break;
                    case 11:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case ep1.d /* 12 */:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 13:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 14:
                        if (!j(py2Var, py2Var2, i) || e98.g(j, py2Var) != e98.g(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 15:
                        if (!j(py2Var, py2Var2, i) || e98.f(j, py2Var) != e98.f(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        if (!j(py2Var, py2Var2, i) || e98.g(j, py2Var) != e98.g(j, py2Var2)) {
                            zL = false;
                        }
                        break;
                    case 17:
                        if (!j(py2Var, py2Var2, i) || !hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2))) {
                            zL = false;
                        }
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zL = hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2));
                        break;
                    case 50:
                        zL = hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (e98.f(j2, py2Var) != e98.f(j2, py2Var2) || !hj6.l(e98.h(j, py2Var), e98.h(j, py2Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                n88 n88Var = (n88) this.l;
                n88Var.getClass();
                l88 l88Var = py2Var.unknownFields;
                n88Var.getClass();
                if (l88Var.equals(py2Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x0307  */
    /* JADX WARN: Code duplicated, block: B:122:0x0314  */
    /* JADX WARN: Code duplicated, block: B:124:0x0327  */
    /* JADX WARN: Code duplicated, block: B:125:0x0337  */
    /* JADX WARN: Code duplicated, block: B:127:0x0341  */
    /* JADX WARN: Code duplicated, block: B:129:0x034b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0359  */
    /* JADX WARN: Code duplicated, block: B:131:0x0366  */
    /* JADX WARN: Code duplicated, block: B:133:0x036b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0378  */
    /* JADX WARN: Code duplicated, block: B:136:0x0380  */
    /* JADX WARN: Code duplicated, block: B:137:0x038f  */
    /* JADX WARN: Code duplicated, block: B:138:0x039b  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:278:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.cj6
    public final void f(Object obj, xc0 xc0Var) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int iJ;
        int size;
        int i5;
        int iA;
        int i6;
        int i7;
        int iH;
        int iJ2;
        int size2;
        int i8;
        vq4 vq4Var = this;
        xc0Var.getClass();
        bv0 bv0Var = (bv0) xc0Var.n;
        int[] iArr = vq4Var.a;
        int length = iArr.length;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int iJ3 = vq4Var.J(i11);
            int i13 = iArr[i11];
            int I = I(iJ3);
            Unsafe unsafe = f2335o;
            if (I <= 17) {
                int i14 = iArr[i11 + 2];
                i = 1;
                int i15 = i14 & i9;
                if (i15 != i10) {
                    i12 = i15 == i9 ? 0 : unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i2 = 1 << (i14 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iJ3 & i9;
            switch (I) {
                case 0:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.t(i13, Double.doubleToRawLongBits(e98.c.c(j, obj)));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 1:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.r(i13, Float.floatToRawIntBits(e98.c.d(j, obj)));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 2:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.E(i13, unsafe.getLong(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 3:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.E(i13, unsafe.getLong(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 4:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.v(i13, unsafe.getInt(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 5:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.t(i13, unsafe.getLong(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 6:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.r(i13, unsafe.getInt(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 7:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.o(i13, e98.c.a(j, obj));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 8:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            bv0Var.z(i13, (String) object);
                        } else {
                            bv0Var.p(i13, (wh0) object);
                        }
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case ep1.b /* 9 */:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.y(i13, (u1) unsafe.getObject(obj, j), vq4Var.m(i11));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case ep1.c /* 10 */:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.p(i13, (wh0) unsafe.getObject(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 11:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.C(i13, unsafe.getInt(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case ep1.d /* 12 */:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.v(i13, unsafe.getInt(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 13:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.r(i13, unsafe.getInt(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 14:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        bv0Var.t(i13, unsafe.getLong(obj, j));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 15:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        int i16 = unsafe.getInt(obj, j);
                        bv0Var.C(i13, (i16 >> 31) ^ (i16 << 1));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        bv0Var.E(i13, (j2 >> 63) ^ (j2 << 1));
                    }
                    vq4Var = this;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 17:
                    if (vq4Var.o(obj, i11, i10, i12, i2)) {
                        xc0Var.W(i13, unsafe.getObject(obj, j), vq4Var.m(i11));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    i10 = i10;
                    i12 = i12;
                    hj6.n(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    i10 = i10;
                    i12 = i12;
                    hj6.r(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 20:
                    i10 = i10;
                    i12 = i12;
                    hj6.t(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 21:
                    i10 = i10;
                    i12 = i12;
                    hj6.z(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 22:
                    i10 = i10;
                    i12 = i12;
                    hj6.s(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 23:
                    i10 = i10;
                    i12 = i12;
                    hj6.q(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 24:
                    i10 = i10;
                    i12 = i12;
                    hj6.p(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 25:
                    i10 = i10;
                    i12 = i12;
                    hj6.m(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 26:
                    i3 = i10;
                    i4 = i12;
                    int i17 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = hj6.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            bv0Var.z(i17, (String) list.get(i18));
                        }
                    }
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 27:
                    i3 = i10;
                    i4 = i12;
                    int i19 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j);
                    cj6 cj6VarM = vq4Var.m(i11);
                    Class cls2 = hj6.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            bv0Var.y(i19, (u1) list2.get(i20), cj6VarM);
                        }
                    }
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 28:
                    i3 = i10;
                    i4 = i12;
                    int i21 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = hj6.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            bv0Var.p(i21, (wh0) list3.get(i22));
                        }
                    }
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 29:
                    z = false;
                    hj6.y(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 30:
                    z = false;
                    hj6.o(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 31:
                    z = false;
                    hj6.u(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 32:
                    z = false;
                    hj6.v(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 33:
                    z = false;
                    hj6.w(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 34:
                    z = false;
                    hj6.x(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, false);
                    i10 = i10;
                    i12 = i12;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 35:
                    i3 = i10;
                    i4 = i12;
                    hj6.n(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 36:
                    i3 = i10;
                    i4 = i12;
                    hj6.r(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 37:
                    i3 = i10;
                    i4 = i12;
                    hj6.t(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 38:
                    i3 = i10;
                    i4 = i12;
                    hj6.z(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 39:
                    i3 = i10;
                    i4 = i12;
                    hj6.s(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 40:
                    i3 = i10;
                    i4 = i12;
                    hj6.q(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 41:
                    i3 = i10;
                    i4 = i12;
                    hj6.p(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 42:
                    i3 = i10;
                    i4 = i12;
                    hj6.m(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 43:
                    i3 = i10;
                    i4 = i12;
                    hj6.y(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 44:
                    i3 = i10;
                    i4 = i12;
                    hj6.o(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 45:
                    i3 = i10;
                    i4 = i12;
                    hj6.u(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 46:
                    i3 = i10;
                    i4 = i12;
                    hj6.v(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 47:
                    i3 = i10;
                    i4 = i12;
                    hj6.w(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, i);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 48:
                    i3 = i10;
                    i4 = i12;
                    hj6.x(iArr[i11], (List) unsafe.getObject(obj, j), xc0Var, true);
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 49:
                    i3 = i10;
                    i4 = i12;
                    int i23 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j);
                    cj6 cj6VarM2 = vq4Var.m(i11);
                    Class cls4 = hj6.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            xc0Var.W(i23, list4.get(i24), cj6VarM2);
                        }
                    }
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i25 = 2;
                        Object obj2 = vq4Var.b[(i11 / 3) * 2];
                        vq4Var.m.getClass();
                        ep3 ep3Var = ((mm4) obj2).a;
                        zl8 zl8Var = (zl8) ep3Var.f733o;
                        zl8 zl8Var2 = (zl8) ep3Var.n;
                        Iterator it = ((qm4) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            bv0Var.B(i13, i25);
                            Object key = entry.getKey();
                            int i26 = i25;
                            Object value = entry.getValue();
                            int i27 = dj2.c;
                            int iH2 = bv0.h(i);
                            int i28 = i10;
                            tl8 tl8Var = zl8.p;
                            if (zl8Var2 == tl8Var) {
                                iH2 *= 2;
                            }
                            int i29 = i12;
                            switch (zl8Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iJ = 8;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key2);
                                            dj2.b(bv0Var, zl8Var, i26, value2);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key3);
                                            dj2.b(bv0Var, zl8Var, i26, value3);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key4);
                                            dj2.b(bv0Var, zl8Var, i26, value4);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key5);
                                            dj2.b(bv0Var, zl8Var, i26, value5);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key6);
                                            dj2.b(bv0Var, zl8Var, i26, value6);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key7);
                                            dj2.b(bv0Var, zl8Var, i26, value7);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key8);
                                            dj2.b(bv0Var, zl8Var, i26, value8);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key9);
                                            dj2.b(bv0Var, zl8Var, i26, value9);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key10);
                                            dj2.b(bv0Var, zl8Var, i26, value10);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11);
                                            dj2.b(bv0Var, zl8Var, i26, value11);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key12);
                                            dj2.b(bv0Var, zl8Var, i26, value12);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key13);
                                            dj2.b(bv0Var, zl8Var, i26, value13);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key14);
                                            dj2.b(bv0Var, zl8Var, i26, value14);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key15);
                                            dj2.b(bv0Var, zl8Var, i26, value15);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key16);
                                            dj2.b(bv0Var, zl8Var, i26, value16);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key17);
                                            dj2.b(bv0Var, zl8Var, i26, value17);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue >> 31) ^ (iIntValue << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key18);
                                            dj2.b(bv0Var, zl8Var, i26, value18);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue << i) ^ (jLongValue >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key19);
                                            dj2.b(bv0Var, zl8Var, i26, value19);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iJ = 4;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key110);
                                            dj2.b(bv0Var, zl8Var, i26, value110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111);
                                            dj2.b(bv0Var, zl8Var, i26, value111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key112);
                                            dj2.b(bv0Var, zl8Var, i26, value112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key113);
                                            dj2.b(bv0Var, zl8Var, i26, value113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key114);
                                            dj2.b(bv0Var, zl8Var, i26, value114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key115);
                                            dj2.b(bv0Var, zl8Var, i26, value115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key116);
                                            dj2.b(bv0Var, zl8Var, i26, value116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key117);
                                            dj2.b(bv0Var, zl8Var, i26, value117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key118);
                                            dj2.b(bv0Var, zl8Var, i26, value118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key119);
                                            dj2.b(bv0Var, zl8Var, i26, value119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1110);
                                            dj2.b(bv0Var, zl8Var, i26, value1110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1112);
                                            dj2.b(bv0Var, zl8Var, i26, value1112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1113);
                                            dj2.b(bv0Var, zl8Var, i26, value1113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1114);
                                            dj2.b(bv0Var, zl8Var, i26, value1114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1115);
                                            dj2.b(bv0Var, zl8Var, i26, value1115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1116);
                                            dj2.b(bv0Var, zl8Var, i26, value1116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue2 << i) ^ (jLongValue2 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1117);
                                            dj2.b(bv0Var, zl8Var, i26, value1117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 2:
                                    it = it;
                                    iJ = bv0.j(((Long) key).longValue());
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1118);
                                            dj2.b(bv0Var, zl8Var, i26, value1118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1119);
                                            dj2.b(bv0Var, zl8Var, i26, value1119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11110);
                                            dj2.b(bv0Var, zl8Var, i26, value11110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11112);
                                            dj2.b(bv0Var, zl8Var, i26, value11112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11113);
                                            dj2.b(bv0Var, zl8Var, i26, value11113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11114);
                                            dj2.b(bv0Var, zl8Var, i26, value11114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11115);
                                            dj2.b(bv0Var, zl8Var, i26, value11115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11116);
                                            dj2.b(bv0Var, zl8Var, i26, value11116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11117);
                                            dj2.b(bv0Var, zl8Var, i26, value11117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11118);
                                            dj2.b(bv0Var, zl8Var, i26, value11118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11119);
                                            dj2.b(bv0Var, zl8Var, i26, value11119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue3 << i) ^ (jLongValue3 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 3:
                                    it = it;
                                    iJ = bv0.j(((Long) key).longValue());
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue4 << i) ^ (jLongValue4 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 4:
                                    it = it;
                                    iJ = bv0.j(((Integer) key).intValue());
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue5 << i) ^ (jLongValue5 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iJ = 8;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue6 << i) ^ (jLongValue6 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iJ = 4;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue7 << i) ^ (jLongValue7 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 7:
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iJ = i;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue8 << i) ^ (jLongValue8 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 8:
                                    it = it;
                                    if (key instanceof wh0) {
                                        size = ((wh0) key).size();
                                        i5 = bv0.i(size);
                                        iJ = size + i5;
                                    } else {
                                        iJ = bv0.g((String) key);
                                    }
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue9 << i) ^ (jLongValue9 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case ep1.b /* 9 */:
                                    iA = ((py2) ((u1) key)).a(null);
                                    iJ = iA;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue10 << i) ^ (jLongValue10 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case ep1.c /* 10 */:
                                    int iA2 = ((py2) ((u1) key)).a(null);
                                    iA = iA2 + bv0.i(iA2);
                                    iJ = iA;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue11 << i) ^ (jLongValue11 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 11:
                                    it = it;
                                    if (key instanceof wh0) {
                                        size = ((wh0) key).size();
                                        i5 = bv0.i(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        i5 = bv0.i(size);
                                    }
                                    iJ = size + i5;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue12 << i) ^ (jLongValue12 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case ep1.d /* 12 */:
                                    it = it;
                                    iJ = bv0.i(((Integer) key).intValue());
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue13 << i) ^ (jLongValue13 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 13:
                                    it = it;
                                    iJ = bv0.j(((Integer) key).intValue());
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue14 << i) ^ (jLongValue14 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iJ = 4;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue15 << i) ^ (jLongValue15 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iJ = 8;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue16 << i) ^ (jLongValue16 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    i6 = bv0.i((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    it = it;
                                    iJ = i6;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue17 << i) ^ (jLongValue17 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    i6 = bv0.j((jLongValue18 << i) ^ (jLongValue18 >> 63));
                                    it = it;
                                    iJ = i6;
                                    i7 = iJ + iH2;
                                    iH = bv0.h(i26);
                                    if (zl8Var == tl8Var) {
                                        iH *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key1111111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value1111111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 2:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 3:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Long) value).longValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 4:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 7:
                                            i7 = i7;
                                            ((Boolean) value).getClass();
                                            iJ2 = i;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 8:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                                iJ2 = size2 + i8;
                                            } else {
                                                iJ2 = bv0.g((String) value);
                                            }
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111116);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111116);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.b /* 9 */:
                                            i7 = i7;
                                            iJ2 = ((py2) ((u1) value)).a(null);
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111117);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111117);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.c /* 10 */:
                                            i7 = i7;
                                            size2 = ((py2) ((u1) value)).a(null);
                                            i8 = bv0.i(size2);
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111118);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111118);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 11:
                                            i7 = i7;
                                            if (value instanceof wh0) {
                                                size2 = ((wh0) value).size();
                                                i8 = bv0.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i8 = bv0.i(size2);
                                            }
                                            iJ2 = size2 + i8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key11111111111111111111111111111119);
                                            dj2.b(bv0Var, zl8Var, i26, value11111111111111111111111111111119);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case ep1.d /* 12 */:
                                            i7 = i7;
                                            iJ2 = bv0.i(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111110);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111110);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 13:
                                            i7 = i7;
                                            iJ2 = bv0.j(((Integer) value).intValue());
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111111);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111111);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111112);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111112);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111113);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111113);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iJ2 = bv0.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111114);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111114);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iJ2 = bv0.j((jLongValue19 << i) ^ (jLongValue19 >> 63));
                                            i7 = i7;
                                            bv0Var.D(iJ2 + iH + i7);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            dj2.b(bv0Var, zl8Var2, i, key111111111111111111111111111111115);
                                            dj2.b(bv0Var, zl8Var, i26, value111111111111111111111111111111115);
                                            i25 = i26;
                                            i10 = i28;
                                            it = it;
                                            i12 = i29;
                                            i = 1;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                default:
                                    hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    }
                    i3 = i10;
                    i4 = i12;
                    i10 = i3;
                    i12 = i4;
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 51:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.t(i13, Double.doubleToRawLongBits(((Double) e98.h(j, obj)).doubleValue()));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 52:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.r(i13, Float.floatToRawIntBits(((Float) e98.h(j, obj)).floatValue()));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 53:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.E(i13, z(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 54:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.E(i13, z(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 55:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.v(i13, y(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 56:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.t(i13, z(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 57:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.r(i13, y(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 58:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.o(i13, ((Boolean) e98.h(j, obj)).booleanValue());
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 59:
                    if (vq4Var.q(i13, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            bv0Var.z(i13, (String) object3);
                        } else {
                            bv0Var.p(i13, (wh0) object3);
                        }
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 60:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.y(i13, (u1) unsafe.getObject(obj, j), vq4Var.m(i11));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 61:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.p(i13, (wh0) unsafe.getObject(obj, j));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 62:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.C(i13, y(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 63:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.v(i13, y(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 64:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.r(i13, y(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 65:
                    if (vq4Var.q(i13, i11, obj)) {
                        bv0Var.t(i13, z(j, obj));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 66:
                    if (vq4Var.q(i13, i11, obj)) {
                        int iY = y(j, obj);
                        bv0Var.C(i13, (iY >> 31) ^ (iY << 1));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 67:
                    if (vq4Var.q(i13, i11, obj)) {
                        long jZ = z(j, obj);
                        bv0Var.E(i13, (jZ << i) ^ (jZ >> 63));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                case 68:
                    if (vq4Var.q(i13, i11, obj)) {
                        xc0Var.W(i13, unsafe.getObject(obj, j), vq4Var.m(i11));
                    }
                    i11 += 3;
                    i9 = 1048575;
                    break;
                default:
                    i11 += 3;
                    i9 = 1048575;
                    break;
            }
            return;
        }
        ((n88) vq4Var.l).getClass();
        ((py2) obj).unknownFields.d(xc0Var);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x07ee A[Catch: all -> 0x04e0, TryCatch #1 {all -> 0x04e0, blocks: (B:158:0x07e9, B:160:0x07ee, B:161:0x07f3, B:114:0x04db, B:117:0x04e3, B:118:0x04fb, B:119:0x0513, B:120:0x052b, B:121:0x0543, B:122:0x055b, B:123:0x0573, B:124:0x058b, B:125:0x05a3, B:126:0x05cb, B:127:0x05e9, B:128:0x0607, B:129:0x0626, B:130:0x0645, B:131:0x0666, B:132:0x0684, B:133:0x069d, B:134:0x06c5, B:135:0x06d6, B:136:0x06f6, B:137:0x0715, B:138:0x0734, B:139:0x0752, B:140:0x0770, B:141:0x078d, B:142:0x07ad, B:148:0x07cd), top: B:181:0x07e9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x07fd A[LOOP:2: B:164:0x07fb->B:165:0x07fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0814 A[LOOP:3: B:170:0x0812->B:171:0x0814, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x081e  */
    /* JADX WARN: Code duplicated, block: B:208:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // o.cj6
    public final void g(Object obj, xu0 xu0Var, eg2 eg2Var) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        xu0 xu0Var2;
        eg2 eg2Var2;
        int i3;
        vq4 vq4Var = this;
        Object obj2 = obj;
        xu0 xu0Var3 = xu0Var;
        eg2 eg2Var3 = eg2Var;
        eg2Var3.getClass();
        if (!p(obj2)) {
            an4.i(obj2, "Mutating immutable message: ");
            return;
        }
        j88 j88Var = vq4Var.l;
        int[] iArr2 = vq4Var.g;
        int i4 = vq4Var.i;
        int i5 = vq4Var.h;
        l88 l88VarA = null;
        while (true) {
            try {
                int iA = xu0Var3.a();
                int iA2 = vq4Var.A(iA);
                if (iA2 >= 0) {
                    int iJ = vq4Var.J(iA2);
                    try {
                        try {
                            int I = I(iJ);
                            Unsafe unsafe = f2335o;
                            hb4 hb4Var = vq4Var.k;
                            switch (I) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX = x(iJ);
                                    xu0Var2.w(1);
                                    try {
                                        try {
                                            e98.c.g(obj, jX, xu0Var2.a.n());
                                            obj2 = obj;
                                            vq4Var.G(iA2, obj2);
                                        } catch (pm3.a unused) {
                                            obj2 = obj;
                                            try {
                                                j88Var.getClass();
                                                if (l88VarA == null) {
                                                    l88VarA = j88Var.a(obj2);
                                                }
                                                if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        vq4Var.k(iArr[i5], obj2, l88VarA);
                                                        i5++;
                                                    }
                                                    if (l88VarA == null) {
                                                        return;
                                                    }
                                                    ((py2) obj2).unknownFields = l88VarA;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    vq4Var.k(iArr[i5], obj2, l88VarA);
                                                    i5++;
                                                }
                                                if (l88VarA != null) {
                                                    ((n88) j88Var).getClass();
                                                    ((py2) obj2).unknownFields = l88VarA;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA != null) {
                                                ((n88) j88Var).getClass();
                                                ((py2) obj2).unknownFields = l88VarA;
                                            }
                                            throw th;
                                        }
                                    } catch (pm3.a unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX2 = x(iJ);
                                    xu0Var2.w(5);
                                    e98.c.h(obj2, jX2, xu0Var2.a.r());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX3 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.n(obj2, jX3, xu0Var2.a.u());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX4 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.n(obj2, jX4, xu0Var2.a.D());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX5 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.m(xu0Var2.a.s(), jX5, obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX6 = x(iJ);
                                    xu0Var2.w(1);
                                    e98.n(obj2, jX6, xu0Var2.a.q());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX7 = x(iJ);
                                    xu0Var2.w(5);
                                    e98.m(xu0Var2.a.p(), jX7, obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX8 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.c.e(obj2, jX8, xu0Var2.a.l());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    vq4Var.D(iJ, obj2, xu0Var2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case ep1.b /* 9 */:
                                    vq4Var = vq4Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    u1 u1Var = (u1) vq4Var.u(iA2, obj2);
                                    cj6 cj6VarM = vq4Var.m(iA2);
                                    xu0Var2.w(2);
                                    xu0Var2.c(u1Var, cj6VarM, eg2Var2);
                                    unsafe.putObject(obj2, vq4Var.J(iA2) & 1048575, u1Var);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case ep1.c /* 10 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    e98.o(x(iJ), obj2, xu0Var2.e());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 11:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX9 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.m(xu0Var2.a.C(), jX9, obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case ep1.d /* 12 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var2.w(0);
                                    int iO = xu0Var2.a.o();
                                    vq4Var.l(iA2);
                                    e98.m(iO, x(iJ), obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 13:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX10 = x(iJ);
                                    xu0Var2.w(5);
                                    e98.m(xu0Var2.a.v(), jX10, obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX11 = x(iJ);
                                    xu0Var2.w(1);
                                    e98.n(obj2, jX11, xu0Var2.a.w());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX12 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.m(xu0Var2.a.x(), jX12, obj2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX13 = x(iJ);
                                    xu0Var2.w(0);
                                    e98.n(obj2, jX13, xu0Var2.a.y());
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 17:
                                    vq4Var = vq4Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    u1 u1Var2 = (u1) vq4Var.u(iA2, obj2);
                                    cj6 cj6VarM2 = vq4Var.m(iA2);
                                    xu0Var2.w(3);
                                    xu0Var2.b(u1Var2, cj6VarM2, eg2Var2);
                                    unsafe.putObject(obj2, vq4Var.J(iA2) & 1048575, u1Var2);
                                    vq4Var.G(iA2, obj2);
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX14 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.g(hb4.a(jX14, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX15 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.l(hb4.a(jX15, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX16 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.n(hb4.a(jX16, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX17 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.u(hb4.a(jX17, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX18 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.m(hb4.a(jX18, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX19 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.k(hb4.a(jX19, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX20 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.j(hb4.a(jX20, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    long jX21 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var2.d(hb4.a(jX21, obj2));
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    try {
                                        vq4Var.E(iJ, obj2, xu0Var2);
                                    } catch (pm3.a unused3) {
                                        j88Var.getClass();
                                        if (l88VarA == null) {
                                            l88VarA = j88Var.a(obj2);
                                        }
                                        if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA == null) {
                                                return;
                                            }
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        vq4Var.C(obj2, iJ, xu0Var3, vq4Var.m(iA2), eg2Var);
                                        xu0Var2 = xu0Var3;
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                    } catch (pm3.a unused4) {
                                        xu0Var2 = xu0Var3;
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        j88Var.getClass();
                                        if (l88VarA == null) {
                                            l88VarA = j88Var.a(obj2);
                                        }
                                        if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA == null) {
                                                return;
                                            }
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 28:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX22 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.f(hb4.a(jX22, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX23 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.t(hb4.a(jX23, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 30:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX24 = x(iJ);
                                    hb4Var.getClass();
                                    rl3 rl3VarA = hb4.a(jX24, obj2);
                                    xu0Var3.h(rl3VarA);
                                    vq4Var.l(iA2);
                                    hj6.j(obj2, iA, rl3VarA, l88VarA, j88Var);
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX25 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.o(hb4.a(jX25, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 32:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX26 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.p(hb4.a(jX26, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX27 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.q(hb4.a(jX27, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX28 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.r(hb4.a(jX28, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX29 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.g(hb4.a(jX29, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX30 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.l(hb4.a(jX30, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX31 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.n(hb4.a(jX31, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX32 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.u(hb4.a(jX32, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX33 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.m(hb4.a(jX33, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX34 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.k(hb4.a(jX34, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX35 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.j(hb4.a(jX35, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX36 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.d(hb4.a(jX36, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX37 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.t(hb4.a(jX37, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX38 = x(iJ);
                                    hb4Var.getClass();
                                    rl3 rl3VarA2 = hb4.a(jX38, obj2);
                                    xu0Var3.h(rl3VarA2);
                                    vq4Var.l(iA2);
                                    hj6.j(obj2, iA, rl3VarA2, l88VarA, j88Var);
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX39 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.o(hb4.a(jX39, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX40 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.p(hb4.a(jX40, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX41 = x(iJ);
                                    hb4Var.getClass();
                                    xu0Var3.q(hb4.a(jX41, obj2));
                                    eg2Var2 = eg2Var;
                                    vq4Var = vq4Var;
                                    xu0Var2 = xu0Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 48:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        long jX42 = x(iJ);
                                        hb4Var.getClass();
                                        xu0Var3.r(hb4.a(jX42, obj2));
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        xu0Var2 = xu0Var3;
                                    } catch (pm3.a unused5) {
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        xu0Var2 = xu0Var3;
                                        j88Var.getClass();
                                        if (l88VarA == null) {
                                            l88VarA = j88Var.a(obj2);
                                        }
                                        if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA == null) {
                                                return;
                                            }
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        vq4Var.B(obj2, x(iJ), xu0Var, vq4Var.m(iA2), eg2Var);
                                        xu0Var3 = xu0Var;
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        xu0Var2 = xu0Var3;
                                    } catch (pm3.a unused6) {
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        xu0Var2 = xu0Var;
                                        j88Var.getClass();
                                        if (l88VarA == null) {
                                            l88VarA = j88Var.a(obj2);
                                        }
                                        if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA == null) {
                                                return;
                                            }
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        vq4Var.r(obj2, iA2, vq4Var.b[(iA2 / 3) * 2], eg2Var3, xu0Var3);
                                        obj2 = obj;
                                        xu0Var2 = xu0Var;
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                    } catch (pm3.a unused7) {
                                        obj2 = obj;
                                        xu0Var2 = xu0Var;
                                        eg2Var2 = eg2Var;
                                        vq4Var = vq4Var;
                                        j88Var.getClass();
                                        if (l88VarA == null) {
                                            l88VarA = j88Var.a(obj2);
                                        }
                                        if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA == null) {
                                                return;
                                            }
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        vq4Var = vq4Var;
                                        i = i2;
                                        while (i5 < i) {
                                            vq4Var.k(iArr[i5], obj2, l88VarA);
                                            i5++;
                                        }
                                        if (l88VarA != null) {
                                            ((n88) j88Var).getClass();
                                            ((py2) obj2).unknownFields = l88VarA;
                                        }
                                        throw th;
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX43 = x(iJ);
                                    xu0Var3.w(1);
                                    e98.o(jX43, obj2, Double.valueOf(xu0Var3.a.n()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX44 = x(iJ);
                                    xu0Var3.w(5);
                                    e98.o(jX44, obj2, Float.valueOf(xu0Var3.a.r()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX45 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX45, obj2, Long.valueOf(xu0Var3.a.u()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX46 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX46, obj2, Long.valueOf(xu0Var3.a.D()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX47 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX47, obj2, Integer.valueOf(xu0Var3.a.s()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX48 = x(iJ);
                                    xu0Var3.w(1);
                                    e98.o(jX48, obj2, Long.valueOf(xu0Var3.a.q()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX49 = x(iJ);
                                    xu0Var3.w(5);
                                    e98.o(jX49, obj2, Integer.valueOf(xu0Var3.a.p()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX50 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX50, obj2, Boolean.valueOf(xu0Var3.a.l()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vq4Var.D(iJ, obj2, xu0Var3);
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    u1 u1Var3 = (u1) vq4Var.v(iA, iA2, obj2);
                                    cj6 cj6VarM3 = vq4Var.m(iA2);
                                    xu0Var3.w(2);
                                    xu0Var3.c(u1Var3, cj6VarM3, eg2Var3);
                                    unsafe.putObject(obj2, vq4Var.J(iA2) & 1048575, u1Var3);
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    e98.o(x(iJ), obj2, xu0Var3.e());
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX51 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX51, obj2, Integer.valueOf(xu0Var3.a.C()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xu0Var3.w(0);
                                    int iO2 = xu0Var3.a.o();
                                    vq4Var.l(iA2);
                                    e98.o(x(iJ), obj2, Integer.valueOf(iO2));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 64:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX52 = x(iJ);
                                    xu0Var3.w(5);
                                    e98.o(jX52, obj2, Integer.valueOf(xu0Var3.a.v()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX53 = x(iJ);
                                    xu0Var3.w(1);
                                    e98.o(jX53, obj2, Long.valueOf(xu0Var3.a.w()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX54 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX54, obj2, Integer.valueOf(xu0Var3.a.x()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX55 = x(iJ);
                                    xu0Var3.w(0);
                                    e98.o(jX55, obj2, Long.valueOf(xu0Var3.a.y()));
                                    vq4Var.H(iA, iA2, obj2);
                                    xu0Var2 = xu0Var3;
                                    eg2Var2 = eg2Var3;
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                case 68:
                                    try {
                                        u1 u1Var4 = (u1) vq4Var.v(iA, iA2, obj2);
                                        cj6 cj6VarM4 = vq4Var.m(iA2);
                                        xu0Var3.w(3);
                                        xu0Var3.b(u1Var4, cj6VarM4, eg2Var3);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, vq4Var.J(iA2) & 1048575, u1Var4);
                                                vq4Var.H(iA, iA2, obj2);
                                                xu0Var2 = xu0Var3;
                                                eg2Var2 = eg2Var3;
                                            } catch (pm3.a unused8) {
                                                xu0Var2 = xu0Var3;
                                                eg2Var2 = eg2Var3;
                                                j88Var.getClass();
                                                if (l88VarA == null) {
                                                    l88VarA = j88Var.a(obj2);
                                                }
                                                if (!j88Var.b(0, l88VarA, xu0Var2)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        vq4Var.k(iArr[i5], obj2, l88VarA);
                                                        i5++;
                                                    }
                                                    if (l88VarA == null) {
                                                        return;
                                                    }
                                                    ((py2) obj2).unknownFields = l88VarA;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            vq4Var = vq4Var;
                                            i = i2;
                                            while (i5 < i) {
                                                vq4Var.k(iArr[i5], obj2, l88VarA);
                                                i5++;
                                            }
                                            if (l88VarA != null) {
                                                ((n88) j88Var).getClass();
                                                ((py2) obj2).unknownFields = l88VarA;
                                            }
                                            throw th;
                                        }
                                    } catch (pm3.a unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    xu0Var3 = xu0Var2;
                                    eg2Var3 = eg2Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    vq4Var = vq4Var;
                                    break;
                                default:
                                    if (l88VarA == null) {
                                        l88VarA = j88Var.a(obj2);
                                    }
                                    if (j88Var.b(0, l88VarA, xu0Var3)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        xu0Var2 = xu0Var3;
                                        eg2Var2 = eg2Var3;
                                        xu0Var3 = xu0Var2;
                                        eg2Var3 = eg2Var2;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        vq4Var = vq4Var;
                                    } else {
                                        while (i5 < i4) {
                                            vq4Var.k(iArr2[i5], obj2, l88VarA);
                                            i5++;
                                        }
                                        if (l88VarA == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            vq4Var = vq4Var;
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (pm3.a unused10) {
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        vq4Var.k(iArr2[i5], obj2, l88VarA);
                        i5++;
                    }
                    if (l88VarA == null) {
                        return;
                    } else {
                        ((n88) j88Var).getClass();
                    }
                } else {
                    j88Var.getClass();
                    if (l88VarA == null) {
                        l88VarA = j88Var.a(obj2);
                    }
                    if (!j88Var.b(0, l88VarA, xu0Var3)) {
                        while (i5 < i4) {
                            vq4Var.k(iArr2[i5], obj2, l88VarA);
                            i5++;
                        }
                        if (l88VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                vq4Var = vq4Var;
                iArr = iArr2;
                i = i4;
            }
        }
        ((py2) obj2).unknownFields = l88VarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:136:0x032e  */
    /* JADX WARN: Code duplicated, block: B:137:0x033e  */
    /* JADX WARN: Code duplicated, block: B:139:0x034a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0356  */
    /* JADX WARN: Code duplicated, block: B:142:0x0366  */
    /* JADX WARN: Code duplicated, block: B:143:0x0375  */
    /* JADX WARN: Code duplicated, block: B:145:0x037c  */
    /* JADX WARN: Code duplicated, block: B:147:0x038a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0392  */
    /* JADX WARN: Code duplicated, block: B:149:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x0407  */
    /* JADX WARN: Code duplicated, block: B:160:0x0415  */
    /* JADX WARN: Code duplicated, block: B:161:0x041f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0620 A[PHI: r9 r20 r21
      0x0620: PHI (r9v26 int) = (r9v9 int), (r9v10 int), (r9v11 int), (r9v15 int), (r9v17 int), (r9v18 int), (r9v19 int), (r9v23 int), (r9v27 int) binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]
      0x0620: PHI (r20v35 int) = 
      (r20v21 int)
      (r20v22 int)
      (r20v23 int)
      (r20v27 int)
      (r20v29 int)
      (r20v30 int)
      (r20v31 int)
      (r20v34 int)
      (r20v36 int)
     binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]
      0x0620: PHI (r21v18 int) = 
      (r21v2 int)
      (r21v3 int)
      (r21v4 int)
      (r21v8 int)
      (r21v10 int)
      (r21v11 int)
      (r21v12 int)
      (r21v15 int)
      (r21v19 int)
     binds: [B:276:0x07eb, B:272:0x07cc, B:268:0x07ad, B:251:0x072a, B:237:0x06bc, B:233:0x069e, B:229:0x0681, B:222:0x0641, B:216:0x061e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:353:0x0315 A[SYNTHETIC] */
    @Override // o.cj6
    public final int h(py2 py2Var) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iF;
        int iC;
        int i2;
        int i3;
        int i4;
        int iH7;
        int size;
        int i5;
        int iH8;
        int iH9;
        int size2;
        int iH10;
        int i6;
        int iA;
        int i7;
        int iJ3;
        int size3;
        int i8;
        int iA2;
        int i9;
        zl8 zl8Var;
        int iH11;
        int iJ4;
        int size4;
        int i10;
        int iH12;
        int iH13;
        int iH14;
        int iJ5;
        int iH15;
        int iJ6;
        int iH16;
        int i11;
        vq4 vq4Var = this;
        py2 py2Var2 = py2Var;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iF2 = 0;
        while (true) {
            int[] iArr = vq4Var.a;
            if (i14 >= iArr.length) {
                ((n88) vq4Var.l).getClass();
                return py2Var2.unknownFields.b() + iF2;
            }
            int iJ7 = vq4Var.J(i14);
            int I = I(iJ7);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            int i19 = 1;
            Unsafe unsafe = f2335o;
            if (I <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(py2Var2, i18);
                    i13 = i18;
                }
                i = 1 << (i17 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ7 & i12;
            if (I >= fj2.n.m) {
                byte b = fj2.f801o.m;
            }
            char c = '?';
            switch (I) {
                case 0:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH = bv0.h(i16) + 8;
                        iF2 += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 1:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH2 = bv0.h(i16);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 2:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        long j2 = unsafe.getLong(py2Var2, j);
                        iH3 = bv0.h(i16);
                        iJ = bv0.j(j2);
                        iF2 += iJ + iH3;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 3:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        long j3 = unsafe.getLong(py2Var2, j);
                        iH3 = bv0.h(i16);
                        iJ = bv0.j(j3);
                        iF2 += iJ + iH3;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 4:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        int i20 = unsafe.getInt(py2Var2, j);
                        iH4 = bv0.h(i16);
                        iJ2 = bv0.j(i20);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 5:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH5 = bv0.h(i16);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 6:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH2 = bv0.h(i16);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 7:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH6 = bv0.h(i16) + 1;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 8:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        Object object = unsafe.getObject(py2Var2, j);
                        iF2 = (object instanceof wh0 ? bv0.f(i16, (wh0) object) : bv0.g((String) object) + bv0.h(i16)) + iF2;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case ep1.b /* 9 */:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        Object object2 = unsafe.getObject(py2Var2, j);
                        cj6 cj6VarM = vq4Var.m(i14);
                        Class cls = hj6.a;
                        int iH17 = bv0.h(i16);
                        int iA3 = ((u1) object2).a(cj6VarM);
                        iF2 += bv0.i(iA3) + iA3 + iH17;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case ep1.c /* 10 */:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iF = bv0.f(i16, (wh0) unsafe.getObject(py2Var2, j));
                        iF2 += iF;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 11:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        int i21 = unsafe.getInt(py2Var2, j);
                        iH4 = bv0.h(i16);
                        iJ2 = bv0.i(i21);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case ep1.d /* 12 */:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        int i22 = unsafe.getInt(py2Var2, j);
                        iH4 = bv0.h(i16);
                        iJ2 = bv0.j(i22);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 13:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH2 = bv0.h(i16);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 14:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH5 = bv0.h(i16);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    vq4Var = this;
                    py2Var2 = py2Var;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 15:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        int i23 = unsafe.getInt(py2Var2, j);
                        iH4 = bv0.h(i16);
                        iJ2 = bv0.i((i23 >> 31) ^ (i23 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        long j4 = unsafe.getLong(py2Var2, j);
                        iH3 = bv0.h(i16);
                        iJ = bv0.j((j4 >> 63) ^ (j4 << 1));
                        iF2 += iJ + iH3;
                    }
                    vq4Var = this;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 17:
                    if (vq4Var.o(py2Var2, i14, i13, i15, i)) {
                        iH = ((u1) unsafe.getObject(py2Var2, j)).a(vq4Var.m(i14)) + (bv0.h(i16) * 2);
                        iF2 += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    iC = hj6.c(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    iC = hj6.b(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 20:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list = (List) unsafe.getObject(py2Var2, j);
                    Class cls2 = hj6.a;
                    if (list.size() == 0) {
                        iH7 = i4;
                    } else {
                        iH7 = (bv0.h(i16) * list.size()) + hj6.e(list);
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 21:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list2 = (List) unsafe.getObject(py2Var2, j);
                    Class cls3 = hj6.a;
                    size = list2.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.i(list2);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 22:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list3 = (List) unsafe.getObject(py2Var2, j);
                    Class cls4 = hj6.a;
                    size = list3.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.d(list3);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 23:
                    iC = hj6.c(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 24:
                    iC = hj6.b(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 25:
                    i2 = i13;
                    i3 = i15;
                    List list4 = (List) unsafe.getObject(py2Var2, j);
                    Class cls5 = hj6.a;
                    int size5 = list4.size();
                    iF2 += size5 == 0 ? 0 : (bv0.h(i16) + 1) * size5;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 26:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list5 = (List) unsafe.getObject(py2Var2, j);
                    Class cls6 = hj6.a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iH7 = i4;
                    } else {
                        iH7 = bv0.h(i16) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof wh0) {
                                int size7 = ((wh0) obj).size();
                                iH7 = bv0.i(size7) + size7 + iH7;
                            } else {
                                iH7 = bv0.g((String) obj) + iH7;
                            }
                        }
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 27:
                    i2 = i13;
                    i3 = i15;
                    List list6 = (List) unsafe.getObject(py2Var2, j);
                    cj6 cj6VarM2 = vq4Var.m(i14);
                    Class cls7 = hj6.a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = bv0.h(i16) * size8;
                        for (int i25 = 0; i25 < size8; i25++) {
                            int iA4 = ((u1) list6.get(i25)).a(cj6VarM2);
                            iH9 += bv0.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH9;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 28:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list7 = (List) unsafe.getObject(py2Var2, j);
                    Class cls8 = hj6.a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iH7 = i4;
                    } else {
                        iH7 = bv0.h(i16) * size9;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int size10 = ((wh0) list7.get(i26)).size();
                            iH7 += bv0.i(size10) + size10;
                        }
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 29:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list8 = (List) unsafe.getObject(py2Var2, j);
                    Class cls9 = hj6.a;
                    size = list8.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.h(list8);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 30:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list9 = (List) unsafe.getObject(py2Var2, j);
                    Class cls10 = hj6.a;
                    size = list9.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.a(list9);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 31:
                    iC = hj6.b(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 32:
                    iC = hj6.c(i16, (List) unsafe.getObject(py2Var2, j));
                    iF2 += iC;
                    i13 = i13;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 33:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list10 = (List) unsafe.getObject(py2Var2, j);
                    Class cls11 = hj6.a;
                    size = list10.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.f(list10);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 34:
                    i2 = i13;
                    i3 = i15;
                    i4 = 0;
                    List list11 = (List) unsafe.getObject(py2Var2, j);
                    Class cls12 = hj6.a;
                    size = list11.size();
                    if (size == 0) {
                        iH7 = i4;
                    } else {
                        i5 = hj6.g(list11);
                        iH8 = bv0.h(i16);
                        iH7 = (iH8 * size) + i5;
                    }
                    iF2 += iH7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 35:
                    i2 = i13;
                    i3 = i15;
                    List list12 = (List) unsafe.getObject(py2Var2, j);
                    Class cls13 = hj6.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 36:
                    i2 = i13;
                    i3 = i15;
                    List list13 = (List) unsafe.getObject(py2Var2, j);
                    Class cls14 = hj6.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 37:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.e((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 38:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.i((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 39:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.d((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 40:
                    i2 = i13;
                    i3 = i15;
                    List list14 = (List) unsafe.getObject(py2Var2, j);
                    Class cls15 = hj6.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 41:
                    i2 = i13;
                    i3 = i15;
                    List list15 = (List) unsafe.getObject(py2Var2, j);
                    Class cls16 = hj6.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 42:
                    i2 = i13;
                    i3 = i15;
                    List list16 = (List) unsafe.getObject(py2Var2, j);
                    Class cls17 = hj6.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 43:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.h((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 44:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.a((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 45:
                    i2 = i13;
                    i3 = i15;
                    List list17 = (List) unsafe.getObject(py2Var2, j);
                    Class cls18 = hj6.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 46:
                    i2 = i13;
                    i3 = i15;
                    List list18 = (List) unsafe.getObject(py2Var2, j);
                    Class cls19 = hj6.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 47:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.f((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 48:
                    i2 = i13;
                    i3 = i15;
                    size2 = hj6.g((List) unsafe.getObject(py2Var2, j));
                    if (size2 > 0) {
                        iH10 = bv0.h(i16);
                        i6 = bv0.i(size2);
                        iF2 += i6 + iH10 + size2;
                    }
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 49:
                    i2 = i13;
                    i3 = i15;
                    List list19 = (List) unsafe.getObject(py2Var2, j);
                    cj6 cj6VarM3 = vq4Var.m(i14);
                    Class cls20 = hj6.a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iA = 0;
                    } else {
                        iA = 0;
                        for (int i27 = 0; i27 < size11; i27++) {
                            iA += ((u1) list19.get(i27)).a(cj6VarM3) + (bv0.h(i16) * 2);
                        }
                    }
                    iF2 += iA;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(py2Var2, j);
                    Object obj2 = vq4Var.b[(i14 / 3) * 2];
                    vq4Var.m.getClass();
                    qm4 qm4Var = (qm4) object3;
                    mm4 mm4Var = (mm4) obj2;
                    if (qm4Var.isEmpty()) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (Map.Entry entry : qm4Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            mm4Var.getClass();
                            int iH18 = bv0.h(i16);
                            ep3 ep3Var = mm4Var.a;
                            zl8 zl8Var2 = (zl8) ep3Var.n;
                            int i28 = dj2.c;
                            int iH19 = bv0.h(i19);
                            char c2 = c;
                            tl8 tl8Var = zl8.p;
                            if (zl8Var2 == tl8Var) {
                                iH19 *= 2;
                            }
                            int i29 = i19;
                            switch (zl8Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iJ3 = 8;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i30 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i30) + i30 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31) + i31 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i32 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i32) + i32 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i33 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i33) + i33 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i34 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i34) + i34 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i35 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i35) + i35 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i36 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i36) + i36 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i37 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i37) + i37 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i38 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i38) + i38 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i39 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i39) + i39 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i310 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i310) + i310 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311) + i311 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i312 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i312) + i312 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i313 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i313) + i313 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i314 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i314) + i314 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i315 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i315) + i315 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue >> 31) ^ (iIntValue << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i316 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i316) + i316 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue << i29) ^ (jLongValue >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i317 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i317) + i317 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iJ3 = 4;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i318 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i318) + i318 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i319 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i319) + i319 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3110) + i3110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111) + i3111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3112) + i3112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3113) + i3113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3114) + i3114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i3115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3115) + i3115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3116) + i3116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3117) + i3117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3118) + i3118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3119) + i3119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31110) + i31110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111) + i31111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31112) + i31112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31113) + i31113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31114) + i31114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue2 << i29) ^ (jLongValue2 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31115) + i31115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 2:
                                    iJ3 = bv0.j(((Long) key).longValue());
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31116) + i31116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31117) + i31117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31118) + i31118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31119) + i31119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311110) + i311110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111) + i311111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311112) + i311112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311113) + i311113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i311114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311114) + i311114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i311115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311115) + i311115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311116) + i311116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311117) + i311117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311118) + i311118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311119) + i311119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111110) + i3111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111) + i3111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111112) + i3111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue3 << i29) ^ (jLongValue3 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111113) + i3111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 3:
                                    iJ3 = bv0.j(((Long) key).longValue());
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i3111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111114) + i3111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i3111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111115) + i3111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111116) + i3111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111117) + i3111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111118) + i3111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111119) + i3111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111110) + i31111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111) + i31111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111112) + i31111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111113) + i31111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i31111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111114) + i31111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i31111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111115) + i31111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111116) + i31111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111117) + i31111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111118) + i31111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111119) + i31111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111110) + i311111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue4 << i29) ^ (jLongValue4 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111) + i311111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 4:
                                    iJ3 = bv0.j(((Integer) key).intValue());
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111112) + i311111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111113) + i311111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111114) + i311111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111115) + i311111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111116) + i311111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111117) + i311111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111118) + i311111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111119) + i311111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111110) + i3111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111) + i3111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111112) + i3111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111113) + i3111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i3111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111114) + i3111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111115) + i3111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111116) + i3111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111117) + i3111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111118) + i3111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue5 << i29) ^ (jLongValue5 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111119) + i3111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iJ3 = 8;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111110) + i31111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111) + i31111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111112) + i31111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111113) + i31111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111114) + i31111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111115) + i31111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111116) + i31111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111117) + i31111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111118) + i31111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111119) + i31111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111110) + i311111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111) + i311111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111112) + i311111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111113) + i311111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111114) + i311111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111115) + i311111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111116) + i311111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue6 << i29) ^ (jLongValue6 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111117) + i311111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iJ3 = 4;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111118) + i311111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111119) + i311111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111110) + i3111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111) + i3111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111112) + i3111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111113) + i3111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111114) + i3111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i3111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111115) + i3111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111116) + i3111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111117) + i3111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111118) + i3111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111119) + i3111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111110) + i31111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111) + i31111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111112) + i31111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111113) + i31111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111114) + i31111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue7 << i29) ^ (jLongValue7 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111115) + i31111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iJ3 = i29;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111116) + i31111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111117) + i31111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111118) + i31111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111119) + i31111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111110) + i311111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111) + i311111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111112) + i311111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111113) + i311111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i311111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111114) + i311111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i311111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111115) + i311111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111116) + i311111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111117) + i311111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111118) + i311111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111119) + i311111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111110) + i3111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111) + i3111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111112) + i3111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue8 << i29) ^ (jLongValue8 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111113) + i3111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof wh0) {
                                        size3 = ((wh0) key).size();
                                        i8 = bv0.i(size3);
                                        iJ3 = size3 + i8;
                                    } else {
                                        iJ3 = bv0.g((String) key);
                                    }
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111114) + i3111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111115) + i3111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111116) + i3111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111117) + i3111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111118) + i3111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111119) + i3111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111110) + i31111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111) + i31111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111112) + i31111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111113) + i31111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i31111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111114) + i31111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i31111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111115) + i31111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111116) + i31111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111117) + i31111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111118) + i31111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111119) + i31111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111110) + i311111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue9 << i29) ^ (jLongValue9 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111) + i311111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case ep1.b /* 9 */:
                                    iA2 = ((py2) ((u1) key)).a(null);
                                    iJ3 = iA2;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111112) + i311111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111113) + i311111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111114) + i311111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111115) + i311111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111116) + i311111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111117) + i311111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111118) + i311111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111119) + i311111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111110) + i3111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111) + i3111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111112) + i3111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111113) + i3111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i3111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111114) + i3111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111115) + i3111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111116) + i3111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111117) + i3111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111118) + i3111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue10 << i29) ^ (jLongValue10 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111119) + i3111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case ep1.c /* 10 */:
                                    int iA5 = ((py2) ((u1) key)).a(null);
                                    iA2 = iA5 + bv0.i(iA5);
                                    iJ3 = iA2;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111110) + i31111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111) + i31111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111112) + i31111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111113) + i31111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111114) + i31111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111115) + i31111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111116) + i31111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111117) + i31111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111118) + i31111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111119) + i31111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111110) + i311111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111) + i311111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111112) + i311111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111113) + i311111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111114) + i311111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111115) + i311111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111116) + i311111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue11 << i29) ^ (jLongValue11 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111117) + i311111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 11:
                                    if (key instanceof wh0) {
                                        size3 = ((wh0) key).size();
                                        i8 = bv0.i(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        i8 = bv0.i(size3);
                                    }
                                    iJ3 = size3 + i8;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111118) + i311111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111119) + i311111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111110) + i3111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111) + i3111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111112) + i3111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111113) + i3111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111114) + i3111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i3111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111115) + i3111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111116) + i3111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111117) + i3111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111118) + i3111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111119) + i3111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111110) + i31111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111) + i31111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111112) + i31111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111113) + i31111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111114) + i31111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue12 << i29) ^ (jLongValue12 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111115) + i31111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case ep1.d /* 12 */:
                                    iJ3 = bv0.i(((Integer) key).intValue());
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111116) + i31111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111117) + i31111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111118) + i31111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111119) + i31111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111110) + i311111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111) + i311111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111112) + i311111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111113) + i311111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i311111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111114) + i311111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i311111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111115) + i311111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111116) + i311111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111117) + i311111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111118) + i311111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111119) + i311111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111110) + i3111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111) + i3111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111112) + i3111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue13 << i29) ^ (jLongValue13 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111113) + i3111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 13:
                                    iJ3 = bv0.j(((Integer) key).intValue());
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111114) + i3111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111115) + i3111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111116) + i3111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111117) + i3111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111118) + i3111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111119) + i3111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111110) + i31111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111) + i31111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111112) + i31111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111113) + i31111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i31111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111114) + i31111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i31111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111115) + i31111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111116) + i31111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111117) + i31111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111118) + i31111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111119) + i31111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111110) + i311111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue14 << i29) ^ (jLongValue14 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111) + i311111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iJ3 = 4;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111112) + i311111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111113) + i311111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111114) + i311111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i311111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111115) + i311111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111116) + i311111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111117) + i311111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111118) + i311111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111119) + i311111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111110) + i3111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111) + i3111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111112) + i3111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111113) + i3111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i3111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111114) + i3111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111115) + i3111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111116) + i3111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111117) + i3111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111118) + i3111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue15 << i29) ^ (jLongValue15 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111119) + i3111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iJ3 = 8;
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111110) + i31111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111) + i31111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111112) + i31111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111113) + i31111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111114) + i31111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111115) + i31111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111116) + i31111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i31111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111117) + i31111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i31111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111118) + i31111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i31111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111119) + i31111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111110) + i311111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111) + i311111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111112) + i311111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111113) + i311111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111114) + i311111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111115) + i311111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111116) + i311111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue16 << i29) ^ (jLongValue16 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i311111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111117) + i311111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iJ3 = bv0.i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111118) + i311111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111119) + i311111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111110) + i3111111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i3111111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111111) + i3111111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i3111111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111112) + i3111111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111113) + i3111111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111114) + i3111111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i3111111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111115) + i3111111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i3111111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111116) + i3111111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i3111111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111117) + i3111111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111118) + i3111111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i3111111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111119) + i3111111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i31111111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111110) + i31111111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i31111111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111111) + i31111111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111112) + i31111111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111113) + i31111111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111114) + i31111111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue17 << i29) ^ (jLongValue17 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i31111111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111115) + i31111111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iJ3 = bv0.j((jLongValue18 << i29) ^ (jLongValue18 >> c2));
                                    i9 = iJ3 + iH19;
                                    zl8Var = (zl8) ep3Var.f733o;
                                    iH11 = bv0.h(2);
                                    if (zl8Var == tl8Var) {
                                        iH11 *= 2;
                                    }
                                    switch (zl8Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ4 = 8;
                                            int i31111111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111116) + i31111111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ4 = 4;
                                            int i31111111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111117) + i31111111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 2:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111118) + i31111111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 3:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Long) value).longValue());
                                            int i31111111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i31111111111111111111111111111119) + i31111111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 4:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111110) + i311111111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i311111111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111111) + i311111111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i311111111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111112) + i311111111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 7:
                                            i13 = i13;
                                            i15 = i15;
                                            ((Boolean) value).getClass();
                                            iJ4 = i29;
                                            int i311111111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111113) + i311111111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 8:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                                iJ4 = i10 + size4;
                                            } else {
                                                iJ4 = bv0.g((String) value);
                                            }
                                            int i311111111111111111111111111111114 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111114) + i311111111111111111111111111111114 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.b /* 9 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = ((py2) ((u1) value)).a(null);
                                            int i311111111111111111111111111111115 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111115) + i311111111111111111111111111111115 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.c /* 10 */:
                                            i13 = i13;
                                            i15 = i15;
                                            size4 = ((py2) ((u1) value)).a(null);
                                            i10 = bv0.i(size4);
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111111111111116 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111116) + i311111111111111111111111111111116 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 11:
                                            i13 = i13;
                                            i15 = i15;
                                            if (value instanceof wh0) {
                                                size4 = ((wh0) value).size();
                                                i10 = bv0.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = bv0.i(size4);
                                            }
                                            iJ4 = i10 + size4;
                                            int i311111111111111111111111111111117 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111117) + i311111111111111111111111111111117 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case ep1.d /* 12 */:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.i(((Integer) value).intValue());
                                            int i311111111111111111111111111111118 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111118) + i311111111111111111111111111111118 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 13:
                                            i13 = i13;
                                            i15 = i15;
                                            iJ4 = bv0.j(((Integer) value).intValue());
                                            int i311111111111111111111111111111119 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i311111111111111111111111111111119) + i311111111111111111111111111111119 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ4 = 4;
                                            int i3111111111111111111111111111111110 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111111110) + i3111111111111111111111111111111110 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ4 = 8;
                                            int i3111111111111111111111111111111111 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111111111) + i3111111111111111111111111111111111 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iJ4 = bv0.i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111111111111112 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111111112) + i3111111111111111111111111111111112 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iJ4 = bv0.j((jLongValue19 << i29) ^ (jLongValue19 >> c2));
                                            i13 = i13;
                                            i15 = i15;
                                            int i3111111111111111111111111111111113 = iJ4 + iH11 + i9;
                                            i7 += bv0.i(i3111111111111111111111111111111113) + i3111111111111111111111111111111113 + iH18;
                                            i13 = i13;
                                            i15 = i15;
                                            c = c2;
                                            i19 = i29;
                                            break;
                                        default:
                                            hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                default:
                                    hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                                    return 0;
                            }
                        }
                    }
                    i2 = i13;
                    i3 = i15;
                    iF2 += i7;
                    i13 = i2;
                    i15 = i3;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 51:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH12 = bv0.h(i16);
                        iH16 = iH12 + 8;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 52:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH13 = bv0.h(i16);
                        iH16 = iH13 + 4;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 53:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        long jZ = z(j, py2Var2);
                        iH14 = bv0.h(i16);
                        iJ5 = bv0.j(jZ);
                        i11 = iJ5 + iH14;
                        iF2 += i11;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 54:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        long jZ2 = z(j, py2Var2);
                        iH14 = bv0.h(i16);
                        iJ5 = bv0.j(jZ2);
                        i11 = iJ5 + iH14;
                        iF2 += i11;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 55:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        int iY = y(j, py2Var2);
                        iH15 = bv0.h(i16);
                        iJ6 = bv0.j(iY);
                        iH16 = iJ6 + iH15;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 56:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH12 = bv0.h(i16);
                        iH16 = iH12 + 8;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 57:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH13 = bv0.h(i16);
                        iH16 = iH13 + 4;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 58:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH16 = bv0.h(i16) + 1;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 59:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        Object object4 = unsafe.getObject(py2Var2, j);
                        iF2 = (object4 instanceof wh0 ? bv0.f(i16, (wh0) object4) : bv0.g((String) object4) + bv0.h(i16)) + iF2;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 60:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        Object object5 = unsafe.getObject(py2Var2, j);
                        cj6 cj6VarM4 = vq4Var.m(i14);
                        Class cls21 = hj6.a;
                        int iH20 = bv0.h(i16);
                        int iA6 = ((u1) object5).a(cj6VarM4);
                        i11 = bv0.i(iA6) + iA6 + iH20;
                        iF2 += i11;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 61:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH16 = bv0.f(i16, (wh0) unsafe.getObject(py2Var2, j));
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 62:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        int iY2 = y(j, py2Var2);
                        iH15 = bv0.h(i16);
                        iJ6 = bv0.i(iY2);
                        iH16 = iJ6 + iH15;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 63:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        int iY3 = y(j, py2Var2);
                        iH15 = bv0.h(i16);
                        iJ6 = bv0.j(iY3);
                        iH16 = iJ6 + iH15;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 64:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH13 = bv0.h(i16);
                        iH16 = iH13 + 4;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 65:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH12 = bv0.h(i16);
                        iH16 = iH12 + 8;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 66:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        int iY4 = y(j, py2Var2);
                        iH15 = bv0.h(i16);
                        iJ6 = bv0.i((iY4 >> 31) ^ (iY4 << 1));
                        iH16 = iJ6 + iH15;
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 67:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        long jZ3 = z(j, py2Var2);
                        iH14 = bv0.h(i16);
                        iJ5 = bv0.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i11 = iJ5 + iH14;
                        iF2 += i11;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 68:
                    if (vq4Var.q(i16, i14, py2Var2)) {
                        iH16 = ((u1) unsafe.getObject(py2Var2, j)).a(vq4Var.m(i14)) + (bv0.h(i16) * 2);
                        iF2 += iH16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                default:
                    i14 += 3;
                    i12 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.cj6
    public final int i(py2 py2Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iJ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i = i3 * 53;
                    iB = ul3.b(Double.doubleToLongBits(e98.c.c(j, py2Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(e98.c.d(j, py2Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = ul3.b(e98.g(j, py2Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = ul3.b(e98.g(j, py2Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = ul3.b(e98.g(j, py2Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = e98.c.a(j, py2Var);
                    Charset charset = ul3.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) e98.h(j, py2Var)).hashCode();
                    i3 = iB + i;
                    break;
                case ep1.b /* 9 */:
                    Object objH = e98.h(j, py2Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case ep1.c /* 10 */:
                    i = i3 * 53;
                    iB = e98.h(j, py2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case ep1.d /* 12 */:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = ul3.b(e98.g(j, py2Var));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = e98.f(j, py2Var);
                    i3 = iB + i;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    i = i3 * 53;
                    iB = ul3.b(e98.g(j, py2Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = e98.h(j, py2Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = e98.h(j, py2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = e98.h(j, py2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(Double.doubleToLongBits(((Double) e98.h(j, py2Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) e98.h(j, py2Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(z(j, py2Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(z(j, py2Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(z(j, py2Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, py2Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) e98.h(j, py2Var)).booleanValue();
                        Charset charset2 = ul3.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ((String) e98.h(j, py2Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = e98.h(j, py2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = e98.h(j, py2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(z(j, py2Var));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = y(j, py2Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = ul3.b(z(j, py2Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, py2Var)) {
                        i = i3 * 53;
                        iB = e98.h(j, py2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((n88) this.l).getClass();
        return py2Var.unknownFields.hashCode() + (i3 * 53);
    }

    public final boolean j(py2 py2Var, py2 py2Var2, int i) {
        return n(i, py2Var) == n(i, py2Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (e98.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        io.sentry.h2.f();
    }

    public final cj6 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        cj6 cj6Var = (cj6) objArr[i2];
        if (cj6Var != null) {
            return cj6Var;
        }
        cj6 cj6VarA = vw5.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = cj6VarA;
        return cj6VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & e98.f(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(e98.c.c(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(e98.c.d(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (e98.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (e98.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (e98.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return e98.c.a(j2, obj);
            case 8:
                Object objH = e98.h(j2, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof wh0) {
                    return !wh0.f2412o.equals(objH);
                }
                yq4.f();
                return false;
            case ep1.b /* 9 */:
                if (e98.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case ep1.c /* 10 */:
                return !wh0.f2412o.equals(e98.h(j2, obj));
            case 11:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case ep1.d /* 12 */:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (e98.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (e98.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                if (e98.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (e98.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                yq4.f();
                return false;
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return e98.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(Object obj, int i, Object obj2, eg2 eg2Var, xu0 xu0Var) throws pm3.a {
        long J = J(i) & 1048575;
        Object objH = e98.h(J, obj);
        sm4 sm4Var = this.m;
        if (objH == null) {
            sm4Var.getClass();
            objH = qm4.n.b();
            e98.o(J, obj, objH);
        } else {
            sm4Var.getClass();
            if (!((qm4) objH).m) {
                Object objB = qm4.n.b();
                sm4.a(objB, objH);
                e98.o(J, obj, objB);
                objH = objB;
            }
        }
        sm4Var.getClass();
        qm4 qm4Var = (qm4) objH;
        ep3 ep3Var = ((mm4) obj2).a;
        xu0Var.w(2);
        uu0 uu0Var = xu0Var.a;
        int iK = uu0Var.k(uu0Var.C());
        Object obj3 = ep3Var.p;
        Object objI = "";
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = xu0Var.a();
                if (iA == Integer.MAX_VALUE || uu0Var.e()) {
                    break;
                }
                if (iA == 1) {
                    objI = xu0Var.i((zl8) ep3Var.n, null, null);
                } else if (iA != 2) {
                    try {
                        if (!xu0Var.x()) {
                            throw new pm3("Unable to parse map entry.");
                        }
                    } catch (pm3.a unused) {
                        if (!xu0Var.x()) {
                            throw new pm3("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = xu0Var.i((zl8) ep3Var.f733o, obj3.getClass(), eg2Var);
                }
            } catch (Throwable th) {
                uu0Var.j(iK);
                throw th;
            }
        }
        qm4Var.put(objI, objI2);
        uu0Var.j(iK);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = f2335o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            cj6 cj6VarM = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    py2 py2VarC = cj6VarM.c();
                    cj6VarM.d(py2VarC, object);
                    unsafe.putObject(obj, J, py2VarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                py2 py2VarC2 = cj6VarM.c();
                cj6VarM.d(py2VarC2, object2);
                unsafe.putObject(obj, J, py2VarC2);
                object2 = py2VarC2;
            }
            cj6VarM.d(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = f2335o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            cj6 cj6VarM = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    py2 py2VarC = cj6VarM.c();
                    cj6VarM.d(py2VarC, object);
                    unsafe.putObject(obj, J, py2VarC);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                py2 py2VarC2 = cj6VarM.c();
                cj6VarM.d(py2VarC2, object2);
                unsafe.putObject(obj, J, py2VarC2);
                object2 = py2VarC2;
            }
            cj6VarM.d(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        cj6 cj6VarM = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return cj6VarM.c();
        }
        Object object = f2335o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        py2 py2VarC = cj6VarM.c();
        if (object != null) {
            cj6VarM.d(py2VarC, object);
        }
        return py2VarC;
    }

    public final Object v(int i, int i2, Object obj) {
        cj6 cj6VarM = m(i2);
        if (!q(i, i2, obj)) {
            return cj6VarM.c();
        }
        Object object = f2335o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        py2 py2VarC = cj6VarM.c();
        if (object != null) {
            cj6VarM.d(py2VarC, object);
        }
        return py2VarC;
    }
}
