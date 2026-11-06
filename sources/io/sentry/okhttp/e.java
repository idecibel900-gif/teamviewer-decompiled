package io.sentry.okhttp;

import io.sentry.v1;
import kotlin.jvm.functions.Function1;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f219o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(long j, byte b) {
        super(1);
        this.n = b;
        this.f219o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        long j = this.f219o;
        switch (b) {
            case 0:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                if (j > 0) {
                    v1Var.m(Long.valueOf(j), "http.request_content_length");
                }
                break;
            default:
                v1 v1Var2 = (v1) obj;
                v1Var2.getClass();
                if (j > 0) {
                    v1Var2.m(Long.valueOf(j), "http.response_content_length");
                }
                break;
        }
        return f88Var;
    }
}
