package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wx0 implements hc1 {
    public static final wx0 n = new wx0(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wx0 f2456o = new wx0(1);
    public final /* synthetic */ byte m;

    public /* synthetic */ wx0(byte b) {
        this.m = b;
    }

    private final void a(Object obj) {
    }

    @Override // o.hc1
    public final de1 getContext() {
        switch (this.m) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return ba2.m;
        }
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        switch (this.m) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
