package o;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ro8 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = ub7.j0(ub7.i0(c75.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(h93 h93Var, h93 h93Var2) {
        h93Var.getClass();
        return im3.n(h93Var.d, h93Var2.d) && h93Var.e == h93Var2.e && im3.n(h93Var.a, h93Var2.a);
    }

    public static final int b(long j) {
        TimeUnit.MILLISECONDS.getClass();
        if (j < 0) {
            an4.g("timeout < 0");
            return 0;
        }
        if (j > 2147483647L) {
            gk0.h("timeout too large");
            return 0;
        }
        if (j != 0 || j <= 0) {
            return (int) j;
        }
        gk0.h("timeout too small");
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!im3.n(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(lc6 lc6Var) {
        String strA = lc6Var.r.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = po8.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(of0 of0Var, Charset charset) {
        of0Var.getClass();
        charset.getClass();
        int iI0 = of0Var.I0(po8.b);
        if (iI0 == -1) {
            return charset;
        }
        if (iI0 == 0) {
            return vn0.a;
        }
        if (iI0 == 1) {
            return vn0.b;
        }
        if (iI0 == 2) {
            Charset charset2 = vn0.a;
            Charset charset3 = vn0.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            vn0.e = charsetForName;
            return charsetForName;
        }
        if (iI0 == 3) {
            return vn0.c;
        }
        if (iI0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = vn0.a;
        Charset charset5 = vn0.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        vn0.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(q67 q67Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = q67Var.i().e() ? q67Var.i().c() - jNanoTime : Long.MAX_VALUE;
        q67Var.i().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            bf0 bf0Var = new bf0();
            while (q67Var.i0(bf0Var, 8192L) != -1) {
                bf0Var.e();
            }
            if (jC == Long.MAX_VALUE) {
                q67Var.i().a();
                return true;
            }
            q67Var.i().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                q67Var.i().a();
                return false;
            }
            q67Var.i().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                q67Var.i().a();
            } else {
                q67Var.i().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final k53 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d53 d53Var = (d53) it.next();
            ai0 ai0Var = d53Var.a;
            ai0 ai0Var2 = d53Var.b;
            String strS = ai0Var.s();
            String strS2 = ai0Var2.s();
            arrayList.add(strS);
            arrayList.add(ub7.x0(strS2).toString());
        }
        return new k53((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(h93 h93Var, boolean z) {
        int i;
        h93Var.getClass();
        int i2 = h93Var.e;
        String strI = h93Var.d;
        if (ub7.Q(strI, ":", false)) {
            strI = to7.i(']', "[", strI);
        }
        if (!z) {
            String str = h93Var.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strI;
            }
        }
        return strI + ':' + i2;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return ea2.m;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return ea2.m;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
