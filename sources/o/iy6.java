package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class iy6 {
    public final i9 a;
    public final r31 b;
    public final Context c;
    public final String d;
    public final kh7 e;
    public final Set f;

    public iy6(Context context, String str, Set set, i9 i9Var, r31 r31Var) {
        str.getClass();
        set.getClass();
        io.sentry.android.sqlite.d dVar = new io.sentry.android.sqlite.d(context, str, (byte) 4);
        this.a = i9Var;
        this.b = r31Var;
        this.c = context;
        this.d = str;
        this.e = new kh7(dVar);
        this.f = set == ky6.a ? null : lv0.S0(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, jc1 jc1Var) throws Throwable {
        hy6 hy6Var;
        if (jc1Var instanceof hy6) {
            hy6Var = (hy6) jc1Var;
            int i = hy6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy6Var.p = i - Integer.MIN_VALUE;
            } else {
                hy6Var = new hy6(this, jc1Var);
            }
        } else {
            hy6Var = new hy6(this, jc1Var);
        }
        Object objInvoke = hy6Var.n;
        int i2 = hy6Var.p;
        boolean z = true;
        if (i2 == 0) {
            ct1.a0(objInvoke);
            hy6Var.m = this;
            hy6Var.p = 1;
            objInvoke = this.a.invoke(obj, hy6Var);
            ne1 ne1Var = ne1.m;
            if (objInvoke == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = hy6Var.m;
            ct1.a0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f;
        kh7 kh7Var = this.e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) kh7Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) kh7Var.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
