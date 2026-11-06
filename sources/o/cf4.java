package o;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 o.cf4[], still in use, count: 1, list:
  (r1v9 o.cf4[]) from 0x00e2: CONSTRUCTOR (r2v9 o.jc2) = (r1v9 o.cf4[]) A[MD:(java.lang.Enum[]):void (m)] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cf4 {
    Unknown(0),
    /* JADX INFO: Fake field, exist only in values array */
    NoIncomingOrBlocked(1),
    /* JADX INFO: Fake field, exist only in values array */
    NoLanConnection(2),
    /* JADX INFO: Fake field, exist only in values array */
    BlackListed(3),
    /* JADX INFO: Fake field, exist only in values array */
    SmartAccessRejected(4),
    /* JADX INFO: Fake field, exist only in values array */
    SmartAccessPresentationRejected(5),
    /* JADX INFO: Fake field, exist only in values array */
    TVnotVisible(6),
    /* JADX INFO: Fake field, exist only in values array */
    VersionIncompatible(7),
    /* JADX INFO: Fake field, exist only in values array */
    HostedMeeting(8),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectionModeNotSupported(9),
    /* JADX INFO: Fake field, exist only in values array */
    MultipleConnectionsNotSupported(10),
    /* JADX INFO: Fake field, exist only in values array */
    LicenseRequired(11),
    /* JADX INFO: Fake field, exist only in values array */
    AccessControlDenied(12),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyAccountVerificationFailed(13),
    /* JADX INFO: Fake field, exist only in values array */
    RAApiAccessRejected(14),
    /* JADX INFO: Fake field, exist only in values array */
    PolicyConflict(15),
    /* JADX INFO: Fake field, exist only in values array */
    EasyAccessRequiredByPolicy(16),
    /* JADX INFO: Fake field, exist only in values array */
    PromptForConfirmationBlockedByPolicy(17),
    /* JADX INFO: Fake field, exist only in values array */
    IncomingConnectionsNotSupported(18),
    /* JADX INFO: Fake field, exist only in values array */
    WebScreenSharingNotSupported(19),
    /* JADX INFO: Fake field, exist only in values array */
    WebScreenSharingLicenseRequired(20);

    public static final aw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f523o;
    public final byte m;

    static {
        jc2 jc2Var = new jc2(cf4VarArr);
        n = new aw((byte) 23);
        int iQ = xm4.Q(mv0.Z(jc2Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        j1 j1Var = new j1(jc2Var, (byte) 0);
        while (j1Var.hasNext()) {
            Object next = j1Var.next();
            linkedHashMap.put(Integer.valueOf(((cf4) next).m), next);
        }
        f523o = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cf4(int i) {
        super(str, i);
        this.m = i;
    }

    public static cf4 valueOf(String str) {
        return (cf4) Enum.valueOf(cf4.class, str);
    }

    public static cf4[] values() {
        return (cf4[]) q.clone();
    }
}
