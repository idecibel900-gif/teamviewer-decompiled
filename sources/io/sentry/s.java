package io.sentry;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final g7 a;

    public s(g7 g7Var) {
        this.a = g7Var;
    }

    public final w2 a() {
        g7 g7Var = this.a;
        w2 w2Var = g7Var.getDataCollection().b;
        if (w2Var != null) {
            return w2Var;
        }
        if (b()) {
            return new w2(v2.DENY_LIST, Arrays.asList(new String[0]));
        }
        return g7Var.isSendDefaultPii() ? new w2(v2.DENY_LIST, Arrays.asList(new String[0])) : new w2(v2.OFF, Collections.EMPTY_LIST);
    }

    public final boolean b() {
        return this.a.getDataCollection().a();
    }
}
