package androidx.compose.foundation;

import kotlin.Metadata;
import o.bk6;
import o.es4;
import o.hk6;
import o.im3;
import o.ls4;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lo/ls4;", "Lo/bk6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollingLayoutElement extends ls4 {
    public final hk6 b;
    public final boolean c;

    public ScrollingLayoutElement(hk6 hk6Var, boolean z) {
        this.b = hk6Var;
        this.c = z;
    }

    @Override // o.ls4
    public final es4 create() {
        bk6 bk6Var = new bk6();
        bk6Var.A = this.b;
        bk6Var.B = this.c;
        return bk6Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return im3.n(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + to7.f(this.b.hashCode() * 31, 31, false);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        bk6 bk6Var = (bk6) es4Var;
        bk6Var.A = this.b;
        bk6Var.B = this.c;
    }
}
