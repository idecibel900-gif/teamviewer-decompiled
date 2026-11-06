package o;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eb2 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hb2 f700o;
    public final /* synthetic */ ke3 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ z06 r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb2(hb2 hb2Var, ke3 ke3Var, Object obj, za5 za5Var, z06 z06Var, cp4 cp4Var, l46 l46Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f700o = hb2Var;
        this.p = ke3Var;
        this.q = obj;
        this.s = za5Var;
        this.r = z06Var;
        this.t = cp4Var;
        this.u = l46Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.u;
        Object obj3 = this.t;
        Object obj4 = this.s;
        switch (b) {
            case 0:
                z06 z06Var = this.r;
                return new eb2(this.f700o, (k76) obj4, (k76) obj3, this.p, this.q, (k76) obj2, z06Var, hc1Var);
            default:
                return new eb2(this.f700o, this.p, this.q, (za5) obj4, this.r, (cp4) obj3, (l46) obj2, hc1Var);
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
                break;
        }
        return ((eb2) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        boolean z;
        m46 m46VarD;
        switch (this.m) {
            case 0:
                ne1 ne1Var = ne1.m;
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                hb2 hb2Var = this.f700o;
                t67 t67Var = (t67) ((k76) this.s).m;
                uy0 uy0Var = (uy0) ((k76) this.t).m;
                ke3 ke3Var = this.p;
                Object obj2 = this.q;
                za5 za5Var = (za5) ((k76) this.u).m;
                z06 z06Var = this.r;
                this.n = true;
                Object objA = hb2Var.a(t67Var, uy0Var, ke3Var, obj2, za5Var, z06Var, this);
                return objA == ne1Var ? ne1Var : objA;
            default:
                Object me7Var = ne1.m;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    hb2 hb2Var2 = this.f700o;
                    ke3 ke3Var2 = this.p;
                    Object obj3 = this.q;
                    za5 za5Var2 = (za5) this.s;
                    z06 z06Var2 = this.r;
                    this.n = true;
                    objB = hb2Var2.b(ke3Var2, obj3, za5Var2, z06Var2, this);
                    if (objB != me7Var) {
                    }
                    return me7Var;
                }
                if (!z3) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                objB = obj;
                bb2 bb2Var = (bb2) objB;
                ll2 ll2Var = this.f700o.b;
                synchronized (ll2Var) {
                    try {
                        i46 i46Var = (i46) ((WeakReference) ll2Var.n).get();
                        if (i46Var == null) {
                            ll2Var.o();
                        } else if (((Context) ll2Var.q) == null) {
                            Context context = i46Var.a.a;
                            ll2Var.q = context;
                            context.registerComponentCallbacks((ti) ll2Var.p);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nx3 nx3Var = this.f700o.d;
                cp4 cp4Var = (cp4) this.t;
                ke3 ke3Var3 = this.p;
                if (cp4Var == null || !ke3Var3.j.n || !bb2Var.a.c() || (m46VarD = ((i46) nx3Var.n).d()) == null) {
                    z = false;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bb2Var.b));
                    String str = bb2Var.d;
                    if (str != null) {
                        linkedHashMap.put("coil#disk_cache_key", str);
                    }
                    xd3 xd3Var = bb2Var.a;
                    Map mapZ = uf0.z(linkedHashMap);
                    synchronized (m46VarD.c) {
                        long jO = xd3Var.o();
                        if (jO < 0) {
                            throw new IllegalStateException(("Image size must be non-negative: " + jO).toString());
                        }
                        m46VarD.a.b(cp4Var, xd3Var, mapZ, jO);
                    }
                    z = true;
                }
                xd3 xd3Var2 = bb2Var.a;
                ke3 ke3Var4 = this.p;
                zg1 zg1Var = bb2Var.c;
                cp4 cp4Var2 = z ? (cp4) this.t : null;
                String str2 = bb2Var.d;
                boolean z4 = bb2Var.b;
                l46 l46Var = (l46) this.u;
                me7Var = new me7(xd3Var2, ke3Var4, zg1Var, cp4Var2, str2, z4, l46Var != null && l46Var.a);
                return me7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb2(hb2 hb2Var, k76 k76Var, k76 k76Var2, ke3 ke3Var, Object obj, k76 k76Var3, z06 z06Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f700o = hb2Var;
        this.s = k76Var;
        this.t = k76Var2;
        this.p = ke3Var;
        this.q = obj;
        this.u = k76Var3;
        this.r = z06Var;
    }
}
