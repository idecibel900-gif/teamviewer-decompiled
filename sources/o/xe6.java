package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class xe6 {
    public void a(bf7 bf7Var) {
        bf7Var.getClass();
        bf7Var.n();
        try {
            bf7Var.s("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bf7Var.O();
        } finally {
            bf7Var.e0();
        }
    }
}
