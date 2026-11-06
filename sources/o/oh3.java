package o;

import android.content.Context;
import android.view.GestureDetector;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class oh3 implements dd3 {
    public int a;
    public boolean b;
    public final Object c;
    public Object d;

    public oh3(zw3 zw3Var) {
        this.c = zw3Var;
        boolean z = true;
        if ((this.a & 1) != 1 && !b() && !a() && (this.a & 8) != 8) {
            z = false;
        }
        this.b = z;
    }

    public boolean a() {
        return (this.a & 4) == 4;
    }

    public boolean b() {
        return (this.a & 2) == 2;
    }

    public void c(boolean z, Boolean bool) {
        int i = this.a;
        this.a = z ? i | 4 : i & (-5);
        if (im3.n(bool, Boolean.TRUE)) {
            g(dg8.VK_RMENU, !z, 0);
        } else if (im3.n(bool, Boolean.FALSE)) {
            g(dg8.VK_LMENU, !z, 0);
        } else {
            g(dg8.VK_MENU, !z, 0);
        }
    }

    public void d(boolean z, Boolean bool) {
        int i = this.a;
        this.a = z ? i | 2 : i & (-3);
        if (im3.n(bool, Boolean.TRUE)) {
            g(dg8.VK_RCONTROL, !z, 0);
        } else if (im3.n(bool, Boolean.FALSE)) {
            g(dg8.VK_LCONTROL, !z, 0);
        } else {
            g(dg8.VK_CONTROL, !z, 0);
        }
    }

    public void e(boolean z, Boolean bool) {
        int i = this.a;
        this.a = z ? i | 1 : i & (-2);
        if (im3.n(bool, Boolean.TRUE)) {
            g(dg8.VK_RSHIFT, !z, 0);
        } else if (im3.n(bool, Boolean.FALSE)) {
            g(dg8.VK_LSHIFT, !z, 0);
        } else {
            g(dg8.VK_SHIFT, !z, 0);
        }
    }

    public void f(int i, boolean z) {
        ar arVar;
        KeyEvent[] events;
        dg8 dg8Var;
        zw3 zw3Var = (zw3) this.c;
        int i2 = this.a;
        if (i2 == 0 || z) {
            zw3Var.x(i);
        } else {
            if (i2 == 1) {
                String strValueOf = String.valueOf((char) i);
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = upperCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    zw3Var.x(upperCase.charAt(i3));
                }
            } else if (b() || a() || (this.a & 8) == 8) {
                String strValueOf2 = String.valueOf((char) i);
                try {
                    KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
                    char[] charArray = strValueOf2.toCharArray();
                    charArray.getClass();
                    events = keyCharacterMapLoad.getEvents(charArray);
                    if (events == null) {
                        events = new KeyEvent[0];
                    }
                } catch (KeyCharacterMap.UnavailableException unused) {
                    events = new KeyEvent[0];
                }
                for (KeyEvent keyEvent : events) {
                    dg8 dg8Var2 = (dg8) hx3.a.get(Integer.valueOf(keyEvent.getKeyCode()));
                    if (dg8Var2 != null) {
                        g(dg8Var2, keyEvent.getAction() == 1, keyEvent.getUnicodeChar());
                    }
                }
            } else {
                String strValueOf3 = String.valueOf((char) i);
                strValueOf3.getClass();
                String upperCase2 = strValueOf3.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                int length2 = upperCase2.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    char cCharAt = upperCase2.charAt(i4);
                    dg8[] dg8VarArrValues = dg8.values();
                    int length3 = dg8VarArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                            dg8Var = null;
                            break;
                        }
                        dg8Var = dg8VarArrValues[i5];
                        if (cCharAt == dg8Var.m) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    dg8Var.getClass();
                    g(dg8Var, false, 0);
                    g(dg8Var, true, 0);
                }
            }
        }
        if (!this.b || (arVar = (ar) this.d) == null) {
            return;
        }
        ((j93) arVar.n).a0();
    }

    public void g(dg8 dg8Var, boolean z, int i) {
        int iOrdinal;
        zw3 zw3Var = (zw3) this.c;
        dg8Var.getClass();
        if (dg8Var == dg8.VK_DELETE && a() && b() && zw3Var.t()) {
            if (z) {
                zw3Var.g();
                ar arVar = (ar) this.d;
                if (arVar != null) {
                    ((j93) arVar.n).a0();
                }
                return;
            }
            return;
        }
        int iOrdinal2 = dg8Var.ordinal();
        boolean z2 = true;
        if (iOrdinal2 != 41 && iOrdinal2 != 42 && iOrdinal2 != 80 && iOrdinal2 != 81) {
            switch (iOrdinal2) {
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    break;
                default:
                    switch (iOrdinal2) {
                        case 148:
                        case 149:
                        case 150:
                        case 151:
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                    break;
            }
        }
        zw3Var.j((dg8Var == dg8.VK_PAUSE && b()) ? (short) 3 : dg8Var.m, i, z, z2);
        if (!z || (iOrdinal = dg8Var.ordinal()) == 80 || iOrdinal == 81) {
            return;
        }
        switch (iOrdinal) {
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
                break;
            default:
                switch (iOrdinal) {
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                        break;
                    default:
                        ar arVar2 = (ar) this.d;
                        if (arVar2 != null) {
                            ((j93) arVar2.n).a0();
                        }
                        break;
                }
                break;
        }
    }

    public void h(boolean z, boolean z2) {
        int i = this.a;
        this.a = z ? i | 8 : i & (-9);
        if (z2) {
            g(dg8.VK_RWIN, !z, 0);
        } else {
            g(dg8.VK_LWIN, !z, 0);
        }
    }

    public oh3(Context context, hg hgVar) {
        this.c = hgVar;
        this.a = 0;
        this.d = new GestureDetector(context, new nh3(this));
    }
}
