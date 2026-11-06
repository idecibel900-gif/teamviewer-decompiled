package o;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class tq5 {
    public final int a;
    public final int b;
    public final String c;

    public tq5(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.P;
        this.b = preference.Q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tq5)) {
            return false;
        }
        tq5 tq5Var = (tq5) obj;
        return this.a == tq5Var.a && this.b == tq5Var.b && TextUtils.equals(this.c, tq5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
