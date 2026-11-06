package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m72 {
    public final ArrayList a;
    public final ArrayList b;

    public m72(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
        }
    }

    public void a(String str, int[] iArr) {
        this.a.add(iArr);
        this.b.add(str);
    }
}
