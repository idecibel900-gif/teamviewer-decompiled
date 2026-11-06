package o;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class oz7 implements ld3 {
    public final byte a;
    public final Function0 b;
    public final nw4 c;
    public final nw4 d;
    public final nw4 e;

    /* JADX WARN: Multi-variable type inference failed */
    public oz7(int i, Drawable drawable, boolean z, Function0 function0) {
        this.a = i;
        this.b = function0;
        nw4 nw4Var = new nw4();
        nw4Var.setValue(drawable);
        this.c = nw4Var;
        nw4 nw4Var2 = new nw4();
        nw4Var2.setValue(Boolean.valueOf(z));
        this.d = nw4Var2;
        nw4 nw4Var3 = new nw4();
        nw4Var3.setValue(Boolean.TRUE);
        this.e = nw4Var3;
    }

    public final boolean a() {
        return im3.n(this.d.getValue(), Boolean.TRUE);
    }

    @Override // o.ld3
    public final int getId() {
        return this.a;
    }
}
