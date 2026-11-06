package o;

import android.content.Context;
import android.content.res.Resources;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yh8 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2609o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh8(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2609o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                return new yh8((vh8) this.f2609o, (iv6) obj3, (Resources) obj2, hc1Var, (byte) 0);
            case 1:
                yh8 yh8Var = new yh8((hj8) obj3, (Context) obj2, hc1Var);
                yh8Var.f2609o = obj;
                return yh8Var;
            default:
                return new yh8((nm) this.f2609o, (xm8) obj3, (v75) obj2, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((yh8) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1.m;
            case 1:
                return ((yh8) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((yh8) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        ne1 ne1Var = ne1.m;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(h57.D(zh8.ScreenOpened, "settings"));
                r36 r36Var = ((vh8) this.f2609o).q;
                q5 q5Var = new q5((iv6) obj3, (Resources) obj2, (byte) 14);
                this.n = true;
                if (r36Var.m.b(q5Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 1:
                hj8 hj8Var = (hj8) obj3;
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                gt5 gt5Var = (gt5) this.f2609o;
                zr zrVar = new zr(gt5Var, (byte) 3);
                ((ej8) hj8Var.n).a((Context) obj2, new xv((byte) 1), zrVar);
                a26 a26Var = new a26((Object) hj8Var, (Object) zrVar, (byte) 29);
                this.n = true;
                return xs1.u(gt5Var, a26Var, this) == ne1Var ? ne1Var : f88Var;
            default:
                xm8 xm8Var = (xm8) obj3;
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                nm nmVar = (nm) this.f2609o;
                nmVar.getClass();
                ArrayList arrayList = nmVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((y51) obj4).b(xm8Var)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((y51) it.next()).a(xm8Var.j));
                }
                go2 go2VarK = ga0.k(new ih1((go2[]) lv0.P0(arrayList3).toArray(new go2[0]), (byte) 3));
                q5 q5Var2 = new q5((v75) obj2, xm8Var, (byte) 15);
                this.n = true;
                return go2VarK.b(q5Var2, this) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh8(hj8 hj8Var, Context context, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 1;
        this.p = hj8Var;
        this.q = context;
    }
}
