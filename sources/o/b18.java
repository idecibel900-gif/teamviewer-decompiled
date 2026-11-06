package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b18 implements k30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b18(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.k30
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c18) obj).k = true;
                break;
            case 1:
                ((c18) obj).k = true;
                break;
            case 2:
                ((c18) obj).k = true;
                break;
            default:
                p30 p30Var = (p30) obj;
                boolean z = p30Var.r.i() == 1.0f;
                if (z != p30Var.x) {
                    p30Var.x = z;
                    p30Var.f1698o.invalidateSelf();
                }
                break;
        }
    }
}
