package o;

/* JADX INFO: loaded from: classes.dex */
public final class s31 extends og7 implements kw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f1978o;
    public /* synthetic */ boolean p;
    public /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s31(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        switch (this.m) {
            case 0:
                boolean z2 = this.n;
                boolean z3 = this.f1978o;
                boolean z4 = this.p;
                boolean z5 = this.q;
                ct1.a0(obj);
                if (!z2 && !z3 && !z4 && !z5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                boolean z6 = this.n;
                boolean z7 = this.f1978o;
                boolean z8 = this.p;
                boolean z9 = this.q;
                ct1.a0(obj);
                if (!z6 && !z7 && !z8 && !z9) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // o.kw2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = 5;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                s31 s31Var = new s31(i, (hc1) obj5, (byte) 0);
                s31Var.n = zBooleanValue;
                s31Var.f1978o = zBooleanValue2;
                s31Var.p = zBooleanValue3;
                s31Var.q = zBooleanValue4;
                return s31Var.invokeSuspend(f88Var);
            default:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue7 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj4).booleanValue();
                s31 s31Var2 = new s31(i, (hc1) obj5, (byte) 1);
                s31Var2.n = zBooleanValue5;
                s31Var2.f1978o = zBooleanValue6;
                s31Var2.p = zBooleanValue7;
                s31Var2.q = zBooleanValue8;
                return s31Var2.invokeSuspend(f88Var);
        }
    }
}
