package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/m04;", "Lo/ls4;", "Lo/n04;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class m04 extends ls4 {
    public final String b;

    public m04(String str) {
        this.b = str;
    }

    @Override // o.ls4
    public final es4 create() {
        n04 n04Var = new n04();
        n04Var.A = this.b;
        return n04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m04) && this.b.equals(((m04) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((n04) es4Var).A = this.b;
    }
}
