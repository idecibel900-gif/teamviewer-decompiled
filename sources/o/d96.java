package o;

import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public class d96 {
    public static final boolean b;
    public final Pattern a;

    static {
        boolean z = false;
        try {
            try {
                Class<?> cls = Class.forName("com.google.re2j.Pattern", false, d96.class.getClassLoader());
                try {
                    Class<?> cls2 = Class.forName("java.lang.Module");
                    Method method = Class.class.getMethod("getModule", null);
                    Object objInvoke = method.invoke(d96.class, null);
                    Object objInvoke2 = method.invoke(cls, null);
                    if (!((Boolean) cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2)).booleanValue()) {
                        cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                    }
                } catch (ClassNotFoundException unused) {
                }
                z = true;
            } catch (ClassNotFoundException unused2) {
            }
        } catch (ReflectiveOperationException e) {
            System.err.println("Warning: (bug? please report) couldn't access re2j from jsoup due to modules: " + e);
        }
        b = z;
    }

    public d96(Pattern pattern) {
        this.a = pattern;
    }

    public static d96 a(String str) {
        if (b && Boolean.parseBoolean(System.getProperty("jsoup.useRe2j", "true"))) {
            return e36.c(str);
        }
        try {
            return new d96(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new fb8("Pattern syntax error: " + e.getMessage());
        }
    }

    public b96 b(String str) {
        return new g95(this.a.matcher(str));
    }

    public String toString() {
        return this.a.toString();
    }
}
