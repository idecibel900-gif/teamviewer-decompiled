package o;

/* JADX INFO: loaded from: classes.dex */
public final class q96 implements hi4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ q96(gl0 gl0Var, byte b) {
        this.a = b;
        this.b = gl0Var;
    }

    @Override // o.hi4
    public final void onResult(Object obj) {
        byte b = this.a;
        gl0 gl0Var = this.b;
        switch (b) {
            case 0:
                if (!gl0Var.x()) {
                    gl0Var.resumeWith(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!gl0Var.x()) {
                    th.getClass();
                    gl0Var.resumeWith(new sc6(th));
                }
                break;
        }
    }
}
