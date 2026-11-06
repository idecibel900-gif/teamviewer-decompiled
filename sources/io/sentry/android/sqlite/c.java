package io.sentry.android.sqlite;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import io.sentry.android.replay.a0;
import io.sentry.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends CursorWrapper implements CrossProcessCursor {
    public final CrossProcessCursor m;
    public final o n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f176o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CrossProcessCursor crossProcessCursor, o oVar, String str) {
        super(crossProcessCursor);
        str.getClass();
        this.m = crossProcessCursor;
        this.n = oVar;
        this.f176o = str;
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i, CursorWindow cursorWindow) throws Throwable {
        if (this.p) {
            this.m.fillWindow(i, cursorWindow);
            return;
        }
        this.p = true;
        this.n.T(this.f176o, new a(this, i, cursorWindow));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        if (this.p) {
            return this.m.getCount();
        }
        this.p = true;
        return ((Number) this.n.T(this.f176o, new a0(this, (byte) 4))).intValue();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.m.getWindow();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        if (this.p) {
            return this.m.onMove(i, i2);
        }
        this.p = true;
        return ((Boolean) this.n.T(this.f176o, new b(this, i, i2))).booleanValue();
    }
}
