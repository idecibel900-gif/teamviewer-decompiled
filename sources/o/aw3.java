package o;

/* JADX INFO: loaded from: classes2.dex */
public class aw3 extends mw3 implements xv3 {
    public final u14 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw3(ou3 ou3Var, String str, String str2, Object obj) {
        super(ou3Var, str, str2, null, obj);
        str.getClass();
        str2.getClass();
        yv3 yv3Var = new yv3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, yv3Var);
        ds1.X(l54Var, new yv3(this, (byte) 1));
    }

    @Override // o.mw3
    public final jw3 D() {
        return (zv3) this.y.getValue();
    }

    @Override // o.xv3
    public final Object get(Object obj) {
        return ((zv3) this.y.getValue()).call(obj);
    }

    @Override // o.fw3
    public final rv3 getGetter() {
        return (zv3) this.y.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.fw3
    public final wv3 getGetter() {
        return (zv3) this.y.getValue();
    }

    public aw3(ou3 ou3Var, du5 du5Var) {
        super(ou3Var, du5Var);
        yv3 yv3Var = new yv3(this, (byte) 0);
        l54 l54Var = l54.m;
        this.y = ds1.X(l54Var, yv3Var);
        ds1.X(l54Var, new yv3(this, (byte) 1));
    }
}
