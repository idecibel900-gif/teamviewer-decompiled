package io.sentry;

import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class g7 {
    static final f6 DEFAULT_DIAGNOSTIC_LEVEL = f6.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private x0 appStartExtender;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private r6 beforeBreadcrumb;
    private s6 beforeEnvelopeCallback;
    private t6 beforeSend;
    private t6 beforeSendFeedback;
    private u6 beforeSendReplay;
    private v6 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.f clientReportRecorder;
    private p compositePerformanceCollector;
    private a1 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private b1 continuousProfiler;
    private w6 cron;
    private r dataCollection;
    private final s dataCollectionResolver;
    private final io.sentry.util.h dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private t4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private f6 diagnosticLevel;
    private String dist;
    private String distinctId;
    private x6 distribution;
    private c1 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enableLegacyProfiling;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.h envelopeReader;
    private String environment;
    private r1 executorService;
    private final k0 experimental;
    private g1 fatalLogger;
    private a6 feedbackOptions;
    private boolean forceInit;
    private o0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<n0> ignoredCheckIns;
    private List<n0> ignoredSpanOrigins;
    private List<n0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private b2 initPriority;
    private c2 instrumenter;
    private volatile d8 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private g1 logger;
    private y6 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private e7 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private z6 metrics;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<m1> observers;
    private a7 onDiscard;
    private b7 onOversizedEvent;
    private p6 openTelemetryMode;
    private final List<h1> optionsObservers;
    private String orgId;
    private final io.sentry.util.h parsedDsn;
    private final List<i1> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private e4 profileLifecycle;
    private Double profileSessionSampleRate;
    private k1 profilerConverter;
    private Double profilesSampleRate;
    private c7 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private d7 proxy;
    private int readTimeoutMillis;
    private String release;
    private j4 replayController;
    private Double sampleRate;
    private p1 scopesStorageFactory;
    private io.sentry.protocol.u sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.h serializer;
    private String serverName;
    private k7 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private u1 socketTagger;
    private w1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private r1 timerExecutorService;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private f7 tracesSampler;
    private y1 transactionProfiler;
    private z1 transportFactory;
    private io.sentry.transport.h transportGate;
    private a2 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<j0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<n0> ignoredErrors = null;
    private final List<d2> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Code duplicated, block: B:17:0x02c2  */
    public g7(boolean z) {
        w1 s3Var;
        Class clsC;
        final byte b = 0;
        this.parsedDsn = new io.sentry.util.h(new io.sentry.util.g(this) { // from class: io.sentry.q6
            public final /* synthetic */ g7 n;

            {
                this.n = this;
            }

            @Override // io.sentry.util.g
            public final Object e() {
                byte b2 = b;
                g7 g7Var = this.n;
                switch (b2) {
                    case 0:
                        return g7Var.a();
                    case 1:
                        return new u2(g7Var);
                    default:
                        return g7Var.b();
                }
            }
        });
        g3 g3Var = g3.m;
        this.logger = g3Var;
        this.fatalLogger = g3Var;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final byte b2 = 1;
        this.serializer = new io.sentry.util.h(new io.sentry.util.g(this) { // from class: io.sentry.q6
            public final /* synthetic */ g7 n;

            {
                this.n = this;
            }

            @Override // io.sentry.util.g
            public final Object e() {
                byte b3 = b2;
                g7 g7Var = this.n;
                switch (b3) {
                    case 0:
                        return g7Var.a();
                    case 1:
                        return new u2(g7Var);
                    default:
                        return g7Var.b();
                }
            }
        });
        final byte b3 = 2;
        this.envelopeReader = new io.sentry.util.h(new io.sentry.util.g(this) { // from class: io.sentry.q6
            public final /* synthetic */ g7 n;

            {
                this.n = this;
            }

            @Override // io.sentry.util.g
            public final Object e() {
                byte b4 = b3;
                g7 g7Var = this.n;
                switch (b4) {
                    case 0:
                        return g7Var.a();
                    case 1:
                        return new u2(g7Var);
                    default:
                        return g7Var.b();
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = u3.m;
        this.transportGate = io.sentry.transport.k.a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        o3 o3Var = o3.a;
        this.executorService = o3Var;
        this.timerExecutorService = o3Var;
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.i.m;
        this.sendDefaultPii = false;
        this.dataCollection = new r();
        this.dataCollectionResolver = new s(this);
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = e7.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = a3.q;
        this.continuousProfiler = d3.m;
        this.profilerConverter = h3.a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.m;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = c2.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.a;
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new io.sentry.util.h(new h2((byte) 7));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = b3.a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = o0.b;
        this.appStartExtender = a3.m;
        this.connectionStatusProvider = new c3();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.m;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = s3.b;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = a3.p;
        this.distributionController = a3.n;
        this.enableScreenTracking = true;
        this.defaultScopeType = t4.ISOLATION;
        this.initPriority = b2.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = p6.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = v3.a;
        this.profileLifecycle = e4.MANUAL;
        this.startProfilerOnAppStart = false;
        this.enableLegacyProfiling = true;
        this.deadlineTimeout = 30000L;
        y6 y6Var = new y6();
        y6Var.a = false;
        y6Var.b = new io.sentry.logger.e();
        this.logs = y6Var;
        z6 z6Var = new z6();
        z6Var.a = true;
        z6Var.b = new io.sentry.metrics.d();
        this.metrics = z6Var;
        this.socketTagger = q3.m;
        this.distribution = new x6();
        io.sentry.protocol.u uVar = new io.sentry.protocol.u("sentry.java", "8.58.0");
        uVar.n = "8.58.0";
        this.experimental = new k0();
        k7 k7Var = new k7((byte) 0);
        k7Var.c = false;
        k7Var.f = j7.MEDIUM;
        k7Var.g = true;
        k7Var.h = (short) 30000;
        k7Var.i = (short) 5000;
        k7Var.j = 3600000;
        k7Var.k = true;
        k7Var.m = false;
        k7Var.n = x4.PIXEL_COPY;
        k7Var.f208o = false;
        List list = Collections.EMPTY_LIST;
        k7Var.p = list;
        k7Var.q = list;
        k7Var.r = true;
        List list2 = k7.u;
        k7Var.s = list2;
        k7Var.t = list2;
        if (!z) {
            ((CopyOnWriteArraySet) k7Var.a).add("android.widget.TextView");
            ((CopyOnWriteArraySet) k7Var.a).add("android.widget.ImageView");
            ((CopyOnWriteArraySet) k7Var.a).add("android.webkit.WebView");
            ((CopyOnWriteArraySet) k7Var.a).add("android.widget.VideoView");
            ((CopyOnWriteArraySet) k7Var.a).add("androidx.camera.view.PreviewView");
            ((CopyOnWriteArraySet) k7Var.a).add("androidx.media3.ui.PlayerView");
            ((CopyOnWriteArraySet) k7Var.a).add("com.google.android.exoplayer2.ui.PlayerView");
            ((CopyOnWriteArraySet) k7Var.a).add("com.google.android.exoplayer2.ui.StyledPlayerView");
            k7Var.l = uVar;
        }
        this.sessionReplay = k7Var;
        a3 a3Var = new a3();
        io.sentry.util.i iVar = new io.sentry.util.i();
        a6 a6Var = new a6();
        a6Var.a = false;
        a6Var.b = true;
        a6Var.c = false;
        a6Var.d = true;
        a6Var.e = true;
        a6Var.f = true;
        a6Var.g = false;
        a6Var.h = true;
        a6Var.i = a3Var;
        a6Var.j = iVar;
        this.feedbackOptions = a6Var;
        if (z) {
            return;
        }
        if (io.sentry.util.l.a || !io.sentry.util.i.a(g3Var, "io.sentry.opentelemetry.OtelSpanFactory") || (clsC = io.sentry.util.i.c(g3Var, "io.sentry.opentelemetry.OtelSpanFactory", true)) == null) {
            s3Var = new s3(b2);
        } else {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof w1) {
                    s3Var = (w1) objNewInstance;
                } else {
                    s3Var = new s3(b2);
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(s3Var);
        List<d2> list3 = this.integrations;
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = new UncaughtExceptionHandlerIntegration();
        uncaughtExceptionHandlerIntegration.p = false;
        list3.add(uncaughtExceptionHandlerIntegration);
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new x2(this));
        this.eventProcessors.add(new t(this));
        if (!io.sentry.util.l.a) {
            this.eventProcessors.add(new l7());
        }
        setSentryClientName("sentry.java/8.58.0");
        setSdkVersion(uVar);
        d6.d().b("maven:io.sentry:sentry", "8.58.0");
    }

    public static g7 empty() {
        return new g7(true);
    }

    public final /* synthetic */ g0 a() {
        return new g0(this.dsn);
    }

    public void activate() {
        if (this.executorService instanceof o3) {
            this.executorService = new y5(this);
        }
        if (this.timerExecutorService instanceof o3) {
            this.timerExecutorService = new y5(this, 0);
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((d2) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(j0 j0Var) {
        this.eventProcessors.add(j0Var);
    }

    public void addIgnoredCheckIn(String str) {
        List arrayList = this.ignoredCheckIns;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredCheckIns = arrayList;
        }
        arrayList.add(new n0(str));
    }

    public void addIgnoredError(String str) {
        List arrayList = this.ignoredErrors;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredErrors = arrayList;
        }
        arrayList.add(new n0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        List arrayList = this.ignoredSpanOrigins;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredSpanOrigins = arrayList;
        }
        arrayList.add(new n0(str));
    }

    public void addIgnoredTransaction(String str) {
        List arrayList = this.ignoredTransactions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredTransactions = arrayList;
        }
        arrayList.add(new n0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(d2 d2Var) {
        this.integrations.add(d2Var);
    }

    public void addOptionsObserver(h1 h1Var) {
        this.optionsObservers.add(h1Var);
    }

    public void addPerformanceCollector(i1 i1Var) {
        this.performanceCollectors.add(i1Var);
    }

    public void addScopeObserver(m1 m1Var) {
        this.observers.add(m1Var);
    }

    public final /* synthetic */ h0 b() {
        return new h0((t1) this.serializer.a());
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.cache.g findPersistingScopeObserver() {
        for (m1 m1Var : this.observers) {
            if (m1Var instanceof io.sentry.cache.g) {
                return (io.sentry.cache.g) m1Var;
            }
        }
        return null;
    }

    public x0 getAppStartExtender() {
        return this.appStartExtender;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public r6 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public s6 getBeforeEnvelopeCallback() {
        return null;
    }

    public t6 getBeforeSend() {
        return null;
    }

    public t6 getBeforeSendFeedback() {
        return null;
    }

    public u6 getBeforeSendReplay() {
        return null;
    }

    public v6 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public p getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public a1 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public b1 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public w6 getCron() {
        return this.cron;
    }

    public r getDataCollection() {
        return this.dataCollection;
    }

    public s getDataCollectionResolver() {
        return this.dataCollectionResolver;
    }

    public m5 getDateProvider() {
        return (m5) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public t4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public f6 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public x6 getDistribution() {
        return this.distribution;
    }

    public c1 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public d1 getEnvelopeReader() {
        return (d1) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public io.sentry.time.b getEpochClock() {
        return io.sentry.time.d.a;
    }

    public List<j0> getEventProcessors() {
        return this.eventProcessors;
    }

    public r1 getExecutorService() {
        return this.executorService;
    }

    public k0 getExperimental() {
        return this.experimental;
    }

    public g1 getFatalLogger() {
        return this.fatalLogger;
    }

    public a6 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public o0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<n0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<n0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<n0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<n0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public b2 getInitPriority() {
        return this.initPriority;
    }

    public c2 getInstrumenter() {
        return this.instrumenter;
    }

    public List<d2> getIntegrations() {
        return this.integrations;
    }

    public d8 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            io.sentry.util.a aVar = this.lock;
            aVar.e();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new d8(this);
                }
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
        return this.internalTracesSampler;
    }

    public g1 getLogger() {
        return this.logger;
    }

    public y6 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public e7 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public z6 getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public a7 getOnDiscard() {
        return null;
    }

    public b7 getOnOversizedEvent() {
        return null;
    }

    public p6 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<h1> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<i1> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public e4 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public k1 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public c7 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public d7 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public j4 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<m1> getScopeObservers() {
        return this.observers;
    }

    public p1 getScopesStorageFactory() {
        return null;
    }

    public io.sentry.protocol.u getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public t1 getSerializer() {
        return (t1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public k7 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public u1 getSocketTagger() {
        return this.socketTagger;
    }

    public w1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public r1 getTimerExecutorService() {
        return this.timerExecutorService;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public f7 getTracesSampler() {
        return null;
    }

    public y1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public z1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public a2 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableLegacyProfiling() {
        return this.enableLegacyProfiling;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(l0 l0Var) {
        String str = l0Var.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = l0Var.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = l0Var.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = l0Var.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = l0Var.e;
        if (str5 != null) {
            setServerName(str5);
        }
        d7 d7Var = l0Var.n;
        if (d7Var != null) {
            setProxy(d7Var);
        }
        Boolean bool = l0Var.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = l0Var.y;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d = l0Var.i;
        if (d != null) {
            setSampleRate(d);
        }
        Double d2 = l0Var.j;
        if (d2 != null) {
            setTracesSampleRate(d2);
        }
        Double d3 = l0Var.k;
        if (d3 != null) {
            setProfilesSampleRate(d3);
        }
        Boolean bool3 = l0Var.g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = l0Var.h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = l0Var.z;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = l0Var.R;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(l0Var.m).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(l0Var.p).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(l0Var.f209o).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(l0Var.w).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (l0Var.q != null) {
            setTracePropagationTargets(new ArrayList(l0Var.q));
        }
        Iterator it4 = new ArrayList(l0Var.r).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = l0Var.s;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = l0Var.t;
        if (l != null) {
            setIdleTimeout(l);
        }
        Long l2 = l0Var.u;
        if (l2 != null) {
            setShutdownTimeoutMillis(l2.longValue());
        }
        Long l3 = l0Var.v;
        if (l3 != null) {
            setSessionFlushTimeoutMillis(l3.longValue());
        }
        Iterator it5 = l0Var.A.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = l0Var.B;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = l0Var.C;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = l0Var.J;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (l0Var.H != null) {
            setIgnoredCheckIns(new ArrayList(l0Var.H));
        }
        if (l0Var.I != null) {
            setIgnoredTransactions(new ArrayList(l0Var.I));
        }
        if (l0Var.x != null) {
            setIgnoredErrors(new ArrayList(l0Var.x));
        }
        Boolean bool10 = l0Var.M;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        Boolean bool11 = l0Var.N;
        if (bool11 != null) {
            setEnableDatabaseTransactionTracing(bool11.booleanValue());
        }
        Boolean bool12 = l0Var.O;
        if (bool12 != null) {
            setEnableCacheTracing(bool12.booleanValue());
        }
        Boolean bool13 = l0Var.P;
        if (bool13 != null) {
            setEnableQueueTracing(bool13.booleanValue());
        }
        e7 e7Var = l0Var.l;
        if (e7Var != null) {
            setMaxRequestBodySize(e7Var);
        }
        Boolean bool14 = l0Var.K;
        if (bool14 != null) {
            setSendDefaultPii(bool14.booleanValue());
        }
        r rVar = l0Var.L;
        if (rVar != null) {
            Boolean bool15 = rVar.a;
            if (bool15 != null) {
                this.dataCollection.a = bool15;
            }
            Set set = rVar.d;
            if (set != null) {
                this.dataCollection.b(set);
            }
            w2 w2Var = rVar.b;
            if (w2Var != null) {
                this.dataCollection.b = w2Var;
            }
            io.sentry.internal.debugmeta.c cVar = rVar.g;
            w2 w2Var2 = (w2) cVar.n;
            if (w2Var2 != null) {
                this.dataCollection.g.n = w2Var2;
            }
            w2 w2Var3 = (w2) cVar.f205o;
            if (w2Var3 != null) {
                this.dataCollection.g.f205o = w2Var3;
            }
            w2 w2Var4 = rVar.c;
            if (w2Var4 != null) {
                this.dataCollection.c = w2Var4;
            }
            io.sentry.internal.debugmeta.c cVar2 = rVar.h;
            Boolean bool16 = (Boolean) cVar2.n;
            if (bool16 != null) {
                this.dataCollection.h.n = bool16;
            }
            Boolean bool17 = (Boolean) cVar2.f205o;
            if (bool17 != null) {
                this.dataCollection.h.f205o = bool17;
            }
            Boolean bool18 = rVar.e;
            if (bool18 != null) {
                this.dataCollection.e = bool18;
            }
            Boolean bool19 = rVar.f;
            if (bool19 != null) {
                this.dataCollection.f = bool19;
            }
        }
        Boolean bool20 = l0Var.S;
        if (bool20 != null) {
            setCaptureOpenTelemetryEvents(bool20.booleanValue());
        }
        Boolean bool21 = l0Var.D;
        if (bool21 != null) {
            setEnableSpotlight(bool21.booleanValue());
        }
        String str7 = l0Var.G;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool22 = l0Var.Q;
        if (bool22 != null) {
            setGlobalHubMode(bool22);
        }
        if (l0Var.Y != null) {
            w6 cron = getCron();
            w6 w6Var = l0Var.Y;
            if (cron == null) {
                setCron(w6Var);
            } else {
                if (w6Var.a != null) {
                    w6 cron2 = getCron();
                    w6Var = l0Var.Y;
                    cron2.a = w6Var.a;
                }
                if (w6Var.b != null) {
                    w6 cron3 = getCron();
                    w6Var = l0Var.Y;
                    cron3.b = w6Var.b;
                }
                if (w6Var.c != null) {
                    w6 cron4 = getCron();
                    w6Var = l0Var.Y;
                    cron4.c = w6Var.c;
                }
                if (w6Var.d != null) {
                    w6 cron5 = getCron();
                    w6Var = l0Var.Y;
                    cron5.d = w6Var.d;
                }
                if (w6Var.e != null) {
                    getCron().e = l0Var.Y.e;
                }
            }
        }
        if (l0Var.E != null) {
            getLogs().a = l0Var.E.booleanValue();
        }
        if (l0Var.F != null) {
            getMetrics().a = l0Var.F.booleanValue();
        }
        Double d4 = l0Var.T;
        if (d4 != null) {
            setProfileSessionSampleRate(d4);
        }
        String str8 = l0Var.U;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        e4 e4Var = l0Var.V;
        if (e4Var != null) {
            setProfileLifecycle(e4Var);
        }
        Boolean bool23 = l0Var.W;
        if (bool23 != null) {
            setStrictTraceContinuation(bool23.booleanValue());
        }
        String str9 = l0Var.X;
        if (str9 != null) {
            setOrgId(str9);
        }
    }

    public g0 retrieveParsedDsn() {
        return (g0) this.parsedDsn.a();
    }

    public void setAppStartExtender(x0 x0Var) {
        if (x0Var == null) {
            x0Var = a3.m;
        }
        this.appStartExtender = x0Var;
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(r6 r6Var) {
        this.beforeBreadcrumb = r6Var;
    }

    public void setBeforeEnvelopeCallback(s6 s6Var) {
    }

    public void setBeforeSend(t6 t6Var) {
    }

    public void setBeforeSendFeedback(t6 t6Var) {
    }

    public void setBeforeSendReplay(u6 u6Var) {
    }

    public void setBeforeSendTransaction(v6 v6Var) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(p pVar) {
        this.compositePerformanceCollector = pVar;
    }

    public void setConnectionStatusProvider(a1 a1Var) {
        this.connectionStatusProvider = a1Var;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(b1 b1Var) {
        if (this.continuousProfiler != d3.m || b1Var == null) {
            return;
        }
        this.continuousProfiler = b1Var;
    }

    public void setCron(w6 w6Var) {
        this.cron = w6Var;
    }

    public void setDataCollection(r rVar) {
        if (rVar != null) {
            this.dataCollection = rVar;
        }
    }

    public void setDateProvider(m5 m5Var) {
        this.dateProvider.b(m5Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.m;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(t4 t4Var) {
        this.defaultScopeType = t4Var;
    }

    public void setDiagnosticLevel(f6 f6Var) {
        if (f6Var == null) {
            f6Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = f6Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(x6 x6Var) {
        if (x6Var == null) {
            x6Var = new x6();
        }
        this.distribution = x6Var;
    }

    public void setDistributionController(c1 c1Var) {
        if (c1Var == null) {
            c1Var = a3.n;
        }
        this.distributionController = c1Var;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        io.sentry.util.h hVar = this.parsedDsn;
        io.sentry.util.a aVar = hVar.c;
        aVar.e();
        try {
            hVar.a = null;
            aVar.close();
            String str2 = this.dsn;
            g1 g1Var = this.logger;
            Charset charset = io.sentry.util.r.a;
            if (str2 != null && !str2.isEmpty()) {
                try {
                    string = new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.r.a))).toString(16);
                } catch (NoSuchAlgorithmException e) {
                    g1Var.d(f6.INFO, "SHA-1 isn't available to calculate the hash.", e);
                } catch (Throwable th) {
                    g1Var.g(f6.INFO, "string: %s could not calculate its hash", th, str2);
                }
            }
            this.dsnHash = string;
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableCacheTracing(boolean z) {
        this.enableCacheTracing = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableLegacyProfiling(boolean z) {
        this.enableLegacyProfiling = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableQueueTracing(boolean z) {
        this.enableQueueTracing = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.m;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(d1 d1Var) {
        io.sentry.util.h hVar = this.envelopeReader;
        if (d1Var == null) {
            d1Var = e3.a;
        }
        hVar.b(d1Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(r1 r1Var) {
        if (r1Var != null) {
            this.executorService = r1Var;
        }
    }

    public void setFatalLogger(g1 g1Var) {
        if (g1Var == null) {
            g1Var = g3.m;
        }
        this.fatalLogger = g1Var;
    }

    public void setFeedbackOptions(a6 a6Var) {
        this.feedbackOptions = a6Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(o0 o0Var) {
        this.fullyDisplayedReporter = o0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new n0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new n0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new n0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new n0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(b2 b2Var) {
        this.initPriority = b2Var;
    }

    @Deprecated
    public void setInstrumenter(c2 c2Var) {
        this.instrumenter = c2Var;
    }

    public void setLogger(g1 g1Var) {
        this.logger = g1Var == null ? g3.m : new io.sentry.internal.debugmeta.c((Object) this, (Object) g1Var, (byte) 3);
    }

    public void setLogs(y6 y6Var) {
        this.logs = y6Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(e7 e7Var) {
        this.maxRequestBodySize = e7Var;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(z6 z6Var) {
        this.metrics = z6Var;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setOnDiscard(a7 a7Var) {
    }

    public void setOnOversizedEvent(b7 b7Var) {
    }

    public void setOpenTelemetryMode(p6 p6Var) {
        this.openTelemetryMode = p6Var;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(e4 e4Var) {
        this.profileLifecycle = e4Var;
        if (e4Var != e4.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.g(f6.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.profileSessionSampleRate = d;
        } else {
            h2.g(d, " is not valid. Use values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilerConverter(k1 k1Var) {
        this.profilerConverter = k1Var;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.profilesSampleRate = d;
        } else {
            h2.g(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilesSampler(c7 c7Var) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(d7 d7Var) {
        this.proxy = d7Var;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(j4 j4Var) {
        if (j4Var == null) {
            j4Var = a3.p;
        }
        this.replayController = j4Var;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.sampleRate = d;
        } else {
            h2.g(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public void setScopesStorageFactory(p1 p1Var) {
    }

    public void setSdkVersion(io.sentry.protocol.u uVar) {
        io.sentry.protocol.u uVar2 = getSessionReplay().l;
        io.sentry.protocol.u uVar3 = this.sdkVersion;
        if (uVar3 != null && uVar2 != null && uVar3.equals(uVar2)) {
            getSessionReplay().l = uVar;
        }
        this.sdkVersion = uVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.j();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(t1 t1Var) {
        io.sentry.util.h hVar = this.serializer;
        if (t1Var == null) {
            t1Var = p3.a;
        }
        hVar.b(t1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(k7 k7Var) {
        this.sessionReplay = k7Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(u1 u1Var) {
        if (u1Var == null) {
            u1Var = q3.m;
        }
        this.socketTagger = u1Var;
    }

    public void setSpanFactory(w1 w1Var) {
        this.spanFactory = w1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setStrictTraceContinuation(boolean z) {
        this.strictTraceContinuation = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = this.tags;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTimerExecutorService(r1 r1Var) {
        if (r1Var != null) {
            this.timerExecutorService = r1Var;
        }
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.tracesSampleRate = d;
        } else {
            h2.g(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setTracesSampler(f7 f7Var) {
    }

    public void setTransactionProfiler(y1 y1Var) {
        if (this.transactionProfiler != a3.q || y1Var == null) {
            return;
        }
        this.transactionProfiler = y1Var;
    }

    public void setTransportFactory(z1 z1Var) {
        if (z1Var == null) {
            z1Var = u3.m;
        }
        this.transportFactory = z1Var;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(a2 a2Var) {
        this.versionDetector = a2Var;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }
}
