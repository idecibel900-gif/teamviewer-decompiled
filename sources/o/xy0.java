package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy0 extends p8 implements hw2 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.t = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        f88 f88Var = f88.a;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                yy0 yy0Var = (yy0) obj3;
                yy0Var.c(((Number) obj2).intValue(), (ux2) obj);
                break;
            case 1:
                sk6 sk6Var = (sk6) obj3;
                im3.R(sk6Var.V.c(), null, null, new s2(sk6Var, ((nc8) obj).a, null, (byte) 2), 3);
                break;
            default:
                sk6 sk6Var2 = (sk6) obj3;
                im3.R(sk6Var2.V.c(), null, null, new s2(sk6Var2, ((nc8) obj).a, null, (byte) 3), 3);
                break;
        }
        return f88Var;
    }
}
