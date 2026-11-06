package o;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class al0 implements bl0 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ al0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.bl0
    public final void b(Throwable th) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                ((t22) obj).a();
                break;
        }
    }

    public final String toString() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + di1.r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((t22) obj) + ']';
        }
    }
}
