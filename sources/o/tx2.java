package o;

/* JADX INFO: loaded from: classes.dex */
public final class tx2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tx2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ux2) obj).A--;
                break;
            default:
                ((m57) obj).k--;
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ux2) obj).A++;
                break;
            default:
                ((m57) obj).k++;
                break;
        }
    }
}
