package o;

/* JADX INFO: loaded from: classes2.dex */
public final class k36 extends wz0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j36 f1226o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k36(j36 j36Var, byte b) {
        super((byte) 1);
        this.n = b;
        this.f1226o = j36Var;
    }

    @Override // o.wz0
    public final void f(String[] strArr) {
        byte b = this.n;
        j36 j36Var = this.f1226o;
        switch (b) {
            case 0:
                if (strArr == null) {
                    hk0.g("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    j36Var.n.p = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    hk0.g("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    j36Var.n.q = strArr;
                }
                break;
        }
    }
}
