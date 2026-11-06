package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hb {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function1 g;
    public final Function1 h;

    public hb(Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7) {
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function6.getClass();
        function7.getClass();
        this.a = function3;
        this.b = function4;
        this.c = function5;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function6;
        this.h = function7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return im3.n(this.a, hbVar.a) && im3.n(this.b, hbVar.b) && im3.n(this.c, hbVar.c) && im3.n(this.d, hbVar.d) && im3.n(this.e, hbVar.e) && im3.n(this.f, hbVar.f) && im3.n(this.g, hbVar.g) && im3.n(this.h, hbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua5.d(e41.f(e41.f(e41.f(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "AddRemoteDeviceToYourAccountUiActions(updateDeviceName=" + this.a + ", updateGroups=" + this.b + ", setPreSelectedGroup=" + this.c + ", getCustomModuleLink=" + this.d + ", scanQrCode=" + this.e + ", shareAssignmentLinkError=" + this.f + ", copyAssignmentLink=" + this.g + ", showBottomSheetView=" + this.h + ")";
    }
}
