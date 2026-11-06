package io.sentry.util;

import io.sentry.f6;
import io.sentry.g1;
import io.sentry.t1;
import io.sentry.t2;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Charset a = Charset.forName("UTF-8");

    public static long a(t1 t1Var, g1 g1Var, t2 t2Var) {
        try {
            e eVar = new e();
            t1Var.a(t2Var, eVar);
            return eVar.m;
        } catch (Throwable th) {
            g1Var.d(f6.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static HashMap b(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
