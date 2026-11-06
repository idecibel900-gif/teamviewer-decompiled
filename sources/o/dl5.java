package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class dl5 implements se8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ dl5(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                Object objA = function0.a();
                objA.getClass();
                return (oe8) objA;
            case 1:
                Object objA2 = function0.a();
                objA2.getClass();
                return (oe8) objA2;
            default:
                Object objA3 = function0.a();
                objA3.getClass();
                return (oe8) objA3;
        }
    }
}
