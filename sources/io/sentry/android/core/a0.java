package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import io.sentry.f6;
import io.sentry.h4;
import io.sentry.v5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements io.sentry.transport.h, o0 {
    public final /* synthetic */ byte a;
    public final SentryAndroidOptions b;

    public /* synthetic */ a0(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.a = b;
        this.b = sentryAndroidOptions;
    }

    public static String f(int i) {
        if (i == 100) {
            return "foreground";
        }
        if (i == 125) {
            return "foreground_service";
        }
        if (i == 200) {
            return "visible";
        }
        if (i == 230) {
            return "perceptible";
        }
        if (i == 300) {
            return "service";
        }
        if (i == 325) {
            return "top_sleeping";
        }
        if (i == 350) {
            return "cant_save_state";
        }
        if (i != 400) {
            return i != 1000 ? "unknown" : "gone";
        }
        return "cached";
    }

    @Override // io.sentry.android.core.o0
    public void E(long j) {
        byte b = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (b) {
            case 1:
                io.sentry.android.core.cache.b.l(sentryAndroidOptions, Long.valueOf(j), "last_anr_report", "ANR");
                break;
            default:
                io.sentry.android.core.cache.b.l(sentryAndroidOptions, Long.valueOf(j), "last_memory_limiter_report", "MemoryLimiter");
                break;
        }
    }

    @Override // io.sentry.android.core.o0
    public boolean a(ApplicationExitInfo applicationExitInfo) {
        String description;
        switch (this.a) {
            case 1:
                return applicationExitInfo.getReason() == 6;
            default:
                return applicationExitInfo.getReason() == 13 && (description = applicationExitInfo.getDescription()) != null && description.contains("MemoryLimiter:");
        }
    }

    @Override // io.sentry.android.core.o0
    public Long b() {
        switch (this.a) {
            case 1:
                return io.sentry.android.core.cache.b.k(this.b, "last_anr_report", "ANR");
            default:
                return io.sentry.android.core.cache.b.k(this.b, "last_memory_limiter_report", "MemoryLimiter");
        }
    }

    @Override // io.sentry.android.core.o0
    public String c() {
        switch (this.a) {
            case 1:
                return "ANR";
            default:
                return "MemoryLimiter process death";
        }
    }

    @Override // io.sentry.android.core.o0
    public boolean d() {
        switch (this.a) {
            case 1:
                return this.b.isReportHistoricalAnrs();
            default:
                return this.b.isReportHistoricalMemoryLimiterExits();
        }
    }

    @Override // io.sentry.transport.h
    public boolean e() {
        int i = z.a[this.b.getConnectionStatusProvider().g0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.android.core.o0
    public io.sentry.o i(ApplicationExitInfo applicationExitInfo, boolean z) {
        h4 h4Var;
        byte[] bArr;
        String str;
        byte b = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (b) {
            case 1:
                long timestamp = applicationExitInfo.getTimestamp();
                boolean z2 = applicationExitInfo.getImportance() != 100;
                try {
                    InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                    try {
                        if (traceInputStream == 0) {
                            h4Var = new h4(e0.NO_DUMP);
                            if (traceInputStream != 0) {
                                traceInputStream = traceInputStream;
                                traceInputStream.close();
                                traceInputStream = traceInputStream;
                            }
                        } else {
                            byte[] bArrC = io.sentry.config.a.C(traceInputStream);
                            traceInputStream.close();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrC)));
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line != null) {
                                            io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                            aVar.a = line;
                                            arrayList.add(aVar);
                                        } else {
                                            io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(arrayList);
                                            io.sentry.android.core.internal.threaddump.c cVar = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2);
                                            cVar.d(bVar);
                                            ArrayList arrayList2 = cVar.f;
                                            ArrayList arrayList3 = new ArrayList(cVar.e.values());
                                            io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) cVar.g.n;
                                            if (arrayList2.isEmpty()) {
                                                h4Var = new h4(e0.NO_DUMP);
                                                bufferedReader.close();
                                                traceInputStream = bufferedReader;
                                            } else {
                                                h4 h4Var2 = new h4(e0.DUMP, bArrC, arrayList2, arrayList3, cVar2);
                                                bufferedReader.close();
                                                h4Var = h4Var2;
                                                traceInputStream = bufferedReader;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to parse ANR thread dump", th3);
                                e0 e0Var = e0.ERROR;
                                h4Var = new h4(e0Var, bArrC);
                                traceInputStream = e0Var;
                            }
                        }
                        traceInputStream = traceInputStream;
                        break;
                    } catch (Throwable th4) {
                        if (traceInputStream == 0) {
                            throw th4;
                        }
                        try {
                            traceInputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    sentryAndroidOptions.getLogger().d(f6.WARNING, "Failed to read ANR thread dump", th6);
                    h4Var = new h4(e0.NO_DUMP);
                }
                e0 e0Var2 = (e0) h4Var.b;
                if (e0Var2 == e0.NO_DUMP) {
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                    return null;
                }
                c0 c0Var = new c0(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
                io.sentry.p0 p0VarG = io.sentry.util.b.g(c0Var);
                v5 v5Var = new v5();
                if (e0Var2 == e0.ERROR) {
                    io.sentry.protocol.p pVar = new io.sentry.protocol.p();
                    pVar.m = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                    v5Var.C = pVar;
                } else if (e0Var2 == e0.DUMP) {
                    v5Var.E = new io.sentry.p2((ArrayList) h4Var.d);
                    ArrayList arrayList4 = (ArrayList) h4Var.a;
                    if (arrayList4 != null) {
                        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                        fVar.b(arrayList4);
                        v5Var.z = fVar;
                    }
                    io.sentry.protocol.c cVar3 = (io.sentry.protocol.c) h4Var.e;
                    if (cVar3 != null) {
                        v5Var.n.l(cVar3, "art");
                    }
                }
                v5Var.G = f6.FATAL;
                v5Var.B = new Date(timestamp);
                if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) h4Var.c) != null) {
                    p0VarG.f = new io.sentry.a(bArr, "thread-dump.txt", "text/plain");
                }
                return new io.sentry.o(v5Var, p0VarG, c0Var, (byte) 3);
            default:
                long timestamp2 = applicationExitInfo.getTimestamp();
                k1 k1Var = new k1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp2, z);
                io.sentry.p0 p0VarG2 = io.sentry.util.b.g(k1Var);
                int importance = applicationExitInfo.getImportance();
                if (importance == 100) {
                    str = "visible";
                } else if (importance == 125) {
                    str = "not_visible";
                } else if (importance == 200) {
                    str = "visible";
                } else if (importance == 230 || importance == 300) {
                    str = "not_visible";
                } else if (importance == 325) {
                    str = "visible";
                } else if (importance == 350 || importance == 1000) {
                    str = "not_visible";
                } else {
                    str = "cached";
                }
                io.sentry.protocol.p pVar2 = new io.sentry.protocol.p();
                String str2 = "Android process killed by MemoryLimiter (importance: " + f(importance) + ")";
                pVar2.m = str2;
                v5 v5Var2 = new v5();
                v5Var2.G = f6.FATAL;
                v5Var2.t = "java";
                v5Var2.B = new Date(timestamp2);
                v5Var2.C = pVar2;
                io.sentry.protocol.o oVar = new io.sentry.protocol.o();
                oVar.m = z ? "AppExitInfo" : "HistoricalAppExitInfo";
                oVar.n = applicationExitInfo.getDescription();
                oVar.p = Boolean.FALSE;
                oVar.s = Boolean.TRUE;
                HashMap map = new HashMap();
                map.put("process_importance", importance + " (" + f(importance) + ")");
                map.put("memory_limit_class", str);
                oVar.r = new HashMap(map);
                io.sentry.protocol.v vVar = new io.sentry.protocol.v();
                vVar.m = "MemoryLimitExceeded";
                vVar.n = str2;
                vVar.f249o = "io.sentry.android.core";
                vVar.r = oVar;
                v5Var2.h(Collections.singletonList(vVar));
                v5Var2.i(Arrays.asList("memory-limiter", "process_importance:" + importance));
                return new io.sentry.o(v5Var2, p0VarG2, k1Var, (byte) 3);
        }
    }
}
