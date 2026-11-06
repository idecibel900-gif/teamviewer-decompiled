package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/en5;", "Lo/ls4;", "Lo/fn5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class en5 extends ls4 {
    public final yj b;

    public en5(yj yjVar) {
        this.b = yjVar;
    }

    @Override // o.ls4
    public final es4 create() {
        return new fn5(this.b, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en5) && this.b.equals(((en5) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        fn5 fn5Var = (fn5) es4Var;
        yj yjVar = fn5Var.B;
        yj yjVar2 = this.b;
        if (im3.n(yjVar, yjVar2)) {
            return;
        }
        fn5Var.B = yjVar2;
        if (fn5Var.C) {
            fn5Var.W0();
        }
    }
}
