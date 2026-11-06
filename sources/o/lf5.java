package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lf5 extends xo1 {
    public final /* synthetic */ byte f;
    public final String g;
    public final boolean h;

    public lf5(String str, boolean z, byte b) {
        this.f = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = z;
                break;
            case 2:
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = z;
                break;
        }
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        String string;
        String string2;
        String string3;
        byte b = this.f;
        boolean z = this.h;
        String str = this.g;
        switch (b) {
            case 0:
                if (obj != null && (string = obj.toString()) != null) {
                    fb6Var.a(z, str, string);
                }
                break;
            case 1:
                if (obj != null && (string2 = obj.toString()) != null) {
                    fb6Var.b(z, str, string2);
                }
                break;
            default:
                if (obj != null && (string3 = obj.toString()) != null) {
                    fb6Var.d(z, str, string3);
                }
                break;
        }
    }
}
