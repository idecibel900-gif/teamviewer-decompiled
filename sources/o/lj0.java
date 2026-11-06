package o;

/* JADX INFO: loaded from: classes.dex */
public final class lj0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1366o;

    public /* synthetic */ lj0(byte b, int i, Object obj) {
        this.m = b;
        this.f1366o = obj;
        this.n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        int i = this.n;
        Object obj = this.f1366o;
        switch (b) {
            case 0:
                xs1 xs1Var = (xs1) ((l07) obj).n;
                if (xs1Var != null) {
                    xs1Var.T(i);
                }
                break;
            default:
                ((ap8) obj).b(i);
                break;
        }
    }
}
