package io.sentry.android.replay;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import o.f88;
import o.fn4;
import o.ub7;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends yz3 implements Function1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f140o;
    public static final c p;
    public static final c q;
    public final /* synthetic */ byte n;

    static {
        int i = 1;
        f140o = new c(i, (byte) 0);
        p = new c(i, (byte) 1);
        q = new c(i, (byte) 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.n) {
            case 0:
                fn4 fn4Var = (fn4) obj;
                fn4Var.getClass();
                String strGroup = fn4Var.a.group();
                strGroup.getClass();
                String upperCase = String.valueOf(ub7.c0(strGroup)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
            default:
                ((Date) obj).getClass();
                return f88.a;
        }
    }
}
