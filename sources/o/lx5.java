package o;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lx5 {
    public final String a;
    public final String b;
    public final JSONObject c;

    public lx5(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
        int i = as8.f357o;
        Object[] objArr = js8.u;
    }

    public final int a() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx5)) {
            return false;
        }
        lx5 lx5Var = (lx5) obj;
        return TextUtils.equals(this.a, lx5Var.a) && TextUtils.equals(this.b, lx5Var.b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
