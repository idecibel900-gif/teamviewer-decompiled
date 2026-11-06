package o;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ur2 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur2)) {
            return false;
        }
        ur2 ur2Var = (ur2) obj;
        return Objects.equals(this.a, ur2Var.a) && Objects.equals(this.b, ur2Var.b) && Objects.equals(this.c, ur2Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
