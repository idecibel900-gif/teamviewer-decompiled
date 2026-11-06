package io.sentry.android.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import io.sentry.o;
import java.io.IOException;
import o.bf7;
import o.hf7;
import o.jf7;
import o.l07;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bf7 {
    public final bf7 m;
    public final o n;

    public e(bf7 bf7Var, o oVar) {
        bf7Var.getClass();
        oVar.getClass();
        this.m = bf7Var;
        this.n = oVar;
    }

    @Override // o.bf7
    public final void D() {
        this.m.D();
    }

    @Override // o.bf7
    public final int G0(ContentValues contentValues, Object[] objArr) {
        return this.m.G0(contentValues, objArr);
    }

    @Override // o.bf7
    public final void N(Object[] objArr) throws Throwable {
        this.n.T("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new d(this, objArr, (byte) 1));
    }

    @Override // o.bf7
    public final void O() {
        this.m.O();
    }

    @Override // o.bf7
    public final void Q() {
        this.m.Q();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.bf7
    public final void e0() {
        this.m.e0();
    }

    @Override // o.bf7
    public final boolean isOpen() {
        return this.m.isOpen();
    }

    @Override // o.bf7
    public final void n() {
        this.m.n();
    }

    @Override // o.bf7
    public final Cursor o(l07 l07Var) {
        return (Cursor) this.n.T(((hf7) l07Var.n).n, new d(this, l07Var, (byte) 2));
    }

    @Override // o.bf7
    public final void s(String str) throws Throwable {
        this.n.T(str, new d(this, str, (byte) 0));
    }

    @Override // o.bf7
    public final boolean s0() {
        return this.m.s0();
    }

    @Override // o.bf7
    public final jf7 x(String str) {
        str.getClass();
        return new h(this.m.x(str), this.n, str);
    }

    @Override // o.bf7
    public final boolean y0() {
        return this.m.y0();
    }
}
