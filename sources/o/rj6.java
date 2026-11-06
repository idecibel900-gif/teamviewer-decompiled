package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class rj6 {
    public final Function0 a;
    public final Function0 b;

    public rj6(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + this.a.a() + ", maxValue=" + this.b.a() + ", reverseScrolling=false)";
    }
}
