package o;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rt {
    public final Typeface a;
    public final String b;
    public final int c;

    public rt(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return this.c == rtVar.c && Objects.equals(this.a, rtVar.a) && Objects.equals(this.b, rtVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
