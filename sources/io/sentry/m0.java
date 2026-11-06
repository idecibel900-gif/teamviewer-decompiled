package io.sentry;

import java.util.HashMap;
import java.util.Iterator;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements e1, io.sentry.logger.a {
    public final v4 m;

    public /* synthetic */ m0(v4 v4Var) {
        this.m = v4Var;
    }

    public HashMap a(e eVar, String str, Object... objArr) {
        HashMap map = new HashMap();
        v4 v4Var = this.m;
        Iterator it = v4Var.f.getAttributes().values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            h2.f();
            return null;
        }
        String str2 = eVar.a;
        if (!"manual".equalsIgnoreCase(str2)) {
            map.put("sentry.origin", new io.sentry.protocol.n(f5.STRING, (Object) str2));
        }
        int i = 0;
        for (Object obj : objArr) {
            map.put(fx3.e(i, "sentry.message.parameter."), new io.sentry.protocol.n(f5.inferFrom(obj), obj));
            i++;
        }
        if (i > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new io.sentry.protocol.n(f5.STRING, (Object) str));
        }
        io.sentry.protocol.u sdkVersion = v4Var.l().getSdkVersion();
        if (sdkVersion != null) {
            f5 f5Var = f5.STRING;
            map.put("sentry.sdk.name", new io.sentry.protocol.n(f5Var, (Object) sdkVersion.m));
            map.put("sentry.sdk.version", new io.sentry.protocol.n(sdkVersion.n, f5Var.apiName()));
        }
        String environment = v4Var.l().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new io.sentry.protocol.n(f5.STRING, (Object) environment));
        }
        io.sentry.protocol.w wVarJ = v4Var.f.j();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (wVar.equals(wVarJ)) {
            io.sentry.protocol.w wVarJ2 = v4Var.l().getReplayController().j();
            if (!wVar.equals(wVarJ2)) {
                map.put("sentry.replay_id", new io.sentry.protocol.n(f5.STRING, (Object) wVarJ2.a()));
                map.put("sentry._internal.replay_is_buffering", new io.sentry.protocol.n(f5.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new io.sentry.protocol.n(f5.STRING, (Object) wVarJ.a()));
        }
        String release = v4Var.l().getRelease();
        if (release != null) {
            map.put("sentry.release", new io.sentry.protocol.n(f5.STRING, (Object) release));
        }
        if (!io.sentry.util.l.a) {
            g7 g7VarL = v4Var.l();
            String serverName = g7VarL.getServerName();
            if (serverName != null) {
                map.put("server.address", new io.sentry.protocol.n(f5.STRING, (Object) serverName));
            } else if (g7VarL.isAttachServerName()) {
                t0 t0VarA = t0.a();
                if (t0VarA.c < System.currentTimeMillis() && t0VarA.d.compareAndSet(false, true)) {
                    t0VarA.b();
                }
                String str3 = t0VarA.b;
                if (str3 != null) {
                    map.put("server.address", new io.sentry.protocol.n(f5.STRING, (Object) str3));
                }
            }
        }
        io.sentry.protocol.i0 i0VarL = v4Var.f.L();
        if (i0VarL == null) {
            String distinctId = v4Var.l().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new io.sentry.protocol.n(f5.STRING, (Object) distinctId));
                return map;
            }
        } else {
            String str4 = i0VarL.n;
            if (str4 != null) {
                map.put("user.id", new io.sentry.protocol.n(f5.STRING, (Object) str4));
            }
            String str5 = i0VarL.f232o;
            if (str5 != null) {
                map.put("user.name", new io.sentry.protocol.n(f5.STRING, (Object) str5));
            }
            String str6 = i0VarL.m;
            if (str6 != null) {
                map.put("user.email", new io.sentry.protocol.n(f5.STRING, (Object) str6));
            }
        }
        return map;
    }

    @Override // io.sentry.logger.a
    public void e(j6 j6Var, e eVar, String str, Object... objArr) {
        String str2;
        v4 v4Var = this.m;
        g7 g7VarL = v4Var.l();
        l1 l1Var = v4Var.f;
        try {
            if (!v4Var.isEnabled()) {
                g7VarL.getLogger().g(f6.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!g7VarL.getLogs().a) {
                g7VarL.getLogger().g(f6.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            l5 l5VarA = g7VarL.getDateProvider().a();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th) {
                    v4Var.l().getLogger().d(f6.ERROR, "Error while running log through String.format", th);
                    str2 = str;
                }
            }
            h4 h4VarV = l1Var.v();
            v1 v1VarG = l1Var.g();
            if (v1VarG == null) {
                l1Var.F(new q7(l1Var, g7VarL));
            }
            io.sentry.protocol.w wVar = v1VarG == null ? (io.sentry.protocol.w) h4VarV.b : v1VarG.v().m;
            y7 y7Var = v1VarG == null ? (y7) h4VarV.c : v1VarG.v().n;
            h6 h6Var = new h6(wVar, Double.valueOf(l5VarA.d() / 1.0E9d), str2, j6Var);
            h6Var.n = y7Var;
            h6Var.s = a(eVar, str, objArr);
            h6Var.r = Integer.valueOf(j6Var.getSeverityNumber());
            l1Var.y().i(h6Var, l1Var);
        } catch (Throwable th2) {
            g7VarL.getLogger().d(f6.ERROR, "Error while capturing log event", th2);
        }
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.w f(io.sentry.protocol.k kVar, p0 p0Var) {
        v4 v4Var = this.m;
        l1 l1Var = v4Var.f;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
        if (!v4Var.isEnabled()) {
            v4Var.l().getLogger().g(f6.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (kVar.m.isEmpty()) {
            v4Var.l().getLogger().g(f6.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return wVar;
        }
        try {
            return l1Var.y().f(kVar, p0Var, l1Var);
        } catch (Throwable th) {
            v4Var.l().getLogger().d(f6.ERROR, "Error while capturing feedback: " + kVar.m, th);
            return wVar;
        }
    }
}
