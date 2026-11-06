package o;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ld4 {
    public static final ld4 b = new ld4(new md4(new LocaleList(new Locale[0])));
    public final md4 a;

    public ld4(md4 md4Var) {
        this.a = md4Var;
    }

    public static ld4 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new ld4(new md4(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ld4) {
            return this.a.equals(((ld4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
