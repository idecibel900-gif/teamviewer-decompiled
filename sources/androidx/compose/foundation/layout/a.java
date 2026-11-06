package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.e41;
import o.es4;
import o.ls4;
import o.w32;
import o.z07;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "Lo/ls4;", "Lo/z07;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends ls4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public a(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // o.ls4
    public final es4 create() {
        z07 z07Var = new z07();
        z07Var.A = this.b;
        z07Var.B = this.c;
        z07Var.C = this.d;
        z07Var.D = this.e;
        z07Var.E = this.f;
        return z07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return w32.b(this.b, aVar.b) && w32.b(this.c, aVar.c) && w32.b(this.d, aVar.d) && w32.b(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + e41.e(this.e, e41.e(this.d, e41.e(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        z07 z07Var = (z07) es4Var;
        z07Var.A = this.b;
        z07Var.B = this.c;
        z07Var.C = this.d;
        z07Var.D = this.e;
        z07Var.E = this.f;
    }

    public a(float f, float f2, float f3, float f4, boolean z) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }
}
