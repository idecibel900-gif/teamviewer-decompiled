package o;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l46 {
    public final boolean a;
    public final List b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public l46(dc dcVar, g95 g95Var, a46 a46Var, boolean z) {
        List<Proxy> listSelect;
        List listK;
        g95Var.getClass();
        this.d = dcVar;
        this.e = g95Var;
        this.f = a46Var;
        this.a = z;
        this.b = ea2.m;
        this.g = new ArrayList();
        h93 h93Var = dcVar.h;
        a46Var.p.o(a46Var, h93Var);
        URI uriG = h93Var.g();
        if (uriG.getHost() == null) {
            listK = ro8.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            try {
                listSelect = dcVar.g.select(uriG);
            } catch (IllegalArgumentException unused) {
                listSelect = null;
            }
            listK = (listSelect == null || listSelect.isEmpty()) ? ro8.k(new Proxy[]{Proxy.NO_PROXY}) : ro8.j(listSelect);
        }
        this.b = listK;
        this.c = 0;
        ((a46) this.f).p.n((a46) this.f, h93Var, this.b);
    }

    public boolean a() {
        return this.c < this.b.size() || !((ArrayList) this.g).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public Object b(jc1 jc1Var) throws Throwable {
        j46 j46Var;
        hb2 hb2Var;
        ke3 ke3Var = (ke3) this.d;
        int i = this.c;
        if (jc1Var instanceof j46) {
            j46Var = (j46) jc1Var;
            int i2 = j46Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j46Var.p = i2 - Integer.MIN_VALUE;
            } else {
                j46Var = new j46(this, jc1Var);
            }
        } else {
            j46Var = new j46(this, jc1Var);
        }
        j46 j46Var2 = j46Var;
        Object objD = j46Var2.n;
        int i3 = j46Var2.p;
        if (i3 == 0) {
            ct1.a0(objD);
            hb2 hb2Var2 = (hb2) this.b.get(i);
            l46 l46Var = new l46(ke3Var, this.b, i + 1, (ke3) this.e, (w07) this.f, (z06) this.g, this.a);
            j46Var2.m = hb2Var2;
            j46Var2.p = 1;
            objD = hb2Var2.d(l46Var, j46Var2);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
            hb2Var = hb2Var2;
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hb2Var = j46Var2.m;
            ct1.a0(objD);
        }
        se3 se3Var = (se3) objD;
        ke3 ke3VarP = se3Var.p();
        if (ke3VarP.a != ke3Var.a) {
            hk0.h(hb2Var, "' cannot modify the request's context.", "Interceptor '");
            return null;
        }
        if (ke3VarP.b == u55.a) {
            hk0.h(hb2Var, "' cannot set the request's data to null.", "Interceptor '");
            return null;
        }
        if (ke3VarP.c != ke3Var.c) {
            hk0.h(hb2Var, "' cannot modify the request's target.", "Interceptor '");
            return null;
        }
        if (ke3VarP.p == ke3Var.p) {
            return se3Var;
        }
        hk0.h(hb2Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        return null;
    }

    public l46(ke3 ke3Var, List list, int i, ke3 ke3Var2, w07 w07Var, z06 z06Var, boolean z) {
        this.d = ke3Var;
        this.b = list;
        this.c = i;
        this.e = ke3Var2;
        this.f = w07Var;
        this.g = z06Var;
        this.a = z;
    }
}
