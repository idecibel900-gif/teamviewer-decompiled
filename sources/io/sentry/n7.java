package io.sentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n7 {
    public static final Pattern d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public final io.sentry.protocol.w a;
    public final y7 b;
    public final Boolean c;

    public n7(String str) throws io.sentry.exception.b {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw new io.sentry.exception.b("sentry-trace header does not conform to expected format: ".concat(str), null);
        }
        this.a = new io.sentry.protocol.w(matcher.group(1));
        this.b = new y7(matcher.group(2));
        String strGroup = matcher.group(3);
        this.c = strGroup != null ? Boolean.valueOf("1".equals(strGroup.substring(1))) : null;
    }

    public final String a() {
        y7 y7Var = this.b;
        Boolean bool = this.c;
        io.sentry.protocol.w wVar = this.a;
        if (bool == null) {
            return wVar + "-" + y7Var;
        }
        return wVar + "-" + y7Var + "-" + (bool.booleanValue() ? "1" : "0");
    }

    public n7(io.sentry.protocol.w wVar, y7 y7Var, Boolean bool) {
        this.a = wVar;
        this.b = y7Var;
        this.c = bool;
    }
}
