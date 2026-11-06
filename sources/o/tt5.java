package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tt5 {
    public final Integer a;
    public final String b;
    public final Function0 c;

    public tt5(Integer num, String str, Function0 function0) {
        this.a = num;
        this.b = str;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt5)) {
            return false;
        }
        tt5 tt5Var = (tt5) obj;
        return im3.n(this.a, tt5Var.a) && im3.n(this.b, tt5Var.b) && im3.n(this.c, tt5Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function0 function0 = this.c;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionCardActionIconData(iconResourceID=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
