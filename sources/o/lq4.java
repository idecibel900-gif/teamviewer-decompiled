package o;

/* JADX INFO: loaded from: classes.dex */
public final class lq4 implements nb1 {
    public final int a;
    public final boolean b;

    public lq4(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // o.nb1
    public final sa1 a(ei4 ei4Var, qh4 qh4Var, p30 p30Var) {
        if (ei4Var.s.a.contains(fi4.m)) {
            return new mq4(this);
        }
        xe4.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
