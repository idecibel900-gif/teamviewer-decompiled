package o;

/* JADX INFO: loaded from: classes.dex */
public final class m52 extends og7 implements iw2 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m52(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                long j = ((t65) obj2).a;
                new m52(b2, (hc1) obj3, (byte) 0).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                ((Number) obj2).floatValue();
                new m52(b2, (hc1) obj3, (byte) 1).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                ((Boolean) obj2).getClass();
                new m52(b2, (hc1) obj3, (byte) 2).invokeSuspend(f88Var);
                return f88Var;
            case 3:
                ((Number) obj).intValue();
                new m52(b2, (hc1) obj3, b2).invokeSuspend(f88Var);
                return Boolean.FALSE;
            default:
                long j2 = ((t65) obj2).a;
                new m52(b2, (hc1) obj3, (byte) 4).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ct1.a0(obj);
                return f88Var;
            case 1:
                ct1.a0(obj);
                return f88Var;
            case 2:
                ct1.a0(obj);
                return f88Var;
            case 3:
                ct1.a0(obj);
                return Boolean.FALSE;
            default:
                ct1.a0(obj);
                return f88Var;
        }
    }
}
