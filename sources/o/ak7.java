package o;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ak7 extends BCommandNativeImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak7(bk7 bk7Var) {
        super(g10.TVCommand, bk7Var.m);
        bk7Var.getClass();
    }

    public final bk7 C() {
        ol5 ol5Var = bk7.n;
        byte bV = v();
        ol5Var.getClass();
        return (bk7) bk7.f436o.C(bV);
    }

    @Override // com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl
    public final String toString() {
        return super.toString() + " ct=" + C();
    }
}
