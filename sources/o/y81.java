package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y81 implements iw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2587o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ y81(Function1 function1, r81 r81Var, h71 h71Var, boolean z) {
        this.f2587o = function1;
        this.p = r81Var;
        this.q = h71Var;
        this.n = z;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.f2587o;
        final byte b2 = 2;
        final byte b3 = 1;
        final byte b4 = 0;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj6;
                r81 r81Var = (r81) obj5;
                h71 h71Var = (h71) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = ux2Var.f(function1) | ux2Var.h(r81Var) | ux2Var.h(h71Var);
                    Object objK = ux2Var.K();
                    if (zF || objK == awVar) {
                        objK = new t81(function1, r81Var, h71Var, (byte) 2);
                        ux2Var.g0(objK);
                    }
                    Function0 function0 = (Function0) objK;
                    int iOrdinal = h71Var.t.ordinal();
                    boolean z = this.n;
                    if (iOrdinal == 0) {
                        ux2Var.W(-1859250499);
                        xk0.g(h71Var, r81Var, function0, z, ux2Var, 0);
                        ux2Var.p(false);
                    } else if (iOrdinal == 1) {
                        ux2Var.W(-1859241924);
                        xk0.c(h71Var, r81Var, function0, z, ux2Var, 0);
                        ux2Var.p(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw fx3.m(-1859252118, ux2Var, false);
                        }
                        ux2Var.W(-1859233284);
                        xk0.f(h71Var, r81Var, function0, z, ux2Var, 0);
                        ux2Var.p(false);
                    }
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                final nr6 nr6Var = (nr6) obj6;
                final SupportSession supportSession = (SupportSession) obj5;
                px4 px4Var = (px4) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zH = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession);
                    Object objK2 = ux2Var2.K();
                    final byte b5 = 3;
                    if (zH || objK2 == awVar) {
                        objK2 = new cr6(nr6Var, supportSession, px4Var, (byte) 3);
                        ux2Var2.g0(objK2);
                    }
                    final Function0 function2 = (Function0) objK2;
                    boolean z2 = supportSession.getAssignedAccountId() != 0;
                    boolean z3 = (supportSession.getAssignedAccountId() == 0 || im3.n(supportSession.getAssignedToMe(), Boolean.TRUE)) ? false : true;
                    boolean zH2 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK3 = ux2Var2.K();
                    if (zH2 || objK3 == awVar) {
                        final byte b6 = 5;
                        objK3 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b6;
                                f88 f88Var2 = f88.a;
                                Function0 function3 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b7) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function3.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function3.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function3.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function3.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function3.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function3.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK3);
                    }
                    Function0 function3 = (Function0) objK3;
                    boolean zH3 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK4 = ux2Var2.K();
                    if (zH3 || objK4 == awVar) {
                        objK4 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b4;
                                f88 f88Var2 = f88.a;
                                Function0 function4 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b7) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function4.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function4.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function4.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function4.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function4.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function4.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK4);
                    }
                    Function0 function4 = (Function0) objK4;
                    boolean zH4 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK5 = ux2Var2.K();
                    if (zH4 || objK5 == awVar) {
                        objK5 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b3;
                                f88 f88Var2 = f88.a;
                                Function0 function5 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b7) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function5.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function5.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function5.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function5.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function5.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function5.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK5);
                    }
                    Function0 function5 = (Function0) objK5;
                    boolean zH5 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK6 = ux2Var2.K();
                    if (zH5 || objK6 == awVar) {
                        objK6 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b2;
                                f88 f88Var2 = f88.a;
                                Function0 function6 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b7) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function6.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function6.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function6.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function6.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function6.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function6.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK6);
                    }
                    Function0 function6 = (Function0) objK6;
                    boolean zH6 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK7 = ux2Var2.K();
                    if (zH6 || objK7 == awVar) {
                        objK7 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b7 = b5;
                                f88 f88Var2 = f88.a;
                                Function0 function7 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b7) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function7.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function7.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function7.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function7.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function7.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function7.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK7);
                    }
                    Function0 function7 = (Function0) objK7;
                    boolean zH7 = ux2Var2.h(nr6Var) | ux2Var2.h(supportSession) | ux2Var2.f(function2);
                    Object objK8 = ux2Var2.K();
                    if (zH7 || objK8 == awVar) {
                        final byte b7 = 4;
                        objK8 = new Function0() { // from class: o.dr6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b8 = b7;
                                f88 f88Var2 = f88.a;
                                Function0 function8 = function2;
                                SupportSession supportSession2 = supportSession;
                                nr6 nr6Var2 = nr6Var;
                                switch (b8) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(sr6.OnServiceQueueAssignToMeClicked);
                                        nr6Var2.g.invoke(supportSession2);
                                        function8.a();
                                        break;
                                    case 1:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShowDetailsClicked);
                                        nr6Var2.i.invoke(supportSession2);
                                        function8.a();
                                        break;
                                    case 2:
                                        IStatisticsHandler iStatisticsHandler3 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueEditSessionClicked);
                                        nr6Var2.j.invoke(supportSession2);
                                        function8.a();
                                        break;
                                    case 3:
                                        IStatisticsHandler iStatisticsHandler4 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueShareSessionClicked);
                                        nr6Var2.k.invoke(supportSession2);
                                        function8.a();
                                        break;
                                    case 4:
                                        IStatisticsHandler iStatisticsHandler5 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueRemoveSessionClicked);
                                        nr6Var2.l.invoke(supportSession2);
                                        function8.a();
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler6 = ga7.a;
                                        ga7.a(sr6.OnServiceQueueUnassignClicked);
                                        nr6Var2.h.invoke(supportSession2);
                                        function8.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK8);
                    }
                    xo1.v(this.n, z2, z3, null, function3, function4, function5, function6, function7, (Function0) objK8, ux2Var2, 0, 8);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ y81(nr6 nr6Var, SupportSession supportSession, boolean z, px4 px4Var) {
        this.f2587o = nr6Var;
        this.p = supportSession;
        this.n = z;
        this.q = px4Var;
    }
}
