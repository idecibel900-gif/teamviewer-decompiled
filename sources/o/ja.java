package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ja {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final Function0 g;
    public final Function1 h;

    public ja(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function0 function0, Function1 function7) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function0.getClass();
        function7.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function6;
        this.g = function0;
        this.h = function7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return im3.n(this.a, jaVar.a) && im3.n(this.b, jaVar.b) && im3.n(this.c, jaVar.c) && im3.n(this.d, jaVar.d) && im3.n(this.e, jaVar.e) && im3.n(this.f, jaVar.f) && im3.n(this.g, jaVar.g) && im3.n(this.h, jaVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + e41.f(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "AddRemoteControlViaIdUiActions(updateDeviceName=" + this.a + ", updateTeamviewerId=" + this.b + ", updateGroup=" + this.c + ", setPreSelectedGroup=" + this.d + ", updatePassword=" + this.e + ", updateDescription=" + this.f + ", addDevice=" + this.g + ", showBottomSheetView=" + this.h + ")";
    }
}
