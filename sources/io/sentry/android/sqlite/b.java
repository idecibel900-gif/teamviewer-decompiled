package io.sentry.android.sqlite;

import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends yz3 implements Function0 {
    public final /* synthetic */ c n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f175o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i, int i2) {
        super(0);
        this.n = cVar;
        this.f175o = i;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        return Boolean.valueOf(this.n.m.onMove(this.f175o, this.p));
    }
}
