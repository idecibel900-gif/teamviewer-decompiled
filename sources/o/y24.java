package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/y24;", "Lo/ls4;", "Lo/z24;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class y24 extends ls4 {
    public final e87 b;
    public final e87 c;
    public final e87 d;

    public y24(e87 e87Var, e87 e87Var2, e87 e87Var3) {
        this.b = e87Var;
        this.c = e87Var2;
        this.d = e87Var3;
    }

    @Override // o.ls4
    public final es4 create() {
        z24 z24Var = new z24();
        z24Var.A = this.b;
        z24Var.B = this.c;
        z24Var.C = this.d;
        return z24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y24)) {
            return false;
        }
        y24 y24Var = (y24) obj;
        return this.b.equals(y24Var.b) && this.c.equals(y24Var.c) && this.d.equals(y24Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        z24 z24Var = (z24) es4Var;
        z24Var.A = this.b;
        z24Var.B = this.c;
        z24Var.C = this.d;
    }
}
