package o;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jb7 implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        kb7 kb7Var = (kb7) obj;
        kb7 kb7Var2 = (kb7) obj2;
        String strK = lb7.k(kb7Var2.a);
        kb7Var2.a = null;
        db8.o0(kb7Var.a);
        kb7Var.a.append((Object) strK);
        return kb7Var;
    }
}
