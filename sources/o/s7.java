package o;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class s7 implements x43 {
    public boolean m;

    public /* synthetic */ s7(boolean z) {
        this.m = z;
    }

    public boolean a() {
        ye4 ye4Var = ye4.a;
        if (this.m) {
            return false;
        }
        try {
            Class<?> cls = Resources.getSystem().getConfiguration().getClass();
            return cls.getField("SEM_DESKTOP_MODE_ENABLED").getInt(cls) == cls.getField("semDesktopModeEnabled").getInt(Resources.getSystem().getConfiguration());
        } catch (IllegalAccessException e) {
            ye4Var.g("RcLocalConstraints", to7.k("isSamsungDexDesktopMode() ", e.getClass().getSimpleName(), ": ", e.getMessage()));
            this.m = true;
            return false;
        } catch (IllegalArgumentException e2) {
            ye4Var.g("RcLocalConstraints", to7.k("isSamsungDexDesktopMode() ", e2.getClass().getSimpleName(), ": ", e2.getMessage()));
            this.m = true;
            return false;
        } catch (NoSuchFieldException e3) {
            ye4Var.g("RcLocalConstraints", to7.k("isSamsungDexDesktopMode() ", e3.getClass().getSimpleName(), ": ", e3.getMessage()));
            this.m = true;
            return false;
        }
    }

    @Override // o.x43
    public boolean b(w07 w07Var) {
        return this.m;
    }

    @Override // o.x43
    public boolean k() {
        return this.m;
    }
}
