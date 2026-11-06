package o;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hf7 extends kf7 {
    public int[] p;
    public long[] q;
    public double[] r;
    public String[] s;
    public byte[][] t;
    public Cursor u;

    public static void u(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            us1.P(25, "column index out of range");
            throw null;
        }
    }

    @Override // o.ug6
    public final boolean F0() {
        e();
        q();
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        hk0.l("Required value was null.");
        return false;
    }

    @Override // o.ug6
    public final void M(int i, String str) {
        str.getClass();
        e();
        j(3, i);
        this.p[i] = 3;
        this.s[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f1261o) {
            e();
            this.p = new int[0];
            this.q = new long[0];
            this.r = new double[0];
            this.s = new String[0];
            this.t = new byte[0][];
            reset();
        }
        this.f1261o = true;
    }

    @Override // o.ug6
    public final byte[] getBlob(int i) {
        e();
        Cursor cursorZ = z();
        u(cursorZ, i);
        byte[] blob = cursorZ.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // o.ug6
    public final int getColumnCount() {
        e();
        q();
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // o.ug6
    public final String getColumnName(int i) {
        e();
        q();
        Cursor cursor = this.u;
        if (cursor == null) {
            hk0.l("Required value was null.");
            return null;
        }
        u(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // o.ug6
    public final long getLong(int i) {
        e();
        Cursor cursorZ = z();
        u(cursorZ, i);
        return cursorZ.getLong(i);
    }

    @Override // o.ug6
    public final String h0(int i) {
        e();
        Cursor cursorZ = z();
        u(cursorZ, i);
        String string = cursorZ.getString(i);
        string.getClass();
        return string;
    }

    @Override // o.ug6
    public final boolean isNull(int i) {
        e();
        Cursor cursorZ = z();
        u(cursorZ, i);
        return cursorZ.isNull(i);
    }

    public final void j(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.p;
        if (iArr.length < i3) {
            this.p = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.q;
            if (jArr.length < i3) {
                this.q = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.r;
            if (dArr.length < i3) {
                this.r = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.s;
            if (strArr.length < i3) {
                this.s = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.t;
        if (bArr.length < i3) {
            this.t = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // o.ug6
    public final void k(int i, long j) {
        e();
        j(1, i);
        this.p[i] = 1;
        this.q[i] = j;
    }

    @Override // o.ug6
    public final void l(byte[] bArr, int i) {
        e();
        j(4, i);
        this.p[i] = 4;
        this.t[i] = bArr;
    }

    @Override // o.ug6
    public final void m(int i) {
        e();
        j(5, i);
        this.p[i] = 5;
    }

    public final void q() {
        if (this.u == null) {
            this.u = this.m.o(new l07((Object) this, (byte) 8));
        }
    }

    @Override // o.ug6
    public final void reset() {
        e();
        Cursor cursor = this.u;
        if (cursor != null) {
            cursor.close();
        }
        this.u = null;
    }

    public final Cursor z() {
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor;
        }
        us1.P(21, "no row");
        throw null;
    }
}
