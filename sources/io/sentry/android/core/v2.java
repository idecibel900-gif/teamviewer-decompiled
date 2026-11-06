package io.sentry.android.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public final Integer a;
    public final Boolean b;

    public v2(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return io.sentry.util.b.j(this.a, v2Var.a) && io.sentry.util.b.j(this.b, v2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
