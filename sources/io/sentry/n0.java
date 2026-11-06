package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final String a;
    public final Pattern b;

    public n0(String str) {
        Pattern patternCompile;
        this.a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            d5.c().l().getLogger().g(f6.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
