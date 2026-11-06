package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/kc8;", "Lo/ls4;", "Lo/mc8;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class kc8 extends ls4 {
    public final u18 b;
    public final n18 c;
    public final bc2 d;
    public final hf2 e;
    public final dy6 f;

    public kc8(u18 u18Var, n18 n18Var, bc2 bc2Var, hf2 hf2Var, dy6 dy6Var) {
        this.b = u18Var;
        this.c = n18Var;
        this.d = bc2Var;
        this.e = hf2Var;
        this.f = dy6Var;
    }

    @Override // o.ls4
    public final es4 create() {
        mc8 mc8Var = new mc8();
        mc8Var.A = this.c;
        mc8Var.B = this.d;
        mc8Var.C = this.e;
        mc8Var.D = this.f;
        return mc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc8) {
            kc8 kc8Var = (kc8) obj;
            return this.b == kc8Var.b && im3.n(this.c, kc8Var.c) && this.d.equals(kc8Var.d) && im3.n(this.e, kc8Var.e) && this.f == kc8Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.b + ", veilAnimation=" + this.c + ", enter=" + this.d + ", exit=" + this.e + ", mutableTransformState=" + this.f + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        mc8 mc8Var = (mc8) es4Var;
        mc8Var.getClass();
        mc8Var.A = this.c;
        mc8Var.B = this.d;
        mc8Var.C = this.e;
        mc8Var.D = this.f;
    }
}
