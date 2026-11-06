package o;

/* JADX INFO: loaded from: classes2.dex */
public class ew3 extends mw3 implements bw3 {
    public final u14 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew3(ou3 ou3Var, String str, String str2) {
        super(ou3Var, str, str2, null, bj0.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        cw3 cw3Var = new cw3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, cw3Var);
        ds1.X(l54Var, new cw3(this, (byte) 1));
    }

    @Override // o.mw3
    public final jw3 D() {
        return (dw3) this.y.getValue();
    }

    @Override // o.fw3
    public final rv3 getGetter() {
        return (dw3) this.y.getValue();
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((dw3) this.y.getValue()).call(obj, obj2);
    }

    @Override // o.fw3
    public final dw3 getGetter() {
        return (dw3) this.y.getValue();
    }

    public ew3(ou3 ou3Var, du5 du5Var) {
        super(ou3Var, du5Var);
        cw3 cw3Var = new cw3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, cw3Var);
        ds1.X(l54Var, new cw3(this, (byte) 1));
    }
}
