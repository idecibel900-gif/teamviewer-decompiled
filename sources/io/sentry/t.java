package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j0 {
    public final /* synthetic */ byte a;
    public final Map b;
    public final g7 c;

    public t(g7 g7Var) {
        this.a = (byte) 1;
        this.b = Collections.synchronizedMap(new WeakHashMap());
        this.c = g7Var;
    }

    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, p0 p0Var) {
        io.sentry.protocol.v vVarF;
        String str;
        Long l;
        byte b = this.a;
        g7 g7Var = this.c;
        Map map = this.b;
        switch (b) {
            case 0:
                if (!g8.class.isInstance(p0Var.b("sentry:typeCheckHint")) || (vVarF = v5Var.f()) == null || (str = vVarF.m) == null || (l = vVarF.p) == null) {
                    return v5Var;
                }
                Long l2 = (Long) map.get(str);
                if (l2 == null || l2.equals(l)) {
                    map.put(str, l);
                    return v5Var;
                }
                ((SentryAndroidOptions) g7Var).getLogger().g(f6.INFO, "Event %s has been dropped due to multi-threaded deduplication", v5Var.m);
                p0Var.d(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            default:
                if (!g7Var.isEnableDeduplication()) {
                    g7Var.getLogger().g(f6.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return v5Var;
                }
                Throwable thA = v5Var.a();
                if (thA == null) {
                    return v5Var;
                }
                if (!map.containsKey(thA)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map.containsKey(it.next())) {
                        }
                    }
                    map.put(thA, null);
                    return v5Var;
                }
                g7Var.getLogger().g(f6.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", v5Var.m);
                return null;
        }
    }

    public t(SentryAndroidOptions sentryAndroidOptions) {
        this.a = (byte) 0;
        this.b = Collections.synchronizedMap(new HashMap());
        this.c = sentryAndroidOptions;
    }
}
