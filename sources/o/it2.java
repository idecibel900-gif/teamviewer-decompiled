package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class it2 {
    public static final sy4 e = sy4.g("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final o48 g = new o48(17);
    public final String a;
    public transient ht2 b;
    public transient it2 c;
    public transient sy4 d;

    public it2(String str, it2 it2Var, sy4 sy4Var) {
        if (str == null) {
            a(3);
            throw null;
        }
        this.a = str;
        this.c = it2Var;
        this.d = sy4Var;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.b /* 9 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                i2 = 2;
                break;
            case ep1.b /* 9 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case ep1.c /* 10 */:
                case 11:
                case ep1.d /* 12 */:
                case 13:
                case 14:
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case ep1.b /* 9 */:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case ep1.b /* 9 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case ep1.c /* 10 */:
            case 11:
                objArr[1] = "shortName";
                break;
            case ep1.d /* 12 */:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                break;
            case ep1.b /* 9 */:
                objArr[2] = "child";
                break;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                throw new IllegalStateException(str2);
            case ep1.b /* 9 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final it2 b(sy4 sy4Var) {
        String strB;
        if (sy4Var == null) {
            a(9);
            throw null;
        }
        String str = this.a;
        if (str.isEmpty()) {
            strB = sy4Var.b();
        } else {
            strB = str + "." + sy4Var.b();
        }
        return new it2(strB, this, sy4Var);
    }

    public final void c() {
        String str = this.a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = sy4.d(str.substring(iLastIndexOf + 1));
            this.c = new it2(str.substring(0, iLastIndexOf));
        } else {
            this.d = sy4.d(str);
            this.c = ht2.c.i();
        }
    }

    public final boolean d() {
        if (this.b != null) {
            return true;
        }
        String str = this.a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f.split(str);
            strArrSplit.getClass();
            g.getClass();
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(sy4.d(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof it2) && this.a.equals(((it2) obj).a);
    }

    public final sy4 f() {
        sy4 sy4Var = this.d;
        if (sy4Var != null) {
            if (sy4Var != null) {
                return sy4Var;
            }
            a(10);
            throw null;
        }
        if (this.a.isEmpty()) {
            hk0.l("root");
            return null;
        }
        c();
        sy4 sy4Var2 = this.d;
        if (sy4Var2 != null) {
            return sy4Var2;
        }
        a(11);
        throw null;
    }

    public final ht2 g() {
        ht2 ht2Var = this.b;
        if (ht2Var != null) {
            return ht2Var;
        }
        ht2 ht2Var2 = new ht2(this);
        this.b = ht2Var2;
        return ht2Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strB = this.a;
        if (strB.isEmpty()) {
            strB = e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(18);
        throw null;
    }

    public it2(String str) {
        this.a = str;
    }

    public it2(String str, ht2 ht2Var) {
        if (str != null) {
            this.a = str;
            this.b = ht2Var;
        } else {
            a(0);
            throw null;
        }
    }
}
