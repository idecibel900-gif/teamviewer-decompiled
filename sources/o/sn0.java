package o;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sn0 implements Supplier {
    public final /* synthetic */ byte a;

    public /* synthetic */ sn0(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new String[512];
            case 1:
                return new char[2048];
            case 2:
                return new r82();
            case 3:
                return new char[2];
            case 4:
                return new byte[8192];
            case 5:
                return new SoftReference(new ArrayDeque());
            case 6:
                return new StringBuilder(1024);
            case 7:
                return new WeakHashMap();
            default:
                return new j45(new et7(""), x35.class);
        }
    }
}
