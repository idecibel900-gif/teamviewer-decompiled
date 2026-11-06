package o;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class xd4 {
    public static final String d;
    public static final pd4 e;
    public final e07 a;
    public final d82 b;
    public final String c;

    static {
        String canonicalName = xd4.class.getCanonicalName();
        canonicalName.getClass();
        int iE0 = ub7.e0(canonicalName, 0, 6, ".");
        d = iE0 == -1 ? "" : canonicalName.substring(0, iE0);
        e = new pd4("NO_LOCKS", jk0.w);
    }

    public xd4(String str) {
        this(str, new xk1((Object) new ReentrantLock(), (byte) 0));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final vd4 a(Function0 function0) {
        return new vd4(this, function0);
    }

    public final sd4 b(Function1 function1) {
        return new sd4(this, new ConcurrentHashMap(3, 1.0f, 2), function1, (byte) 1);
    }

    public final h50 c(Function1 function1) {
        return new h50(this, new ConcurrentHashMap(3, 1.0f, 2), function1, (byte) 2);
    }

    public io.sentry.android.core.u0 d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return e41.l(sb, this.c, ")");
    }

    public xd4(String str, e07 e07Var) {
        d82 d82Var = d82.F;
        this.a = e07Var;
        this.b = d82Var;
        this.c = str;
    }
}
