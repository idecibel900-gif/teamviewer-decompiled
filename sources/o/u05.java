package o;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/u05;", "T", "Lo/ut2;", "<init>", "()V", "backstacklib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class u05<T> extends ut2 {
    public j20 p0;

    public abstract void A0(Object obj);

    @Override // o.ut2
    public final void U(Context context) {
        super.U(context);
        if (context instanceof j20) {
            j20 j20Var = (j20) context;
            this.p0 = j20Var;
            j20Var.O = this;
        }
    }

    @Override // o.ut2
    public final void c0() {
        this.S = true;
        this.p0 = null;
    }
}
