package com.teamviewer.apidefinitions.recentconnections.infrastructure;

import com.teamviewer.apidefinitions.recentconnections.infrastructure.ApiClient;
import io.sentry.p7;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.b75;
import o.b93;
import o.bc7;
import o.c75;
import o.dd6;
import o.e5;
import o.ea2;
import o.fx3;
import o.hk0;
import o.im3;
import o.kh7;
import o.mt4;
import o.nl3;
import o.pi0;
import o.pt4;
import o.qf0;
import o.qt4;
import o.ri0;
import o.u14;
import o.ua5;
import o.uc1;
import o.vf0;
import o.z83;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 A2\u00020\u0001:\u0001ABS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0019\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0014\"\u0006\b\u0001\u0010\u0015\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00110\u0017H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0017¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00100\u001a\u0004\b1\u00102\"\u0004\b!\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u0010<¨\u0006B"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/infrastructure/ApiClient;", "", "", "baseUrl", "Lo/b75;", "okHttpClientBuilder", "Lo/mt4;", "serializerBuilder", "Lo/pi0;", "callFactory", "", "Lo/ri0;", "callAdapterFactories", "Lo/uc1;", "converterFactories", "<init>", "(Ljava/lang/String;Lo/b75;Lo/mt4;Lo/pi0;Ljava/util/List;Ljava/util/List;)V", "Lo/f88;", "normalizeBaseUrl", "()V", "T", "U", "", "Lkotlin/Function1;", "callback", "runOnFirst", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)V", "authName", "Lo/nl3;", "authorization", "addAuthorization", "(Ljava/lang/String;Lo/nl3;)Lcom/teamviewer/apidefinitions/recentconnections/infrastructure/ApiClient;", "logger", "setLogger", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/apidefinitions/recentconnections/infrastructure/ApiClient;", "S", "Ljava/lang/Class;", "serviceClass", "createService", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/String;", "Lo/b75;", "Lo/mt4;", "Lo/pi0;", "Ljava/util/List;", "", "apiAuthorizations", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "getLogger", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "Lo/dd6;", "retrofitBuilder$delegate", "Lo/u14;", "getRetrofitBuilder", "()Lo/dd6;", "retrofitBuilder", "clientBuilder$delegate", "getClientBuilder", "()Lo/b75;", "clientBuilder", "defaultClientBuilder$delegate", "getDefaultClientBuilder", "defaultClientBuilder", "Companion", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApiClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String baseUrlKey = "com.teamviewer.apidefinitions.recentconnections.baseUrl";
    private static final u14 defaultBasePath$delegate = new kh7(new e5(21));
    private final Map<String, nl3> apiAuthorizations;
    private String baseUrl;
    private final List<ri0> callAdapterFactories;
    private final pi0 callFactory;

    /* JADX INFO: renamed from: clientBuilder$delegate, reason: from kotlin metadata */
    private final u14 clientBuilder;
    private final List<uc1> converterFactories;

    /* JADX INFO: renamed from: defaultClientBuilder$delegate, reason: from kotlin metadata */
    private final u14 defaultClientBuilder;
    private Function1 logger;
    private final b75 okHttpClientBuilder;

    /* JADX INFO: renamed from: retrofitBuilder$delegate, reason: from kotlin metadata */
    private final u14 retrofitBuilder;
    private final mt4 serializerBuilder;

    public ApiClient(String str, b75 b75Var, mt4 mt4Var, pi0 pi0Var, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? INSTANCE.getDefaultBasePath() : str;
        b75Var = (i & 2) != 0 ? null : b75Var;
        mt4Var = (i & 4) != 0 ? Serializer.getMoshiBuilder() : mt4Var;
        pi0Var = (i & 8) != 0 ? null : pi0Var;
        list = (i & 16) != 0 ? ea2.m : list;
        if ((i & 32) != 0) {
            vf0 vf0Var = new vf0((byte) 2);
            mt4Var.getClass();
            list2 = qf0.L(vf0Var, new qt4(new pt4(mt4Var)));
        }
        this(str, b75Var, mt4Var, pi0Var, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b75 clientBuilder_delegate$lambda$5(ApiClient apiClient) {
        b75 b75Var = apiClient.okHttpClientBuilder;
        return b75Var == null ? apiClient.getDefaultClientBuilder() : b75Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String defaultBasePath_delegate$lambda$9() {
        return System.getProperties().getProperty(baseUrlKey, "https://teamviewer-internal-b1f1235a/api/recentconnections/v1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b75 defaultClientBuilder_delegate$lambda$8(ApiClient apiClient) {
        b75 b75VarA = new c75().a();
        b93 b93Var = new b93(new p7(apiClient, (byte) 29));
        b93Var.b = z83.p;
        b75VarA.c.add(b93Var);
        return b75VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultClientBuilder_delegate$lambda$8$lambda$6(ApiClient apiClient, String str) {
        str.getClass();
        Function1 function1 = apiClient.logger;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public static final String getBaseUrlKey() {
        return INSTANCE.getBaseUrlKey();
    }

    private final b75 getClientBuilder() {
        return (b75) this.clientBuilder.getValue();
    }

    public static final String getDefaultBasePath() {
        return INSTANCE.getDefaultBasePath();
    }

    private final b75 getDefaultClientBuilder() {
        return (b75) this.defaultClientBuilder.getValue();
    }

    private final dd6 getRetrofitBuilder() {
        Object value = this.retrofitBuilder.getValue();
        value.getClass();
        return (dd6) value;
    }

    private final void normalizeBaseUrl() {
        if (bc7.G(false, this.baseUrl, "/")) {
            return;
        }
        this.baseUrl = ua5.z(this.baseUrl, "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd6 retrofitBuilder_delegate$lambda$4(ApiClient apiClient) {
        dd6 dd6Var = new dd6();
        dd6Var.c(apiClient.baseUrl);
        Iterator<T> it = apiClient.callAdapterFactories.iterator();
        while (it.hasNext()) {
            dd6Var.a((ri0) it.next());
        }
        Iterator<T> it2 = apiClient.converterFactories.iterator();
        while (it2.hasNext()) {
            dd6Var.b((uc1) it2.next());
        }
        return dd6Var;
    }

    private final <T, U> void runOnFirst(Iterable<? extends T> iterable, Function1 function1) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            it.next();
            im3.d0();
            throw null;
        }
    }

    public final ApiClient addAuthorization(String authName, nl3 authorization) {
        authName.getClass();
        authorization.getClass();
        if (this.apiAuthorizations.containsKey(authName)) {
            hk0.o(fx3.g("auth name ", authName, " already in api authorizations"));
            return null;
        }
        this.apiAuthorizations.put(authName, authorization);
        b75 clientBuilder = getClientBuilder();
        clientBuilder.getClass();
        clientBuilder.c.add(authorization);
        return this;
    }

    public final <S> S createService(Class<S> serviceClass) {
        serviceClass.getClass();
        pi0 c75Var = this.callFactory;
        if (c75Var == null) {
            b75 clientBuilder = getClientBuilder();
            clientBuilder.getClass();
            c75Var = new c75(clientBuilder);
        }
        dd6 retrofitBuilder = getRetrofitBuilder();
        retrofitBuilder.getClass();
        retrofitBuilder.a = c75Var;
        return (S) retrofitBuilder.d().r(serviceClass);
    }

    public final Function1 getLogger() {
        return this.logger;
    }

    public final ApiClient setLogger(Function1 logger) {
        logger.getClass();
        this.logger = logger;
        return this;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0004X\u0085D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/infrastructure/ApiClient$Companion;", "", "<init>", "()V", "", "baseUrlKey", "Ljava/lang/String;", "getBaseUrlKey", "()Ljava/lang/String;", "getBaseUrlKey$annotations", "defaultBasePath$delegate", "Lo/u14;", "getDefaultBasePath", "getDefaultBasePath$annotations", "defaultBasePath", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getBaseUrlKey$annotations() {
        }

        public static /* synthetic */ void getDefaultBasePath$annotations() {
        }

        public final String getBaseUrlKey() {
            return ApiClient.baseUrlKey;
        }

        public final String getDefaultBasePath() {
            Object value = ApiClient.defaultBasePath$delegate.getValue();
            value.getClass();
            return (String) value;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: setLogger, reason: collision with other method in class */
    public final void m12setLogger(Function1 function1) {
        this.logger = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiClient(String str, b75 b75Var, mt4 mt4Var, pi0 pi0Var, List<? extends ri0> list, List<? extends uc1> list2) {
        str.getClass();
        mt4Var.getClass();
        list.getClass();
        list2.getClass();
        this.baseUrl = str;
        this.okHttpClientBuilder = b75Var;
        this.serializerBuilder = mt4Var;
        this.callFactory = pi0Var;
        this.callAdapterFactories = list;
        this.converterFactories = list2;
        this.apiAuthorizations = new LinkedHashMap();
        final byte b = 0;
        this.retrofitBuilder = new kh7(new Function0(this) { // from class: o.wq
            public final /* synthetic */ ApiClient n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                ApiClient apiClient = this.n;
                switch (b2) {
                    case 0:
                        return ApiClient.retrofitBuilder_delegate$lambda$4(apiClient);
                    case 1:
                        return ApiClient.clientBuilder_delegate$lambda$5(apiClient);
                    default:
                        return ApiClient.defaultClientBuilder_delegate$lambda$8(apiClient);
                }
            }
        });
        final byte b2 = 1;
        this.clientBuilder = new kh7(new Function0(this) { // from class: o.wq
            public final /* synthetic */ ApiClient n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                ApiClient apiClient = this.n;
                switch (b3) {
                    case 0:
                        return ApiClient.retrofitBuilder_delegate$lambda$4(apiClient);
                    case 1:
                        return ApiClient.clientBuilder_delegate$lambda$5(apiClient);
                    default:
                        return ApiClient.defaultClientBuilder_delegate$lambda$8(apiClient);
                }
            }
        });
        final byte b3 = 2;
        this.defaultClientBuilder = new kh7(new Function0(this) { // from class: o.wq
            public final /* synthetic */ ApiClient n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                ApiClient apiClient = this.n;
                switch (b4) {
                    case 0:
                        return ApiClient.retrofitBuilder_delegate$lambda$4(apiClient);
                    case 1:
                        return ApiClient.clientBuilder_delegate$lambda$5(apiClient);
                    default:
                        return ApiClient.defaultClientBuilder_delegate$lambda$8(apiClient);
                }
            }
        });
        normalizeBaseUrl();
    }

    public ApiClient() {
        this(null, null, null, null, null, null, 63, null);
    }
}
