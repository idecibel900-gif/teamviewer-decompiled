package io.sentry.android.replay;

import io.sentry.f6;
import io.sentry.g7;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f155o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, byte b) {
        super(0);
        this.n = b;
        this.f155o = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IOException {
        byte b = this.n;
        File file = null;
        k kVar = this.f155o;
        switch (b) {
            case 0:
                if (kVar.q() != null) {
                    file = new File(kVar.q(), ".ongoing_segment");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                }
                return file;
            default:
                g7 g7Var = kVar.m;
                io.sentry.protocol.w wVar = kVar.n;
                g7Var.getClass();
                wVar.getClass();
                String cacheDirPath = g7Var.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    g7Var.getLogger().g(f6.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = g7Var.getCacheDirPath();
                cacheDirPath2.getClass();
                File file2 = new File(cacheDirPath2, "replay_" + wVar);
                file2.mkdirs();
                return file2;
        }
    }
}
