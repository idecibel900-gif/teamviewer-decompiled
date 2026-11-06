package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o.fd8;
import o.gd8;
import o.hk0;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(fd8 fd8Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !fd8Var.e(1) ? -1 : ((gd8) fd8Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (fd8Var.e(2)) {
            Parcel parcel = ((gd8) fd8Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = fd8Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (fd8Var.e(4)) {
            i2 = ((gd8) fd8Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (fd8Var.e(5)) {
            i3 = ((gd8) fd8Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) fd8Var.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (fd8Var.e(7)) {
            string = ((gd8) fd8Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (fd8Var.e(8)) {
            string2 = ((gd8) fd8Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                hk0.g("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, fd8 fd8Var) {
        fd8Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            fd8Var.h(1);
            ((gd8) fd8Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            fd8Var.h(2);
            Parcel parcel = ((gd8) fd8Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            fd8Var.h(3);
            ((gd8) fd8Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            fd8Var.h(4);
            ((gd8) fd8Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            fd8Var.h(5);
            ((gd8) fd8Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            fd8Var.h(6);
            ((gd8) fd8Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            fd8Var.h(7);
            ((gd8) fd8Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            fd8Var.h(8);
            ((gd8) fd8Var).e.writeString(str2);
        }
    }
}
