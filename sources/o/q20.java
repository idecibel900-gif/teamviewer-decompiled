package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class q20 {
    public final String a;
    public final String b;
    public final String c;
    public final Function0 d;
    public final String e;
    public final Function0 f;

    public q20(String str, String str2, String str3, Function0 function0, String str4, Function0 function1) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function0;
        this.e = str4;
        this.f = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return im3.n(this.a, q20Var.a) && im3.n(this.b, q20Var.b) && this.c.equals(q20Var.c) && this.d.equals(q20Var.d) && im3.n(this.e, q20Var.e) && this.f.equals(q20Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iF = e41.f(to7.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        String str3 = this.e;
        return this.f.hashCode() + ((iF + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("BannerDialogData(title=", this.a, ", description=", this.b, ", confirmText=");
        sbO.append(this.c);
        sbO.append(", onConfirm=");
        sbO.append(this.d);
        sbO.append(", dismissText=");
        sbO.append(this.e);
        sbO.append(", onDismiss=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
