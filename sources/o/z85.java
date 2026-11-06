package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z85 {
    public final Integer a;
    public final String b;
    public final String c;
    public final Map d;

    public z85(Integer num, String str, String str2, Map map) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z85)) {
            return false;
        }
        z85 z85Var = (z85) obj;
        return im3.n(this.a, z85Var.a) && im3.n(this.b, z85Var.b) && im3.n(this.c, z85Var.c) && im3.n(this.d, z85Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "OneAPIWrappedResponse(status=" + this.a + ", statusText=" + this.b + ", data=" + this.c + ", headers=" + this.d + ")";
    }
}
