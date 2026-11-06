package o;

import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 o.g06, still in use, count: 1, list:
  (r1v0 o.g06) from 0x04fd: CONSTRUCTOR (wrap java.lang.Class:0x04fb: CONST_CLASS  A[WRAPPED] o.g06.class), (r1v0 o.g06) A[MD:(java.lang.Class, java.lang.Enum):void (m), WRAPPED] call: o.cj3.<init>(java.lang.Class, java.lang.Enum):void type: CONSTRUCTOR
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
public final class g06 implements ph0 {
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestSession((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestSessionResponse((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdDiscoverModules((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdDiscoverModulesResponse((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSetupComplete((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSetupCompleteResponse((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSubscribeModules((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSubscribeModulesResponse((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSubscribeModulesConfirmed((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdUnsubscribeModules((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdUnsubscribeModulesResponse((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSessionTeardown((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSessionTeardownResponse((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdSessionSummary((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 17),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 19),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 22),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 23),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 24),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 25),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 27),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 28),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 29),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 30),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 31),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 32),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 33),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 34),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 35),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 36),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 37),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 38),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 39),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 40),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 41),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 42),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 43),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 44),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 45),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 46),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 47),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 48),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 49),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 50),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 51),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 52),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 53),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 54),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 55),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 56),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 57),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 58),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 59),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 60),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 61),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 62),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 63),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 64),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 65),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 66),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 67),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 68),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 69),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 70),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 71),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 72),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 73),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 74),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 75),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 76),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 77),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 78),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 79),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 80),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 81),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 82),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 83),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 84),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 85),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 86),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStart((byte) 87),
    /* JADX INFO: Fake field, exist only in values array */
    RSCmdRequestAppStartResponse((byte) 88);

    public static final wj5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cj3 f842o;
    public final byte m;

    static {
        g06 g06Var = RSCmdSubscribeModulesResponse;
        g06 g06Var2 = RSCmdSubscribeModulesConfirmed;
        g06 g06Var3 = RSCmdSessionTeardownResponse;
        g06 g06Var4 = RSCmdRequestAppStartResponse;
        n = new wj5((byte) 3);
        f842o = new cj3(g06.class, g06Var);
        EnumMap enumMap = new EnumMap(g06.class);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var4, g06Var4);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var3, g06Var);
        enumMap.put(g06Var, g06Var3);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var2, g06Var);
        enumMap.put(g06Var, g06Var2);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
        enumMap.put(g06Var, g06Var);
    }

    public g06(byte b) {
        super(str, i);
        this.m = b;
    }

    public static g06 valueOf(String str) {
        return (g06) Enum.valueOf(g06.class, str);
    }

    public static g06[] values() {
        return (g06[]) p.clone();
    }

    @Override // o.ph0
    public final byte a() {
        return this.m;
    }
}
