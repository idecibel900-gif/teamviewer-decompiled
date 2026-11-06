package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e56 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f683o;
    public final /* synthetic */ Function1 p;

    public /* synthetic */ e56(List list, Function1 function1, Function1 function2, byte b) {
        this.m = b;
        this.n = list;
        this.f683o = function1;
        this.p = function2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        tg3 tg3Var = LayoutNode.e0;
        final Function1 function1 = this.f683o;
        List<x46> list = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bw bwVar = iq8.c;
                    w50 w50Var = xz2.A;
                    kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    iz0 iz0Var = d82.v;
                    o67.n(kw0VarA, iz0Var, ux2Var);
                    iz0 iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0 iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var);
                    o67.l(ux2Var);
                    iz0 iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var);
                    lv1.k(ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 16.0f, 6.0f, 2), 0.0f, ((rn4) ux2Var.j(un4.a)).a.B, ux2Var, 6, 2);
                    fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
                    int iHashCode2 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL2 = ux2Var.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF);
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA2, iz0Var, ux2Var);
                    o67.n(yj5VarL2, iz0Var2, ux2Var);
                    e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                    o67.n(fs4VarS2, iz0Var4, ux2Var);
                    ux2Var.W(-1442036960);
                    for (final x46 x46Var : list) {
                        boolean zF = ux2Var.f(function1) | ux2Var.h(x46Var);
                        Object objK = ux2Var.K();
                        if (zF || objK == awVar) {
                            final byte b2 = 0;
                            objK = new Function0() { // from class: o.d56
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b3 = b2;
                                    f88 f88Var2 = f88.a;
                                    x46 x46Var2 = x46Var;
                                    Function1 function2 = function1;
                                    switch (b3) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(qs6.OnRemoteControl);
                                            function2.invoke(db8.G0(x46Var2));
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(qs6.OnFileTransfer);
                                            function2.invoke(db8.G0(x46Var2));
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var.g0(objK);
                        }
                        Function0 function0 = (Function0) objK;
                        final Function1 function2 = this.p;
                        boolean zF2 = ux2Var.f(function2) | ux2Var.h(x46Var);
                        Object objK2 = ux2Var.K();
                        if (zF2 || objK2 == awVar) {
                            final byte b3 = 1;
                            objK2 = new Function0() { // from class: o.d56
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b4 = b3;
                                    f88 f88Var2 = f88.a;
                                    x46 x46Var2 = x46Var;
                                    Function1 function3 = function2;
                                    switch (b4) {
                                        case 0:
                                            IStatisticsHandler iStatisticsHandler = ga7.a;
                                            ga7.a(qs6.OnRemoteControl);
                                            function3.invoke(db8.G0(x46Var2));
                                            break;
                                        default:
                                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                            ga7.a(qs6.OnFileTransfer);
                                            function3.invoke(db8.G0(x46Var2));
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var.g0(objK2);
                        }
                        io1.o(x46Var, null, function0, (Function0) objK2, ux2Var, 0);
                    }
                    ux2Var.p(false);
                    ux2Var.p(true);
                    ux2Var.p(true);
                } else {
                    ux2Var.Q();
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bw bwVar2 = iq8.c;
                    w50 w50Var2 = xz2.A;
                    kw0 kw0VarA3 = iw0.a(bwVar2, w50Var2, ux2Var2, 0);
                    int iHashCode3 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL3 = ux2Var2.l();
                    cs4 cs4Var2 = cs4.b;
                    fs4 fs4VarS3 = uf0.s(ux2Var2, cs4Var2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    iz0 iz0Var5 = d82.v;
                    o67.n(kw0VarA3, iz0Var5, ux2Var2);
                    iz0 iz0Var6 = d82.u;
                    o67.n(yj5VarL3, iz0Var6, ux2Var2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    iz0 iz0Var7 = d82.w;
                    o67.n(numValueOf2, iz0Var7, ux2Var2);
                    o67.l(ux2Var2);
                    iz0 iz0Var8 = d82.t;
                    o67.n(fs4VarS3, iz0Var8, ux2Var2);
                    lv1.k(ka0.F(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), 16.0f, 0.0f, 16.0f, 6.0f, 2), 0.0f, ((rn4) ux2Var2.j(un4.a)).a.B, ux2Var2, 6, 2);
                    fs4 fs4VarF2 = ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    kw0 kw0VarA4 = iw0.a(bwVar2, w50Var2, ux2Var2, 0);
                    int iHashCode4 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL4 = ux2Var2.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarF2);
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA4, iz0Var5, ux2Var2);
                    o67.n(yj5VarL4, iz0Var6, ux2Var2);
                    e41.r(iHashCode4, ux2Var2, iz0Var7, ux2Var2);
                    o67.n(fs4VarS4, iz0Var8, ux2Var2);
                    ux2Var2.W(1227007881);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        SupportSession supportSession = (SupportSession) it.next();
                        boolean zF3 = ux2Var2.f(function1) | ux2Var2.h(supportSession);
                        Object objK3 = ux2Var2.K();
                        if (zF3 || objK3 == awVar) {
                            objK3 = new xw1(function1, supportSession, (byte) 3);
                            ux2Var2.g0(objK3);
                        }
                        y57.f(supportSession, null, (Function0) objK3, this.p, ux2Var2, 0);
                    }
                    ux2Var2.p(false);
                    ux2Var2.p(true);
                    ux2Var2.p(true);
                } else {
                    ux2Var2.Q();
                }
                break;
        }
        return f88Var;
    }
}
