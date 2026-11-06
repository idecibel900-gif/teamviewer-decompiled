package o;

/* JADX INFO: loaded from: classes.dex */
public final class yb4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ac4 n;

    public /* synthetic */ yb4(ac4 ac4Var, byte b) {
        this.m = b;
        this.n = ac4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        ac4 ac4Var = this.n;
        switch (b) {
            case 0:
                o62 o62Var = ac4Var.f313o;
                if (o62Var != null) {
                    o62Var.setListSelectionHidden(true);
                    o62Var.requestLayout();
                }
                break;
            default:
                o62 o62Var2 = ac4Var.f313o;
                if (o62Var2 != null && o62Var2.isAttachedToWindow() && ac4Var.f313o.getCount() > ac4Var.f313o.getChildCount() && ac4Var.f313o.getChildCount() <= ac4Var.y) {
                    ac4Var.K.setInputMethodMode(2);
                    ac4Var.g();
                    break;
                }
                break;
        }
    }
}
