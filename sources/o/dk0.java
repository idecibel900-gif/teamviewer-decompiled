package o;

/* JADX INFO: loaded from: classes2.dex */
public final class dk0 implements iw2 {
    public static final dk0 n = new dk0(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final dk0 f630o = new dk0(1);
    public static final dk0 p = new dk0(2);
    public final /* synthetic */ byte m;

    public /* synthetic */ dk0(byte b) {
        this.m = b;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                try {
                    to7.p((lc6) obj2);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return f88Var;
            case 1:
                return f88Var;
            default:
                return null;
        }
    }
}
