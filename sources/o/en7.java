package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class en7 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public en7(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof en7) {
            en7 en7Var = (en7) obj;
            String str = en7Var.a;
            if (this.b == en7Var.b && this.c.equals(en7Var.c) && im3.n(this.d, en7Var.d)) {
                String str2 = this.a;
                return bc7.N(false, str2, "index_") ? bc7.N(false, str, "index_") : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + to7.g(this.c, (((bc7.N(false, str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        vb7.B(lv0.t0(this.c, ",", null, null, null, 62));
        vb7.B("},");
        f88 f88Var = f88.a;
        sb.append(f88Var);
        sb.append("\n            |   orders = {");
        vb7.B(lv0.t0(this.d, ",", null, null, null, 62));
        vb7.B(" }");
        sb.append(f88Var);
        sb.append("\n            |}\n        ");
        return vb7.B(vb7.D(sb.toString()));
    }
}
