package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zr0 implements mi1 {
    public final a86 a;
    public final Function1 b;
    public final t c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public zr0(a86 a86Var, Function1 function1) {
        a86Var.getClass();
        this.a = a86Var;
        this.b = function1;
        t tVar = new t(this, (byte) 13);
        this.c = tVar;
        fl2 fl2Var = new fl2(new fx(a86Var.d(), (byte) 1), true, tVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        el2 el2Var = new el2(fl2Var);
        while (el2Var.hasNext()) {
            Object next = el2Var.next();
            sy4 sy4VarC = ((j86) next).c();
            Object arrayList = linkedHashMap.get(sy4VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(sy4VarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        fl2 fl2Var2 = new fl2(new fx(this.a.b(), (byte) 1), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        el2 el2Var2 = new el2(fl2Var2);
        while (el2Var2.hasNext()) {
            Object next2 = el2Var2.next();
            linkedHashMap2.put(((g86) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.a.f();
        Function1 function2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) function2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iQ = xm4.Q(mv0.Z(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((m86) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // o.mi1
    public final Set a() {
        fl2 fl2Var = new fl2(new fx(this.a.d(), (byte) 1), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        el2 el2Var = new el2(fl2Var);
        while (el2Var.hasNext()) {
            linkedHashSet.add(((j86) el2Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // o.mi1
    public final g86 b(sy4 sy4Var) {
        return (g86) this.e.get(sy4Var);
    }

    @Override // o.mi1
    public final Collection c(sy4 sy4Var) {
        List list = (List) this.d.get(sy4Var);
        return list != null ? list : ea2.m;
    }

    @Override // o.mi1
    public final Set d() {
        return this.f.keySet();
    }

    @Override // o.mi1
    public final Set e() {
        fl2 fl2Var = new fl2(new fx(this.a.b(), (byte) 1), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        el2 el2Var = new el2(fl2Var);
        while (el2Var.hasNext()) {
            linkedHashSet.add(((g86) el2Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // o.mi1
    public final m86 f(sy4 sy4Var) {
        sy4Var.getClass();
        return (m86) this.f.get(sy4Var);
    }
}
