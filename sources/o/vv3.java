package o;

/* JADX INFO: loaded from: classes2.dex */
public class vv3 extends mw3 implements sv3 {
    public final u14 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv3(ou3 ou3Var, String str, String str2, Object obj) {
        super(ou3Var, str, str2, null, obj);
        str.getClass();
        str2.getClass();
        tv3 tv3Var = new tv3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, tv3Var);
        ds1.X(l54Var, new tv3(this, (byte) 1));
    }

    @Override // o.mw3
    public final jw3 D() {
        return (uv3) this.y.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        return get();
    }

    @Override // o.sv3
    public final Object get() {
        return ((uv3) this.y.getValue()).call(new Object[0]);
    }

    @Override // o.fw3
    public final rv3 getGetter() {
        return (uv3) this.y.getValue();
    }

    @Override // o.fw3
    public final uv3 getGetter() {
        return (uv3) this.y.getValue();
    }

    public vv3(ou3 ou3Var, du5 du5Var) {
        super(ou3Var, du5Var);
        tv3 tv3Var = new tv3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, tv3Var);
        ds1.X(l54Var, new tv3(this, (byte) 1));
    }
}
