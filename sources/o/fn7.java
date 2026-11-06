package o;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fn7 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public fn7(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn7)) {
            return false;
        }
        fn7 fn7Var = (fn7) obj;
        if (!this.a.equals(fn7Var.a) || !this.b.equals(fn7Var.b) || !this.c.equals(fn7Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = fn7Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(r47.t(lv0.J0(this.b.values(), new dj6((byte) 6))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(r47.t(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(r47.t(set != null ? lv0.J0(set, new dj6((byte) 7)) : ea2.m));
        sb.append("\n            |}\n        ");
        return vb7.D(sb.toString());
    }
}
