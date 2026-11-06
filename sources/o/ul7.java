package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ul7 {
    public final sl7 a;
    public final String b;
    public final g37 c;
    public final rl7 d;
    public final String e;
    public final nl7 f;
    public final Function0 g;
    public final String h;
    public final boolean i;

    public ul7(sl7 sl7Var, String str, g37 g37Var, String str2, nl7 nl7Var, Function0 function0, int i) {
        rl7 rl7Var;
        rl7 rl7Var2 = tl7.a;
        sl7Var.getClass();
        switch (sl7Var.ordinal()) {
            case 0:
                rl7Var = null;
                break;
            case 1:
                rl7Var = tl7.a;
                break;
            case 2:
                rl7Var = tl7.b;
                break;
            case 3:
                rl7Var = tl7.c;
                break;
            case 4:
                rl7Var = tl7.d;
                break;
            case 5:
                rl7Var = tl7.e;
                break;
            case 6:
                rl7Var = tl7.f;
                break;
            case 7:
                rl7Var = tl7.g;
                break;
            case 8:
                rl7Var = tl7.h;
                break;
            default:
                gk0.s();
                throw null;
        }
        str2 = (i & 16) != 0 ? null : str2;
        nl7Var = (i & 32) != 0 ? null : nl7Var;
        function0 = (i & 64) != 0 ? null : function0;
        sl7Var.getClass();
        str.getClass();
        g37Var.getClass();
        this.a = sl7Var;
        this.b = str;
        this.c = g37Var;
        this.d = rl7Var;
        this.e = str2;
        this.f = nl7Var;
        this.g = function0;
        String str3 = nl7Var != null ? nl7Var.a : null;
        this.h = str3 == null ? "" : str3;
        this.i = function0 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul7)) {
            return false;
        }
        ul7 ul7Var = (ul7) obj;
        return this.a == ul7Var.a && im3.n(this.b, ul7Var.b) && this.c == ul7Var.c && im3.n(this.d, ul7Var.d) && im3.n(this.e, ul7Var.e) && im3.n(this.f, ul7Var.f) && im3.n(this.g, ul7Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + to7.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        rl7 rl7Var = this.d;
        int iHashCode2 = (iHashCode + (rl7Var == null ? 0 : rl7Var.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        nl7 nl7Var = this.f;
        int iHashCode4 = (iHashCode3 + (nl7Var == null ? 0 : nl7Var.hashCode())) * 31;
        Function0 function0 = this.g;
        return (iHashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TVSnackbarVisuals(style=" + this.a + ", message=" + this.b + ", duration=" + this.c + ", leadingIcon=" + this.d + ", contentDescription=" + this.e + ", action=" + this.f + ", onDismiss=" + this.g + ", containerColor=null)";
    }
}
