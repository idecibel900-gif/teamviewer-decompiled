package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/mw6;", "Lo/ls4;", "Lo/v70;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class mw6 extends ls4 {
    public final qf6 b;
    public final boolean c;
    public final long d;
    public final long e;

    public mw6(qf6 qf6Var, boolean z, long j, long j2) {
        this.b = qf6Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // o.ls4
    public final es4 create() {
        return new v70(new y46(this, (byte) 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw6)) {
            return false;
        }
        mw6 mw6Var = (mw6) obj;
        if (!w32.b(3.0f, 3.0f) || !this.b.equals(mw6Var.b) || this.c != mw6Var.c) {
            return false;
        }
        long j = mw6Var.d;
        int i = rv0.i;
        return z68.a(this.d, j) && z68.a(this.e, mw6Var.e);
    }

    public final int hashCode() {
        int iF = to7.f((this.b.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.c);
        int i = rv0.i;
        return Long.hashCode(this.e) + fx3.c(iF, 31, this.d);
    }

    public final String toString() {
        String strC = w32.c(3.0f);
        String strH = rv0.h(this.d);
        String strH2 = rv0.h(this.e);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        sb.append(strH);
        sb.append(", spotColor=");
        return e41.l(sb, strH2, ")");
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        v70 v70Var = (v70) es4Var;
        y46 y46Var = new y46(this, (byte) 16);
        v70Var.A = y46Var;
        nv1.N(v70Var, y46Var);
    }
}
