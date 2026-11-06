package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jr3 {
    public final String[] a;
    public final ya5 b;

    public /* synthetic */ jr3(String[] strArr, ya5 ya5Var) {
        this.a = strArr;
        this.b = ya5Var;
    }

    public static jr3 a(String... strArr) {
        try {
            ai0[] ai0VarArr = new ai0[strArr.length];
            bf0 bf0Var = new bf0();
            for (int i = 0; i < strArr.length; i++) {
                pr3.c0(bf0Var, strArr[i]);
                bf0Var.c0();
                ai0VarArr[i] = bf0Var.o0(bf0Var.n);
            }
            return new jr3((String[]) strArr.clone(), qs1.S(ai0VarArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static jr3 b(String... strArr) {
        String str;
        try {
            ai0[] ai0VarArr = new ai0[strArr.length];
            bf0 bf0Var = new bf0();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = kr3.q;
                bf0Var.U0(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                bf0Var.Y0(i2, i3, str2);
                            }
                            bf0Var.Z0(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            bf0Var.Y0(i2, i3, str2);
                        }
                        bf0Var.Z0(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    bf0Var.Y0(i2, length, str2);
                }
                bf0Var.U0(34);
                bf0Var.c0();
                ai0VarArr[i] = bf0Var.o0(bf0Var.n);
            }
            return new jr3((String[]) strArr.clone(), qs1.S(ai0VarArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
