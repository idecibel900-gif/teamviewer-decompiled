package o;

/* JADX INFO: loaded from: classes.dex */
public final class re5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof re5) {
            return this.a == ((re5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        String strE;
        int i = this.a;
        if (i == 0) {
            strE = "Hidden";
        } else if (i == 1) {
            strE = "Exiting";
        } else if (i == 2) {
            strE = "Entering";
        } else if (i == 3) {
            strE = "Shown";
        } else if (i == 5) {
            strE = "ExitingModal";
        } else {
            strE = i == 6 ? "EnteringModal" : fx3.e(i, "Unknown value=");
        }
        return fx3.g("PaneMotion.Type[", strE, "]");
    }
}
