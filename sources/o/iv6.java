package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iv6 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final Function1 g;
    public final Function0 h;
    public final Function1 i;
    public final Function1 j;
    public final Function0 k;
    public final Function1 l;
    public final Function0 m;
    public final Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f1109o;
    public final Function1 p;

    public iv6(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function0 function0, Function1 function8, Function1 function9, Function0 function10, Function1 function11, Function0 function12, Function1 function13, Function1 function14, Function1 function15) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function0.getClass();
        function8.getClass();
        function9.getClass();
        function10.getClass();
        function11.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function6;
        this.g = function7;
        this.h = function0;
        this.i = function8;
        this.j = function9;
        this.k = function10;
        this.l = function11;
        this.m = function12;
        this.n = function13;
        this.f1109o = function14;
        this.p = function15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv6)) {
            return false;
        }
        iv6 iv6Var = (iv6) obj;
        return im3.n(this.a, iv6Var.a) && im3.n(this.b, iv6Var.b) && im3.n(this.c, iv6Var.c) && im3.n(this.d, iv6Var.d) && im3.n(this.e, iv6Var.e) && im3.n(this.f, iv6Var.f) && im3.n(this.g, iv6Var.g) && im3.n(this.h, iv6Var.h) && im3.n(this.i, iv6Var.i) && im3.n(this.j, iv6Var.j) && im3.n(this.k, iv6Var.k) && im3.n(this.l, iv6Var.l) && im3.n(this.m, iv6Var.m) && im3.n(this.n, iv6Var.n) && im3.n(this.f1109o, iv6Var.f1109o) && im3.n(this.p, iv6Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ua5.d(ua5.d(e41.f(ua5.d(e41.f(ua5.d(ua5.d(e41.f(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.f1109o);
    }

    public final String toString() {
        return "SettingsActionHandler(setRemoteCursorSwitchState=" + this.a + ", setWallpaperSwitchState=" + this.b + ", setUdpSwitchState=" + this.c + ", setRemoteAudioSwitchState=" + this.d + ", setBiometricsSwitchState=" + this.e + ", setSavePasswordsSwitchState=" + this.f + ", setAdvancedLoggingStatus=" + this.g + ", incrementAttractionGuidClickCount=" + this.h + ", openAttractionGuid=" + this.i + ", showSnackbar=" + this.j + ", dismissSnackbar=" + this.k + ", setLockTime=" + this.l + ", updateAccountDetailsVisibility=" + this.m + ", setNativeSessionRCSwitchState=" + this.n + ", setNativeSessionFTSwitchState=" + this.f1109o + ", setDevicesRedesignSwitchState=" + this.p + ")";
    }
}
