package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dp1 {
    public static final cp1 a;
    public static final cp1 b;
    public static final cp1 c;
    public static final cp1 d;
    public static final cp1 e;
    public static final cp1 f;
    public static final cp1 g;
    public static final cp1 h;
    public static final cp1 i;
    public static final Map j;
    public static final cp1 k;
    public static final ir l;
    public static final ju m;
    public static final vv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ts4 f641o;
    public static final HashMap p;

    static {
        ig8 ig8Var = ig8.p;
        cp1 cp1Var = new cp1(ig8Var, (byte) 0);
        a = cp1Var;
        jg8 jg8Var = jg8.p;
        cp1 cp1Var2 = new cp1(jg8Var, (byte) 1);
        b = cp1Var2;
        kg8 kg8Var = kg8.p;
        cp1 cp1Var3 = new cp1(kg8Var, (byte) 2);
        c = cp1Var3;
        fg8 fg8Var = fg8.p;
        cp1 cp1Var4 = new cp1(fg8Var, (byte) 3);
        d = cp1Var4;
        lg8 lg8Var = lg8.p;
        cp1 cp1Var5 = new cp1(lg8Var, (byte) 4);
        e = cp1Var5;
        hg8 hg8Var = hg8.p;
        cp1 cp1Var6 = new cp1(hg8Var, (byte) 5);
        f = cp1Var6;
        eg8 eg8Var = eg8.p;
        cp1 cp1Var7 = new cp1(eg8Var, (byte) 6);
        g = cp1Var7;
        gg8 gg8Var = gg8.p;
        cp1 cp1Var8 = new cp1(gg8Var, (byte) 7);
        h = cp1Var8;
        mg8 mg8Var = mg8.p;
        cp1 cp1Var9 = new cp1(mg8Var, (byte) 8);
        i = cp1Var9;
        Collections.unmodifiableSet(cx.h1(new cp1[]{cp1Var, cp1Var2, cp1Var4, cp1Var6}));
        HashMap map = new HashMap(6);
        map.put(cp1Var2, 0);
        map.put(cp1Var, 0);
        map.put(cp1Var4, 1);
        map.put(cp1Var3, 1);
        map.put(cp1Var5, 2);
        j = Collections.unmodifiableMap(map);
        k = cp1Var5;
        byte b2 = 12;
        l = new ir(b2);
        m = new ju(b2);
        n = new vv(b2);
        try {
            Iterator it = Arrays.asList(new ts4[0]).iterator();
            f641o = it.hasNext() ? (ts4) it.next() : ts4.a;
            HashMap map2 = new HashMap();
            p = map2;
            map2.put(ig8Var, cp1Var);
            map2.put(jg8Var, cp1Var2);
            map2.put(kg8Var, cp1Var3);
            map2.put(fg8Var, cp1Var4);
            map2.put(lg8Var, cp1Var5);
            map2.put(hg8Var, cp1Var6);
            map2.put(eg8Var, cp1Var7);
            map2.put(gg8Var, cp1Var8);
            map2.put(mg8Var, cp1Var9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case ep1.b /* 9 */:
                    objArr[0] = "from";
                    break;
                case ep1.c /* 10 */:
                case ep1.d /* 12 */:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "findInvisibleMember";
                break;
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case ep1.d /* 12 */:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(cp1 cp1Var, cp1 cp1Var2) {
        if (cp1Var == null) {
            a(12);
            throw null;
        }
        p7 p7Var = cp1Var.a;
        if (cp1Var2 == null) {
            a(13);
            throw null;
        }
        p7 p7Var2 = cp1Var2.a;
        Integer numB = p7Var.b(p7Var2);
        if (numB != null) {
            return numB;
        }
        Integer numB2 = p7Var2.b(p7Var);
        if (numB2 != null) {
            return Integer.valueOf(-numB2.intValue());
        }
        return null;
    }

    public static ki1 c(v46 v46Var, zi0 zi0Var, fi1 fi1Var) {
        ki1 ki1VarC;
        if (zi0Var == null) {
            a(8);
            throw null;
        }
        if (fi1Var == null) {
            a(9);
            throw null;
        }
        for (ki1 ki1Var = (ki1) zi0Var.a(); ki1Var != null && ki1Var.e() != f; ki1Var = (ki1) zo1.i(ki1Var, ki1.class, true)) {
            if (!ki1Var.e().a(v46Var, ki1Var, fi1Var)) {
                return ki1Var;
            }
        }
        if (!(zi0Var instanceof d48) || (ki1VarC = c(v46Var, ((d48) zi0Var).R, fi1Var)) == null) {
            return null;
        }
        return ki1VarC;
    }

    public static boolean d(fi1 fi1Var, fi1 fi1Var2) {
        if (fi1Var2 != null) {
            z06 z06VarF = zo1.f(fi1Var2);
            return z06VarF != z06.I && z06VarF == zo1.f(fi1Var);
        }
        a(7);
        throw null;
    }

    public static boolean e(cp1 cp1Var) {
        if (cp1Var != null) {
            return cp1Var == a || cp1Var == b;
        }
        a(14);
        throw null;
    }

    public static cp1 f(p7 p7Var) {
        if (p7Var == null) {
            a(15);
            throw null;
        }
        cp1 cp1Var = (cp1) p.get(p7Var);
        if (cp1Var != null) {
            return cp1Var;
        }
        an4.i(p7Var, "Inapplicable visibility: ");
        return null;
    }
}
