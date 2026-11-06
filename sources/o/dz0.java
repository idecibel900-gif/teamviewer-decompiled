package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz0 implements kw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ dz0(byte b) {
        this.m = b;
    }

    @Override // o.kw2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                rp7 rp7Var = (rp7) obj;
                fp7 fp7Var = (fp7) obj2;
                Function0 function0 = (Function0) obj3;
                ux2 ux2Var = (ux2) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ux2Var.f(rp7Var) : ux2Var.h(rp7Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? ux2Var.f(fp7Var) : ux2Var.h(fp7Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= ux2Var.h(function0) ? 256 : 128;
                }
                if (!ux2Var.N(i & 1, (i & 1171) != 1170)) {
                    ux2Var.Q();
                } else {
                    rl1.c(rp7Var, fp7Var, function0, ux2Var, i & 1022);
                }
                break;
            case 1:
                rp7 rp7Var2 = (rp7) obj;
                fp7 fp7Var2 = (fp7) obj2;
                Function0 function1 = (Function0) obj3;
                ux2 ux2Var2 = (ux2) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ux2Var2.f(rp7Var2) : ux2Var2.h(rp7Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? ux2Var2.f(fp7Var2) : ux2Var2.h(fp7Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= ux2Var2.h(function1) ? 256 : 128;
                }
                if (!ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
                    ux2Var2.Q();
                } else {
                    rl1.c(rp7Var2, fp7Var2, function1, ux2Var2, i2 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((gt7) obj5).a;
                String string = ((CharSequence) obj4).subSequence(gt7.f(j), gt7.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return f88Var;
    }
}
