package o;

import android.content.SharedPreferences;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class r98 implements ct6 {
    public final WeakReference a;

    public r98(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        this.a = new WeakReference(lifecycleOwner);
    }

    @Override // o.ct6
    public void a(String str) {
    }

    @Override // o.ct6
    public bt6 b(at6 at6Var, ug2 ug2Var, z08 z08Var) {
        vk2 vk2Var;
        if (at6Var == at6.m) {
            int i = ug2Var == null ? -1 : q98.a[ug2Var.ordinal()];
            bt6 bt6Var = bt6.f455o;
            if (i != 1) {
                WeakReference weakReference = this.a;
                if (i != 2) {
                    byte b = 3;
                    if (i == 3) {
                        z08Var.getClass();
                        vk2 vk2Var2 = (vk2) weakReference.get();
                        if (vk2Var2 != null) {
                            vk2Var2.c(z08Var);
                        }
                        return bt6Var;
                    }
                    if (i == 4) {
                        vk2 vk2Var3 = (vk2) weakReference.get();
                        if (vk2Var3 != null) {
                            ik2 ik2Var = (ik2) vk2Var3.a.u.get();
                            if (ik2Var != null) {
                                bu7.MAIN.a(new ak2(ik2Var, b));
                            }
                            vk2Var3.b();
                        }
                        SharedPreferences sharedPreferences = h57.a;
                        if (sharedPreferences == null) {
                            im3.e0("sharedPreferences");
                            throw null;
                        }
                        int i2 = sharedPreferences.getInt("FILETRANSFER_LOAD_COUNT", 0) + 1;
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.putInt("FILETRANSFER_LOAD_COUNT", i2);
                        editorEdit.commit();
                        return bt6Var;
                    }
                    if (i == 5 && (vk2Var = (vk2) weakReference.get()) != null) {
                        vk2Var.b();
                    }
                } else {
                    z08Var.getClass();
                    vk2 vk2Var4 = (vk2) weakReference.get();
                    if (vk2Var4 != null) {
                        vk2Var4.a();
                        vk2Var4.c(z08Var);
                    }
                }
            }
            return bt6Var;
        }
        return bt6.m;
    }

    public r98(vk2 vk2Var) {
        this.a = new WeakReference(vk2Var);
    }
}
