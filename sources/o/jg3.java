package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class jg3 {
    public static final ig3 Companion = new ig3();
    public static final u14[] b = {ds1.X(l54.m, new uf2(29))};
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg3) && im3.n(this.a, ((jg3) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return fx3.i("InProductAppsResponse(appInfoData=", this.a, ")");
    }
}
