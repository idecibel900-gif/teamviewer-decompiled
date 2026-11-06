package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fx3 {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return yu0.i(i) + i2 + i3 + i4;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static String d(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(String str, List list, String str2) {
        return str + list + str2;
    }

    public static StringBuilder j(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static iz3 l(String str) {
        ni3.b(str);
        return new iz3();
    }

    public static w35 m(int i, ux2 ux2Var, boolean z) {
        ux2Var.W(i);
        ux2Var.p(z);
        return new w35();
    }

    public static ak7 n(KnownStreams knownStreams, bk7 bk7Var, KnownStreams knownStreams2) {
        knownStreams.getClass();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(knownStreams2);
        return ak7Var;
    }

    public static void o(int i, String str, x02 x02Var, gk7 gk7Var) {
        Bundle bundle = new Bundle(i);
        bundle.putParcelable(str, x02Var);
        gk7Var.u0(bundle);
    }

    public static void p(int i, gx3 gx3Var, Object obj, int i2, Object obj2) {
        gx3Var.put(Integer.valueOf(i), obj);
        gx3Var.put(Integer.valueOf(i2), obj2);
    }

    public static void q(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void r(String str, int i, Context context, bu7 bu7Var) {
        bu7Var.a(new jy0((byte) 2, i, str, context));
    }

    public static void s(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void t(kc6 kc6Var, mt4 mt4Var, mt4 mt4Var2) {
        kc6Var.getClass();
        mt4Var.getClass();
        new pt4(mt4Var2);
        im3.d0();
        throw null;
    }

    public static int u(int i, int i2, int i3) {
        return yu0.h(i) + i2 + i3;
    }
}
