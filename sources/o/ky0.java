package o;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ext.SdkExtensions;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ky0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ my0 h;

    public ky0(my0 my0Var) {
        this.h = my0Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        i8 i8Var = (i8) this.e.get(str);
        if ((i8Var != null ? i8Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                i8Var.a.a(i8Var.b.w(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new z7(intent, i2));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i, e8 e8Var, Object obj, df6 df6Var) {
        f4 f4Var;
        Intent intent;
        Intent intentPutExtra;
        Bundle bundleExtra;
        byte b = e8Var.a;
        Bundle bundle = null;
        my0 my0Var = this.h;
        switch (b) {
            case 0:
                ((ok5) obj).getClass();
                f4Var = null;
                break;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    f4Var = new f4(fa2.m);
                } else {
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            int iQ = xm4.Q(strArr.length);
                            if (iQ < 16) {
                                iQ = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                            for (String str : strArr) {
                                linkedHashMap.put(str, Boolean.TRUE);
                            }
                            f4Var = new f4(linkedHashMap);
                        } else if (hm3.h(my0Var, strArr[i2]) != 0) {
                            f4Var = null;
                        } else {
                            i2++;
                        }
                    }
                }
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                if (hm3.h(my0Var, str2) == 0) {
                    f4Var = new f4(Boolean.TRUE);
                } else {
                    f4Var = null;
                }
                break;
            default:
                f4Var = null;
                break;
        }
        if (f4Var != null) {
            new Handler(Looper.getMainLooper()).post(new jy0((byte) 0, i, this, f4Var));
            return;
        }
        switch (e8Var.a) {
            case 0:
                ok5 ok5Var = (ok5) obj;
                ok5Var.getClass();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33 || (i3 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                    intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(g68.r(ok5Var.a));
                    ok5Var.b.getClass();
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                } else if (my0Var.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                    ResolveInfo resolveInfoResolveActivity = my0Var.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                    if (resolveInfoResolveActivity != null) {
                        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                        Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                        intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                        intent2.setType(g68.r(ok5Var.a));
                        ok5Var.b.getClass();
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        intentPutExtra = intent2;
                    } else {
                        hk0.l("Required value was null.");
                        intentPutExtra = null;
                    }
                } else {
                    intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.setType(g68.r(ok5Var.a));
                    if (intent.getType() == null) {
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    }
                }
                intentPutExtra = intent;
                break;
            case 1:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                intentPutExtra.getClass();
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str3});
                intentPutExtra.getClass();
                break;
            case 3:
                intentPutExtra = (Intent) obj;
                intentPutExtra.getClass();
                break;
            case 4:
                il3 il3Var = (il3) obj;
                il3Var.getClass();
                intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", il3Var);
                intentPutExtra.getClass();
                break;
            case 5:
                intentPutExtra = (Intent) obj;
                break;
            default:
                il3 il3Var2 = (il3) obj;
                intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = il3Var2.n;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intentPutExtra.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        il3Var2 = new il3(il3Var2.m, null, il3Var2.f1072o, il3Var2.p);
                    }
                }
                intentPutExtra.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", il3Var2);
                if (su2.M(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intentPutExtra);
                }
                break;
        }
        if (intentPutExtra.getExtras() != null) {
            Bundle extras = intentPutExtra.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentPutExtra.setExtrasClassLoader(my0Var.getClassLoader());
            }
        }
        if (intentPutExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentPutExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentPutExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else if (df6Var != null) {
            bundle = ((ActivityOptions) df6Var.n).toBundle();
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentPutExtra.getAction())) {
            String[] stringArrayExtra = intentPutExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            hm3.A(my0Var, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentPutExtra.getAction())) {
            my0Var.startActivityForResult(intentPutExtra, i, bundle);
            return;
        }
        il3 il3Var3 = (il3) intentPutExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            il3Var3.getClass();
            my0Var.startIntentSenderForResult(il3Var3.m, i, il3Var3.n, il3Var3.f1072o, il3Var3.p, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new jy0((byte) 1, i, this, e));
        }
    }

    public final k8 c(String str, LifecycleOwner lifecycleOwner, e8 e8Var, a8 a8Var) {
        x84 r = lifecycleOwner.getR();
        if (r.i.compareTo(m84.p) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(lifecycleOwner);
            m84 m84Var = r.i;
            sb.append(" is attempting to register while current state is ");
            sb.append(m84Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        j8 j8Var = (j8) linkedHashMap.get(str);
        if (j8Var == null) {
            j8Var = new j8(r);
        }
        h8 h8Var = new h8(this, str, a8Var, e8Var, (byte) 0);
        j8Var.a.a(h8Var);
        j8Var.b.add(h8Var);
        linkedHashMap.put(str, j8Var);
        return new k8(this, str, e8Var, (byte) 0);
    }

    public final k8 d(String str, e8 e8Var, a8 a8Var) {
        str.getClass();
        e(str);
        this.e.put(str, new i8(a8Var, e8Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            a8Var.a(obj);
        }
        Bundle bundle = this.g;
        z7 z7Var = (z7) pm8.u(bundle, str, z7.class);
        if (z7Var != null) {
            bundle.remove(str);
            a8Var.a(e8Var.w(z7Var.n, z7Var.m));
        }
        return new k8(this, str, e8Var, (byte) 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (v51) bq6.i0(new e5((byte) 2))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        an4.j("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbP = ua5.p("Dropping pending result for request ", str, ": ");
            sbP.append(linkedHashMap.get(str));
            io.sentry.android.core.v0.j("ActivityResultRegistry", sbP.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            io.sentry.android.core.v0.j("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((z7) pm8.u(bundle, str, z7.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        j8 j8Var = (j8) linkedHashMap2.get(str);
        if (j8Var != null) {
            ArrayList arrayList = j8Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j8Var.a.f((s84) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
