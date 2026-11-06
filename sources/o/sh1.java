package o;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends og7 implements Function1 {
    public final /* synthetic */ byte m = 0;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh1 f2021o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(k76 k76Var, vh1 vh1Var, i76 i76Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.q = k76Var;
        this.f2021o = vh1Var;
        this.r = i76Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        Object obj3 = this.q;
        vh1 vh1Var = this.f2021o;
        hc1 hc1Var = (hc1) obj;
        switch (b) {
            case 0:
                return new sh1((k76) obj3, vh1Var, (i76) obj2, hc1Var).invokeSuspend(f88Var);
            default:
                return new sh1(vh1Var, (de1) obj3, (hw2) obj2, hc1Var).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        k76 k76Var;
        i76 i76Var;
        qg1 qg1Var;
        Object obj2;
        int iHashCode;
        byte b = this.m;
        Object obj3 = this.r;
        Object obj4 = this.q;
        ne1 ne1Var = ne1.m;
        vh1 vh1Var = this.f2021o;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                i76 i76Var2 = (i76) obj3;
                k76 k76Var2 = (k76) obj4;
                byte b2 = this.n;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            k76Var = (k76) ((Serializable) this.p);
                            ct1.a0(obj);
                        } else {
                            if (b2 != 2) {
                                if (b2 != 3) {
                                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i76Var2 = (i76) ((Serializable) this.p);
                                ct1.a0(obj);
                                i76Var2.m = ((Number) obj).intValue();
                                return f88.a;
                            }
                            i76Var = (i76) ((Serializable) this.p);
                            ct1.a0(obj);
                        }
                        i76Var.m = ((Number) obj).intValue();
                        return f88.a;
                    }
                    ct1.a0(obj);
                    this.p = k76Var2;
                    this.n = (byte) 1;
                    obj = ((rj2) vh1Var.j.getValue()).a(new gh1(3, (hc1) null), this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                    k76Var = k76Var2;
                    k76Var.m = obj;
                    o07 o07VarC = vh1Var.c();
                    this.p = i76Var2;
                    this.n = (byte) 2;
                    obj = o07VarC.a();
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                    i76Var = i76Var2;
                    i76Var.m = ((Number) obj).intValue();
                    return f88.a;
                } catch (te1 unused) {
                    Object obj5 = k76Var2.m;
                    this.p = i76Var2;
                    this.n = (byte) 3;
                    obj = vh1Var.i(obj5, true, this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                }
            default:
                byte b3 = this.n;
                if (b3 != 0) {
                    if (b3 == 1) {
                        ct1.a0(obj);
                    } else if (b3 == 2) {
                        qg1Var = (qg1) this.p;
                        ct1.a0(obj);
                        obj2 = qg1Var.b;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        if (iHashCode != qg1Var.c) {
                            if (!im3.n(qg1Var.b, obj)) {
                                this.p = obj;
                                this.n = (byte) 3;
                                if (vh1Var.i(obj, true, this) == ne1Var) {
                                    return ne1Var;
                                }
                            }
                            return obj;
                        }
                        hk0.l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    } else {
                        if (b3 == 3) {
                            Object obj6 = this.p;
                            ct1.a0(obj);
                            return obj6;
                        }
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ct1.a0(obj);
                this.n = (byte) 1;
                obj = vh1Var.h(true, this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
                qg1Var = (qg1) obj;
                oa1 oa1Var = new oa1(obj3, (Object) qg1Var, hc1Var, (byte) 5);
                this.p = qg1Var;
                this.n = (byte) 2;
                obj = im3.j0((de1) obj4, oa1Var, this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
                obj2 = qg1Var.b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode != qg1Var.c) {
                    hk0.l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!im3.n(qg1Var.b, obj)) {
                    this.p = obj;
                    this.n = (byte) 3;
                    if (vh1Var.i(obj, true, this) == ne1Var) {
                        return ne1Var;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(vh1 vh1Var, de1 de1Var, hw2 hw2Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.f2021o = vh1Var;
        this.q = de1Var;
        this.r = hw2Var;
    }
}
