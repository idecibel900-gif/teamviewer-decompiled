package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ my0 n;

    public /* synthetic */ cy0(my0 my0Var, byte b) {
        this.m = b;
        this.n = my0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        byte b2 = 0;
        my0 my0Var = this.n;
        switch (b) {
            case 0:
                my0Var.reportFullyDrawn();
                return f88.a;
            case 1:
                return new tv2(my0Var.r, new cy0(my0Var, b2));
            case 2:
                o12 o12Var = new o12();
                my0Var.e().A(o12Var);
                return o12Var;
            case 3:
                return new bi6(my0Var.getApplication(), my0Var, my0Var.getIntent() != null ? my0Var.getIntent().getExtras() : null);
            default:
                o75 o75Var = new o75(new by0(my0Var, (byte) 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (im3.n(Looper.myLooper(), Looper.getMainLooper())) {
                        my0Var.m.a(new dy0(o75Var, my0Var, b2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new io.sentry.u4((Object) my0Var, (Object) o75Var, (byte) 22));
                    }
                }
                return o75Var;
        }
    }
}
