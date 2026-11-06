package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rr3 {
    public final za6 a;
    public final za6 b;
    public final Map c = fa2.m;
    public final boolean d;

    public rr3(za6 za6Var, za6 za6Var2) {
        this.a = za6Var;
        this.b = za6Var2;
        new kh7(new a3(this, (byte) 18));
        za6 za6Var3 = za6.IGNORE;
        this.d = za6Var == za6Var3 && za6Var2 == za6Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr3)) {
            return false;
        }
        rr3 rr3Var = (rr3) obj;
        return this.a == rr3Var.a && this.b == rr3Var.b && this.c.equals(rr3Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        za6 za6Var = this.b;
        return this.c.hashCode() + ((iHashCode + (za6Var == null ? 0 : za6Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
