package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.p02[], still in use, count: 1, list:
  (r0v1 o.p02[]) from 0x004b: CONSTRUCTOR (r0v1 o.p02[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class p02 implements Parcelable {
    Cancelled(-1),
    Positive(0),
    Negative(1),
    Neutral(2),
    /* JADX INFO: Fake field, exist only in values array */
    MiscButton(3),
    /* JADX INFO: Fake field, exist only in values array */
    ButtonCnt(4),
    Dismiss(5);

    public static final o02 CREATOR = new o02();
    public static final /* synthetic */ jc2 t;
    public final byte m;

    static {
        t = new jc2(new p02[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public p02(int i) {
        super(str, i);
        this.m = (byte) i;
    }

    public static p02 valueOf(String str) {
        return (p02) Enum.valueOf(p02.class, str);
    }

    public static p02[] values() {
        return (p02[]) s.clone();
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
