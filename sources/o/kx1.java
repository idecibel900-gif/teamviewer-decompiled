package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class kx1 implements lx1 {
    public final SupportSession a;

    public kx1(SupportSession supportSession) {
        this.a = supportSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx1) && this.a.equals(((kx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToSupportSessionDetailPane(session=" + this.a + ")";
    }
}
