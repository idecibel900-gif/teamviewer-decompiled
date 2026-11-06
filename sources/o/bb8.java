package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb8 {
    public a81 a;

    public abstract void a(u52 u52Var);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(a81 a81Var) {
        this.a = a81Var;
    }
}
