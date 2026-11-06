package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/go8;", "Lo/ls4;", "Lo/ho8;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class go8 extends ls4 {
    public final float b;
    public final Object c;

    public go8(float f, Object obj) {
        this.b = f;
        this.c = obj;
    }

    @Override // o.ls4
    public final es4 create() {
        ho8 ho8Var = new ho8();
        ho8Var.A = this.b;
        ho8Var.B = this.c;
        return ho8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8Var = (go8) obj;
        return go8Var.b == this.b && im3.n(go8Var.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.b) * 31;
        Object obj = this.c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ho8 ho8Var = (ho8) es4Var;
        ho8Var.A = this.b;
        ho8Var.B = this.c;
    }
}
