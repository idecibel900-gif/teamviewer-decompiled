package o;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements pu2 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f2362o;
    public boolean p;
    public ArrayList q;
    public final su2 r;
    public boolean s;
    public int t;

    public w10(su2 su2Var) {
        su2Var.J();
        wt2 wt2Var = su2Var.x;
        if (wt2Var != null) {
            wt2Var.t.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.t = -1;
        this.r = su2Var;
    }

    @Override // o.pu2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (su2.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    public final void b(ev2 ev2Var) {
        this.a.add(ev2Var);
        ev2Var.d = this.b;
        ev2Var.e = this.c;
        ev2Var.f = this.d;
        ev2Var.g = this.e;
    }

    public final void c() {
        if (!this.h) {
            hk0.l("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.g = true;
            this.i = null;
        }
    }

    public final void d(int i) {
        if (this.g) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ev2 ev2Var = (ev2) arrayList.get(i2);
                ut2 ut2Var = ev2Var.b;
                if (ut2Var != null) {
                    ut2Var.E += i;
                    if (su2.M(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + ev2Var.b + " to " + ev2Var.b.E);
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ev2 ev2Var = (ev2) arrayList.get(size);
            if (ev2Var.c) {
                if (ev2Var.a == 8) {
                    ev2Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = ev2Var.b.K;
                    ev2Var.a = 2;
                    ev2Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        ev2 ev2Var2 = (ev2) arrayList.get(i2);
                        if (ev2Var2.c && ev2Var2.b.K == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void f() {
        g(false, true);
    }

    public final int g(boolean z, boolean z2) {
        if (this.s) {
            hk0.l("commit already called");
            return 0;
        }
        if (su2.M(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new re4());
            i("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        su2 su2Var = this.r;
        if (z3) {
            this.t = su2Var.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            su2Var.z(this, z);
        }
        return this.t;
    }

    public final void h(int i, ut2 ut2Var, String str, int i2) {
        String str2 = ut2Var.b0;
        if (str2 != null) {
            cv2.c(ut2Var, str2);
        }
        Class<?> cls = ut2Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = ut2Var.L;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(ut2Var);
                String str4 = ut2Var.L;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            ut2Var.L = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + ut2Var + " with tag " + str + " to container view with no id");
            }
            int i3 = ut2Var.J;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(ut2Var);
                int i4 = ut2Var.J;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            ut2Var.J = i;
            ut2Var.K = i;
        }
        b(new ev2(i2, ut2Var));
        ut2Var.F = this.r;
    }

    public final void i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ev2 ev2Var = (ev2) arrayList.get(i);
            switch (ev2Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ep1.b /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case ep1.c /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + ev2Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(ev2Var.b);
            if (z) {
                if (ev2Var.d != 0 || ev2Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(ev2Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(ev2Var.e));
                }
                if (ev2Var.f != 0 || ev2Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(ev2Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(ev2Var.g));
                }
            }
        }
    }

    public final void j(ut2 ut2Var) {
        su2 su2Var = ut2Var.F;
        if (su2Var == null || su2Var == this.r) {
            b(new ev2(3, ut2Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + ut2Var.toString() + " is already attached to a FragmentManager.");
    }

    public final void k(int i, ut2 ut2Var, String str) {
        if (i != 0) {
            h(i, ut2Var, str, 2);
        } else {
            hk0.g("Must use non-zero containerViewId");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
