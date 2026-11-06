package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class no5 implements u06, lo5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.u06
    public final pg6 c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((to5) obj).a;
            default:
                return ((ff7) obj).a;
        }
    }

    @Override // o.lo5
    public final Object d(String str, Function1 function1, jc1 jc1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((to5) obj).d(str, function1, jc1Var);
            default:
                return ((ff7) obj).d(str, function1, jc1Var);
        }
    }
}
