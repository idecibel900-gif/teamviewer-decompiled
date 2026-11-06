package o;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xu extends og7 implements hw2 {
    public final /* synthetic */ av m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2549o;
    public final /* synthetic */ ak3 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ px4 s;
    public final /* synthetic */ px4 t;
    public final /* synthetic */ px4 u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(av avVar, String str, String str2, ak3 ak3Var, Function0 function0, boolean z, px4 px4Var, px4 px4Var2, px4 px4Var3, Context context, Function1 function1, String str3, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = avVar;
        this.n = str;
        this.f2549o = str2;
        this.p = ak3Var;
        this.q = function0;
        this.r = z;
        this.s = px4Var;
        this.t = px4Var2;
        this.u = px4Var3;
        this.v = context;
        this.w = function1;
        this.x = str3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new xu(this.m, this.n, this.f2549o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        xu xuVar = (xu) create((me1) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        xuVar.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        ak3 ak3Var = this.p;
        xa xaVar = new xa(ak3Var, this.r, this.s, this.t, this.u);
        Context context = this.v;
        Function1 function1 = this.w;
        String str = this.x;
        Function0 function0 = this.q;
        l8 l8Var = new l8(context, function1, str, ak3Var, function0, (byte) 4);
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        int i = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        zq zqVar = new zq((byte) 8);
        av avVar = this.m;
        avVar.getClass();
        String str3 = this.n;
        str3.getClass();
        ak3Var.getClass();
        function0.getClass();
        Pattern patternCompile = Pattern.compile("[^0-9.]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(this.f2549o).replaceAll("");
        strReplaceAll.getClass();
        hv hvVar = avVar.e;
        if (hvVar != null) {
            avVar.a(hvVar, strReplaceAll, xaVar, l8Var, function0);
        } else {
            im3.R(avVar.b, (fe1) avVar.d.n, null, new zu(avVar, "remotecontrol", str3, strReplaceAll, str2, language, i, ak3Var, xaVar, l8Var, function0, zqVar, null), 2);
        }
        return f88.a;
    }
}
