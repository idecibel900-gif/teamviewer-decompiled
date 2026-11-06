package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eg1 extends og7 implements hw2 {
    public x08 m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f711o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ze6 r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg1(Function1 function1, hc1 hc1Var, ze6 ze6Var, boolean z, boolean z2) {
        super(2, hc1Var);
        this.p = z;
        this.q = z2;
        this.r = ze6Var;
        this.s = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        eg1 eg1Var = new eg1(this.s, hc1Var, this.r, this.p, this.q);
        eg1Var.f711o = obj;
        return eg1Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((eg1) create((y08) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r0 r12
      0x009d: PHI (r0v11 o.y08) = (r0v8 o.y08), (r0v16 o.y08) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[RETURN] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        x08 x08Var;
        y08 y08Var;
        x08 x08Var2;
        y08 y08Var2;
        y08 y08Var3;
        Object objA;
        Object obj2;
        byte b = this.n;
        Function1 function1 = this.s;
        ze6 ze6Var = this.r;
        boolean z = this.q;
        ne1 ne1Var = ne1.m;
        if (b == 0) {
            ct1.a0(obj);
            y08 y08Var4 = (y08) this.f711o;
            if (!this.p) {
                y08Var4.getClass();
                return function1.invoke(((u06) y08Var4).c());
            }
            x08Var = z ? x08.m : x08.n;
            if (z) {
                x08 x08Var3 = x08Var;
                y08Var = y08Var4;
                x08Var2 = x08Var3;
                dg1 dg1Var = new dg1((byte) 0, function1, null);
                this.f711o = y08Var;
                this.m = null;
                this.n = (byte) 3;
                obj = y08Var.b(x08Var2, dg1Var, this);
                if (obj != ne1Var) {
                    if (z) {
                        return obj;
                    }
                    this.f711o = obj;
                    this.n = (byte) 4;
                    objA = y08Var.a(this);
                    if (objA != ne1Var) {
                        Object obj3 = obj;
                        obj = objA;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            wm3 wm3VarF = ze6Var.f();
                            wm3VarF.b.c(wm3VarF.e, wm3VarF.f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f711o = y08Var4;
                this.m = x08Var;
                this.n = (byte) 1;
                Object objA2 = y08Var4.a(this);
                if (objA2 != ne1Var) {
                    y08Var2 = y08Var4;
                    obj = objA2;
                }
            }
            return ne1Var;
        }
        if (b == 1) {
            x08Var = this.m;
            y08Var2 = (y08) this.f711o;
            ct1.a0(obj);
        } else {
            if (b == 2) {
                x08Var = this.m;
                y08Var3 = (y08) this.f711o;
                ct1.a0(obj);
                x08Var2 = x08Var;
                y08Var = y08Var3;
                dg1 dg1Var2 = new dg1((byte) 0, function1, null);
                this.f711o = y08Var;
                this.m = null;
                this.n = (byte) 3;
                obj = y08Var.b(x08Var2, dg1Var2, this);
                if (obj != ne1Var) {
                    if (z) {
                        return obj;
                    }
                    this.f711o = obj;
                    this.n = (byte) 4;
                    objA = y08Var.a(this);
                    if (objA != ne1Var) {
                        Object obj4 = obj;
                        obj = objA;
                        obj2 = obj4;
                    }
                }
                return ne1Var;
            }
            if (b == 3) {
                y08Var = (y08) this.f711o;
                ct1.a0(obj);
                if (z) {
                    return obj;
                }
                this.f711o = obj;
                this.n = (byte) 4;
                objA = y08Var.a(this);
                if (objA != ne1Var) {
                    Object obj5 = obj;
                    obj = objA;
                    obj2 = obj5;
                }
                return ne1Var;
            }
            if (b != 4) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f711o;
            ct1.a0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            wm3 wm3VarF2 = ze6Var.f();
            wm3VarF2.b.c(wm3VarF2.e, wm3VarF2.f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            x08Var2 = x08Var;
            y08Var = y08Var2;
            dg1 dg1Var3 = new dg1((byte) 0, function1, null);
            this.f711o = y08Var;
            this.m = null;
            this.n = (byte) 3;
            obj = y08Var.b(x08Var2, dg1Var3, this);
            if (obj != ne1Var) {
                if (z) {
                    return obj;
                }
                this.f711o = obj;
                this.n = (byte) 4;
                objA = y08Var.a(this);
                if (objA != ne1Var) {
                    Object obj6 = obj;
                    obj = objA;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        wm3 wm3VarF3 = ze6Var.f();
                        wm3VarF3.b.c(wm3VarF3.e, wm3VarF3.f);
                    }
                    return obj2;
                }
            }
        } else {
            wm3 wm3VarF4 = ze6Var.f();
            this.f711o = y08Var2;
            this.m = x08Var;
            this.n = (byte) 2;
            if (wm3VarF4.a(this) != ne1Var) {
                y08Var3 = y08Var2;
                x08Var2 = x08Var;
                y08Var = y08Var3;
                dg1 dg1Var4 = new dg1((byte) 0, function1, null);
                this.f711o = y08Var;
                this.m = null;
                this.n = (byte) 3;
                obj = y08Var.b(x08Var2, dg1Var4, this);
                if (obj != ne1Var) {
                    if (z) {
                        return obj;
                    }
                    this.f711o = obj;
                    this.n = (byte) 4;
                    objA = y08Var.a(this);
                    if (objA != ne1Var) {
                        Object obj7 = obj;
                        obj = objA;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            wm3 wm3VarF5 = ze6Var.f();
                            wm3VarF5.b.c(wm3VarF5.e, wm3VarF5.f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return ne1Var;
    }
}
