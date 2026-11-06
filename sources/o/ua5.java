package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ua5 implements ij0 {
    public static final int[] m = {2, 1, 4, 3};
    public static final /* synthetic */ int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146};

    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i == 3) {
            return "DELEGATION";
        }
        if (i == 4) {
            return "SYNTHESIZED";
        }
        throw null;
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVALID_PAYLOAD";
        }
        return "FATAL_ERROR";
    }

    public static /* synthetic */ String D(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static /* synthetic */ int[] E(int i) {
        int[] iArr = new int[i];
        System.arraycopy(n, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ byte b(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            default:
                throw null;
        }
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int d(int i, int i2, Function1 function1) {
        return (function1.hashCode() + i) * i2;
    }

    public static int e(UUID uuid, int i, int i2) {
        return (uuid.hashCode() + i) * i2;
    }

    public static FieldDescriptor g(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object j(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String k(int i, Class cls, String str, String str2) {
        return str + cls + str2 + i;
    }

    public static String l(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String o(x86 x86Var, Class cls, StringBuilder sb) {
        sb.append(x86Var.b(cls));
        return sb.toString();
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static iz3 q(Object obj) {
        ct1.a0(obj);
        return new iz3();
    }

    public static iz3 r(String str) {
        ki3.d(str);
        return new iz3();
    }

    public static mw4 s(ux2 ux2Var) {
        mw4 mw4Var = new mw4();
        ux2Var.g0(mw4Var);
        return mw4Var;
    }

    public static pn5 t(bf1 bf1Var, ve8 ve8Var, dl5 dl5Var, bf1 bf1Var2) {
        bf1Var.getClass();
        return new pn5(ve8Var, dl5Var, bf1Var2);
    }

    public static /* synthetic */ void u(Object obj) {
        if (obj == null) {
            return;
        }
        io.sentry.h2.f();
    }

    public static void v(String str, String str2, String str3) {
        ye4.a(str3, str + str2);
    }

    public static void w(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    public static void x(iu iuVar, long j) {
        iuVar.x().p();
        iuVar.S(j);
    }

    public static boolean y(String str, Locale locale, String str2) {
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return str2.equals(lowerCase);
    }

    public static String z(String str, String str2) {
        return str + str2;
    }
}
