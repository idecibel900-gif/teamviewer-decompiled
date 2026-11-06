package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v31 o.nz3[], still in use, count: 1, list:
  (r1v31 o.nz3[]) from 0x0236: CONSTRUCTOR (r2v9 o.jc2) = (r1v31 o.nz3[]) A[MD:(java.lang.Enum[]):void (m)] call: o.jc2.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class nz3 {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final Map A;
    public static final /* synthetic */ jc2 X;
    public static final HashMap n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List f1614o;
    public static final List p;
    public static final List q;
    public static final List r;
    public static final List s;
    public static final List t;
    public static final List u;
    public static final List v;
    public static final List w;
    public static final List x;
    public static final List y;
    public static final List z;
    public final boolean m;

    static {
        jc2 jc2Var = new jc2(nz3VarArr);
        X = jc2Var;
        n = new HashMap();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        while (j1Var.hasNext()) {
            nz3 nz3Var = (nz3) j1Var.next();
            n.put(nz3Var.name(), nz3Var);
        }
        jc2 jc2Var2 = X;
        ArrayList arrayList = new ArrayList();
        jc2Var2.getClass();
        j1 j1Var2 = new j1(jc2Var2, (byte) 0);
        while (j1Var2.hasNext()) {
            Object next = j1Var2.next();
            if (((nz3) next).m) {
                arrayList.add(next);
            }
        }
        lv0.T0(arrayList);
        lv0.T0(X);
        nz3 nz3Var2 = ANNOTATION_CLASS;
        nz3 nz3Var3 = CLASS;
        f1614o = qf0.L(nz3Var2, nz3Var3);
        p = qf0.L(LOCAL_CLASS, nz3Var3);
        q = qf0.L(CLASS_ONLY, nz3Var3);
        nz3 nz3Var4 = COMPANION_OBJECT;
        nz3 nz3Var5 = OBJECT;
        r = qf0.L(nz3Var4, nz3Var5, nz3Var3);
        s = qf0.L(STANDALONE_OBJECT, nz3Var5, nz3Var3);
        t = qf0.L(INTERFACE, nz3Var3);
        u = qf0.L(ENUM_CLASS, nz3Var3);
        nz3 nz3Var6 = ENUM_ENTRY;
        nz3 nz3Var7 = PROPERTY;
        nz3 nz3Var8 = FIELD;
        v = qf0.L(nz3Var6, nz3Var7, nz3Var8);
        nz3 nz3Var9 = PROPERTY_SETTER;
        w = qf0.K(nz3Var9);
        nz3 nz3Var10 = PROPERTY_GETTER;
        x = qf0.K(nz3Var10);
        y = qf0.K(FUNCTION);
        nz3 nz3Var11 = FILE;
        z = qf0.K(nz3Var11);
        pp ppVar = pp.CONSTRUCTOR_PARAMETER;
        nz3 nz3Var12 = VALUE_PARAMETER;
        A = xm4.R(new vd5(ppVar, nz3Var12), new vd5(pp.FIELD, nz3Var8), new vd5(pp.PROPERTY, nz3Var7), new vd5(pp.FILE, nz3Var11), new vd5(pp.PROPERTY_GETTER, nz3Var10), new vd5(pp.PROPERTY_SETTER, nz3Var9), new vd5(pp.RECEIVER, nz3Var12), new vd5(pp.SETTER_PARAMETER, nz3Var12), new vd5(pp.PROPERTY_DELEGATE_FIELD, nz3Var8));
    }

    public nz3(boolean z2) {
        super(str, i);
        this.m = z2;
    }

    public static nz3 valueOf(String str) {
        return (nz3) Enum.valueOf(nz3.class, str);
    }

    public static nz3[] values() {
        return (nz3[]) W.clone();
    }
}
