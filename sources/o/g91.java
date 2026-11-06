package o;

/* JADX INFO: loaded from: classes.dex */
public final class g91 extends og7 implements iw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f873o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g91(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                g91 g91Var = new g91(b2, (hc1) obj3, (byte) 0);
                g91Var.n = zBooleanValue;
                g91Var.f873o = zBooleanValue2;
                return g91Var.invokeSuspend(f88Var);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                g91 g91Var2 = new g91(b2, (hc1) obj3, (byte) 1);
                g91Var2.n = zBooleanValue3;
                g91Var2.f873o = zBooleanValue4;
                return g91Var2.invokeSuspend(f88Var);
            case 2:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                g91 g91Var3 = new g91(b2, (hc1) obj3, (byte) 2);
                g91Var3.n = zBooleanValue5;
                g91Var3.f873o = zBooleanValue6;
                return g91Var3.invokeSuspend(f88Var);
            case 3:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                g91 g91Var4 = new g91(b2, (hc1) obj3, b2);
                g91Var4.n = zBooleanValue7;
                g91Var4.f873o = zBooleanValue8;
                return g91Var4.invokeSuspend(f88Var);
            default:
                boolean zBooleanValue9 = bool.booleanValue();
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                g91 g91Var5 = new g91(b2, (hc1) obj3, (byte) 4);
                g91Var5.n = zBooleanValue9;
                g91Var5.f873o = zBooleanValue10;
                return g91Var5.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.m) {
            case 0:
                boolean z2 = this.n;
                boolean z3 = this.f873o;
                ct1.a0(obj);
                return new vd5(Boolean.valueOf(z2), Boolean.valueOf(z3));
            case 1:
                boolean z4 = this.n;
                boolean z5 = this.f873o;
                ct1.a0(obj);
                return new vd5(Boolean.valueOf(z4), Boolean.valueOf(z5));
            case 2:
                boolean z6 = this.n;
                boolean z7 = this.f873o;
                ct1.a0(obj);
                return new vd5(Boolean.valueOf(z6), Boolean.valueOf(z7));
            case 3:
                boolean z8 = this.n;
                boolean z9 = this.f873o;
                ct1.a0(obj);
                if (!z8 && !z9) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z10 = this.n;
                boolean z11 = this.f873o;
                ct1.a0(obj);
                if (!z10 && z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
