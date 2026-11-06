package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd8 {
    public final vw a;
    public final vw b;
    public final vw c;

    public fd8(vw vwVar, vw vwVar2, vw vwVar3) {
        this.a = vwVar;
        this.b = vwVar2;
        this.c = vwVar3;
    }

    public abstract gd8 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        vw vwVar = this.c;
        Class cls2 = (Class) vwVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        vwVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        vw vwVar = this.a;
        Method method = (Method) vwVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, fd8.class.getClassLoader()).getDeclaredMethod("read", fd8.class);
        vwVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        vw vwVar = this.b;
        Method method = (Method) vwVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, fd8.class);
        vwVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((gd8) this).e.readParcelable(gd8.class.getClassLoader());
    }

    public final hd8 g() {
        String string = ((gd8) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (hd8) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            an4.n("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            an4.n("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            an4.n("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            an4.n("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(hd8 hd8Var) {
        if (hd8Var == null) {
            ((gd8) this).e.writeString(null);
            return;
        }
        try {
            ((gd8) this).e.writeString(b(hd8Var.getClass()).getName());
            gd8 gd8VarA = a();
            try {
                d(hd8Var.getClass()).invoke(null, hd8Var, gd8VarA);
                Parcel parcel = gd8VarA.e;
                int i = gd8VarA.i;
                if (i >= 0) {
                    int i2 = gd8VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                an4.n("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                an4.n("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                an4.n("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                an4.n("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            an4.n(hd8Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
