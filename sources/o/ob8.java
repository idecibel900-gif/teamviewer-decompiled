package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ob8 extends xo4 {
    public static final ob8 d = new ob8("must have no value parameters", 0);
    public static final ob8 e = new ob8("must have a single value parameter", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob8(String str, byte b) {
        super(str, (byte) 1);
        this.c = b;
    }

    @Override // o.zp0
    public final boolean b(eo3 eo3Var) {
        switch (this.c) {
            case 0:
                return eo3Var.J().isEmpty();
            case 1:
                return eo3Var.J().size() == 1;
            default:
                return eo3Var.J().size() == 2;
        }
    }
}
