package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w58 extends r47 {
    public static Font E(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iH = H(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iH2 = H(fontStyle, font2.getStyle());
            if (iH2 < iH) {
                font = font2;
                iH = iH2;
            }
        }
        return font;
    }

    public static int H(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily F(ps2[] ps2VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (ps2 ps2Var : ps2VarArr) {
            if (Objects.equals(ps2Var.a.getScheme(), "systemfont")) {
                fontBuild = G(ps2Var);
            } else {
                try {
                    Uri uri = ps2Var.a;
                    String str = ps2Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ps2Var.c).setSlant(ps2Var.d ? 1 : 0).setTtcIndex(ps2Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    io.sentry.android.core.v0.l("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font G(ps2 ps2Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // o.r47
    public final Typeface m(Context context, es2 es2Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (fs2 fs2Var : es2Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fs2Var.f).setWeight(fs2Var.b).setSlant(fs2Var.c ? 1 : 0).setTtcIndex(fs2Var.e).setFontVariationSettings(fs2Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(E(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            io.sentry.android.core.v0.l("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // o.r47
    public final Typeface n(Context context, ps2[] ps2VarArr, int i) {
        try {
            FontFamily fontFamilyF = F(ps2VarArr, context.getContentResolver());
            if (fontFamilyF == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyF).setStyle(E(fontFamilyF, i).getStyle()).build();
        } catch (Exception e) {
            io.sentry.android.core.v0.l("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // o.r47
    public final Typeface o(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyF = F((ps2[]) list.get(0), contentResolver);
            if (fontFamilyF == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyF);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyF2 = F((ps2[]) list.get(i2), contentResolver);
                if (fontFamilyF2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyF2);
                }
            }
            return customFallbackBuilder.setStyle(E(fontFamilyF, i).getStyle()).build();
        } catch (Exception e) {
            io.sentry.android.core.v0.l("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // o.r47
    public final Typeface p(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            io.sentry.android.core.v0.l("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
