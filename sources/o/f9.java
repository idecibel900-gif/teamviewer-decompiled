package o;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.PreviewActivity;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f776o;
    public final /* synthetic */ Object p;

    public /* synthetic */ f9(q37 q37Var, f67 f67Var, px4 px4Var) {
        this.m = (byte) 24;
        this.f776o = q37Var;
        this.p = f67Var;
        this.n = px4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b;
        final Function1 function1;
        final ComposeView composeView;
        final Function1 function2;
        byte b2 = this.m;
        byte b3 = 5;
        aw awVar = e01.a;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        byte b4 = 1;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.n;
        Object obj5 = this.f776o;
        switch (b2) {
            case 0:
                ((Integer) obj2).getClass();
                pm8.i((ea0) obj5, (Function0) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kh.h((String) obj5, (Function1) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 2:
                fs4 fs4Var = (fs4) obj4;
                px4 px4Var = (px4) obj5;
                yy0 yy0Var = (yy0) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b5 = 2;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new va(px4Var, b5);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarR0 = db8.r0(fs4Var, (Function1) objK);
                    do4 do4VarC = ua0.c(xz2.f2564o, true);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yy0Var.invoke(ux2Var, 0);
                    ux2Var.p(true);
                }
                break;
            case 3:
                au0 au0Var = (au0) obj5;
                Context context = (Context) obj3;
                px4 px4Var2 = (px4) obj4;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else if (!ub7.b0((String) px4Var2.getValue())) {
                    ux2Var2.W(-888565146);
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-version-AttractionGuidDismissButton");
                    Object objK2 = ux2Var2.K();
                    if (objK2 == awVar) {
                        objK2 = new la(px4Var2, (byte) 2);
                        ux2Var2.g0(objK2);
                    }
                    xo1.k((Function0) objK2, fs4VarA, false, null, null, kh.e, ux2Var2, 1572918, 60);
                    ux2Var2.p(false);
                } else if (!di1.s(au0Var).hasPrimaryClip()) {
                    ux2Var2.W(-887134992);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-887960212);
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-version-AttractionGuidPasteButton");
                    boolean zH = ux2Var2.h(au0Var) | ux2Var2.h(context);
                    Object objK3 = ux2Var2.K();
                    if (zH || objK3 == awVar) {
                        objK3 = new n5(au0Var, context, px4Var2);
                        ux2Var2.g0(objK3);
                    }
                    xo1.k((Function0) objK3, fs4VarA2, false, null, null, kh.f, ux2Var2, 1572912, 60);
                    ux2Var2.p(false);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                au8.c((Function0) obj3, (g80) obj5, (iw2) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                b11.a((Owner) obj5, (nl) obj3, (yy0) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 6:
                final y21 y21Var = (y21) obj5;
                y31 y31Var = (y31) obj3;
                ComposeView composeView2 = (ComposeView) obj4;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    final a06 a06VarD0 = ds1.d0((Configuration) ux2Var3.j(lh.a), vn4.Y(y21Var.p0(), ux2Var3), new l51(y21Var.p0()), ux2Var3);
                    au0 au0Var2 = (au0) ux2Var3.j(b11.f);
                    final px4 px4VarG = g57.g(y31Var.Q, ux2Var3);
                    final px4 px4VarG2 = g57.g(y31Var.S, ux2Var3);
                    final px4 px4VarG3 = g57.g(y31Var.T, ux2Var3);
                    Object objK4 = ux2Var3.K();
                    if (objK4 == awVar) {
                        objK4 = ck3.w(ux2Var3);
                        ux2Var3.g0(objK4);
                    }
                    me1 me1Var = (me1) objK4;
                    final px4 px4VarG4 = g57.g(a06VarD0.f, ux2Var3);
                    boolean zH2 = ux2Var3.h(y31Var);
                    Object objK5 = ux2Var3.K();
                    if (zH2 || objK5 == awVar) {
                        objK5 = new m9(0, y31Var, y31.class, "dismissQuickSupportAppCard", "dismissQuickSupportAppCard()V", 0, (byte) 12);
                        y31Var = y31Var;
                        ux2Var3.g0(objK5);
                    }
                    pu3 pu3Var = (pu3) objK5;
                    boolean zH3 = ux2Var3.h(y31Var);
                    Object objK6 = ux2Var3.K();
                    if (zH3 || objK6 == awVar) {
                        y31 y31Var2 = y31Var;
                        m9 m9Var = new m9(0, y31Var2, y31.class, "onSessionsTileStateChange", "onSessionsTileStateChange()V", 0, (byte) 13);
                        y31Var = y31Var2;
                        ux2Var3.g0(m9Var);
                        objK6 = m9Var;
                    }
                    pu3 pu3Var2 = (pu3) objK6;
                    boolean zH4 = ux2Var3.h(y31Var);
                    Object objK7 = ux2Var3.K();
                    if (zH4 || objK7 == awVar) {
                        y31 y31Var3 = y31Var;
                        m9 m9Var2 = new m9(0, y31Var3, y31.class, "onRecentConnectionsTileStateChange", "onRecentConnectionsTileStateChange()V", 0, (byte) 14);
                        y31Var = y31Var3;
                        ux2Var3.g0(m9Var2);
                        objK7 = m9Var2;
                    }
                    pu3 pu3Var3 = (pu3) objK7;
                    boolean zH5 = ux2Var3.h(y31Var);
                    Object objK8 = ux2Var3.K();
                    if (zH5 || objK8 == awVar) {
                        y31 y31Var4 = y31Var;
                        m9 m9Var3 = new m9(0, y31Var4, y31.class, "openOrInstallQuickSupportAppSafe", "openOrInstallQuickSupportAppSafe()V", 0, (byte) 15);
                        y31Var = y31Var4;
                        ux2Var3.g0(m9Var3);
                        objK8 = m9Var3;
                    }
                    pu3 pu3Var4 = (pu3) objK8;
                    boolean zH6 = ux2Var3.h(y31Var);
                    Object objK9 = ux2Var3.K();
                    if (zH6 || objK9 == awVar) {
                        y31 y31Var5 = y31Var;
                        m9 m9Var4 = new m9(0, y31Var5, y31.class, "showWaitingRoom", "showWaitingRoom()V", 0, (byte) 16);
                        y31Var = y31Var5;
                        ux2Var3.g0(m9Var4);
                        objK9 = m9Var4;
                    }
                    pu3 pu3Var5 = (pu3) objK9;
                    boolean zH7 = ux2Var3.h(y31Var);
                    Object objK10 = ux2Var3.K();
                    if (zH7 || objK10 == awVar) {
                        y31 y31Var6 = y31Var;
                        m9 m9Var5 = new m9(0, y31Var6, y31.class, "showSearchView", "showSearchView()V", 0, (byte) 17);
                        y31Var = y31Var6;
                        ux2Var3.g0(m9Var5);
                        objK10 = m9Var5;
                    }
                    pu3 pu3Var6 = (pu3) objK10;
                    boolean zH8 = ux2Var3.h(y31Var);
                    Object objK11 = ux2Var3.K();
                    if (zH8 || objK11 == awVar) {
                        y31 y31Var7 = y31Var;
                        m9 m9Var6 = new m9(0, y31Var7, y31.class, "dismissSearchView", "dismissSearchView()V", 0, (byte) 18);
                        y31Var = y31Var7;
                        ux2Var3.g0(m9Var6);
                        objK11 = m9Var6;
                    }
                    pu3 pu3Var7 = (pu3) objK11;
                    Function0 function0 = (Function0) pu3Var;
                    Function0 function3 = (Function0) pu3Var2;
                    Function0 function4 = (Function0) pu3Var3;
                    boolean zH9 = ux2Var3.h(y31Var);
                    Object objK12 = ux2Var3.K();
                    if (zH9 || objK12 == awVar) {
                        objK12 = new r21(y31Var, (byte) 0);
                        ux2Var3.g0(objK12);
                    }
                    Function1 function5 = (Function1) objK12;
                    boolean zH10 = ux2Var3.h(y31Var);
                    Object objK13 = ux2Var3.K();
                    if (zH10 || objK13 == awVar) {
                        objK13 = new r21(y31Var, (byte) 1);
                        ux2Var3.g0(objK13);
                    }
                    Function1 function6 = (Function1) objK13;
                    boolean zH11 = ux2Var3.h(y31Var);
                    Object objK14 = ux2Var3.K();
                    if (zH11 || objK14 == awVar) {
                        objK14 = new r21(y31Var, (byte) 2);
                        ux2Var3.g0(objK14);
                    }
                    Function1 function7 = (Function1) objK14;
                    boolean zH12 = ux2Var3.h(y31Var);
                    Object objK15 = ux2Var3.K();
                    if (zH12 || objK15 == awVar) {
                        objK15 = new r21(y31Var, (byte) 3);
                        ux2Var3.g0(objK15);
                    }
                    final i31 i31Var = new i31(function0, function3, function4, function5, function6, function7, (Function1) objK15, (Function0) pu3Var5, (Function0) pu3Var6, (Function0) pu3Var7, (Function0) pu3Var4);
                    boolean zH13 = ux2Var3.h(y31Var);
                    Object objK16 = ux2Var3.K();
                    if (zH13 || objK16 == awVar) {
                        objK16 = new n21(y31Var, (byte) 5);
                        ux2Var3.g0(objK16);
                    }
                    Function0 function8 = (Function0) objK16;
                    boolean zH14 = ux2Var3.h(y31Var);
                    Object objK17 = ux2Var3.K();
                    if (zH14 || objK17 == awVar) {
                        y31 y31Var8 = y31Var;
                        m9 m9Var7 = new m9(0, y31Var8, y31.class, "showCopySessionLinkSnackbar", "showCopySessionLinkSnackbar()V", 0, (byte) 19);
                        y31Var = y31Var8;
                        ux2Var3.g0(m9Var7);
                        objK17 = m9Var7;
                    }
                    Function0 function9 = (Function0) ((pu3) objK17);
                    boolean zH15 = ux2Var3.h(y31Var);
                    Object objK18 = ux2Var3.K();
                    if (zH15 || objK18 == awVar) {
                        y31 y31Var9 = y31Var;
                        m9 m9Var8 = new m9(0, y31Var9, y31.class, "showCopySessionCodeSnackbar", "showCopySessionCodeSnackbar()V", 0, (byte) 20);
                        y31Var = y31Var9;
                        ux2Var3.g0(m9Var8);
                        objK18 = m9Var8;
                    }
                    final xg8 xg8Var = new xg8(function8, function9, (Function0) ((pu3) objK18));
                    Object objK19 = ux2Var3.K();
                    if (objK19 == awVar) {
                        objK19 = new q37();
                        ux2Var3.g0(objK19);
                    }
                    final q37 q37Var = (q37) objK19;
                    boolean zF = ux2Var3.f(a06VarD0);
                    Object objK20 = ux2Var3.K();
                    if (zF || objK20 == awVar) {
                        b = 0;
                        objK20 = new s21(q37Var, a06VarD0, b);
                        ux2Var3.g0(objK20);
                    } else {
                        b = 0;
                    }
                    Function1 function10 = (Function1) objK20;
                    Object objK21 = ux2Var3.K();
                    if (objK21 == awVar) {
                        objK21 = new t21(q37Var, b);
                        ux2Var3.g0(objK21);
                    }
                    final Function0 function11 = (Function0) objK21;
                    boolean zH16 = ux2Var3.h(y31Var);
                    Object objK22 = ux2Var3.K();
                    if (zH16 || objK22 == awVar) {
                        objK22 = new r21(y31Var, (byte) 4);
                        ux2Var3.g0(objK22);
                    }
                    Function1 function12 = (Function1) objK22;
                    boolean zH17 = ux2Var3.h(y31Var) | ux2Var3.f(function10) | ux2Var3.h(composeView2) | ux2Var3.h(y21Var) | ux2Var3.h(au0Var2) | ux2Var3.h(me1Var) | ux2Var3.f(function12);
                    Object objK23 = ux2Var3.K();
                    if (zH17 || objK23 == awVar) {
                        objK23 = new w21(y31Var, function10, function11, composeView2, y21Var, au0Var2, me1Var, function12, null);
                        function1 = function12;
                        composeView = composeView2;
                        function2 = function10;
                        ux2Var3.g0(objK23);
                    } else {
                        function2 = function10;
                        function1 = function12;
                        composeView = composeView2;
                    }
                    ck3.i(f88Var, (hw2) objK23, ux2Var3);
                    Boolean boolValueOf = Boolean.valueOf(((p31) px4VarG.getValue()).a);
                    Boolean boolValueOf2 = Boolean.valueOf(((p31) px4VarG.getValue()).b);
                    boolean zH18 = ux2Var3.h(y21Var) | ux2Var3.f(px4VarG);
                    Object objK24 = ux2Var3.K();
                    if (zH18 || objK24 == awVar) {
                        objK24 = new i9(y21Var, px4VarG, null, (byte) 2);
                        ux2Var3.g0(objK24);
                    }
                    ck3.h(boolValueOf, boolValueOf2, (hw2) objK24, ux2Var3);
                    final y31 y31Var10 = y31Var;
                    ut7.a(au8.O(-404619927, new hw2() { // from class: o.k21
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v1, types: [o.ux2] */
                        /* JADX WARN: Type inference failed for: r1v14 */
                        /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r1v30 */
                        /* JADX WARN: Type inference failed for: r27v0 */
                        /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
                        /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
                        /* JADX WARN: Type inference failed for: r8v6 */
                        /* JADX WARN: Type inference failed for: r8v7 */
                        /* JADX WARN: Type inference failed for: r8v8 */
                        /* JADX WARN: Type inference failed for: r8v9 */
                        @Override // o.hw2
                        public final Object invoke(Object obj6, Object obj7) {
                            y31 y31Var11;
                            ?? r1;
                            ?? r8;
                            Object obj8;
                            Object obj9;
                            ?? r9;
                            Object obj10;
                            boolean z;
                            Object obj11;
                            ?? r13 = (ux2) obj6;
                            int iIntValue4 = ((Integer) obj7).intValue();
                            byte b6 = 0;
                            if (r13.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                fs4 fs4VarS2 = au8.s(cs4.b, ((rn4) r13.j(un4.a)).a.p, kh.V);
                                yy0 yy0VarO = au8.O(-932194385, new l21(q37Var, b6), r13);
                                y31 y31Var12 = y31Var10;
                                Function1 function13 = function2;
                                Function0 function14 = function11;
                                a06 a06Var = a06VarD0;
                                i31 i31Var2 = i31Var;
                                xg8 xg8Var2 = xg8Var;
                                px4 px4Var3 = px4VarG;
                                i97 i97Var = px4VarG4;
                                nv1.g(fs4VarS2, null, null, yy0VarO, null, 0, 0L, 0L, null, au8.O(-115941192, new m21(y31Var12, function13, function14, a06Var, i31Var2, xg8Var2, px4Var3, i97Var, px4VarG3, px4VarG2), r13), r13, 805309440, 502);
                                boolean z2 = ((p31) px4Var3.getValue()).e;
                                y21 y21Var2 = y21Var;
                                ComposeView composeView3 = composeView;
                                aw awVar2 = e01.a;
                                if (z2) {
                                    r13.W(1942738884);
                                    ye4.a("ConnectFragment", "TV crashed last time, show dialog");
                                    boolean zH19 = r13.h(y31Var11);
                                    Object objK25 = r13.K();
                                    if (zH19 || objK25 == awVar2) {
                                        y31Var11 = y31Var12;
                                        z = false;
                                        n21 n21Var = new n21(y31Var11, false ? 1 : 0);
                                        r13.g0(n21Var);
                                        obj11 = n21Var;
                                    } else {
                                        z = false;
                                        obj11 = objK25;
                                    }
                                    Function0 function15 = (Function0) obj11;
                                    boolean zH20 = r13.h(y31Var11) | r13.h(y21Var2) | r13.h(composeView3);
                                    Object objK26 = r13.K();
                                    Object obj12 = objK26;
                                    if (zH20 || objK26 == awVar2) {
                                        n5 n5Var = new n5((Object) y31Var11, (Object) y21Var2, (Object) composeView3, (byte) 9);
                                        r13.g0(n5Var);
                                        obj12 = n5Var;
                                    }
                                    im3.h(z ? 1 : 0, function15, (Function0) obj12, r13, null);
                                    r13.p(z);
                                    r1 = z;
                                } else {
                                    y31Var11 = y31Var12;
                                    r1 = 0;
                                    r13.W(1943189593);
                                    r13.p(false);
                                }
                                if (!((p31) px4Var3.getValue()).c || y31Var11.A == null) {
                                    r13.W(1943441561);
                                    r13.p(r1);
                                } else {
                                    r13.W(1943289723);
                                    q20 q20Var = y31Var11.A;
                                    q20Var.getClass();
                                    qf0.c(q20Var, null, r13, r1);
                                    r13.p(r1);
                                }
                                if (((p31) px4Var3.getValue()).f) {
                                    r13.W(1943517883);
                                    boolean zH21 = r13.h(y31Var11);
                                    Object objK27 = r13.K();
                                    if (zH21 || objK27 == awVar2) {
                                        obj10 = objK27;
                                        n21 n21Var2 = new n21(y31Var11, (byte) 1);
                                        r13.g0(n21Var2);
                                        obj10 = n21Var2;
                                    }
                                    xs1.r(r1, (Function0) obj10, r13, null);
                                    r13.p(r1);
                                } else {
                                    r13.W(1943700473);
                                    r13.p(r1);
                                }
                                if (((p31) px4Var3.getValue()).d) {
                                    p93 p93VarA = y31Var11.f2573o.a();
                                    Context context2 = composeView3.getContext();
                                    context2.getClass();
                                    y21Var2.A0(p93VarA, function13, function14, context2, function1);
                                }
                                if (((p31) px4Var3.getValue()).t) {
                                    r13.W(2002381658);
                                    SupportSession supportSession = ((p31) px4Var3.getValue()).p;
                                    if (supportSession == null) {
                                        r13.W(1944289255);
                                        r13.p(r1);
                                        r9 = r1;
                                    } else {
                                        r13.W(1944289256);
                                        boolean zBooleanValue = ((Boolean) i97Var.getValue()).booleanValue();
                                        boolean zH22 = r13.h(y31Var11) | r13.f(i31Var2);
                                        Object objK28 = r13.K();
                                        if (zH22 || objK28 == awVar2) {
                                            obj9 = objK28;
                                            x8 x8Var = new x8(y31Var11, i31Var2, (byte) 20);
                                            r13.g0(x8Var);
                                            obj9 = x8Var;
                                        }
                                        Function0 function16 = (Function0) obj9;
                                        boolean zH23 = r13.h(y31Var11);
                                        Object objK29 = r13.K();
                                        Object obj13 = objK29;
                                        if (zH23 || objK29 == awVar2) {
                                            n21 n21Var3 = new n21(y31Var11, (byte) 2);
                                            r13.g0(n21Var3);
                                            obj13 = n21Var3;
                                        }
                                        boolean z3 = r1 == true ? 1 : 0;
                                        of7.b(zBooleanValue, supportSession, function16, (Function0) obj13, null, null, r13, 0);
                                        r13.p(z3);
                                        r9 = z3;
                                    }
                                    r13.p(r9);
                                    r8 = r9;
                                } else {
                                    ?? r10 = r1;
                                    r13.W(1945003961);
                                    r13.p(r10);
                                    r8 = r10;
                                }
                                if (((p31) px4Var3.getValue()).u) {
                                    r13.W(1945085088);
                                    boolean zH24 = r13.h(y31Var11);
                                    Object objK30 = r13.K();
                                    if (zH24 || objK30 == awVar2) {
                                        obj8 = objK30;
                                        n21 n21Var4 = new n21(y31Var11, (byte) 3);
                                        r13.g0(n21Var4);
                                        obj8 = n21Var4;
                                    }
                                    zu1.l(r8, (Function0) obj8, r13, null);
                                    r13.p(r8);
                                } else {
                                    r13.W(1945447385);
                                    r13.p(r8);
                                }
                            } else {
                                r13.Q();
                            }
                            return f88.a;
                        }
                    }, ux2Var3), ux2Var3, 48);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ka0.g((fs4) obj4, (pr7) obj5, (yy0) obj3, (ux2) obj, yo1.Y(385));
                break;
            case 8:
                ((Integer) obj2).getClass();
                qs1.h((ArrayList) obj5, (fs4) obj4, (Function0) obj3, (ux2) obj, yo1.Y(49));
                break;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                xs1.h((String) obj5, (String) obj4, (Function0) obj3, (ux2) obj, yo1.Y(49));
                break;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                xo1.d((ov1) obj5, (Function0) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((fw1) obj5).A0((fs4) obj4, (hz1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                nv1.d((l67) obj5, (Function0) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                io1.i((go2) obj5, (Function1) obj3, (Function1) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                lq1.e((fs4) obj4, (pk7) obj5, (String) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 15:
                j74 j74Var = (j74) obj5;
                Function1 function13 = (Function1) obj3;
                nl nlVar = (nl) obj4;
                l74 l74Var = (l74) obj;
                String str = (String) obj2;
                l74Var.getClass();
                if (str != null && !ub7.b0(str)) {
                    nlVar.a(str);
                } else if (l74Var == l74.p && function13 != null) {
                    function13.invoke(j74Var);
                }
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((Integer) obj2).getClass();
                io1.l((fs4) obj4, (gi7) obj5, (String) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 17:
                fs4 fs4Var2 = (fs4) obj4;
                hk6 hk6Var = (hk6) obj5;
                yy0 yy0Var2 = (yy0) obj3;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    fs4 fs4VarZ = im3.Z(kh.J(ka0.D(fs4Var2, 0.0f, vp4.a, 1)), hk6Var, true);
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var4, 0);
                    int iHashCode2 = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL2 = ux2Var4.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarZ);
                    yz0.c.getClass();
                    ux2Var4.a0();
                    if (ux2Var4.S) {
                        ux2Var4.k(tg3Var);
                    } else {
                        ux2Var4.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var4);
                    o67.n(yj5VarL2, d82.u, ux2Var4);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var4);
                    o67.l(ux2Var4);
                    o67.n(fs4VarS2, d82.t, ux2Var4);
                    yy0Var2.d(lw0.a, ux2Var4, 6);
                    ux2Var4.p(true);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((Integer) obj2).getClass();
                zu1.j((fs4) obj4, (hj5) obj5, (vj5) obj3, (ux2) obj, yo1.Y(1));
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                Object[] objArr = (Object[]) obj4;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i = PreviewActivity.I;
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    iq8.s(str2, str3, ux2Var5, Arrays.copyOf(objArr, 0));
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                ep1.h((fs4) obj4, (fl7) obj5, (String) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                io1.p((f95) obj5, (jz1) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 22:
                h76 h76Var = (h76) obj5;
                yk6 yk6Var = (yk6) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = yk6Var.i(yk6Var.e(fFloatValue - h76Var.m));
                yk6 yk6Var2 = ((wk6) obj4).a;
                h76Var.m += yk6Var.e(yk6Var.h(yk6Var2.d(yk6Var2.k, jI, 1)));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ct1.m((String) obj5, (zl6) obj3, (Function1) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 24:
                q37 q37Var2 = (q37) obj5;
                f67 f67Var = (f67) obj3;
                i97 i97Var = (i97) obj4;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    nv1.g(au8.s(cs4Var, ((rn4) ux2Var6.j(un4.a)).a.p, kh.V), null, null, au8.O(961249867, new l21(q37Var2, b3), ux2Var6), null, 0, 0L, 0L, null, au8.O(327587362, new sd(f67Var, i97Var, (byte) 14), ux2Var6), ux2Var6, 805309440, 502);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                h67.a((j67) obj5, (f67) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                of7.c((SupportSessionRecipientStatus) obj5, (OffsetDateTime) obj3, (fs4) obj4, (ux2) obj, yo1.Y(385));
                break;
            case 27:
                nl7 nl7Var = (nl7) obj5;
                ol7 ol7Var = (ol7) obj3;
                String str4 = (String) obj4;
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    n67.b(nl7Var, ol7Var.c, null, str4, ux2Var7, 0);
                }
                break;
            case 28:
                ul7 ul7Var = (ul7) obj5;
                ol7 ol7Var2 = (ol7) obj3;
                String str5 = (String) obj4;
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else {
                    dg6 dg6VarA = cg6.a(new ew(8.0f, new ar(xz2.A, b4)), xz2.y, ux2Var8, 54);
                    int iHashCode3 = Long.hashCode(ux2Var8.T);
                    yj5 yj5VarL3 = ux2Var8.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var8, cs4Var);
                    yz0.c.getClass();
                    ux2Var8.a0();
                    if (ux2Var8.S) {
                        ux2Var8.k(tg3Var);
                    } else {
                        ux2Var8.j0();
                    }
                    o67.n(dg6VarA, d82.v, ux2Var8);
                    o67.n(yj5VarL3, d82.u, ux2Var8);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var8);
                    o67.l(ux2Var8);
                    o67.n(fs4VarS3, d82.t, ux2Var8);
                    rl7 rl7Var = ul7Var.d;
                    if (rl7Var == null) {
                        ux2Var8.W(-667415305);
                        ux2Var8.p(false);
                    } else {
                        ux2Var8.W(-667415304);
                        qs1.l(rl7Var.a.a(ux2Var8), ul7Var.e, iq8.j(cs4Var, rl7Var.b), null, rb1.a, 0.0f, null, ux2Var8, 24584, 40);
                        ux2Var8.p(false);
                    }
                    qs7.b(ul7Var.b, androidx.compose.ui.platform.a.a(cs4Var, str5.concat("-TVSnackbarMessage")), ol7Var2.b, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var8.j(un4.a)).b.m, ux2Var8, 0, 0, 131064);
                    ux2Var8.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                x67.d((l08) obj5, (fs4) obj4, (String) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ f9(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.f776o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public /* synthetic */ f9(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.m = b;
        this.f776o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public /* synthetic */ f9(Function0 function0, g80 g80Var, iw2 iw2Var, int i) {
        this.m = (byte) 4;
        this.p = function0;
        this.f776o = g80Var;
        this.n = iw2Var;
    }

    public /* synthetic */ f9(fs4 fs4Var, Object obj, Object obj2, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f776o = obj;
        this.p = obj2;
    }

    public /* synthetic */ f9(fs4 fs4Var, Object obj, yy0 yy0Var, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f776o = obj;
        this.p = yy0Var;
    }

    public /* synthetic */ f9(byte b, int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.m = b;
        this.f776o = obj;
        this.n = obj2;
        this.p = obj3;
    }
}
