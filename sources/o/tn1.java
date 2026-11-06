package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class tn1 implements pn1 {
    public final zi8 d;
    public int f;
    public int g;
    public zi8 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public k12 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public tn1(zi8 zi8Var) {
        this.d = zi8Var;
    }

    @Override // o.pn1
    public final void a(pn1 pn1Var) {
        ArrayList<tn1> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((tn1) it.next()).j) {
                return;
            }
        }
        this.c = true;
        zi8 zi8Var = this.a;
        if (zi8Var != null) {
            zi8Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        tn1 tn1Var = null;
        int i = 0;
        for (tn1 tn1Var2 : arrayList) {
            if (!(tn1Var2 instanceof k12)) {
                i++;
                tn1Var = tn1Var2;
            }
        }
        if (tn1Var != null && i == 1 && tn1Var.j) {
            k12 k12Var = this.i;
            if (k12Var != null) {
                if (!k12Var.j) {
                    return;
                } else {
                    this.f = this.h * k12Var.g;
                }
            }
            d(tn1Var.g + this.f);
        }
        zi8 zi8Var2 = this.a;
        if (zi8Var2 != null) {
            zi8Var2.a(this);
        }
    }

    public final void b(zi8 zi8Var) {
        this.k.add(zi8Var);
        if (this.j) {
            zi8Var.a(zi8Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (pn1 pn1Var : this.k) {
            pn1Var.a(pn1Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
