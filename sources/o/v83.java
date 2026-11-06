package o;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class v83 {
    public static final Charset c = Charset.forName("ISO-8859-1");
    public t83 a;
    public u83 b;

    public static v83 a(String str) {
        v83 v83Var = new v83();
        t83 t83Var = new t83();
        v83Var.a = t83Var;
        db8.n0(str, "url");
        try {
            t83Var.a = new lh7(new URL(str)).i();
            return v83Var;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(fx3.g("The supplied URL, '", str, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"), e);
        }
    }

    public final void b(String str, String str2) {
        t83 t83Var = this.a;
        s83 s83Var = new s83();
        db8.n0(str, "key");
        db8.p0(str2, "value");
        s83Var.a = str;
        s83Var.b = str2;
        t83Var.getClass();
        t83Var.i.add(s83Var);
    }
}
