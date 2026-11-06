package o;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class t83 extends r83 {
    public static final /* synthetic */ int p = 0;
    public String j;
    public kg5 k;
    public final CookieManager n;
    public boolean l = false;
    public final String m = xh1.c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReentrantLock f2090o = new ReentrantLock();
    public final short f = 30000;
    public final int g = 2097152;
    public final boolean h = true;
    public final ArrayList i = new ArrayList();

    static {
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    public t83() {
        this.b = 1;
        a("Accept-Encoding", "gzip");
        a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        this.k = new kg5(new t63());
        this.n = new CookieManager();
    }
}
