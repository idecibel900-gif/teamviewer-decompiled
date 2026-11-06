package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lo/iv;", "Lo/ls4;", "Lo/hd1;", "Lo/bp6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class iv extends ls4 implements bp6 {
    public final boolean b;
    public final Function1 c;

    public iv(Function1 function1, boolean z) {
        this.b = z;
        this.c = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        return new hd1(this.b, false, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        return this.b == ivVar.b && this.c == ivVar.c;
    }

    @Override // o.bp6
    public final ap6 g() {
        ap6 ap6Var = new ap6();
        ap6Var.f346o = this.b;
        this.c.invoke(ap6Var);
        return ap6Var;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        hd1 hd1Var = (hd1) es4Var;
        hd1Var.A = this.b;
        hd1Var.C = this.c;
    }
}
