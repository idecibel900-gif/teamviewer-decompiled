package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import o.bc7;
import o.ub7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements FilenameFilter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((d0) obj).a(str);
            default:
                io.sentry.android.replay.k kVar = (io.sentry.android.replay.k) obj;
                str.getClass();
                if (bc7.G(false, str, ".jpg")) {
                    File file2 = new File(file, str);
                    String name = file2.getName();
                    name.getClass();
                    int iE0 = ub7.e0(name, 0, 6, ".");
                    if (iE0 != -1) {
                        name = name.substring(0, iE0);
                    }
                    Long lP = bc7.P(name);
                    if (lP != null) {
                        kVar.e(file2, lP.longValue(), null);
                    }
                }
                return false;
        }
    }
}
