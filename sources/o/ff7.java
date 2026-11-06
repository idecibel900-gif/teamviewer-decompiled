package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ff7 implements y08, u06 {
    public final ze7 a;

    public ff7(ze7 ze7Var) {
        this.a = ze7Var;
    }

    @Override // o.y08
    public final Object a(og7 og7Var) {
        return Boolean.valueOf(this.a.m.s0());
    }

    @Override // o.y08
    public final Object b(x08 x08Var, hw2 hw2Var, og7 og7Var) {
        return e(x08Var, hw2Var, og7Var);
    }

    @Override // o.u06
    public final pg6 c() {
        return this.a;
    }

    @Override // o.lo5
    public final Object d(String str, Function1 function1, jc1 jc1Var) {
        kf7 kf7VarJ0 = this.a.J0(str);
        try {
            Object objInvoke = function1.invoke(kf7VarJ0);
            iq8.l(kf7VarJ0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(kf7VarJ0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(x08 x08Var, hw2 hw2Var, jc1 jc1Var) throws Throwable {
        ef7 ef7Var;
        ff7 ff7Var;
        bf7 bf7Var;
        if (jc1Var instanceof ef7) {
            ef7Var = (ef7) jc1Var;
            int i = ef7Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef7Var.q = i - Integer.MIN_VALUE;
            } else {
                ef7Var = new ef7(this, jc1Var);
            }
        } else {
            ef7Var = new ef7(this, jc1Var);
        }
        Object obj = ef7Var.f710o;
        int i2 = ef7Var.q;
        if (i2 == 0) {
            ct1.a0(obj);
            bf7 bf7Var2 = this.a.m;
            bf7Var2.s0();
            int iOrdinal = x08Var.ordinal();
            if (iOrdinal == 0) {
                bf7Var2.D();
            } else if (iOrdinal == 1) {
                bf7Var2.Q();
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return null;
                }
                bf7Var2.n();
            }
            try {
                Object no5Var = new no5(this, (byte) 1);
                ef7Var.m = this;
                ef7Var.n = bf7Var2;
                ef7Var.q = 1;
                Object objInvoke = hw2Var.invoke(no5Var, ef7Var);
                Object obj2 = ne1.m;
                if (objInvoke == obj2) {
                    return obj2;
                }
                ff7Var = this;
                bf7Var = bf7Var2;
                obj = objInvoke;
            } catch (Throwable th) {
                th = th;
                ff7Var = this;
                bf7Var = bf7Var2;
                bf7Var.e0();
                if (!bf7Var.s0()) {
                    ff7Var.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bf7Var = ef7Var.n;
            ff7Var = ef7Var.m;
            try {
                ct1.a0(obj);
            } catch (Throwable th2) {
                th = th2;
                bf7Var.e0();
                if (!bf7Var.s0()) {
                    ff7Var.getClass();
                }
                throw th;
            }
        }
        bf7Var.O();
        bf7Var.e0();
        if (!bf7Var.s0()) {
            ff7Var.getClass();
        }
        return obj;
    }
}
