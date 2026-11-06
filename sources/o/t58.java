package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t58 {
    public static final r47 a;
    public static final ni4 b;
    public static Paint c;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new x58();
        } else if (i >= 29) {
            a = new w58();
        } else if (i >= 28) {
            a = new v58();
        } else {
            a = new u58();
        }
        b = new ni4(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, ds2 ds2Var, Resources resources, int i, String str, int i2, int i3, xs1 xs1Var, boolean z) {
        Typeface typefaceM;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        byte b2 = 9;
        int i4 = -3;
        if (ds2Var instanceof gs2) {
            gs2 gs2Var = (gs2) ds2Var;
            String str2 = gs2Var.d;
            typefaceM = null;
            byte b3 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = gs2Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        wr2 wr2Var = (wr2) arrayList.get(i6);
                                        if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(wr2Var.f)) {
                                            customFallbackBuilder.setSystemFallback(wr2Var.e);
                                        } else {
                                            String str3 = wr2Var.e;
                                            String str4 = wr2Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                io.sentry.android.core.v0.j("TypefaceCompat", "Unable identify the primary font for " + wr2Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(pz2.h(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        io.sentry.android.core.v0.c("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((wr2) arrayList.get(i5)).e) != null) {
                                i5++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((wr2) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (xs1Var != null) {
                    new Handler(Looper.getMainLooper()).post(new be3(xs1Var, typefaceBuild, b2));
                }
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr3 = !z ? xs1Var != null : gs2Var.c != 0;
            int i7 = z ? gs2Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            l07 l07Var = new l07((byte) 16, z2);
            l07Var.n = xs1Var;
            ArrayList arrayList2 = gs2Var.a;
            fj fjVar = new fj(handler, (byte) 4);
            cj3 cj3Var = new cj3((Object) l07Var, (Object) fjVar, (byte) 29);
            byte b4 = 8;
            if (objArr3 != true) {
                String strA = cs2.a(i3, arrayList2);
                Typeface typeface = (Typeface) cs2.a.a(strA);
                if (typeface != null) {
                    fjVar.execute(new it8(l07Var, typeface, b4));
                    typefaceM = typeface;
                } else {
                    as2 as2Var = new as2(cj3Var, objArr == true ? 1 : 0);
                    synchronized (cs2.c) {
                        try {
                            a07 a07Var = cs2.d;
                            ArrayList arrayList3 = (ArrayList) a07Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(as2Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(as2Var);
                                a07Var.put(strA, arrayList4);
                                zr2 zr2Var = new zr2(strA, context, arrayList2, i3, (byte) 1);
                                ThreadPoolExecutor threadPoolExecutor = cs2.b;
                                as2 as2Var2 = new as2(strA, b3);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                e53 e53Var = new e53();
                                e53Var.n = zr2Var;
                                e53Var.f682o = as2Var2;
                                e53Var.p = handler2;
                                threadPoolExecutor.execute(e53Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    hk0.g("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                wr2 wr2Var2 = (wr2) arrayList2.get(0);
                ni4 ni4Var = cs2.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{wr2Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = cs2.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) cs2.a.a(strA2);
                if (typeface2 != null) {
                    fjVar.execute(new it8(l07Var, typeface2, b4));
                    typefaceM = typeface2;
                } else if (i7 == -1) {
                    Object[] objArr4 = {wr2Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr4[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    bs2 bs2VarB = cs2.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    cj3Var.S(bs2VarB);
                    typefaceM = bs2VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    bs2 bs2Var = (bs2) cs2.b.submit(new zr2(strA2, context, wr2Var2, i3, (byte) 0)).get(i7, TimeUnit.MILLISECONDS);
                                    cj3Var.S(bs2Var);
                                    typefaceM = bs2Var.a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((fj) cj3Var.f531o).execute(new lj0(objArr2 == true ? 1 : 0, i4, (l07) cj3Var.n));
                    }
                }
            }
        } else {
            typefaceM = a.m(context, (es2) ds2Var, resources, i3);
            if (xs1Var != null) {
                if (typefaceM != null) {
                    new Handler(Looper.getMainLooper()).post(new be3(xs1Var, typefaceM, b2));
                } else {
                    xs1Var.w(-3);
                }
            }
        }
        if (typefaceM != null) {
            b.b(b(resources, i, str, i2, i3), typefaceM);
        }
        return typefaceM;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
