package io.sentry;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x2 implements j0 {
    public final g7 a;
    public final w5 b;
    public final w5 c;
    public volatile t0 d = null;

    public x2(g7 g7Var) {
        this.a = g7Var;
        m7 m7Var = new m7(g7Var, (byte) 0);
        this.c = new w5(m7Var);
        this.b = new w5(m7Var);
    }

    @Override // io.sentry.j0
    public final i7 a(i7 i7Var, p0 p0Var) {
        if (i7Var.t == null) {
            i7Var.t = "java";
        }
        if (f(i7Var, p0Var)) {
            e(i7Var);
            io.sentry.protocol.u uVar = this.a.getSessionReplay().l;
            if (uVar != null) {
                i7Var.f198o = uVar;
            }
        }
        return i7Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, p0 p0Var) {
        ArrayList arrayList;
        if (v5Var.t == null) {
            v5Var.t = "java";
        }
        Exception exc = v5Var.v;
        if (exc != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c.a(exc, atomicInteger, hashSet, arrayDeque, null);
            v5Var.h(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.f fVar = v5Var.z;
        g7 g7Var = this.a;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(fVar, g7Var);
        if (fVarA != null) {
            v5Var.z = fVarA;
        }
        Map mapA = g7Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = v5Var.K;
            if (abstractMap == null) {
                v5Var.K = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (f(v5Var, p0Var)) {
            e(v5Var);
            if (v5Var.e() == null) {
                ArrayList<io.sentry.protocol.v> arrayListD = v5Var.d();
                if (arrayListD == null || arrayListD.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.v vVar : arrayListD) {
                        if (vVar.r != null && vVar.p != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(vVar.p);
                        }
                    }
                }
                boolean zIsAttachThreads = g7Var.isAttachThreads();
                boolean zC = false;
                w5 w5Var = this.b;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(p0Var.b("sentry:typeCheckHint"))) {
                    Object objB = p0Var.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = g7Var.isAttachStacktrace();
                    if (objB instanceof io.sentry.hints.a) {
                        zC = ((io.sentry.hints.a) objB).c();
                        zIsAttachStacktrace = true;
                    }
                    v5Var.E = new p2(w5Var.b(Thread.getAllStackTraces(), arrayList, zC, zIsAttachStacktrace));
                } else if (g7Var.isAttachStacktrace() && ((arrayListD == null || arrayListD.isEmpty()) && !io.sentry.hints.d.class.isInstance(p0Var.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = g7Var.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    v5Var.E = new p2(w5Var.b(map, null, false, zIsAttachStacktrace2));
                    return v5Var;
                }
            }
        }
        return v5Var;
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, p0 p0Var) {
        if (f0Var.t == null) {
            f0Var.t = "java";
        }
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(f0Var.z, this.a);
        if (fVarA != null) {
            f0Var.z = fVarA;
        }
        if (f(f0Var, p0Var)) {
            e(f0Var);
        }
        return f0Var;
    }

    @Override // io.sentry.j0
    public final h6 d(h6 h6Var) {
        return h6Var;
    }

    public final void e(h5 h5Var) {
        if (h5Var.r == null) {
            h5Var.r = this.a.getRelease();
        }
        if (h5Var.s == null) {
            h5Var.s = this.a.getEnvironment();
        }
        if (h5Var.w == null) {
            h5Var.w = this.a.getServerName();
        }
        boolean zBooleanValue = true;
        if (this.a.isAttachServerName() && h5Var.w == null) {
            if (this.d == null) {
                this.d = t0.a();
            }
            if (this.d != null) {
                t0 t0Var = this.d;
                if (t0Var.c < System.currentTimeMillis() && t0Var.d.compareAndSet(false, true)) {
                    t0Var.b();
                }
                h5Var.w = t0Var.b;
            }
        }
        if (h5Var.x == null) {
            h5Var.x = this.a.getDist();
        }
        if (h5Var.f198o == null) {
            h5Var.f198o = this.a.getSdkVersion();
        }
        AbstractMap abstractMap = h5Var.q;
        g7 g7Var = this.a;
        if (abstractMap == null) {
            h5Var.c(g7Var.getTags());
        } else {
            for (Map.Entry<String, String> entry : g7Var.getTags().entrySet()) {
                if (!h5Var.q.containsKey(entry.getKey())) {
                    h5Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.i0 i0Var = h5Var.u;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            h5Var.u = i0Var;
        }
        if (i0Var.p == null) {
            s dataCollectionResolver = this.a.getDataCollectionResolver();
            g7 g7Var2 = dataCollectionResolver.a;
            Boolean bool = g7Var2.getDataCollection().a;
            boolean zIsSendDefaultPii = g7Var2.isSendDefaultPii();
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (!dataCollectionResolver.b()) {
                zBooleanValue = zIsSendDefaultPii;
            }
            if (zBooleanValue) {
                i0Var.p = "{{auto}}";
            }
        }
    }

    public final boolean f(h5 h5Var, p0 p0Var) {
        if (io.sentry.util.b.x(p0Var)) {
            return true;
        }
        this.a.getLogger().g(f6.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", h5Var.m);
        return false;
    }
}
