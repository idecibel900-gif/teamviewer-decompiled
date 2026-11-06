package io.sentry.android.core;

import io.sentry.a8;
import io.sentry.v5;
import io.sentry.w7;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements io.sentry.j0 {
    public final d a;
    public final SentryAndroidOptions b;
    public final io.sentry.util.a c = new io.sentry.util.a();

    public b2(SentryAndroidOptions sentryAndroidOptions, d dVar) {
        this.b = sentryAndroidOptions;
        this.a = dVar;
    }

    public static void e(io.sentry.android.core.performance.f fVar, io.sentry.android.core.performance.e eVar, io.sentry.protocol.f0 f0Var) {
        y7 y7Var;
        if (eVar != io.sentry.android.core.performance.e.COLD) {
            return;
        }
        io.sentry.protocol.e eVar2 = f0Var.n;
        ArrayList arrayList = f0Var.E;
        w7 w7VarJ = eVar2.j();
        if (w7VarJ == null) {
            return;
        }
        io.sentry.protocol.w wVar = w7VarJ.m;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                y7Var = null;
                break;
            }
            io.sentry.protocol.z zVar = (io.sentry.protocol.z) it.next();
            if (zVar.r.contentEquals("app.start.cold")) {
                y7Var = zVar.p;
                break;
            }
        }
        if (y7Var == null && "app.start".equals(w7VarJ.q)) {
            y7Var = w7VarJ.n;
        }
        boolean zEquals = "app.start".equals(w7VarJ.q);
        io.sentry.android.core.performance.g gVar = new io.sentry.android.core.performance.g();
        io.sentry.android.core.performance.g gVar2 = fVar.p;
        long j = gVar2.n;
        long j2 = gVar2.f123o;
        long j3 = io.sentry.android.core.performance.f.K;
        gVar.m = "Process Initialization";
        gVar.n = j;
        gVar.f123o = j2;
        gVar.p = j3;
        if (gVar.d() && Math.abs(gVar.a()) <= 10000) {
            arrayList.add(i(gVar, y7Var, wVar, "process.load", zEquals));
        }
        ArrayList arrayList2 = new ArrayList(fVar.s.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(i((io.sentry.android.core.performance.g) it2.next(), y7Var, wVar, "contentprovider.load", zEquals));
            }
        }
        io.sentry.android.core.performance.g gVar3 = fVar.r;
        if (gVar3.e()) {
            arrayList.add(i(gVar3, y7Var, wVar, "application.load", zEquals));
        }
    }

    public static boolean f(io.sentry.protocol.f0 f0Var) {
        for (io.sentry.protocol.z zVar : f0Var.E) {
            if (zVar.r.contentEquals("app.start.cold") || zVar.r.contentEquals("app.start.warm")) {
                return true;
            }
        }
        w7 w7VarJ = f0Var.n.j();
        return w7VarJ != null && w7VarJ.q.equals("app.start");
    }

    public static void g(io.sentry.protocol.f0 f0Var, String str) {
        w7 w7VarJ = f0Var.n.j();
        if (w7VarJ == null) {
            return;
        }
        w7VarJ.v.put("app.vitals.start.type", str);
        Object obj = w7VarJ.v.get("app.vitals.start.screen");
        for (io.sentry.protocol.z zVar : f0Var.E) {
            Map concurrentHashMap = zVar.w;
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                zVar.w = concurrentHashMap;
            }
            concurrentHashMap.put("app.vitals.start.type", str);
            if (obj != null) {
                concurrentHashMap.put("app.vitals.start.screen", obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    public static void h(io.sentry.protocol.f0 f0Var) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.z> arrayList = f0Var.E;
        io.sentry.protocol.z zVar = null;
        io.sentry.protocol.z zVar2 = null;
        for (io.sentry.protocol.z zVar3 : arrayList) {
            if ("ui.load.initial_display".equals(zVar3.r)) {
                zVar = zVar3;
            } else if ("ui.load.full_display".equals(zVar3.r)) {
                zVar2 = zVar3;
            }
            if (zVar != null && zVar2 != null) {
                break;
            }
        }
        if (zVar == null && zVar2 == null) {
            return;
        }
        for (io.sentry.protocol.z zVar4 : arrayList) {
            if (zVar4 != zVar && zVar4 != zVar2) {
                Map map = zVar4.w;
                Double d3 = zVar4.m;
                boolean z2 = false;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (zVar != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < zVar.m.doubleValue() || (((d2 = zVar.n) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (zVar2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 >= zVar2.m.doubleValue() && ((d = zVar2.n) == null || dDoubleValue2 <= d.doubleValue())) {
                        z2 = true;
                    }
                }
                if (z || z2) {
                    Map concurrentHashMap = zVar4.w;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        zVar4.w = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    public static io.sentry.protocol.z i(io.sentry.android.core.performance.g gVar, y7 y7Var, io.sentry.protocol.w wVar, String str, boolean z) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.g.b));
        map.put("thread.name", "main");
        if (!z) {
            Boolean bool = Boolean.TRUE;
            map.put("ui.contributes_to_ttid", bool);
            map.put("ui.contributes_to_ttfd", bool);
        }
        Double dValueOf = Double.valueOf(gVar.n / 1000.0d);
        if (gVar.d()) {
            jA = gVar.a() + gVar.n;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.z(dValueOf, Double.valueOf(jA / 1000.0d), wVar, new y7(), y7Var, str, gVar.m, a8.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, io.sentry.p0 p0Var) {
        return v5Var;
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.p0 p0Var) {
        Map map;
        io.sentry.android.core.performance.g gVarB;
        io.sentry.util.a aVar = this.c;
        aVar.e();
        try {
            if (!this.b.isTracingEnabled()) {
                aVar.close();
                return f0Var;
            }
            io.sentry.android.core.performance.f fVarC = io.sentry.android.core.performance.f.c();
            io.sentry.android.core.performance.e eVar = fVarC.m;
            if (f(f0Var)) {
                w7 w7VarJ = f0Var.n.j();
                boolean z = true;
                boolean z2 = w7VarJ != null && "app.start".equals(w7VarJ.q);
                boolean z3 = (w7VarJ == null || !z2 || w7VarJ.v.containsKey("app.vitals.start.screen")) ? false : true;
                if (fVarC.y && (z3 || Boolean.TRUE.equals(fVarC.n))) {
                    if (z3) {
                        gVarB = fVarC.p;
                        if (!gVarB.d() || !gVarB.e()) {
                            gVarB = fVarC.q;
                        }
                    } else {
                        gVarB = fVarC.b(this.b);
                    }
                    long jA = gVarB.a();
                    io.sentry.util.a aVar2 = (io.sentry.util.a) fVarC.J.n;
                    aVar2.e();
                    aVar2.close();
                    if (jA == 0) {
                        z = false;
                    }
                    if (z) {
                        if (z) {
                            f0Var.F.put(eVar == io.sentry.android.core.performance.e.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.n((Number) Float.valueOf(jA), io.sentry.y2.MILLISECOND.apiName()));
                        }
                        e(fVarC, eVar, f0Var);
                        fVarC.y = false;
                        fVarC.s.clear();
                        fVarC.t.clear();
                        io.sentry.util.a aVar3 = (io.sentry.util.a) fVarC.J.n;
                        aVar3.e();
                        aVar3.close();
                    }
                }
                io.sentry.protocol.a aVarE = f0Var.n.e();
                if (aVarE == null) {
                    aVarE = new io.sentry.protocol.a();
                    f0Var.n.o(aVarE);
                }
                String str = eVar == io.sentry.android.core.performance.e.COLD ? "cold" : "warm";
                aVarE.v = str;
                if (z2) {
                    g(f0Var, str);
                }
            }
            h(f0Var);
            io.sentry.protocol.w wVar = f0Var.m;
            w7 w7VarJ2 = f0Var.n.j();
            if (wVar != null && w7VarJ2 != null && w7VarJ2.q.contentEquals("ui.load")) {
                d dVar = this.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) dVar.p;
                io.sentry.util.a aVar4 = (io.sentry.util.a) dVar.s;
                aVar4.e();
                try {
                    if (dVar.j()) {
                        map = (Map) concurrentHashMap.get(wVar);
                        concurrentHashMap.remove(wVar);
                        aVar4.close();
                    } else {
                        aVar4.close();
                        map = null;
                    }
                    if (map != null) {
                        f0Var.F.putAll(map);
                    }
                } catch (Throwable th) {
                    try {
                        aVar4.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            aVar.close();
            return f0Var;
        } catch (Throwable th3) {
            try {
                aVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
