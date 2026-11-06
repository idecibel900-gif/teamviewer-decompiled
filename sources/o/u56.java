package o;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u56 implements s84 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ u56(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        View view;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ai6 ai6Var = (ai6) obj;
                if (l84Var != l84.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                lifecycleOwner.getR().f(this);
                Bundle bundleX0 = ai6Var.r().x0("androidx.savedstate.Restarter");
                if (bundleX0 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleX0.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    hk0.l("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, u56.class.getClassLoader()).asSubclass(wh6.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(ai6Var instanceof we8)) {
                                    yq4.k(ai6Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                ve8 ve8VarO = ((we8) ai6Var).getY();
                                a65 a65VarR = ai6Var.r();
                                LinkedHashMap linkedHashMap = ve8VarO.a;
                                LinkedHashMap linkedHashMap2 = ve8VarO.a;
                                Iterator it = lv0.T0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    oe8 oe8Var = (oe8) linkedHashMap2.get(it.next());
                                    if (oe8Var != null) {
                                        vt1.k(oe8Var, a65VarR, ai6Var.getR());
                                    }
                                }
                                if (!lv0.T0(linkedHashMap2.keySet()).isEmpty()) {
                                    a65VarR.U0();
                                }
                            } catch (Exception e) {
                                an4.n(ua5.m("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        an4.n(fx3.g("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                my0 my0Var = (my0) obj;
                if (my0Var.q == null) {
                    hy0 hy0Var = (hy0) my0Var.getLastNonConfigurationInstance();
                    if (hy0Var != null) {
                        my0Var.q = hy0Var.a;
                    }
                    if (my0Var.q == null) {
                        my0Var.q = new ve8();
                    }
                }
                my0Var.m.f(this);
                return;
            case 2:
                new HashMap();
                by2[] by2VarArr = (by2[]) obj;
                if (by2VarArr.length > 0) {
                    by2 by2Var = by2VarArr[0];
                    throw null;
                }
                if (by2VarArr.length <= 0) {
                    return;
                }
                by2 by2Var2 = by2VarArr[0];
                throw null;
            case 3:
                if (l84Var != l84.ON_STOP || (view = ((ut2) obj).U) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (l84Var != l84.ON_CREATE) {
                    yq4.k(l84Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    lifecycleOwner.getR().f(this);
                    ((uh6) obj).b();
                    return;
                }
        }
    }
}
