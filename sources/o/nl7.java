package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nl7 {
    public final String a;
    public final Function0 b;

    public nl7(String str, Function0 function0) {
        function0.getClass();
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl7)) {
            return false;
        }
        nl7 nl7Var = (nl7) obj;
        return this.a.equals(nl7Var.a) && im3.n(this.b, nl7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TVSnackbarAction(text=" + this.a + ", onAction=" + this.b + ")";
    }
}
