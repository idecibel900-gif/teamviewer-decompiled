package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class gs0 extends hm3 {
    public final /* synthetic */ byte K;
    public final /* synthetic */ Class L;
    public final /* synthetic */ Executable M;

    public /* synthetic */ gs0(Executable executable, Class cls, byte b) {
        this.K = b;
        this.M = executable;
        this.L = cls;
    }

    public final String toString() {
        byte b = this.K;
        Class cls = this.L;
        switch (b) {
            case 0:
                break;
        }
        return cls.getName();
    }

    @Override // o.hm3
    public final Object x() {
        byte b = this.K;
        Executable executable = this.M;
        switch (b) {
            case 0:
                return ((Constructor) executable).newInstance(null);
            default:
                return ((Method) executable).invoke(null, this.L, Object.class);
        }
    }
}
