package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class i77 extends l77 {
    public final Function0 a;

    public i77(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i77) && im3.n(this.a, ((i77) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Clickable(onClick=" + this.a + ")";
    }
}
