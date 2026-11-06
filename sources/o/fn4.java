package o;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class fn4 {
    public final Matcher a;
    public final CharSequence b;
    public final en4 c;
    public dn4 d;

    public fn4(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new en4(this, (byte) 0);
    }

    public final List a() {
        dn4 dn4Var = this.d;
        if (dn4Var != null) {
            return dn4Var;
        }
        dn4 dn4Var2 = new dn4(this);
        this.d = dn4Var2;
        return dn4Var2;
    }

    public final yk3 b() {
        Matcher matcher = this.a;
        return ct1.b0(matcher.start(), matcher.end());
    }

    public final fn4 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new fn4(matcher2, charSequence);
        }
        return null;
    }
}
