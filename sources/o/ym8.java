package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ym8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2624o;

    public /* synthetic */ ym8(long j, byte b, String str) {
        this.m = b;
        this.n = j;
        this.f2624o = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.m;
        String str = this.f2624o;
        long j = this.n;
        pg6 pg6Var = (pg6) obj;
        switch (b) {
            case 0:
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    ug6VarJ0.k(1, j);
                    ug6VarJ0.M(2, str);
                    ug6VarJ0.F0();
                    return f88.a;
                } finally {
                    ug6VarJ0.close();
                }
            default:
                pg6Var.getClass();
                ug6 ug6VarJ1 = pg6Var.J0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    ug6VarJ1.k(1, j);
                    ug6VarJ1.M(2, str);
                    ug6VarJ1.F0();
                    return Integer.valueOf(vs1.B(pg6Var));
                } finally {
                    ug6VarJ1.close();
                }
        }
    }
}
