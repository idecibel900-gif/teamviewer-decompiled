package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/er2;", "Lo/ls4;", "Lo/fr2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class er2 extends ls4 {
    public final mw4 b;

    public er2(mw4 mw4Var) {
        this.b = mw4Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new fr2(this.b, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof er2) {
            return im3.n(this.b, ((er2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        mw4 mw4Var = this.b;
        if (mw4Var != null) {
            return mw4Var.hashCode();
        }
        return 0;
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ((fr2) es4Var).Y0(this.b);
    }
}
