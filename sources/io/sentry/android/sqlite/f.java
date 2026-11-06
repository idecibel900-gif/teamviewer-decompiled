package io.sentry.android.sqlite;

import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, byte b) {
        super(0);
        this.n = b;
        this.f178o = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        g gVar = this.f178o;
        switch (b) {
            case 0:
                return new e(gVar.m.R(), gVar.n);
            default:
                return new e(gVar.m.X(), gVar.n);
        }
    }
}
