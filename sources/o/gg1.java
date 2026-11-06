package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f890o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(String str, boolean z, boolean z2, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = str;
        this.n = z;
        this.f890o = z2;
        this.q = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        boolean z = this.f890o;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                return new gg1((Function1) obj2, hc1Var, (ze6) obj3, z);
            case 1:
                return new gg1((String) obj3, this.n, this.f890o, (px4) obj2, hc1Var);
            case 2:
                return new gg1((bn6) obj3, (z31) obj2, z, hc1Var);
            default:
                return new gg1((km) obj3, z, (e87) obj2, hc1Var);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                return ((gg1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 1:
                ((gg1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                return ((gg1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            default:
                return ((gg1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objY0;
        Object value;
        Object value2;
        yl6 yl6Var;
        boolean z;
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z2 = this.f890o;
        ne1 ne1Var = ne1.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ze6 ze6Var = (ze6) obj3;
                ig1 ig1Var = new ig1((Function1) obj2, null, ze6Var, z2);
                this.n = true;
                Object objQ = ze6Var.q(z2, ig1Var, this);
                return objQ == ne1Var ? ne1Var : objQ;
            case 1:
                ct1.a0(obj);
                if (((String) obj3).length() == 5 && this.n && !z2) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(px5.r);
                    ((Function0) ((px4) obj2).getValue()).a();
                }
                return f88Var;
            case 2:
                bn6 bn6Var = (bn6) obj3;
                l97 l97Var = bn6Var.u;
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    this.n = true;
                    objY0 = bn6Var.Y0((z31) obj2, this);
                    if (objY0 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objY0 = obj;
                }
                List list = (List) objY0;
                boolean zIsEmpty = list.isEmpty();
                ea2 ea2Var = ea2.m;
                if (zIsEmpty) {
                    do {
                        value2 = l97Var.getValue();
                        yl6Var = (yl6) value2;
                        z = this.f890o;
                    } while (!l97Var.j(value2, yl6.a(yl6Var, null, null, null, false, null, null, null, null, null, null, null, false, ea2Var, z, false, false, null, z ? ca2.n : ca2.m, false, 1935359)));
                    return f88Var;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((z31) obj4).i == f95.f778o) {
                        arrayList.add(obj4);
                    }
                }
                boolean zIsEmpty2 = arrayList.isEmpty();
                boolean z5 = this.f890o;
                if (!zIsEmpty2) {
                    do {
                        value = l97Var.getValue();
                    } while (!l97Var.j(value, yl6.a((yl6) value, null, null, null, false, null, null, null, null, null, null, null, true, lv0.J0(list, new dj6((byte) 2)), z5, true, false, null, null, false, 1935359)));
                    return f88Var;
                }
                while (true) {
                    Object value3 = l97Var.getValue();
                    boolean z6 = z5;
                    if (l97Var.j(value3, yl6.a((yl6) value3, null, null, null, false, null, null, null, null, null, null, null, false, ea2Var, z6, false, false, null, z5 ? ca2.p : ca2.f506o, false, 1935359))) {
                        return f88Var;
                    }
                    z5 = z6;
                }
                break;
            default:
                boolean z7 = this.n;
                if (z7) {
                    if (z7) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                km kmVar = (km) obj3;
                float f = z2 ? 1.0f : 0.8f;
                this.n = true;
                return km.a(kmVar, new Float(f), (e87) obj2, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(Function1 function1, hc1 hc1Var, ze6 ze6Var, boolean z) {
        super(2, hc1Var);
        this.p = ze6Var;
        this.f890o = z;
        this.q = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(km kmVar, boolean z, e87 e87Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = kmVar;
        this.f890o = z;
        this.q = e87Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(bn6 bn6Var, z31 z31Var, boolean z, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = bn6Var;
        this.q = z31Var;
        this.f890o = z;
    }
}
