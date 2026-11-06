package o;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w76 extends bx2 implements Function1 {
    public static final w76 n = new w76(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "<init>";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(d86.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        constructor.getClass();
        return new d86(constructor);
    }
}
