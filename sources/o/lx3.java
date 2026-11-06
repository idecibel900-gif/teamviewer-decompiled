package o;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lx3 extends es4 implements kx3 {
    public Function1 A;
    public Function1 B;

    @Override // o.kx3
    public final boolean A(KeyEvent keyEvent) {
        Function1 function1 = this.A;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new dx3(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // o.kx3
    public final boolean h(KeyEvent keyEvent) {
        Function1 function1 = this.B;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new dx3(keyEvent))).booleanValue();
        }
        return false;
    }
}
