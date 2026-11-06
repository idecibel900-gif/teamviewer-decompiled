package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class td4 {
    public final Object a;
    public final Function0 b;

    public td4(Object obj, Function0 function0) {
        this.a = obj;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && td4.class == obj.getClass() && this.a.equals(((td4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
