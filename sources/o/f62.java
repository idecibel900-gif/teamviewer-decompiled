package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f62 {
    public final String a;
    public final Set b;

    public f62(Set set, String str) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((f62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
