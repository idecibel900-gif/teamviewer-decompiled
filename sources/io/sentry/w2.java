package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {
    public v2 a;
    public List b;

    public w2(v2 v2Var, List list) {
        this.a = v2.DENY_LIST;
        this.b = Collections.EMPTY_LIST;
        this.a = v2Var;
        this.b = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w2.class == obj.getClass()) {
            w2 w2Var = (w2) obj;
            if (this.a == w2Var.a && this.b.equals(w2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public w2() {
        this.a = v2.DENY_LIST;
        this.b = Collections.EMPTY_LIST;
    }
}
