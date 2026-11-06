package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/ld5;", "Lo/ls4;", "Lo/md5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ld5 extends ls4 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Function1 f;

    public ld5(float f, float f2, float f3, float f4, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            ii3.a("Padding must be non-negative");
        }
    }

    @Override // o.ls4
    public final es4 create() {
        md5 md5Var = new md5();
        md5Var.A = this.b;
        md5Var.B = this.c;
        md5Var.C = this.d;
        md5Var.D = this.e;
        md5Var.E = true;
        return md5Var;
    }

    public final boolean equals(Object obj) {
        ld5 ld5Var = obj instanceof ld5 ? (ld5) obj : null;
        return ld5Var != null && w32.b(this.b, ld5Var.b) && w32.b(this.c, ld5Var.c) && w32.b(this.d, ld5Var.d) && w32.b(this.e, ld5Var.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + e41.e(this.e, e41.e(this.d, e41.e(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        md5 md5Var = (md5) es4Var;
        md5Var.A = this.b;
        md5Var.B = this.c;
        md5Var.C = this.d;
        md5Var.D = this.e;
        md5Var.E = true;
    }
}
