package o;

/* JADX INFO: loaded from: classes.dex */
public final class i91 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i91(int i, hc1 hc1Var, byte b) {
        super(i, hc1Var);
        this.m = b;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                i91 i91Var = new i91(2, hc1Var, (byte) 0);
                i91Var.n = obj;
                return i91Var;
            case 1:
                i91 i91Var2 = new i91(2, hc1Var, (byte) 1);
                i91Var2.n = obj;
                return i91Var2;
            case 2:
                i91 i91Var3 = new i91(2, hc1Var, (byte) 2);
                i91Var3.n = obj;
                return i91Var3;
            case 3:
                i91 i91Var4 = new i91(2, hc1Var, (byte) 3);
                i91Var4.n = obj;
                return i91Var4;
            case 4:
                i91 i91Var5 = new i91(2, hc1Var, (byte) 4);
                i91Var5.n = obj;
                return i91Var5;
            default:
                i91 i91Var6 = new i91(2, hc1Var, (byte) 5);
                i91Var6.n = obj;
                return i91Var6;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((i91) create((vd5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((i91) create((vd5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((i91) create((g97) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((i91) create((m56) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                ((i91) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((i91) create((ny6) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.m) {
            case 0:
                vd5 vd5Var = (vd5) this.n;
                ct1.a0(obj);
                boolean zBooleanValue = ((Boolean) vd5Var.m).booleanValue();
                boolean zBooleanValue2 = ((Boolean) vd5Var.n).booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                vd5 vd5Var2 = (vd5) this.n;
                ct1.a0(obj);
                boolean zBooleanValue3 = ((Boolean) vd5Var2.m).booleanValue();
                boolean zBooleanValue4 = ((Boolean) vd5Var2.n).booleanValue();
                if (!zBooleanValue3 && !zBooleanValue4) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ct1.a0(obj);
                return Boolean.valueOf(!(((g97) this.n) instanceof gl2));
            case 3:
                ct1.a0(obj);
                return Boolean.valueOf(((m56) this.n) == m56.m);
            case 4:
                me1 me1Var = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var, null, null, new l5(2, null, (byte) 18), 3);
                return f88.a;
            default:
                ny6 ny6Var = (ny6) this.n;
                ct1.a0(obj);
                return Boolean.valueOf(ny6Var != ny6.m);
        }
    }
}
