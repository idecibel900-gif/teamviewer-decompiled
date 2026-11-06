package o;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qn1 extends ds1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f1846o;

    public /* synthetic */ qn1(byte b) {
        this.f1846o = b;
    }

    @Override // o.ds1
    public final String F() {
        switch (this.f1846o) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // o.ds1
    public final void z(ug6 ug6Var, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrO0;
        int[] iArrO1;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.f1846o) {
            case 0:
                on1 on1Var = (on1) obj;
                ug6Var.getClass();
                on1Var.getClass();
                ug6Var.M(1, on1Var.a);
                ug6Var.M(2, on1Var.b);
                return;
            case 1:
                jq5 jq5Var = (jq5) obj;
                ug6Var.getClass();
                jq5Var.getClass();
                ug6Var.M(1, jq5Var.a);
                ug6Var.k(2, jq5Var.b.longValue());
                return;
            case 2:
                rh7 rh7Var = (rh7) obj;
                ug6Var.getClass();
                rh7Var.getClass();
                ug6Var.M(1, rh7Var.a);
                ug6Var.k(2, rh7Var.b);
                ug6Var.k(3, rh7Var.c);
                return;
            case 3:
                qm8 qm8Var = (qm8) obj;
                ug6Var.getClass();
                qm8Var.getClass();
                ug6Var.M(1, qm8Var.a);
                ug6Var.M(2, qm8Var.b);
                return;
            case 4:
                xm8 xm8Var = (xm8) obj;
                ug6Var.getClass();
                xm8Var.getClass();
                ug6Var.M(1, xm8Var.a);
                ug6Var.k(2, f57.q(xm8Var.b));
                ug6Var.M(3, xm8Var.c);
                ug6Var.M(4, xm8Var.d);
                pg1 pg1Var = pg1.b;
                ug6Var.l(qf0.V(xm8Var.e), 5);
                ug6Var.l(qf0.V(xm8Var.f), 6);
                ug6Var.k(7, xm8Var.g);
                ug6Var.k(8, xm8Var.h);
                ug6Var.k(9, xm8Var.i);
                ug6Var.k(10, xm8Var.k);
                g20 g20Var = xm8Var.l;
                g20Var.getClass();
                int iOrdinal = g20Var.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return;
                    }
                    i = 1;
                }
                ug6Var.k(11, i);
                ug6Var.k(12, xm8Var.m);
                ug6Var.k(13, xm8Var.n);
                ug6Var.k(14, xm8Var.f2535o);
                ug6Var.k(15, xm8Var.p);
                ug6Var.k(16, xm8Var.q ? 1L : 0L);
                jb5 jb5Var = xm8Var.r;
                jb5Var.getClass();
                int iOrdinal2 = jb5Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        gk0.s();
                        return;
                    }
                    i2 = 1;
                }
                ug6Var.k(17, i2);
                ug6Var.k(18, xm8Var.s);
                ug6Var.k(19, xm8Var.t);
                ug6Var.k(20, xm8Var.u);
                ug6Var.k(21, xm8Var.v);
                ug6Var.k(22, xm8Var.w);
                String str = xm8Var.x;
                if (str == null) {
                    ug6Var.m(23);
                } else {
                    ug6Var.M(23, str);
                }
                Boolean bool = xm8Var.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ug6Var.m(24);
                } else {
                    ug6Var.k(24, numValueOf.intValue());
                }
                q61 q61Var = xm8Var.j;
                g35 g35Var = q61Var.a;
                int iOrdinal3 = g35Var.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 == 2) {
                    i3 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || g35Var != g35.r) {
                            io.sentry.h2.g(g35Var, " to int", "Could not convert ");
                            return;
                        }
                        i3 = 5;
                    }
                }
                ug6Var.k(25, i3);
                a35 a35Var = q61Var.b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) a35Var.a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i4 >= 31) {
                                    iArrO0 = networkRequest.getTransportTypes();
                                    iArrO0.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < 10; i5++) {
                                        int i6 = iArr[i5];
                                        if (networkRequest.hasTransport(i6)) {
                                            arrayList.add(Integer.valueOf(i6));
                                        }
                                    }
                                    iArrO0 = lv0.O0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrO1 = networkRequest.getCapabilities();
                                    iArrO1.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i7 = 0; i7 < 30; i7++) {
                                        int i8 = iArr2[i7];
                                        if (networkRequest.hasCapability(i8)) {
                                            arrayList2.add(Integer.valueOf(i8));
                                        }
                                    }
                                    iArrO1 = lv0.O0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrO0.length);
                                for (int i9 : iArrO0) {
                                    objectOutputStream.writeInt(i9);
                                }
                                objectOutputStream.writeInt(iArrO1.length);
                                for (int i10 : iArrO1) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    kh.n(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                kh.n(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                ug6Var.l(byteArray, 26);
                ug6Var.k(27, q61Var.c ? 1L : 0L);
                ug6Var.k(28, q61Var.d ? 1L : 0L);
                ug6Var.k(29, q61Var.e ? 1L : 0L);
                ug6Var.k(30, q61Var.f ? 1L : 0L);
                ug6Var.k(31, q61Var.g);
                ug6Var.k(32, q61Var.h);
                Set<p61> set = q61Var.i;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (p61 p61Var : set) {
                                objectOutputStream2.writeUTF(p61Var.a.toString());
                                objectOutputStream2.writeBoolean(p61Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                kh.n(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            kh.n(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                ug6Var.l(byteArray2, 33);
                return;
            default:
                bn8 bn8Var = (bn8) obj;
                ug6Var.getClass();
                bn8Var.getClass();
                ug6Var.M(1, bn8Var.a);
                ug6Var.M(2, bn8Var.b);
                return;
        }
    }
}
