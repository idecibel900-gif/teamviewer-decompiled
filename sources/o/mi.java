package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mi {
    public final Context a;
    public final in1 b;
    public final long c;
    public final pd5 d;

    public mi(Context context, in1 in1Var, long j, pd5 pd5Var) {
        this.a = context;
        this.b = in1Var;
        this.c = j;
        this.d = pd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mi miVar = (mi) obj;
        if (!im3.n(this.a, miVar.a) || !im3.n(this.b, miVar.b)) {
            return false;
        }
        long j = miVar.c;
        int i = rv0.i;
        return z68.a(this.c, j) && this.d.equals(miVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = rv0.i;
        return this.d.hashCode() + fx3.c(iHashCode, 31, this.c);
    }
}
