package o;

import androidx.lifecycle.Observer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rz7 implements Observer, qw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ rz7(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void a(Object obj) {
        byte b = this.m;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }

    @Override // o.qw2
    public final pw2 b() {
        byte b = this.m;
        return this.n;
    }

    public final boolean equals(Object obj) {
        switch (this.m) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof qw2)) {
                    return im3.n(b(), ((qw2) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.m) {
            case 0:
                break;
        }
        return b().hashCode();
    }
}
