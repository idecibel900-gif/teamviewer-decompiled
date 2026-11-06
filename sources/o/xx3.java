package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xx3 {
    public static final xx3 b = new xx3(null, 63);
    public final Function1 a;

    public xx3(Function1 function1, int i) {
        this.a = (i & 1) != 0 ? null : function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xx3) {
            return this.a == ((xx3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        return (function1 != null ? function1.hashCode() : 0) * 28629151;
    }
}
