package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zm8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    public /* synthetic */ zm8(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = false;
        String str = this.n;
        pg6 pg6Var = (pg6) obj;
        switch (b) {
            case 0:
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1");
                try {
                    ug6VarJ0.M(1, str);
                    if (ug6VarJ0.F0() && ((int) ug6VarJ0.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    ug6VarJ0.close();
                }
            case 1:
                pg6Var.getClass();
                ug6 ug6VarJ1 = pg6Var.J0("DELETE FROM workspec WHERE id=?");
                try {
                    ug6VarJ1.M(1, str);
                    ug6VarJ1.F0();
                    return f88Var;
                } finally {
                    ug6VarJ1.close();
                }
            case 2:
                pg6Var.getClass();
                ug6 ug6VarJ2 = pg6Var.J0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ug6VarJ2.M(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ug6VarJ2.F0()) {
                        String strH0 = ug6VarJ2.h0(0);
                        lm8 lm8VarN = f57.n((int) ug6VarJ2.getLong(1));
                        strH0.getClass();
                        wm8 wm8Var = new wm8();
                        wm8Var.a = strH0;
                        wm8Var.b = lm8VarN;
                        arrayList.add(wm8Var);
                    }
                    ug6VarJ2.close();
                    return arrayList;
                } catch (Throwable th) {
                    ug6VarJ2.close();
                    throw th;
                }
            case 3:
                pg6Var.getClass();
                ug6 ug6VarJ3 = pg6Var.J0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    ug6VarJ3.M(1, str);
                    ug6VarJ3.F0();
                    return Integer.valueOf(vs1.B(pg6Var));
                } finally {
                    ug6VarJ3.close();
                }
            case 4:
                pg6Var.getClass();
                ug6 ug6VarJ4 = pg6Var.J0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    ug6VarJ4.M(1, str);
                    ug6VarJ4.F0();
                    return f88Var;
                } finally {
                    ug6VarJ4.close();
                }
            case 5:
                pg6Var.getClass();
                ug6 ug6VarJ5 = pg6Var.J0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    ug6VarJ5.M(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ug6VarJ5.F0()) {
                        byte[] blob = ug6VarJ5.getBlob(0);
                        pg1 pg1Var = pg1.b;
                        arrayList2.add(qf0.z(blob));
                    }
                    ug6VarJ5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ug6VarJ5.close();
                    throw th2;
                }
            case 6:
                pg6Var.getClass();
                ug6 ug6VarJ6 = pg6Var.J0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    ug6VarJ6.M(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (ug6VarJ6.F0()) {
                        arrayList3.add(ug6VarJ6.h0(0));
                    }
                    ug6VarJ6.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    ug6VarJ6.close();
                    throw th3;
                }
            case 7:
                pg6Var.getClass();
                ug6 ug6VarJ7 = pg6Var.J0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    ug6VarJ7.M(1, str);
                    ug6VarJ7.F0();
                    return Integer.valueOf(vs1.B(pg6Var));
                } finally {
                    ug6VarJ7.close();
                }
            default:
                pg6Var.getClass();
                ug6 ug6VarJ8 = pg6Var.J0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    ug6VarJ8.M(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (ug6VarJ8.F0()) {
                        arrayList4.add(ug6VarJ8.h0(0));
                    }
                    ug6VarJ8.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    ug6VarJ8.close();
                    throw th4;
                }
        }
    }
}
