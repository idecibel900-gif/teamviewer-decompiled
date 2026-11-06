package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r81 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final Function1 g;
    public final Function1 h;

    public r81(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function6;
        this.g = function7;
        this.h = function8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r81)) {
            return false;
        }
        r81 r81Var = (r81) obj;
        return im3.n(this.a, r81Var.a) && im3.n(this.b, r81Var.b) && im3.n(this.c, r81Var.c) && im3.n(this.d, r81Var.d) && im3.n(this.e, r81Var.e) && im3.n(this.f, r81Var.f) && im3.n(this.g, r81Var.g) && im3.n(this.h, r81Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "ContactListItemActions(onConnectClick=" + this.a + ", onFileTransferClick=" + this.b + ", onShowDetailsClick=" + this.c + ", onSendMessageClick=" + this.d + ", onEditContactClick=" + this.e + ", onRemoveContactClick=" + this.f + ", onMoreMenuOpened=" + this.g + ", onMoreMenuClosed=" + this.h + ")";
    }
}
