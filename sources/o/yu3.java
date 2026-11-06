package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yu3 extends vv3 implements wu3 {
    public final u14 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu3(ou3 ou3Var, String str, String str2, Object obj) {
        super(ou3Var, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.z = ds1.X(l54.m, new a3(this, (byte) 22));
    }

    @Override // o.wu3, o.ev3
    public final xu3 b() {
        return (xu3) this.z.getValue();
    }

    @Override // o.ev3
    public final lw3 b() {
        return (xu3) this.z.getValue();
    }

    public yu3(ou3 ou3Var, du5 du5Var) {
        super(ou3Var, du5Var);
        this.z = ds1.X(l54.m, new a3(this, (byte) 22));
    }
}
