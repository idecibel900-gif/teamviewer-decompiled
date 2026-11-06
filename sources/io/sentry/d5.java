package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d5 {
    public static volatile o1 a = m3.a;
    public static volatile n1 b = k3.b;
    public static final p4 c = new p4(g7.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName("UTF-8");
    public static final long f = System.currentTimeMillis();
    public static final io.sentry.util.a g = new io.sentry.util.a();

    public static io.sentry.protocol.w a(Exception exc, p0 p0Var) {
        return c().x(exc, p0Var);
    }

    public static void b() {
        io.sentry.util.a aVar = g;
        aVar.e();
        try {
            n1 n1VarC = c();
            b = k3.b;
            a.close();
            n1VarC.a(false);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static n1 c() {
        n1 n1Var = b;
        n1 n1Var2 = a.get();
        if (d) {
            return (n1Var2 == null || n1Var2.i() || !n1Var.A(n1Var2)) ? n1Var : n1Var2;
        }
        if (n1Var2 != null && !n1Var2.i()) {
            return n1Var2;
        }
        n1 n1VarZ = n1Var.z("getCurrentScopes");
        a.a(n1VarZ);
        return n1VarZ;
    }

    public static void d(io.sentry.android.core.x xVar, io.sentry.android.core.e eVar) {
        SentryAndroidOptions sentryAndroidOptions = new SentryAndroidOptions();
        try {
            eVar.k(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.util.a aVar = g;
        aVar.e();
        try {
            if (!SentryAndroidOptions.class.getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.l.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(SentryAndroidOptions.class.getName()));
            }
            if (h(sentryAndroidOptions)) {
                Boolean boolIsGlobalHubMode = sentryAndroidOptions.isGlobalHubMode();
                byte b2 = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                sentryAndroidOptions.getLogger().g(f6.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (sentryAndroidOptions.getFatalLogger() instanceof g3) {
                    sentryAndroidOptions.setFatalLogger(new a3());
                }
                p4 p4Var = c;
                byte b3 = 0;
                if (io.sentry.util.b.y(p4Var.l, sentryAndroidOptions, g())) {
                    if (g()) {
                        sentryAndroidOptions.getLogger().g(f6.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    sentryAndroidOptions.activate();
                    c().a(true);
                    p4Var.l = sentryAndroidOptions;
                    Queue queue = p4Var.g;
                    p4Var.g = p4.a(sentryAndroidOptions.getMaxBreadcrumbs());
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        p4Var.f((h) it.next(), null);
                    }
                    b = new v4(new p4(sentryAndroidOptions), new p4(sentryAndroidOptions), p4Var, null);
                    if (sentryAndroidOptions.isDebug() && (sentryAndroidOptions.getLogger() instanceof g3)) {
                        sentryAndroidOptions.setLogger(new a3());
                    }
                    f(sentryAndroidOptions);
                    a.a(b);
                    e(sentryAndroidOptions);
                    p4Var.u = new j5(sentryAndroidOptions);
                    if (sentryAndroidOptions.getExecutorService().isClosed()) {
                        sentryAndroidOptions.setExecutorService(new y5(sentryAndroidOptions));
                    }
                    if (sentryAndroidOptions.getTimerExecutorService().isClosed()) {
                        sentryAndroidOptions.setTimerExecutorService(new y5(sentryAndroidOptions, 0));
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new a5(sentryAndroidOptions, b3));
                    } catch (RejectedExecutionException e2) {
                        sentryAndroidOptions.getLogger().d(f6.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new z2(sentryAndroidOptions, b3));
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().d(f6.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (d2 d2Var : sentryAndroidOptions.getIntegrations()) {
                        try {
                            d2Var.Y(sentryAndroidOptions);
                        } catch (Throwable th3) {
                            sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to register the integration " + d2Var.getClass().getName(), th3);
                        }
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new a5(sentryAndroidOptions, (byte) 2));
                    } catch (Throwable th4) {
                        sentryAndroidOptions.getLogger().d(f6.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new a4(sentryAndroidOptions));
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().d(f6.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new a5(sentryAndroidOptions, b2));
                    } catch (Throwable th6) {
                        sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    g1 logger = sentryAndroidOptions.getLogger();
                    f6 f6Var = f6.DEBUG;
                    logger.g(f6Var, "Using openTelemetryMode %s", sentryAndroidOptions.getOpenTelemetryMode());
                    sentryAndroidOptions.getLogger().g(f6Var, "Using span factory %s", sentryAndroidOptions.getSpanFactory().getClass().getName());
                    sentryAndroidOptions.getLogger().g(f6Var, "Using scopes storage %s", a.getClass().getName());
                } else {
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            aVar.close();
        } catch (Throwable th7) {
            try {
                aVar.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void e(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.cache.d cVar;
        g1 logger = sentryAndroidOptions.getLogger();
        f6 f6Var = f6.INFO;
        logger.g(f6Var, "Initializing SDK with DSN: '%s'", sentryAndroidOptions.getDsn());
        byte b2 = 0;
        if (sentryAndroidOptions.getOutboxPath() == null) {
            logger.g(f6Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            Charset charset = io.sentry.cache.c.u;
            String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
            int maxCacheItems = sentryAndroidOptions.getMaxCacheItems();
            if (cacheDirPath == null) {
                sentryAndroidOptions.getLogger().g(f6.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                cVar = io.sentry.transport.i.m;
            } else {
                cVar = new io.sentry.cache.c(sentryAndroidOptions, cacheDirPath, maxCacheItems);
            }
            sentryAndroidOptions.setEnvelopeDiskCache(cVar);
        }
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        if ((sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryAndroidOptions.getExecutorService().submit(new b5(file, b2));
            } catch (RejectedExecutionException e2) {
                sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        io.sentry.internal.modules.a modulesLoader = sentryAndroidOptions.getModulesLoader();
        if (!sentryAndroidOptions.isSendModules()) {
            sentryAndroidOptions.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(sentryAndroidOptions.getLogger()), new io.sentry.internal.modules.f(sentryAndroidOptions.getLogger())), sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(sentryAndroidOptions.getLogger(), (byte) 0));
        }
        List<Properties> listF = sentryAndroidOptions.getDebugMetaLoader().f();
        if (listF != null) {
            if (sentryAndroidOptions.getBundleIds().isEmpty()) {
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            sentryAndroidOptions.addBundleId(str);
                        }
                    }
                }
            }
            if (sentryAndroidOptions.getProguardUuid() == null) {
                Iterator it2 = listF.iterator();
                while (it2.hasNext()) {
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Proguard UUID found: %s", property2);
                        sentryAndroidOptions.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listF) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    d6.d().b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listF) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    x6 distribution = sentryAndroidOptions.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        sentryAndroidOptions.getLogger().g(f6.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                            break;
                        }
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.util.thread.c.b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new e2());
        }
        if (sentryAndroidOptions.isEnableBackpressureHandling() && !io.sentry.util.l.a) {
            if (sentryAndroidOptions.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                sentryAndroidOptions.setBackpressureMonitor(new io.sentry.backpressure.a(sentryAndroidOptions));
            }
            sentryAndroidOptions.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.l.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getContinuousProfiler() instanceof d3)) {
            try {
                if (sentryAndroidOptions.getProfilingTracesDirPath() == null) {
                    File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (file2.mkdirs() || file2.exists()) {
                        sentryAndroidOptions.setProfilingTracesDirPath(file2.getAbsolutePath());
                    } else {
                        h2.h(file2.getAbsolutePath(), "Creating a fallback directory for profiling failed in ");
                    }
                }
                g1 logger2 = sentryAndroidOptions.getLogger();
                sentryAndroidOptions.getProfilingTracesHz();
                sentryAndroidOptions.getExecutorService();
                try {
                    Iterator it3 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                    if ((it3.hasNext() ? it3.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger2.g(f6.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
                    sentryAndroidOptions.getContinuousProfiler();
                } catch (Throwable th) {
                    logger2.d(f6.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
                }
            } catch (Exception e3) {
                sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to create default profiling traces directory", e3);
            }
        } else {
            sentryAndroidOptions.getContinuousProfiler();
        }
        if (!io.sentry.util.l.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getProfilerConverter() instanceof h3)) {
            g1 logger3 = c.l.getLogger();
            try {
                Iterator it4 = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                if ((it4.hasNext() ? it4.next() : null) != null) {
                    throw new ClassCastException();
                }
                logger3.g(f6.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
                sentryAndroidOptions.getLogger().g(f6.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
                sentryAndroidOptions.getProfilerConverter();
            } catch (Throwable th2) {
                logger3.d(f6.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            }
        } else {
            sentryAndroidOptions.getProfilerConverter();
        }
        sentryAndroidOptions.getLogger().g(f6.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryAndroidOptions.isContinuousProfilingEnabled()), sentryAndroidOptions.getProfileLifecycle());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    public static void f(SentryAndroidOptions sentryAndroidOptions) {
        o1 zVar;
        Class clsC;
        List list;
        g3 g3Var = g3.m;
        boolean z = io.sentry.util.l.a;
        if (!z) {
            if (p6.AUTO.equals(sentryAndroidOptions.getOpenTelemetryMode())) {
                if (io.sentry.util.i.a(g3Var, "io.sentry.opentelemetry.agent.AgentMarker")) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(p6.AGENT);
                } else if (io.sentry.util.i.a(g3Var, "io.sentry.opentelemetry.agent.AgentlessMarker")) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(p6.AGENTLESS);
                } else if (io.sentry.util.i.a(g3Var, "io.sentry.opentelemetry.agent.AgentlessSpringMarker")) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(p6.AGENTLESS_SPRING);
                }
            }
        }
        p6 p6Var = p6.OFF;
        byte b2 = 1;
        if (p6Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            sentryAndroidOptions.setSpanFactory(new s3(b2));
        }
        a.close();
        sentryAndroidOptions.getScopesStorageFactory();
        if (p6Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            a = new z();
        } else {
            if (z || !io.sentry.util.i.a(g3Var, "io.sentry.opentelemetry.OtelContextScopesStorage") || (clsC = io.sentry.util.i.c(g3Var, "io.sentry.opentelemetry.OtelContextScopesStorage", true)) == null) {
                zVar = new z();
            } else {
                try {
                    Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance instanceof o1) {
                        zVar = (o1) objNewInstance;
                    } else {
                        zVar = new z();
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            a = zVar;
        }
        if (io.sentry.util.l.a) {
            return;
        }
        p6 openTelemetryMode = sentryAndroidOptions.getOpenTelemetryMode();
        if (p6.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.q.a;
            ArrayList arrayList = new ArrayList();
            p6 p6Var2 = p6.AGENT;
            if (p6Var2 == openTelemetryMode || p6.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
                arrayList.add("auto.queue.spring_jakarta.kafka.producer");
                arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
                arrayList.add("auto.queue.kafka.producer");
                arrayList.add("auto.queue.kafka.consumer");
            }
            if (p6Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sentryAndroidOptions.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static boolean g() {
        return c().isEnabled();
    }

    public static boolean h(SentryAndroidOptions sentryAndroidOptions) {
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Set set;
        Properties propertiesI;
        Properties propertiesI2;
        if (sentryAndroidOptions.isEnableExternalConfiguration()) {
            a3 a3Var = new a3();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesI2 = new io.sentry.android.core.n1(property, a3Var, true).i()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesI2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesI = new io.sentry.android.core.n1(str, a3Var, true).i()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesI));
            }
            Double dValueOf4 = null;
            try {
                InputStream resourceAsStream = io.sentry.util.b.d(io.sentry.config.a.class.getClassLoader()).getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
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
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e2) {
                a3Var.b(f6.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.e(properties));
            }
            Properties propertiesI3 = new io.sentry.android.core.n1("sentry.properties", a3Var, false).i();
            if (propertiesI3 != null) {
                arrayList.add(new io.sentry.config.e(propertiesI3));
            }
            io.sentry.config.b bVar = new io.sentry.config.b(arrayList);
            g1 logger = sentryAndroidOptions.getLogger();
            l0 l0Var = new l0();
            l0Var.a = bVar.getProperty("dsn");
            l0Var.b = bVar.getProperty("environment");
            l0Var.c = bVar.getProperty("release");
            l0Var.d = bVar.getProperty("dist");
            l0Var.e = bVar.getProperty("servername");
            l0Var.f = bVar.a("uncaught.handler.enabled");
            l0Var.y = bVar.a("uncaught.handler.print-stacktrace");
            String property2 = bVar.getProperty("sample-rate");
            if (property2 != null) {
                try {
                    dValueOf = Double.valueOf(property2);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            l0Var.i = dValueOf;
            String property3 = bVar.getProperty("traces-sample-rate");
            if (property3 != null) {
                try {
                    dValueOf2 = Double.valueOf(property3);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            l0Var.j = dValueOf2;
            String property4 = bVar.getProperty("profiles-sample-rate");
            if (property4 != null) {
                try {
                    dValueOf3 = Double.valueOf(property4);
                } catch (NumberFormatException unused3) {
                    dValueOf3 = null;
                }
            } else {
                dValueOf3 = null;
            }
            l0Var.k = dValueOf3;
            l0Var.g = bVar.a("debug");
            l0Var.h = bVar.a("enable-deduplication");
            l0Var.z = bVar.a("send-client-reports");
            l0Var.R = bVar.a("force-init");
            String property5 = bVar.getProperty("max-request-body-size");
            if (property5 != null) {
                l0Var.l = e7.valueOf(property5.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) bVar.d()).entrySet()) {
                l0Var.m.put((String) entry.getKey(), (String) entry.getValue());
            }
            String property6 = bVar.getProperty("proxy.host");
            String property7 = bVar.getProperty("proxy.user");
            String property8 = bVar.getProperty("proxy.pass");
            String property9 = bVar.getProperty("proxy.port");
            if (property9 == null) {
                property9 = "80";
            }
            if (property6 != null) {
                d7 d7Var = new d7();
                d7Var.a = property6;
                d7Var.b = property9;
                d7Var.c = property7;
                d7Var.d = property8;
                l0Var.n = d7Var;
            }
            Iterator it = bVar.e("in-app-includes").iterator();
            while (it.hasNext()) {
                l0Var.p.add((String) it.next());
            }
            Iterator it2 = bVar.e("in-app-excludes").iterator();
            while (it2.hasNext()) {
                l0Var.f209o.add((String) it2.next());
            }
            List<String> listE = bVar.getProperty("trace-propagation-targets") != null ? bVar.e("trace-propagation-targets") : null;
            if (listE == null && bVar.getProperty("tracing-origins") != null) {
                listE = bVar.e("tracing-origins");
            }
            if (listE != null) {
                for (String str2 : listE) {
                    if (l0Var.q == null) {
                        l0Var.q = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        l0Var.q.add(str2);
                    }
                }
            }
            Iterator it3 = bVar.e("context-tags").iterator();
            while (it3.hasNext()) {
                l0Var.r.add((String) it3.next());
            }
            l0Var.s = bVar.getProperty("proguard-uuid");
            Iterator it4 = bVar.e("bundle-ids").iterator();
            while (it4.hasNext()) {
                l0Var.A.add((String) it4.next());
            }
            l0Var.t = bVar.c("idle-timeout");
            l0Var.u = bVar.c("shutdown-timeout-millis");
            l0Var.v = bVar.c("session-flush-timeout-millis");
            l0Var.x = bVar.b("ignored-errors");
            l0Var.B = bVar.a("enabled");
            l0Var.C = bVar.a("enable-pretty-serialization-output");
            l0Var.J = bVar.a("send-modules");
            l0Var.K = bVar.a("send-default-pii");
            r rVar = new r();
            Boolean boolA = bVar.a("data-collection.user-info");
            if (boolA != null) {
                rVar.a = boolA;
            }
            List listB = bVar.b("data-collection.http-bodies");
            if (listB == null) {
                set = null;
            } else if (listB.size() == 1 && ((String) listB.get(0)).isEmpty()) {
                set = Collections.EMPTY_SET;
            } else {
                EnumSet enumSetNoneOf = EnumSet.noneOf(u0.class);
                Iterator it5 = listB.iterator();
                while (it5.hasNext()) {
                    enumSetNoneOf.add(u0.valueOf(((String) it5.next()).toUpperCase(Locale.ROOT)));
                }
                set = enumSetNoneOf;
            }
            if (set != null) {
                rVar.b(set);
            }
            w2 w2VarA = l0.a(bVar, "data-collection.cookies");
            if (w2VarA != null) {
                rVar.b = w2VarA;
            }
            w2 w2VarA2 = l0.a(bVar, "data-collection.http-headers.request");
            io.sentry.internal.debugmeta.c cVar = rVar.g;
            if (w2VarA2 != null) {
                cVar.n = w2VarA2;
            }
            w2 w2VarA3 = l0.a(bVar, "data-collection.http-headers.response");
            if (w2VarA3 != null) {
                cVar.f205o = w2VarA3;
            }
            w2 w2VarA4 = l0.a(bVar, "data-collection.url-query-params");
            if (w2VarA4 != null) {
                rVar.c = w2VarA4;
            }
            Boolean boolA2 = bVar.a("data-collection.graphql.document");
            io.sentry.internal.debugmeta.c cVar2 = rVar.h;
            if (boolA2 != null) {
                cVar2.n = boolA2;
            }
            Boolean boolA3 = bVar.a("data-collection.graphql.variables");
            if (boolA3 != null) {
                cVar2.f205o = boolA3;
            }
            Boolean boolA4 = bVar.a("data-collection.database-query-data");
            if (boolA4 != null) {
                rVar.e = boolA4;
            }
            Boolean boolA5 = bVar.a("data-collection.file-paths");
            if (boolA5 != null) {
                rVar.f = boolA5;
            }
            if (!rVar.a()) {
                rVar = null;
            }
            l0Var.L = rVar;
            l0Var.H = bVar.b("ignored-checkins");
            l0Var.I = bVar.b("ignored-transactions");
            l0Var.M = bVar.a("enable-backpressure-handling");
            l0Var.N = bVar.a("enable-database-transaction-tracing");
            l0Var.O = bVar.a("enable-cache-tracing");
            l0Var.P = bVar.a("enable-queue-tracing");
            l0Var.Q = bVar.a("global-hub-mode");
            l0Var.S = bVar.a("capture-open-telemetry-events");
            l0Var.E = bVar.a("logs.enabled");
            l0Var.F = bVar.a("metrics.enabled");
            for (String str3 : bVar.e("ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        l0Var.w.add(cls);
                    } else {
                        logger.g(f6.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.g(f6.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            Long lC = bVar.c("cron.default-checkin-margin");
            Long lC2 = bVar.c("cron.default-max-runtime");
            String property10 = bVar.getProperty("cron.default-timezone");
            Long lC3 = bVar.c("cron.default-failure-issue-threshold");
            Long lC4 = bVar.c("cron.default-recovery-threshold");
            if (lC != null || lC2 != null || property10 != null || lC3 != null || lC4 != null) {
                w6 w6Var = new w6();
                w6Var.a = lC;
                w6Var.b = lC2;
                w6Var.c = property10;
                w6Var.d = lC3;
                w6Var.e = lC4;
                l0Var.Y = w6Var;
            }
            l0Var.W = bVar.a("enable-strict-trace-continuation");
            l0Var.X = bVar.getProperty("org-id");
            l0Var.D = bVar.a("enable-spotlight");
            l0Var.G = bVar.getProperty("spotlight-connection-url");
            String property11 = bVar.getProperty("profile-session-sample-rate");
            if (property11 != null) {
                try {
                    dValueOf4 = Double.valueOf(property11);
                } catch (NumberFormatException unused5) {
                }
            }
            l0Var.T = dValueOf4;
            l0Var.U = bVar.getProperty("profiling-traces-dir-path");
            String property12 = bVar.getProperty("profile-lifecycle");
            if (property12 != null && !property12.isEmpty()) {
                l0Var.V = e4.valueOf(property12.toUpperCase());
            }
            sentryAndroidOptions.merge(l0Var);
        }
        String dsn = sentryAndroidOptions.getDsn();
        if (!sentryAndroidOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            b();
            return false;
        }
        if (dsn != null) {
            sentryAndroidOptions.retrieveParsedDsn();
            return true;
        }
        hk0.g("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        return false;
    }
}
