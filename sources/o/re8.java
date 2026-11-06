package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class re8 extends te8 {
    public static re8 c;
    public static final ol5 d = new ol5((byte) 16);
    public final Application b;

    public re8(Application application) {
        this.b = application;
    }

    @Override // o.te8, o.se8
    public final oe8 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        yq4.r("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // o.te8, o.se8
    public final oe8 b(Class cls, hw4 hw4Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) hw4Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!zl.class.isAssignableFrom(cls)) {
            return lv1.H(cls);
        }
        hk0.g("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final oe8 d(Class cls, Application application) {
        if (!zl.class.isAssignableFrom(cls)) {
            return lv1.H(cls);
        }
        try {
            oe8 oe8Var = (oe8) cls.getConstructor(Application.class).newInstance(application);
            oe8Var.getClass();
            return oe8Var;
        } catch (IllegalAccessException e) {
            an4.m("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            an4.m("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            an4.m("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            an4.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
