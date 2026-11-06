package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww1 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2453o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ww1(Function0 function0, boolean z, Function1 function1) {
        this.f2453o = function0;
        this.n = z;
        this.p = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        switch (this.m) {
            case 0:
                Function0 function0 = (Function0) this.f2453o;
                boolean z = this.n;
                Function1 function1 = (Function1) this.p;
                function0.a();
                if (z) {
                    function1.invoke(new l33(new h33(-1), null, 14));
                } else {
                    function1.invoke(null);
                }
                return f88.a;
            default:
                boolean z2 = this.n;
                a65 a65Var = (a65) this.f2453o;
                String str = (String) this.p;
                if (z2) {
                    zh6 zh6Var = (zh6) a65Var.n;
                    synchronized (zh6Var.c) {
                    }
                }
                return f88.a;
        }
    }

    public /* synthetic */ ww1(boolean z, a65 a65Var, String str) {
        this.n = z;
        this.f2453o = a65Var;
        this.p = str;
    }
}
