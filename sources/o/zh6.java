package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zh6 {
    public final ai6 a;
    public final y26 b;
    public final el5 c = new el5((byte) 11);
    public final jx4 d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public zh6(ai6 ai6Var, y26 y26Var) {
        this.a = ai6Var;
        this.b = y26Var;
        long[] jArr = ti6.a;
        this.d = new jx4();
        this.h = true;
    }

    public final void a() {
        ai6 ai6Var = this.a;
        if (ai6Var.getR().i != m84.n) {
            hk0.l("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                hk0.l("SavedStateRegistry was already attached.");
                return;
            }
            this.b.a();
            ai6Var.getR().a(new yh6(this, (byte) 0));
            this.e = true;
        }
    }
}
