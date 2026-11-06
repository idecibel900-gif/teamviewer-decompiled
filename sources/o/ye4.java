package o;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ye4 {
    public static final ye4 a = new ye4();
    public static lu b;

    public static final synchronized void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.a(4, str, str2);
            }
        }
    }

    public static final synchronized void c(String str, String str2) {
        str.getClass();
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.a(6, str, str2);
            }
        }
    }

    public static final synchronized void d(String str, Throwable th) {
        lu luVar = b;
        if (luVar != null) {
            String stackTraceString = Log.getStackTraceString(th);
            stackTraceString.getClass();
            synchronized (luVar) {
                luVar.a.a(6, str, stackTraceString);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.a(3, str, str2);
            }
        }
    }

    public final synchronized void e(String str, Object... objArr) {
        lu luVar = b;
        if (luVar != null) {
            luVar.a(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public final synchronized void f(String str, String str2) {
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.a(6, str, str2);
            }
        }
    }

    public final synchronized void g(String str, String str2) {
        str.getClass();
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.a(5, str, str2);
            }
        }
    }

    public final synchronized void h(boolean z) {
        lu luVar = b;
        if (luVar != null) {
            synchronized (luVar) {
                luVar.a.b(z ? (byte) 2 : lu.c);
            }
        }
    }
}
