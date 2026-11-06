package io.sentry.config;

import io.sentry.util.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import o.e41;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        io.sentry.util.b.v(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final Map d() {
        String strL = e41.l(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strL)) {
                    map.put(str.substring(strL.length()), r.d((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return r.d(this.b.getProperty(this.a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
