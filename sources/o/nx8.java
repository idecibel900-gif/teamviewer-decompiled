package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nx8 {
    public final String a;
    public final boolean b;

    public nx8(String str, boolean z) {
        nv1.q(str);
        this.a = str;
        nv1.q("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx8)) {
            return false;
        }
        nx8 nx8Var = (nx8) obj;
        return xs1.G(this.a, nx8Var.a) && xs1.G("com.google.android.gms", "com.google.android.gms") && xs1.G(null, null) && this.b == nx8Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        nv1.s(null);
        throw null;
    }
}
