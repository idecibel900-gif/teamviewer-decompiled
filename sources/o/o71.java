package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o71 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public final Function1 h;

    public o71(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function1 function7) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = function7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return im3.n(this.a, o71Var.a) && im3.n(this.b, o71Var.b) && im3.n(this.c, o71Var.c) && im3.n(this.d, o71Var.d) && im3.n(this.e, o71Var.e) && im3.n(this.f, o71Var.f) && im3.n(this.g, o71Var.g) && im3.n(this.h, o71Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + e41.f(e41.f(e41.f(e41.f(e41.f(e41.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "ContactInfoScreenActions(onConnectClick=" + this.a + ", onFileTransferClick=" + this.b + ", onSendMessageClick=" + this.c + ", onRemoveContactClick=" + this.d + ", onConfirmRemoveContact=" + this.e + ", onDismissRemoveContactConfirmationDialog=" + this.f + ", onDismissChooseComputerOfContact=" + this.g + ", onDeviceClick=" + this.h + ")";
    }
}
