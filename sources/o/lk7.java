package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lk7 implements Parcelable {
    public static final Parcelable.Creator<lk7> CREATOR;
    public static final lk7 m;
    public static final lk7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lk7 f1374o;
    public static final /* synthetic */ lk7[] p;
    public static final /* synthetic */ jc2 q;

    static {
        lk7 lk7Var = new lk7("Directory", 0);
        m = lk7Var;
        lk7 lk7Var2 = new lk7("File", 1);
        n = lk7Var2;
        lk7 lk7Var3 = new lk7("Drive", 2);
        f1374o = lk7Var3;
        lk7[] lk7VarArr = {lk7Var, lk7Var2, lk7Var3};
        p = lk7VarArr;
        q = new jc2(lk7VarArr);
        CREATOR = new xf5((byte) 13);
    }

    public static lk7 valueOf(String str) {
        return (lk7) Enum.valueOf(lk7.class, str);
    }

    public static lk7[] values() {
        return (lk7[]) p.clone();
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
