package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class is7 extends m {
    public static final Parcelable.Creator<is7> CREATOR = new i57((byte) 6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f1097o;
    public boolean p;
    public CharSequence q;
    public CharSequence r;
    public CharSequence s;

    public is7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1097o = (CharSequence) creator.createFromParcel(parcel);
        this.p = parcel.readInt() == 1;
        this.q = (CharSequence) creator.createFromParcel(parcel);
        this.r = (CharSequence) creator.createFromParcel(parcel);
        this.s = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1097o) + " hint=" + ((Object) this.q) + " helperText=" + ((Object) this.r) + " placeholderText=" + ((Object) this.s) + "}";
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1097o, parcel, i);
        parcel.writeInt(this.p ? 1 : 0);
        TextUtils.writeToParcel(this.q, parcel, i);
        TextUtils.writeToParcel(this.r, parcel, i);
        TextUtils.writeToParcel(this.s, parcel, i);
    }
}
