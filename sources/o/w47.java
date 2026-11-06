package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w47 implements Set, fv3 {
    public final l57 m;
    public final /* synthetic */ byte n;

    public w47(l57 l57Var, byte b) {
        this.n = b;
        this.m = l57Var;
    }

    private final boolean a(Collection collection) {
        zj5 zj5Var;
        int i;
        n47 n47VarH;
        boolean zA;
        Set setT0 = lv0.T0(collection);
        l57 l57Var = this.m;
        boolean z = false;
        do {
            synchronized (j51.x) {
                k57 k57Var = (k57) v47.f(l57Var.m);
                zj5Var = k57Var.c;
                i = k57Var.d;
            }
            zj5Var.getClass();
            bk5 bk5VarB = zj5Var.b();
            Iterator it = l57Var.n.iterator();
            while (((q97) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((q97) it).next();
                if (!setT0.contains(entry.getKey())) {
                    bk5VarB.remove(entry.getKey());
                    z = true;
                }
            }
            zj5 zj5VarF = bk5VarB.f();
            if (im3.n(zj5VarF, zj5Var)) {
                break;
            }
            k57 k57Var2 = l57Var.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                zA = l57.a((k57) v47.w(k57Var2, l57Var, n47VarH), i, zj5VarF);
            }
            v47.l(n47VarH, l57Var);
        } while (!zA);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.n) {
            case 0:
                j51.X();
                throw null;
            case 1:
                j51.X();
                throw null;
            default:
                j51.X();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.n) {
            case 0:
                j51.X();
                throw null;
            case 1:
                j51.X();
                throw null;
            default:
                j51.X();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.m.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.n;
        l57 l57Var = this.m;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof su3) && !(obj instanceof uu3))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return im3.n(l57Var.get(entry.getKey()), entry.getValue());
            case 1:
                return l57Var.containsKey(obj);
            default:
                return l57Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.n;
        l57 l57Var = this.m;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!l57Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!l57Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.n;
        l57 l57Var = this.m;
        switch (b) {
            case 0:
                return new q97(l57Var, ((ef3) l57Var.b().c.entrySet()).iterator(), (byte) 0);
            case 1:
                return new q97(l57Var, ((ef3) l57Var.b().c.entrySet()).iterator(), (byte) 1);
            default:
                return new q97(l57Var, ((ef3) l57Var.b().c.entrySet()).iterator(), (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.n
            r1 = 0
            r2 = 1
            o.l57 r5 = r5.m
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            o.w47 r0 = r5.n
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            o.q97 r3 = (o.q97) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            o.q97 r3 = (o.q97) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = o.im3.n(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof o.su3
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof o.uu3
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w47.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        zj5 zj5Var;
        int i;
        n47 n47VarH;
        boolean zA;
        boolean z = false;
        switch (this.n) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.m.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.m.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setT0 = lv0.T0(collection);
                l57 l57Var = this.m;
                do {
                    synchronized (j51.x) {
                        k57 k57Var = (k57) v47.f(l57Var.m);
                        zj5Var = k57Var.c;
                        i = k57Var.d;
                    }
                    zj5Var.getClass();
                    bk5 bk5VarB = zj5Var.b();
                    Iterator it3 = l57Var.n.iterator();
                    while (((q97) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((q97) it3).next();
                        if (setT0.contains(entry.getValue())) {
                            bk5VarB.remove(entry.getKey());
                            z = true;
                        }
                    }
                    zj5 zj5VarF = bk5VarB.f();
                    if (!im3.n(zj5VarF, zj5Var)) {
                        k57 k57Var2 = l57Var.m;
                        synchronized (v47.c) {
                            n47VarH = v47.h();
                            zA = l57.a((k57) v47.w(k57Var2, l57Var, n47VarH), i, zj5VarF);
                        }
                        v47.l(n47VarH, l57Var);
                    }
                    return z;
                } while (!zA);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        zj5 zj5Var;
        int i;
        n47 n47VarH;
        boolean zA;
        zj5 zj5Var2;
        int i2;
        n47 n47VarH2;
        boolean zA2;
        boolean z = false;
        switch (this.n) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iQ = xm4.Q(mv0.Z(collection2, 10));
                if (iQ < 16) {
                    iQ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                l57 l57Var = this.m;
                do {
                    synchronized (j51.x) {
                        k57 k57Var = (k57) v47.f(l57Var.m);
                        zj5Var = k57Var.c;
                        i = k57Var.d;
                    }
                    zj5Var.getClass();
                    bk5 bk5VarB = zj5Var.b();
                    Iterator it = l57Var.n.iterator();
                    while (((q97) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((q97) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !im3.n(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            bk5VarB.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    zj5 zj5VarF = bk5VarB.f();
                    if (!im3.n(zj5VarF, zj5Var)) {
                        k57 k57Var2 = l57Var.m;
                        synchronized (v47.c) {
                            n47VarH = v47.h();
                            zA = l57.a((k57) v47.w(k57Var2, l57Var, n47VarH), i, zj5VarF);
                        }
                        v47.l(n47VarH, l57Var);
                    }
                    return z;
                } while (!zA);
                return z;
            case 1:
                return a(collection);
            default:
                Set setT0 = lv0.T0(collection);
                l57 l57Var2 = this.m;
                do {
                    synchronized (j51.x) {
                        k57 k57Var3 = (k57) v47.f(l57Var2.m);
                        zj5Var2 = k57Var3.c;
                        i2 = k57Var3.d;
                    }
                    zj5Var2.getClass();
                    bk5 bk5VarB2 = zj5Var2.b();
                    Iterator it2 = l57Var2.n.iterator();
                    while (((q97) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((q97) it2).next();
                        if (!setT0.contains(entry3.getValue())) {
                            bk5VarB2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    zj5 zj5VarF2 = bk5VarB2.f();
                    if (!im3.n(zj5VarF2, zj5Var2)) {
                        k57 k57Var4 = l57Var2.m;
                        synchronized (v47.c) {
                            n47VarH2 = v47.h();
                            zA2 = l57.a((k57) v47.w(k57Var4, l57Var2, n47VarH2), i2, zj5VarF2);
                        }
                        v47.l(n47VarH2, l57Var2);
                    }
                    return z;
                } while (!zA2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.m.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return hm3.D(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hm3.E(this, objArr);
    }
}
