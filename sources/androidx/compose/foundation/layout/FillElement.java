package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.bl2;
import o.es4;
import o.ls4;
import o.r12;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lo/ls4;", "Lo/bl2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FillElement extends ls4 {
    public final r12 b;
    public final float c;

    public FillElement(r12 r12Var, float f) {
        this.b = r12Var;
        this.c = f;
    }

    @Override // o.ls4
    public final es4 create() {
        bl2 bl2Var = new bl2();
        bl2Var.A = this.b;
        bl2Var.B = this.c;
        return bl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        bl2 bl2Var = (bl2) es4Var;
        bl2Var.A = this.b;
        bl2Var.B = this.c;
    }
}
