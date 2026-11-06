package o;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo8 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? ub7.Q(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
