package o;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class b35 implements y51 {
    public final ConnectivityManager a;

    public b35(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // o.y51
    public final fj0 a(q61 q61Var) {
        q61Var.getClass();
        return it1.q(new ko2(q61Var, this, null, (byte) 10));
    }

    @Override // o.y51
    public final boolean b(xm8 xm8Var) {
        q61 q61Var = xm8Var.j;
        return (q61Var.a() == null && q61Var.a == g35.m) ? false : true;
    }
}
