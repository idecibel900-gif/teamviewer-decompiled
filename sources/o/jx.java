package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class jx implements vi2 {
    public final /* synthetic */ byte a;
    public final x98 b;
    public final za5 c;

    public /* synthetic */ jx(x98 x98Var, za5 za5Var, byte b) {
        this.a = b;
        this.b = x98Var;
        this.c = za5Var;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0332  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:222:0x051c  */
    /* JADX WARN: Code duplicated, block: B:234:0x059a  */
    @Override // o.vi2
    public final Object a(fb2 fb2Var) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listK;
        int size;
        Bundle bundle;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        boolean z;
        Object obj;
        int i4;
        int i5;
        Integer numO;
        String mimeTypeFromExtension2;
        Drawable drawable;
        byte b = this.a;
        char c = 6;
        int i6 = 0;
        zg1 zg1Var = zg1.f2697o;
        x98 x98Var = this.b;
        za5 za5Var = this.c;
        String mimeTypeFromExtension3 = null;
        switch (b) {
            case 0:
                String strT0 = lv0.t0(lv0.j0(1, v67.k(x98Var)), "/", null, null, null, 62);
                u67 u67Var = new u67(new w36(et1.N(za5Var.a.getAssets().open(strT0))), za5Var.f, new hx(strT0));
                if (ub7.b0(strT0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strT1 = ub7.t0(ub7.t0(strT0, '#'), '?');
                    String strQ0 = ub7.q0('.', ub7.q0('/', strT1, strT1), "");
                    if (ub7.b0(strQ0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strQ0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) gr4.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new t67(u67Var, mimeTypeFromExtension, zg1Var);
            case 1:
                Uri uri = Uri.parse(x98Var.a);
                ContentResolver contentResolver = za5Var.a.getContentResolver();
                String str = x98Var.d;
                if (im3.n(str, "com.android.contacts") && im3.n(lv0.w0(v67.k(x98Var)), "display_photo")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        hk0.h(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                    return new t67(new u67(new w36(et1.N(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), za5Var.f, new mb1(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), zg1Var);
                }
                if (Build.VERSION.SDK_INT < 29 || !im3.n(str, "media") || (size = (listK = v67.k(x98Var)).size()) < 3 || !im3.n(listK.get(size - 3), "audio") || !im3.n(listK.get(size - 2), "albums")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        hk0.h(uri, "'.", "Unable to open '");
                        return null;
                    }
                    return new t67(new u67(new w36(et1.N(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), za5Var.f, new mb1(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), zg1Var);
                }
                w07 w07Var = za5Var.b;
                j12 j12Var = w07Var.a;
                g12 g12Var = j12Var instanceof g12 ? (g12) j12Var : null;
                if (g12Var != null) {
                    int i7 = g12Var.a;
                    j12 j12Var2 = w07Var.b;
                    g12 g12Var2 = j12Var2 instanceof g12 ? (g12) j12Var2 : null;
                    if (g12Var2 != null) {
                        int i8 = g12Var2.a;
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(i7, i8));
                    } else {
                        bundle = null;
                    }
                } else {
                    bundle = null;
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    hk0.h(uri, "'.", "Unable to find a music thumbnail associated with '");
                    return null;
                }
                return new t67(new u67(new w36(et1.N(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), za5Var.f, new mb1(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), zg1Var);
            case 2:
                String str2 = x98Var.a;
                int iZ = ub7.Z(str2, ";base64,", 0, false, 6);
                if (iZ == -1) {
                    yq4.k(x98Var, "invalid data uri: ");
                    return null;
                }
                int iY = ub7.Y(str2, ':', 0, 6);
                if (iY == -1) {
                    yq4.k(x98Var, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str2.substring(iY + 1, iZ);
                b30 b30Var = d30.c;
                int i9 = iZ + 8;
                int length = str2.length();
                b30Var.getClass();
                boolean z2 = b30Var.b;
                g68.j(i9, length, str2.length());
                byte[] bytes = str2.substring(i9, length).getBytes(vn0.d);
                bytes.getClass();
                int length2 = bytes.length;
                g68.j(0, length2, bytes.length);
                int i10 = -2;
                if (length2 == 0) {
                    i2 = 0;
                } else {
                    if (length2 == 1) {
                        hk0.g(fx3.e(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                        return null;
                    }
                    if (z2) {
                        i = length2;
                        int i11 = 0;
                        while (true) {
                            char c2 = c;
                            if (i11 < length2) {
                                int i12 = e30.a[bytes[i11] & 255];
                                if (i12 < 0) {
                                    if (i12 == -2) {
                                        i -= length2 - i11;
                                    } else {
                                        i--;
                                    }
                                }
                                i11++;
                                c = c2;
                            }
                        }
                    } else if (bytes[length2 - 1] == 61) {
                        i = length2 - 1;
                        if (bytes[length2 - 2] == 61) {
                            i = length2 - 2;
                        }
                    } else {
                        i = length2;
                    }
                    i2 = (int) ((((long) i) * 6) / 8);
                }
                byte[] bArr2 = new byte[i2];
                int[] iArr = b30Var.a ? e30.b : e30.a;
                int i13 = -8;
                int i14 = 8;
                int i15 = 0;
                int i16 = 0;
                int i17 = -8;
                while (true) {
                    if (i6 < length2) {
                        if (i17 != i13 || (i5 = i6 + 3) >= length2) {
                            bArr = bytes;
                        } else {
                            bArr = bytes;
                            int i18 = i6 + 4;
                            int i19 = (iArr[bArr[i6 + 2] & 255] << 6) | (iArr[bytes[i6 + 1] & 255] << 12) | (iArr[bytes[i6] & 255] << 18) | iArr[bArr[i5] & 255];
                            if (i19 >= 0) {
                                bArr2[i15] = (byte) (i19 >> 16);
                                int i20 = i15 + 2;
                                bArr2[i15 + 1] = (byte) (i19 >> 8);
                                i15 += 3;
                                bArr2[i20] = (byte) i19;
                                bytes = bArr;
                                i6 = i18;
                            }
                            i10 = -2;
                            i13 = -8;
                        }
                        int i21 = bArr[i6] & 255;
                        int i22 = iArr[i21];
                        if (i22 >= 0) {
                            i6++;
                            i16 = (i16 << 6) | i22;
                            int i23 = i17 + 6;
                            if (i23 >= 0) {
                                bArr2[i15] = (byte) (i16 >>> i23);
                                i16 &= (1 << i23) - 1;
                                i17 -= 2;
                                i15++;
                            } else {
                                i17 = i23;
                            }
                            bytes = bArr;
                            i10 = -2;
                            i13 = -8;
                            i14 = 8;
                        } else {
                            if (i22 == -2) {
                                if (i17 == -8) {
                                    hk0.g(fx3.e(i6, "Redundant pad character at index "));
                                } else if (i17 == -6) {
                                    i4 = i6 + 1;
                                    i3 = i4;
                                    z = true;
                                    i10 = -2;
                                } else if (i17 == -4) {
                                    int i24 = i6 + 1;
                                    if (z2) {
                                        while (i24 < length2) {
                                            if (e30.a[bArr[i24] & 255] == -1) {
                                                i24++;
                                            }
                                        }
                                    }
                                    if (i24 == length2 || bArr[i24] != 61) {
                                        hk0.g(fx3.e(i24, "Missing one pad character at index "));
                                    } else {
                                        i4 = i24 + 1;
                                        i3 = i4;
                                        z = true;
                                        i10 = -2;
                                    }
                                } else if (i17 == -2) {
                                    i4 = i6 + 1;
                                    i3 = i4;
                                    z = true;
                                    i10 = -2;
                                } else {
                                    hk0.l("Unreachable");
                                }
                                return null;
                            }
                            if (!z2) {
                                char c3 = (char) i21;
                                qf0.s(i14);
                                String string = Integer.toString(i21, i14);
                                string.getClass();
                                throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + string + ") at index " + i6);
                            }
                            i6++;
                            bytes = bArr;
                            i10 = -2;
                            i13 = -8;
                        }
                    } else {
                        bArr = bytes;
                        i3 = i6;
                        z = false;
                    }
                }
                if (i17 == i10) {
                    obj = null;
                    hk0.g("The last unit of input does not have enough bits");
                } else {
                    if (i17 != -8 && !z) {
                        hk0.g("The padding option is set to PRESENT, but the input is not properly padded");
                        return null;
                    }
                    if (i16 == 0) {
                        if (z2) {
                            while (i3 < length2) {
                                if (e30.a[bArr[i3] & 255] == -1) {
                                    i3++;
                                }
                            }
                        }
                        if (i3 < length2) {
                            obj = null;
                            int i25 = bArr[i3] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i25);
                            sb.append("'(");
                            qf0.s(8);
                            String string2 = Integer.toString(i25, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            hk0.g(to7.l(sb, i3 - 1, " is prohibited after the pad character"));
                        } else {
                            if (i15 == i2) {
                                bf0 bf0Var = new bf0();
                                bf0Var.S0(bArr2, i2);
                                return new t67(new u67(bf0Var, za5Var.f, null), strSubstring, zg1.n);
                            }
                            obj = null;
                            hk0.l("Check failed.");
                        }
                    } else {
                        obj = null;
                        hk0.g("The pad bits must be zeros");
                    }
                }
                return obj;
            case 3:
                String str3 = wg5.n;
                String strJ = v67.j(x98Var);
                if (strJ == null) {
                    hk0.l("filePath == null");
                    return null;
                }
                wg5 wg5VarS = vv.s(strJ);
                kj2 kj2VarG = xs1.g(wg5VarS, za5Var.f, null, null, 28);
                String strQ1 = ub7.q0('.', wg5VarS.b(), "");
                if (!ub7.b0(strQ1)) {
                    String lowerCase2 = strQ1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) gr4.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new t67(kj2VarG, mimeTypeFromExtension3, zg1Var);
            case 4:
                String str4 = x98Var.e;
                if (str4 == null) {
                    str4 = "";
                }
                int iY2 = ub7.Y(str4, '!', 0, 6);
                if (iY2 == -1) {
                    yq4.k(x98Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str5 = wg5.n;
                wg5 wg5VarS2 = vv.s(str4.substring(0, iY2));
                wg5 wg5VarS3 = vv.s(str4.substring(iY2 + 1, str4.length()));
                sj2 sj2Var = za5Var.f;
                sj2Var.getClass();
                kj2 kj2VarG2 = xs1.g(wg5VarS3, y57.y(wg5VarS2, sj2Var, new yb8((byte) 19)), null, null, 28);
                String strQ2 = ub7.q0('.', wg5VarS3.b(), "");
                if (!ub7.b0(strQ2)) {
                    String lowerCase3 = strQ2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) gr4.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new t67(kj2VarG2, mimeTypeFromExtension3, zg1Var);
            default:
                String str6 = x98Var.d;
                if (str6 != null) {
                    if (ub7.b0(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        String str7 = (String) lv0.w0(v67.k(x98Var));
                        if (str7 == null || (numO = bc7.O(str7)) == null) {
                            yq4.t(x98Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numO.intValue();
                        Context context = za5Var.a;
                        Resources resources = str6.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str6);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (ub7.b0(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strT2 = ub7.t0(ub7.t0(string3, '#'), '?');
                            String strQ3 = ub7.q0('.', ub7.q0('/', strT2, strT2), "");
                            if (ub7.b0(strQ3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strQ3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) gr4.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!im3.n(mimeTypeFromExtension2, "text/xml")) {
                            return new t67(new u67(new w36(et1.N(resources.openRawResource(iIntValue, new TypedValue()))), za5Var.f, new cc6(str6, iIntValue)), mimeTypeFromExtension2, zg1Var);
                        }
                        if (str6.equals(context.getPackageName())) {
                            drawable = uf0.p(context, iIntValue);
                            if (drawable == null) {
                                an4.g(fx3.e(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = ic6.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                an4.g(fx3.e(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = ya8.a;
                        boolean z3 = drawable instanceof VectorDrawable;
                        if (z3) {
                            drawable = new BitmapDrawable(context.getResources(), ep1.n(drawable, (Bitmap.Config) nv1.x(za5Var, ne3.b), za5Var.b, za5Var.c, (w07) nv1.x(za5Var, me3.b), za5Var.d == pp5.n));
                        }
                        return new ce3(bt1.p(drawable), z3, zg1Var);
                    }
                }
                yq4.t(x98Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
