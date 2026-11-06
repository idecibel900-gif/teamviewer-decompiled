package io.sentry.util.network;

import io.sentry.o;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public Integer b;
    public Long c;
    public Long d;
    public o e;
    public o f;

    public f(String str) {
        this.a = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.a + "', statusCode=" + this.b + ", requestBodySize=" + this.c + ", responseBodySize=" + this.d + ", request=" + this.e + ", response=" + this.f + '}';
    }
}
