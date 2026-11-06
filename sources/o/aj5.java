package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class aj5 {
    public final Integer a;
    public final String b;
    public final int c;
    public final int d;
    public final Function0 e;
    public final Function0 f;

    public aj5(Integer num, String str, int i, int i2, Function0 function0, Function0 function1) {
        str.getClass();
        function0.getClass();
        function1.getClass();
        this.a = num;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = function0;
        this.f = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj5)) {
            return false;
        }
        aj5 aj5Var = (aj5) obj;
        return im3.n(this.a, aj5Var.a) && im3.n(this.b, aj5Var.b) && this.c == aj5Var.c && this.d == aj5Var.d && im3.n(this.e, aj5Var.e) && im3.n(this.f, aj5Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.f.hashCode() + e41.f(fx3.a(this.d, fx3.a(this.c, to7.e((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        return "PermissionDialogParams(title=" + this.a + ", text=" + this.b + ", dismissButtonText=" + this.c + ", confirmButtonText=" + this.d + ", onDismiss=" + this.e + ", onConfirm=" + this.f + ")";
    }
}
