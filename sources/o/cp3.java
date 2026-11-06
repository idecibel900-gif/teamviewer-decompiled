package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lo/cp3;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cp3 extends CancellationException {
    public final transient op3 m;

    public cp3(String str, Throwable th, op3 op3Var) {
        super(str);
        this.m = op3Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return false;
        }
        cp3 cp3Var = (cp3) obj;
        if (!im3.n(cp3Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = cp3Var.m;
        if (obj2 == null) {
            obj2 = q45.n;
        }
        Object obj3 = this.m;
        if (obj3 == null) {
            obj3 = q45.n;
        }
        return im3.n(obj2, obj3) && im3.n(cp3Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.m;
        if (obj == null) {
            obj = q45.n;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.m;
        if (obj == null) {
            obj = q45.n;
        }
        sb.append(obj);
        return sb.toString();
    }
}
