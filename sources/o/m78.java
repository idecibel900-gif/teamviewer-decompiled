package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m78 implements o78 {
    public final int a;
    public final Object[] b;

    public m78(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m78)) {
            return false;
        }
        m78 m78Var = (m78) obj;
        return this.a == m78Var.a && this.b.equals(m78Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return e41.h("AndroidResource(resId=", ", args=", this.a, Arrays.toString(this.b), ")");
    }
}
