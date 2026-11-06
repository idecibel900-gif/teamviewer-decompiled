package o;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qh6 implements nh6, ai6 {
    public final /* synthetic */ oh6 m;
    public x84 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a65 f1832o;

    public qh6(oh6 oh6Var) {
        this.m = oh6Var;
        Object objF = oh6Var.f("o.a65");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.f1832o == null) {
            a65 a65Var = new a65(new zh6(this, new y26(this, (byte) 7)));
            this.f1832o = a65Var;
            a65Var.N0(bundle);
        }
        oh6Var.g("o.a65", new y26(this, (byte) 5));
    }

    @Override // o.nh6
    public final boolean a(Object obj) {
        return this.m.a(obj);
    }

    @Override // o.nh6
    public final Map e() {
        return this.m.e();
    }

    @Override // o.nh6
    public final Object f(String str) {
        return this.m.f(str);
    }

    @Override // o.nh6
    public final mh6 g(String str, Function0 function0) {
        return this.m.g(str, function0);
    }

    @Override // o.ai6
    public final a65 r() {
        a65 a65Var = this.f1832o;
        if (a65Var == null) {
            a65 a65Var2 = new a65(new zh6(this, new y26(this, (byte) 7)));
            this.f1832o = a65Var2;
            a65Var2.N0(null);
            a65Var = a65Var2;
        }
        return (a65) a65Var.f302o;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z */
    public final x84 getR() {
        x84 x84Var = this.n;
        if (x84Var != null) {
            return x84Var;
        }
        x84 x84Var2 = new x84(this, false);
        this.n = x84Var2;
        return x84Var2;
    }
}
