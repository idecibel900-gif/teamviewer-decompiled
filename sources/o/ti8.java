package o;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ti8 {
    public static final ui8 a;

    static {
        ui8 xz2Var;
        try {
            xz2Var = new l07(ka0.r(WebViewProviderFactoryBoundaryInterface.class, h67.g()), (byte) 28);
        } catch (ClassNotFoundException unused) {
            xz2Var = new xz2((byte) 11);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            gk0.r(e);
            return;
        }
        a = xz2Var;
    }
}
