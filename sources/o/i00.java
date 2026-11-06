package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i00 extends ze1 {
    public final Context a;
    public final du0 b;
    public final du0 c;
    public final String d;

    public i00(Context context, du0 du0Var, du0 du0Var2, String str) {
        if (context == null) {
            yq4.l("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (du0Var == null) {
            yq4.l("Null wallClock");
            throw null;
        }
        this.b = du0Var;
        if (du0Var2 == null) {
            yq4.l("Null monotonicClock");
            throw null;
        }
        this.c = du0Var2;
        if (str != null) {
            this.d = str;
        } else {
            yq4.l("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ze1) {
            i00 i00Var = (i00) ((ze1) obj);
            if (this.a.equals(i00Var.a) && this.b.equals(i00Var.b) && this.c.equals(i00Var.c) && this.d.equals(i00Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return e41.l(sb, this.d, "}");
    }
}
