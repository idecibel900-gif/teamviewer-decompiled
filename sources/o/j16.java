package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/j16;", "Lo/u05;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j16 extends u05<w05> {
    public v05 q0;
    public BottomNavigationView r0;

    @Override // o.u05
    public final void A0(Object obj) {
        w05 w05Var = (w05) obj;
        w05Var.getClass();
        BottomNavigationView bottomNavigationView = this.r0;
        if (bottomNavigationView != null) {
            bottomNavigationView.setSelectedItemId(w05Var.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0133 A[SYNTHETIC] */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w05 w05VarI;
        int iIntValue;
        w05 w05Var;
        BottomNavigationView bottomNavigationView;
        final Menu menu;
        j1 j1Var;
        BottomNavigationView bottomNavigationView2;
        v05 v05Var;
        w05 w05Var2;
        BottomNavigationView bottomNavigationView3;
        final w05 w05Var3;
        v05 v05Var2;
        Resources resources;
        int iOrdinal;
        final byte b;
        String string;
        byte b2;
        int iOrdinal2;
        int i;
        layoutInflater.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 9), (byte) 2);
        ve8 ve8VarO = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(v05.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.q0 = (v05) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        final byte b3 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_navigation, viewGroup, false);
        viewInflate.getClass();
        BottomNavigationView bottomNavigationView4 = (BottomNavigationView) viewInflate.findViewById(R.id.bottom_navigation_view);
        this.r0 = bottomNavigationView4;
        if (bottomNavigationView4 != null) {
            bottomNavigationView4.setOnItemSelectedListener(new ar(this, (byte) 21));
        }
        v05 v05Var3 = this.q0;
        if (v05Var3 == null) {
            im3.e0("viewModel");
            throw null;
        }
        SharedPreferences sharedPreferences = v05Var3.n;
        if (bundle == null) {
            int i2 = sharedPreferences.getInt("CURRENT_TAB", -1);
            Integer numValueOf = i2 != -1 ? Integer.valueOf(i2) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                w05VarI = null;
            }
            v05Var3.q = w05VarI;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            w05Var = v05Var3.q;
            if (w05Var == null) {
                w05Var = v05.r;
            }
            editorEdit.putInt("CURRENT_TAB", w05Var.m);
            editorEdit.apply();
            bottomNavigationView = this.r0;
            if (bottomNavigationView != null) {
                menu = bottomNavigationView.getMenu();
            } else {
                menu = null;
            }
            jc2 jc2Var = w05.u;
            jc2Var.getClass();
            j1Var = new j1(jc2Var, (byte) 0);
            while (j1Var.hasNext()) {
                w05Var3 = (w05) j1Var.next();
                v05Var2 = this.q0;
                if (v05Var2 != null) {
                    im3.e0("viewModel");
                    throw null;
                }
                resources = v05Var2.p;
                w05Var3.getClass();
                iOrdinal = w05Var3.ordinal();
                b = 1;
                if (iOrdinal != 0) {
                    string = resources.getString(R.string.tv_navigation_connect);
                } else if (iOrdinal != 1) {
                    string = resources.getString(R.string.tv_navigation_devices);
                } else if (iOrdinal != 2) {
                    string = resources.getString(R.string.tv_navigation_chat);
                } else {
                    if (iOrdinal == 3) {
                        gk0.s();
                        return null;
                    }
                    string = resources.getString(R.string.tv_navigation_apps);
                }
                b2 = 25;
                new nw4(string).observe(L(), new b7(new Function1() { // from class: o.i16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MenuItem menuItemFindItem;
                        MenuItem menuItemFindItem2;
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        w05 w05Var4 = w05Var3;
                        Menu menu2 = menu;
                        switch (b4) {
                            case 0:
                                String str = (String) obj;
                                if (menu2 != null && (menuItemFindItem = menu2.findItem(w05Var4.n)) != null) {
                                    menuItemFindItem.setTitle(str);
                                }
                                break;
                            default:
                                Integer num = (Integer) obj;
                                if (menu2 != null && (menuItemFindItem2 = menu2.findItem(w05Var4.n)) != null) {
                                    num.getClass();
                                    menuItemFindItem2.setIcon(num.intValue());
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, b2));
                if (this.q0 != null) {
                    im3.e0("viewModel");
                    throw null;
                }
                iOrdinal2 = w05Var3.ordinal();
                if (iOrdinal2 != 0) {
                    i = R.drawable.navigation_connect_selector;
                } else if (iOrdinal2 != 1) {
                    i = R.drawable.navigation_devices_icon_selector;
                } else if (iOrdinal2 != 2) {
                    i = R.drawable.navigation_chat_icon_selector;
                } else {
                    if (iOrdinal2 == 3) {
                        gk0.s();
                        return null;
                    }
                    i = R.drawable.navigation_apps_icon_selector;
                }
                new nw4(Integer.valueOf(i)).observe(L(), new b7(new Function1() { // from class: o.i16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MenuItem menuItemFindItem;
                        MenuItem menuItemFindItem2;
                        byte b4 = b;
                        f88 f88Var = f88.a;
                        w05 w05Var4 = w05Var3;
                        Menu menu2 = menu;
                        switch (b4) {
                            case 0:
                                String str = (String) obj;
                                if (menu2 != null && (menuItemFindItem = menu2.findItem(w05Var4.n)) != null) {
                                    menuItemFindItem.setTitle(str);
                                }
                                break;
                            default:
                                Integer num = (Integer) obj;
                                if (menu2 != null && (menuItemFindItem2 = menu2.findItem(w05Var4.n)) != null) {
                                    num.getClass();
                                    menuItemFindItem2.setIcon(num.intValue());
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, b2));
            }
            bottomNavigationView2 = this.r0;
            if (bottomNavigationView2 != null) {
                bottomNavigationView2.setItemIconTintList(null);
            }
            v05Var = this.q0;
            if (v05Var != null) {
                im3.e0("viewModel");
                throw null;
            }
            w05Var2 = v05Var.q;
            if (w05Var2 == null) {
                w05Var2 = v05.r;
            }
            w05Var2.getClass();
            bottomNavigationView3 = this.r0;
            if (bottomNavigationView3 != null) {
                bottomNavigationView3.setSelectedItemId(w05Var2.n);
            }
            return viewInflate;
        }
        iIntValue = bundle.getInt("SelectedTab");
        w05.f2361o.getClass();
        w05VarI = ir.i(iIntValue);
        v05Var3.q = w05VarI;
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.getClass();
        w05Var = v05Var3.q;
        if (w05Var == null) {
            w05Var = v05.r;
        }
        editorEdit2.putInt("CURRENT_TAB", w05Var.m);
        editorEdit2.apply();
        bottomNavigationView = this.r0;
        if (bottomNavigationView != null) {
            menu = bottomNavigationView.getMenu();
        } else {
            menu = null;
        }
        jc2 jc2Var2 = w05.u;
        jc2Var2.getClass();
        j1Var = new j1(jc2Var2, (byte) 0);
        while (j1Var.hasNext()) {
            w05Var3 = (w05) j1Var.next();
            v05Var2 = this.q0;
            if (v05Var2 != null) {
                im3.e0("viewModel");
                throw null;
            }
            resources = v05Var2.p;
            w05Var3.getClass();
            iOrdinal = w05Var3.ordinal();
            b = 1;
            if (iOrdinal != 0) {
                string = resources.getString(R.string.tv_navigation_connect);
            } else if (iOrdinal != 1) {
                string = resources.getString(R.string.tv_navigation_devices);
            } else if (iOrdinal != 2) {
                string = resources.getString(R.string.tv_navigation_chat);
            } else {
                if (iOrdinal == 3) {
                    gk0.s();
                    return null;
                }
                string = resources.getString(R.string.tv_navigation_apps);
            }
            b2 = 25;
            new nw4(string).observe(L(), new b7(new Function1() { // from class: o.i16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    MenuItem menuItemFindItem;
                    MenuItem menuItemFindItem2;
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    w05 w05Var4 = w05Var3;
                    Menu menu2 = menu;
                    switch (b4) {
                        case 0:
                            String str = (String) obj;
                            if (menu2 != null && (menuItemFindItem = menu2.findItem(w05Var4.n)) != null) {
                                menuItemFindItem.setTitle(str);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            if (menu2 != null && (menuItemFindItem2 = menu2.findItem(w05Var4.n)) != null) {
                                num.getClass();
                                menuItemFindItem2.setIcon(num.intValue());
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b2));
            if (this.q0 != null) {
                im3.e0("viewModel");
                throw null;
            }
            iOrdinal2 = w05Var3.ordinal();
            if (iOrdinal2 != 0) {
                i = R.drawable.navigation_connect_selector;
            } else if (iOrdinal2 != 1) {
                i = R.drawable.navigation_devices_icon_selector;
            } else if (iOrdinal2 != 2) {
                i = R.drawable.navigation_chat_icon_selector;
            } else {
                if (iOrdinal2 == 3) {
                    gk0.s();
                    return null;
                }
                i = R.drawable.navigation_apps_icon_selector;
            }
            new nw4(Integer.valueOf(i)).observe(L(), new b7(new Function1() { // from class: o.i16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    MenuItem menuItemFindItem;
                    MenuItem menuItemFindItem2;
                    byte b4 = b;
                    f88 f88Var = f88.a;
                    w05 w05Var4 = w05Var3;
                    Menu menu2 = menu;
                    switch (b4) {
                        case 0:
                            String str = (String) obj;
                            if (menu2 != null && (menuItemFindItem = menu2.findItem(w05Var4.n)) != null) {
                                menuItemFindItem.setTitle(str);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            if (menu2 != null && (menuItemFindItem2 = menu2.findItem(w05Var4.n)) != null) {
                                num.getClass();
                                menuItemFindItem2.setIcon(num.intValue());
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b2));
        }
        bottomNavigationView2 = this.r0;
        if (bottomNavigationView2 != null) {
            bottomNavigationView2.setItemIconTintList(null);
        }
        v05Var = this.q0;
        if (v05Var != null) {
            im3.e0("viewModel");
            throw null;
        }
        w05Var2 = v05Var.q;
        if (w05Var2 == null) {
            w05Var2 = v05.r;
        }
        w05Var2.getClass();
        bottomNavigationView3 = this.r0;
        if (bottomNavigationView3 != null) {
            bottomNavigationView3.setSelectedItemId(w05Var2.n);
        }
        return viewInflate;
    }

    @Override // o.ut2
    public final void b0() {
        this.S = true;
        BottomNavigationView bottomNavigationView = this.r0;
        if (bottomNavigationView != null) {
            bottomNavigationView.setOnItemSelectedListener(null);
        }
        this.r0 = null;
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        v05 v05Var = this.q0;
        if (v05Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        w05 w05Var = v05Var.q;
        if (w05Var == null) {
            w05Var = v05.r;
        }
        bundle.putInt("SelectedTab", w05Var.m);
    }
}
