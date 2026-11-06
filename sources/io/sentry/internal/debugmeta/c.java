package io.sentry.internal.debugmeta;

import android.content.Context;
import io.sentry.clientreport.d;
import io.sentry.clientreport.e;
import io.sentry.clientreport.f;
import io.sentry.e6;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.m7;
import io.sentry.n5;
import io.sentry.p0;
import io.sentry.protocol.f0;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q;
import io.sentry.r6;
import io.sentry.s2;
import io.sentry.t5;
import io.sentry.u5;
import io.sentry.util.h;
import io.sentry.x0;
import io.sentry.x3;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import o.an4;
import o.bp6;
import o.fs4;
import o.hk0;
import o.im3;
import o.np6;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a, g1, x3, x0, r6, f {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f205o;

    public c(g1 g1Var, byte b) {
        this.m = b;
        switch (b) {
            case 14:
                this.n = io.sentry.config.a.A(g1Var, "androidx.compose.ui.platform.TestTagElement");
                this.f205o = io.sentry.config.a.A(g1Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
                break;
            default:
                ClassLoader classLoader = c.class.getClassLoader();
                this.n = g1Var;
                this.f205o = io.sentry.util.b.d(classLoader);
                break;
        }
    }

    public static q l(e6 e6Var) {
        if (e6.Event.equals(e6Var)) {
            return q.Error;
        }
        if (e6.Session.equals(e6Var)) {
            return q.Session;
        }
        if (e6.Transaction.equals(e6Var)) {
            return q.Transaction;
        }
        if (e6.UserFeedback.equals(e6Var)) {
            return q.UserReport;
        }
        if (e6.Feedback.equals(e6Var)) {
            return q.Feedback;
        }
        if (e6.Profile.equals(e6Var)) {
            return q.Profile;
        }
        if (e6.ProfileChunk.equals(e6Var)) {
            return q.ProfileChunkUi;
        }
        if (e6.Attachment.equals(e6Var)) {
            return q.Attachment;
        }
        if (e6.CheckIn.equals(e6Var)) {
            return q.Monitor;
        }
        if (e6.ReplayVideo.equals(e6Var)) {
            return q.Replay;
        }
        if (e6.Log.equals(e6Var)) {
            return q.LogItem;
        }
        if (e6.Span.equals(e6Var)) {
            return q.Span;
        }
        return e6.TraceMetric.equals(e6Var) ? q.TraceMetric : q.Default;
    }

    public c A(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        if (str == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        cVar.e();
        cVar.F(str);
        return this;
    }

    public c B(boolean z) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        cVar.G();
        cVar.e();
        cVar.m.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.f
    public void a(d dVar, q qVar) {
        e(dVar, qVar, 1L);
    }

    @Override // io.sentry.g1
    public void b(f6 f6Var, Throwable th, String str, Object... objArr) {
        g1 g1Var = (g1) this.n;
        if (i(f6Var)) {
            g1Var.b(f6Var, th, str, objArr);
        }
    }

    @Override // io.sentry.clientreport.f
    public void c(d dVar, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) cVar.f205o).iterator();
            while (it.hasNext()) {
                h(dVar, (t5) it.next());
            }
        } catch (Throwable th) {
            ((g7) this.f205o).getLogger().b(f6.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.g1
    public void d(f6 f6Var, String str, Throwable th) {
        g1 g1Var = (g1) this.n;
        if (i(f6Var)) {
            g1Var.d(f6Var, str, th);
        }
    }

    @Override // io.sentry.clientreport.f
    public void e(d dVar, q qVar, long j) {
        try {
            s(dVar.getReason(), qVar.getCategory(), Long.valueOf(j));
            o();
        } catch (Throwable th) {
            ((g7) this.f205o).getLogger().b(f6.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List f() {
        switch (this.m) {
            case 0:
                g1 g1Var = (g1) this.n;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) this.f205o).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                g1Var.g(f6.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            g1Var.b(f6.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                    }
                } catch (IOException e2) {
                    g1Var.b(f6.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                g1Var.g(f6.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                g1 g1Var2 = (g1) this.n;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f205o).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    g1Var2.g(f6.INFO, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e3) {
                    g1Var2.d(f6.ERROR, "Error getting Proguard UUIDs.", e3);
                    return null;
                } catch (RuntimeException e4) {
                    g1Var2.b(f6.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    @Override // io.sentry.g1
    public void g(f6 f6Var, String str, Object... objArr) {
        g1 g1Var = (g1) this.n;
        if (i(f6Var)) {
            g1Var.g(f6Var, str, objArr);
        }
    }

    @Override // io.sentry.clientreport.f
    public void h(d dVar, t5 t5Var) {
        g7 g7Var = (g7) this.f205o;
        if (t5Var == null) {
            return;
        }
        try {
            u5 u5Var = t5Var.a;
            e6 e6Var = u5Var.q;
            if (e6.ClientReport.equals(e6Var)) {
                try {
                    t(t5Var.f(g7Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    g7Var.getLogger().g(f6.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            q qVarL = l(e6Var);
            if (qVarL.equals(q.Transaction)) {
                f0 f0VarH = t5Var.h(g7Var.getSerializer());
                if (f0VarH != null) {
                    ArrayList arrayList = f0VarH.E;
                    s(dVar.getReason(), q.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    o();
                }
                s(dVar.getReason(), qVarL.getCategory(), 1L);
                o();
                return;
            }
            if (qVarL.equals(q.LogItem)) {
                Integer num = u5Var.n;
                s(dVar.getReason(), qVarL.getCategory(), Long.valueOf(num != null ? num.intValue() : 1L));
                s(dVar.getReason(), q.LogByte.getCategory(), Long.valueOf(t5Var.g().length));
                o();
                return;
            }
            if (!qVarL.equals(q.TraceMetric)) {
                s(dVar.getReason(), qVarL.getCategory(), 1L);
                o();
            } else {
                Integer num2 = u5Var.n;
                s(dVar.getReason(), qVarL.getCategory(), Long.valueOf(num2 != null ? num2.intValue() : 1L));
                s(dVar.getReason(), q.TraceMetricByte.getCategory(), Long.valueOf(t5Var.g().length));
                o();
            }
        } catch (Throwable th) {
            g7Var.getLogger().b(f6.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.g1
    public boolean i(f6 f6Var) {
        g7 g7Var = (g7) this.f205o;
        return f6Var != null && g7Var.isDebug() && f6Var.ordinal() >= g7Var.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.clientreport.f
    public c j(c cVar) {
        g7 g7Var = (g7) this.f205o;
        Date date = new Date();
        m7 m7Var = (m7) this.n;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((h) m7Var.n).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new e(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(date, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            g7Var.getLogger().g(f6.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) cVar.f205o).iterator();
            while (it.hasNext()) {
                arrayList2.add((t5) it.next());
            }
            arrayList2.add(t5.b(g7Var.getSerializer(), bVar));
            return new c((n5) cVar.n, arrayList2);
        } catch (Throwable th) {
            g7Var.getLogger().b(f6.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    public c k() throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        cVar.G();
        cVar.e();
        int i = cVar.f273o;
        int[] iArrCopyOf = cVar.n;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar.n = iArrCopyOf;
        }
        int i2 = cVar.f273o;
        cVar.f273o = i2 + 1;
        iArrCopyOf[i2] = 3;
        cVar.m.write(123);
        return this;
    }

    public c m() {
        ((io.sentry.vendor.gson.stream.c) this.n).j('}', 3, 5);
        return this;
    }

    public io.sentry.h n(io.sentry.h hVar, p0 p0Var) {
        hVar.getClass();
        r6 r6Var = (r6) this.n;
        if (r6Var != null) {
            hVar = ((c) r6Var).n(hVar, p0Var);
        }
        if (hVar != null) {
            io.sentry.android.replay.d dVar = (io.sentry.android.replay.d) this.f205o;
            io.sentry.util.network.f fVar = null;
            if (im3.n(hVar.q, "http") || im3.n(hVar.s, "http")) {
                Object objB = p0Var.b("sentry:replayNetworkDetails");
                if (objB instanceof io.sentry.util.network.f) {
                    fVar = (io.sentry.util.network.f) objB;
                }
            }
            if (fVar != null) {
                Map map = dVar.b;
                map.getClass();
                map.put(hVar, fVar);
            }
        }
        return hVar;
    }

    public void o() {
        ((g7) this.f205o).getOnDiscard();
    }

    public String p(fs4 fs4Var) {
        Field field;
        Field field2;
        fs4Var.getClass();
        String name = fs4Var.getClass().getName();
        try {
            if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = (Field) this.n) != null) {
                return (String) field2.get(fs4Var);
            }
            if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = (Field) this.f205o) != null) {
                return (String) field.get(fs4Var);
            }
            if (!(fs4Var instanceof bp6)) {
                return null;
            }
            for (Map.Entry entry : ((bp6) fs4Var).g()) {
                np6 np6Var = (np6) entry.getKey();
                Object value = entry.getValue();
                String str = np6Var.a;
                if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public byte[] q() {
        byte[] bArr = (byte[]) this.n;
        if (bArr == null) {
            bArr = (byte[]) ((Callable) this.f205o).call();
            this.n = bArr;
        }
        return bArr != null ? bArr : new byte[0];
    }

    public c r(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        if (str == null) {
            yq4.l("name == null");
            return null;
        }
        if (cVar.s != null) {
            throw new IllegalStateException();
        }
        if (cVar.f273o != 0) {
            cVar.s = str;
            return this;
        }
        hk0.l("JsonWriter is closed.");
        return null;
    }

    public void s(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((h) ((m7) this.n).n).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void t(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (e eVar : bVar.n) {
            s(eVar.m, eVar.n, eVar.f190o);
        }
    }

    public void u(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        if (str == null || str.length() == 0) {
            cVar.p = null;
            cVar.q = ":";
        } else {
            cVar.p = str;
            cVar.q = ": ";
        }
    }

    public c v(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        cVar.G();
        if (cVar.r || !(Double.isNaN(d) || Double.isInfinite(d))) {
            cVar.e();
            cVar.m.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public c w(long j) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        cVar.G();
        cVar.e();
        cVar.m.write(Long.toString(j));
        return this;
    }

    public c x(g1 g1Var, Object obj) {
        ((s2) this.f205o).c(this, g1Var, obj);
        return this;
    }

    public c y(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        if (bool == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        cVar.e();
        cVar.m.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c z(Number number) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.n;
        if (number == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        String string = number.toString();
        if (!cVar.r && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            an4.i(number, "Numeric values must be finite, but was ");
            return null;
        }
        cVar.e();
        cVar.m.append((CharSequence) string);
        return this;
    }

    public /* synthetic */ c(Object obj, Object obj2, byte b) {
        this.m = b;
        this.f205o = obj;
        this.n = obj2;
    }

    public c(Writer writer, int i) {
        this.m = (byte) 4;
        this.n = new io.sentry.vendor.gson.stream.c(writer);
        this.f205o = new s2(i);
    }

    public c(String str, HashMap map) {
        this.m = (byte) 5;
        io.sentry.util.b.v(str, "url is required");
        try {
            this.n = URI.create(str).toURL();
            this.f205o = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public c(g7 g7Var) {
        this.m = (byte) 13;
        this.f205o = g7Var;
        this.n = new m7((byte) 6);
    }

    public /* synthetic */ c(byte b) {
        this.m = b;
    }

    public c(Context context, g1 g1Var) {
        this.m = (byte) 10;
        Context applicationContext = context.getApplicationContext();
        this.f205o = applicationContext != null ? applicationContext : context;
        this.n = g1Var;
    }

    public c(Method method, Method method2) {
        this.m = (byte) 12;
        this.n = method;
        this.f205o = method2;
    }

    public c(n5 n5Var, List list) {
        this.m = (byte) 7;
        this.n = n5Var;
        io.sentry.util.b.v(list, "SentryEnvelope items are required.");
        this.f205o = list;
    }

    public c(w wVar, u uVar, t5 t5Var) {
        this.m = (byte) 7;
        this.n = new n5(wVar, uVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t5Var);
        this.f205o = arrayList;
    }

    public c() {
        this.m = (byte) 9;
        this.n = new io.sentry.util.a();
        this.f205o = new io.sentry.util.a();
    }

    public c(Callable callable) {
        this.m = (byte) 8;
        this.f205o = callable;
    }
}
