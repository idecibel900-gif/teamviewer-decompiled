package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 extends og7 implements hw2 {
    public x08 m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1058o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ ze6 q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig1(Function1 function1, hc1 hc1Var, ze6 ze6Var, boolean z) {
        super(2, hc1Var);
        this.p = z;
        this.q = ze6Var;
        this.r = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        ig1 ig1Var = new ig1(this.r, hc1Var, this.q, this.p);
        ig1Var.f1058o = obj;
        return ig1Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((ig1) create((y08) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[PHI: r0 r12
      0x0070: PHI (r0v6 o.y08) = (r0v3 o.y08), (r0v10 o.y08) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r12v9 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:23:0x006d, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[RETURN] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        x08 x08Var;
        x08 x08Var2;
        y08 y08Var;
        y08 y08Var2;
        Object objA;
        Object obj2;
        byte b = this.n;
        Function1 function1 = this.r;
        if (b == 0) {
            ct1.a0(obj);
            y08 y08Var3 = (y08) this.f1058o;
            y08Var3.getClass();
            return function1.invoke(((u06) y08Var3).c());
        }
        ze6 ze6Var = this.q;
        ne1 ne1Var = ne1.m;
        if (b != 1) {
            if (b == 2) {
                x08Var = this.m;
                y08Var2 = (y08) this.f1058o;
                ct1.a0(obj);
            } else {
                if (b == 3) {
                    y08Var = (y08) this.f1058o;
                    ct1.a0(obj);
                    if (this.p) {
                        return obj;
                    }
                    this.f1058o = obj;
                    this.n = (byte) 4;
                    objA = y08Var.a(this);
                    if (objA != ne1Var) {
                        Object obj3 = obj;
                        obj = objA;
                        obj2 = obj3;
                    }
                    return ne1Var;
                }
                if (b != 4) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f1058o;
                ct1.a0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                wm3 wm3VarF = ze6Var.f();
                wm3VarF.b.c(wm3VarF.e, wm3VarF.f);
            }
            return obj2;
        }
        x08Var = this.m;
        y08 y08Var4 = (y08) this.f1058o;
        ct1.a0(obj);
        if (((Boolean) obj).booleanValue()) {
            x08Var2 = x08Var;
            y08Var = y08Var4;
            dg1 dg1Var = new dg1((byte) 1, function1, null);
            this.f1058o = y08Var;
            this.m = null;
            this.n = (byte) 3;
            obj = y08Var.b(x08Var2, dg1Var, this);
            if (obj != ne1Var) {
                if (this.p) {
                    return obj;
                }
                this.f1058o = obj;
                this.n = (byte) 4;
                objA = y08Var.a(this);
                if (objA != ne1Var) {
                    Object obj4 = obj;
                    obj = objA;
                    obj2 = obj4;
                    if (!((Boolean) obj).booleanValue()) {
                        wm3 wm3VarF2 = ze6Var.f();
                        wm3VarF2.b.c(wm3VarF2.e, wm3VarF2.f);
                    }
                    return obj2;
                }
            }
        } else {
            wm3 wm3VarF3 = ze6Var.f();
            this.f1058o = y08Var4;
            this.m = x08Var;
            this.n = (byte) 2;
            if (wm3VarF3.a(this) != ne1Var) {
                y08Var2 = y08Var4;
            }
        }
        return ne1Var;
        x08Var2 = x08Var;
        y08Var = y08Var2;
        dg1 dg1Var2 = new dg1((byte) 1, function1, null);
        this.f1058o = y08Var;
        this.m = null;
        this.n = (byte) 3;
        obj = y08Var.b(x08Var2, dg1Var2, this);
        if (obj != ne1Var) {
            if (this.p) {
                return obj;
            }
            this.f1058o = obj;
            this.n = (byte) 4;
            objA = y08Var.a(this);
            if (objA != ne1Var) {
                Object obj5 = obj;
                obj = objA;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    wm3 wm3VarF4 = ze6Var.f();
                    wm3VarF4.b.c(wm3VarF4.e, wm3VarF4.f);
                }
                return obj2;
            }
        }
        return ne1Var;
    }
}
