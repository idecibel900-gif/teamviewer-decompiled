package o;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ab2 {
    public static final Logger c = Logger.getLogger(ab2.class.getName());
    public static final ArrayList d;
    public static final ab2 e;
    public static final ab2 f;
    public final jb2 a;
    public final List b = d;

    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } catch (Exception unused) {
            d = new ArrayList();
        }
        byte b = 15;
        e = new ab2(new ir(b));
        f = new ab2(new ju(b));
    }

    public ab2(jb2 jb2Var) {
        this.a = jb2Var;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            jb2 jb2Var = this.a;
            if (!zHasNext) {
                return jb2Var.b(str, null);
            }
            try {
                return jb2Var.b(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
