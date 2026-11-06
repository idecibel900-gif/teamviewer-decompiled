package io.sentry.okhttp;

import io.sentry.a8;
import io.sentry.v1;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ IOException f217o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IOException iOException, byte b) {
        super(1);
        this.n = b;
        this.f217o = iOException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        IOException iOException = this.f217o;
        switch (b) {
            case 0:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                v1Var.a(a8.INTERNAL_ERROR);
                v1Var.g(iOException);
                break;
            case 1:
                v1 v1Var2 = (v1) obj;
                v1Var2.getClass();
                if (!v1Var2.d()) {
                    v1Var2.a(a8.INTERNAL_ERROR);
                    v1Var2.g(iOException);
                }
                break;
            default:
                v1 v1Var3 = (v1) obj;
                v1Var3.getClass();
                if (!v1Var3.d()) {
                    v1Var3.a(a8.INTERNAL_ERROR);
                    v1Var3.g(iOException);
                }
                break;
        }
        return f88Var;
    }
}
