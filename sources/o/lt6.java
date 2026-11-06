package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class lt6 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;

    public lt6(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5) {
        oq6 oq6Var = new oq6((byte) 26);
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = oq6Var;
        this.e = function3;
        this.f = function4;
        this.g = function5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt6)) {
            return false;
        }
        lt6 lt6Var = (lt6) obj;
        return this.a.equals(lt6Var.a) && this.b.equals(lt6Var.b) && this.c.equals(lt6Var.c) && this.d.equals(lt6Var.d) && this.e.equals(lt6Var.e) && this.f.equals(lt6Var.f) && this.g.equals(lt6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + e41.f(e41.f(e41.f(e41.f(e41.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "SessionInfoUiActions(onStartSessionClick=" + this.a + ", onMoreOptionsClick=" + this.b + ", onShareSessionClick=" + this.c + ", onShowSessionMoreOptionsClick=" + this.d + ", onAssignSessionToMeClick=" + this.e + ", onUnassignSessionClick=" + this.f + ", onDeleteSessionClick=" + this.g + ")";
    }
}
