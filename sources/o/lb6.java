package o;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class lb6 extends er4 {
    public final /* synthetic */ byte c = 1;
    public final Context d;

    public lb6(Context context) {
        super(9, 10);
        this.d = context;
    }

    @Override // o.er4
    public final void b(bf7 bf7Var) {
        byte b = this.c;
        Context context = this.d;
        bf7Var.getClass();
        switch (b) {
            case 0:
                if (this.b >= 10) {
                    bf7Var.N(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bf7Var.s("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bf7Var.n();
                    try {
                        bf7Var.N(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        bf7Var.N(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        bf7Var.O();
                        bf7Var.e0();
                    } catch (Throwable th) {
                        bf7Var.e0();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bf7Var.n();
                    try {
                        bf7Var.N(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        bf7Var.N(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        bf7Var.O();
                        return;
                    } finally {
                        bf7Var.e0();
                    }
                }
                return;
        }
    }

    public lb6(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }
}
