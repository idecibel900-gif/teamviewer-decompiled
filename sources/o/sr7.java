package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sr7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2045o;

    public /* synthetic */ sr7(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2045o = obj2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        gt7 gt7Var;
        int i;
        int i2;
        int i3;
        byte b = this.m;
        bp7 bp7Var = null;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        Object obj3 = this.f2045o;
        Object obj4 = this.n;
        byte b2 = 2;
        final byte b3 = 0;
        switch (b) {
            case 0:
                pr7 pr7Var = (pr7) obj4;
                me1 me1Var = (me1) obj3;
                cp7 cp7Var = (cp7) obj;
                Context context = (Context) obj2;
                boolean zH = pr7Var.h();
                xo xoVarK = pr7Var.k();
                String str = xoVarK != null ? xoVarK.n : null;
                gt7 gt7Var2 = pr7Var.w;
                if (gt7Var2 != null) {
                    long j = gt7Var2.a;
                    v65 v65Var = pr7Var.b;
                    gt7Var = new gt7(h57.a(v65Var.q((int) (j >> 32)), v65Var.q((int) (4294967295L & j))));
                } else {
                    gt7Var = null;
                }
                jm5 jm5Var = pr7Var.j;
                xn5 xn5Var = new xn5(pr7Var, me1Var, context, (byte) 8);
                h72 h72Var = qm5.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || gt7Var == null || jm5Var == null || !(jm5Var instanceof om5)) {
                    xn5Var.invoke(cp7Var);
                    if (str != null && gt7Var != null) {
                        us1.m(cp7Var, context, zH, str, gt7Var.a);
                    }
                } else {
                    om5 om5Var = (om5) jm5Var;
                    long j2 = gt7Var.a;
                    Object obj5 = om5Var.h;
                    my4 my4Var = om5Var.e;
                    if (my4Var.f()) {
                        bp7 bp7Var2 = (bp7) om5Var.g.getValue();
                        if (bp7Var2 == null || !gt7.b(j2, bp7Var2.b) || !im3.n(str, bp7Var2.a)) {
                            bp7Var2 = null;
                        }
                        my4Var.j(null);
                        bp7Var = bp7Var2;
                    }
                    if (bp7Var == null) {
                        xn5Var.invoke(cp7Var);
                    } else {
                        ArrayList arrayList = bp7Var.d;
                        TextClassification textClassification = bp7Var.c;
                        if (textClassification.getActions().isEmpty()) {
                            i = 0;
                            if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                                cp7Var.a.a(new sp7(obj5, textClassification, -1, textClassification.getIcon()));
                            }
                        } else {
                            i = 0;
                            cp7Var.a.a(new sp7(obj5, textClassification, 0, (Drawable) arrayList.get(0)));
                        }
                        xn5Var.invoke(cp7Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i4 = i; i4 < size; i4++) {
                            if (i4 > 0) {
                                cp7Var.a.a(new sp7(obj5, textClassification, i4, (Drawable) arrayList.get(i4)));
                            }
                        }
                    }
                    us1.m(cp7Var, context, zH, str, gt7Var.a);
                }
                return f88Var;
            case 1:
                px4 px4Var = (px4) obj4;
                hw2 hw2Var = (hw2) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new ts6(px4Var, (byte) 7);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarR0 = db8.r0(cs4.b, (Function1) objK);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    hw2Var.invoke(ux2Var, 0);
                    ux2Var.p(true);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                final th8 th8Var = (th8) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final a06 a06VarD0 = ds1.d0((Configuration) ux2Var2.j(lh.a), vn4.Y(th8Var.p0(), ux2Var2), new l51(th8Var.p0()), ux2Var2);
                    int iOrdinal = ((sf4) th8Var.r0.getValue()).ordinal();
                    if (iOrdinal == 0) {
                        i2 = -1058997678;
                        i3 = R.string.sign_in_devices;
                    } else if (iOrdinal == 1) {
                        i2 = -1058995089;
                        i3 = R.string.sign_in_chat;
                    } else {
                        if (iOrdinal != 2) {
                            throw fx3.m(-1058999536, ux2Var2, false);
                        }
                        i2 = -1058992300;
                        i3 = R.string.sign_in_purchases;
                    }
                    final String strM = to7.m(ux2Var2, i2, i3, ux2Var2, false);
                    Object objK2 = ux2Var2.K();
                    if (objK2 == awVar) {
                        objK2 = ck3.w(ux2Var2);
                        ux2Var2.g0(objK2);
                    }
                    me1 me1Var2 = (me1) objK2;
                    Object objK3 = ux2Var2.K();
                    if (objK3 == awVar) {
                        objK3 = new q37();
                        ux2Var2.g0(objK3);
                    }
                    final q37 q37Var = (q37) objK3;
                    boolean zH2 = ux2Var2.h(me1Var2);
                    Object objK4 = ux2Var2.K();
                    if (zH2 || objK4 == awVar) {
                        objK4 = new a67(q37Var, me1Var2, b2);
                        ux2Var2.g0(objK4);
                    }
                    final Function1 function1 = (Function1) objK4;
                    Object objK5 = ux2Var2.K();
                    if (objK5 == awVar) {
                        objK5 = new t21(q37Var, (byte) 7);
                        ux2Var2.g0(objK5);
                    }
                    final Function0 function0 = (Function0) objK5;
                    final px4 px4VarG = g57.g(a06VarD0.f, ux2Var2);
                    vh8 vh8Var = th8Var.q0;
                    if (vh8Var == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    final px4 px4VarG2 = g57.g(vh8Var.f2314o, ux2Var2);
                    Context context2 = composeView.getContext();
                    context2.getClass();
                    Object objK6 = ux2Var2.K();
                    if (objK6 == awVar) {
                        objK6 = new j68((byte) 7);
                        ux2Var2.g0(objK6);
                    }
                    Function0 function2 = (Function0) objK6;
                    boolean zH3 = ux2Var2.h(me1Var2) | ux2Var2.h(th8Var);
                    Object objK7 = ux2Var2.K();
                    if (zH3 || objK7 == awVar) {
                        objK7 = new w18(me1Var2, th8Var, b2);
                        ux2Var2.g0(objK7);
                    }
                    Function1 function3 = (Function1) objK7;
                    boolean zH4 = ux2Var2.h(th8Var);
                    Object objK8 = ux2Var2.K();
                    if (zH4 || objK8 == awVar) {
                        objK8 = new er7(th8Var, (byte) 4);
                        ux2Var2.g0(objK8);
                    }
                    final wh8 wh8VarC = r47.C(context2, function2, function3, (Function1) objK8, ux2Var2, 24624);
                    boolean zH5 = ux2Var2.h(th8Var) | ux2Var2.h(wh8VarC);
                    Object objK9 = ux2Var2.K();
                    if (zH5 || objK9 == awVar) {
                        objK9 = new Function0() { // from class: o.qh8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b4 = b3;
                                f88 f88Var2 = f88.a;
                                wh8 wh8Var = wh8VarC;
                                th8 th8Var2 = th8Var;
                                switch (b4) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(h57.D(zh8.OnSignInClicked, th8Var2.A0()));
                                        wh8Var.a(false);
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(h57.D(zh8.OnCreateAccountClicked, th8Var2.A0()));
                                        wh8Var.a(true);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK9);
                    }
                    final Function0 function4 = (Function0) objK9;
                    boolean zH6 = ux2Var2.h(th8Var) | ux2Var2.h(wh8VarC);
                    Object objK10 = ux2Var2.K();
                    if (zH6 || objK10 == awVar) {
                        final byte b4 = 1;
                        objK10 = new Function0() { // from class: o.qh8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b5 = b4;
                                f88 f88Var2 = f88.a;
                                wh8 wh8Var = wh8VarC;
                                th8 th8Var2 = th8Var;
                                switch (b5) {
                                    case 0:
                                        IStatisticsHandler iStatisticsHandler = ga7.a;
                                        ga7.a(h57.D(zh8.OnSignInClicked, th8Var2.A0()));
                                        wh8Var.a(false);
                                        break;
                                    default:
                                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                                        ga7.a(h57.D(zh8.OnCreateAccountClicked, th8Var2.A0()));
                                        wh8Var.a(true);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK10);
                    }
                    final Function0 function5 = (Function0) objK10;
                    ut7.a(au8.O(371958346, new hw2() { // from class: o.rh8
                        @Override // o.hw2
                        public final Object invoke(Object obj6, Object obj7) {
                            ux2 ux2Var3 = (ux2) obj6;
                            int iIntValue3 = ((Integer) obj7).intValue();
                            if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                nv1.g(au8.s(cs4.b, ((rn4) ux2Var3.j(un4.a)).a.p, kh.V), null, null, au8.O(2030734916, new l21(q37Var, (byte) 7), ux2Var3), null, 0, 0L, 0L, null, au8.O(1490848411, new m21(th8Var, function1, composeView, a06VarD0, function4, function5, strM, function0, px4VarG, px4VarG2), ux2Var3), ux2Var3, 805309440, 502);
                            } else {
                                ux2Var3.Q();
                            }
                            return f88.a;
                        }
                    }, ux2Var2), ux2Var2, 48);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }
}
