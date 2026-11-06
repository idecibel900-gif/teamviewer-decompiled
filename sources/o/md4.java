package o;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class md4 {
    public final LocaleList a;

    public md4(LocaleList localeList) {
        this.a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((md4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
