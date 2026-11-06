package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.es4;
import o.i98;
import o.ls4;
import o.w32;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Lo/ls4;", "Lo/i98;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends ls4 {
    public final float b;
    public final float c;

    public c(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // o.ls4
    public final es4 create() {
        i98 i98Var = new i98();
        i98Var.A = this.b;
        i98Var.B = this.c;
        return i98Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return w32.b(this.b, cVar.b) && w32.b(this.c, cVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        i98 i98Var = (i98) es4Var;
        i98Var.A = this.b;
        i98Var.B = this.c;
    }
}
