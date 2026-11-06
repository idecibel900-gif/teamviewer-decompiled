package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class st1 implements q22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ px4 b;
    public final /* synthetic */ px4 c;
    public final /* synthetic */ px4 d;

    public /* synthetic */ st1(px4 px4Var, px4 px4Var2, px4 px4Var3, byte b) {
        this.a = b;
        this.b = px4Var;
        this.c = px4Var2;
        this.d = px4Var3;
    }

    @Override // o.q22
    public final void a() {
        byte b = this.a;
        px4 px4Var = this.d;
        px4 px4Var2 = this.c;
        px4 px4Var3 = this.b;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) px4Var3.getValue();
                Boolean bool = Boolean.FALSE;
                function1.invoke(bool);
                ((Function1) px4Var2.getValue()).invoke(bool);
                ((Function1) px4Var.getValue()).invoke(bool);
                break;
            default:
                Function1 function2 = (Function1) px4Var3.getValue();
                Boolean bool2 = Boolean.FALSE;
                function2.invoke(bool2);
                ((Function1) px4Var2.getValue()).invoke(bool2);
                ((Function1) px4Var.getValue()).invoke(null);
                break;
        }
    }
}
