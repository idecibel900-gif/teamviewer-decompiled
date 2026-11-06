package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wo4 extends xo4 {
    public static final wo4 d = new wo4("must be a member function", 0);
    public static final wo4 e = new wo4("must be a member or an extension function", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo4(String str, byte b) {
        super(str, (byte) 0);
        this.c = b;
    }

    @Override // o.zp0
    public final boolean b(eo3 eo3Var) {
        switch (this.c) {
            case 0:
                return eo3Var.v != null;
            default:
                return (eo3Var.v == null && eo3Var.u == null) ? false : true;
        }
    }
}
