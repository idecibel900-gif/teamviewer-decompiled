package io.sentry.util;

import io.sentry.a0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.d1;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g3;
import io.sentry.g7;
import io.sentry.h2;
import io.sentry.h4;
import io.sentry.m7;
import io.sentry.n1;
import io.sentry.n7;
import io.sentry.p0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.q7;
import io.sentry.v1;
import io.sentry.v2;
import io.sentry.v3;
import io.sentry.v5;
import io.sentry.w2;
import io.sentry.w7;
import io.sentry.y7;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.fx3;
import o.gk0;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String[] a = new String[0];

    public static void A(v5 v5Var, SentryAndroidOptions sentryAndroidOptions) {
        ArrayList arrayListD = v5Var.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                c0 c0Var = ((v) it.next()).q;
                if (c0Var != null) {
                    B(c0Var, v5Var, sentryAndroidOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListE = v5Var.e();
        if (arrayListE != null) {
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                c0 c0Var2 = ((e0) it2.next()).u;
                if (c0Var2 != null) {
                    B(c0Var2, v5Var, sentryAndroidOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void B(c0 c0Var, v5 v5Var, g7 g7Var, String str) {
        List list = c0Var.m;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        c0Var.m = arrayList;
        g7Var.getLogger().g(f6.DEBUG, str, v5Var.m);
    }

    public static CopyOnWriteArrayList C(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                h2.f();
                return null;
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static void a(String str) {
        d6.d().a(str);
    }

    public static h4 b(h4 h4Var) {
        if (((Double) h4Var.c) != null) {
            return h4Var;
        }
        return new h4((Boolean) h4Var.a, (Double) h4Var.b, c((Boolean) h4Var.a, null, (Double) h4Var.b), (Boolean) h4Var.d, (Double) h4Var.e);
    }

    public static Double c(Boolean bool, Double d, Double d2) {
        if (d != null) {
            return d;
        }
        double dC = p.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static ClassLoader d(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static boolean e(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            try {
                if (str.matches(str2)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean f(File file) {
        return file.isDirectory() || file.mkdirs() || file.isDirectory();
    }

    public static p0 g(Object obj) {
        p0 p0Var = new p0();
        p0Var.d(obj, "sentry:typeCheckHint");
        return p0Var;
    }

    public static boolean h(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!h(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static io.sentry.d i(io.sentry.d dVar, Boolean bool, Double d, Double d2) {
        if (dVar == null) {
            dVar = new io.sentry.d(g3.m);
        }
        if (dVar.d == null) {
            Double d3 = dVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double dC = c(bool, d2, d);
            if (dVar.f) {
                dVar.d = dC;
            }
        }
        if (dVar.f && dVar.g) {
            dVar.f = false;
        }
        return dVar;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String k(String str, io.sentry.s sVar) {
        String strDecode;
        v2 v2Var;
        if (!sVar.b()) {
            return str;
        }
        w2 w2Var = sVar.a.getDataCollection().c;
        if (w2Var == null) {
            w2Var = new w2(v2.DENY_LIST, Arrays.asList(new String[0]));
        }
        List list = d.a;
        if (str == null || w2Var.a == v2.OFF) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("&", -1);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i > 0) {
                sb.append('&');
            }
            String str2 = strArrSplit[i];
            int iIndexOf = str2.indexOf(61);
            String strSubstring = iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
            try {
                strDecode = URLDecoder.decode(strSubstring, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
                strDecode = strSubstring;
            }
            boolean zA = d.a(strDecode, d.b);
            boolean zA2 = d.a(strDecode, w2Var.b);
            boolean z = zA || ((v2Var = w2Var.a) == v2.DENY_LIST && zA2) || (v2Var == v2.ALLOW_LIST && !zA2);
            sb.append(strSubstring);
            if (z) {
                sb.append("=[Filtered]");
            } else if (iIndexOf >= 0) {
                sb.append(str2.substring(iIndexOf));
            }
        }
        return sb.toString();
    }

    public static boolean l(p0 p0Var, Class cls) {
        return cls.isInstance(p0Var.b("sentry:typeCheckHint"));
    }

    public static byte[] m(InputStream inputStream, long j) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                long j2 = 0;
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArray;
                    }
                    j2 += (long) i;
                    if (j2 > j) {
                        throw new IOException(String.format("Reading input failed, because %d read bytes is bigger than the maximum allowed size of %d bytes.", Long.valueOf(j2), Long.valueOf(j)));
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static boolean n(p0 p0Var) {
        return Boolean.TRUE.equals(p0Var.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean o(v5 v5Var, SentryAndroidOptions sentryAndroidOptions) {
        return f.a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), v5Var) <= g7.MAX_EVENT_SIZE_BYTES;
    }

    public static boolean p(Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static void q(Class cls, Object obj, g1 g1Var) {
        g1Var.g(f6.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ConcurrentHashMap r(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static io.sentry.o s(String str, io.sentry.s sVar) {
        String str2;
        byte b = 8;
        Object obj = null;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                String scheme = uri.getScheme();
                if ("ws".equalsIgnoreCase(scheme) || "wss".equalsIgnoreCase(scheme)) {
                    if (!uri.isOpaque() && uri.getRawAuthority() != null && !uri.getRawAuthority().isEmpty()) {
                    }
                    return new io.sentry.o(obj, obj, obj, b);
                }
                try {
                    uri.toURL();
                } catch (Exception unused) {
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            String rawQuery = uri.getRawQuery();
            if (sVar != null) {
                rawQuery = k(rawQuery, sVar);
            }
            String rawFragment = uri.getRawFragment();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (rawAuthority.contains("@")) {
                if (rawAuthority.startsWith("@")) {
                    rawAuthority = "[Filtered]".concat(rawAuthority);
                } else {
                    rawAuthority = (rawAuthority.substring(0, rawAuthority.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]").concat(rawAuthority.substring(rawAuthority.indexOf(64)));
                }
            }
            sb.append(rawAuthority);
            sb.append(rawPath);
            return new io.sentry.o(sb.toString(), rawQuery, rawFragment, b);
        } catch (Exception unused2) {
            return new io.sentry.o(obj, obj, obj, b);
        }
    }

    public static byte[] t(String str, long j) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            gk0.l(fx3.g("File '", file.getName(), "' doesn't exists"));
            return null;
        }
        if (!file.isFile()) {
            gk0.l(fx3.g("Reading path ", str, " failed, because it's not a file."));
            return null;
        }
        if (!file.canRead()) {
            gk0.l(fx3.g("Reading the item ", str, " failed, because can't read the file."));
            return null;
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byte[] bArrM = m(bufferedInputStream, j);
                bufferedInputStream.close();
                fileInputStream.close();
                return bArrM;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static String u(File file) throws IOException {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hk0.g(str);
    }

    public static void w(Throwable th) {
        if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof LinkageError)) {
            throw ((Error) th);
        }
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean x(p0 p0Var) {
        return !(io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(p0Var.b("sentry:typeCheckHint"))) || d1.class.isInstance(p0Var.b("sentry:typeCheckHint"));
    }

    public static boolean y(g7 g7Var, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        boolean z2 = l.a;
        byte b = 1;
        if (!z2 && (sentryAndroidOptions.getVersionDetector() instanceof v3)) {
            sentryAndroidOptions.setVersionDetector(new a0(sentryAndroidOptions, b));
        }
        if (!sentryAndroidOptions.getVersionDetector().a()) {
            return !z || g7Var == null || sentryAndroidOptions.isForceInit() || g7Var.getInitPriority().ordinal() <= sentryAndroidOptions.getInitPriority().ordinal();
        }
        sentryAndroidOptions.getLogger().g(f6.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        hk0.l(fx3.g("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
        return false;
    }

    public static io.sentry.o z(n1 n1Var, String str, List list, v1 v1Var) {
        g7 g7VarL = n1Var.l();
        io.sentry.o oVar = null;
        if (g7VarL.isTraceSampling() && e(str, g7VarL.getTracePropagationTargets())) {
            g7 g7VarL2 = n1Var.l();
            byte b = 7;
            byte b2 = 2;
            if (v1Var != null && !v1Var.i()) {
                n7 n7VarC = v1Var.c();
                io.sentry.e eVarJ = v1Var.j(list);
                if (g7VarL2.isPropagateTraceparent()) {
                    w7 w7VarV = v1Var.v();
                    oVar = new io.sentry.o(w7VarV.m, w7VarV.n, n7VarC.c, b2);
                }
                return new io.sentry.o(n7VarC, eVarJ, oVar, b);
            }
            byte b3 = 10;
            m7 m7Var = new m7(b3, false);
            m7Var.n = null;
            n1Var.r(new q7(m7Var, g7VarL2, b3));
            h4 h4Var = (h4) m7Var.n;
            if (h4Var != null) {
                io.sentry.d dVar = (io.sentry.d) h4Var.e;
                Boolean bool = (Boolean) h4Var.a;
                y7 y7Var = (y7) h4Var.c;
                w wVar = (w) h4Var.b;
                return new io.sentry.o(new n7(wVar, y7Var, bool), io.sentry.e.a(dVar, list), g7VarL2.isPropagateTraceparent() ? new io.sentry.o(wVar, y7Var, bool, b2) : null, b);
            }
        }
        return null;
    }
}
