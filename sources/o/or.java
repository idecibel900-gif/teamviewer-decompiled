package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ or(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        byte b2 = 3;
        byte b3 = 1;
        f88 f88Var = f88.a;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                ((jd6) obj).b(((Number) function0.a()).floatValue());
                return f88Var;
            case 1:
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                h44.a(h44Var, null, new yy0(-1224479752, true, new k80(function0, b3)), 3);
                return f88Var;
            case 2:
                function0.a();
                return f88Var;
            case 3:
                h44 h44Var2 = (h44) obj;
                h44Var2.getClass();
                h44.a(h44Var2, null, new yy0(-34135434, true, new k80(function0, b2)), 3);
                return f88Var;
            case 4:
                jd6 jd6Var = (jd6) obj;
                jd6Var.getClass();
                jd6Var.j(((Number) function0.a()).floatValue());
                return f88Var;
            case 5:
                function0.a();
                return f88Var;
            case 6:
                ((Boolean) obj).booleanValue();
                function0.a();
                return f88Var;
            case 7:
                obj.getClass();
                return function0.a();
            default:
                return (t65) function0.a();
        }
    }
}
