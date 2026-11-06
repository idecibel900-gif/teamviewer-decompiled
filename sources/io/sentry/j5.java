package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements q1 {
    public boolean a = true;
    public final SentryAndroidOptions b;
    public final io.sentry.transport.g c;
    public final io.sentry.logger.b d;
    public final io.sentry.metrics.a e;

    public j5(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions;
        z1 transportFactory = sentryAndroidOptions.getTransportFactory();
        if (transportFactory instanceof u3) {
            transportFactory = new a3();
            sentryAndroidOptions.setTransportFactory(transportFactory);
        }
        g0 g0VarRetrieveParsedDsn = sentryAndroidOptions.retrieveParsedDsn();
        String sentryClientName = sentryAndroidOptions.getSentryClientName();
        URI uri = g0VarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = g0VarRetrieveParsedDsn.b;
        String str2 = g0VarRetrieveParsedDsn.a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.h(sentryAndroidOptions, new io.sentry.internal.debugmeta.c(string, map));
        if (sentryAndroidOptions.getLogs().a) {
            this.d = sentryAndroidOptions.getLogs().b.c(sentryAndroidOptions, this);
        } else {
            this.d = io.sentry.logger.e.n;
        }
        if (sentryAndroidOptions.getMetrics().a) {
            this.e = sentryAndroidOptions.getMetrics().b.mo21c(sentryAndroidOptions, this);
        } else {
            this.e = io.sentry.metrics.d.m;
        }
    }

    public static void m(h5 h5Var, l1 l1Var, boolean z) {
        if (l1Var != null) {
            if (h5Var.p == null) {
                h5Var.p = l1Var.p();
            }
            if (h5Var.u == null) {
                h5Var.u = l1Var.L();
            }
            if (h5Var.q == null) {
                h5Var.c(l1Var.z());
            } else {
                for (Map.Entry entry : l1Var.z().entrySet()) {
                    if (!h5Var.q.containsKey(entry.getKey())) {
                        h5Var.q.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = h5Var.y;
            if (list == null || list.isEmpty()) {
                if (!z) {
                    h5Var.y = new ArrayList(new ArrayList(l1Var.t()));
                }
            } else if (!z) {
                Queue queueT = l1Var.t();
                List list2 = h5Var.y;
                if (list2 != null && !queueT.isEmpty()) {
                    list2.addAll(queueT);
                    Collections.sort(list2);
                }
            }
            if (h5Var.A == null) {
                Map extras = l1Var.getExtras();
                h5Var.A = extras != null ? new HashMap(extras) : null;
            } else {
                for (Map.Entry entry2 : l1Var.getExtras().entrySet()) {
                    if (!h5Var.A.containsKey(entry2.getKey())) {
                        h5Var.A.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.e eVar = h5Var.n;
            for (Map.Entry entry3 : new io.sentry.protocol.e(l1Var.D()).m.entrySet()) {
                if (!eVar.b(entry3.getKey())) {
                    eVar.l(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public static ArrayList r(p0 p0Var) {
        ArrayList arrayList = new ArrayList(p0Var.b);
        a aVar = p0Var.d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = p0Var.e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = p0Var.f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        a aVar4 = p0Var.g;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        return arrayList;
    }

    @Override // io.sentry.q1
    public final void a(boolean z) {
        long shutdownTimeoutMillis;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().g(f6.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = sentryAndroidOptions.getShutdownTimeoutMillis();
            } catch (IOException e) {
                sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        b(shutdownTimeoutMillis);
        this.d.a(z);
        this.e.a(z);
        this.c.a(z);
        for (j0 j0Var : sentryAndroidOptions.getEventProcessors()) {
            if (j0Var instanceof Closeable) {
                try {
                    ((Closeable) j0Var).close();
                } catch (IOException e2) {
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to close the event processor {}.", j0Var, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // io.sentry.q1
    public final void b(long j) {
        this.d.b(j);
        this.e.b(j);
        this.c.b(j);
    }

    @Override // io.sentry.q1
    public final io.sentry.transport.p c() {
        return this.c.c();
    }

    @Override // io.sentry.q1
    public final boolean d() {
        return this.c.d();
    }

    @Override // io.sentry.q1
    public final void e(u7 u7Var, p0 p0Var) {
        io.sentry.util.b.v(u7Var, "Session is required.");
        String str = u7Var.y;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (str == null || str.isEmpty()) {
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            t1 serializer = sentryAndroidOptions.getSerializer();
            io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
            io.sentry.util.b.v(serializer, "Serializer is required.");
            h(new io.sentry.internal.debugmeta.c((io.sentry.protocol.w) null, sdkVersion, t5.e(serializer, u7Var)), p0Var);
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w f(io.sentry.protocol.k kVar, p0 p0Var, l1 l1Var) {
        if (io.sentry.util.o.a()) {
            return io.sentry.protocol.w.n;
        }
        v5 v5Var = new v5();
        io.sentry.protocol.e eVar = v5Var.n;
        eVar.l(kVar, "feedback");
        if (kVar.r == null) {
            kVar.r = l1Var.G();
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing feedback: %s", v5Var.m);
        if (y(v5Var, p0Var)) {
            if (v5Var.u == null) {
                v5Var.u = l1Var.L();
            }
            if (v5Var.q == null) {
                v5Var.c(l1Var.z());
            } else {
                for (Map.Entry entry : l1Var.z().entrySet()) {
                    if (!v5Var.q.containsKey(entry.getKey())) {
                        v5Var.q.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(l1Var.D()).m.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            v1 v1VarG = l1Var.g();
            if (eVar.j() == null) {
                if (v1VarG == null) {
                    eVar.x(e8.b(l1Var.v()));
                } else {
                    eVar.x(v1VarG.v());
                }
            }
            v5Var = u(v5Var, p0Var, l1Var.M());
            if (v5Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.w.n;
            }
        }
        v5 v5VarU = u(v5Var, p0Var, sentryAndroidOptions.getEventProcessors());
        if (v5VarU != null) {
            sentryAndroidOptions.getBeforeSendFeedback();
        }
        if (v5VarU == null) {
            return io.sentry.protocol.w.n;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        io.sentry.protocol.w wVar2 = v5VarU.m;
        if (wVar2 == null) {
            wVar2 = wVar;
        }
        if (kVar.q == null) {
            io.sentry.protocol.w wVarJ = l1Var.j();
            io.sentry.protocol.w wVarE = sentryAndroidOptions.getReplayController().e(Boolean.FALSE);
            if (!wVarE.equals(wVar)) {
                wVarJ = wVarE;
            }
            if (!wVarJ.equals(wVar)) {
                kVar.q = wVarJ;
            }
        }
        try {
            io.sentry.internal.debugmeta.c cVarN = n(v5VarU, r(p0Var), null, s(l1Var, p0Var, v5VarU, v5VarU.H), null);
            p0Var.a();
            return cVarN != null ? x(cVarN, p0Var) : wVar2;
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing feedback %s failed.", wVar2);
            return io.sentry.protocol.w.n;
        }
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w g(i7 i7Var, l1 l1Var, p0 p0Var) {
        if (io.sentry.util.o.a()) {
            return io.sentry.protocol.w.n;
        }
        if (y(i7Var, p0Var)) {
            io.sentry.protocol.r rVar = i7Var.p;
            io.sentry.protocol.e eVar = i7Var.n;
            if (rVar == null) {
                i7Var.p = l1Var.p();
            }
            if (i7Var.u == null) {
                i7Var.u = l1Var.L();
            }
            if (i7Var.q == null) {
                i7Var.c(l1Var.z());
            } else {
                for (Map.Entry entry : l1Var.z().entrySet()) {
                    if (!i7Var.q.containsKey(entry.getKey())) {
                        i7Var.q.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(l1Var.D()).m.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            v1 v1VarG = l1Var.g();
            if (eVar.j() == null) {
                if (v1VarG == null) {
                    eVar.x(e8.b(l1Var.v()));
                } else {
                    eVar.x(v1VarG.v());
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing session replay: %s", i7Var.m);
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        io.sentry.protocol.w wVar2 = i7Var.m;
        if (wVar2 != null) {
            wVar = wVar2;
        }
        for (j0 j0Var : sentryAndroidOptions.getEventProcessors()) {
            try {
                i7Var = j0Var.a(i7Var, p0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th, "An exception occurred while processing replay event by processor: %s", j0Var.getClass().getName());
            }
            if (i7Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Replay event was dropped by a processor: %s", j0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Replay);
                break;
            }
        }
        if (i7Var != null) {
            sentryAndroidOptions.getBeforeSendReplay();
        }
        if (i7Var == null) {
            return io.sentry.protocol.w.n;
        }
        try {
            io.sentry.internal.debugmeta.c cVarQ = q(i7Var, p0Var.h, s(l1Var, p0Var, i7Var, null), io.sentry.hints.b.class.isInstance(p0Var.b("sentry:typeCheckHint")));
            p0Var.a();
            this.c.n0(cVarQ, p0Var);
            return wVar;
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing event %s failed.", wVar);
            return io.sentry.protocol.w.n;
        }
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        try {
            p0Var.a();
            return x(cVar, p0Var);
        } catch (IOException e) {
            this.b.getLogger().d(f6.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.w.n;
        }
    }

    @Override // io.sentry.q1
    public final void i(h6 h6Var, l1 l1Var) {
        h6 h6VarV;
        if (io.sentry.util.o.a() || (h6VarV = v(h6Var, l1Var.M())) == null) {
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        h6 h6VarV2 = v(h6VarV, sentryAndroidOptions.getEventProcessors());
        if (h6VarV2 == null) {
            return;
        }
        sentryAndroidOptions.getLogs().getClass();
        this.d.d(h6VarV2);
    }

    @Override // io.sentry.q1
    public final boolean isEnabled() {
        return this.a;
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w j(io.sentry.protocol.f0 f0Var, c8 c8Var, l1 l1Var, p0 p0Var, f4 f4Var) {
        List listB;
        if (io.sentry.util.o.a()) {
            return io.sentry.protocol.w.n;
        }
        if (p0Var == null) {
            p0Var = new p0();
        }
        if (y(f0Var, p0Var) && (listB = l1Var.B()) != null) {
            p0Var.b.addAll(listB);
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing transaction: %s", f0Var.m);
        List<n0> ignoredTransactions = sentryAndroidOptions.getIgnoredTransactions();
        String str = f0Var.B;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<n0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().a.equalsIgnoreCase(str)) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.B);
                    io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                    io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder.a(dVar, q.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().e(dVar, q.Span, f0Var.E.size() + 1);
                    return io.sentry.protocol.w.n;
                }
            }
            Iterator<n0> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                Pattern pattern = it2.next().b;
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.B);
                    io.sentry.clientreport.f clientReportRecorder2 = sentryAndroidOptions.getClientReportRecorder();
                    io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder2.a(dVar2, q.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().e(dVar2, q.Span, f0Var.E.size() + 1);
                    return io.sentry.protocol.w.n;
                }
            }
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        io.sentry.protocol.w wVarX = f0Var.m;
        if (wVarX == null) {
            wVarX = wVar;
        }
        if (y(f0Var, p0Var)) {
            m(f0Var, l1Var, io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")));
            f0Var = w(f0Var, p0Var, l1Var.M());
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (f0Var != null) {
            f0Var = w(f0Var, p0Var, sentryAndroidOptions.getEventProcessors());
        }
        io.sentry.protocol.f0 f0Var2 = f0Var;
        if (f0Var2 == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return wVar;
        }
        ArrayList arrayList = f0Var2.E;
        int size = arrayList.size();
        sentryAndroidOptions.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            sentryAndroidOptions.getClientReportRecorder().e(io.sentry.clientreport.d.BEFORE_SEND, q.Span, i);
        }
        try {
            ArrayList arrayListR = r(p0Var);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListR.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).getClass();
            }
            io.sentry.internal.debugmeta.c cVarN = n(f0Var2, arrayList2, null, c8Var, f4Var);
            p0Var.a();
            if (cVarN != null) {
                wVarX = x(cVarN, p0Var);
            }
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing transaction %s failed.", wVarX);
            wVar = io.sentry.protocol.w.n;
            wVarX = wVar;
        }
        if (!wVarX.equals(wVar)) {
            w7 w7VarJ = f0Var2.n.j();
            if (w7VarJ != null) {
                sentryAndroidOptions.getReplayController().z(w7VarJ.m);
            }
            String str2 = f0Var2.B;
            if (str2 != null && !str2.isEmpty()) {
                sentryAndroidOptions.getReplayController().c0(str2);
            }
        }
        return wVarX;
    }

    @Override // io.sentry.q1
    public final io.sentry.protocol.w k(c4 c4Var) {
        io.sentry.util.b.v(c4Var, "profileChunk is required.");
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Capturing profile chunk: %s", c4Var.f183o);
        io.sentry.protocol.w wVar = c4Var.f183o;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(c4Var.m, sentryAndroidOptions);
        if (fVarA != null) {
            c4Var.m = fVarA;
        }
        try {
            return x(new io.sentry.internal.debugmeta.c(new n5(wVar, sentryAndroidOptions.getSdkVersion(), null), Collections.singletonList("application/x-perfetto-trace".equals(c4Var.w) ? t5.c(c4Var, sentryAndroidOptions.getSerializer()) : t5.d(c4Var, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getProfilerConverter()))), null);
        } catch (io.sentry.exception.c e) {
            e = e;
            sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return io.sentry.protocol.w.n;
        } catch (IOException e2) {
            e = e2;
            sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return io.sentry.protocol.w.n;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0295  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [io.sentry.protocol.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [io.sentry.protocol.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v14, types: [io.sentry.protocol.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.q1
    public final io.sentry.protocol.w l(v5 v5Var, l1 l1Var, p0 p0Var) {
        u7 u7VarW;
        boolean z;
        String str;
        ?? r13;
        x1 x1VarM;
        io.sentry.protocol.w wVarX;
        x1 x1VarM2;
        d dVar;
        io.sentry.protocol.w wVar;
        io.sentry.protocol.j jVarH;
        List listB;
        v5 v5VarT = v5Var;
        if (io.sentry.util.o.a()) {
            return io.sentry.protocol.w.n;
        }
        if (y(v5VarT, p0Var) && !io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")) && l1Var != null && (listB = l1Var.B()) != null) {
            p0Var.b.addAll(listB);
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.DEBUG;
        logger.g(f6Var, "Capturing event: %s", v5VarT.m);
        Throwable thA = v5VarT.a();
        if (thA != null && sentryAndroidOptions.getIgnoredExceptionsForType().contains(thA.getClass())) {
            sentryAndroidOptions.getLogger().g(f6Var, "Event was dropped as the exception %s is ignored", thA.getClass());
            sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Error);
            return io.sentry.protocol.w.n;
        }
        List<n0> ignoredErrors = sentryAndroidOptions.getIgnoredErrors();
        byte b = 0;
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            io.sentry.protocol.p pVar = v5VarT.C;
            if (pVar != null) {
                String str2 = pVar.n;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = pVar.m;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thA2 = v5VarT.a();
            if (thA2 != null) {
                hashSet.add(thA2.toString());
            }
            Iterator<n0> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a)) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", v5VarT.C);
                    sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Error);
                    return io.sentry.protocol.w.n;
                }
            }
            for (n0 n0Var : ignoredErrors) {
                for (String str4 : hashSet) {
                    Pattern pattern = n0Var.b;
                    if (pattern == null ? false : pattern.matcher(str4).matches()) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", v5VarT.C);
                        sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Error);
                        return io.sentry.protocol.w.n;
                    }
                }
            }
        }
        if (y(v5VarT, p0Var)) {
            if (l1Var != null) {
                m(v5VarT, l1Var, io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")));
                String str5 = v5VarT.H;
                io.sentry.protocol.e eVar = v5VarT.n;
                if (str5 == null) {
                    v5VarT.H = l1Var.N();
                }
                if (v5VarT.I == null) {
                    v5VarT.i(l1Var.K());
                }
                if (l1Var.u() != null) {
                    v5VarT.G = l1Var.u();
                }
                v1 v1VarG = l1Var.g();
                if (eVar.j() == null) {
                    if (v1VarG == null) {
                        eVar.x(e8.b(l1Var.v()));
                    } else {
                        eVar.x(v1VarG.v());
                    }
                }
                if (eVar.g() == null && (jVarH = l1Var.h()) != null) {
                    eVar.r(jVarH);
                }
                v5VarT = t(v5VarT, p0Var, l1Var.M());
            }
            if (v5VarT == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.w.n;
            }
        }
        v5 v5VarT2 = t(v5VarT, p0Var, sentryAndroidOptions.getEventProcessors());
        if (v5VarT2 != null) {
            sentryAndroidOptions.getBeforeSend();
        }
        if (v5VarT2 != null) {
            try {
                if (sentryAndroidOptions.isEnableEventSizeLimiting() && !io.sentry.util.b.o(v5VarT2, sentryAndroidOptions)) {
                    sentryAndroidOptions.getLogger().g(f6.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", v5VarT2.m, Long.valueOf(g7.MAX_EVENT_SIZE_BYTES));
                    sentryAndroidOptions.getOnOversizedEvent();
                    List list = v5VarT2.y;
                    if (list != null && !list.isEmpty()) {
                        v5VarT2.y = null;
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Removed breadcrumbs to reduce size of event %s", v5VarT2.m);
                    }
                    if (!io.sentry.util.b.o(v5VarT2, sentryAndroidOptions)) {
                        io.sentry.util.b.A(v5VarT2, sentryAndroidOptions);
                        if (!io.sentry.util.b.o(v5VarT2, sentryAndroidOptions)) {
                            sentryAndroidOptions.getLogger().g(f6.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", v5VarT2.m);
                        }
                    }
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(f6.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th);
            }
        }
        if (v5VarT2 == null) {
            return io.sentry.protocol.w.n;
        }
        u7 u7VarW2 = l1Var != null ? l1Var.w(new h2((byte) 5)) : null;
        if ((u7VarW2 != null && u7VarW2.s != t7.Ok) || !io.sentry.util.b.x(p0Var)) {
            u7VarW = null;
        } else if (l1Var != null) {
            u7VarW = l1Var.w(new i5(this, v5VarT2, p0Var, b));
        } else {
            sentryAndroidOptions.getLogger().g(f6.INFO, "Scope is null on client.captureEvent", new Object[0]);
            u7VarW = null;
        }
        io.sentry.util.m mVarA = sentryAndroidOptions.getSampleRate() == null ? null : io.sentry.util.p.a();
        if (sentryAndroidOptions.getSampleRate() != null && mVarA != null && sentryAndroidOptions.getSampleRate().doubleValue() < mVarA.c()) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Event %s was dropped due to sampling decision.", v5VarT2.m);
            sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.SAMPLE_RATE, q.Error);
            v5VarT2 = null;
        }
        if (u7VarW != null) {
            if (u7VarW2 != null) {
                t7 t7Var = u7VarW.s;
                t7 t7Var2 = t7.Crashed;
                z = (t7Var == t7Var2 && u7VarW2.s != t7Var2) || (u7VarW.f269o.get() > 0 && u7VarW2.f269o.get() <= 0);
            }
        }
        if (v5VarT2 == null && !z) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.w.n;
        }
        ?? r0 = io.sentry.protocol.w.n;
        ?? r14 = (v5VarT2 == null || (wVar = v5VarT2.m) == null) ? r0 : wVar;
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(p0Var.b("sentry:typeCheckHint"));
        boolean z2 = io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")) && !io.sentry.android.core.d1.class.isInstance(p0Var.b("sentry:typeCheckHint"));
        if (v5VarT2 != null && !zIsInstance && !z2 && (v5VarT2.g() || v5VarT2.f() != null)) {
            sentryAndroidOptions.getSessionReplay().getClass();
            ?? J = l1Var != null ? l1Var.j() : r0;
            ?? E = sentryAndroidOptions.getReplayController().e(Boolean.valueOf(v5VarT2.f() != null));
            ?? r3 = J;
            if (!E.equals(r0)) {
                r3 = E;
            }
            if (l1Var != null && !r3.equals(r0) && (x1VarM2 = l1Var.m()) != null && (dVar = x1VarM2.v().y) != null && !r0.equals(r3)) {
                dVar.a.put("sentry-replay_id", r3.a());
            }
        }
        if (v5VarT2 != null) {
            try {
                str = v5VarT2.H;
            } catch (io.sentry.exception.c e) {
                e = e;
                sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing event %s failed.", r14);
                p0Var.d(Boolean.TRUE, "sentry:captureFailed");
                r13 = io.sentry.protocol.w.n;
            } catch (IOException e2) {
                e = e2;
                sentryAndroidOptions.getLogger().b(f6.WARNING, e, "Capturing event %s failed.", r14);
                p0Var.d(Boolean.TRUE, "sentry:captureFailed");
                r13 = io.sentry.protocol.w.n;
            }
        } else {
            str = null;
        }
        io.sentry.internal.debugmeta.c cVarN = n(v5VarT2, v5VarT2 != null ? r(p0Var) : null, u7VarW, s(l1Var, p0Var, v5VarT2, str), null);
        p0Var.a();
        r13 = r14;
        if (cVarN != null) {
            wVarX = x(cVarN, p0Var);
        }
        if (l1Var != null && (x1VarM = l1Var.m()) != null && io.sentry.hints.l.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
            Object objB = p0Var.b("sentry:typeCheckHint");
            if (objB instanceof io.sentry.hints.c) {
                r13 = wVarX;
                ((io.sentry.hints.c) objB).g(x1VarM.r());
                x1VarM.e(a8.ABORTED, false, p0Var);
            } else {
                r13 = wVarX;
                x1VarM.e(a8.ABORTED, false, null);
            }
        }
        r13 = wVarX;
        r13 = wVarX;
        r13 = wVarX;
        return r13;
    }

    public final io.sentry.internal.debugmeta.c n(h5 h5Var, ArrayList arrayList, u7 u7Var, c8 c8Var, f4 f4Var) {
        io.sentry.protocol.w wVar;
        ArrayList arrayList2 = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (h5Var != null) {
            t1 serializer = sentryAndroidOptions.getSerializer();
            Charset charset = t5.d;
            io.sentry.util.b.v(serializer, "ISerializer is required.");
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new o5(serializer, h5Var, (byte) 3));
            arrayList2.add(new t5(new u5(e6.resolve(h5Var), new p5(cVar, (byte) 9), "application/json", null, null), new p5(cVar, (byte) 10)));
            wVar = h5Var.m;
        } else {
            wVar = null;
        }
        if (u7Var != null) {
            arrayList2.add(t5.e(sentryAndroidOptions.getSerializer(), u7Var));
        }
        if (f4Var != null) {
            long maxTraceFileSize = sentryAndroidOptions.getMaxTraceFileSize();
            t1 serializer2 = sentryAndroidOptions.getSerializer();
            Charset charset2 = t5.d;
            File file = f4Var.m;
            io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(new q5(file, maxTraceFileSize, f4Var, serializer2));
            arrayList2.add(new t5(new u5(e6.Profile, new p5(cVar2, (byte) 7), "application-json", file.getName(), null), new p5(cVar2, (byte) 8)));
            if (wVar == null) {
                wVar = new io.sentry.protocol.w(f4Var.I);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                t1 serializer3 = sentryAndroidOptions.getSerializer();
                g1 logger = sentryAndroidOptions.getLogger();
                long maxAttachmentSize = sentryAndroidOptions.getMaxAttachmentSize();
                Charset charset3 = t5.d;
                io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(new q5(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new t5(new u5(e6.Attachment, new p5(cVar3, (byte) 4), aVar.e, aVar.d, aVar.f), new p5(cVar3, (byte) 5)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new io.sentry.internal.debugmeta.c(new n5(wVar, sentryAndroidOptions.getSdkVersion(), c8Var), arrayList2);
    }

    public final io.sentry.internal.debugmeta.c o(i6 i6Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        t1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = t5.d;
        io.sentry.util.b.v(serializer, "ISerializer is required.");
        byte b = 2;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new o5(serializer, i6Var, b));
        arrayList.add(new t5(new u5(e6.Log, new p5(cVar, b), "application/vnd.sentry.items.log+json", null, null, null, Integer.valueOf(((List) i6Var.n).size())), new p5(cVar, (byte) 3)));
        return new io.sentry.internal.debugmeta.c(new n5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public final io.sentry.internal.debugmeta.c p(n6 n6Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        t1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = t5.d;
        io.sentry.util.b.v(serializer, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new o5(serializer, n6Var, (byte) 0));
        arrayList.add(new t5(new u5(e6.TraceMetric, new p5(cVar, (byte) 6), "application/vnd.sentry.items.trace-metric+json", null, null, null, Integer.valueOf(n6Var.m.size())), new p5(cVar, (byte) 14)));
        return new io.sentry.internal.debugmeta.c(new n5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public final io.sentry.internal.debugmeta.c q(final i7 i7Var, final l4 l4Var, c8 c8Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        final t1 serializer = sentryAndroidOptions.getSerializer();
        final g1 logger = sentryAndroidOptions.getLogger();
        Charset charset = t5.d;
        final File file = i7Var.B;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.r5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t1 t1Var = serializer;
                i7 i7Var2 = i7Var;
                File file2 = file;
                g1 g1Var = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, t5.d), 512);
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            t1Var.a(i7Var2, bufferedWriter);
                            linkedHashMap.put(e6.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            l4 l4Var2 = l4Var;
                            if (l4Var2 != null) {
                                t1Var.a(l4Var2, bufferedWriter);
                                linkedHashMap.put(e6.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrT = io.sentry.util.b.t(file2.getPath(), 10485760L);
                                if (bArrT.length > 0) {
                                    linkedHashMap.put(e6.ReplayVideo.getItemType(), bArrT);
                                }
                            }
                            byte[] bArrI = t5.i(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    io.sentry.util.b.h(file2.getParentFile());
                                    return bArrI;
                                }
                                file2.delete();
                            }
                            return bArrI;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        g1Var.d(f6.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.util.b.h(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new t5(new u5(e6.ReplayVideo, new p5(cVar, (byte) 13), null, null, null), new p5(cVar, (byte) 15)));
        return new io.sentry.internal.debugmeta.c(new n5(i7Var.m, sentryAndroidOptions.getSessionReplay().l, c8Var), arrayList);
    }

    public final c8 s(l1 l1Var, p0 p0Var, h5 h5Var, String str) {
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(p0Var.b("sentry:typeCheckHint"));
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (zIsInstance) {
            if (h5Var != null) {
                d dVar = new d(sentryAndroidOptions.getLogger());
                io.sentry.protocol.e eVar = h5Var.n;
                w7 w7VarJ = eVar.j();
                dVar.d("sentry-trace_id", w7VarJ != null ? w7VarJ.m.a() : null);
                dVar.d("sentry-public_key", sentryAndroidOptions.retrieveParsedDsn().b);
                dVar.d("sentry-release", h5Var.r);
                dVar.d("sentry-environment", h5Var.s);
                dVar.d("sentry-org_id", sentryAndroidOptions.getEffectiveOrgId());
                dVar.d("sentry-transaction", str);
                if (dVar.f) {
                    dVar.c = null;
                }
                dVar.d("sentry-sampled", null);
                if (dVar.f) {
                    dVar.d = null;
                }
                Object objD = eVar.d("replay_id");
                if (objD != null && !objD.toString().equals(io.sentry.protocol.w.n.a())) {
                    dVar.d("sentry-replay_id", objD.toString());
                    eVar.n("replay_id");
                }
                dVar.f = false;
                return dVar.f();
            }
        } else if (l1Var != null) {
            x1 x1VarM = l1Var.m();
            return x1VarM != null ? x1VarM.b() : ((d) l1Var.F(new q7(l1Var, sentryAndroidOptions)).e).f();
        }
        return null;
    }

    public final v5 t(v5 v5Var, p0 p0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            try {
                boolean z = j0Var instanceof io.sentry.android.core.n0;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(p0Var.b("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    ((io.sentry.android.core.n0) j0Var).b(v5Var, p0Var);
                } else if (!zIsInstance && !z) {
                    v5Var = j0Var.b(v5Var, p0Var);
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th, "An exception occurred while processing event by processor: %s", j0Var.getClass().getName());
            }
            if (v5Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Event was dropped by a processor: %s", j0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Error);
                break;
            }
        }
        return v5Var;
    }

    public final v5 u(v5 v5Var, p0 p0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            try {
                v5Var = j0Var.b(v5Var, p0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th, "An exception occurred while processing feedback event by processor: %s", j0Var.getClass().getName());
            }
            if (v5Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Feedback event was dropped by a processor: %s", j0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Feedback);
                break;
            }
        }
        return v5Var;
    }

    public final h6 v(h6 h6Var, List list) {
        h6 h6VarD;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            try {
                h6VarD = j0Var.d(h6Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th, "An exception occurred while processing log event by processor: %s", j0Var.getClass().getName());
                h6VarD = h6Var;
            }
            if (h6VarD == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Log event was dropped by a processor: %s", j0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, q.LogItem);
                sentryAndroidOptions.getClientReportRecorder().e(dVar, q.LogByte, io.sentry.util.f.a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), h6Var));
                return h6VarD;
            }
            h6Var = h6VarD;
        }
        return h6Var;
    }

    public final io.sentry.protocol.f0 w(io.sentry.protocol.f0 f0Var, p0 p0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            int size = f0Var.E.size();
            try {
                f0Var = j0Var.c(f0Var, p0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th, "An exception occurred while processing transaction by processor: %s", j0Var.getClass().getName());
            }
            int size2 = f0Var == null ? 0 : f0Var.E.size();
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction was dropped by a processor: %s", j0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, q.Transaction);
                sentryAndroidOptions.getClientReportRecorder().e(dVar, q.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), j0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().e(io.sentry.clientreport.d.EVENT_PROCESSOR, q.Span, i);
            }
        }
        return f0Var;
    }

    public final io.sentry.protocol.w x(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        if (io.sentry.util.o.a()) {
            return io.sentry.protocol.w.n;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getBeforeEnvelopeCallback();
        d6.d().c(sentryAndroidOptions.getLogger());
        io.sentry.transport.g gVar = this.c;
        if (p0Var == null) {
            gVar.getClass();
            gVar.n0(cVar, new p0());
        } else {
            gVar.n0(cVar, p0Var);
        }
        io.sentry.protocol.w wVar = ((n5) cVar.n).m;
        return wVar != null ? wVar : io.sentry.protocol.w.n;
    }

    public final boolean y(h5 h5Var, p0 p0Var) {
        if (io.sentry.util.b.x(p0Var)) {
            return true;
        }
        this.b.getLogger().g(f6.DEBUG, "Event was cached so not applying scope: %s", h5Var.m);
        return false;
    }
}
