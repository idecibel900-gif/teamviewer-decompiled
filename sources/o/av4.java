package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class av4 extends fq5 {
    public static final Parcelable.Creator<av4> CREATOR = new dq8((byte) 25);
    public HashSet m;

    public av4(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.m = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.m, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m.size());
        HashSet hashSet = this.m;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }
}
