package io.sentry.android.core.performance;

import android.os.Build;
import android.os.Looper;
import io.sentry.c2;
import io.sentry.l5;
import io.sentry.v1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public l5 b = null;
    public l5 c = null;
    public v1 d = null;
    public v1 e = null;

    public a(String str) {
        this.a = str;
    }

    public static v1 a(v1 v1Var, String str, l5 l5Var) {
        v1 v1VarK = v1Var.k("activity.load", str, l5Var, c2.SENTRY);
        Thread thread = Looper.getMainLooper().getThread();
        io.sentry.android.core.internal.util.g gVar = io.sentry.android.core.internal.util.g.a;
        v1VarK.m(Long.valueOf(Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId()), "thread.id");
        v1VarK.m("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        v1VarK.m(bool, "ui.contributes_to_ttid");
        v1VarK.m(bool, "ui.contributes_to_ttfd");
        return v1VarK;
    }
}
