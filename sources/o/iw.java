package o;

/* JADX INFO: loaded from: classes2.dex */
public final class iw extends vb4 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw(fq6 fq6Var, byte b) {
        super(fq6Var);
        this.b = b;
    }

    @Override // o.fq6
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
