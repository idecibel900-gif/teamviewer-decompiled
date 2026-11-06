package o;

/* JADX INFO: loaded from: classes.dex */
public final class cy2 implements pq4 {
    public static final cy2 b = new cy2(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ cy2(byte b2) {
        this.a = b2;
    }

    @Override // o.pq4
    public final v06 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!ny2.class.isAssignableFrom(cls)) {
                    hk0.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (v06) ny2.g(cls.asSubclass(ny2.class)).f(3);
                } catch (Exception e) {
                    an4.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // o.pq4
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ny2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
