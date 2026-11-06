package o;

import android.content.Context;
import android.content.res.Resources;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fy5 extends og7 implements hw2 {
    public final /* synthetic */ Context m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qk4 f838o;
    public final /* synthetic */ tx5 p;
    public final /* synthetic */ List q;
    public final /* synthetic */ me1 r;
    public final /* synthetic */ Resources s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ px4 w;
    public final /* synthetic */ px4 x;
    public final /* synthetic */ yf5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy5(Context context, px4 px4Var, qk4 qk4Var, tx5 tx5Var, List list, me1 me1Var, Resources resources, Function1 function1, Function0 function0, Function0 function2, px4 px4Var2, px4 px4Var3, yf5 yf5Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = context;
        this.n = px4Var;
        this.f838o = qk4Var;
        this.p = tx5Var;
        this.q = list;
        this.r = me1Var;
        this.s = resources;
        this.t = function1;
        this.u = function0;
        this.v = function2;
        this.w = px4Var2;
        this.x = px4Var3;
        this.y = yf5Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new fy5(this.m, this.n, this.f838o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        fy5 fy5Var = (fy5) create((me1) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        fy5Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        UUID uuidFromString;
        ct1.a0(obj);
        IStatisticsHandler iStatisticsHandler = ga7.a;
        ga7.a(px5.s);
        if (hm3.h(this.m, "android.permission.CAMERA") != 0) {
            px4 px4Var = this.n;
            if (!((Boolean) px4Var.getValue()).booleanValue()) {
                this.f838o.a("android.permission.CAMERA", null);
                px4Var.setValue(Boolean.TRUE);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.q) {
            if (str == null || str.length() == 0) {
                uuidFromString = null;
            } else {
                try {
                    uuidFromString = UUID.fromString(ub7.j0(ub7.i0(ub7.x0(str).toString(), "{"), "}"));
                } catch (IllegalArgumentException unused) {
                    uuidFromString = null;
                }
            }
            if (uuidFromString != null) {
                arrayList.add(uuidFromString);
            }
        }
        tx5 tx5Var = this.p;
        tx5Var.getClass();
        tx5Var.D = lv0.P0(lv0.S0(arrayList));
        cy5 cy5Var = new cy5(this.p, this.s, this.t, this.u, null, (byte) 0);
        me1 me1Var = this.r;
        im3.R(me1Var, null, null, cy5Var, 3);
        im3.R(me1Var, null, null, new cy5(this.p, this.s, this.t, this.u, null, (byte) 1), 3);
        im3.R(me1Var, null, null, new ey5(this.p, this.v, this.s, this.t, this.u, null, (byte) 0), 3);
        im3.R(me1Var, null, null, new ey5(this.p, this.v, this.s, this.t, this.u, null, (byte) 1), 3);
        im3.R(me1Var, null, null, new cy5(this.p, this.s, this.t, this.u, null, (byte) 2), 3);
        tx5 tx5Var2 = this.p;
        Function0 function0 = this.v;
        px4 px4Var2 = this.w;
        im3.R(me1Var, null, null, new aj(tx5Var2, function0, px4Var2, this.x, this.y, null, (byte) 10), 3);
        im3.R(me1Var, null, null, new ko2(tx5Var, this.v, px4Var2, (hc1) null, (byte) 12), 3);
        return f88.a;
    }
}
