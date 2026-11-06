package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h8 implements s84 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f955o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ h8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f955o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        ArrayList arrayList;
        byte b = this.m;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.f955o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                ky0 ky0Var = (ky0) obj4;
                LinkedHashMap linkedHashMap = ky0Var.e;
                String str = (String) obj3;
                a8 a8Var = (a8) obj2;
                e8 e8Var = (e8) obj;
                if (l84.ON_START == l84Var) {
                    Bundle bundle = ky0Var.g;
                    LinkedHashMap linkedHashMap2 = ky0Var.f;
                    linkedHashMap.put(str, new i8(a8Var, e8Var));
                    if (linkedHashMap2.containsKey(str)) {
                        Object obj5 = linkedHashMap2.get(str);
                        linkedHashMap2.remove(str);
                        a8Var.a(obj5);
                    }
                    z7 z7Var = (z7) pm8.u(bundle, str, z7.class);
                    if (z7Var != null) {
                        bundle.remove(str);
                        a8Var.a(e8Var.w(z7Var.n, z7Var.m));
                    }
                } else if (l84.ON_STOP == l84Var) {
                    linkedHashMap.remove(str);
                } else if (l84.ON_DESTROY == l84Var) {
                    ky0Var.f(str);
                }
                break;
            default:
                j67 j67Var = (j67) obj4;
                Context context = (Context) obj3;
                f67 f67Var = (f67) obj2;
                px4 px4Var = (px4) obj;
                if (l84Var == l84.ON_RESUME) {
                    if (j67Var.c) {
                        List<v57> list = j67Var.e;
                        arrayList = new ArrayList(mv0.Z(list, 10));
                        for (v57 v57Var : list) {
                            context.getClass();
                            v57Var.getClass();
                            yy0 yy0Var = new yy0(463932745, true, new gg4(v57Var, (byte) 18));
                            String str2 = v57Var.a;
                            String str3 = v57Var.b;
                            String str4 = v57Var.d;
                            PackageManager packageManager = context.getPackageManager();
                            packageManager.getClass();
                            z57 z57VarR = y57.r(packageManager, str4);
                            PackageManager packageManager2 = context.getPackageManager();
                            packageManager2.getClass();
                            String str5 = v57Var.e;
                            arrayList.add(new x57(yy0Var, str2, str3, z57VarR, y57.u(f67Var, packageManager2, str4, str5), y57.s(f67Var, str4, str5)));
                        }
                    } else {
                        List<w57> list2 = j67Var.d;
                        arrayList = new ArrayList(mv0.Z(list2, 10));
                        for (w57 w57Var : list2) {
                            context.getClass();
                            w57Var.getClass();
                            yy0 yy0Var2 = new yy0(523019971, true, new gg4(w57Var, (byte) 19));
                            String string = context.getString(w57Var.a);
                            string.getClass();
                            String string2 = context.getString(w57Var.b);
                            string2.getClass();
                            String str6 = w57Var.d;
                            PackageManager packageManager3 = context.getPackageManager();
                            packageManager3.getClass();
                            z57 z57VarR2 = y57.r(packageManager3, str6);
                            PackageManager packageManager4 = context.getPackageManager();
                            packageManager4.getClass();
                            String str7 = w57Var.e;
                            arrayList.add(new x57(yy0Var2, string, string2, z57VarR2, y57.u(f67Var, packageManager4, str6, str7), y57.s(f67Var, str6, str7)));
                        }
                    }
                    px4Var.setValue(arrayList);
                }
                break;
        }
    }
}
