package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i57 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static j57 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = i57.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new j57();
        }
        kk5 kk5VarF = l17.n.f();
        for (int i2 = 0; i2 < i; i2++) {
            kk5VarF.add(parcel.readValue(classLoader));
        }
        return new j57(kk5VarF.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new l90(parcel, null);
            case 2:
                return new ed1(parcel, null);
            case 3:
                return new in4(parcel, null);
            case 4:
                return new m15(parcel, null);
            case 5:
                return new v66(parcel, null);
            default:
                return new is7(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j57[i];
            case 1:
                return new l90[i];
            case 2:
                return new ed1[i];
            case 3:
                return new in4[i];
            case 4:
                return new m15[i];
            case 5:
                return new v66[i];
            default:
                return new is7[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new l90(parcel, classLoader);
            case 2:
                return new ed1(parcel, classLoader);
            case 3:
                return new in4(parcel, classLoader);
            case 4:
                return new m15(parcel, classLoader);
            case 5:
                return new v66(parcel, classLoader);
            default:
                return new is7(parcel, classLoader);
        }
    }
}
