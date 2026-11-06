package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    public /* synthetic */ fy(String str, byte b) {
        this.m = b;
        this.n = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        xm8 xm8Var;
        lm8 lm8VarN;
        byte b = this.m;
        f88 f88Var = f88.a;
        String str = this.n;
        switch (b) {
            case 0:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                lp6.d(op6Var, str);
                return f88Var;
            case 1:
                op6 op6Var2 = (op6) obj;
                lp6.g(op6Var2, 1);
                lp6.h(op6Var2, str);
                return f88Var;
            case 2:
                lp6.d((op6) obj, str);
                return f88Var;
            case 3:
                op6 op6Var3 = (op6) obj;
                lp6.h(op6Var3, str);
                np6 np6Var = kp6.u;
                fw3 fw3Var = lp6.a[11];
                Float fValueOf = Float.valueOf(0.0f);
                np6Var.getClass();
                op6Var3.d(np6Var, fValueOf);
                return f88Var;
            case 4:
                lp6.h((op6) obj, str);
                return f88Var;
            case 5:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    ug6VarJ0.M(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (ug6VarJ0.F0()) {
                        arrayList.add(ug6VarJ0.h0(0));
                    }
                    ug6VarJ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ug6VarJ0.close();
                    throw th;
                }
            case 6:
                pg6 pg6Var2 = (pg6) obj;
                pg6Var2.getClass();
                ug6 ug6VarJ1 = pg6Var2.J0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    ug6VarJ1.M(1, str);
                    return Boolean.valueOf(ug6VarJ1.F0() && ((int) ug6VarJ1.getLong(0)) != 0);
                } finally {
                    ug6VarJ1.close();
                }
            case 7:
                pg6 pg6Var3 = (pg6) obj;
                pg6Var3.getClass();
                ug6 ug6VarJ2 = pg6Var3.J0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    ug6VarJ2.M(1, str);
                    return Boolean.valueOf(ug6VarJ2.F0() && ((int) ug6VarJ2.getLong(0)) != 0);
                } finally {
                    ug6VarJ2.close();
                }
            case 8:
                op6 op6Var4 = (op6) obj;
                op6Var4.getClass();
                lp6.d(op6Var4, str);
                return f88Var;
            case ep1.b /* 9 */:
                op6 op6Var5 = (op6) obj;
                op6Var5.getClass();
                lp6.d(op6Var5, str);
                return f88Var;
            case ep1.c /* 10 */:
                op6 op6Var6 = (op6) obj;
                op6Var6.getClass();
                lp6.d(op6Var6, str);
                return f88Var;
            case 11:
                op6 op6Var7 = (op6) obj;
                lp6.d(op6Var7, str);
                lp6.i(op6Var7, 5);
                return f88Var;
            case ep1.d /* 12 */:
                op6 op6Var8 = (op6) obj;
                lp6.d(op6Var8, str);
                lp6.i(op6Var8, 5);
                return f88Var;
            case 13:
                pg6 pg6Var4 = (pg6) obj;
                pg6Var4.getClass();
                ug6 ug6VarJ3 = pg6Var4.J0("SELECT long_value FROM Preference where `key`=?");
                try {
                    ug6VarJ3.M(1, str);
                    if (ug6VarJ3.F0() && !ug6VarJ3.isNull(0)) {
                        lValueOf = Long.valueOf(ug6VarJ3.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    ug6VarJ3.close();
                }
            case 14:
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                return Boolean.valueOf(ub7.Q(z31Var.a, str, true));
            case 15:
                x46 x46Var = (x46) obj;
                x46Var.getClass();
                boolean z = true;
                if (!ub7.Q(ds1.a0(x46Var.a), ds1.a0(str), true) && !ub7.Q(x46Var.b, str, true)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                lp6.d((op6) obj, str);
                return f88Var;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                if (ub7.b0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                op6 op6Var9 = (op6) obj;
                op6Var9.getClass();
                lp6.d(op6Var9, au8.R(str));
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                op6 op6Var10 = (op6) obj;
                op6Var10.getClass();
                lp6.d(op6Var10, au8.R(str));
                return f88Var;
            case 20:
                pg6 pg6Var5 = (pg6) obj;
                pg6Var5.getClass();
                ug6 ug6VarJ4 = pg6Var5.J0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    ug6VarJ4.M(1, str);
                    ug6VarJ4.F0();
                    return f88Var;
                } finally {
                    ug6VarJ4.close();
                }
            case 21:
                op6 op6Var11 = (op6) obj;
                op6Var11.getClass();
                lp6.d(op6Var11, str);
                return f88Var;
            case 22:
                op6 op6Var12 = (op6) obj;
                op6Var12.getClass();
                lp6.d(op6Var12, str);
                return f88Var;
            case 23:
                fw3[] fw3VarArr = lp6.a;
                ((op6) obj).d(kp6.O, str);
                return f88Var;
            case 24:
                op6 op6Var13 = (op6) obj;
                lp6.g(op6Var13, 1);
                lp6.h(op6Var13, str);
                return f88Var;
            case 25:
                pg6 pg6Var6 = (pg6) obj;
                pg6Var6.getClass();
                ug6 ug6VarJ5 = pg6Var6.J0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    ug6VarJ5.M(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (ug6VarJ5.F0()) {
                        arrayList2.add(ug6VarJ5.h0(0));
                    }
                    ug6VarJ5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ug6VarJ5.close();
                    throw th2;
                }
            case 26:
                pg6 pg6Var7 = (pg6) obj;
                pg6Var7.getClass();
                ug6 ug6VarJ6 = pg6Var7.J0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    ug6VarJ6.M(1, str);
                    ug6VarJ6.F0();
                    return f88Var;
                } finally {
                    ug6VarJ6.close();
                }
            case 27:
                pg6 pg6Var8 = (pg6) obj;
                pg6Var8.getClass();
                ug6 ug6VarJ7 = pg6Var8.J0("SELECT * FROM workspec WHERE id=?");
                try {
                    ug6VarJ7.M(1, str);
                    int iN = xs1.N(ug6VarJ7, "id");
                    int iN2 = xs1.N(ug6VarJ7, "state");
                    int iN3 = xs1.N(ug6VarJ7, "worker_class_name");
                    int iN4 = xs1.N(ug6VarJ7, "input_merger_class_name");
                    int iN5 = xs1.N(ug6VarJ7, "input");
                    int iN6 = xs1.N(ug6VarJ7, "output");
                    int iN7 = xs1.N(ug6VarJ7, "initial_delay");
                    int iN8 = xs1.N(ug6VarJ7, "interval_duration");
                    int iN9 = xs1.N(ug6VarJ7, "flex_duration");
                    int iN10 = xs1.N(ug6VarJ7, "run_attempt_count");
                    int iN11 = xs1.N(ug6VarJ7, "backoff_policy");
                    int iN12 = xs1.N(ug6VarJ7, "backoff_delay_duration");
                    int iN13 = xs1.N(ug6VarJ7, "last_enqueue_time");
                    int iN14 = xs1.N(ug6VarJ7, "minimum_retention_duration");
                    int iN15 = xs1.N(ug6VarJ7, "schedule_requested_at");
                    int iN16 = xs1.N(ug6VarJ7, "run_in_foreground");
                    int iN17 = xs1.N(ug6VarJ7, "out_of_quota_policy");
                    int iN18 = xs1.N(ug6VarJ7, "period_count");
                    int iN19 = xs1.N(ug6VarJ7, "generation");
                    int iN20 = xs1.N(ug6VarJ7, "next_schedule_time_override");
                    int iN21 = xs1.N(ug6VarJ7, "next_schedule_time_override_generation");
                    int iN22 = xs1.N(ug6VarJ7, "stop_reason");
                    int iN23 = xs1.N(ug6VarJ7, "trace_tag");
                    int iN24 = xs1.N(ug6VarJ7, "backoff_on_system_interruptions");
                    int iN25 = xs1.N(ug6VarJ7, "required_network_type");
                    int iN26 = xs1.N(ug6VarJ7, "required_network_request");
                    int iN27 = xs1.N(ug6VarJ7, "requires_charging");
                    int iN28 = xs1.N(ug6VarJ7, "requires_device_idle");
                    int iN29 = xs1.N(ug6VarJ7, "requires_battery_not_low");
                    int iN30 = xs1.N(ug6VarJ7, "requires_storage_not_low");
                    int iN31 = xs1.N(ug6VarJ7, "trigger_content_update_delay");
                    int iN32 = xs1.N(ug6VarJ7, "trigger_max_content_delay");
                    int iN33 = xs1.N(ug6VarJ7, "content_uri_triggers");
                    if (ug6VarJ7.F0()) {
                        String strH0 = ug6VarJ7.h0(iN);
                        lm8 lm8VarN2 = f57.n((int) ug6VarJ7.getLong(iN2));
                        String strH1 = ug6VarJ7.h0(iN3);
                        String strH2 = ug6VarJ7.h0(iN4);
                        byte[] blob = ug6VarJ7.getBlob(iN5);
                        pg1 pg1Var = pg1.b;
                        pg1 pg1VarZ = qf0.z(blob);
                        pg1 pg1VarZ2 = qf0.z(ug6VarJ7.getBlob(iN6));
                        long j = ug6VarJ7.getLong(iN7);
                        long j2 = ug6VarJ7.getLong(iN8);
                        long j3 = ug6VarJ7.getLong(iN9);
                        int i = (int) ug6VarJ7.getLong(iN10);
                        g20 g20VarK = f57.k((int) ug6VarJ7.getLong(iN11));
                        long j4 = ug6VarJ7.getLong(iN12);
                        long j5 = ug6VarJ7.getLong(iN13);
                        long j6 = ug6VarJ7.getLong(iN14);
                        long j7 = ug6VarJ7.getLong(iN15);
                        boolean z2 = ((int) ug6VarJ7.getLong(iN16)) != 0;
                        jb5 jb5VarM = f57.m((int) ug6VarJ7.getLong(iN17));
                        int i2 = (int) ug6VarJ7.getLong(iN18);
                        int i3 = (int) ug6VarJ7.getLong(iN19);
                        long j8 = ug6VarJ7.getLong(iN20);
                        int i4 = (int) ug6VarJ7.getLong(iN21);
                        int i5 = (int) ug6VarJ7.getLong(iN22);
                        String strH3 = ug6VarJ7.isNull(iN23) ? null : ug6VarJ7.h0(iN23);
                        Integer numValueOf = ug6VarJ7.isNull(iN24) ? null : Integer.valueOf((int) ug6VarJ7.getLong(iN24));
                        xm8Var = new xm8(strH0, lm8VarN2, strH1, strH2, pg1VarZ, pg1VarZ2, j, j2, j3, new q61(f57.s(ug6VarJ7.getBlob(iN26)), f57.l((int) ug6VarJ7.getLong(iN25)), ((int) ug6VarJ7.getLong(iN27)) != 0, ((int) ug6VarJ7.getLong(iN28)) != 0, ((int) ug6VarJ7.getLong(iN29)) != 0, ((int) ug6VarJ7.getLong(iN30)) != 0, ug6VarJ7.getLong(iN31), ug6VarJ7.getLong(iN32), f57.f(ug6VarJ7.getBlob(iN33))), i, g20VarK, j4, j5, j6, j7, z2, jb5VarM, i2, i3, j8, i4, i5, strH3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        xm8Var = null;
                    }
                    return xm8Var;
                } finally {
                    ug6VarJ7.close();
                }
            case 28:
                pg6 pg6Var9 = (pg6) obj;
                pg6Var9.getClass();
                ug6 ug6VarJ8 = pg6Var9.J0("SELECT state FROM workspec WHERE id=?");
                try {
                    ug6VarJ8.M(1, str);
                    if (ug6VarJ8.F0()) {
                        Integer numValueOf2 = ug6VarJ8.isNull(0) ? null : Integer.valueOf((int) ug6VarJ8.getLong(0));
                        if (numValueOf2 != null) {
                            lm8VarN = f57.n(numValueOf2.intValue());
                        } else {
                            lm8VarN = null;
                        }
                        break;
                    } else {
                        lm8VarN = null;
                    }
                    return lm8VarN;
                } finally {
                    ug6VarJ8.close();
                }
            default:
                pg6 pg6Var10 = (pg6) obj;
                pg6Var10.getClass();
                ug6 ug6VarJ9 = pg6Var10.J0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    ug6VarJ9.M(1, str);
                    ug6VarJ9.F0();
                    return Integer.valueOf(vs1.B(pg6Var10));
                } finally {
                    ug6VarJ9.close();
                }
        }
    }
}
