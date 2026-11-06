package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad8 {
    public static String a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            String str = Build.VERSION.RELEASE;
            if (!im3.n(str, Build.VERSION.RELEASE_OR_PREVIEW_DISPLAY)) {
                String str2 = Build.VERSION.RELEASE_OR_PREVIEW_DISPLAY;
                str2.getClass();
                return str2;
            }
            return str + "." + (i < 36 ? 0 : Build.getMinorSdkVersion(i < 36 ? 100000 * i : Build.VERSION.SDK_INT_FULL));
        }
        if (i >= 33) {
            String str3 = Build.VERSION.RELEASE_OR_PREVIEW_DISPLAY;
            str3.getClass();
            return str3;
        }
        if (i >= 30) {
            String str4 = Build.VERSION.RELEASE_OR_CODENAME;
            str4.getClass();
            return str4;
        }
        String str5 = Build.VERSION.RELEASE;
        str5.getClass();
        return str5;
    }
}
