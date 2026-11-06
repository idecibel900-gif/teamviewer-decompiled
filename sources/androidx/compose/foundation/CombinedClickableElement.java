package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o.e41;
import o.es4;
import o.im3;
import o.ls4;
import o.mw4;
import o.sw0;
import o.to7;
import o.vn4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lo/ls4;", "Lo/sw0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CombinedClickableElement extends ls4 {
    public final mw4 b;
    public final boolean c;
    public final Function0 d;
    public final Function0 e;

    public CombinedClickableElement(Function0 function0, Function0 function1, mw4 mw4Var, boolean z) {
        this.b = mw4Var;
        this.c = z;
        this.d = function0;
        this.e = function1;
    }

    @Override // o.ls4
    public final es4 create() {
        return new sw0(this.d, this.e, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return im3.n(this.b, combinedClickableElement.b) && this.c == combinedClickableElement.c && this.d == combinedClickableElement.d && this.e == combinedClickableElement.e;
    }

    public final int hashCode() {
        mw4 mw4Var = this.b;
        int iF = e41.f(to7.f(to7.f((mw4Var != null ? mw4Var.hashCode() : 0) * 961, 31, this.c), 29791, true), 961, this.d);
        Function0 function0 = this.e;
        return Boolean.hashCode(true) + ((iF + (function0 != null ? function0.hashCode() : 0)) * 961);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        boolean z;
        sw0 sw0Var = (sw0) es4Var;
        sw0Var.X = true;
        boolean z2 = sw0Var.W == null;
        Function0 function0 = this.e;
        if (z2 != (function0 == null)) {
            sw0Var.Z0();
            vn4.p0(sw0Var).U();
            z = true;
        } else {
            z = false;
        }
        sw0Var.W = function0;
        boolean z3 = !sw0Var.H ? true : z;
        sw0Var.k1(this.b, null, this.c, true, null, null, this.d);
        if (z3) {
            sw0Var.l1(false);
            sw0Var.l1(true);
        }
    }
}
