package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j60 {
    public final int a;
    public final CharSequence b;

    public j60(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j60)) {
            return false;
        }
        j60 j60Var = (j60) obj;
        if (this.a != j60Var.a) {
            return false;
        }
        CharSequence charSequence = j60Var.b;
        CharSequence charSequence2 = this.b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
