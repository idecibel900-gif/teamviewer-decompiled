package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class lt3 extends sj2 {
    @Override // o.sj2
    public final void q(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        if (wg5Var.toFile().mkdir()) {
            return;
        }
        sn1 sn1VarY = Y(wg5Var);
        if (sn1VarY == null || !sn1VarY.c) {
            yq4.v(wg5Var, "failed to create directory: ");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
