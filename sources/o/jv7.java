package o;

/* JADX INFO: loaded from: classes.dex */
public final class jv7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1204o;
    public /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv7(kv7 kv7Var, float f, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1204o = kv7Var;
        this.p = f;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.f1204o;
        switch (b) {
            case 0:
                return new jv7((kv7) obj2, this.p, hc1Var, (byte) 0);
            case 1:
                return new jv7((kv7) obj2, this.p, hc1Var, (byte) 1);
            default:
                jv7 jv7Var = new jv7((tz0) obj2, hc1Var);
                jv7Var.p = ((Number) obj).floatValue();
                return jv7Var;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((jv7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((jv7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((jv7) create(Float.valueOf(((Number) obj).floatValue()), (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        Object obj2 = this.f1204o;
        switch (b) {
            case 0:
                kv7 kv7Var = (kv7) obj2;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    km kmVar = kv7Var.F;
                    if (kmVar == null) {
                        return f88Var;
                    }
                    Float f = new Float(this.p);
                    jo joVar = kv7Var.D ? hh7.f : kv7Var.C;
                    this.n = true;
                    obj = km.a(kmVar, f, joVar, null, null, this, 12);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 1:
                kv7 kv7Var2 = (kv7) obj2;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    km kmVar2 = kv7Var2.E;
                    if (kmVar2 == null) {
                        return f88Var;
                    }
                    Float f2 = new Float(this.p);
                    jo joVar2 = kv7Var2.D ? hh7.f : kv7Var2.C;
                    this.n = true;
                    obj = km.a(kmVar2, f2, joVar2, null, null, this, 12);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            default:
                tz0 tz0Var = (tz0) obj2;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    float f3 = this.p;
                    Object objG = tz0Var.a.d.m.g(zo6.e);
                    hw2 hw2Var = (hw2) (objG != null ? objG : null);
                    if (hw2Var == null) {
                        throw ua5.r("Required value was null.");
                    }
                    t65 t65Var = new t65((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.n = true;
                    obj = hw2Var.invoke(t65Var, this);
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((t65) obj).a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv7(tz0 tz0Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.f1204o = tz0Var;
    }
}
