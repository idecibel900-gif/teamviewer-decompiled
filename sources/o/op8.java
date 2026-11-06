package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class op8 extends q2 {
    public static final Parcelable.Creator<op8> CREATOR = new xf5((byte) 22);
    public final List m;
    public final String n;

    public op8(String str, ArrayList arrayList) {
        this.m = arrayList;
        this.n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        List<String> list = this.m;
        if (list != null) {
            int iB1 = et1.b0(parcel, 1);
            parcel.writeStringList(list);
            et1.c0(parcel, iB1);
        }
        et1.X(parcel, 2, this.n);
        et1.c0(parcel, iB0);
    }
}
