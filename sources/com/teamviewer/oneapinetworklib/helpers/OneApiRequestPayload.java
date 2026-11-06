package com.teamviewer.oneapinetworklib.helpers;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/oneapinetworklib/helpers/OneApiRequestPayload;", "", "httpMethod", "", "url", "headers", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getHttpMethod", "()Ljava/lang/String;", "getUrl", "getHeaders", "()Ljava/util/Map;", "getData", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "OneAPINetworkLib", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneApiRequestPayload {
    private final String data;
    private final Map<String, String> headers;
    private final String httpMethod;
    private final String url;

    public OneApiRequestPayload(String str, String str2, Map<String, String> map, String str3) {
        str.getClass();
        str2.getClass();
        this.httpMethod = str;
        this.url = str2;
        this.headers = map;
        this.data = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneApiRequestPayload copy$default(OneApiRequestPayload oneApiRequestPayload, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneApiRequestPayload.httpMethod;
        }
        if ((i & 2) != 0) {
            str2 = oneApiRequestPayload.url;
        }
        if ((i & 4) != 0) {
            map = oneApiRequestPayload.headers;
        }
        if ((i & 8) != 0) {
            str3 = oneApiRequestPayload.data;
        }
        return oneApiRequestPayload.copy(str, str2, map, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final OneApiRequestPayload copy(String httpMethod, String url, Map<String, String> headers, String data) {
        httpMethod.getClass();
        url.getClass();
        return new OneApiRequestPayload(httpMethod, url, headers, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneApiRequestPayload)) {
            return false;
        }
        OneApiRequestPayload oneApiRequestPayload = (OneApiRequestPayload) other;
        return im3.n(this.httpMethod, oneApiRequestPayload.httpMethod) && im3.n(this.url, oneApiRequestPayload.url) && im3.n(this.headers, oneApiRequestPayload.headers) && im3.n(this.data, oneApiRequestPayload.data);
    }

    public final String getData() {
        return this.data;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getHttpMethod() {
        return this.httpMethod;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iE = to7.e(this.httpMethod.hashCode() * 31, 31, this.url);
        Map<String, String> map = this.headers;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.data;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.httpMethod;
        String str2 = this.url;
        Map<String, String> map = this.headers;
        String str3 = this.data;
        StringBuilder sbO = e41.o("OneApiRequestPayload(httpMethod=", str, ", url=", str2, ", headers=");
        sbO.append(map);
        sbO.append(", data=");
        sbO.append(str3);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ OneApiRequestPayload(String str, String str2, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str3);
    }
}
