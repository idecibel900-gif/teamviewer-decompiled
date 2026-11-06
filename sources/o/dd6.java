package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dd6 {
    public pi0 a;
    public h93 b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final void a(ri0 ri0Var) {
        Objects.requireNonNull(ri0Var, "factory == null");
        this.d.add(ri0Var);
    }

    public final void b(uc1 uc1Var) {
        Objects.requireNonNull(uc1Var, "factory == null");
        this.c.add(uc1Var);
    }

    public final void c(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        g93 g93Var = new g93();
        g93Var.c(null, str);
        h93 h93VarA = g93Var.a();
        ArrayList arrayList = h93VarA.f;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.b = h93VarA;
        } else {
            an4.i(h93VarA, "baseUrl must end in /: ");
        }
    }

    public final d11 d() {
        if (this.b == null) {
            hk0.l("Base URL required.");
            return null;
        }
        Object c75Var = this.a;
        if (c75Var == null) {
            c75Var = new c75();
        }
        fj fjVar = pl5.a;
        aw awVar = pl5.c;
        ArrayList arrayList = new ArrayList(this.d);
        List listO = awVar.o(fjVar);
        arrayList.addAll(listO);
        List listQ = awVar.q();
        int size = listQ.size();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new vf0((byte) 0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listQ);
        h93 h93Var = this.b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listO.size();
        d11 d11Var = new d11();
        d11Var.m = new ConcurrentHashMap();
        d11Var.n = c75Var;
        d11Var.f578o = h93Var;
        d11Var.p = listUnmodifiableList;
        d11Var.q = listUnmodifiableList2;
        d11Var.r = fjVar;
        return d11Var;
    }
}
