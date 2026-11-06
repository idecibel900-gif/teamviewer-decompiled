package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v85 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qi0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v85(qi0 qi0Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = qi0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new v85(this.n, hc1Var, (byte) 0);
            default:
                return new v85(this.n, hc1Var, (byte) 1);
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
        return ((v85) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        sc6 sc6Var;
        Object sc6Var2;
        sc6 sc6Var3;
        Object sc6Var4;
        byte b = this.m;
        qi0 qi0Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                try {
                    kc6 kc6VarF = qi0Var.f();
                    sc6Var2 = kc6VarF.a.B ? f88.a : new sc6(new w83(kc6VarF));
                    break;
                } catch (IOException e) {
                    sc6Var = new sc6(e);
                    sc6Var2 = sc6Var;
                } catch (gq3 e2) {
                    sc6Var = new sc6(e2);
                    sc6Var2 = sc6Var;
                }
                return new tc6(sc6Var2);
            default:
                ct1.a0(obj);
                try {
                    kc6 kc6VarF2 = qi0Var.f();
                    if (kc6VarF2.a.B) {
                        sc6Var4 = kc6VarF2.b;
                        sc6Var4.getClass();
                    } else {
                        sc6Var4 = new sc6(new w83(kc6VarF2));
                    }
                    break;
                } catch (IOException e3) {
                    sc6Var3 = new sc6(e3);
                    sc6Var4 = sc6Var3;
                } catch (gq3 e4) {
                    sc6Var3 = new sc6(e4);
                    sc6Var4 = sc6Var3;
                }
                return new tc6(sc6Var4);
        }
    }
}
