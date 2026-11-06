package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class uq4 implements bj6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f2236o = new int[0];
    public static final Unsafe p;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final s1 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final k35 k;
    public final gb4 l;
    public final i88 m;
    public final rm4 n;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new z88((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        p = unsafe;
    }

    public uq4(int[] iArr, Object[] objArr, int i, int i2, s1 s1Var, boolean z, int[] iArr2, int i3, int i4, k35 k35Var, gb4 gb4Var, i88 i88Var, fg2 fg2Var, rm4 rm4Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = s1Var instanceof ny2;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = k35Var;
        this.l = gb4Var;
        this.m = i88Var;
        this.e = s1Var;
        this.n = rm4Var;
    }

    public static Field D(Class cls, String str) {
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

    public static int H(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void J(int i, Object obj, df6 df6Var) throws zu0 {
        if (!(obj instanceof String)) {
            df6Var.w(i, (yh0) obj);
            return;
        }
        String str = (String) obj;
        yu0 yu0Var = (yu0) df6Var.n;
        yu0Var.p(i, 2);
        int i2 = yu0Var.c;
        byte[] bArr = yu0Var.b;
        int i3 = yu0Var.d;
        try {
            int i4 = yu0.i(str.length() * 3);
            int i5 = yu0.i(str.length());
            if (i5 != i4) {
                yu0Var.q(ha8.a(str));
                int i6 = yu0Var.d;
                yu0Var.d = ha8.a.k(i6, i2 - i6, str, bArr);
                return;
            }
            int i7 = i3 + i5;
            yu0Var.d = i7;
            int iK = ha8.a.k(i7, i2 - i7, str, bArr);
            yu0Var.d = i3;
            yu0Var.q((iK - i3) - i5);
            yu0Var.d = iK;
        } catch (IndexOutOfBoundsException e) {
            throw new zu0(e);
        } catch (fa8 e2) {
            yu0Var.d = i3;
            yu0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(sl3.a);
            try {
                yu0Var.q(bytes.length);
                yu0Var.l(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zu0(e3);
            } catch (zu0 e4) {
                throw e4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x0299  */
    /* JADX WARN: Code duplicated, block: B:133:0x02af  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b2  */
    public static uq4 u(v06 v06Var, k35 k35Var, gb4 gb4Var, i88 i88Var, fg2 fg2Var, rm4 rm4Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i22;
        int iObjectFieldOffset3;
        Field fieldD;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldD2;
        int i27;
        Object obj2;
        Field fieldD3;
        int i28;
        char cCharAt10;
        int i29;
        int i30;
        char cCharAt11;
        int i31;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        char cCharAt14;
        if (!(v06Var instanceof v06)) {
            io.sentry.h2.f();
            return null;
        }
        int i34 = 0;
        boolean z = (v06Var.d & 1) != 1;
        String str = v06Var.b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i35 = iCharAt3 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                cCharAt14 = str.charAt(i36);
                if (cCharAt14 < 55296) {
                    break;
                }
                i35 |= (cCharAt14 & 8191) << i37;
                i37 += 13;
                i36 = i;
            }
            iCharAt3 = i35 | (cCharAt14 << i37);
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i39 = iCharAt4 & 8191;
            int i40 = 13;
            while (true) {
                i33 = i38 + 1;
                cCharAt13 = str.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i33;
            }
            iCharAt4 = i39 | (cCharAt13 << i40);
            i38 = i33;
        }
        if (iCharAt4 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            iArr = f2236o;
            i5 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt8 = str.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt5 = i42 | (cCharAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt7 = str.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt6 = i45 | (cCharAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt7 = str.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt6 = str.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt7 = i48 | (cCharAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            int iCharAt8 = str.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt5 = str.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt8 = i51 | (cCharAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            iCharAt = str.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt4 = str.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            iCharAt2 = str.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    cCharAt3 = str.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int iCharAt9 = str.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    cCharAt2 = str.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                iCharAt9 = i60 | (cCharAt2 << i62);
                i2 = i8;
            } else {
                i2 = i59;
            }
            int i63 = i2 + 1;
            int iCharAt10 = str.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i64 = iCharAt10 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    cCharAt = str.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i65 = i7;
                }
                iCharAt10 = i64 | (cCharAt << i66);
                i63 = i7;
            }
            int[] iArr2 = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i3 = (iCharAt5 * 2) + iCharAt6;
            int i67 = iCharAt7;
            iArr = iArr2;
            i4 = i67;
            i5 = iCharAt8;
            i6 = iCharAt10;
            i34 = iCharAt5;
            i38 = i63;
        }
        Object[] objArr = v06Var.c;
        Class<?> cls = v06Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i68 = iCharAt2 + i6;
        int i69 = i6;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int iCharAt11 = str.charAt(i38);
            int[] iArr4 = iArr3;
            if (iCharAt11 >= 55296) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    cCharAt12 = str.charAt(i75);
                    i15 = i34;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                    i34 = i15;
                }
                iCharAt11 = i74 | (cCharAt12 << i76);
                i16 = i32;
            } else {
                i15 = i34;
                i16 = i73;
            }
            int i77 = i16 + 1;
            int iCharAt12 = str.charAt(i16);
            if (iCharAt12 >= 55296) {
                int i78 = iCharAt12 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i30 = i79 + 1;
                    cCharAt11 = str.charAt(i79);
                    i31 = i78;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 = i31 | ((cCharAt11 & 8191) << i80);
                    i80 += 13;
                    i79 = i30;
                }
                iCharAt12 = i31 | (cCharAt11 << i80);
                i17 = i30;
            } else {
                i17 = i77;
            }
            int i81 = length;
            int i82 = iCharAt12 & 255;
            int i83 = iCharAt3;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i84 = i4;
            Unsafe unsafe = p;
            if (i82 >= 51) {
                int i85 = i17 + 1;
                int iCharAt13 = str.charAt(i17);
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i28 = i87 + 1;
                        cCharAt10 = str.charAt(i87);
                        i29 = i86;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 = i29 | ((cCharAt10 & 8191) << i88);
                        i88 += 13;
                        i87 = i28;
                    }
                    iCharAt13 = i29 | (cCharAt10 << i88);
                    i24 = i28;
                } else {
                    i24 = i85;
                }
                int i89 = iCharAt13;
                int i90 = i82 - 51;
                int i91 = i24;
                if (i90 == 9 || i90 == 17) {
                    i25 = i3 + 1;
                    objArr2[((i72 / 3) * 2) + 1] = objArr[i3];
                } else {
                    if (i90 == 12 && (i83 & 1) == 1) {
                        i25 = i3 + 1;
                        objArr2[((i72 / 3) * 2) + 1] = objArr[i3];
                    }
                    i26 = i89 * 2;
                    obj = objArr[i26];
                    if (obj instanceof Field) {
                        fieldD2 = (Field) obj;
                    } else {
                        fieldD2 = D(cls, (String) obj);
                        objArr[i26] = fieldD2;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                    i27 = i26 + 1;
                    obj2 = objArr[i27];
                    if (obj2 instanceof Field) {
                        fieldD3 = (Field) obj2;
                    } else {
                        fieldD3 = D(cls, (String) obj2);
                        objArr[i27] = fieldD3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                    i18 = i3;
                    i38 = i91;
                    i22 = 0;
                }
                i3 = i25;
                i26 = i89 * 2;
                obj = objArr[i26];
                if (obj instanceof Field) {
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr[i26] = fieldD2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                i27 = i26 + 1;
                obj2 = objArr[i27];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr[i27] = fieldD3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                i18 = i3;
                i38 = i91;
                i22 = 0;
            } else {
                int i92 = i3 + 1;
                Field fieldD4 = D(cls, (String) objArr[i3]);
                if (i82 == 9 || i82 == 17) {
                    i18 = i92;
                    i19 = 1;
                    objArr2[((i72 / 3) * 2) + 1] = fieldD4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i19 = 1;
                        i23 = i3 + 2;
                        objArr2[((i72 / 3) * 2) + 1] = objArr[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i18 = i92;
                        i19 = 1;
                        if ((i83 & 1) == 1) {
                            i23 = i3 + 2;
                            objArr2[((i72 / 3) * 2) + 1] = objArr[i18];
                        }
                    } else {
                        if (i82 == 50) {
                            int i93 = i69 + 1;
                            iArr[i69] = i72;
                            int i94 = (i72 / 3) * 2;
                            i18 = i3 + 2;
                            objArr2[i94] = objArr[i92];
                            if ((iCharAt12 & 2048) != 0) {
                                objArr2[i94 + 1] = objArr[i18];
                                i18 = i3 + 3;
                            }
                            i69 = i93;
                        } else {
                            i18 = i92;
                        }
                        i19 = 1;
                    }
                    i18 = i23;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD4);
                if ((i83 & 1) != i19 || i82 > 17) {
                    i20 = i17;
                    i21 = 0;
                    iObjectFieldOffset = 0;
                } else {
                    int i95 = i17 + 1;
                    int iCharAt14 = str.charAt(i17);
                    if (iCharAt14 >= 55296) {
                        int i96 = iCharAt14 & 8191;
                        int i97 = 13;
                        while (true) {
                            i20 = i95 + 1;
                            cCharAt9 = str.charAt(i95);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i96 |= (cCharAt9 & 8191) << i97;
                            i97 += 13;
                            i95 = i20;
                        }
                        iCharAt14 = i96 | (cCharAt9 << i97);
                    } else {
                        i20 = i95;
                    }
                    int i98 = (iCharAt14 / 32) + (i15 * 2);
                    Object obj3 = objArr[i98];
                    if (obj3 instanceof Field) {
                        fieldD = (Field) obj3;
                    } else {
                        fieldD = D(cls, (String) obj3);
                        objArr[i98] = fieldD;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD);
                    i21 = iCharAt14 % 32;
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i70] = iObjectFieldOffset4;
                    i70++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset;
                i22 = i21;
                iObjectFieldOffset3 = iObjectFieldOffset4;
                i38 = i20;
            }
            int i99 = i72 + 1;
            iArr4[i72] = iCharAt11;
            int i100 = i72 + 2;
            iArr4[i99] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i82 << 20) | iObjectFieldOffset3;
            i72 += 3;
            iArr4[i100] = (i22 << 20) | iObjectFieldOffset2;
            length = i81;
            iArr3 = iArr4;
            iCharAt3 = i83;
            i34 = i15;
            i3 = i18;
            i4 = i84;
            i5 = i5;
        }
        return new uq4(iArr3, objArr2, i4, i5, v06Var.a, z, iArr, i6, i68, k35Var, gb4Var, i88Var, fg2Var, rm4Var);
    }

    public static long v(int i) {
        return i & 1048575;
    }

    public static int w(long j, Object obj) {
        return ((Integer) d98.j(j, obj)).intValue();
    }

    public static long x(long j, Object obj) {
        return ((Long) d98.j(j, obj)).longValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11021. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int A(java.lang.Object r26, byte[] r27, int r28, int r29, int r30, o.jw r31) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uq4.A(java.lang.Object, byte[], int, int, int, o.jw):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int B(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, jw jwVar) throws qm3 {
        int iL;
        Unsafe unsafe = p;
        ql3 ql3VarZ = (ql3) unsafe.getObject(obj, j2);
        if (!((e2) ql3VarZ).m) {
            int size = ql3VarZ.size();
            ql3VarZ = ql3VarZ.z(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, ql3VarZ);
        }
        ql3 ql3Var = ql3VarZ;
        switch (i6) {
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 35:
                if (i4 == 2) {
                    n32 n32Var = (n32) ql3Var;
                    int iK = ck3.K(bArr, i, jwVar);
                    int i7 = jwVar.a + iK;
                    while (iK < i7) {
                        n32Var.b(Double.longBitsToDouble(ck3.C(bArr, iK)));
                        iK += 8;
                    }
                    if (iK == i7) {
                        return iK;
                    }
                    throw qm3.e();
                }
                if (i4 == 1) {
                    n32 n32Var2 = (n32) ql3Var;
                    n32Var2.b(Double.longBitsToDouble(ck3.C(bArr, i)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int iK2 = ck3.K(bArr, i8, jwVar);
                        if (i3 != jwVar.a) {
                            return i8;
                        }
                        n32Var2.b(Double.longBitsToDouble(ck3.C(bArr, iK2)));
                        i8 = iK2 + 8;
                    }
                    return i8;
                }
                return i;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 36:
                if (i4 == 2) {
                    gn2 gn2Var = (gn2) ql3Var;
                    int iK3 = ck3.K(bArr, i, jwVar);
                    int i9 = jwVar.a + iK3;
                    while (iK3 < i9) {
                        gn2Var.b(Float.intBitsToFloat(ck3.B(bArr, iK3)));
                        iK3 += 4;
                    }
                    if (iK3 == i9) {
                        return iK3;
                    }
                    throw qm3.e();
                }
                if (i4 == 5) {
                    gn2 gn2Var2 = (gn2) ql3Var;
                    gn2Var2.b(Float.intBitsToFloat(ck3.B(bArr, i)));
                    int i10 = i + 4;
                    while (i10 < i2) {
                        int iK4 = ck3.K(bArr, i10, jwVar);
                        if (i3 != jwVar.a) {
                            return i10;
                        }
                        gn2Var2.b(Float.intBitsToFloat(ck3.B(bArr, iK4)));
                        i10 = iK4 + 4;
                    }
                    return i10;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    wf4 wf4Var = (wf4) ql3Var;
                    int iK5 = ck3.K(bArr, i, jwVar);
                    int i11 = jwVar.a + iK5;
                    while (iK5 < i11) {
                        iK5 = ck3.M(bArr, iK5, jwVar);
                        wf4Var.b(jwVar.b);
                    }
                    if (iK5 == i11) {
                        return iK5;
                    }
                    throw qm3.e();
                }
                if (i4 == 0) {
                    wf4 wf4Var2 = (wf4) ql3Var;
                    int iM = ck3.M(bArr, i, jwVar);
                    wf4Var2.b(jwVar.b);
                    while (iM < i2) {
                        int iK6 = ck3.K(bArr, iM, jwVar);
                        if (i3 != jwVar.a) {
                            return iM;
                        }
                        iM = ck3.M(bArr, iK6, jwVar);
                        wf4Var2.b(jwVar.b);
                    }
                    return iM;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 != 2) {
                    if (i4 == 0) {
                        return ck3.L(i3, bArr, i, i2, ql3Var, jwVar);
                    }
                    return i;
                }
                nk3 nk3Var = (nk3) ql3Var;
                int iK7 = ck3.K(bArr, i, jwVar);
                int i12 = jwVar.a + iK7;
                while (iK7 < i12) {
                    iK7 = ck3.K(bArr, iK7, jwVar);
                    nk3Var.b(jwVar.a);
                }
                if (iK7 == i12) {
                    return iK7;
                }
                throw qm3.e();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    wf4 wf4Var3 = (wf4) ql3Var;
                    int iK8 = ck3.K(bArr, i, jwVar);
                    int i13 = jwVar.a + iK8;
                    while (iK8 < i13) {
                        wf4Var3.b(ck3.C(bArr, iK8));
                        iK8 += 8;
                    }
                    if (iK8 == i13) {
                        return iK8;
                    }
                    throw qm3.e();
                }
                if (i4 == 1) {
                    wf4 wf4Var4 = (wf4) ql3Var;
                    wf4Var4.b(ck3.C(bArr, i));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int iK9 = ck3.K(bArr, i14, jwVar);
                        if (i3 != jwVar.a) {
                            return i14;
                        }
                        wf4Var4.b(ck3.C(bArr, iK9));
                        i14 = iK9 + 8;
                    }
                    return i14;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    nk3 nk3Var2 = (nk3) ql3Var;
                    int iK10 = ck3.K(bArr, i, jwVar);
                    int i15 = jwVar.a + iK10;
                    while (iK10 < i15) {
                        nk3Var2.b(ck3.B(bArr, iK10));
                        iK10 += 4;
                    }
                    if (iK10 == i15) {
                        return iK10;
                    }
                    throw qm3.e();
                }
                if (i4 == 5) {
                    nk3 nk3Var3 = (nk3) ql3Var;
                    nk3Var3.b(ck3.B(bArr, i));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int iK11 = ck3.K(bArr, i16, jwVar);
                        if (i3 != jwVar.a) {
                            return i16;
                        }
                        nk3Var3.b(ck3.B(bArr, iK11));
                        i16 = iK11 + 4;
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i4 == 2) {
                    o80 o80Var = (o80) ql3Var;
                    int iK12 = ck3.K(bArr, i, jwVar);
                    int i17 = jwVar.a + iK12;
                    while (iK12 < i17) {
                        iK12 = ck3.M(bArr, iK12, jwVar);
                        o80Var.b(jwVar.b != 0);
                    }
                    if (iK12 == i17) {
                        return iK12;
                    }
                    throw qm3.e();
                }
                if (i4 == 0) {
                    o80 o80Var2 = (o80) ql3Var;
                    int iM2 = ck3.M(bArr, i, jwVar);
                    o80Var2.b(jwVar.b != 0);
                    while (iM2 < i2) {
                        int iK13 = ck3.K(bArr, iM2, jwVar);
                        if (i3 != jwVar.a) {
                            return iM2;
                        }
                        iM2 = ck3.M(bArr, iK13, jwVar);
                        o80Var2.b(jwVar.b != 0);
                    }
                    return iM2;
                }
                return i;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int iK14 = ck3.K(bArr, i, jwVar);
                        int i18 = jwVar.a;
                        if (i18 < 0) {
                            throw qm3.c();
                        }
                        if (i18 == 0) {
                            ql3Var.add("");
                        } else {
                            ql3Var.add(new String(bArr, iK14, i18, sl3.a));
                            iK14 += i18;
                        }
                        while (iK14 < i2) {
                            int iK15 = ck3.K(bArr, iK14, jwVar);
                            if (i3 != jwVar.a) {
                                return iK14;
                            }
                            iK14 = ck3.K(bArr, iK15, jwVar);
                            int i19 = jwVar.a;
                            if (i19 < 0) {
                                throw qm3.c();
                            }
                            if (i19 == 0) {
                                ql3Var.add("");
                            } else {
                                ql3Var.add(new String(bArr, iK14, i19, sl3.a));
                                iK14 += i19;
                            }
                        }
                        return iK14;
                    }
                    int iK16 = ck3.K(bArr, i, jwVar);
                    int i20 = jwVar.a;
                    if (i20 < 0) {
                        throw qm3.c();
                    }
                    if (i20 == 0) {
                        ql3Var.add("");
                    } else {
                        int i21 = iK16 + i20;
                        if (!ha8.a.q(bArr, iK16, i21)) {
                            throw qm3.a();
                        }
                        ql3Var.add(new String(bArr, iK16, i20, sl3.a));
                        iK16 = i21;
                    }
                    while (iK16 < i2) {
                        int iK17 = ck3.K(bArr, iK16, jwVar);
                        if (i3 != jwVar.a) {
                            return iK16;
                        }
                        iK16 = ck3.K(bArr, iK17, jwVar);
                        int i22 = jwVar.a;
                        if (i22 < 0) {
                            throw qm3.c();
                        }
                        if (i22 == 0) {
                            ql3Var.add("");
                        } else {
                            int i23 = iK16 + i22;
                            if (!ha8.a.q(bArr, iK16, i23)) {
                                throw qm3.a();
                            }
                            ql3Var.add(new String(bArr, iK16, i22, sl3.a));
                            iK16 = i23;
                        }
                    }
                    return iK16;
                }
                return i;
            case 27:
                if (i4 == 2) {
                    return ck3.F(o(i5), i3, bArr, i, i2, ql3Var, jwVar);
                }
                return i;
            case 28:
                if (i4 == 2) {
                    int iK18 = ck3.K(bArr, i, jwVar);
                    int i24 = jwVar.a;
                    if (i24 < 0) {
                        throw qm3.c();
                    }
                    if (i24 > bArr.length - iK18) {
                        throw qm3.e();
                    }
                    if (i24 == 0) {
                        ql3Var.add(yh0.n);
                    } else {
                        ql3Var.add(yh0.c(bArr, iK18, i24));
                        iK18 += i24;
                    }
                    while (iK18 < i2) {
                        int iK19 = ck3.K(bArr, iK18, jwVar);
                        if (i3 != jwVar.a) {
                            return iK18;
                        }
                        iK18 = ck3.K(bArr, iK19, jwVar);
                        int i25 = jwVar.a;
                        if (i25 < 0) {
                            throw qm3.c();
                        }
                        if (i25 > bArr.length - iK18) {
                            throw qm3.e();
                        }
                        if (i25 == 0) {
                            ql3Var.add(yh0.n);
                        } else {
                            ql3Var.add(yh0.c(bArr, iK18, i25));
                            iK18 += i25;
                        }
                    }
                    return iK18;
                }
                return i;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        iL = ck3.L(i3, bArr, i, i2, ql3Var, jwVar);
                    }
                    return i;
                }
                nk3 nk3Var4 = (nk3) ql3Var;
                iL = ck3.K(bArr, i, jwVar);
                int i26 = jwVar.a + iL;
                while (iL < i26) {
                    iL = ck3.K(bArr, iL, jwVar);
                    nk3Var4.b(jwVar.a);
                }
                if (iL != i26) {
                    throw qm3.e();
                }
                ny2 ny2Var = (ny2) obj;
                k88 k88Var = ny2Var.unknownFields;
                if (k88Var == k88.f) {
                    k88Var = null;
                }
                m(i5);
                Class cls = gj6.a;
                if (k88Var != null) {
                    ny2Var.unknownFields = k88Var;
                }
                return iL;
            case 33:
            case 47:
                if (i4 == 2) {
                    nk3 nk3Var5 = (nk3) ql3Var;
                    int iK20 = ck3.K(bArr, i, jwVar);
                    int i27 = jwVar.a + iK20;
                    while (iK20 < i27) {
                        iK20 = ck3.K(bArr, iK20, jwVar);
                        nk3Var5.b(uu0.b(jwVar.a));
                    }
                    if (iK20 == i27) {
                        return iK20;
                    }
                    throw qm3.e();
                }
                if (i4 == 0) {
                    nk3 nk3Var6 = (nk3) ql3Var;
                    int iK21 = ck3.K(bArr, i, jwVar);
                    nk3Var6.b(uu0.b(jwVar.a));
                    while (iK21 < i2) {
                        int iK22 = ck3.K(bArr, iK21, jwVar);
                        if (i3 != jwVar.a) {
                            return iK21;
                        }
                        iK21 = ck3.K(bArr, iK22, jwVar);
                        nk3Var6.b(uu0.b(jwVar.a));
                    }
                    return iK21;
                }
                return i;
            case 34:
            case 48:
                if (i4 == 2) {
                    wf4 wf4Var5 = (wf4) ql3Var;
                    int iK23 = ck3.K(bArr, i, jwVar);
                    int i28 = jwVar.a + iK23;
                    while (iK23 < i28) {
                        iK23 = ck3.M(bArr, iK23, jwVar);
                        wf4Var5.b(uu0.c(jwVar.b));
                    }
                    if (iK23 == i28) {
                        return iK23;
                    }
                    throw qm3.e();
                }
                if (i4 == 0) {
                    wf4 wf4Var6 = (wf4) ql3Var;
                    int iM3 = ck3.M(bArr, i, jwVar);
                    wf4Var6.b(uu0.c(jwVar.b));
                    while (iM3 < i2) {
                        int iK24 = ck3.K(bArr, iM3, jwVar);
                        if (i3 != jwVar.a) {
                            return iM3;
                        }
                        iM3 = ck3.M(bArr, iK24, jwVar);
                        wf4Var6.b(uu0.c(jwVar.b));
                    }
                    return iM3;
                }
                return i;
            case 49:
                if (i4 == 3) {
                    bj6 bj6VarO = o(i5);
                    int i29 = (i3 & (-8)) | 4;
                    int iD = ck3.D(bj6VarO, bArr, i, i2, i29, jwVar);
                    int i30 = i29;
                    ql3Var.add(jwVar.c);
                    while (iD < i2) {
                        int iK25 = ck3.K(bArr, iD, jwVar);
                        if (i3 != jwVar.a) {
                            return iD;
                        }
                        int i31 = i30;
                        iD = ck3.D(bj6VarO, bArr, iK25, i2, i31, jwVar);
                        ql3Var.add(jwVar.c);
                        i30 = i31;
                    }
                    return iD;
                }
                return i;
            default:
                return i;
        }
    }

    public final void C(Object obj, int i, o36 o36Var) {
        if ((536870912 & i) != 0) {
            d98.p(i & 1048575, obj, o36Var.K());
        } else if (this.f) {
            d98.p(i & 1048575, obj, o36Var.x());
        } else {
            d98.p(i & 1048575, obj, o36Var.B());
        }
    }

    public final void E(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        d98.n(d98.h(j, obj) | (1 << (i2 >>> 20)), j, obj);
    }

    public final void F(int i, int i2, Object obj) {
        d98.n(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int G(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    public final int I(int i) {
        return this.a[i + 1];
    }

    @Override // o.bj6
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jI = I(iArr[i2]) & 1048575;
            Object objJ = d98.j(jI, obj);
            if (objJ != null) {
                this.n.getClass();
                ((pm4) objJ).m = false;
                d98.p(jI, obj, objJ);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        ((m88) this.m).getClass();
        ((ny2) obj).unknownFields.e = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    @Override // o.bj6
    public final boolean b(Object obj) {
        int i;
        int iH;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zP = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int I = I(i5);
            boolean z = this.g;
            if (z) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & I) == 0) {
                iH = H(I);
                if (iH != 9 || iH == 17) {
                    if (z) {
                        zP = p(i5, obj);
                    } else if ((i & i4) == 0) {
                        zP = false;
                    }
                    if (!zP || o(i5).b(d98.j(I & 1048575, obj))) {
                        i3++;
                    }
                } else {
                    if (iH != 27) {
                        if (iH == 60 || iH == 68) {
                            if (!q(i6, i5, obj) || o(i5).b(d98.j(I & 1048575, obj))) {
                            }
                        } else if (iH != 49) {
                            if (iH != 50) {
                                continue;
                            } else {
                                Object objJ = d98.j(I & 1048575, obj);
                                this.n.getClass();
                                if (!((pm4) objJ).isEmpty()) {
                                    ua5.u(n(i5));
                                    throw null;
                                }
                            }
                        }
                        i3++;
                    }
                    List list = (List) d98.j(I & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bj6 bj6VarO = o(i5);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (bj6VarO.b(list.get(i9))) {
                            }
                        }
                    }
                    i3++;
                }
            } else {
                if (z ? p(i5, obj) : (i4 & i) != 0) {
                    iH = H(I);
                    if (iH != 9) {
                    }
                    if (z) {
                        zP = p(i5, obj);
                    } else if ((i & i4) == 0) {
                        zP = false;
                    }
                    if (!zP) {
                        continue;
                    }
                    i3++;
                }
            }
            return false;
        }
    }

    @Override // o.bj6
    public final Object c() {
        this.k.getClass();
        return ((ny2) this.e).f(4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0063. Please report as an issue. */
    @Override // o.bj6
    public final void d(Object obj, byte[] bArr, int i, int i2, jw jwVar) throws qm3 {
        int iG;
        int i3;
        int i4;
        Object obj2;
        int iM;
        Object obj3;
        int iK;
        int i5;
        int i6;
        uq4 uq4Var = this;
        byte[] bArr2 = bArr;
        int i7 = i2;
        jw jwVar2 = jwVar;
        if (!uq4Var.g) {
            A(obj, bArr, i, i7, 0, jwVar);
            return;
        }
        int i8 = 0;
        int i9 = -1;
        int I = i;
        int i10 = 0;
        int i11 = -1;
        while (I < i7) {
            int iJ = I + 1;
            int i12 = bArr2[I];
            if (i12 < 0) {
                iJ = ck3.J(i12, bArr2, iJ, jwVar2);
                i12 = jwVar2.a;
            }
            int i13 = i12;
            int i14 = iJ;
            int i15 = (i13 == true ? 1 : 0) >>> 3;
            int i16 = (i13 == true ? 1 : 0) & 7;
            int i17 = uq4Var.d;
            int i18 = uq4Var.c;
            if (i15 > i11) {
                int i19 = i10 / 3;
                if (i15 < i18 || i15 > i17) {
                    iG = i9;
                } else {
                    iG = uq4Var.G(i15, i19);
                }
            } else if (i15 < i18 || i15 > i17) {
                iG = i9;
            } else {
                iG = uq4Var.G(i15, i8);
            }
            int i20 = iG;
            if (i20 == i9) {
                i3 = i14;
                i4 = i15;
                i20 = i8;
            } else {
                int i21 = uq4Var.a[i20 + 1];
                int iH = H(i21);
                long j = 1048575 & i21;
                Unsafe unsafe = p;
                if (iH <= 17) {
                    switch (iH) {
                        case 0:
                            if (i16 != 1) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                obj2 = obj;
                                d98.d.g(obj2, j, Double.longBitsToDouble(ck3.C(bArr2, i14)));
                                iK = i14 + 8;
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 1:
                            if (i16 != 5) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                d98.d.h(obj, j, Float.intBitsToFloat(ck3.B(bArr2, i14)));
                                iK = i14 + 4;
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iM = ck3.M(bArr2, i14, jwVar2);
                                obj3 = obj;
                                unsafe.putLong(obj3, j, jwVar2.b);
                                I = iM;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = ck3.K(bArr2, i14, jwVar2);
                                unsafe.putInt(obj, j, jwVar2.a);
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            if (i16 != 1) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                obj2 = obj;
                                unsafe.putLong(obj2, j, ck3.C(bArr2, i14));
                                iK = i14 + 8;
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            if (i16 != 5) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                unsafe.putInt(obj, j, ck3.B(bArr2, i14));
                                iK = i14 + 4;
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 7:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                int iM2 = ck3.M(bArr2, i14, jwVar2);
                                d98.d.e(obj, j, jwVar2.b != 0);
                                I = iM2;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 8:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = (536870912 & i21) == 0 ? ck3.G(bArr2, i14, jwVar2) : ck3.H(bArr2, i14, jwVar2);
                                unsafe.putObject(obj, j, jwVar2.c);
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case ep1.b /* 9 */:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = ck3.E(uq4Var.o(i20), bArr2, i14, i7, jwVar2);
                                Object object = unsafe.getObject(obj, j);
                                Object obj4 = jwVar2.c;
                                if (object == null) {
                                    unsafe.putObject(obj, j, obj4);
                                } else {
                                    unsafe.putObject(obj, j, sl3.c(object, obj4));
                                }
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case ep1.c /* 10 */:
                            if (i16 != 2) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = ck3.A(bArr2, i14, jwVar2);
                                unsafe.putObject(obj, j, jwVar2.c);
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case ep1.d /* 12 */:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = ck3.K(bArr2, i14, jwVar2);
                                unsafe.putInt(obj, j, jwVar2.a);
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case 15:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iK = ck3.K(bArr2, i14, jwVar2);
                                unsafe.putInt(obj, j, uu0.b(jwVar2.a));
                                I = iK;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                            if (i16 != 0) {
                                i5 = i14;
                                i6 = i15;
                                i3 = i5;
                                i4 = i6;
                            } else {
                                iM = ck3.M(bArr2, i14, jwVar2);
                                obj3 = obj;
                                unsafe.putLong(obj3, j, uu0.c(jwVar2.b));
                                I = iM;
                                i11 = i15;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                            }
                            break;
                        default:
                            i5 = i14;
                            i6 = i15;
                            i3 = i5;
                            i4 = i6;
                            break;
                    }
                } else if (iH != 27) {
                    int i22 = i13 == true ? 1 : 0;
                    if (iH <= 49) {
                        i13 = i22;
                        i6 = i15;
                        int iB = uq4Var.B(obj, bArr, i14, i2, i13 == true ? 1 : 0, i16, i20, i21, iH, j, jwVar);
                        i20 = i20;
                        if (iB != i14) {
                            bArr2 = bArr;
                            i7 = i2;
                            jwVar2 = jwVar;
                            I = iB;
                            i10 = i20;
                            i11 = i6;
                            i8 = 0;
                            i9 = -1;
                        } else {
                            i3 = iB;
                            i4 = i6;
                        }
                    } else {
                        i13 = i22;
                        i6 = i15;
                        i5 = i14;
                        if (iH == 50) {
                            if (i16 == 2) {
                                uq4Var.y(i20, j, obj);
                                throw null;
                            }
                            i3 = i5;
                            i4 = i6;
                        } else {
                            int iZ = uq4Var.z(obj, bArr, i5, i2, i13 == true ? 1 : 0, i6, i16, i21, iH, j, i20, jwVar);
                            i4 = i6;
                            if (iZ != i5) {
                                uq4Var = this;
                                i7 = i2;
                                jwVar2 = jwVar;
                                I = iZ;
                                i11 = i4;
                                i10 = i20;
                                i8 = 0;
                                i9 = -1;
                                bArr2 = bArr;
                            } else {
                                i3 = iZ;
                            }
                        }
                    }
                } else if (i16 == 2) {
                    ql3 ql3VarZ = (ql3) unsafe.getObject(obj, j);
                    if (!((e2) ql3VarZ).m) {
                        int size = ql3VarZ.size();
                        ql3VarZ = ql3VarZ.z(size == 0 ? 10 : size * 2);
                        unsafe.putObject(obj, j, ql3VarZ);
                    }
                    I = ck3.F(uq4Var.o(i20), i13 == true ? 1 : 0, bArr2, i14, i7, ql3VarZ, jwVar2);
                    bArr2 = bArr;
                    i7 = i2;
                    jwVar2 = jwVar;
                    i11 = i15;
                    i10 = i20;
                    i8 = 0;
                    i9 = -1;
                } else {
                    i13 = i13 == true ? 1 : 0;
                    i5 = i14;
                    i6 = i15;
                    i3 = i5;
                    i4 = i6;
                }
            }
            ny2 ny2Var = (ny2) obj;
            k88 k88VarB = ny2Var.unknownFields;
            if (k88VarB == k88.f) {
                k88VarB = k88.b();
                ny2Var.unknownFields = k88VarB;
            }
            bArr2 = bArr;
            jwVar2 = jwVar;
            I = ck3.I(i13 == true ? 1 : 0, bArr, i3, i2, k88VarB, jwVar);
            i7 = i2;
            i11 = i4;
            i10 = i20;
            i8 = 0;
            i9 = -1;
            uq4Var = this;
        }
        if (I != i7) {
            throw qm3.d();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:193:0x076a A[PHI: r10
      0x076a: PHI (r10v35 boolean) = 
      (r10v6 boolean)
      (r10v6 boolean)
      (r10v7 boolean)
      (r10v7 boolean)
      (r10v8 boolean)
      (r10v9 boolean)
      (r10v11 boolean)
      (r10v12 boolean)
      (r10v13 boolean)
      (r10v15 boolean)
      (r10v16 boolean)
      (r10v17 boolean)
      (r10v18 boolean)
      (r10v19 boolean)
      (r10v20 boolean)
      (r10v21 boolean)
      (r10v22 boolean)
      (r10v23 boolean)
      (r10v24 boolean)
      (r10v25 boolean)
      (r10v26 boolean)
      (r10v27 boolean)
      (r10v28 boolean)
      (r10v29 boolean)
      (r10v30 boolean)
      (r10v31 boolean)
      (r10v31 boolean)
      (r10v32 boolean)
      (r10v34 boolean)
      (r10v36 boolean)
     binds: [B:315:0x0b3c, B:316:0x0b3e, B:312:0x0b2c, B:313:0x0b2e, B:310:0x0b27, B:309:0x0b1a, B:287:0x0aac, B:285:0x0a9d, B:275:0x0a67, B:273:0x0a51, B:267:0x0a30, B:266:0x0a22, B:265:0x0a14, B:264:0x0a06, B:263:0x09f8, B:262:0x09ea, B:261:0x09dc, B:260:0x09ce, B:256:0x0995, B:255:0x0987, B:254:0x0979, B:253:0x096b, B:252:0x095d, B:251:0x094f, B:222:0x0819, B:219:0x0806, B:220:0x0808, B:217:0x07f4, B:195:0x0771, B:192:0x075f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.bj6
    public final void e(Object obj, df6 df6Var) throws zu0 {
        int i;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        int i2;
        df6Var.getClass();
        yu0 yu0Var = (yu0) df6Var.n;
        i88 i88Var = this.m;
        rm4 rm4Var = this.n;
        int i3 = 1048575;
        boolean z4 = true;
        boolean z5 = this.g;
        int[] iArr = this.a;
        if (z5) {
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                int I = I(i4);
                int i5 = iArr[i4];
                switch (H(I)) {
                    case 0:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d98.d.c(I & i2, obj));
                            yu0Var.p(i5, 1);
                            yu0Var.n(jDoubleToRawLongBits);
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 1:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iFloatToRawIntBits = Float.floatToRawIntBits(d98.d.d(I & i2, obj));
                            yu0Var.p(i5, 5);
                            yu0Var.m(iFloatToRawIntBits);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 2:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jI = d98.i(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r(jI);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 3:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jI2 = d98.i(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r(jI2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 4:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH = d98.h(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.o(iH);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 5:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jI3 = d98.i(I & i2, obj);
                            yu0Var.p(i5, 1);
                            yu0Var.n(jI3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 6:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH2 = d98.h(I & i2, obj);
                            yu0Var.p(i5, 5);
                            yu0Var.m(iH2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 7:
                        i2 = i3;
                        if (p(i4, obj)) {
                            boolean zA = d98.d.a(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.k(zA ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 8:
                        i2 = i3;
                        if (p(i4, obj)) {
                            J(i5, d98.j(I & i2, obj), df6Var);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case ep1.b /* 9 */:
                        i2 = i3;
                        if (p(i4, obj)) {
                            df6Var.y(i5, d98.j(I & i2, obj), o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case ep1.c /* 10 */:
                        i2 = i3;
                        if (p(i4, obj)) {
                            df6Var.w(i5, (yh0) d98.j(I & i2, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 11:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH3 = d98.h(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.q(iH3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case ep1.d /* 12 */:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH4 = d98.h(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.o(iH4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 13:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH5 = d98.h(I & i2, obj);
                            yu0Var.p(i5, 5);
                            yu0Var.m(iH5);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 14:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jI4 = d98.i(I & i2, obj);
                            yu0Var.p(i5, 1);
                            yu0Var.n(jI4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 15:
                        i2 = i3;
                        if (p(i4, obj)) {
                            int iH6 = d98.h(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.q((iH6 >> 31) ^ (iH6 << 1));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        i2 = i3;
                        if (p(i4, obj)) {
                            long jI5 = d98.i(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r((jI5 << 1) ^ (jI5 >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 17:
                        i2 = i3;
                        if (p(i4, obj)) {
                            df6Var.x(i5, d98.j(I & i2, obj), o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        i2 = i3;
                        gj6.A(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        i2 = i3;
                        gj6.E(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 20:
                        i2 = i3;
                        gj6.H(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 21:
                        i2 = i3;
                        gj6.P(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 22:
                        i2 = i3;
                        gj6.G(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 23:
                        i2 = i3;
                        gj6.D(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 24:
                        i2 = i3;
                        gj6.C(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 25:
                        i2 = i3;
                        gj6.y(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 26:
                        i2 = i3;
                        gj6.N(iArr[i4], (List) d98.j(I & i2, obj), df6Var);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 27:
                        i2 = i3;
                        gj6.I(iArr[i4], (List) d98.j(I & i2, obj), df6Var, o(i4));
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 28:
                        i2 = i3;
                        gj6.z(iArr[i4], (List) d98.j(I & i2, obj), df6Var);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 29:
                        i2 = i3;
                        gj6.O(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 30:
                        i2 = i3;
                        gj6.B(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 31:
                        i2 = i3;
                        gj6.J(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 32:
                        i2 = i3;
                        gj6.K(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 33:
                        i2 = i3;
                        gj6.L(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 34:
                        i2 = i3;
                        gj6.M(iArr[i4], (List) d98.j(I & i2, obj), df6Var, false);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 35:
                        i2 = i3;
                        gj6.A(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 36:
                        i2 = i3;
                        gj6.E(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 37:
                        i2 = i3;
                        gj6.H(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 38:
                        i2 = i3;
                        gj6.P(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 39:
                        i2 = i3;
                        gj6.G(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 40:
                        i2 = i3;
                        gj6.D(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 41:
                        i2 = i3;
                        gj6.C(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 42:
                        i2 = i3;
                        gj6.y(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 43:
                        i2 = i3;
                        gj6.O(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 44:
                        i2 = i3;
                        gj6.B(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 45:
                        i2 = i3;
                        gj6.J(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 46:
                        i2 = i3;
                        gj6.K(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 47:
                        i2 = i3;
                        gj6.L(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 48:
                        i2 = i3;
                        gj6.M(iArr[i4], (List) d98.j(I & i2, obj), df6Var, true);
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 49:
                        i2 = i3;
                        gj6.F(iArr[i4], (List) d98.j(I & i2, obj), df6Var, o(i4));
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 50:
                        i2 = i3;
                        if (d98.j(I & i2, obj) != null) {
                            Object objN = n(i4);
                            rm4Var.getClass();
                            ua5.u(objN);
                            throw null;
                        }
                        continue;
                        i4 += 3;
                        i3 = i2;
                        break;
                        break;
                    case 51:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) d98.j(I & i2, obj)).doubleValue());
                            yu0Var.p(i5, 1);
                            yu0Var.n(jDoubleToRawLongBits2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 52:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iFloatToRawIntBits2 = Float.floatToRawIntBits(((Float) d98.j(I & i2, obj)).floatValue());
                            yu0Var.p(i5, 5);
                            yu0Var.m(iFloatToRawIntBits2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 53:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jX = x(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r(jX);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 54:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jX2 = x(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r(jX2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 55:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW = w(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.o(iW);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 56:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jX3 = x(I & i2, obj);
                            yu0Var.p(i5, 1);
                            yu0Var.n(jX3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 57:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW2 = w(I & i2, obj);
                            yu0Var.p(i5, 5);
                            yu0Var.m(iW2);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 58:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            boolean zBooleanValue = ((Boolean) d98.j(I & i2, obj)).booleanValue();
                            yu0Var.p(i5, 0);
                            yu0Var.k(zBooleanValue ? (byte) 1 : (byte) 0);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 59:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            J(i5, d98.j(I & i2, obj), df6Var);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 60:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            df6Var.y(i5, d98.j(I & i2, obj), o(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 61:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            df6Var.w(i5, (yh0) d98.j(I & i2, obj));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 62:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW3 = w(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.q(iW3);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 63:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW4 = w(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.o(iW4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 64:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW5 = w(I & i2, obj);
                            yu0Var.p(i5, 5);
                            yu0Var.m(iW5);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 65:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jX4 = x(I & i2, obj);
                            yu0Var.p(i5, 1);
                            yu0Var.n(jX4);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 66:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            int iW6 = w(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.q((iW6 >> 31) ^ (iW6 << 1));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 67:
                        i2 = i3;
                        if (q(i5, i4, obj)) {
                            long jX5 = x(I & i2, obj);
                            yu0Var.p(i5, 0);
                            yu0Var.r((jX5 << 1) ^ (jX5 >> 63));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                    case 68:
                        if (q(i5, i4, obj)) {
                            i2 = i3;
                            df6Var.x(i5, d98.j(I & i3, obj), o(i4));
                        }
                        i4 += 3;
                        i3 = i2;
                        break;
                }
                i2 = i3;
                i4 += 3;
                i3 = i2;
            }
            ((m88) i88Var).getClass();
            ((ny2) obj).unknownFields.d(df6Var);
            return;
        }
        int length2 = iArr.length;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length2) {
            int I2 = I(i7);
            int i9 = iArr[i7];
            boolean z6 = z4;
            int iH7 = H(I2);
            Unsafe unsafe = p;
            i88 i88Var2 = i88Var;
            if (z5 || iH7 > 17) {
                i = 0;
            } else {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & 1048575;
                if (i11 != i6) {
                    i8 = unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = (z6 ? 1 : 0) << (i10 >>> 20);
            }
            long j = I2 & 1048575;
            switch (iH7) {
                case 0:
                    z = false;
                    c = 5;
                    if ((i & i8) != 0) {
                        long jDoubleToRawLongBits3 = Double.doubleToRawLongBits(d98.d.c(j, obj));
                        z2 = true;
                        yu0Var.p(i9, 1);
                        yu0Var.n(jDoubleToRawLongBits3);
                    } else {
                        z2 = true;
                    }
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 1:
                    z = false;
                    if ((i & i8) != 0) {
                        int iFloatToRawIntBits3 = Float.floatToRawIntBits(d98.d.d(j, obj));
                        c = 5;
                        yu0Var.p(i9, 5);
                        yu0Var.m(iFloatToRawIntBits3);
                    } else {
                        c = 5;
                    }
                    z2 = true;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 2:
                    z = false;
                    if ((i & i8) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        yu0Var.p(i9, 0);
                        yu0Var.r(j2);
                    }
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 3:
                    z = false;
                    if ((i & i8) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        yu0Var.p(i9, 0);
                        yu0Var.r(j3);
                    }
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 4:
                    if ((i & i8) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.o(i12);
                    } else {
                        z = false;
                    }
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 5:
                    if ((i & i8) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        yu0Var.p(i9, 1);
                        yu0Var.n(j4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 6:
                    if ((i & i8) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        yu0Var.p(i9, 5);
                        yu0Var.m(i13);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 7:
                    if ((i & i8) != 0) {
                        boolean zA2 = d98.d.a(j, obj);
                        yu0Var.p(i9, 0);
                        yu0Var.k(zA2 ? (byte) 1 : (byte) 0);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 8:
                    if ((i & i8) != 0) {
                        J(i9, unsafe.getObject(obj, j), df6Var);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case ep1.b /* 9 */:
                    if ((i & i8) != 0) {
                        df6Var.y(i9, unsafe.getObject(obj, j), o(i7));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case ep1.c /* 10 */:
                    if ((i & i8) != 0) {
                        df6Var.w(i9, (yh0) unsafe.getObject(obj, j));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 11:
                    z = false;
                    if ((i & i8) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        yu0Var.p(i9, 0);
                        yu0Var.q(i14);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case ep1.d /* 12 */:
                    if ((i & i8) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.o(i15);
                        z2 = true;
                        c = 5;
                        i7 += 3;
                        i88Var = i88Var2;
                        length2 = length2;
                        z4 = z2;
                        rm4Var = rm4Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 13:
                    if ((i & i8) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        yu0Var.p(i9, 5);
                        yu0Var.m(i16);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 14:
                    if ((i & i8) != 0) {
                        long j5 = unsafe.getLong(obj, j);
                        yu0Var.p(i9, 1);
                        yu0Var.n(j5);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 15:
                    z = false;
                    if ((i & i8) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        yu0Var.p(i9, 0);
                        yu0Var.q((i17 >> 31) ^ (i17 << 1));
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if ((i & i8) != 0) {
                        long j6 = unsafe.getLong(obj, j);
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.r((j6 >> 63) ^ (j6 << 1));
                        z2 = true;
                        c = 5;
                        i7 += 3;
                        i88Var = i88Var2;
                        length2 = length2;
                        z4 = z2;
                        rm4Var = rm4Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 17:
                    if ((i & i8) != 0) {
                        df6Var.x(i9, unsafe.getObject(obj, j), o(i7));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    z = false;
                    gj6.A(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    z = false;
                    gj6.E(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 20:
                    z = false;
                    gj6.H(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 21:
                    z = false;
                    gj6.P(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 22:
                    z = false;
                    gj6.G(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 23:
                    z = false;
                    gj6.D(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 24:
                    z = false;
                    gj6.C(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 25:
                    z = false;
                    gj6.y(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 26:
                    gj6.N(iArr[i7], (List) unsafe.getObject(obj, j), df6Var);
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 27:
                    gj6.I(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, o(i7));
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 28:
                    gj6.z(iArr[i7], (List) unsafe.getObject(obj, j), df6Var);
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 29:
                    z = false;
                    gj6.O(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 30:
                    z = false;
                    gj6.B(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 31:
                    z = false;
                    gj6.J(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 32:
                    z = false;
                    gj6.K(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 33:
                    z = false;
                    gj6.L(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 34:
                    z = false;
                    gj6.M(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, false);
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 35:
                    z3 = z6 ? 1 : 0;
                    gj6.A(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 36:
                    z3 = z6 ? 1 : 0;
                    gj6.E(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 37:
                    z3 = z6 ? 1 : 0;
                    gj6.H(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 38:
                    z3 = z6 ? 1 : 0;
                    gj6.P(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 39:
                    z3 = z6 ? 1 : 0;
                    gj6.G(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 40:
                    z3 = z6 ? 1 : 0;
                    gj6.D(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 41:
                    z3 = z6 ? 1 : 0;
                    gj6.C(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 42:
                    z3 = z6 ? 1 : 0;
                    gj6.y(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 43:
                    z3 = z6 ? 1 : 0;
                    gj6.O(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 44:
                    z3 = z6 ? 1 : 0;
                    gj6.B(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 45:
                    z3 = z6 ? 1 : 0;
                    gj6.J(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 46:
                    z3 = z6 ? 1 : 0;
                    gj6.K(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 47:
                    z3 = z6 ? 1 : 0;
                    gj6.L(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, z3);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 48:
                    z3 = true;
                    gj6.M(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, true);
                    z2 = z3;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 49:
                    gj6.F(iArr[i7], (List) unsafe.getObject(obj, j), df6Var, o(i7));
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objN2 = n(i7);
                        rm4Var.getClass();
                        ua5.u(objN2);
                        throw null;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 51:
                    if (q(i9, i7, obj)) {
                        long jDoubleToRawLongBits4 = Double.doubleToRawLongBits(((Double) d98.j(j, obj)).doubleValue());
                        yu0Var.p(i9, 1);
                        yu0Var.n(jDoubleToRawLongBits4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 52:
                    if (q(i9, i7, obj)) {
                        int iFloatToRawIntBits4 = Float.floatToRawIntBits(((Float) d98.j(j, obj)).floatValue());
                        yu0Var.p(i9, 5);
                        yu0Var.m(iFloatToRawIntBits4);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 53:
                    z = false;
                    if (q(i9, i7, obj)) {
                        long jX6 = x(j, obj);
                        yu0Var.p(i9, 0);
                        yu0Var.r(jX6);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 54:
                    z = false;
                    if (q(i9, i7, obj)) {
                        long jX7 = x(j, obj);
                        yu0Var.p(i9, 0);
                        yu0Var.r(jX7);
                    }
                    z2 = true;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 55:
                    if (q(i9, i7, obj)) {
                        int iW7 = w(j, obj);
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.o(iW7);
                        z2 = true;
                        c = 5;
                        i7 += 3;
                        i88Var = i88Var2;
                        length2 = length2;
                        z4 = z2;
                        rm4Var = rm4Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 56:
                    if (q(i9, i7, obj)) {
                        long jX8 = x(j, obj);
                        yu0Var.p(i9, 1);
                        yu0Var.n(jX8);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 57:
                    if (q(i9, i7, obj)) {
                        int iW8 = w(j, obj);
                        yu0Var.p(i9, 5);
                        yu0Var.m(iW8);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 58:
                    if (q(i9, i7, obj)) {
                        boolean zBooleanValue2 = ((Boolean) d98.j(j, obj)).booleanValue();
                        yu0Var.p(i9, 0);
                        yu0Var.k(zBooleanValue2 ? (byte) 1 : (byte) 0);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 59:
                    if (q(i9, i7, obj)) {
                        J(i9, unsafe.getObject(obj, j), df6Var);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 60:
                    if (q(i9, i7, obj)) {
                        df6Var.y(i9, unsafe.getObject(obj, j), o(i7));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 61:
                    if (q(i9, i7, obj)) {
                        df6Var.w(i9, (yh0) unsafe.getObject(obj, j));
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 62:
                    z = false;
                    if (q(i9, i7, obj)) {
                        int iW9 = w(j, obj);
                        yu0Var.p(i9, 0);
                        yu0Var.q(iW9);
                        z2 = true;
                        z = false;
                    } else {
                        z2 = true;
                    }
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 63:
                    if (q(i9, i7, obj)) {
                        int iW10 = w(j, obj);
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.o(iW10);
                        z2 = true;
                        c = 5;
                        i7 += 3;
                        i88Var = i88Var2;
                        length2 = length2;
                        z4 = z2;
                        rm4Var = rm4Var;
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 64:
                    if (q(i9, i7, obj)) {
                        int iW11 = w(j, obj);
                        yu0Var.p(i9, 5);
                        yu0Var.m(iW11);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 65:
                    if (q(i9, i7, obj)) {
                        long jX9 = x(j, obj);
                        yu0Var.p(i9, z6 ? 1 : 0);
                        yu0Var.n(jX9);
                    }
                    z2 = true;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 66:
                    z = false;
                    if (q(i9, i7, obj)) {
                        int iW12 = w(j, obj);
                        yu0Var.p(i9, 0);
                        yu0Var.q((iW12 >> 31) ^ (iW12 << 1));
                        z2 = z6 ? 1 : 0;
                        z = false;
                    } else {
                        z2 = z6 ? 1 : 0;
                    }
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 67:
                    if (q(i9, i7, obj)) {
                        long jX10 = x(j, obj);
                        long j7 = (jX10 >> 63) ^ (jX10 << (z6 ? 1L : 0L));
                        z = false;
                        yu0Var.p(i9, 0);
                        yu0Var.r(j7);
                        z2 = z6 ? 1 : 0;
                        c = 5;
                        i7 += 3;
                        i88Var = i88Var2;
                        length2 = length2;
                        z4 = z2;
                        rm4Var = rm4Var;
                    }
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                case 68:
                    if (q(i9, i7, obj)) {
                        df6Var.x(i9, unsafe.getObject(obj, j), o(i7));
                    }
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
                default:
                    z2 = z6 ? 1 : 0;
                    z = false;
                    c = 5;
                    i7 += 3;
                    i88Var = i88Var2;
                    length2 = length2;
                    z4 = z2;
                    rm4Var = rm4Var;
                    break;
            }
        }
        ((m88) i88Var).getClass();
        ((ny2) obj).unknownFields.d(df6Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // o.bj6
    public final boolean f(ny2 ny2Var, ny2 ny2Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int I = I(i);
                long j = I & 1048575;
                switch (H(I)) {
                    case 0:
                        if (!k(ny2Var, ny2Var2, i)) {
                            zX = false;
                        } else {
                            c98 c98Var = d98.d;
                            if (Double.doubleToLongBits(c98Var.c(j, ny2Var)) != Double.doubleToLongBits(c98Var.c(j, ny2Var2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(ny2Var, ny2Var2, i)) {
                            zX = false;
                        } else {
                            c98 c98Var2 = d98.d;
                            if (Float.floatToIntBits(c98Var2.d(j, ny2Var)) != Float.floatToIntBits(c98Var2.d(j, ny2Var2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(ny2Var, ny2Var2, i) || d98.i(j, ny2Var) != d98.i(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 3:
                        if (!k(ny2Var, ny2Var2, i) || d98.i(j, ny2Var) != d98.i(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 4:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 5:
                        if (!k(ny2Var, ny2Var2, i) || d98.i(j, ny2Var) != d98.i(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 6:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 7:
                        if (!k(ny2Var, ny2Var2, i)) {
                            zX = false;
                        } else {
                            c98 c98Var3 = d98.d;
                            if (c98Var3.a(j, ny2Var) != c98Var3.a(j, ny2Var2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(ny2Var, ny2Var2, i) || !gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2))) {
                            zX = false;
                        }
                        break;
                    case ep1.b /* 9 */:
                        if (!k(ny2Var, ny2Var2, i) || !gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2))) {
                            zX = false;
                        }
                        break;
                    case ep1.c /* 10 */:
                        if (!k(ny2Var, ny2Var2, i) || !gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2))) {
                            zX = false;
                        }
                        break;
                    case 11:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case ep1.d /* 12 */:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 13:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 14:
                        if (!k(ny2Var, ny2Var2, i) || d98.i(j, ny2Var) != d98.i(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 15:
                        if (!k(ny2Var, ny2Var2, i) || d98.h(j, ny2Var) != d98.h(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        if (!k(ny2Var, ny2Var2, i) || d98.i(j, ny2Var) != d98.i(j, ny2Var2)) {
                            zX = false;
                        }
                        break;
                    case 17:
                        if (!k(ny2Var, ny2Var2, i) || !gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2))) {
                            zX = false;
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
                        zX = gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2));
                        break;
                    case 50:
                        zX = gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2));
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
                        if (d98.h(j2, ny2Var) != d98.h(j2, ny2Var2) || !gj6.x(d98.j(j, ny2Var), d98.j(j, ny2Var2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                m88 m88Var = (m88) this.m;
                m88Var.getClass();
                k88 k88Var = ny2Var.unknownFields;
                m88Var.getClass();
                if (k88Var.equals(ny2Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x05d6 A[Catch: all -> 0x0027, TryCatch #4 {all -> 0x0027, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:20:0x0047, B:22:0x004c, B:24:0x0053, B:26:0x005a, B:33:0x006e, B:34:0x0072, B:38:0x0080, B:40:0x0091, B:46:0x00ab, B:48:0x00bd, B:49:0x00cf, B:50:0x00e1, B:51:0x00f3, B:52:0x0105, B:53:0x011a, B:54:0x012c, B:56:0x013b, B:58:0x0141, B:60:0x014a, B:64:0x0173, B:143:0x05d1, B:145:0x05d6, B:147:0x05dd, B:149:0x05e4, B:63:0x0160, B:65:0x0178, B:66:0x0182, B:67:0x0197, B:68:0x01ac, B:69:0x01c1, B:70:0x01d6, B:71:0x01eb, B:72:0x0200, B:73:0x0215, B:74:0x022a, B:75:0x0233, B:76:0x0234, B:77:0x0246, B:78:0x0254, B:79:0x0262, B:80:0x0270, B:81:0x027e, B:82:0x0291, B:83:0x029f, B:84:0x02ad, B:85:0x02bb, B:86:0x02c9, B:87:0x02d7, B:88:0x02e5, B:89:0x02f3, B:90:0x0301, B:91:0x030f, B:92:0x031d, B:93:0x032b, B:94:0x0339, B:95:0x0347, B:96:0x035a, B:97:0x0368, B:98:0x0376, B:99:0x0388, B:104:0x0397, B:105:0x03a3, B:106:0x03af, B:107:0x03be, B:108:0x03cd, B:109:0x03dc, B:110:0x03eb, B:111:0x03fa, B:112:0x0409, B:113:0x0418, B:114:0x0427, B:117:0x0430, B:119:0x0450, B:120:0x0465, B:121:0x0478, B:122:0x048b, B:123:0x049e, B:124:0x04b1, B:125:0x04c7, B:126:0x04da, B:127:0x04ed, B:129:0x04f6, B:130:0x0513, B:131:0x0527, B:132:0x0532, B:133:0x0547, B:134:0x055a, B:135:0x056d, B:136:0x0580, B:137:0x0593, B:138:0x05a6, B:139:0x05bb, B:141:0x05c7), top: B:171:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x05dd A[Catch: all -> 0x0027, TryCatch #4 {all -> 0x0027, blocks: (B:3:0x0014, B:5:0x001d, B:7:0x0021, B:20:0x0047, B:22:0x004c, B:24:0x0053, B:26:0x005a, B:33:0x006e, B:34:0x0072, B:38:0x0080, B:40:0x0091, B:46:0x00ab, B:48:0x00bd, B:49:0x00cf, B:50:0x00e1, B:51:0x00f3, B:52:0x0105, B:53:0x011a, B:54:0x012c, B:56:0x013b, B:58:0x0141, B:60:0x014a, B:64:0x0173, B:143:0x05d1, B:145:0x05d6, B:147:0x05dd, B:149:0x05e4, B:63:0x0160, B:65:0x0178, B:66:0x0182, B:67:0x0197, B:68:0x01ac, B:69:0x01c1, B:70:0x01d6, B:71:0x01eb, B:72:0x0200, B:73:0x0215, B:74:0x022a, B:75:0x0233, B:76:0x0234, B:77:0x0246, B:78:0x0254, B:79:0x0262, B:80:0x0270, B:81:0x027e, B:82:0x0291, B:83:0x029f, B:84:0x02ad, B:85:0x02bb, B:86:0x02c9, B:87:0x02d7, B:88:0x02e5, B:89:0x02f3, B:90:0x0301, B:91:0x030f, B:92:0x031d, B:93:0x032b, B:94:0x0339, B:95:0x0347, B:96:0x035a, B:97:0x0368, B:98:0x0376, B:99:0x0388, B:104:0x0397, B:105:0x03a3, B:106:0x03af, B:107:0x03be, B:108:0x03cd, B:109:0x03dc, B:110:0x03eb, B:111:0x03fa, B:112:0x0409, B:113:0x0418, B:114:0x0427, B:117:0x0430, B:119:0x0450, B:120:0x0465, B:121:0x0478, B:122:0x048b, B:123:0x049e, B:124:0x04b1, B:125:0x04c7, B:126:0x04da, B:127:0x04ed, B:129:0x04f6, B:130:0x0513, B:131:0x0527, B:132:0x0532, B:133:0x0547, B:134:0x055a, B:135:0x056d, B:136:0x0580, B:137:0x0593, B:138:0x05a6, B:139:0x05bb, B:141:0x05c7), top: B:171:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x05ec A[LOOP:1: B:151:0x05ea->B:152:0x05ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x05ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    @Override // o.bj6
    public final void g(Object obj, o36 o36Var, cg2 cg2Var) {
        k88 k88Var;
        ny2 ny2Var;
        k88 k88VarB;
        cg2Var.getClass();
        i88 i88Var = this.m;
        int[] iArr = this.h;
        int i = this.j;
        int i2 = this.i;
        k88 k88VarB2 = null;
        while (true) {
            try {
                int iY = o36Var.y();
                int iG = (iY < this.c || iY > this.d) ? -1 : G(iY, 0);
                k88 k88Var2 = k88.f;
                if (iG >= 0) {
                    int I = I(iG);
                    try {
                        int iH = H(I);
                        gb4 gb4Var = this.l;
                        switch (iH) {
                            case 0:
                                k88Var = k88Var2;
                                try {
                                    d98.d.g(obj, v(I), o36Var.readDouble());
                                    E(iG, obj);
                                } catch (qm3.a unused) {
                                    i88Var.getClass();
                                    if (k88VarB2 == null) {
                                        ny2Var = (ny2) obj;
                                        k88VarB = ny2Var.unknownFields;
                                        if (k88VarB == k88Var) {
                                            k88VarB = k88.b();
                                            ny2Var.unknownFields = k88VarB;
                                        }
                                        k88VarB2 = k88VarB;
                                    }
                                    if (!i88Var.a(k88VarB2, o36Var)) {
                                        while (i2 < i) {
                                            l(iArr[i2], obj, k88VarB2);
                                            i2++;
                                        }
                                        if (k88VarB2 == null) {
                                            return;
                                        }
                                        ((ny2) obj).unknownFields = k88VarB2;
                                    }
                                }
                                break;
                            case 1:
                                d98.d.h(obj, v(I), o36Var.readFloat());
                                E(iG, obj);
                                break;
                            case 2:
                                d98.o(obj, v(I), o36Var.J());
                                E(iG, obj);
                                break;
                            case 3:
                                d98.o(obj, v(I), o36Var.c());
                                E(iG, obj);
                                break;
                            case 4:
                                d98.n(o36Var.D(), v(I), obj);
                                E(iG, obj);
                                break;
                            case 5:
                                d98.o(obj, v(I), o36Var.d());
                                E(iG, obj);
                                break;
                            case 6:
                                d98.n(o36Var.i(), v(I), obj);
                                E(iG, obj);
                                break;
                            case 7:
                                d98.d.e(obj, v(I), o36Var.j());
                                E(iG, obj);
                                break;
                            case 8:
                                C(obj, I, o36Var);
                                E(iG, obj);
                                break;
                            case ep1.b /* 9 */:
                                if (p(iG, obj)) {
                                    d98.p(v(I), obj, sl3.c(d98.j(v(I), obj), o36Var.g(o(iG), cg2Var)));
                                } else {
                                    d98.p(v(I), obj, o36Var.g(o(iG), cg2Var));
                                    E(iG, obj);
                                }
                                break;
                            case ep1.c /* 10 */:
                                d98.p(v(I), obj, o36Var.B());
                                E(iG, obj);
                                break;
                            case 11:
                                d98.n(o36Var.m(), v(I), obj);
                                E(iG, obj);
                                break;
                            case ep1.d /* 12 */:
                                int iR = o36Var.r();
                                m(iG);
                                d98.n(iR, v(I), obj);
                                E(iG, obj);
                                break;
                            case 13:
                                d98.n(o36Var.F(), v(I), obj);
                                E(iG, obj);
                                break;
                            case 14:
                                d98.o(obj, v(I), o36Var.k());
                                E(iG, obj);
                                break;
                            case 15:
                                d98.n(o36Var.u(), v(I), obj);
                                E(iG, obj);
                                break;
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                d98.o(obj, v(I), o36Var.v());
                                E(iG, obj);
                                break;
                            case 17:
                                if (p(iG, obj)) {
                                    try {
                                        d98.p(v(I), obj, sl3.c(d98.j(v(I), obj), o36Var.b(o(iG), cg2Var)));
                                    } catch (qm3.a unused2) {
                                        k88Var = k88Var2;
                                        i88Var.getClass();
                                        if (k88VarB2 == null) {
                                            ny2Var = (ny2) obj;
                                            k88VarB = ny2Var.unknownFields;
                                            if (k88VarB == k88Var) {
                                                k88VarB = k88.b();
                                                ny2Var.unknownFields = k88VarB;
                                            }
                                            k88VarB2 = k88VarB;
                                        }
                                        if (!i88Var.a(k88VarB2, o36Var)) {
                                            while (i2 < i) {
                                                l(iArr[i2], obj, k88VarB2);
                                                i2++;
                                            }
                                            if (k88VarB2 == null) {
                                                return;
                                            }
                                            ((ny2) obj).unknownFields = k88VarB2;
                                        }
                                    }
                                } else {
                                    d98.p(v(I), obj, o36Var.b(o(iG), cg2Var));
                                    E(iG, obj);
                                }
                                break;
                            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                o36Var.I(gb4Var.c(v(I), obj));
                                break;
                            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                                o36Var.C(gb4Var.c(v(I), obj));
                                break;
                            case 20:
                                o36Var.n(gb4Var.c(v(I), obj));
                                break;
                            case 21:
                                o36Var.l(gb4Var.c(v(I), obj));
                                break;
                            case 22:
                                o36Var.p(gb4Var.c(v(I), obj));
                                break;
                            case 23:
                                o36Var.L(gb4Var.c(v(I), obj));
                                break;
                            case 24:
                                o36Var.t(gb4Var.c(v(I), obj));
                                break;
                            case 25:
                                o36Var.w(gb4Var.c(v(I), obj));
                                break;
                            case 26:
                                if ((536870912 & I) != 0) {
                                    o36Var.A(gb4Var.c(I & 1048575, obj));
                                } else {
                                    o36Var.z(gb4Var.c(I & 1048575, obj));
                                }
                                break;
                            case 27:
                                o36Var.E(gb4Var.c(I & 1048575, obj), o(iG), cg2Var);
                                break;
                            case 28:
                                o36Var.G(gb4Var.c(I & 1048575, obj));
                                break;
                            case 29:
                                o36Var.h(gb4Var.c(I & 1048575, obj));
                                break;
                            case 30:
                                o36Var.q(gb4Var.c(I & 1048575, obj));
                                m(iG);
                                Class cls = gj6.a;
                                break;
                            case 31:
                                o36Var.e(gb4Var.c(I & 1048575, obj));
                                break;
                            case 32:
                                o36Var.o(gb4Var.c(I & 1048575, obj));
                                break;
                            case 33:
                                o36Var.a(gb4Var.c(I & 1048575, obj));
                                break;
                            case 34:
                                o36Var.f(gb4Var.c(I & 1048575, obj));
                                break;
                            case 35:
                                o36Var.I(gb4Var.c(I & 1048575, obj));
                                break;
                            case 36:
                                o36Var.C(gb4Var.c(I & 1048575, obj));
                                break;
                            case 37:
                                o36Var.n(gb4Var.c(I & 1048575, obj));
                                break;
                            case 38:
                                o36Var.l(gb4Var.c(I & 1048575, obj));
                                break;
                            case 39:
                                o36Var.p(gb4Var.c(I & 1048575, obj));
                                break;
                            case 40:
                                o36Var.L(gb4Var.c(I & 1048575, obj));
                                break;
                            case 41:
                                o36Var.t(gb4Var.c(I & 1048575, obj));
                                break;
                            case 42:
                                o36Var.w(gb4Var.c(I & 1048575, obj));
                                break;
                            case 43:
                                o36Var.h(gb4Var.c(I & 1048575, obj));
                                break;
                            case 44:
                                o36Var.q(gb4Var.c(I & 1048575, obj));
                                m(iG);
                                Class cls2 = gj6.a;
                                break;
                            case 45:
                                o36Var.e(gb4Var.c(I & 1048575, obj));
                                break;
                            case 46:
                                o36Var.o(gb4Var.c(I & 1048575, obj));
                                break;
                            case 47:
                                o36Var.a(gb4Var.c(I & 1048575, obj));
                                break;
                            case 48:
                                o36Var.f(gb4Var.c(I & 1048575, obj));
                                break;
                            case 49:
                                o36Var.H(gb4Var.c(I & 1048575, obj), o(iG), cg2Var);
                                break;
                            case 50:
                                r(iG, obj, n(iG));
                                throw null;
                            case 51:
                                d98.p(I & 1048575, obj, Double.valueOf(o36Var.readDouble()));
                                F(iY, iG, obj);
                                break;
                            case 52:
                                d98.p(I & 1048575, obj, Float.valueOf(o36Var.readFloat()));
                                F(iY, iG, obj);
                                break;
                            case 53:
                                d98.p(I & 1048575, obj, Long.valueOf(o36Var.J()));
                                F(iY, iG, obj);
                                break;
                            case 54:
                                d98.p(I & 1048575, obj, Long.valueOf(o36Var.c()));
                                F(iY, iG, obj);
                                break;
                            case 55:
                                d98.p(I & 1048575, obj, Integer.valueOf(o36Var.D()));
                                F(iY, iG, obj);
                                break;
                            case 56:
                                d98.p(I & 1048575, obj, Long.valueOf(o36Var.d()));
                                F(iY, iG, obj);
                                break;
                            case 57:
                                d98.p(I & 1048575, obj, Integer.valueOf(o36Var.i()));
                                F(iY, iG, obj);
                                break;
                            case 58:
                                d98.p(I & 1048575, obj, Boolean.valueOf(o36Var.j()));
                                F(iY, iG, obj);
                                break;
                            case 59:
                                C(obj, I, o36Var);
                                F(iY, iG, obj);
                                break;
                            case 60:
                                try {
                                    if (q(iY, iG, obj)) {
                                        long j = I & 1048575;
                                        try {
                                            d98.p(j, obj, sl3.c(d98.j(j, obj), o36Var.g(o(iG), cg2Var)));
                                        } catch (qm3.a unused3) {
                                            k88Var = k88Var2;
                                            i88Var.getClass();
                                            if (k88VarB2 == null) {
                                                ny2Var = (ny2) obj;
                                                k88VarB = ny2Var.unknownFields;
                                                if (k88VarB == k88Var) {
                                                    k88VarB = k88.b();
                                                    ny2Var.unknownFields = k88VarB;
                                                }
                                                k88VarB2 = k88VarB;
                                            }
                                            if (!i88Var.a(k88VarB2, o36Var)) {
                                                while (i2 < i) {
                                                    l(iArr[i2], obj, k88VarB2);
                                                    i2++;
                                                }
                                                if (k88VarB2 == null) {
                                                    return;
                                                }
                                                ((ny2) obj).unknownFields = k88VarB2;
                                            }
                                        }
                                    } else {
                                        d98.p(I & 1048575, obj, o36Var.g(o(iG), cg2Var));
                                        E(iG, obj);
                                    }
                                    F(iY, iG, obj);
                                } catch (qm3.a unused4) {
                                    k88Var = k88Var2;
                                    i88Var.getClass();
                                    if (k88VarB2 == null) {
                                        ny2Var = (ny2) obj;
                                        k88VarB = ny2Var.unknownFields;
                                        if (k88VarB == k88Var) {
                                            k88VarB = k88.b();
                                            ny2Var.unknownFields = k88VarB;
                                        }
                                        k88VarB2 = k88VarB;
                                    }
                                    if (!i88Var.a(k88VarB2, o36Var)) {
                                        while (i2 < i) {
                                            l(iArr[i2], obj, k88VarB2);
                                            i2++;
                                        }
                                        if (k88VarB2 == null) {
                                            return;
                                        }
                                        ((ny2) obj).unknownFields = k88VarB2;
                                    }
                                }
                                break;
                            case 61:
                                d98.p(I & 1048575, obj, o36Var.B());
                                F(iY, iG, obj);
                                break;
                            case 62:
                                d98.p(I & 1048575, obj, Integer.valueOf(o36Var.m()));
                                F(iY, iG, obj);
                                break;
                            case 63:
                                int iR2 = o36Var.r();
                                m(iG);
                                d98.p(I & 1048575, obj, Integer.valueOf(iR2));
                                F(iY, iG, obj);
                                break;
                            case 64:
                                d98.p(I & 1048575, obj, Integer.valueOf(o36Var.F()));
                                F(iY, iG, obj);
                                break;
                            case 65:
                                d98.p(I & 1048575, obj, Long.valueOf(o36Var.k()));
                                F(iY, iG, obj);
                                break;
                            case 66:
                                d98.p(I & 1048575, obj, Integer.valueOf(o36Var.u()));
                                F(iY, iG, obj);
                                break;
                            case 67:
                                d98.p(I & 1048575, obj, Long.valueOf(o36Var.v()));
                                F(iY, iG, obj);
                                break;
                            case 68:
                                d98.p(I & 1048575, obj, o36Var.b(o(iG), cg2Var));
                                F(iY, iG, obj);
                                break;
                            default:
                                if (k88VarB2 == null) {
                                    ((m88) i88Var).getClass();
                                    k88VarB2 = k88.b();
                                }
                                if (!i88Var.a(k88VarB2, o36Var)) {
                                    while (i2 < i) {
                                        l(iArr[i2], obj, k88VarB2);
                                        i2++;
                                    }
                                }
                                break;
                        }
                    } catch (qm3.a unused5) {
                        k88Var = k88Var2;
                    }
                } else if (iY == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        l(iArr[i2], obj, k88VarB2);
                        i2++;
                    }
                    if (k88VarB2 == null) {
                        return;
                    } else {
                        ((m88) i88Var).getClass();
                    }
                } else {
                    i88Var.getClass();
                    if (k88VarB2 == null) {
                        ny2 ny2Var2 = (ny2) obj;
                        k88 k88VarB3 = ny2Var2.unknownFields;
                        if (k88VarB3 == k88Var2) {
                            k88VarB3 = k88.b();
                            ny2Var2.unknownFields = k88VarB3;
                        }
                        k88VarB2 = k88VarB3;
                    }
                    if (!i88Var.a(k88VarB2, o36Var)) {
                        while (i2 < i) {
                            l(iArr[i2], obj, k88VarB2);
                            i2++;
                        }
                        if (k88VarB2 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i2 < i) {
                    l(iArr[i2], obj, k88VarB2);
                    i2++;
                }
                if (k88VarB2 != null) {
                    ((m88) i88Var).getClass();
                    ((ny2) obj).unknownFields = k88VarB2;
                }
                throw th;
            }
        }
        ((ny2) obj).unknownFields = k88VarB2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:164:0x049a A[PHI: r2
      0x049a: PHI (r2v18 sun.misc.Unsafe) = (r2v3 sun.misc.Unsafe), (r2v19 sun.misc.Unsafe) binds: [B:211:0x05d6, B:163:0x0498] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x04aa A[PHI: r2
      0x04aa: PHI (r2v16 sun.misc.Unsafe) = (r2v4 sun.misc.Unsafe), (r2v17 sun.misc.Unsafe) binds: [B:208:0x05cc, B:166:0x04a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x063f A[PHI: r9
      0x063f: PHI (r9v2 int) = 
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v13 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v14 int)
      (r9v1 int)
      (r9v15 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v18 int)
      (r9v1 int)
      (r9v19 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v23 int)
      (r9v1 int)
      (r9v1 int)
      (r9v1 int)
      (r9v24 int)
      (r9v1 int)
     binds: [B:226:0x0626, B:389:0x0a1c, B:386:0x0a0b, B:383:0x09fa, B:380:0x09f5, B:377:0x09f0, B:374:0x09da, B:371:0x09c2, B:368:0x09af, B:359:0x0957, B:344:0x08c6, B:341:0x08b4, B:338:0x08a2, B:335:0x0890, B:332:0x087e, B:329:0x086c, B:326:0x085b, B:323:0x084a, B:320:0x0837, B:317:0x0826, B:314:0x0815, B:311:0x0804, B:308:0x07f3, B:306:0x07e3, B:304:0x07dd, B:302:0x07d0, B:295:0x0798, B:293:0x0794, B:290:0x078c, B:287:0x0778, B:284:0x0764, B:281:0x0750, B:278:0x0744, B:275:0x0738, B:272:0x072a, B:265:0x06fe, B:269:0x0716, B:259:0x06d1, B:263:0x06f4, B:256:0x06bf, B:253:0x06ac, B:250:0x0699, B:247:0x068b, B:245:0x0680, B:244:0x067e, B:240:0x0665, B:236:0x064a, B:231:0x063e, B:229:0x062e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0680  */
    /* JADX WARN: Code duplicated, block: B:248:0x068d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // o.bj6
    public final int h(s1 s1Var) {
        int i;
        char c;
        byte b;
        char c2;
        int iH;
        int iJ;
        int iF;
        int iG;
        int iA;
        int iH2;
        int i2;
        int iH3;
        int iJ2;
        int iG2;
        int iH4;
        int iE;
        int iG3;
        Unsafe unsafe;
        int iH5;
        int iJ3;
        int iD;
        int iG4;
        int iH6;
        int iE2;
        int iH7;
        int iJ4;
        int iH8;
        int iF2;
        int iD2;
        int iG5;
        i88 i88Var = this.m;
        rm4 rm4Var = this.n;
        Unsafe unsafe2 = p;
        int i3 = 1;
        boolean z = this.g;
        int[] iArr = this.a;
        if (z) {
            int i4 = 0;
            int iU = 0;
            while (i4 < iArr.length) {
                int I = I(i4);
                int iH9 = H(I);
                int i5 = iArr[i4];
                Unsafe unsafe3 = unsafe2;
                long j = I & 1048575;
                if (iH9 >= ej2.n.m && iH9 <= ej2.f719o.m) {
                    int i6 = iArr[i4 + 2];
                }
                switch (iH9) {
                    case 0:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iU = fx3.u(i5, 8, iU);
                        }
                        break;
                    case 1:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iU = fx3.u(i5, 4, iU);
                        }
                        break;
                    case 2:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            long jI = d98.i(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.j(jI);
                            iU += iJ3 + iH5;
                        }
                        break;
                    case 3:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            long jI2 = d98.i(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.j(jI2);
                            iU += iJ3 + iH5;
                        }
                        break;
                    case 4:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            int iH10 = d98.h(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.f(iH10);
                            iU += iJ3 + iH5;
                        }
                        break;
                    case 5:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iD = yu0.d(i5);
                            iU += iD;
                        }
                        break;
                    case 6:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iD = yu0.c(i5);
                            iU += iD;
                        }
                        break;
                    case 7:
                        int i7 = i3;
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iU = fx3.u(i5, i7, iU);
                        }
                        break;
                    case 8:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            Object objJ = d98.j(j, s1Var);
                            if (objJ instanceof yh0) {
                                int iH11 = yu0.h(i5);
                                int size = ((yh0) objJ).size();
                                iU = fx3.b(size, size, iH11, iU);
                            } else {
                                iU = yu0.g((String) objJ) + yu0.h(i5) + iU;
                            }
                        }
                        break;
                    case ep1.b /* 9 */:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            Object objJ2 = d98.j(j, s1Var);
                            bj6 bj6VarO = o(i4);
                            Class cls = gj6.a;
                            s1 s1Var2 = (s1) objJ2;
                            int iH12 = yu0.h(i5);
                            s1Var2.getClass();
                            ny2 ny2Var = (ny2) s1Var2;
                            int iH13 = ny2Var.memoizedSerializedSize;
                            if (iH13 == -1) {
                                iH13 = bj6VarO.h(s1Var2);
                                ny2Var.memoizedSerializedSize = iH13;
                            }
                            iU = fx3.b(iH13, iH13, iH12, iU);
                        }
                        break;
                    case ep1.c /* 10 */:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iD = yu0.a(i5, (yh0) d98.j(j, s1Var));
                            iU += iD;
                        }
                        break;
                    case 11:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            int iH14 = d98.h(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.i(iH14);
                            iU += iJ3 + iH5;
                        }
                        break;
                    case ep1.d /* 12 */:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            int iH15 = d98.h(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.f(iH15);
                            iU += iJ3 + iH5;
                        }
                        break;
                    case 13:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iU = fx3.u(i5, 4, iU);
                        }
                        break;
                    case 14:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iU = fx3.u(i5, 8, iU);
                        }
                        break;
                    case 15:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            int iH16 = d98.h(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.i((iH16 >> 31) ^ (iH16 << 1));
                            iU += iJ3 + iH5;
                        }
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        int i8 = i3;
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            long jI3 = d98.i(j, s1Var);
                            iH5 = yu0.h(i5);
                            iJ3 = yu0.j((jI3 << i8) ^ (jI3 >> 63));
                            iU += iJ3 + iH5;
                        }
                        break;
                    case 17:
                        unsafe = unsafe3;
                        if (p(i4, s1Var)) {
                            iD = yu0.e(i5, (s1) d98.j(j, s1Var), o(i4));
                            iU += iD;
                        }
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        unsafe = unsafe3;
                        iD = gj6.f(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        unsafe = unsafe3;
                        iD = gj6.d(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 20:
                        unsafe = unsafe3;
                        iD = gj6.j(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 21:
                        unsafe = unsafe3;
                        iD = gj6.t(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 22:
                        unsafe = unsafe3;
                        iD = gj6.h(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 23:
                        unsafe = unsafe3;
                        iD = gj6.f(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 24:
                        unsafe = unsafe3;
                        iD = gj6.d(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 25:
                        unsafe = unsafe3;
                        List list = (List) d98.j(j, s1Var);
                        Class cls2 = gj6.a;
                        int size2 = list.size();
                        iD = size2 == 0 ? 0 : (yu0.h(i5) + 1) * size2;
                        iU += iD;
                        break;
                    case 26:
                        unsafe = unsafe3;
                        iD = gj6.q(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 27:
                        unsafe = unsafe3;
                        iD = gj6.l(i5, (List) d98.j(j, s1Var), o(i4));
                        iU += iD;
                        break;
                    case 28:
                        unsafe = unsafe3;
                        iD = gj6.a(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 29:
                        unsafe = unsafe3;
                        iD = gj6.r(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 30:
                        unsafe = unsafe3;
                        iD = gj6.b(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 31:
                        unsafe = unsafe3;
                        iD = gj6.d(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 32:
                        unsafe = unsafe3;
                        iD = gj6.f(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 33:
                        unsafe = unsafe3;
                        iD = gj6.m(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 34:
                        unsafe = unsafe3;
                        iD = gj6.o(i5, (List) d98.j(j, s1Var));
                        iU += iD;
                        break;
                    case 35:
                        unsafe = unsafe3;
                        iG4 = gj6.g((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 36:
                        unsafe = unsafe3;
                        iG4 = gj6.e((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 37:
                        unsafe = unsafe3;
                        iG4 = gj6.k((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 38:
                        unsafe = unsafe3;
                        iG4 = gj6.u((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 39:
                        unsafe = unsafe3;
                        iG4 = gj6.i((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 40:
                        unsafe = unsafe3;
                        iG4 = gj6.g((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 41:
                        unsafe = unsafe3;
                        iG4 = gj6.e((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 42:
                        unsafe = unsafe3;
                        List list2 = (List) unsafe.getObject(s1Var, j);
                        Class cls3 = gj6.a;
                        iG4 = list2.size();
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 43:
                        unsafe = unsafe3;
                        iG4 = gj6.s((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 44:
                        unsafe = unsafe3;
                        iG4 = gj6.c((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 45:
                        unsafe = unsafe3;
                        iG4 = gj6.e((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 46:
                        unsafe = unsafe3;
                        iG4 = gj6.g((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 47:
                        unsafe = unsafe3;
                        iG4 = gj6.n((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 48:
                        unsafe = unsafe3;
                        iG4 = gj6.p((List) unsafe.getObject(s1Var, j));
                        if (iG4 > 0) {
                            iH6 = yu0.h(i5);
                            iU = fx3.b(iG4, iH6, iG4, iU);
                        }
                        break;
                    case 49:
                        List list3 = (List) d98.j(j, s1Var);
                        bj6 bj6VarO2 = o(i4);
                        Class cls4 = gj6.a;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            iE2 = 0;
                        } else {
                            int i9 = 0;
                            iE2 = 0;
                            while (i9 < size3) {
                                iE2 = yu0.e(i5, (s1) list3.get(i9), bj6VarO2) + iE2;
                                i9++;
                                i3 = i3;
                            }
                        }
                        iU = iE2 + iU;
                        unsafe = unsafe3;
                        break;
                    case 50:
                        Object objJ3 = d98.j(j, s1Var);
                        Object objN = n(i4);
                        rm4Var.getClass();
                        rm4.a(objJ3, objN);
                        unsafe = unsafe3;
                        break;
                    case 51:
                        if (q(i5, i4, s1Var)) {
                            iU = fx3.u(i5, 8, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 52:
                        if (q(i5, i4, s1Var)) {
                            iU = fx3.u(i5, 4, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 53:
                        if (q(i5, i4, s1Var)) {
                            long jX = x(j, s1Var);
                            iH7 = yu0.h(i5);
                            iJ4 = yu0.j(jX);
                            iU += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 54:
                        if (q(i5, i4, s1Var)) {
                            long jX2 = x(j, s1Var);
                            iH7 = yu0.h(i5);
                            iJ4 = yu0.j(jX2);
                            iU += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 55:
                        if (q(i5, i4, s1Var)) {
                            int iW = w(j, s1Var);
                            iH8 = yu0.h(i5);
                            iF2 = yu0.f(iW);
                            iD2 = iF2 + iH8;
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 56:
                        if (q(i5, i4, s1Var)) {
                            iD2 = yu0.d(i5);
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 57:
                        if (q(i5, i4, s1Var)) {
                            iD2 = yu0.c(i5);
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 58:
                        if (q(i5, i4, s1Var)) {
                            iU = fx3.u(i5, i3, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 59:
                        if (q(i5, i4, s1Var)) {
                            Object objJ4 = d98.j(j, s1Var);
                            if (objJ4 instanceof yh0) {
                                int iH17 = yu0.h(i5);
                                int size4 = ((yh0) objJ4).size();
                                iG5 = fx3.b(size4, size4, iH17, iU);
                            } else {
                                iG5 = yu0.g((String) objJ4) + yu0.h(i5) + iU;
                            }
                            iU = iG5;
                        }
                        unsafe = unsafe3;
                        break;
                    case 60:
                        if (q(i5, i4, s1Var)) {
                            Object objJ5 = d98.j(j, s1Var);
                            bj6 bj6VarO3 = o(i4);
                            Class cls5 = gj6.a;
                            s1 s1Var3 = (s1) objJ5;
                            int iH18 = yu0.h(i5);
                            s1Var3.getClass();
                            ny2 ny2Var2 = (ny2) s1Var3;
                            int iH19 = ny2Var2.memoizedSerializedSize;
                            if (iH19 == -1) {
                                iH19 = bj6VarO3.h(s1Var3);
                                ny2Var2.memoizedSerializedSize = iH19;
                            }
                            iU = fx3.b(iH19, iH19, iH18, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 61:
                        if (q(i5, i4, s1Var)) {
                            iD2 = yu0.a(i5, (yh0) d98.j(j, s1Var));
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 62:
                        if (q(i5, i4, s1Var)) {
                            int iW2 = w(j, s1Var);
                            iH8 = yu0.h(i5);
                            iF2 = yu0.i(iW2);
                            iD2 = iF2 + iH8;
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 63:
                        if (q(i5, i4, s1Var)) {
                            int iW3 = w(j, s1Var);
                            iH8 = yu0.h(i5);
                            iF2 = yu0.f(iW3);
                            iD2 = iF2 + iH8;
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 64:
                        if (q(i5, i4, s1Var)) {
                            iU = fx3.u(i5, 4, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 65:
                        if (q(i5, i4, s1Var)) {
                            iU = fx3.u(i5, 8, iU);
                        }
                        unsafe = unsafe3;
                        break;
                    case 66:
                        if (q(i5, i4, s1Var)) {
                            int iW4 = w(j, s1Var);
                            iH8 = yu0.h(i5);
                            iF2 = yu0.i((iW4 >> 31) ^ (iW4 << 1));
                            iD2 = iF2 + iH8;
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    case 67:
                        if (q(i5, i4, s1Var)) {
                            long jX3 = x(j, s1Var);
                            iH7 = yu0.h(i5);
                            iJ4 = yu0.j((jX3 << i3) ^ (jX3 >> 63));
                            iU += iJ4 + iH7;
                        }
                        unsafe = unsafe3;
                        break;
                    case 68:
                        if (q(i5, i4, s1Var)) {
                            iD2 = yu0.e(i5, (s1) d98.j(j, s1Var), o(i4));
                            iU += iD2;
                        }
                        unsafe = unsafe3;
                        break;
                    default:
                        unsafe = unsafe3;
                        break;
                }
                i4 += 3;
                unsafe2 = unsafe;
                i3 = 1;
            }
            ((m88) i88Var).getClass();
            return ((ny2) s1Var).unknownFields.a() + iU;
        }
        int i10 = -1;
        int i11 = 0;
        int iU2 = 0;
        int i12 = 0;
        while (i11 < iArr.length) {
            int I2 = I(i11);
            int i13 = iArr[i11];
            int iH20 = H(I2);
            if (iH20 <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    i12 = unsafe2.getInt(s1Var, i15);
                    i10 = i15;
                }
            } else {
                i = 0;
            }
            i88 i88Var2 = i88Var;
            long j2 = I2 & 1048575;
            switch (iH20) {
                case 0:
                    c = 4;
                    b = -1;
                    c2 = '\b';
                    if ((i & i12) != 0) {
                        iU2 = fx3.u(i13, 8, iU2);
                    }
                    break;
                case 1:
                    b = -1;
                    if ((i & i12) != 0) {
                        c = 4;
                        iU2 = fx3.u(i13, 4, iU2);
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    break;
                case 2:
                    b = -1;
                    if ((i & i12) != 0) {
                        long j3 = unsafe2.getLong(s1Var, j2);
                        iH = yu0.h(i13);
                        iJ = yu0.j(j3);
                        iU2 += iJ + iH;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 3:
                    b = -1;
                    if ((i & i12) != 0) {
                        long j4 = unsafe2.getLong(s1Var, j2);
                        iH = yu0.h(i13);
                        iJ = yu0.j(j4);
                        iU2 += iJ + iH;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 4:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = yu0.f(unsafe2.getInt(s1Var, j2)) + yu0.h(i13);
                        iU2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 5:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = yu0.d(i13);
                        iU2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 6:
                    b = -1;
                    if ((i & i12) != 0) {
                        iF = yu0.c(i13);
                        iU2 += iF;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 7:
                    b = -1;
                    if ((i & i12) != 0) {
                        iU2 = fx3.u(i13, 1, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case 8:
                    b = -1;
                    if ((i & i12) != 0) {
                        Object object = unsafe2.getObject(s1Var, j2);
                        if (object instanceof yh0) {
                            int iH21 = yu0.h(i13);
                            int size5 = ((yh0) object).size();
                            iG = fx3.b(size5, size5, iH21, iU2);
                        } else {
                            iG = yu0.g((String) object) + yu0.h(i13) + iU2;
                        }
                        iU2 = iG;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case ep1.b /* 9 */:
                    if ((i & i12) != 0) {
                        Object object2 = unsafe2.getObject(s1Var, j2);
                        bj6 bj6VarO4 = o(i11);
                        Class cls6 = gj6.a;
                        s1 s1Var4 = (s1) object2;
                        int iH22 = yu0.h(i13);
                        s1Var4.getClass();
                        ny2 ny2Var3 = (ny2) s1Var4;
                        int iH23 = ny2Var3.memoizedSerializedSize;
                        b = -1;
                        if (iH23 == -1) {
                            iH23 = bj6VarO4.h(s1Var4);
                            ny2Var3.memoizedSerializedSize = iH23;
                        }
                        iU2 = fx3.b(iH23, iH23, iH22, iU2);
                    } else {
                        b = -1;
                    }
                    c = 4;
                    c2 = '\b';
                    break;
                case ep1.c /* 10 */:
                    if ((i & i12) != 0) {
                        iA = yu0.a(i13, (yh0) unsafe2.getObject(s1Var, j2));
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 11:
                    if ((i & i12) != 0) {
                        int i16 = unsafe2.getInt(s1Var, j2);
                        iH2 = yu0.h(i13);
                        i2 = yu0.i(i16);
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case ep1.d /* 12 */:
                    if ((i & i12) != 0) {
                        int i17 = unsafe2.getInt(s1Var, j2);
                        iH2 = yu0.h(i13);
                        i2 = yu0.f(i17);
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 13:
                    if ((i & i12) != 0) {
                        iU2 = fx3.u(i13, 4, iU2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 14:
                    if ((i & i12) != 0) {
                        iU2 = fx3.u(i13, 8, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 15:
                    if ((i & i12) != 0) {
                        int i18 = unsafe2.getInt(s1Var, j2);
                        iH2 = yu0.h(i13);
                        i2 = yu0.i((i18 >> 31) ^ (i18 << 1));
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if ((i & i12) != 0) {
                        long j5 = unsafe2.getLong(s1Var, j2);
                        iH3 = yu0.h(i13);
                        iJ2 = yu0.j((j5 >> 63) ^ (j5 << 1));
                        iA = iJ2 + iH3;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 17:
                    if ((i & i12) != 0) {
                        iA = yu0.e(i13, (s1) unsafe2.getObject(s1Var, j2), o(i11));
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    iA = gj6.f(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    iA = gj6.d(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 20:
                    iA = gj6.j(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 21:
                    iA = gj6.t(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 22:
                    iA = gj6.h(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 23:
                    iA = gj6.f(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 24:
                    iA = gj6.d(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 25:
                    List list4 = (List) unsafe2.getObject(s1Var, j2);
                    Class cls7 = gj6.a;
                    int size6 = list4.size();
                    iU2 += size6 == 0 ? 0 : (yu0.h(i13) + 1) * size6;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 26:
                    iA = gj6.q(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 27:
                    iA = gj6.l(i13, (List) unsafe2.getObject(s1Var, j2), o(i11));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 28:
                    iA = gj6.a(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 29:
                    iA = gj6.r(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 30:
                    iA = gj6.b(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 31:
                    iA = gj6.d(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 32:
                    iA = gj6.f(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 33:
                    iA = gj6.m(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 34:
                    iA = gj6.o(i13, (List) unsafe2.getObject(s1Var, j2));
                    iU2 += iA;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 35:
                    iG2 = gj6.g((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 36:
                    iG2 = gj6.e((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 37:
                    iG2 = gj6.k((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 38:
                    iG2 = gj6.u((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 39:
                    iG2 = gj6.i((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 40:
                    iG2 = gj6.g((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 41:
                    iG2 = gj6.e((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 42:
                    List list5 = (List) unsafe2.getObject(s1Var, j2);
                    Class cls8 = gj6.a;
                    iG2 = list5.size();
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 43:
                    iG2 = gj6.s((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 44:
                    iG2 = gj6.c((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 45:
                    iG2 = gj6.e((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 46:
                    iG2 = gj6.g((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 47:
                    iG2 = gj6.n((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 48:
                    iG2 = gj6.p((List) unsafe2.getObject(s1Var, j2));
                    if (iG2 > 0) {
                        iH4 = yu0.h(i13);
                        iU2 = fx3.b(iG2, iH4, iG2, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 49:
                    List list6 = (List) unsafe2.getObject(s1Var, j2);
                    bj6 bj6VarO5 = o(i11);
                    Class cls9 = gj6.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iE = 0;
                    } else {
                        iE = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            iE += yu0.e(i13, (s1) list6.get(i19), bj6VarO5);
                        }
                    }
                    iU2 += iE;
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 50:
                    Object object3 = unsafe2.getObject(s1Var, j2);
                    Object objN2 = n(i11);
                    rm4Var.getClass();
                    rm4.a(object3, objN2);
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 51:
                    if (q(i13, i11, s1Var)) {
                        iU2 = fx3.u(i13, 8, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 52:
                    if (q(i13, i11, s1Var)) {
                        iU2 = fx3.u(i13, 4, iU2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 53:
                    if (q(i13, i11, s1Var)) {
                        long jX4 = x(j2, s1Var);
                        iH3 = yu0.h(i13);
                        iJ2 = yu0.j(jX4);
                        iA = iJ2 + iH3;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 54:
                    if (q(i13, i11, s1Var)) {
                        long jX5 = x(j2, s1Var);
                        iH3 = yu0.h(i13);
                        iJ2 = yu0.j(jX5);
                        iA = iJ2 + iH3;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 55:
                    if (q(i13, i11, s1Var)) {
                        int iW5 = w(j2, s1Var);
                        iH2 = yu0.h(i13);
                        i2 = yu0.f(iW5);
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 56:
                    if (q(i13, i11, s1Var)) {
                        iA = yu0.d(i13);
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 57:
                    if (q(i13, i11, s1Var)) {
                        iA = yu0.c(i13);
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 58:
                    if (q(i13, i11, s1Var)) {
                        iU2 = fx3.u(i13, 1, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 59:
                    if (q(i13, i11, s1Var)) {
                        Object object4 = unsafe2.getObject(s1Var, j2);
                        if (object4 instanceof yh0) {
                            int iH24 = yu0.h(i13);
                            int size8 = ((yh0) object4).size();
                            iG3 = fx3.b(size8, size8, iH24, iU2);
                        } else {
                            iG3 = yu0.g((String) object4) + yu0.h(i13) + iU2;
                        }
                        iU2 = iG3;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 60:
                    if (q(i13, i11, s1Var)) {
                        Object object5 = unsafe2.getObject(s1Var, j2);
                        bj6 bj6VarO6 = o(i11);
                        Class cls10 = gj6.a;
                        s1 s1Var5 = (s1) object5;
                        int iH25 = yu0.h(i13);
                        s1Var5.getClass();
                        ny2 ny2Var4 = (ny2) s1Var5;
                        int iH26 = ny2Var4.memoizedSerializedSize;
                        if (iH26 == -1) {
                            iH26 = bj6VarO6.h(s1Var5);
                            ny2Var4.memoizedSerializedSize = iH26;
                        }
                        iU2 = fx3.b(iH26, iH26, iH25, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 61:
                    if (q(i13, i11, s1Var)) {
                        iA = yu0.a(i13, (yh0) unsafe2.getObject(s1Var, j2));
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 62:
                    if (q(i13, i11, s1Var)) {
                        int iW6 = w(j2, s1Var);
                        iH2 = yu0.h(i13);
                        i2 = yu0.i(iW6);
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 63:
                    if (q(i13, i11, s1Var)) {
                        int iW7 = w(j2, s1Var);
                        iH2 = yu0.h(i13);
                        i2 = yu0.f(iW7);
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 64:
                    if (q(i13, i11, s1Var)) {
                        iU2 = fx3.u(i13, 4, iU2);
                        c = 4;
                    } else {
                        c = 4;
                    }
                    c2 = '\b';
                    b = -1;
                    break;
                case 65:
                    if (q(i13, i11, s1Var)) {
                        iU2 = fx3.u(i13, 8, iU2);
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 66:
                    if (q(i13, i11, s1Var)) {
                        int iW8 = w(j2, s1Var);
                        iH2 = yu0.h(i13);
                        i2 = yu0.i((iW8 >> 31) ^ (iW8 << 1));
                        iA = i2 + iH2;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 67:
                    if (q(i13, i11, s1Var)) {
                        long jX6 = x(j2, s1Var);
                        iH3 = yu0.h(i13);
                        iJ2 = yu0.j((jX6 >> 63) ^ (jX6 << 1));
                        iA = iJ2 + iH3;
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                case 68:
                    if (q(i13, i11, s1Var)) {
                        iA = yu0.e(i13, (s1) unsafe2.getObject(s1Var, j2), o(i11));
                        iU2 += iA;
                    }
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
                default:
                    c = 4;
                    c2 = '\b';
                    b = -1;
                    break;
            }
            i11 += 3;
            i88Var = i88Var2;
        }
        ((m88) i88Var).getClass();
        return ((ny2) s1Var).unknownFields.a() + iU2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.bj6
    public final int i(ny2 ny2Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int I = I(i4);
            int i5 = iArr[i4];
            long j = 1048575 & I;
            int i6 = 1237;
            int iHashCode = 37;
            switch (H(I)) {
                case 0:
                    i = i3 * 53;
                    iB = sl3.b(Double.doubleToLongBits(d98.d.c(j, ny2Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(d98.d.d(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = sl3.b(d98.i(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = sl3.b(d98.i(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = sl3.b(d98.i(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = d98.d.a(j, ny2Var);
                    Charset charset = sl3.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) d98.j(j, ny2Var)).hashCode();
                    i3 = iB + i;
                    break;
                case ep1.b /* 9 */:
                    Object objJ = d98.j(j, ny2Var);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case ep1.c /* 10 */:
                    i = i3 * 53;
                    iB = d98.j(j, ny2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case ep1.d /* 12 */:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = sl3.b(d98.i(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = d98.h(j, ny2Var);
                    i3 = iB + i;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    i = i3 * 53;
                    iB = sl3.b(d98.i(j, ny2Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = d98.j(j, ny2Var);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
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
                    iB = d98.j(j, ny2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = d98.j(j, ny2Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(Double.doubleToLongBits(((Double) d98.j(j, ny2Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) d98.j(j, ny2Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(x(j, ny2Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(x(j, ny2Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(x(j, ny2Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, i4, ny2Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) d98.j(j, ny2Var)).booleanValue();
                        Charset charset2 = sl3.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = ((String) d98.j(j, ny2Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = d98.j(j, ny2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = d98.j(j, ny2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(x(j, ny2Var));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = w(j, ny2Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = sl3.b(x(j, ny2Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, i4, ny2Var)) {
                        i = i3 * 53;
                        iB = d98.j(j, ny2Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((m88) this.m).getClass();
        return ny2Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // o.bj6
    public final void j(ny2 ny2Var, ny2 ny2Var2) {
        ny2 ny2Var3;
        ny2Var2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                gj6.w(this.m, ny2Var, ny2Var2);
                return;
            }
            int I = I(i);
            long j = 1048575 & I;
            int i2 = iArr[i];
            switch (H(I)) {
                case 0:
                    if (!p(i, ny2Var2)) {
                        ny2Var3 = ny2Var;
                    } else {
                        c98 c98Var = d98.d;
                        ny2Var3 = ny2Var;
                        c98Var.g(ny2Var3, j, c98Var.c(j, ny2Var2));
                        E(i, ny2Var3);
                    }
                    break;
                case 1:
                    if (p(i, ny2Var2)) {
                        c98 c98Var2 = d98.d;
                        c98Var2.h(ny2Var, j, c98Var2.d(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 2:
                    if (p(i, ny2Var2)) {
                        d98.o(ny2Var, j, d98.i(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 3:
                    if (p(i, ny2Var2)) {
                        d98.o(ny2Var, j, d98.i(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 4:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 5:
                    if (p(i, ny2Var2)) {
                        d98.o(ny2Var, j, d98.i(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 6:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 7:
                    if (p(i, ny2Var2)) {
                        c98 c98Var3 = d98.d;
                        c98Var3.e(ny2Var, j, c98Var3.a(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 8:
                    if (p(i, ny2Var2)) {
                        d98.p(j, ny2Var, d98.j(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case ep1.b /* 9 */:
                    s(ny2Var, ny2Var2, i);
                    ny2Var3 = ny2Var;
                    break;
                case ep1.c /* 10 */:
                    if (p(i, ny2Var2)) {
                        d98.p(j, ny2Var, d98.j(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 11:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case ep1.d /* 12 */:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 13:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 14:
                    if (p(i, ny2Var2)) {
                        d98.o(ny2Var, j, d98.i(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 15:
                    if (p(i, ny2Var2)) {
                        d98.n(d98.h(j, ny2Var2), j, ny2Var);
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    if (p(i, ny2Var2)) {
                        d98.o(ny2Var, j, d98.i(j, ny2Var2));
                        E(i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 17:
                    s(ny2Var, ny2Var2, i);
                    ny2Var3 = ny2Var;
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
                    this.l.b(ny2Var, ny2Var2, j);
                    ny2Var3 = ny2Var;
                    break;
                case 50:
                    Class cls = gj6.a;
                    Object objJ = d98.j(j, ny2Var);
                    Object objJ2 = d98.j(j, ny2Var2);
                    this.n.getClass();
                    d98.p(j, ny2Var, rm4.b(objJ, objJ2));
                    ny2Var3 = ny2Var;
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
                    if (q(i2, i, ny2Var2)) {
                        d98.p(j, ny2Var, d98.j(j, ny2Var2));
                        F(i2, i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 60:
                    t(ny2Var, ny2Var2, i);
                    ny2Var3 = ny2Var;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, ny2Var2)) {
                        d98.p(j, ny2Var, d98.j(j, ny2Var2));
                        F(i2, i, ny2Var);
                    }
                    ny2Var3 = ny2Var;
                    break;
                case 68:
                    t(ny2Var, ny2Var2, i);
                    ny2Var3 = ny2Var;
                    break;
                default:
                    ny2Var3 = ny2Var;
                    break;
            }
            i += 3;
            ny2Var = ny2Var3;
        }
    }

    public final boolean k(ny2 ny2Var, Object obj, int i) {
        return p(i, ny2Var) == p(i, obj);
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (d98.j(I(i) & 1048575, obj) == null) {
            return;
        }
        m(i);
    }

    public final void m(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        io.sentry.h2.f();
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final bj6 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        bj6 bj6Var = (bj6) objArr[i2];
        if (bj6Var != null) {
            return bj6Var;
        }
        bj6 bj6VarA = uw5.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = bj6VarA;
        return bj6VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea A[RETURN] */
    public final boolean p(int i, Object obj) {
        if (!this.g) {
            int i2 = this.a[i + 2];
            if ((d98.h(i2 & 1048575, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int I = I(i);
        long j = I & 1048575;
        switch (H(I)) {
            case 0:
                if (d98.d.c(j, obj) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (d98.d.d(j, obj) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (d98.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (d98.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (d98.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return d98.d.a(j, obj);
            case 8:
                Object objJ = d98.j(j, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof yh0) {
                    return !yh0.n.equals(objJ);
                }
                yq4.f();
                return false;
            case ep1.b /* 9 */:
                if (d98.j(j, obj) != null) {
                    return true;
                }
                return false;
            case ep1.c /* 10 */:
                return !yh0.n.equals(d98.j(j, obj));
            case 11:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case ep1.d /* 12 */:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (d98.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (d98.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                if (d98.i(j, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (d98.j(j, obj) != null) {
                    return true;
                }
                return false;
            default:
                yq4.f();
                return false;
        }
    }

    public final boolean q(int i, int i2, Object obj) {
        return d98.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(int i, Object obj, Object obj2) {
        long jI = I(i) & 1048575;
        Object objJ = d98.j(jI, obj);
        rm4 rm4Var = this.n;
        if (objJ != null) {
            rm4Var.getClass();
            if (!((pm4) objJ).m) {
                Object objC = pm4.n.c();
                rm4.b(objC, objJ);
                d98.p(jI, obj, objC);
                objJ = objC;
            }
        } else {
            rm4Var.getClass();
            objJ = pm4.n.c();
            d98.p(jI, obj, objJ);
        }
        rm4Var.getClass();
        ua5.u(obj2);
        throw null;
    }

    public final void s(ny2 ny2Var, Object obj, int i) {
        long jI = I(i) & 1048575;
        if (p(i, obj)) {
            Object objJ = d98.j(jI, ny2Var);
            Object objJ2 = d98.j(jI, obj);
            if (objJ != null && objJ2 != null) {
                d98.p(jI, ny2Var, sl3.c(objJ, objJ2));
                E(i, ny2Var);
            } else if (objJ2 != null) {
                d98.p(jI, ny2Var, objJ2);
                E(i, ny2Var);
            }
        }
    }

    public final void t(ny2 ny2Var, Object obj, int i) {
        int I = I(i);
        int i2 = this.a[i];
        long j = I & 1048575;
        if (q(i2, i, obj)) {
            Object objJ = d98.j(j, ny2Var);
            Object objJ2 = d98.j(j, obj);
            if (objJ != null && objJ2 != null) {
                d98.p(j, ny2Var, sl3.c(objJ, objJ2));
                F(i2, i, ny2Var);
            } else if (objJ2 != null) {
                d98.p(j, ny2Var, objJ2);
                F(i2, i, ny2Var);
            }
        }
    }

    public final void y(int i, long j, Object obj) {
        Object objN = n(i);
        Unsafe unsafe = p;
        Object object = unsafe.getObject(obj, j);
        this.n.getClass();
        if (!((pm4) object).m) {
            pm4 pm4VarC = pm4.n.c();
            rm4.b(pm4VarC, object);
            unsafe.putObject(obj, j, pm4VarC);
        }
        ua5.u(objN);
        throw null;
    }

    public final int z(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, jw jwVar) throws qm3 {
        Object object;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = p;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(ck3.C(bArr, i))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(ck3.B(bArr, i))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM = ck3.M(bArr, i, jwVar);
                unsafe.putObject(obj, j, Long.valueOf(jwVar.b));
                unsafe.putInt(obj, j2, i4);
                return iM;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iK = ck3.K(bArr, i, jwVar);
                unsafe.putObject(obj, j, Integer.valueOf(jwVar.a));
                unsafe.putInt(obj, j2, i4);
                return iK;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(ck3.C(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(ck3.B(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM2 = ck3.M(bArr, i, jwVar);
                unsafe.putObject(obj, j, Boolean.valueOf(jwVar.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iK2 = ck3.K(bArr, i, jwVar);
                int i13 = jwVar.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!ha8.a.q(bArr, iK2, iK2 + i13)) {
                            throw qm3.a();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iK2, i13, sl3.a));
                    iK2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iK2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iE = ck3.E(o(i8), bArr, i, i2, jwVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                Object obj2 = jwVar.c;
                if (object == null) {
                    unsafe.putObject(obj, j, obj2);
                } else {
                    unsafe.putObject(obj, j, sl3.c(object, obj2));
                }
                unsafe.putInt(obj, j2, i4);
                return iE;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iA = ck3.A(bArr, i, jwVar);
                unsafe.putObject(obj, j, jwVar.c);
                unsafe.putInt(obj, j2, i4);
                return iA;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iK3 = ck3.K(bArr, i, jwVar);
                int i14 = jwVar.a;
                m(i8);
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iK3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iK4 = ck3.K(bArr, i, jwVar);
                unsafe.putObject(obj, j, Integer.valueOf(uu0.b(jwVar.a)));
                unsafe.putInt(obj, j2, i4);
                return iK4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM3 = ck3.M(bArr, i, jwVar);
                unsafe.putObject(obj, j, Long.valueOf(uu0.c(jwVar.b)));
                unsafe.putInt(obj, j2, i4);
                return iM3;
            case 68:
                if (i5 == 3) {
                    int iD = ck3.D(o(i8), bArr, i, i2, (i3 & (-8)) | 4, jwVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    Object obj3 = jwVar.c;
                    if (object == null) {
                        unsafe.putObject(obj, j, obj3);
                    } else {
                        unsafe.putObject(obj, j, sl3.c(object, obj3));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iD;
                }
                break;
        }
        return i;
    }
}
