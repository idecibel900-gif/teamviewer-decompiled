package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xo4 implements zp0 {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ xo4(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // o.zp0
    public final String a(eo3 eo3Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return uf0.q(this, eo3Var);
    }

    @Override // o.zp0
    public final String getDescription() {
        byte b = this.a;
        return this.b;
    }
}
