package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class af0 {
    public static final af0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ af0[] f317o;
    public final int m;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF3;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF4;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF5;

    /* JADX INFO: Fake field, exist only in values array */
    af0 EF6;

    static {
        af0 af0Var = new af0("RememberMe", 0, 1);
        af0 af0Var2 = new af0("RememberPw", 1, 2);
        af0 af0Var3 = new af0("AutoSignIn", 2, 4);
        af0 af0Var4 = new af0("RememberMeOnce", 3, 8);
        af0 af0Var5 = new af0("RememberPwOnce", 4, 16);
        af0 af0Var6 = new af0("AutoSignInOnce", 5, 32);
        af0 af0Var7 = new af0("KeepMeSignedInOnce", 6, af0Var4, af0Var5, af0Var6);
        af0 af0Var8 = new af0("KeepMeSignedIn", 7, af0Var, af0Var2, af0Var3);
        n = af0Var8;
        f317o = new af0[]{af0Var, af0Var2, af0Var3, af0Var4, af0Var5, af0Var6, af0Var7, af0Var8};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public af0(String str, int i, af0... af0VarArr) {
        int i2 = 0;
        for (af0 af0Var : af0VarArr) {
            i2 += af0Var.m;
        }
        this(str, i, i2);
    }

    public static af0 valueOf(String str) {
        return (af0) Enum.valueOf(af0.class, str);
    }

    public static af0[] values() {
        return (af0[]) f317o.clone();
    }

    public af0(String str, int i, int i2) {
        super(str, i);
        this.m = i2;
    }
}
