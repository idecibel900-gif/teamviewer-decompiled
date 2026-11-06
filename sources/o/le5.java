package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class le5 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ le5(ze6 ze6Var) {
        this.m = (byte) 17;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x026c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        byte b = this.m;
        c77 c77Var = null;
        c77Var = null;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((cl0) obj).b = true;
                return f88Var;
            case 1:
                zk3 zk3Var = (zk3) obj;
                return new po(zk3Var.a, zk3Var.b, zk3Var.c, zk3Var.d);
            case 2:
                po poVar = (po) obj;
                return new zk3(Math.round(poVar.a), Math.round(poVar.b), Math.round(poVar.c), Math.round(poVar.d));
            case 3:
                ((Boolean) obj).getClass();
                return f88Var;
            case 4:
                ((bf1) obj).getClass();
                return new vj5();
            case 5:
                yy6 yy6Var = (yy6) obj;
                yy6Var.getClass();
                return Boolean.valueOf(yy6Var != yy6.m);
            case 6:
                return f88Var;
            case 7:
                yo5 yo5Var = (yo5) obj;
                if (yo5Var.isAttachedToWindow()) {
                    yo5Var.q();
                }
                return f88Var;
            case 8:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case ep1.b /* 9 */:
                iy3 iy3Var = (iy3) obj;
                iy3Var.a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                iy3Var.a(fValueOf, 300).b = gu4.b;
                iy3Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                iy3Var.a(fValueOf2, 1800);
                iy3Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                iy3Var.a(fValueOf3, 3300);
                iy3Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                iy3Var.a(fValueOf4, 4800);
                iy3Var.a(fValueOf4, 6000);
                return f88Var;
            case ep1.c /* 10 */:
                pt5 pt5Var = pt5.b;
                fw3[] fw3VarArr = lp6.a;
                np6 np6Var = kp6.c;
                fw3 fw3Var = lp6.a[1];
                np6Var.getClass();
                ((op6) obj).d(np6Var, pt5Var);
                return f88Var;
            case 11:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case ep1.d /* 12 */:
                Exception exc = (Exception) obj;
                int i2 = RemoteControlApplication.G;
                exc.getClass();
                io.sentry.p0 p0Var = new io.sentry.p0();
                p0Var.d("AQS-5481", "Jira work item");
                io.sentry.d5.a(exc, p0Var);
                return f88Var;
            case 13:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
            case 14:
                zb6 zb6Var = (zb6) obj;
                zb6Var.getClass();
                return zb6Var.b;
            case 15:
                io8 io8Var = (io8) obj;
                io8Var.getClass();
                wg5 wg5Var = xb6.r;
                return Boolean.valueOf(us1.E(io8Var.a));
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new vd6();
            case 17:
                ((zh1) obj).getClass();
                throw new e55(0);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return f88Var;
            case 20:
                return new lh6((Map) obj);
            case 21:
                return obj;
            case 22:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) hi6.i.f302o;
                Boolean bool = Boolean.FALSE;
                c77 c77Var2 = (im3.n(obj2, bool) || obj2 == null) ? null : (c77) function1.invoke(obj2);
                Object obj3 = list.get(1);
                c77 c77Var3 = (im3.n(obj3, bool) || obj3 == null) ? null : (c77) function1.invoke(obj3);
                Object obj4 = list.get(2);
                c77 c77Var4 = (im3.n(obj4, bool) || obj4 == null) ? null : (c77) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!im3.n(obj5, bool) && obj5 != null) {
                    c77Var = (c77) function1.invoke(obj5);
                }
                return new bt7(c77Var2, c77Var3, c77Var4, c77Var);
            case 23:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (im3.n(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) hi6.b.f302o).invoke(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new xo(list3, str2);
            case 24:
                obj.getClass();
                return new vp7(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list4 = (List) obj;
                return new cs7(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 26:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                rt7[] rt7VarArr = qt7.b;
                Function1 function2 = hi6.x.n;
                Boolean bool2 = Boolean.FALSE;
                im3.n(obj8, bool2);
                qt7 qt7Var = obj8 != null ? (qt7) function2.invoke(obj8) : null;
                qt7Var.getClass();
                long j = qt7Var.a;
                Object obj9 = list5.get(1);
                im3.n(obj9, bool2);
                qt7 qt7Var2 = obj9 != null ? (qt7) function2.invoke(obj9) : null;
                qt7Var2.getClass();
                return new es7(j, qt7Var2.a);
            case 27:
                obj.getClass();
                return new ms2(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new h40(((Float) obj).floatValue());
            default:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new gt7(h57.a(iIntValue, num2.intValue()));
        }
    }

    public /* synthetic */ le5(byte b) {
        this.m = b;
    }
}
