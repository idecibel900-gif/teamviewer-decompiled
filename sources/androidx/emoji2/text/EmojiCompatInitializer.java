package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.a92;
import o.b92;
import o.ei3;
import o.iu;
import o.t60;
import o.x84;
import o.yr2;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ei3 {
    @Override // o.ei3
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o.ei3
    public final Object b(Context context) {
        Object objO;
        t60 t60Var = new t60();
        t60Var.a = context.getApplicationContext();
        yr2 yr2Var = new yr2(t60Var);
        yr2Var.b = true;
        if (a92.k == null) {
            synchronized (a92.j) {
                try {
                    if (a92.k == null) {
                        a92.k = new a92(yr2Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        iu iuVarA = iu.A(context);
        iuVarA.getClass();
        synchronized (iu.r) {
            try {
                objO = ((HashMap) iuVarA.f1103o).get(ProcessLifecycleInitializer.class);
                if (objO == null) {
                    objO = iuVarA.o(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        x84 r = ((LifecycleOwner) objO).getR();
        r.a(new b92(this, r));
        return Boolean.TRUE;
    }
}
