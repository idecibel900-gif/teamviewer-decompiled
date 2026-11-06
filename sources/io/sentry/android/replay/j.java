package io.sentry.android.replay;

import io.sentry.f6;
import io.sentry.g7;
import io.sentry.i7;
import java.io.File;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import o.g76;
import o.k76;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f156o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Serializable q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(long j, Object obj, Serializable serializable, byte b) {
        super(1);
        this.n = b;
        this.f156o = j;
        this.p = obj;
        this.q = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        Serializable serializable = this.q;
        long j = this.f156o;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                if (lVar.b < j) {
                    ((k) obj2).j(lVar.a);
                    return Boolean.TRUE;
                }
                k76 k76Var = (k76) serializable;
                if (k76Var.m == null) {
                    k76Var.m = lVar.c;
                }
                return Boolean.FALSE;
            default:
                io.sentry.android.replay.capture.k kVar = (io.sentry.android.replay.capture.k) obj;
                io.sentry.android.replay.capture.h hVar = (io.sentry.android.replay.capture.h) obj2;
                kVar.getClass();
                i7 i7Var = kVar.a;
                if (i7Var.G.getTime() >= j) {
                    return Boolean.FALSE;
                }
                hVar.k(hVar.e() - 1);
                File file = i7Var.B;
                g7 g7Var = hVar.v;
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            g7Var.getLogger().g(f6.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    } catch (Throwable th) {
                        g7Var.getLogger().b(f6.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                    }
                    break;
                }
                ((g76) serializable).m = true;
                return Boolean.TRUE;
        }
    }
}
