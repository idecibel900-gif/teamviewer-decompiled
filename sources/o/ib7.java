package o;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ib7 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        kb7 kb7Var = (kb7) obj;
        CharSequence charSequence = (CharSequence) obj2;
        db8.o0(kb7Var.a);
        if (!kb7Var.c) {
            kb7Var.a.append(kb7Var.b);
        }
        kb7Var.a.append((Object) charSequence);
        kb7Var.c = false;
    }
}
