package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bl8 {
    public final List a;

    public bl8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !bl8.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((bl8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lv0.t0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
