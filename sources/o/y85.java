package o;

import com.teamviewer.apidefinitions.contacts.apis.ContactsApi;
import com.teamviewer.apidefinitions.legacydevices.apis.LegacydevicesApi;
import com.teamviewer.apidefinitions.manageddevices.apis.ManageddevicesApi;

/* JADX INFO: loaded from: classes.dex */
public final class y85 {
    public static final aw m = new aw(28);
    public static volatile y85 n;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public y85(byte b) {
        switch (b) {
            case 1:
                this.a = new tf6();
                this.b = new tf6();
                this.c = new tf6();
                this.d = new tf6();
                this.e = new n(0.0f);
                this.f = new n(0.0f);
                this.g = new n(0.0f);
                this.h = new n(0.0f);
                byte b2 = 0;
                this.i = new d82(b2);
                this.j = new d82(b2);
                this.k = new d82(b2);
                this.l = new d82(b2);
                break;
            default:
                this.a = new kh7(new ti4((byte) 24));
                this.b = new kh7(new x85((byte) 1));
                this.c = new kh7(new x85((byte) 2));
                this.d = new kh7(new x85((byte) 3));
                this.e = new kh7(new x85((byte) 4));
                this.f = new kh7(new x85((byte) 5));
                this.g = new kh7(new x85((byte) 6));
                this.h = new kh7(new ti4((byte) 25));
                this.i = new kh7(new ti4((byte) 26));
                this.j = new kh7(new ti4((byte) 27));
                this.k = new kh7(new ti4((byte) 28));
                this.l = new kh7(new ti4((byte) 29));
                new kh7(new x85((byte) 0));
                break;
        }
    }

    public qw6 a() {
        qw6 qw6Var = new qw6();
        qw6Var.a = (uf0) this.a;
        qw6Var.b = (uf0) this.b;
        qw6Var.c = (uf0) this.c;
        qw6Var.d = (uf0) this.d;
        qw6Var.e = (zd1) this.e;
        qw6Var.f = (zd1) this.f;
        qw6Var.g = (zd1) this.g;
        qw6Var.h = (zd1) this.h;
        qw6Var.i = (d82) this.i;
        qw6Var.j = (d82) this.j;
        qw6Var.k = (d82) this.k;
        qw6Var.l = (d82) this.l;
        return qw6Var;
    }

    public ContactsApi b() {
        return (ContactsApi) ((kh7) this.b).getValue();
    }

    public LegacydevicesApi c() {
        return (LegacydevicesApi) ((kh7) this.a).getValue();
    }

    public ManageddevicesApi d() {
        return (ManageddevicesApi) ((kh7) this.c).getValue();
    }
}
