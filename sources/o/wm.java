package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/wm;", "Lo/ls4;", "Lo/xm;", "adaptive-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wm extends ls4 {
    public final Function0 b;
    public final rl2 c;
    public final Function1 d;
    public final xu7 e;
    public final boolean f;

    public wm(Function0 function0, rl2 rl2Var, Function1 function1, xu7 xu7Var, boolean z) {
        this.b = function0;
        this.c = rl2Var;
        this.d = function1;
        this.e = xu7Var;
        this.f = z;
    }

    @Override // o.ls4
    public final es4 create() {
        return new xm(this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wm) {
            wm wmVar = (wm) obj;
            return this.f == wmVar.f && this.b == wmVar.b && im3.n(this.c, wmVar.c) && this.d == wmVar.d && this.e == wmVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return iq8.H.hashCode() + ((this.e.hashCode() + ua5.d((this.c.hashCode() + e41.f(Boolean.hashCode(this.f) * 31, 31, this.b)) * 31, 31, this.d)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        xm xmVar = (xm) es4Var;
        xmVar.A = this.b;
        xmVar.E.m = this.c;
        xmVar.B = this.d;
        xmVar.C = this.e;
        xmVar.D = this.f;
    }
}
