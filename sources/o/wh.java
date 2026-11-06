package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    public /* synthetic */ wh(long j, byte b) {
        this.m = b;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        gl0 gl0Var;
        Object sc6Var;
        ug6 ug6Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        long j = this.n;
        switch (b) {
            case 0:
                hi0 hi0Var = (hi0) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (hi0Var.m.d() >> 32)) / 2.0f;
                return hi0Var.a(new xh(fIntBitsToFloat, uf0.l(hi0Var, fIntBitsToFloat), new t70(5, j), (byte) 0));
            case 1:
                qb0 qb0Var = (qb0) obj;
                Function1 function1 = qb0Var.b;
                if (function1 != null && (gl0Var = qb0Var.a) != null) {
                    try {
                        sc6Var = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        sc6Var = new sc6(th);
                    }
                    gl0Var.resumeWith(sc6Var);
                    break;
                }
                return f88Var;
            case 2:
                ((op6) obj).d(uo6.a, new to6(l43.m, this.n, so6.n, true));
                return f88Var;
            case 3:
                return Long.valueOf(j);
            case 4:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((ns1) obj2).a != j) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                u52 u52Var = (u52) obj;
                u52Var.getClass();
                float fB = y07.b(u52Var.d());
                float f = fB / 8.0f;
                float f2 = f < 1.5f ? 1.5f : f;
                float f3 = 0.4f * fB;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fB)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.5f * fB)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fB)) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fB * 0.8f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long j2 = this.n;
                u52.L(u52Var, j2, jFloatToRawIntBits, jFloatToRawIntBits2, f2, 480);
                u52.L(u52Var, j2, jFloatToRawIntBits2, jFloatToRawIntBits3, f2, 480);
                return f88Var;
            default:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    ug6VarJ0.k(1, j);
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
                    ArrayList arrayList2 = new ArrayList();
                    while (ug6VarJ0.F0()) {
                        String strH0 = ug6VarJ0.h0(iN);
                        int i = iN;
                        ArrayList arrayList3 = arrayList2;
                        lm8 lm8VarN = f57.n((int) ug6VarJ0.getLong(iN2));
                        String strH1 = ug6VarJ0.h0(iN3);
                        String strH2 = ug6VarJ0.h0(iN4);
                        byte[] blob = ug6VarJ0.getBlob(iN5);
                        pg1 pg1Var = pg1.b;
                        pg1 pg1VarZ = qf0.z(blob);
                        pg1 pg1VarZ2 = qf0.z(ug6VarJ0.getBlob(iN6));
                        long j3 = ug6VarJ0.getLong(iN7);
                        long j4 = ug6VarJ0.getLong(iN8);
                        long j5 = ug6VarJ0.getLong(iN9);
                        int i2 = (int) ug6VarJ0.getLong(iN10);
                        g20 g20VarK = f57.k((int) ug6VarJ0.getLong(iN11));
                        long j6 = ug6VarJ0.getLong(iN12);
                        long j7 = ug6VarJ0.getLong(iN13);
                        long j8 = ug6VarJ0.getLong(iN14);
                        int i3 = iN15;
                        long j9 = ug6VarJ0.getLong(i3);
                        int i4 = iN2;
                        int i5 = iN16;
                        int i6 = iN3;
                        boolean z = ((int) ug6VarJ0.getLong(i5)) != 0;
                        int i7 = iN17;
                        jb5 jb5VarM = f57.m((int) ug6VarJ0.getLong(i7));
                        int i8 = iN18;
                        int i9 = (int) ug6VarJ0.getLong(i8);
                        int i10 = iN19;
                        int i11 = (int) ug6VarJ0.getLong(i10);
                        int i12 = iN20;
                        long j10 = ug6VarJ0.getLong(i12);
                        int i13 = iN14;
                        int i14 = iN21;
                        int i15 = (int) ug6VarJ0.getLong(i14);
                        int i16 = iN22;
                        int i17 = (int) ug6VarJ0.getLong(i16);
                        int i18 = iN23;
                        String strH3 = ug6VarJ0.isNull(i18) ? null : ug6VarJ0.h0(i18);
                        int i19 = iN24;
                        Integer numValueOf = ug6VarJ0.isNull(i19) ? null : Integer.valueOf((int) ug6VarJ0.getLong(i19));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i20 = iN25;
                        Boolean bool = boolValueOf;
                        g35 g35VarL = f57.l((int) ug6VarJ0.getLong(i20));
                        int i21 = iN26;
                        a35 a35VarS = f57.s(ug6VarJ0.getBlob(i21));
                        iN25 = i20;
                        iN26 = i21;
                        int i22 = iN27;
                        boolean z2 = ((int) ug6VarJ0.getLong(i22)) != 0;
                        iN27 = i22;
                        int i23 = iN28;
                        boolean z3 = ((int) ug6VarJ0.getLong(i23)) != 0;
                        int i24 = iN29;
                        boolean z4 = ((int) ug6VarJ0.getLong(i24)) != 0;
                        iN29 = i24;
                        int i25 = iN30;
                        int i26 = iN31;
                        int i27 = iN32;
                        int i28 = iN33;
                        iN33 = i28;
                        ug6Var = ug6VarJ0;
                        try {
                            arrayList3.add(new xm8(strH0, lm8VarN, strH1, strH2, pg1VarZ, pg1VarZ2, j3, j4, j5, new q61(a35VarS, g35VarL, z2, z3, z4, ((int) ug6VarJ0.getLong(i25)) != 0, ug6VarJ0.getLong(i26), ug6VarJ0.getLong(i27), f57.f(ug6VarJ0.getBlob(i28))), i2, g20VarK, j6, j7, j8, j9, z, jb5VarM, i9, i11, j10, i15, i17, strH3, bool));
                            iN2 = i4;
                            iN15 = i3;
                            iN22 = i16;
                            iN24 = i19;
                            iN30 = i25;
                            iN32 = i27;
                            iN14 = i13;
                            iN20 = i12;
                            iN21 = i14;
                            iN23 = i18;
                            arrayList2 = arrayList3;
                            iN28 = i23;
                            iN3 = i6;
                            iN16 = i5;
                            iN17 = i7;
                            iN18 = i8;
                            ug6VarJ0 = ug6Var;
                            iN19 = i10;
                            iN31 = i26;
                            iN = i;
                        } catch (Throwable th2) {
                            th = th2;
                            ug6Var.close();
                            throw th;
                        }
                        break;
                    }
                    ug6 ug6Var2 = ug6VarJ0;
                    ArrayList arrayList4 = arrayList2;
                    ug6Var2.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    th = th3;
                    ug6Var = ug6VarJ0;
                }
                break;
        }
    }
}
