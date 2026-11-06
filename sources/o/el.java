package o;

import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class el implements op7 {
    public final View a;
    public final Function1 b;
    public final Function0 c;
    public final iy4 d = new iy4();
    public final br5 e = new br5(new zk(this, 0));
    public final zk f = new zk(this, 1);
    public final zk g = new zk(this, 2);
    public ActionMode h;
    public io.sentry.android.core.internal.util.j i;
    public Runnable j;

    public el(View view, Function1 function1, Function0 function0) {
        this.a = view;
        this.b = function1;
        this.c = function0;
    }

    @Override // o.op7
    public final Object a(fp7 fp7Var, og7 og7Var) {
        Object objA = iy4.a(this.d, new jf(this, fp7Var, null, (byte) 1), og7Var);
        return objA == ne1.m ? objA : f88.a;
    }
}
