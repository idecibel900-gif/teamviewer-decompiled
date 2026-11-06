package io.sentry.android.sqlite;

import android.database.CursorWindow;
import kotlin.jvm.functions.Function0;
import o.f88;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends yz3 implements Function0 {
    public final /* synthetic */ c n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f174o;
    public final /* synthetic */ CursorWindow p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i, CursorWindow cursorWindow) {
        super(0);
        this.n = cVar;
        this.f174o = i;
        this.p = cursorWindow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        this.n.m.fillWindow(this.f174o, this.p);
        return f88.a;
    }
}
