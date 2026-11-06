package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 o.vi8[], still in use, count: 1, list:
  (r0v3 o.vi8[]) from 0x0097: CONSTRUCTOR (r0v3 o.vi8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vi8 {
    Undefined(-1),
    FileTransferAccess(0),
    RemoteControlAccess(1),
    DisableRemoteInput(2),
    ChangeSides(3),
    ControlRemoteTV(4),
    AllowVPN(5),
    AllowPartnerViewDesktop(6),
    /* JADX INFO: Fake field, exist only in values array */
    AllowPresenterHandOver(7),
    ShareMyFiles(8),
    ShareFilesWithMe(9),
    /* JADX INFO: Fake field, exist only in values array */
    ChangeDirAskNetworkOnly(10),
    /* JADX INFO: Fake field, exist only in values array */
    PrintOnRemotePrinter(11),
    /* JADX INFO: Fake field, exist only in values array */
    PrintOnMyPrinter(12);

    public static final ol5 n = new ol5((byte) 17);
    public static final /* synthetic */ jc2 z;
    public final int m;

    static {
        z = new jc2(new vi8[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, new vi8(10), new vi8(11), new vi8(12)});
    }

    public vi8(int i) {
        super(str, i);
        this.m = i;
    }

    public static vi8 valueOf(String str) {
        return (vi8) Enum.valueOf(vi8.class, str);
    }

    public static vi8[] values() {
        return (vi8[]) y.clone();
    }
}
