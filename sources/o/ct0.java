package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lo/ct0;", "Lo/ls4;", "Lo/hd1;", "Lo/bp6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ct0 extends ls4 implements bp6 {
    public final Function1 b;

    public ct0(Function1 function1) {
        this.b = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        return new hd1(false, true, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct0) {
            return this.b == ((ct0) obj).b;
        }
        return false;
    }

    @Override // o.bp6
    public final ap6 g() {
        ap6 ap6Var = new ap6();
        ap6Var.f346o = false;
        ap6Var.p = true;
        this.b.invoke(ap6Var);
        return ap6Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((hd1) es4Var).C = this.b;
    }
}
