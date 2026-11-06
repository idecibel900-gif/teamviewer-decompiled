package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ap1 extends bx2 implements Function1 {
    public static final ap1 n = new ap1(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(qb8.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qb8 qb8Var = (qb8) obj;
        qb8Var.getClass();
        return Boolean.valueOf(qb8Var.E0());
    }
}
