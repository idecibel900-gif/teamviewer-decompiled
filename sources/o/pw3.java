package o;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class pw3 implements Function0 {
    public final /* synthetic */ byte m;
    public final qw3 n;

    public /* synthetic */ pw3(qw3 qw3Var, byte b) {
        this.m = b;
        this.n = qw3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        qw3 qw3Var = this.n;
        switch (b) {
            case 0:
                return qw3Var.a(qw3Var.m);
            default:
                u86 u86Var = qw3Var.n;
                Type type = u86Var != null ? (Type) u86Var.a() : null;
                type.getClass();
                return p76.c(type);
        }
    }
}
