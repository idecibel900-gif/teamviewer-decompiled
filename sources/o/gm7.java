package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/gm7;", "Lo/ls4;", "Lo/im7;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class gm7 extends ls4 {
    public final bg5 b;
    public final int c;
    public final boolean d;
    public final e87 e;

    public gm7(bg5 bg5Var, int i, boolean z, e87 e87Var) {
        this.b = bg5Var;
        this.c = i;
        this.d = z;
        this.e = e87Var;
    }

    @Override // o.ls4
    public final es4 create() {
        im7 im7Var = new im7();
        im7Var.A = this.b;
        im7Var.B = this.c;
        im7Var.C = this.d;
        im7Var.D = this.e;
        return im7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gm7) {
            gm7 gm7Var = (gm7) obj;
            if (this.b == gm7Var.b && this.c == gm7Var.c && this.d == gm7Var.d && this.e.equals(gm7Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + to7.f(fx3.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.b + ", selectedTabIndex=" + this.c + ", followContentSize=" + this.d + ", animationSpec=" + this.e + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        im7 im7Var = (im7) es4Var;
        im7Var.A = this.b;
        im7Var.B = this.c;
        im7Var.C = this.d;
        im7Var.D = this.e;
    }
}
