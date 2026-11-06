package o;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 o.bf4[], still in use, count: 1, list:
  (r1v4 o.bf4[]) from 0x00b3: CONSTRUCTOR (r2v4 o.jc2) = (r1v4 o.bf4[]) A[MD:(java.lang.Enum[]):void (m)] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bf4 {
    None(0),
    /* JADX INFO: Fake field, exist only in values array */
    IncompatibleVersionUpdate(1),
    /* JADX INFO: Fake field, exist only in values array */
    FTNoGUIIsRunning(2),
    /* JADX INFO: Fake field, exist only in values array */
    IncomingBlockedMeetingRunning(3),
    /* JADX INFO: Fake field, exist only in values array */
    IncompatibleMeetingVersion(4),
    /* JADX INFO: Fake field, exist only in values array */
    VideoChatBlocked(5),
    /* JADX INFO: Fake field, exist only in values array */
    LicenseRequired(6),
    /* JADX INFO: Fake field, exist only in values array */
    IncomingBlockedRemoteSupportRunning(7),
    /* JADX INFO: Fake field, exist only in values array */
    FileTransferNotSupported(9),
    /* JADX INFO: Fake field, exist only in values array */
    RequiredRSModuleNotSupported(10),
    /* JADX INFO: Fake field, exist only in values array */
    AudioCallBlocked(11),
    /* JADX INFO: Fake field, exist only in values array */
    ClientIcompatibleWithBlizz(12),
    /* JADX INFO: Fake field, exist only in values array */
    VPNNotSupporte(13),
    /* JADX INFO: Fake field, exist only in values array */
    ScreenShareRequestModuleRequired(13),
    /* JADX INFO: Fake field, exist only in values array */
    PilotLicenseRequired(15),
    /* JADX INFO: Fake field, exist only in values array */
    PilotNotSupport(16),
    /* JADX INFO: Fake field, exist only in values array */
    IoTLicenseRequire(17);

    public static final vv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f421o;
    public final byte m;

    static {
        jc2 jc2Var = new jc2(bf4VarArr);
        n = new vv((byte) 23);
        int iQ = xm4.Q(mv0.Z(jc2Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        j1 j1Var = new j1(jc2Var, (byte) 0);
        while (j1Var.hasNext()) {
            Object next = j1Var.next();
            linkedHashMap.put(Integer.valueOf(((bf4) next).m), next);
        }
        f421o = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bf4(int i) {
        super(str, i);
        this.m = i;
    }

    public static bf4 valueOf(String str) {
        return (bf4) Enum.valueOf(bf4.class, str);
    }

    public static bf4[] values() {
        return (bf4[]) q.clone();
    }
}
