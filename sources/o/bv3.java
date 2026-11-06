package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bv3 extends aw3 implements zu3 {
    public final u14 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv3(ou3 ou3Var, String str, String str2, Object obj) {
        super(ou3Var, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.z = ds1.X(l54.m, new a3(this, (byte) 23));
    }

    @Override // o.zu3, o.ev3
    public final av3 b() {
        return (av3) this.z.getValue();
    }

    @Override // o.zu3
    public final void k(Object obj, Object obj2) throws vd3 {
        ((av3) this.z.getValue()).call(obj, obj2);
    }

    @Override // o.ev3
    public final lw3 b() {
        return (av3) this.z.getValue();
    }

    public bv3(ou3 ou3Var, du5 du5Var) {
        super(ou3Var, du5Var);
        this.z = ds1.X(l54.m, new a3(this, (byte) 23));
    }
}
