package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/pg7;", "Lo/ls4;", "Lo/vg7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pg7 extends ls4 {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public pg7(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.b = obj;
        this.c = obj2;
        this.d = pointerInputEventHandler;
    }

    @Override // o.ls4
    public final es4 create() {
        return new vg7(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg7)) {
            return false;
        }
        pg7 pg7Var = (pg7) obj;
        return im3.n(this.b, pg7Var.b) && im3.n(this.c, pg7Var.c) && this.d == pg7Var.d;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        vg7 vg7Var = (vg7) es4Var;
        Object obj = vg7Var.A;
        Object obj2 = this.b;
        boolean z = !im3.n(obj, obj2);
        vg7Var.A = obj2;
        Object obj3 = vg7Var.B;
        Object obj4 = this.c;
        if (!im3.n(obj3, obj4)) {
            z = true;
        }
        vg7Var.B = obj4;
        Class<?> cls = vg7Var.C.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            vg7Var.W0();
        }
        vg7Var.C = pointerInputEventHandler;
    }
}
