package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o.es4;
import o.im3;
import o.kt0;
import o.ls4;
import o.mw4;
import o.pe6;
import o.to7;
import o.xg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lo/ls4;", "Lo/kt0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ClickableElement extends ls4 {
    public final mw4 b;
    public final xg3 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final pe6 g;
    public final Function0 h;

    public ClickableElement(mw4 mw4Var, xg3 xg3Var, boolean z, boolean z2, String str, pe6 pe6Var, Function0 function0) {
        this.b = mw4Var;
        this.c = xg3Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = pe6Var;
        this.h = function0;
    }

    @Override // o.ls4
    public final es4 create() {
        return new kt0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return im3.n(this.b, clickableElement.b) && im3.n(this.c, clickableElement.c) && this.d == clickableElement.d && this.e == clickableElement.e && im3.n(this.f, clickableElement.f) && im3.n(this.g, clickableElement.g) && this.h == clickableElement.h;
    }

    public final int hashCode() {
        mw4 mw4Var = this.b;
        int iHashCode = (mw4Var != null ? mw4Var.hashCode() : 0) * 31;
        xg3 xg3Var = this.c;
        int iF = to7.f(to7.f((iHashCode + (xg3Var != null ? xg3Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iF + (str != null ? str.hashCode() : 0)) * 31;
        pe6 pe6Var = this.g;
        return this.h.hashCode() + ((iHashCode2 + (pe6Var != null ? Integer.hashCode(pe6Var.a) : 0)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((kt0) es4Var).k1(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
