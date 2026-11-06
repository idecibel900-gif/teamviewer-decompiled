package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class cs2 {
    public static final ni4 a = new ni4(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final a07 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ib6());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new a07(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((wr2) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static bs2 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceN;
        ni4 ni4Var = a;
        Trace.beginSection("getFontSync");
        try {
            Typeface typeface = (Typeface) ni4Var.a(str);
            if (typeface != null) {
                bs2 bs2Var = new bs2(typeface);
                Trace.endSection();
                return bs2Var;
            }
            try {
                os2 os2VarA = vr2.a(context, list);
                List list2 = os2VarA.a;
                boolean z = os2VarA.b;
                if (!z) {
                    ps2[] ps2VarArr = (ps2[]) list2.get(0);
                    if (ps2VarArr == null || ps2VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = ps2VarArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i4 = ps2VarArr[i3].f;
                            if (i4 != 0) {
                                if (i4 >= 0) {
                                    i2 = i4;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    if (!z) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    bs2 bs2Var2 = new bs2(i2);
                    Trace.endSection();
                    return bs2Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    ps2[] ps2VarArr2 = (ps2[]) list2.get(0);
                    r47 r47Var = t58.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceN = t58.a.n(context, ps2VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    r47 r47Var2 = t58.a;
                    Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceN = t58.a.o(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceN == null) {
                    bs2 bs2Var3 = new bs2(-3);
                    Trace.endSection();
                    return bs2Var3;
                }
                ni4Var.b(str, typefaceN);
                bs2 bs2Var4 = new bs2(typefaceN);
                Trace.endSection();
                return bs2Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                bs2 bs2Var5 = new bs2(-1);
                Trace.endSection();
                return bs2Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
