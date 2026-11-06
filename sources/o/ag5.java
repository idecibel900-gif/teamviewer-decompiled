package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ag5 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ag5(byte b) {
        this.a = b;
    }

    public static bg5 a(Parcel parcel, ClassLoader classLoader) {
        c57 c57Var;
        if (classLoader == null) {
            classLoader = ag5.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            c57Var = xz2.P;
        } else if (i == 1) {
            c57Var = yl7.X;
        } else {
            if (i != 2) {
                hk0.l(fx3.f(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            c57Var = yl7.T;
        }
        return new bg5(value, c57Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return m.n;
                }
                hk0.l("superState must be null");
                return null;
            case 2:
                return new dq0(parcel, classLoader);
            case 3:
                return new sf2(parcel, classLoader);
            case 4:
                return new k05(parcel, classLoader);
            case 5:
                return new cg5(parcel, classLoader);
            case 6:
                return new fm6(parcel, classLoader);
            default:
                return new jz7(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bg5[i];
            case 1:
                return new m[i];
            case 2:
                return new dq0[i];
            case 3:
                return new sf2[i];
            case 4:
                return new k05[i];
            case 5:
                return new cg5[i];
            case 6:
                return new fm6[i];
            default:
                return new jz7[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return m.n;
                }
                hk0.l("superState must be null");
                return null;
            case 2:
                return new dq0(parcel, null);
            case 3:
                return new sf2(parcel, null);
            case 4:
                return new k05(parcel, null);
            case 5:
                return new cg5(parcel, null);
            case 6:
                return new fm6(parcel, null);
            default:
                return new jz7(parcel, null);
        }
    }
}
