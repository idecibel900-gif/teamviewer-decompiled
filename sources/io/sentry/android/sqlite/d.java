package io.sentry.android.sqlite;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import kotlin.jvm.functions.Function0;
import o.f88;
import o.l07;
import o.nq5;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f177o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, byte b) {
        super(0);
        this.n = b;
        this.f177o = obj;
        this.p = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        f88 f88Var = f88.a;
        Object obj = this.p;
        Object obj2 = this.f177o;
        switch (b) {
            case 0:
                ((e) obj2).m.s((String) obj);
                return f88Var;
            case 1:
                ((e) obj2).m.N((Object[]) obj);
                return f88Var;
            case 2:
                return ((e) obj2).m.o((l07) obj);
            case 3:
                return new File(((Context) obj2).getApplicationContext().getFilesDir(), "datastore/".concat(((nq5) obj).m.concat(".preferences_pb")));
            default:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
