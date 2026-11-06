package o;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements se8 {
    public static final cm1 b = new cm1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ cm1(byte b2) {
        this.a = b2;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        switch (this.a) {
            case 0:
                return lv1.H(cls);
            case 1:
                return new uu2(true);
            default:
                return new sc4();
        }
    }
}
