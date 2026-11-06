package o;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class s07 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    public static final i46 a(Context context) {
        i46 i46Var;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        i46 i46VarA = null;
        i46 i46Var2 = obj instanceof i46 ? (i46) obj : null;
        if (i46Var2 != null) {
            return i46Var2;
        }
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof i46) {
                i46Var = i46VarA;
                i46VarA = (i46) obj2;
            } else {
                if (i46VarA == null) {
                    Context applicationContext = context.getApplicationContext();
                    f4 f4Var = u07.a;
                    i46VarA = t07.a(applicationContext);
                }
                i46Var = i46VarA;
            }
            while (!atomicReference.compareAndSet(obj2, i46VarA)) {
                if (atomicReference.get() != obj2) {
                    i46VarA = i46Var;
                }
            }
            return i46VarA;
        }
    }
}
