package o;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class hm8 extends vy1 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm8(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // o.vy1
    public final void a(pg6 pg6Var) {
        pg6Var.getClass();
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        us1.y(pg6Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        us1.y(pg6Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // o.vy1
    public final void c(pg6 pg6Var) {
        pg6Var.getClass();
        us1.y(pg6Var, "DROP TABLE IF EXISTS `Dependency`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `WorkSpec`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `WorkTag`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `WorkName`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `WorkProgress`");
        us1.y(pg6Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // o.vy1
    public final void s(pg6 pg6Var) {
        pg6Var.getClass();
    }

    @Override // o.vy1
    public final void t(pg6 pg6Var) {
        pg6Var.getClass();
        us1.y(pg6Var, "PRAGMA foreign_keys = ON");
        wm3 wm3VarF = this.d.f();
        e38 e38Var = wm3VarF.b;
        e38Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("PRAGMA query_only");
        try {
            ug6VarJ0.F0();
            boolean z = ug6VarJ0.getLong(0) != 0;
            iq8.l(ug6VarJ0, null);
            if (!z) {
                us1.y(pg6Var, "PRAGMA temp_store = MEMORY");
                us1.y(pg6Var, "PRAGMA recursive_triggers = 1");
                us1.y(pg6Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (e38Var.d) {
                    us1.y(pg6Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    us1.y(pg6Var, bc7.L("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                io.sentry.z7 z7Var = e38Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) z7Var.b;
                reentrantLock.lock();
                try {
                    z7Var.a = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (wm3VarF.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                iq8.l(ug6VarJ0, th2);
                throw th3;
            }
        }
    }

    @Override // o.vy1
    public final void u(pg6 pg6Var) {
        pg6Var.getClass();
    }

    @Override // o.vy1
    public final void v(pg6 pg6Var) {
        pg6Var.getClass();
        sa4 sa4VarT = qf0.t();
        ug6 ug6VarJ0 = pg6Var.J0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (ug6VarJ0.F0()) {
            try {
                sa4VarT.add(ug6VarJ0.h0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(ug6VarJ0, th);
                    throw th2;
                }
            }
        }
        iq8.l(ug6VarJ0, null);
        ListIterator listIterator = qf0.r(sa4VarT).listIterator(0);
        while (true) {
            v53 v53Var = (v53) listIterator;
            if (!v53Var.hasNext()) {
                return;
            }
            String str = (String) v53Var.next();
            if (bc7.N(false, str, "room_fts_content_sync_")) {
                us1.y(pg6Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // o.vy1
    public final io.sentry.android.core.t0 w(pg6 pg6Var) {
        pg6Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new cn7("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new cn7("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("work_spec_id"), qf0.K("id")));
        linkedHashSet.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("prerequisite_id"), qf0.K("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new en7("index_Dependency_work_spec_id", false, qf0.K("work_spec_id"), qf0.K("ASC")));
        linkedHashSet2.add(new en7("index_Dependency_prerequisite_id", false, qf0.K("prerequisite_id"), qf0.K("ASC")));
        fn7 fn7Var = new fn7("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        fn7 fn7VarR = l47.r(pg6Var, "Dependency");
        if (!fn7Var.equals(fn7VarR)) {
            return new io.sentry.android.core.t0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fn7Var + "\n Found:\n" + fn7VarR);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new cn7("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new cn7("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new cn7("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new cn7("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new cn7("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new cn7("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new cn7("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new cn7("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new cn7("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new cn7("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new cn7("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new cn7("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new cn7("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new cn7("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new cn7("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new cn7("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new cn7("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new cn7("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new cn7("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new cn7("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new cn7("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new cn7("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new cn7("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new cn7("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new cn7("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new cn7("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new cn7("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new cn7("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new cn7("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new cn7("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new cn7("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new cn7("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new cn7("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new en7("index_WorkSpec_schedule_requested_at", false, qf0.K("schedule_requested_at"), qf0.K("ASC")));
        linkedHashSet4.add(new en7("index_WorkSpec_last_enqueue_time", false, qf0.K("last_enqueue_time"), qf0.K("ASC")));
        fn7 fn7Var2 = new fn7("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        fn7 fn7VarR2 = l47.r(pg6Var, "WorkSpec");
        if (!fn7Var2.equals(fn7VarR2)) {
            return new io.sentry.android.core.t0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fn7Var2 + "\n Found:\n" + fn7VarR2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new cn7("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new cn7("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("work_spec_id"), qf0.K("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new en7("index_WorkTag_work_spec_id", false, qf0.K("work_spec_id"), qf0.K("ASC")));
        fn7 fn7Var3 = new fn7("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        fn7 fn7VarR3 = l47.r(pg6Var, "WorkTag");
        if (!fn7Var3.equals(fn7VarR3)) {
            return new io.sentry.android.core.t0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fn7Var3 + "\n Found:\n" + fn7VarR3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new cn7("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new cn7("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new cn7("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("work_spec_id"), qf0.K("id")));
        fn7 fn7Var4 = new fn7("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        fn7 fn7VarR4 = l47.r(pg6Var, "SystemIdInfo");
        if (!fn7Var4.equals(fn7VarR4)) {
            return new io.sentry.android.core.t0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fn7Var4 + "\n Found:\n" + fn7VarR4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new cn7("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new cn7("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("work_spec_id"), qf0.K("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new en7("index_WorkName_work_spec_id", false, qf0.K("work_spec_id"), qf0.K("ASC")));
        fn7 fn7Var5 = new fn7("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        fn7 fn7VarR5 = l47.r(pg6Var, "WorkName");
        if (!fn7Var5.equals(fn7VarR5)) {
            return new io.sentry.android.core.t0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fn7Var5 + "\n Found:\n" + fn7VarR5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new cn7("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new cn7("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new dn7("WorkSpec", "CASCADE", "CASCADE", qf0.K("work_spec_id"), qf0.K("id")));
        fn7 fn7Var6 = new fn7("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        fn7 fn7VarR6 = l47.r(pg6Var, "WorkProgress");
        if (!fn7Var6.equals(fn7VarR6)) {
            return new io.sentry.android.core.t0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fn7Var6 + "\n Found:\n" + fn7VarR6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new cn7("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new cn7("long_value", "INTEGER", false, 0, null, 1));
        fn7 fn7Var7 = new fn7("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        fn7 fn7VarR7 = l47.r(pg6Var, "Preference");
        if (fn7Var7.equals(fn7VarR7)) {
            return new io.sentry.android.core.t0(true, (String) null);
        }
        return new io.sentry.android.core.t0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fn7Var7 + "\n Found:\n" + fn7VarR7);
    }
}
