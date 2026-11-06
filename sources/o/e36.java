package o;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class e36 extends d96 {
    public static final Pattern d = Pattern.compile("");
    public final com.google.re2j.Pattern c;

    public e36(com.google.re2j.Pattern pattern) {
        super(d);
        this.c = pattern;
    }

    public static e36 c(String str) {
        try {
            return new e36(com.google.re2j.Pattern.compile(str));
        } catch (OutOfMemoryError | StackOverflowError unused) {
            throw new fb8("Pattern complexity error");
        } catch (RuntimeException e) {
            throw new fb8("Pattern syntax error: " + e.getMessage());
        }
    }

    @Override // o.d96
    public final b96 b(String str) {
        return new d36(this.c.matcher(str));
    }

    @Override // o.d96
    public final String toString() {
        return this.c.toString();
    }
}
