package o;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ el n;

    public /* synthetic */ zk(el elVar, byte b) {
        this.m = b;
        this.n = elVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        el elVar = this.n;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = elVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new lg(function0, (byte) 2));
                    }
                }
                return f88Var;
            case 1:
                ActionMode actionMode = elVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return f88Var;
            case 2:
                ActionMode actionMode2 = elVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return f88Var;
            default:
                elVar.e.g();
                return new m8(elVar, (byte) 3);
        }
    }
}
