package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yn1 {
    public final /* synthetic */ byte a = 1;
    public final Function1 b;
    public final Function1 c;

    public yn1(yn1 yn1Var) {
        this.b = new xn1(yn1Var, (byte) 0);
        this.c = new xn1(yn1Var, (byte) 1);
    }

    public final Function1 a() {
        switch (this.a) {
            case 0:
                return (xn1) this.b;
            default:
                return this.c;
        }
    }

    public final Function1 b() {
        switch (this.a) {
            case 0:
                return (xn1) this.c;
            default:
                return this.b;
        }
    }

    public yn1(Function1 function1, Function1 function2) {
        this.b = function1;
        this.c = function2;
    }
}
