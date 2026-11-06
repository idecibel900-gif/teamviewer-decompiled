package o;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class pv2 implements gf7 {
    public final SQLiteProgram m;

    public pv2(SQLiteProgram sQLiteProgram) {
        this.m = sQLiteProgram;
    }

    @Override // o.gf7
    public final void B(int i, double d) {
        this.m.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // o.gf7
    public final void k(int i, long j) {
        this.m.bindLong(i, j);
    }

    @Override // o.gf7
    public final void l(byte[] bArr, int i) {
        this.m.bindBlob(i, bArr);
    }

    @Override // o.gf7
    public final void m(int i) {
        this.m.bindNull(i);
    }

    @Override // o.gf7
    public final void t(int i, String str) {
        str.getClass();
        this.m.bindString(i, str);
    }
}
