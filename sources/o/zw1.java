package o;

import android.app.PendingIntent;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2740o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ zw1(me1 me1Var, xy6 xy6Var, Function0 function0, hw2 hw2Var, String str, String str2) {
        this.m = (byte) 1;
        this.n = me1Var;
        this.f2740o = xy6Var;
        this.p = function0;
        this.q = hw2Var;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws NoSuchMethodException, PendingIntent.CanceledException, ClassNotFoundException, IOException {
        boolean z;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.n;
        Object obj5 = this.p;
        Object obj6 = this.f2740o;
        switch (b) {
            case 0:
                ((Function1) obj6).invoke(new bk((fx1) obj5, (me1) obj4, (px4) obj3, (px4) obj2, (ul1) obj, (byte) 3));
                break;
            case 1:
                im3.R((me1) obj4, null, null, new aj((xy6) obj6, (Function0) obj5, (hw2) obj3, (String) obj2, (String) obj, null, (byte) 9), 3);
                break;
            default:
                jh6 jh6Var = (jh6) obj6;
                di6 di6Var = (di6) obj5;
                nh6 nh6Var = (nh6) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (jh6Var.n != nh6Var) {
                    jh6Var.n = nh6Var;
                    z = true;
                } else {
                    z = false;
                }
                if (im3.n(jh6Var.f1166o, str)) {
                    z2 = z;
                } else {
                    jh6Var.f1166o = str;
                }
                jh6Var.m = di6Var;
                jh6Var.p = obj2;
                jh6Var.q = objArr;
                mh6 mh6Var = jh6Var.r;
                if (mh6Var != null && z2) {
                    ((ep3) mh6Var).G();
                    jh6Var.r = null;
                    jh6Var.d();
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ zw1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.m = b;
        this.f2740o = obj;
        this.p = obj2;
        this.n = obj3;
        this.q = obj4;
        this.r = obj5;
        this.s = obj6;
    }
}
