package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends og7 implements Function1 {
    public Object m;
    public Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f714o;
    public Object p;
    public Iterator q;
    public int r;
    public byte s;
    public final /* synthetic */ vh1 t;
    public final /* synthetic */ j93 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(vh1 vh1Var, j93 j93Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.t = vh1Var;
        this.u = j93Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new eh1(this.t, this.u, (hc1) obj).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009f->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ky4 my4Var;
        g76 g76Var;
        k76 k76Var;
        k76 k76Var2;
        ky4 ky4Var;
        Iterator it;
        ky4 ky4Var2;
        g76 g76Var2;
        k76 k76Var3;
        dh1 dh1Var;
        k76 k76Var4;
        g76 g76Var3;
        hw2 hw2Var;
        Object obj2;
        int iHashCode;
        Integer numA;
        Object obj3;
        byte b = this.s;
        j93 j93Var = this.u;
        vh1 vh1Var = this.t;
        ne1 ne1Var = ne1.m;
        if (b == 0) {
            ct1.a0(obj);
            my4Var = new my4();
            g76Var = new g76();
            k76Var = new k76();
            this.m = my4Var;
            this.n = g76Var;
            this.f714o = k76Var;
            this.p = k76Var;
            this.s = (byte) 1;
            obj = vh1Var.h(true, this);
            if (obj != ne1Var) {
                k76Var2 = k76Var;
            }
            return ne1Var;
        }
        if (b == 1) {
            k76Var = (k76) this.p;
            k76Var2 = (k76) this.f714o;
            g76Var = (g76) this.n;
            my4Var = (ky4) this.m;
            ct1.a0(obj);
        } else {
            if (b == 2) {
                it = this.q;
                dh1Var = (dh1) this.p;
                k76Var3 = (k76) this.f714o;
                g76Var2 = (g76) this.n;
                ky4Var2 = (ky4) this.m;
                ct1.a0(obj);
                while (it.hasNext()) {
                    hw2Var = (hw2) it.next();
                    this.m = ky4Var2;
                    this.n = g76Var2;
                    this.f714o = k76Var3;
                    this.p = dh1Var;
                    this.q = it;
                    this.s = (byte) 2;
                    if (hw2Var.invoke(dh1Var, this) == ne1Var) {
                        return ne1Var;
                    }
                }
                k76Var2 = k76Var3;
                g76Var = g76Var2;
                ky4Var = ky4Var2;
                j93Var.p = null;
                this.m = g76Var;
                this.n = k76Var2;
                this.f714o = ky4Var;
                this.p = null;
                this.q = null;
                this.s = (byte) 3;
                if (ky4Var.e(this) != ne1Var) {
                    k76Var4 = k76Var2;
                    g76Var3 = g76Var;
                    g76Var3.m = true;
                    ky4Var.j(null);
                    obj2 = k76Var4.m;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    o07 o07VarC = vh1Var.c();
                    this.m = obj2;
                    this.n = null;
                    this.f714o = null;
                    this.r = iHashCode;
                    this.s = (byte) 4;
                    numA = o07VarC.a();
                    if (numA != ne1Var) {
                        obj = numA;
                        obj3 = obj2;
                    }
                }
                return ne1Var;
            }
            if (b == 3) {
                ky4Var = (ky4) this.f714o;
                k76Var4 = (k76) this.n;
                g76Var3 = (g76) this.m;
                ct1.a0(obj);
                try {
                    g76Var3.m = true;
                    ky4Var.j(null);
                    obj2 = k76Var4.m;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    o07 o07VarC2 = vh1Var.c();
                    this.m = obj2;
                    this.n = null;
                    this.f714o = null;
                    this.r = iHashCode;
                    this.s = (byte) 4;
                    numA = o07VarC2.a();
                    if (numA != ne1Var) {
                        obj = numA;
                        obj3 = obj2;
                    }
                    return ne1Var;
                } catch (Throwable th) {
                    ky4Var.j(null);
                    throw th;
                }
            }
            if (b != 4) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.r;
            obj3 = this.m;
            ct1.a0(obj);
        }
        return new qg1(iHashCode, ((Number) obj).intValue(), obj3);
        k76Var.m = ((qg1) obj).b;
        dh1 dh1Var2 = new dh1(my4Var, g76Var, k76Var2, vh1Var);
        List list = (List) j93Var.p;
        if (list != null) {
            it = list.iterator();
            ky4Var2 = my4Var;
            g76Var2 = g76Var;
            k76Var3 = k76Var2;
            dh1Var = dh1Var2;
            while (it.hasNext()) {
                hw2Var = (hw2) it.next();
                this.m = ky4Var2;
                this.n = g76Var2;
                this.f714o = k76Var3;
                this.p = dh1Var;
                this.q = it;
                this.s = (byte) 2;
                if (hw2Var.invoke(dh1Var, this) == ne1Var) {
                    return ne1Var;
                }
            }
            k76Var2 = k76Var3;
            g76Var = g76Var2;
            ky4Var = ky4Var2;
        } else {
            ky4Var = my4Var;
        }
        j93Var.p = null;
        this.m = g76Var;
        this.n = k76Var2;
        this.f714o = ky4Var;
        this.p = null;
        this.q = null;
        this.s = (byte) 3;
        if (ky4Var.e(this) != ne1Var) {
            k76Var4 = k76Var2;
            g76Var3 = g76Var;
            g76Var3.m = true;
            ky4Var.j(null);
            obj2 = k76Var4.m;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            o07 o07VarC3 = vh1Var.c();
            this.m = obj2;
            this.n = null;
            this.f714o = null;
            this.r = iHashCode;
            this.s = (byte) 4;
            numA = o07VarC3.a();
            if (numA != ne1Var) {
                obj = numA;
                obj3 = obj2;
                return new qg1(iHashCode, ((Number) obj).intValue(), obj3);
            }
        }
        return ne1Var;
    }
}
