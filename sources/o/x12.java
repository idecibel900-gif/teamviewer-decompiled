package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x12 extends sj2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sj2 f2469o;

    public x12(sj2 sj2Var) {
        sj2Var.getClass();
        this.f2469o = sj2Var;
    }

    @Override // o.sj2
    public final List G(wg5 wg5Var) throws IOException {
        List<wg5> listG = this.f2469o.G(wg5Var);
        ArrayList arrayList = new ArrayList();
        for (wg5 wg5Var2 : listG) {
            wg5Var2.getClass();
            arrayList.add(wg5Var2);
        }
        pv0.a0(arrayList);
        return arrayList;
    }

    @Override // o.sj2
    public final sn1 Y(wg5 wg5Var) {
        wg5Var.getClass();
        sn1 sn1VarY = this.f2469o.Y(wg5Var);
        if (sn1VarY == null) {
            return null;
        }
        wg5 wg5Var2 = (wg5) sn1VarY.d;
        if (wg5Var2 == null) {
            return sn1VarY;
        }
        boolean z = sn1VarY.b;
        boolean z2 = sn1VarY.c;
        Long l = (Long) sn1VarY.e;
        Long l2 = (Long) sn1VarY.f;
        Long l3 = (Long) sn1VarY.g;
        Long l4 = (Long) sn1VarY.h;
        Map map = (Map) sn1VarY.i;
        map.getClass();
        return new sn1(z, z2, wg5Var2, l, l2, l3, l4, map);
    }

    @Override // o.sj2
    public final gs3 b0(wg5 wg5Var) {
        return this.f2469o.b0(wg5Var);
    }

    @Override // o.sj2
    public final v07 c0(wg5 wg5Var, boolean z) throws IOException {
        wg5 wg5VarC = wg5Var.c();
        if (wg5VarC != null) {
            kw kwVar = new kw();
            while (wg5VarC != null && !F(wg5VarC)) {
                kwVar.addFirst(wg5VarC);
                wg5VarC = wg5VarC.c();
            }
            Iterator<E> it = kwVar.iterator();
            while (it.hasNext()) {
                q((wg5) it.next());
            }
        }
        return this.f2469o.c0(wg5Var, z);
    }

    @Override // o.sj2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2469o.close();
    }

    @Override // o.sj2
    public final v07 e(wg5 wg5Var) {
        return this.f2469o.e(wg5Var);
    }

    @Override // o.sj2
    public final void j(wg5 wg5Var, wg5 wg5Var2) throws IOException {
        wg5Var2.getClass();
        this.f2469o.j(wg5Var, wg5Var2);
    }

    @Override // o.sj2
    public final q67 k0(wg5 wg5Var) {
        wg5Var.getClass();
        return this.f2469o.k0(wg5Var);
    }

    @Override // o.sj2
    public final void q(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        this.f2469o.q(wg5Var);
    }

    public final String toString() {
        return w86.a.b(x12.class).f() + '(' + this.f2469o + ')';
    }

    @Override // o.sj2
    public final void u(wg5 wg5Var) {
        wg5Var.getClass();
        this.f2469o.u(wg5Var);
    }
}
