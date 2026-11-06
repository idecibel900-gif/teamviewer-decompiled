package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb8 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ yb8(byte b) {
        this.m = b;
    }

    private final Object c(Object obj) throws Exception {
        pg6 pg6Var = (pg6) obj;
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        try {
            ug6VarJ0.k(1, 20L);
            int iN = xs1.N(ug6VarJ0, "id");
            int iN2 = xs1.N(ug6VarJ0, "state");
            int iN3 = xs1.N(ug6VarJ0, "worker_class_name");
            int iN4 = xs1.N(ug6VarJ0, "input_merger_class_name");
            int iN5 = xs1.N(ug6VarJ0, "input");
            int iN6 = xs1.N(ug6VarJ0, "output");
            int iN7 = xs1.N(ug6VarJ0, "initial_delay");
            int iN8 = xs1.N(ug6VarJ0, "interval_duration");
            int iN9 = xs1.N(ug6VarJ0, "flex_duration");
            int iN10 = xs1.N(ug6VarJ0, "run_attempt_count");
            int iN11 = xs1.N(ug6VarJ0, "backoff_policy");
            int iN12 = xs1.N(ug6VarJ0, "backoff_delay_duration");
            int iN13 = xs1.N(ug6VarJ0, "last_enqueue_time");
            int iN14 = xs1.N(ug6VarJ0, "minimum_retention_duration");
            int iN15 = xs1.N(ug6VarJ0, "schedule_requested_at");
            int iN16 = xs1.N(ug6VarJ0, "run_in_foreground");
            int iN17 = xs1.N(ug6VarJ0, "out_of_quota_policy");
            int iN18 = xs1.N(ug6VarJ0, "period_count");
            int iN19 = xs1.N(ug6VarJ0, "generation");
            int iN20 = xs1.N(ug6VarJ0, "next_schedule_time_override");
            int iN21 = xs1.N(ug6VarJ0, "next_schedule_time_override_generation");
            int iN22 = xs1.N(ug6VarJ0, "stop_reason");
            int iN23 = xs1.N(ug6VarJ0, "trace_tag");
            int iN24 = xs1.N(ug6VarJ0, "backoff_on_system_interruptions");
            int iN25 = xs1.N(ug6VarJ0, "required_network_type");
            int iN26 = xs1.N(ug6VarJ0, "required_network_request");
            int iN27 = xs1.N(ug6VarJ0, "requires_charging");
            int iN28 = xs1.N(ug6VarJ0, "requires_device_idle");
            int iN29 = xs1.N(ug6VarJ0, "requires_battery_not_low");
            int iN30 = xs1.N(ug6VarJ0, "requires_storage_not_low");
            int iN31 = xs1.N(ug6VarJ0, "trigger_content_update_delay");
            int iN32 = xs1.N(ug6VarJ0, "trigger_max_content_delay");
            int iN33 = xs1.N(ug6VarJ0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (ug6VarJ0.F0()) {
                String strH0 = ug6VarJ0.h0(iN);
                int i = iN13;
                int i2 = iN14;
                lm8 lm8VarN = f57.n((int) ug6VarJ0.getLong(iN2));
                String strH1 = ug6VarJ0.h0(iN3);
                String strH2 = ug6VarJ0.h0(iN4);
                byte[] blob = ug6VarJ0.getBlob(iN5);
                pg1 pg1Var = pg1.b;
                pg1 pg1VarZ = qf0.z(blob);
                pg1 pg1VarZ2 = qf0.z(ug6VarJ0.getBlob(iN6));
                long j = ug6VarJ0.getLong(iN7);
                long j2 = ug6VarJ0.getLong(iN8);
                long j3 = ug6VarJ0.getLong(iN9);
                int i3 = (int) ug6VarJ0.getLong(iN10);
                int i4 = iN;
                int i5 = iN2;
                g20 g20VarK = f57.k((int) ug6VarJ0.getLong(iN11));
                long j4 = ug6VarJ0.getLong(iN12);
                long j5 = ug6VarJ0.getLong(i);
                long j6 = ug6VarJ0.getLong(i2);
                int i6 = iN15;
                long j7 = ug6VarJ0.getLong(i6);
                iN15 = i6;
                int i7 = iN16;
                int i8 = iN3;
                boolean z = ((int) ug6VarJ0.getLong(i7)) != 0;
                int i9 = iN17;
                int i10 = iN4;
                jb5 jb5VarM = f57.m((int) ug6VarJ0.getLong(i9));
                int i11 = iN18;
                int i12 = (int) ug6VarJ0.getLong(i11);
                int i13 = iN19;
                int i14 = (int) ug6VarJ0.getLong(i13);
                int i15 = iN20;
                long j8 = ug6VarJ0.getLong(i15);
                int i16 = iN21;
                int i17 = (int) ug6VarJ0.getLong(i16);
                iN21 = i16;
                iN22 = iN22;
                int i18 = (int) ug6VarJ0.getLong(iN22);
                int i19 = iN23;
                Boolean boolValueOf = null;
                String strH3 = ug6VarJ0.isNull(i19) ? null : ug6VarJ0.h0(i19);
                int i20 = iN24;
                Integer numValueOf = ug6VarJ0.isNull(i20) ? null : Integer.valueOf((int) ug6VarJ0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iN25;
                g35 g35VarL = f57.l((int) ug6VarJ0.getLong(i21));
                int i22 = iN26;
                a35 a35VarS = f57.s(ug6VarJ0.getBlob(i22));
                int i23 = iN27;
                boolean z2 = ((int) ug6VarJ0.getLong(i23)) != 0;
                int i24 = iN28;
                boolean z3 = ((int) ug6VarJ0.getLong(i24)) != 0;
                int i25 = iN29;
                boolean z4 = ((int) ug6VarJ0.getLong(i25)) != 0;
                iN29 = i25;
                int i26 = iN30;
                int i27 = iN31;
                int i28 = iN32;
                iN31 = i27;
                int i29 = iN33;
                arrayList.add(new xm8(strH0, lm8VarN, strH1, strH2, pg1VarZ, pg1VarZ2, j, j2, j3, new q61(a35VarS, g35VarL, z2, z3, z4, ((int) ug6VarJ0.getLong(i26)) != 0, ug6VarJ0.getLong(i27), ug6VarJ0.getLong(i28), f57.f(ug6VarJ0.getBlob(i29))), i3, g20VarK, j4, j5, j6, j7, z, jb5VarM, i12, i14, j8, i17, i18, strH3, bool));
                iN28 = i24;
                iN4 = i10;
                iN17 = i9;
                iN18 = i11;
                iN19 = i13;
                iN20 = i15;
                iN23 = i19;
                iN24 = i20;
                iN25 = i21;
                iN26 = i22;
                iN27 = i23;
                iN33 = i29;
                iN32 = i28;
                iN30 = i26;
                iN = i4;
                iN3 = i8;
                iN13 = i;
                iN14 = i2;
                iN2 = i5;
                iN16 = i7;
            }
            return arrayList;
        } finally {
            ug6VarJ0.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        pg6 pg6Var = (pg6) obj;
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("SELECT * FROM workspec WHERE state=1");
        try {
            int iN = xs1.N(ug6VarJ0, "id");
            int iN2 = xs1.N(ug6VarJ0, "state");
            int iN3 = xs1.N(ug6VarJ0, "worker_class_name");
            int iN4 = xs1.N(ug6VarJ0, "input_merger_class_name");
            int iN5 = xs1.N(ug6VarJ0, "input");
            int iN6 = xs1.N(ug6VarJ0, "output");
            int iN7 = xs1.N(ug6VarJ0, "initial_delay");
            int iN8 = xs1.N(ug6VarJ0, "interval_duration");
            int iN9 = xs1.N(ug6VarJ0, "flex_duration");
            int iN10 = xs1.N(ug6VarJ0, "run_attempt_count");
            int iN11 = xs1.N(ug6VarJ0, "backoff_policy");
            int iN12 = xs1.N(ug6VarJ0, "backoff_delay_duration");
            int iN13 = xs1.N(ug6VarJ0, "last_enqueue_time");
            int iN14 = xs1.N(ug6VarJ0, "minimum_retention_duration");
            int iN15 = xs1.N(ug6VarJ0, "schedule_requested_at");
            int iN16 = xs1.N(ug6VarJ0, "run_in_foreground");
            int iN17 = xs1.N(ug6VarJ0, "out_of_quota_policy");
            int iN18 = xs1.N(ug6VarJ0, "period_count");
            int iN19 = xs1.N(ug6VarJ0, "generation");
            int iN20 = xs1.N(ug6VarJ0, "next_schedule_time_override");
            int iN21 = xs1.N(ug6VarJ0, "next_schedule_time_override_generation");
            int iN22 = xs1.N(ug6VarJ0, "stop_reason");
            int iN23 = xs1.N(ug6VarJ0, "trace_tag");
            int iN24 = xs1.N(ug6VarJ0, "backoff_on_system_interruptions");
            int iN25 = xs1.N(ug6VarJ0, "required_network_type");
            int iN26 = xs1.N(ug6VarJ0, "required_network_request");
            int iN27 = xs1.N(ug6VarJ0, "requires_charging");
            int iN28 = xs1.N(ug6VarJ0, "requires_device_idle");
            int iN29 = xs1.N(ug6VarJ0, "requires_battery_not_low");
            int iN30 = xs1.N(ug6VarJ0, "requires_storage_not_low");
            int iN31 = xs1.N(ug6VarJ0, "trigger_content_update_delay");
            int iN32 = xs1.N(ug6VarJ0, "trigger_max_content_delay");
            int iN33 = xs1.N(ug6VarJ0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (ug6VarJ0.F0()) {
                String strH0 = ug6VarJ0.h0(iN);
                int i = iN14;
                ArrayList arrayList2 = arrayList;
                lm8 lm8VarN = f57.n((int) ug6VarJ0.getLong(iN2));
                String strH1 = ug6VarJ0.h0(iN3);
                String strH2 = ug6VarJ0.h0(iN4);
                byte[] blob = ug6VarJ0.getBlob(iN5);
                pg1 pg1Var = pg1.b;
                pg1 pg1VarZ = qf0.z(blob);
                pg1 pg1VarZ2 = qf0.z(ug6VarJ0.getBlob(iN6));
                long j = ug6VarJ0.getLong(iN7);
                long j2 = ug6VarJ0.getLong(iN8);
                long j3 = ug6VarJ0.getLong(iN9);
                int i2 = (int) ug6VarJ0.getLong(iN10);
                int i3 = iN2;
                int i4 = iN3;
                g20 g20VarK = f57.k((int) ug6VarJ0.getLong(iN11));
                long j4 = ug6VarJ0.getLong(iN12);
                long j5 = ug6VarJ0.getLong(iN13);
                long j6 = ug6VarJ0.getLong(i);
                int i5 = iN15;
                long j7 = ug6VarJ0.getLong(i5);
                int i6 = iN;
                int i7 = iN16;
                boolean z = ((int) ug6VarJ0.getLong(i7)) != 0;
                int i8 = iN17;
                int i9 = iN4;
                jb5 jb5VarM = f57.m((int) ug6VarJ0.getLong(i8));
                int i10 = iN18;
                int i11 = iN5;
                int i12 = (int) ug6VarJ0.getLong(i10);
                int i13 = iN19;
                int i14 = (int) ug6VarJ0.getLong(i13);
                int i15 = iN20;
                long j8 = ug6VarJ0.getLong(i15);
                int i16 = iN21;
                int i17 = (int) ug6VarJ0.getLong(i16);
                int i18 = iN22;
                int i19 = (int) ug6VarJ0.getLong(i18);
                int i20 = iN23;
                Boolean boolValueOf = null;
                String strH3 = ug6VarJ0.isNull(i20) ? null : ug6VarJ0.h0(i20);
                int i21 = iN24;
                Integer numValueOf = ug6VarJ0.isNull(i21) ? null : Integer.valueOf((int) ug6VarJ0.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iN25;
                Boolean bool = boolValueOf;
                g35 g35VarL = f57.l((int) ug6VarJ0.getLong(i22));
                int i23 = iN26;
                a35 a35VarS = f57.s(ug6VarJ0.getBlob(i23));
                iN25 = i22;
                iN26 = i23;
                int i24 = iN27;
                boolean z2 = ((int) ug6VarJ0.getLong(i24)) != 0;
                iN27 = i24;
                int i25 = iN28;
                boolean z3 = ((int) ug6VarJ0.getLong(i25)) != 0;
                int i26 = iN29;
                boolean z4 = ((int) ug6VarJ0.getLong(i26)) != 0;
                iN29 = i26;
                int i27 = iN30;
                int i28 = iN31;
                int i29 = iN32;
                int i30 = iN33;
                iN33 = i30;
                arrayList2.add(new xm8(strH0, lm8VarN, strH1, strH2, pg1VarZ, pg1VarZ2, j, j2, j3, new q61(a35VarS, g35VarL, z2, z3, z4, ((int) ug6VarJ0.getLong(i27)) != 0, ug6VarJ0.getLong(i28), ug6VarJ0.getLong(i29), f57.f(ug6VarJ0.getBlob(i30))), i2, g20VarK, j4, j5, j6, j7, z, jb5VarM, i12, i14, j8, i17, i19, strH3, bool));
                iN30 = i27;
                iN4 = i9;
                iN17 = i8;
                iN19 = i13;
                iN22 = i18;
                iN24 = i21;
                iN31 = i28;
                iN32 = i29;
                iN2 = i3;
                iN14 = i;
                iN3 = i4;
                arrayList = arrayList2;
                iN = i6;
                iN15 = i5;
                iN16 = i7;
                iN20 = i15;
                iN21 = i16;
                iN23 = i20;
                iN28 = i25;
                iN5 = i11;
                iN18 = i10;
            }
            return arrayList;
        } finally {
            ug6VarJ0.close();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        switch (this.m) {
            case 0:
                no noVar = (no) obj;
                return new vk3((((long) Math.round(noVar.a)) << 32) | (((long) Math.round(noVar.b)) & 4294967295L));
            case 1:
                long j = ((dl3) obj).a;
                return new no((int) (j >> 32), (int) (j & 4294967295L));
            case 2:
                no noVar2 = (no) obj;
                int iRound = Math.round(noVar2.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(noVar2.b);
                return new dl3((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 3:
                v56 v56Var = (v56) obj;
                return new po(v56Var.a, v56Var.b, v56Var.c, v56Var.d);
            case 4:
                po poVar = (po) obj;
                return new v56(poVar.a, poVar.b, poVar.c, poVar.d);
            case 5:
                return Float.valueOf(((mo) obj).a);
            case 6:
                return ((wk8) obj).c;
            case 7:
                return ((wk8) obj).e;
            case 8:
                el8 el8Var = (el8) obj;
                el8Var.getClass();
                return el8Var;
            case ep1.b /* 9 */:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("DELETE FROM WorkProgress");
                try {
                    ug6VarJ0.F0();
                    return f88.a;
                } finally {
                    ug6VarJ0.close();
                }
            case ep1.c /* 10 */:
                pg6 pg6Var2 = (pg6) obj;
                pg6Var2.getClass();
                ug6 ug6VarJ1 = pg6Var2.J0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i = ug6VarJ1.F0() ? (int) ug6VarJ1.getLong(0) : 0;
                    ug6VarJ1.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    ug6VarJ1.close();
                    throw th;
                }
            case 11:
                pg6 pg6Var3 = (pg6) obj;
                pg6Var3.getClass();
                ug6 ug6VarJ2 = pg6Var3.J0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iN = xs1.N(ug6VarJ2, "id");
                    int iN2 = xs1.N(ug6VarJ2, "state");
                    int iN3 = xs1.N(ug6VarJ2, "worker_class_name");
                    int iN4 = xs1.N(ug6VarJ2, "input_merger_class_name");
                    int iN5 = xs1.N(ug6VarJ2, "input");
                    int iN6 = xs1.N(ug6VarJ2, "output");
                    int iN7 = xs1.N(ug6VarJ2, "initial_delay");
                    int iN8 = xs1.N(ug6VarJ2, "interval_duration");
                    int iN9 = xs1.N(ug6VarJ2, "flex_duration");
                    int iN10 = xs1.N(ug6VarJ2, "run_attempt_count");
                    int iN11 = xs1.N(ug6VarJ2, "backoff_policy");
                    int iN12 = xs1.N(ug6VarJ2, "backoff_delay_duration");
                    int iN13 = xs1.N(ug6VarJ2, "last_enqueue_time");
                    int iN14 = xs1.N(ug6VarJ2, "minimum_retention_duration");
                    int iN15 = xs1.N(ug6VarJ2, "schedule_requested_at");
                    int iN16 = xs1.N(ug6VarJ2, "run_in_foreground");
                    int iN17 = xs1.N(ug6VarJ2, "out_of_quota_policy");
                    int iN18 = xs1.N(ug6VarJ2, "period_count");
                    int iN19 = xs1.N(ug6VarJ2, "generation");
                    int iN20 = xs1.N(ug6VarJ2, "next_schedule_time_override");
                    int iN21 = xs1.N(ug6VarJ2, "next_schedule_time_override_generation");
                    int iN22 = xs1.N(ug6VarJ2, "stop_reason");
                    int iN23 = xs1.N(ug6VarJ2, "trace_tag");
                    int iN24 = xs1.N(ug6VarJ2, "backoff_on_system_interruptions");
                    int iN25 = xs1.N(ug6VarJ2, "required_network_type");
                    int iN26 = xs1.N(ug6VarJ2, "required_network_request");
                    int iN27 = xs1.N(ug6VarJ2, "requires_charging");
                    int iN28 = xs1.N(ug6VarJ2, "requires_device_idle");
                    int iN29 = xs1.N(ug6VarJ2, "requires_battery_not_low");
                    int iN30 = xs1.N(ug6VarJ2, "requires_storage_not_low");
                    int iN31 = xs1.N(ug6VarJ2, "trigger_content_update_delay");
                    int iN32 = xs1.N(ug6VarJ2, "trigger_max_content_delay");
                    int iN33 = xs1.N(ug6VarJ2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (ug6VarJ2.F0()) {
                        String strH0 = ug6VarJ2.h0(iN);
                        int i2 = iN;
                        int i3 = iN14;
                        lm8 lm8VarN = f57.n((int) ug6VarJ2.getLong(iN2));
                        String strH1 = ug6VarJ2.h0(iN3);
                        String strH2 = ug6VarJ2.h0(iN4);
                        byte[] blob = ug6VarJ2.getBlob(iN5);
                        pg1 pg1Var = pg1.b;
                        pg1 pg1VarZ = qf0.z(blob);
                        pg1 pg1VarZ2 = qf0.z(ug6VarJ2.getBlob(iN6));
                        long j2 = ug6VarJ2.getLong(iN7);
                        long j3 = ug6VarJ2.getLong(iN8);
                        long j4 = ug6VarJ2.getLong(iN9);
                        int i4 = (int) ug6VarJ2.getLong(iN10);
                        int i5 = iN5;
                        int i6 = iN4;
                        g20 g20VarK = f57.k((int) ug6VarJ2.getLong(iN11));
                        long j5 = ug6VarJ2.getLong(iN12);
                        long j6 = ug6VarJ2.getLong(iN13);
                        long j7 = ug6VarJ2.getLong(i3);
                        int i7 = iN15;
                        long j8 = ug6VarJ2.getLong(i7);
                        int i8 = iN3;
                        int i9 = iN16;
                        boolean z = ((int) ug6VarJ2.getLong(i9)) != 0;
                        int i10 = iN2;
                        int i11 = iN17;
                        jb5 jb5VarM = f57.m((int) ug6VarJ2.getLong(i11));
                        iN17 = i11;
                        int i12 = iN18;
                        int i13 = (int) ug6VarJ2.getLong(i12);
                        iN18 = i12;
                        int i14 = iN19;
                        int i15 = (int) ug6VarJ2.getLong(i14);
                        int i16 = iN20;
                        long j9 = ug6VarJ2.getLong(i16);
                        int i17 = iN21;
                        int i18 = (int) ug6VarJ2.getLong(i17);
                        iN21 = i17;
                        iN22 = iN22;
                        int i19 = (int) ug6VarJ2.getLong(iN22);
                        iN23 = iN23;
                        String strH3 = ug6VarJ2.isNull(iN23) ? null : ug6VarJ2.h0(iN23);
                        int i20 = iN24;
                        Integer numValueOf = ug6VarJ2.isNull(i20) ? null : Integer.valueOf((int) ug6VarJ2.getLong(i20));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i21 = iN25;
                        g35 g35VarL = f57.l((int) ug6VarJ2.getLong(i21));
                        int i22 = iN26;
                        a35 a35VarS = f57.s(ug6VarJ2.getBlob(i22));
                        int i23 = iN27;
                        boolean z2 = ((int) ug6VarJ2.getLong(i23)) != 0;
                        int i24 = iN28;
                        boolean z3 = ((int) ug6VarJ2.getLong(i24)) != 0;
                        int i25 = iN29;
                        boolean z4 = ((int) ug6VarJ2.getLong(i25)) != 0;
                        iN29 = i25;
                        int i26 = iN30;
                        int i27 = iN31;
                        int i28 = iN32;
                        iN31 = i27;
                        int i29 = iN33;
                        arrayList.add(new xm8(strH0, lm8VarN, strH1, strH2, pg1VarZ, pg1VarZ2, j2, j3, j4, new q61(a35VarS, g35VarL, z2, z3, z4, ((int) ug6VarJ2.getLong(i26)) != 0, ug6VarJ2.getLong(i27), ug6VarJ2.getLong(i28), f57.f(ug6VarJ2.getBlob(i29))), i4, g20VarK, j5, j6, j7, j8, z, jb5VarM, i13, i15, j9, i18, i19, strH3, boolValueOf));
                        iN2 = i10;
                        iN16 = i9;
                        iN19 = i14;
                        iN20 = i16;
                        iN24 = i20;
                        iN25 = i21;
                        iN26 = i22;
                        iN27 = i23;
                        iN28 = i24;
                        iN33 = i29;
                        iN32 = i28;
                        iN30 = i26;
                        iN4 = i6;
                        iN = i2;
                        iN14 = i3;
                        iN5 = i5;
                        iN3 = i8;
                        iN15 = i7;
                        break;
                    }
                    return arrayList;
                } finally {
                    ug6VarJ2.close();
                }
            case ep1.d /* 12 */:
                pg6 pg6Var4 = (pg6) obj;
                pg6Var4.getClass();
                ug6 ug6VarJ3 = pg6Var4.J0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iN34 = xs1.N(ug6VarJ3, "id");
                    int iN35 = xs1.N(ug6VarJ3, "state");
                    int iN36 = xs1.N(ug6VarJ3, "worker_class_name");
                    int iN37 = xs1.N(ug6VarJ3, "input_merger_class_name");
                    int iN38 = xs1.N(ug6VarJ3, "input");
                    int iN39 = xs1.N(ug6VarJ3, "output");
                    int iN40 = xs1.N(ug6VarJ3, "initial_delay");
                    int iN41 = xs1.N(ug6VarJ3, "interval_duration");
                    int iN42 = xs1.N(ug6VarJ3, "flex_duration");
                    int iN43 = xs1.N(ug6VarJ3, "run_attempt_count");
                    int iN44 = xs1.N(ug6VarJ3, "backoff_policy");
                    int iN45 = xs1.N(ug6VarJ3, "backoff_delay_duration");
                    int iN46 = xs1.N(ug6VarJ3, "last_enqueue_time");
                    int iN47 = xs1.N(ug6VarJ3, "minimum_retention_duration");
                    int iN48 = xs1.N(ug6VarJ3, "schedule_requested_at");
                    int iN49 = xs1.N(ug6VarJ3, "run_in_foreground");
                    int iN50 = xs1.N(ug6VarJ3, "out_of_quota_policy");
                    int iN51 = xs1.N(ug6VarJ3, "period_count");
                    int iN52 = xs1.N(ug6VarJ3, "generation");
                    int iN53 = xs1.N(ug6VarJ3, "next_schedule_time_override");
                    int iN54 = xs1.N(ug6VarJ3, "next_schedule_time_override_generation");
                    int iN55 = xs1.N(ug6VarJ3, "stop_reason");
                    int iN56 = xs1.N(ug6VarJ3, "trace_tag");
                    int iN57 = xs1.N(ug6VarJ3, "backoff_on_system_interruptions");
                    int iN58 = xs1.N(ug6VarJ3, "required_network_type");
                    int iN59 = xs1.N(ug6VarJ3, "required_network_request");
                    int iN60 = xs1.N(ug6VarJ3, "requires_charging");
                    int iN61 = xs1.N(ug6VarJ3, "requires_device_idle");
                    int iN62 = xs1.N(ug6VarJ3, "requires_battery_not_low");
                    int iN63 = xs1.N(ug6VarJ3, "requires_storage_not_low");
                    int iN64 = xs1.N(ug6VarJ3, "trigger_content_update_delay");
                    int iN65 = xs1.N(ug6VarJ3, "trigger_max_content_delay");
                    int iN66 = xs1.N(ug6VarJ3, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (ug6VarJ3.F0()) {
                        String strH4 = ug6VarJ3.h0(iN34);
                        int i30 = iN34;
                        int i31 = iN47;
                        lm8 lm8VarN2 = f57.n((int) ug6VarJ3.getLong(iN35));
                        String strH5 = ug6VarJ3.h0(iN36);
                        String strH6 = ug6VarJ3.h0(iN37);
                        byte[] blob2 = ug6VarJ3.getBlob(iN38);
                        pg1 pg1Var2 = pg1.b;
                        pg1 pg1VarZ3 = qf0.z(blob2);
                        pg1 pg1VarZ4 = qf0.z(ug6VarJ3.getBlob(iN39));
                        long j10 = ug6VarJ3.getLong(iN40);
                        long j11 = ug6VarJ3.getLong(iN41);
                        long j12 = ug6VarJ3.getLong(iN42);
                        int i32 = (int) ug6VarJ3.getLong(iN43);
                        int i33 = iN38;
                        int i34 = iN37;
                        g20 g20VarK2 = f57.k((int) ug6VarJ3.getLong(iN44));
                        long j13 = ug6VarJ3.getLong(iN45);
                        long j14 = ug6VarJ3.getLong(iN46);
                        long j15 = ug6VarJ3.getLong(i31);
                        int i35 = iN48;
                        long j16 = ug6VarJ3.getLong(i35);
                        int i36 = iN49;
                        iN48 = i35;
                        boolean z5 = ((int) ug6VarJ3.getLong(i36)) != 0;
                        int i37 = iN36;
                        int i38 = iN50;
                        jb5 jb5VarM2 = f57.m((int) ug6VarJ3.getLong(i38));
                        int i39 = iN51;
                        int i40 = iN35;
                        int i41 = (int) ug6VarJ3.getLong(i39);
                        iN50 = i38;
                        int i42 = iN52;
                        int i43 = (int) ug6VarJ3.getLong(i42);
                        long j17 = ug6VarJ3.getLong(iN53);
                        int i44 = iN54;
                        int i45 = (int) ug6VarJ3.getLong(i44);
                        iN54 = i44;
                        iN55 = iN55;
                        int i46 = (int) ug6VarJ3.getLong(iN55);
                        iN56 = iN56;
                        String strH7 = ug6VarJ3.isNull(iN56) ? null : ug6VarJ3.h0(iN56);
                        int i47 = iN57;
                        Integer numValueOf2 = ug6VarJ3.isNull(i47) ? null : Integer.valueOf((int) ug6VarJ3.getLong(i47));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i48 = iN58;
                        g35 g35VarL2 = f57.l((int) ug6VarJ3.getLong(i48));
                        int i49 = iN59;
                        a35 a35VarS2 = f57.s(ug6VarJ3.getBlob(i49));
                        int i50 = iN60;
                        boolean z6 = ((int) ug6VarJ3.getLong(i50)) != 0;
                        int i51 = iN61;
                        boolean z7 = ((int) ug6VarJ3.getLong(i51)) != 0;
                        int i52 = iN62;
                        boolean z8 = ((int) ug6VarJ3.getLong(i52)) != 0;
                        iN62 = i52;
                        int i53 = iN63;
                        int i54 = iN64;
                        int i55 = iN65;
                        iN64 = i54;
                        int i56 = iN66;
                        arrayList2.add(new xm8(strH4, lm8VarN2, strH5, strH6, pg1VarZ3, pg1VarZ4, j10, j11, j12, new q61(a35VarS2, g35VarL2, z6, z7, z8, ((int) ug6VarJ3.getLong(i53)) != 0, ug6VarJ3.getLong(i54), ug6VarJ3.getLong(i55), f57.f(ug6VarJ3.getBlob(i56))), i32, g20VarK2, j13, j14, j15, j16, z5, jb5VarM2, i41, i43, j17, i45, i46, strH7, boolValueOf2));
                        iN61 = i51;
                        iN35 = i40;
                        iN51 = i39;
                        iN52 = i42;
                        iN57 = i47;
                        iN58 = i48;
                        iN59 = i49;
                        iN60 = i50;
                        iN66 = i56;
                        iN65 = i55;
                        iN63 = i53;
                        iN34 = i30;
                        iN37 = i34;
                        iN38 = i33;
                        iN36 = i37;
                        iN49 = i36;
                        iN47 = i31;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ug6VarJ3.close();
                }
            case 13:
                pg6 pg6Var5 = (pg6) obj;
                pg6Var5.getClass();
                ug6 ug6VarJ4 = pg6Var5.J0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(ug6VarJ4.F0() && ((int) ug6VarJ4.getLong(0)) != 0);
                } finally {
                    ug6VarJ4.close();
                }
            case 14:
                pg6 pg6Var6 = (pg6) obj;
                pg6Var6.getClass();
                ug6 ug6VarJ5 = pg6Var6.J0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    ug6VarJ5.k(1, 200L);
                    int iN67 = xs1.N(ug6VarJ5, "id");
                    int iN68 = xs1.N(ug6VarJ5, "state");
                    int iN69 = xs1.N(ug6VarJ5, "worker_class_name");
                    int iN70 = xs1.N(ug6VarJ5, "input_merger_class_name");
                    int iN71 = xs1.N(ug6VarJ5, "input");
                    int iN72 = xs1.N(ug6VarJ5, "output");
                    int iN73 = xs1.N(ug6VarJ5, "initial_delay");
                    int iN74 = xs1.N(ug6VarJ5, "interval_duration");
                    int iN75 = xs1.N(ug6VarJ5, "flex_duration");
                    int iN76 = xs1.N(ug6VarJ5, "run_attempt_count");
                    int iN77 = xs1.N(ug6VarJ5, "backoff_policy");
                    int iN78 = xs1.N(ug6VarJ5, "backoff_delay_duration");
                    int iN79 = xs1.N(ug6VarJ5, "last_enqueue_time");
                    int iN80 = xs1.N(ug6VarJ5, "minimum_retention_duration");
                    int iN81 = xs1.N(ug6VarJ5, "schedule_requested_at");
                    int iN82 = xs1.N(ug6VarJ5, "run_in_foreground");
                    int iN83 = xs1.N(ug6VarJ5, "out_of_quota_policy");
                    int iN84 = xs1.N(ug6VarJ5, "period_count");
                    int iN85 = xs1.N(ug6VarJ5, "generation");
                    int iN86 = xs1.N(ug6VarJ5, "next_schedule_time_override");
                    int iN87 = xs1.N(ug6VarJ5, "next_schedule_time_override_generation");
                    int iN88 = xs1.N(ug6VarJ5, "stop_reason");
                    int iN89 = xs1.N(ug6VarJ5, "trace_tag");
                    int iN90 = xs1.N(ug6VarJ5, "backoff_on_system_interruptions");
                    int iN91 = xs1.N(ug6VarJ5, "required_network_type");
                    int iN92 = xs1.N(ug6VarJ5, "required_network_request");
                    int iN93 = xs1.N(ug6VarJ5, "requires_charging");
                    int iN94 = xs1.N(ug6VarJ5, "requires_device_idle");
                    int iN95 = xs1.N(ug6VarJ5, "requires_battery_not_low");
                    int iN96 = xs1.N(ug6VarJ5, "requires_storage_not_low");
                    int iN97 = xs1.N(ug6VarJ5, "trigger_content_update_delay");
                    int iN98 = xs1.N(ug6VarJ5, "trigger_max_content_delay");
                    int iN99 = xs1.N(ug6VarJ5, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (ug6VarJ5.F0()) {
                        String strH8 = ug6VarJ5.h0(iN67);
                        int i57 = iN79;
                        int i58 = iN80;
                        lm8 lm8VarN3 = f57.n((int) ug6VarJ5.getLong(iN68));
                        String strH9 = ug6VarJ5.h0(iN69);
                        String strH10 = ug6VarJ5.h0(iN70);
                        byte[] blob3 = ug6VarJ5.getBlob(iN71);
                        pg1 pg1Var3 = pg1.b;
                        pg1 pg1VarZ5 = qf0.z(blob3);
                        pg1 pg1VarZ6 = qf0.z(ug6VarJ5.getBlob(iN72));
                        long j18 = ug6VarJ5.getLong(iN73);
                        long j19 = ug6VarJ5.getLong(iN74);
                        long j20 = ug6VarJ5.getLong(iN75);
                        int i59 = (int) ug6VarJ5.getLong(iN76);
                        int i60 = iN71;
                        int i61 = iN70;
                        g20 g20VarK3 = f57.k((int) ug6VarJ5.getLong(iN77));
                        long j21 = ug6VarJ5.getLong(iN78);
                        long j22 = ug6VarJ5.getLong(i57);
                        long j23 = ug6VarJ5.getLong(i58);
                        int i62 = iN81;
                        long j24 = ug6VarJ5.getLong(i62);
                        int i63 = iN69;
                        int i64 = iN82;
                        boolean z9 = ((int) ug6VarJ5.getLong(i64)) != 0;
                        int i65 = iN68;
                        int i66 = iN83;
                        jb5 jb5VarM3 = f57.m((int) ug6VarJ5.getLong(i66));
                        iN83 = i66;
                        int i67 = iN84;
                        int i68 = (int) ug6VarJ5.getLong(i67);
                        iN84 = i67;
                        int i69 = iN85;
                        int i70 = (int) ug6VarJ5.getLong(i69);
                        int i71 = iN86;
                        long j25 = ug6VarJ5.getLong(i71);
                        int i72 = iN87;
                        int i73 = (int) ug6VarJ5.getLong(i72);
                        iN87 = i72;
                        iN88 = iN88;
                        int i74 = (int) ug6VarJ5.getLong(iN88);
                        iN89 = iN89;
                        String strH11 = ug6VarJ5.isNull(iN89) ? null : ug6VarJ5.h0(iN89);
                        int i75 = iN90;
                        Integer numValueOf3 = ug6VarJ5.isNull(i75) ? null : Integer.valueOf((int) ug6VarJ5.getLong(i75));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i76 = iN91;
                        g35 g35VarL3 = f57.l((int) ug6VarJ5.getLong(i76));
                        int i77 = iN92;
                        a35 a35VarS3 = f57.s(ug6VarJ5.getBlob(i77));
                        int i78 = iN93;
                        boolean z10 = ((int) ug6VarJ5.getLong(i78)) != 0;
                        int i79 = iN94;
                        boolean z11 = ((int) ug6VarJ5.getLong(i79)) != 0;
                        int i80 = iN95;
                        boolean z12 = ((int) ug6VarJ5.getLong(i80)) != 0;
                        iN95 = i80;
                        int i81 = iN96;
                        int i82 = iN97;
                        int i83 = iN98;
                        iN97 = i82;
                        int i84 = iN99;
                        arrayList3.add(new xm8(strH8, lm8VarN3, strH9, strH10, pg1VarZ5, pg1VarZ6, j18, j19, j20, new q61(a35VarS3, g35VarL3, z10, z11, z12, ((int) ug6VarJ5.getLong(i81)) != 0, ug6VarJ5.getLong(i82), ug6VarJ5.getLong(i83), f57.f(ug6VarJ5.getBlob(i84))), i59, g20VarK3, j21, j22, j23, j24, z9, jb5VarM3, i68, i70, j25, i73, i74, strH11, boolValueOf3));
                        iN68 = i65;
                        iN82 = i64;
                        iN85 = i69;
                        iN86 = i71;
                        iN90 = i75;
                        iN91 = i76;
                        iN92 = i77;
                        iN93 = i78;
                        iN94 = i79;
                        iN99 = i84;
                        iN98 = i83;
                        iN96 = i81;
                        iN79 = i57;
                        iN70 = i61;
                        iN71 = i60;
                        iN69 = i63;
                        iN81 = i62;
                        iN80 = i58;
                        break;
                    }
                    return arrayList3;
                } finally {
                    ug6VarJ5.close();
                }
            case 15:
                pg6 pg6Var7 = (pg6) obj;
                pg6Var7.getClass();
                ug6 ug6VarJ6 = pg6Var7.J0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    ug6VarJ6.F0();
                    return Integer.valueOf(vs1.B(pg6Var7));
                } finally {
                    ug6VarJ6.close();
                }
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return c(obj);
            case 17:
                return e(obj);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                p82 p82Var = (p82) obj;
                p82Var.getClass();
                String nodeName = ((Node) p82Var.n).getNodeName();
                nodeName.getClass();
                return Boolean.valueOf(nodeName.equals("item"));
            default:
                ((io8) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
