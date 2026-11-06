package o;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z76 extends bx2 implements Function1 {
    public static final z76 n = new z76(1);

    @Override // o.bj0, o.rt3
    public final String getName() {
        return "<init>";
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        return w86.a.b(j86.class);
    }

    @Override // o.bj0
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        method.getClass();
        return new j86(method);
    }
}
