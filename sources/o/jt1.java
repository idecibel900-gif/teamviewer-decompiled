package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class jt1 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;

    public jt1(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return false;
        }
        jt1 jt1Var = (jt1) obj;
        return im3.n(this.a, jt1Var.a) && im3.n(this.b, jt1Var.b) && im3.n(this.c, jt1Var.c) && im3.n(this.d, jt1Var.d) && im3.n(this.e, jt1Var.e) && im3.n(this.f, jt1Var.f) && im3.n(this.g, jt1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + e41.f(e41.f(e41.f(e41.f(e41.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "DeviceInfoScreenActions(onConnectClick=" + this.a + ", onPromptForConfirmationClick=" + this.b + ", onFileTransferClick=" + this.c + ", onSendMessageClick=" + this.d + ", onCreateDeviceShortcutClick=" + this.e + ", onDeleteDeviceClick=" + this.f + ", onWakeDeviceClick=" + this.g + ")";
    }
}
