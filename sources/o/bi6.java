package o;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bi6 implements se8 {
    public final Application a;
    public final re8 b;
    public final Bundle c;
    public final x84 d;
    public final a65 e;

    public bi6(Application application, ai6 ai6Var, Bundle bundle) {
        re8 re8Var;
        this.e = ai6Var.r();
        this.d = ai6Var.getR();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            re8Var = re8.c;
            if (re8Var == null) {
                re8Var = new re8(application);
                re8.c = re8Var;
            }
        } else {
            re8Var = new re8(null);
        }
        this.b = re8Var;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // o.se8
    public final oe8 b(Class cls, hw4 hw4Var) {
        LinkedHashMap linkedHashMap = hw4Var.a;
        String str = (String) linkedHashMap.get(ue8.b);
        if (str == null) {
            hk0.l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(j51.u) == null || linkedHashMap.get(j51.v) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            hk0.l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(re8.d);
        boolean zIsAssignableFrom = zl.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? ci6.a(cls, ci6.b) : ci6.a(cls, ci6.a);
        if (constructorA == null) {
            return this.b.b(cls, hw4Var);
        }
        return (!zIsAssignableFrom || application == null) ? ci6.b(cls, constructorA, j51.A(hw4Var)) : ci6.b(cls, constructorA, application, j51.A(hw4Var));
    }

    @Override // o.se8
    public final oe8 c(wt3 wt3Var, hw4 hw4Var) {
        return b(et1.z(wt3Var), hw4Var);
    }

    public final oe8 d(Class cls, String str) {
        rh6 rh6Var;
        x84 x84Var = this.d;
        if (x84Var == null) {
            yq4.r("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = zl.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? ci6.a(cls, ci6.b) : ci6.a(cls, ci6.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            te8 te8Var = te8.a;
            if (te8Var == null) {
                te8Var = new te8();
                te8.a = te8Var;
            }
            return te8Var.a(cls);
        }
        a65 a65Var = this.e;
        a65Var.getClass();
        Bundle bundleX0 = a65Var.x0(str);
        if (bundleX0 == null) {
            bundleX0 = this.c;
        }
        if (bundleX0 == null) {
            rh6Var = new rh6();
        } else {
            ClassLoader classLoader = rh6.class.getClassLoader();
            classLoader.getClass();
            bundleX0.setClassLoader(classLoader);
            im4 im4Var = new im4(bundleX0.size());
            for (String str2 : bundleX0.keySet()) {
                str2.getClass();
                im4Var.put(str2, bundleX0.get(str2));
            }
            rh6Var = new rh6(im4Var.b());
        }
        sh6 sh6Var = new sh6(str, rh6Var);
        sh6Var.j(a65Var, x84Var);
        m84 m84Var = x84Var.i;
        if (m84Var == m84.n || m84Var.compareTo(m84.p) >= 0) {
            a65Var.U0();
        } else {
            x84Var.a(new sk1((Object) x84Var, (Object) a65Var, (byte) 1));
        }
        oe8 oe8VarB = (!zIsAssignableFrom || application == null) ? ci6.b(cls, constructorA, rh6Var) : ci6.b(cls, constructorA, application, rh6Var);
        oe8VarB.R0("androidx.lifecycle.savedstate.vm.tag", sh6Var);
        return oe8VarB;
    }
}
