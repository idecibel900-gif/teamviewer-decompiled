package io.sentry;

import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final class m7 implements io.sentry.cache.tape.f, io.sentry.featureflags.b {
    public final /* synthetic */ byte m;
    public Object n;

    public m7(byte b) {
        this.m = b;
        switch (b) {
            case 6:
                this.n = new io.sentry.util.h(new h2((byte) 23));
                break;
            case 7:
                this.n = new io.sentry.util.a();
                break;
            case 8:
                this.n = new io.sentry.transport.q();
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            default:
                Looper mainLooper = Looper.getMainLooper();
                mainLooper.getClass();
                this.n = new Handler(mainLooper);
                break;
            case 11:
                this.n = new io.sentry.util.network.d();
                break;
        }
    }

    public static Boolean f(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static Long i(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.endsWith("GB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
            }
            if (strTrim.endsWith("MB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * g7.MAX_EVENT_SIZE_BYTES);
            }
            if (strTrim.endsWith("KB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1024);
            }
            if (strTrim.endsWith("B")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double j(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.equals("0")) {
                return Double.valueOf(0.0d);
            }
            if (strTrim.endsWith("ms")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
            }
            if (strTrim.endsWith("ns")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
            }
            if (strTrim.endsWith("us")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
            }
            if (strTrim.endsWith("s")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public List a() {
        ArrayList arrayListE = e(new Exception().getStackTrace(), false);
        if (arrayListE == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListE.size());
        for (Object obj : arrayListE) {
            if (Boolean.TRUE.equals(((io.sentry.protocol.a0) obj).w)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayListE.size());
        for (Object obj2 : arrayListE) {
            String str = ((io.sentry.protocol.a0) obj2).r;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // io.sentry.cache.tape.f
    public Object b(byte[] bArr) {
        SentryAndroidOptions sentryAndroidOptions = ((io.sentry.cache.g) this.n).a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.f));
            try {
                h hVar = (h) sentryAndroidOptions.getSerializer().b(bufferedReader, h.class);
                bufferedReader.close();
                return hVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
            return null;
        }
    }

    public io.sentry.protocol.c c() {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) this.n;
        if (cVar != null) {
            return cVar;
        }
        io.sentry.protocol.c cVar2 = new io.sentry.protocol.c();
        this.n = cVar2;
        return cVar2;
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.n;
        aVar.e();
        aVar.close();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m27clone() {
        switch (this.m) {
            case 7:
                return new m7((byte) 7);
            default:
                return super.clone();
        }
    }

    @Override // io.sentry.cache.tape.f
    public void d(Comparable comparable, OutputStream outputStream) throws IOException {
        h hVar = (h) comparable;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, io.sentry.cache.g.f));
        try {
            ((io.sentry.cache.g) this.n).a.getSerializer().a(hVar, bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ArrayList e(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
                    g7 g7Var = (g7) this.n;
                    a0Var.w = f(className, g7Var.getInAppIncludes(), g7Var.getInAppExcludes());
                    a0Var.r = className;
                    a0Var.q = stackTraceElement.getMethodName();
                    a0Var.p = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        a0Var.s = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    a0Var.y = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(a0Var);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Serializable g(io.sentry.vendor.gson.stream.a aVar, int i) {
        io.sentry.util.network.d dVar = (io.sentry.util.network.d) this.n;
        if (dVar.b) {
            return null;
        }
        if (i >= 100) {
            dVar.a = true;
            return null;
        }
        try {
            switch (io.sentry.util.network.c.a[aVar.peek().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        aVar.u0();
                        while (aVar.hasNext() && !dVar.b) {
                            linkedHashMap.put(aVar.U(), g(aVar, i + 1));
                        }
                        aVar.Z();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        dVar.b = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        aVar.D0();
                        while (aVar.hasNext() && !dVar.b) {
                            arrayList.add(g(aVar, i + 1));
                        }
                        aVar.A0();
                        return arrayList;
                    } catch (Exception unused2) {
                        dVar.b = true;
                        return arrayList;
                    }
                case 3:
                    return aVar.r();
                case 4:
                    return Double.valueOf(aVar.nextDouble());
                case 5:
                    return Boolean.valueOf(aVar.F());
                case 6:
                    aVar.J();
                    return null;
                default:
                    dVar.b = true;
                    return null;
            }
        } catch (Exception unused3) {
            dVar.b = true;
            return null;
        }
        dVar.b = true;
        return null;
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.j h() {
        io.sentry.util.a aVar = (io.sentry.util.a) this.n;
        aVar.e();
        aVar.close();
        return null;
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.featureflags.b clone() {
        return new m7((byte) 7);
    }

    public /* synthetic */ m7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ m7(byte b, boolean z) {
        this.m = b;
    }

    public m7(String str) {
        this.m = (byte) 9;
        this.n = new File(str);
    }
}
