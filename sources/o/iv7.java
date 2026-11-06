package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/iv7;", "Lo/ls4;", "Lo/kv7;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class iv7 extends ls4 {
    public final mw4 b;
    public final boolean c;
    public final e87 d;

    public iv7(mw4 mw4Var, boolean z, e87 e87Var) {
        this.b = mw4Var;
        this.c = z;
        this.d = e87Var;
    }

    @Override // o.ls4
    public final es4 create() {
        kv7 kv7Var = new kv7();
        kv7Var.A = this.b;
        kv7Var.B = this.c;
        kv7Var.C = this.d;
        kv7Var.G = Float.NaN;
        kv7Var.H = Float.NaN;
        return kv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv7)) {
            return false;
        }
        iv7 iv7Var = (iv7) obj;
        return im3.n(this.b, iv7Var.b) && this.c == iv7Var.c && this.d.equals(iv7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.f(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        kv7 kv7Var = (kv7) es4Var;
        kv7Var.A = this.b;
        boolean z = kv7Var.B;
        boolean z2 = this.c;
        if (z != z2) {
            vn4.p0(kv7Var).S();
        }
        kv7Var.B = z2;
        kv7Var.C = this.d;
        if (kv7Var.F == null && !Float.isNaN(kv7Var.H)) {
            kv7Var.F = ck3.a(kv7Var.H);
        }
        if (kv7Var.E != null || Float.isNaN(kv7Var.G)) {
            return;
        }
        kv7Var.E = ck3.a(kv7Var.G);
    }
}
