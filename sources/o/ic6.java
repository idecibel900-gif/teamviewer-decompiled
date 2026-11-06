package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ic6 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, xs1 xs1Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            ni4 ni4Var = t58.b;
            Typeface typeface = (Typeface) ni4Var.a(t58.b(resources, i, string, i3, i2));
            byte b2 = 9;
            if (typeface != null) {
                if (xs1Var != null) {
                    new Handler(Looper.getMainLooper()).post(new be3(xs1Var, typeface, b2));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        ds2 ds2VarO = ct1.O(resources, resources.getXml(i));
                        if (ds2VarO == null) {
                            io.sentry.android.core.v0.c("ResourcesCompat", "Failed to find font-family tag");
                            if (xs1Var != null) {
                                xs1Var.w(-3);
                            }
                        } else {
                            typefaceA = t58.a(context, ds2VarO, resources, i, string, typedValue.assetCookie, i2, xs1Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceP = t58.a.p(context, resources, i, string);
                        if (typefaceP != null) {
                            ni4Var.b(t58.b(resources, i, string, i4, i2), typefaceP);
                        }
                        if (xs1Var != null) {
                            if (typefaceP != null) {
                                new Handler(Looper.getMainLooper()).post(new be3(xs1Var, typefaceP, b2));
                            } else {
                                xs1Var.w(-3);
                            }
                        }
                        typefaceA = typefaceP;
                    }
                } catch (IOException e) {
                    io.sentry.android.core.v0.d("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (xs1Var != null) {
                        xs1Var.w(-3);
                    }
                } catch (XmlPullParserException e2) {
                    io.sentry.android.core.v0.d("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (xs1Var != null) {
                        xs1Var.w(-3);
                    }
                }
            }
        } else if (xs1Var != null) {
            xs1Var.w(-3);
        }
        if (typefaceA != null || xs1Var != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
