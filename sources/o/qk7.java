package o;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class qk7 implements KeyEvent.Callback {
    public final dd3 m;
    public final d42 n;

    public qk7(wc3 wc3Var) {
        wc3Var.getClass();
        this.m = ((eu6) wc3Var).g();
        this.n = new ar(wc3Var, (byte) 25);
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        dd3 dd3Var = this.m;
        if (dd3Var != null && keyEvent.getUnicodeChar() == 0) {
            boolean z = keyEvent.getAction() == 0;
            if (i == 113) {
                ((oh3) dd3Var).d(z, Boolean.FALSE);
                return true;
            }
            if (i == 114) {
                ((oh3) dd3Var).d(z, Boolean.TRUE);
                return true;
            }
            if (i == 117) {
                ((oh3) dd3Var).h(z, false);
                return true;
            }
            if (i == 118) {
                ((oh3) dd3Var).h(z, true);
                return true;
            }
            switch (i) {
                case 57:
                    ((oh3) dd3Var).c(z, Boolean.FALSE);
                    return true;
                case 58:
                    ((oh3) dd3Var).c(z, Boolean.TRUE);
                    return true;
                case 59:
                    ((oh3) dd3Var).e(z, Boolean.FALSE);
                    return true;
                case 60:
                    ((oh3) dd3Var).e(z, Boolean.TRUE);
                    return true;
                default:
                    dg8 dg8Var = (dg8) hx3.a.get(Integer.valueOf(i));
                    if (dg8Var != null) {
                        ((oh3) dd3Var).g(dg8Var, !z, 0);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        dd3 dd3Var;
        keyEvent.getClass();
        switch (i) {
            case 23:
                this.n.h();
                return true;
            default:
                if ((i != 62 || !keyEvent.isAltPressed()) && (dd3Var = this.m) != null) {
                    if (i == 67) {
                        dg8 dg8Var = dg8.VK_BACK;
                        ((oh3) dd3Var).g(dg8Var, false, 0);
                        ((oh3) dd3Var).g(dg8Var, true, 0);
                        return true;
                    }
                    if (i == 66) {
                        dg8 dg8Var2 = dg8.VK_RETURN;
                        ((oh3) dd3Var).g(dg8Var2, false, 0);
                        ((oh3) dd3Var).g(dg8Var2, true, 0);
                        return true;
                    }
                    if (i == 61 && keyEvent.getMetaState() == 0) {
                        ((oh3) dd3Var).f(9, true);
                        return true;
                    }
                    if (a(i, keyEvent)) {
                        return true;
                    }
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (unicodeChar != 0) {
                        ((oh3) dd3Var).f(unicodeChar, true);
                        return true;
                    }
                    if (keyEvent.isCtrlPressed() || keyEvent.isAltPressed() || keyEvent.isMetaPressed()) {
                        ((oh3) dd3Var).f(keyEvent.getUnicodeChar(0), false);
                        return true;
                    }
                }
            case 24:
            case 25:
                return false;
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        keyEvent.getClass();
        return true;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return a(i, keyEvent);
    }

    public qk7(oh3 oh3Var, d42 d42Var) {
        this.m = oh3Var;
        this.n = d42Var;
    }
}
