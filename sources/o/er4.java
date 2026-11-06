package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class er4 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public er4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(pg6 pg6Var) {
        pg6Var.getClass();
        if (!(pg6Var instanceof ze7)) {
            throw new e55("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((ze7) pg6Var).m);
    }

    public void b(bf7 bf7Var) {
        bf7Var.getClass();
        throw new e55("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
