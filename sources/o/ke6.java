package o;

/* JADX INFO: loaded from: classes.dex */
public final class ke6 {
    public final nv1 a;
    public final zu1 b;
    public final lv1 c;
    public final vt1 d;

    public ke6(nv1 nv1Var, zu1 zu1Var, lv1 lv1Var, vt1 vt1Var) {
        this.a = nv1Var;
        this.b = zu1Var;
        this.c = lv1Var;
        this.d = vt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke6)) {
            return false;
        }
        ke6 ke6Var = (ke6) obj;
        return this.a.equals(ke6Var.a) && this.b.equals(ke6Var.b) && this.c.equals(ke6Var.c) && this.d.equals(ke6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
