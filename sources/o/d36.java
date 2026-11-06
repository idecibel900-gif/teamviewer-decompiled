package o;

import com.google.re2j.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class d36 implements b96 {
    public final Matcher m;

    public d36(Matcher matcher) {
        this.m = matcher;
    }

    @Override // o.b96
    /* JADX INFO: renamed from: d */
    public final boolean mo34d() {
        try {
            return this.m.find();
        } catch (OutOfMemoryError | StackOverflowError unused) {
            throw new fb8("Pattern complexity error");
        }
    }
}
