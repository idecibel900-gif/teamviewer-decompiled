package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2024o;

    public /* synthetic */ sh7(int i, String str) {
        this.m = (byte) 2;
        this.f2024o = i;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        rh7 rh7Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        String str = this.n;
        int i = this.f2024o;
        pg6 pg6Var = (pg6) obj;
        switch (b) {
            case 0:
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    ug6VarJ0.M(1, str);
                    ug6VarJ0.k(2, i);
                    int iN = xs1.N(ug6VarJ0, "work_spec_id");
                    int iN2 = xs1.N(ug6VarJ0, "generation");
                    int iN3 = xs1.N(ug6VarJ0, "system_id");
                    if (ug6VarJ0.F0()) {
                        rh7Var = new rh7(ug6VarJ0.h0(iN), (int) ug6VarJ0.getLong(iN2), (int) ug6VarJ0.getLong(iN3));
                        break;
                    } else {
                        rh7Var = null;
                    }
                    return rh7Var;
                } finally {
                    ug6VarJ0.close();
                }
            case 1:
                pg6Var.getClass();
                ug6 ug6VarJ1 = pg6Var.J0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    ug6VarJ1.M(1, str);
                    ug6VarJ1.k(2, i);
                    ug6VarJ1.F0();
                    return f88Var;
                } finally {
                    ug6VarJ1.close();
                }
            default:
                pg6Var.getClass();
                ug6 ug6VarJ2 = pg6Var.J0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    ug6VarJ2.k(1, i);
                    ug6VarJ2.M(2, str);
                    ug6VarJ2.F0();
                    return f88Var;
                } finally {
                    ug6VarJ2.close();
                }
        }
    }

    public /* synthetic */ sh7(String str, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f2024o = i;
    }
}
