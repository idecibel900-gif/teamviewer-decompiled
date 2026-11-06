package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mk7 implements Parcelable {
    public static final Parcelable.Creator<mk7> CREATOR;
    public static final mk7 m;
    public static final mk7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mk7 f1479o;
    public static final /* synthetic */ mk7[] p;
    public static final /* synthetic */ jc2 q;

    static {
        mk7 mk7Var = new mk7("Local", 0);
        m = mk7Var;
        mk7 mk7Var2 = new mk7("Remote", 1);
        n = mk7Var2;
        mk7 mk7Var3 = new mk7("Undefined", 2);
        f1479o = mk7Var3;
        mk7[] mk7VarArr = {mk7Var, mk7Var2, mk7Var3};
        p = mk7VarArr;
        q = new jc2(mk7VarArr);
        CREATOR = new xf5((byte) 14);
    }

    public static mk7 valueOf(String str) {
        return (mk7) Enum.valueOf(mk7.class, str);
    }

    public static mk7[] values() {
        return (mk7[]) p.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(ordinal());
    }
}
