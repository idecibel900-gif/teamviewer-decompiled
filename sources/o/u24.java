package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class u24 extends v24 {
    public static final /* synthetic */ int p = 0;
    public final a86 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b24 f2159o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u24(yc4 yc4Var, a86 a86Var, b24 b24Var) {
        super(yc4Var, null);
        a86Var.getClass();
        this.n = a86Var;
        this.f2159o = b24Var;
    }

    public static bu5 v(bu5 bu5Var) {
        if (bu5Var.k() != 2) {
            return bu5Var;
        }
        Collection collectionJ = bu5Var.j();
        collectionJ.getClass();
        Collection<bu5> collection = collectionJ;
        ArrayList arrayList = new ArrayList(mv0.Z(collection, 10));
        for (bu5 bu5Var2 : collection) {
            bu5Var2.getClass();
            arrayList.add(v(bu5Var2));
        }
        return (bu5) lv0.F0(lv0.P0(lv0.S0(arrayList)));
    }

    @Override // o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return null;
    }

    @Override // o.s24
    public final Set i(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        Set setS0 = lv0.S0(((mi1) this.e.a()).a());
        b24 b24Var = this.f2159o;
        u24 u24VarU = r47.u(b24Var);
        Set setB = u24VarU != null ? u24VarU.b() : null;
        if (setB == null) {
            setB = la2.m;
        }
        setS0.addAll(setB);
        if (this.n.a.isEnum()) {
            setS0.addAll(qf0.L(t87.c, t87.a));
        }
        yc4 yc4Var = this.b;
        b24Var.getClass();
        yc4Var.getClass();
        setS0.addAll(new ArrayList());
        return setS0;
    }

    @Override // o.s24
    public final void j(ArrayList arrayList, sy4 sy4Var) {
        yc4 yc4Var = this.b;
        this.f2159o.getClass();
        yc4Var.getClass();
    }

    @Override // o.s24
    public final mi1 k() {
        return new zr0(this.n, e24.p);
    }

    @Override // o.s24
    public final void m(LinkedHashSet linkedHashSet, sy4 sy4Var) {
        b24 b24Var = this.f2159o;
        u24 u24VarU = r47.u(b24Var);
        linkedHashSet.addAll(wo1.X(sy4Var, u24VarU == null ? la2.m : lv0.T0(u24VarU.a(sy4Var, t35.q)), linkedHashSet, b24Var, ((q35) ((io3) this.b.m).l).d));
        if (this.n.a.isEnum()) {
            if (sy4Var.equals(t87.c)) {
                linkedHashSet.add(io1.M(b24Var));
            } else if (sy4Var.equals(t87.a)) {
                linkedHashSet.add(io1.N(b24Var));
            }
        }
    }

    @Override // o.s24
    public final void n(ArrayList arrayList, sy4 sy4Var) {
        du5 du5VarL;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t tVar = new t(sy4Var, (byte) 21);
        b24 b24Var = this.f2159o;
        ga0.j(qf0.K(b24Var), yl7.D, new t24(b24Var, linkedHashSet, tVar));
        boolean zIsEmpty = arrayList.isEmpty();
        yc4 yc4Var = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                bu5 bu5VarV = v((bu5) obj);
                Object arrayList2 = linkedHashMap.get(bu5VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(bu5VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                qv0.c0(arrayList3, wo1.X(sy4Var, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, b24Var, ((q35) ((io3) yc4Var.m).l).d));
            }
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(wo1.X(sy4Var, linkedHashSet, arrayList, b24Var, ((q35) ((io3) yc4Var.m).l).d));
        }
        if (this.n.a.isEnum() && sy4Var.equals(t87.b) && (du5VarL = io1.L(b24Var)) != null) {
            arrayList.add(du5VarL);
        }
    }

    @Override // o.s24
    public final Set o(no1 no1Var) {
        no1Var.getClass();
        Set setS0 = lv0.S0(((mi1) this.e.a()).e());
        e24 e24Var = e24.q;
        b24 b24Var = this.f2159o;
        ga0.j(qf0.K(b24Var), yl7.D, new t24(b24Var, setS0, e24Var));
        if (this.n.a.isEnum()) {
            setS0.add(t87.b);
        }
        return setS0;
    }

    @Override // o.s24
    public final fi1 q() {
        return this.f2159o;
    }
}
