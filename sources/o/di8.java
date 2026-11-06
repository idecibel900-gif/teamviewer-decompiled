package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o.di8[], still in use, count: 1, list:
  (r0v1 o.di8[]) from 0x0044: CONSTRUCTOR (r0v1 o.di8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class di8 {
    /* JADX INFO: Fake field, exist only in values array */
    PRODUCTION("https://account.teamviewer.com"),
    /* JADX INFO: Fake field, exist only in values array */
    TRUNK("https://account-trunk.teamviewer.com"),
    /* JADX INFO: Fake field, exist only in values array */
    RC0("https://account-rc0.teamviewer.com"),
    /* JADX INFO: Fake field, exist only in values array */
    RC1("https://account-rc1.teamviewer.com"),
    /* JADX INFO: Fake field, exist only in values array */
    STAGING("https://account-staging.teamviewer.com"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYGROUND1("https://account-playground1.teamviewer.com");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jc2 f626o;
    public final String m;

    static {
        f626o = new jc2(di8VarArr);
    }

    public di8(String str) {
        super(str, i);
        this.m = str;
    }

    public static di8 valueOf(String str) {
        return (di8) Enum.valueOf(di8.class, str);
    }

    public static di8[] values() {
        return (di8[]) n.clone();
    }
}
