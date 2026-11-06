package o;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jd4 {
    public final Locale a;

    public jd4(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof jd4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return im3.n(this.a.toLanguageTag(), ((jd4) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
