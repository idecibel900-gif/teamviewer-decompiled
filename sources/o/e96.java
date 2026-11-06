package o;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class e96 implements Serializable {
    public final Pattern m;

    public e96(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.m = patternCompile;
    }

    public static sy2 a(e96 e96Var, String str) {
        e96Var.getClass();
        if (str.length() >= 0) {
            return new sy2(new a26((Object) e96Var, (Object) str, (byte) 8), c96.n);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    public final fn4 b(int i, String str) {
        Matcher matcherRegion = this.m.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new fn4(matcherRegion, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.m.matcher(charSequence).matches();
    }

    public final String d(String str, String str2) {
        str.getClass();
        String strReplaceAll = this.m.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String e(String str, Function1 function1) {
        str.getClass();
        Matcher matcher = this.m.matcher(str);
        matcher.getClass();
        int i = 0;
        fn4 fn4Var = !matcher.find(0) ? null : new fn4(matcher, str);
        if (fn4Var == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, fn4Var.b().m);
            sb.append((CharSequence) function1.invoke(fn4Var));
            i = fn4Var.b().n + 1;
            fn4Var = fn4Var.c();
            if (i >= length) {
                break;
            }
        } while (fn4Var != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String string = this.m.toString();
        string.getClass();
        return string;
    }
}
