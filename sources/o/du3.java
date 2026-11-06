package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class du3 extends bx2 implements hw2 {
    public static final du3 n = new du3(2);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "loadProperty";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(vo4.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        vo4 vo4Var = (vo4) obj;
        qv5 qv5Var = (qv5) obj2;
        vo4Var.getClass();
        qv5Var.getClass();
        return vo4Var.f(qv5Var);
    }
}
