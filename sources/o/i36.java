package o;

/* JADX INFO: loaded from: classes2.dex */
public final class i36 extends wz0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ez3 f1032o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i36(ez3 ez3Var, byte b) {
        super((byte) 1);
        this.n = b;
        this.f1032o = ez3Var;
    }

    @Override // o.wz0
    public final void f(String[] strArr) {
        byte b = this.n;
        ez3 ez3Var = this.f1032o;
        switch (b) {
            case 0:
                if (strArr == null) {
                    hk0.g("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((j36) ez3Var).n.p = strArr;
                }
                break;
            case 1:
                if (strArr == null) {
                    hk0.g("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((j36) ez3Var).n.q = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    hk0.g("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((j36) ez3Var).n.t = strArr;
                }
                break;
        }
    }
}
