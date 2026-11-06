package o;

/* JADX INFO: loaded from: classes.dex */
public final class dy2 implements qq4 {
    public static final dy2 b = new dy2(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ dy2(byte b2) {
        this.a = b2;
    }

    @Override // o.qq4
    public final w06 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!py2.class.isAssignableFrom(cls)) {
                    hk0.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (w06) py2.d(cls.asSubclass(py2.class)).c(3);
                } catch (Exception e) {
                    an4.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // o.qq4
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return py2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
