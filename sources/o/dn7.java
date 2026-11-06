package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dn7 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public dn7(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn7)) {
            return false;
        }
        dn7 dn7Var = (dn7) obj;
        if (im3.n(this.a, dn7Var.a) && im3.n(this.b, dn7Var.b) && im3.n(this.c, dn7Var.c) && this.d.equals(dn7Var.d)) {
            return this.e.equals(dn7Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + to7.g(this.d, to7.e(to7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        vb7.B(lv0.t0(lv0.I0(this.d), ",", null, null, null, 62));
        vb7.B("},");
        f88 f88Var = f88.a;
        sb.append(f88Var);
        sb.append("\n            |   referenceColumnNames = {");
        vb7.B(lv0.t0(lv0.I0(this.e), ",", null, null, null, 62));
        vb7.B(" }");
        sb.append(f88Var);
        sb.append("\n            |}\n        ");
        return vb7.B(vb7.D(sb.toString()));
    }
}
