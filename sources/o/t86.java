package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t86 extends bx2 implements hw2 {
    public static final t86 n = new t86(2);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "loadFunction";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(vo4.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        vo4 vo4Var = (vo4) obj;
        iv5 iv5Var = (iv5) obj2;
        vo4Var.getClass();
        iv5Var.getClass();
        return vo4Var.e(iv5Var);
    }
}
