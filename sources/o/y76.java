package o;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y76 extends bx2 implements Function1 {
    public static final y76 n = new y76(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "<init>";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(g86.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        field.getClass();
        return new g86(field);
    }
}
